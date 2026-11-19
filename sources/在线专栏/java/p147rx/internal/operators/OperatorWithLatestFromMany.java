package p147rx.internal.operators;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import p147rx.functions.FuncN;
import p147rx.observers.SerializedSubscriber;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class OperatorWithLatestFromMany<T, R> implements Observable.OnSubscribe<R> {
    final FuncN<R> combiner;
    final Observable<T> main;
    final Observable<?>[] others;
    final Iterable<Observable<?>> othersIterable;

    static final class WithLatestMainSubscriber<T, R> extends Subscriber<T> {
        static final Object EMPTY = new Object();
        final Subscriber<? super R> actual;
        final FuncN<R> combiner;
        final AtomicReferenceArray<Object> current;
        boolean done;
        final AtomicInteger ready;

        public WithLatestMainSubscriber(Subscriber<? super R> subscriber, FuncN<R> funcN, int i4) {
            this.actual = subscriber;
            this.combiner = funcN;
            AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(i4 + 1);
            for (int i5 = 0; i5 <= i4; i5++) {
                atomicReferenceArray.lazySet(i5, EMPTY);
            }
            this.current = atomicReferenceArray;
            this.ready = new AtomicInteger(i4);
            request(0L);
        }

        void innerComplete(int i4) {
            if (this.current.get(i4) == EMPTY) {
                onCompleted();
            }
        }

        void innerError(int i4, Throwable th) {
            onError(th);
        }

        void innerNext(int i4, Object obj) {
            if (this.current.getAndSet(i4, obj) == EMPTY) {
                this.ready.decrementAndGet();
            }
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            if (this.done) {
                return;
            }
            this.done = true;
            unsubscribe();
            this.actual.onCompleted();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaHooks.onError(th);
                return;
            }
            this.done = true;
            unsubscribe();
            this.actual.onError(th);
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            if (this.done) {
                return;
            }
            if (this.ready.get() != 0) {
                request(1L);
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.current;
            int length = atomicReferenceArray.length();
            atomicReferenceArray.lazySet(0, t3);
            Object[] objArr = new Object[atomicReferenceArray.length()];
            for (int i4 = 0; i4 < length; i4++) {
                objArr[i4] = atomicReferenceArray.get(i4);
            }
            try {
                this.actual.onNext(this.combiner.call(objArr));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                onError(th);
            }
        }

        @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            super.setProducer(producer);
            this.actual.setProducer(producer);
        }
    }

    static final class WithLatestOtherSubscriber extends Subscriber<Object> {
        final int index;
        final WithLatestMainSubscriber<?, ?> parent;

        public WithLatestOtherSubscriber(WithLatestMainSubscriber<?, ?> withLatestMainSubscriber, int i4) {
            this.parent = withLatestMainSubscriber;
            this.index = i4;
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            this.parent.innerComplete(this.index);
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // p147rx.Observer
        public void onNext(Object obj) {
            this.parent.innerNext(this.index, obj);
        }
    }

    public OperatorWithLatestFromMany(Observable<T> observable, Observable<?>[] observableArr, Iterable<Observable<?>> iterable, FuncN<R> funcN) {
        this.main = observable;
        this.others = observableArr;
        this.othersIterable = iterable;
        this.combiner = funcN;
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        int length;
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        Observable<?>[] observableArr = this.others;
        int i4 = 0;
        if (observableArr != null) {
            length = observableArr.length;
        } else {
            observableArr = new Observable[8];
            int i5 = 0;
            for (Observable<?> observable : this.othersIterable) {
                if (i5 == observableArr.length) {
                    observableArr = (Observable[]) Arrays.copyOf(observableArr, (i5 >> 2) + i5);
                }
                observableArr[i5] = observable;
                i5++;
            }
            length = i5;
        }
        WithLatestMainSubscriber withLatestMainSubscriber = new WithLatestMainSubscriber(subscriber, this.combiner, length);
        serializedSubscriber.add(withLatestMainSubscriber);
        while (i4 < length) {
            if (serializedSubscriber.isUnsubscribed()) {
                return;
            }
            int i6 = i4 + 1;
            WithLatestOtherSubscriber withLatestOtherSubscriber = new WithLatestOtherSubscriber(withLatestMainSubscriber, i6);
            withLatestMainSubscriber.add(withLatestOtherSubscriber);
            observableArr[i4].unsafeSubscribe(withLatestOtherSubscriber);
            i4 = i6;
        }
        this.main.unsafeSubscribe(withLatestMainSubscriber);
    }
}
