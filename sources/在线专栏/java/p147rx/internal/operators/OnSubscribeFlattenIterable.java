package p147rx.internal.operators;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p147rx.Observable;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import p147rx.exceptions.MissingBackpressureException;
import p147rx.functions.Func1;
import p147rx.internal.operators.OnSubscribeFromIterable;
import p147rx.internal.util.ExceptionsUtils;
import p147rx.internal.util.RxRingBuffer;
import p147rx.internal.util.ScalarSynchronousObservable;
import p147rx.internal.util.atomic.SpscAtomicArrayQueue;
import p147rx.internal.util.atomic.SpscLinkedArrayQueue;
import p147rx.internal.util.unsafe.SpscArrayQueue;
import p147rx.internal.util.unsafe.UnsafeAccess;
import p147rx.plugins.RxJavaHooks;

/* loaded from: classes2.dex */
public final class OnSubscribeFlattenIterable<T, R> implements Observable.OnSubscribe<R> {
    final Func1<? super T, ? extends Iterable<? extends R>> mapper;
    final int prefetch;
    final Observable<? extends T> source;

    static final class FlattenIterableSubscriber<T, R> extends Subscriber<T> {
        Iterator<? extends R> active;
        final Subscriber<? super R> actual;
        volatile boolean done;
        final long limit;
        final Func1<? super T, ? extends Iterable<? extends R>> mapper;
        long produced;
        final Queue<Object> queue;
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicInteger wip = new AtomicInteger();
        final AtomicLong requested = new AtomicLong();

        public FlattenIterableSubscriber(Subscriber<? super R> subscriber, Func1<? super T, ? extends Iterable<? extends R>> func1, int i4) {
            this.actual = subscriber;
            this.mapper = func1;
            if (i4 == Integer.MAX_VALUE) {
                this.limit = Long.MAX_VALUE;
                this.queue = new SpscLinkedArrayQueue(RxRingBuffer.SIZE);
            } else {
                this.limit = i4 - (i4 >> 2);
                if (UnsafeAccess.isUnsafeAvailable()) {
                    this.queue = new SpscArrayQueue(i4);
                } else {
                    this.queue = new SpscAtomicArrayQueue(i4);
                }
            }
            request(i4);
        }

        boolean checkTerminated(boolean z3, boolean z4, Subscriber<?> subscriber, Queue<?> queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                this.active = null;
                return true;
            }
            if (!z3) {
                return false;
            }
            if (this.error.get() == null) {
                if (!z4) {
                    return false;
                }
                subscriber.onCompleted();
                return true;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.error);
            unsubscribe();
            queue.clear();
            this.active = null;
            subscriber.onError(thTerminate);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void drain() {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OnSubscribeFlattenIterable.FlattenIterableSubscriber.drain():void");
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            this.done = true;
            drain();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            if (!ExceptionsUtils.addThrowable(this.error, th)) {
                RxJavaHooks.onError(th);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // p147rx.Observer
        public void onNext(T t3) {
            if (this.queue.offer(NotificationLite.next(t3))) {
                drain();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }

        void requestMore(long j4) {
            if (j4 > 0) {
                BackpressureUtils.getAndAddRequest(this.requested, j4);
                drain();
            } else {
                if (j4 >= 0) {
                    return;
                }
                throw new IllegalStateException("n >= 0 required but it was " + j4);
            }
        }
    }

    static final class OnSubscribeScalarFlattenIterable<T, R> implements Observable.OnSubscribe<R> {
        final Func1<? super T, ? extends Iterable<? extends R>> mapper;
        final T value;

        public OnSubscribeScalarFlattenIterable(T t3, Func1<? super T, ? extends Iterable<? extends R>> func1) {
            this.value = t3;
            this.mapper = func1;
        }

        @Override // p147rx.functions.Action1
        public void call(Subscriber<? super R> subscriber) {
            try {
                Iterator<? extends R> it = this.mapper.call(this.value).iterator();
                if (it.hasNext()) {
                    subscriber.setProducer(new OnSubscribeFromIterable.IterableProducer(subscriber, it));
                } else {
                    subscriber.onCompleted();
                }
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, subscriber, this.value);
            }
        }
    }

    protected OnSubscribeFlattenIterable(Observable<? extends T> observable, Func1<? super T, ? extends Iterable<? extends R>> func1, int i4) {
        this.source = observable;
        this.mapper = func1;
        this.prefetch = i4;
    }

    public static <T, R> Observable<R> createFrom(Observable<? extends T> observable, Func1<? super T, ? extends Iterable<? extends R>> func1, int i4) {
        return observable instanceof ScalarSynchronousObservable ? Observable.unsafeCreate(new OnSubscribeScalarFlattenIterable(((ScalarSynchronousObservable) observable).get(), func1)) : Observable.unsafeCreate(new OnSubscribeFlattenIterable(observable, func1, i4));
    }

    @Override // p147rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        final FlattenIterableSubscriber flattenIterableSubscriber = new FlattenIterableSubscriber(subscriber, this.mapper, this.prefetch);
        subscriber.add(flattenIterableSubscriber);
        subscriber.setProducer(new Producer() { // from class: rx.internal.operators.OnSubscribeFlattenIterable.1
            @Override // p147rx.Producer
            public void request(long j4) {
                flattenIterableSubscriber.requestMore(j4);
            }
        });
        this.source.unsafeSubscribe(flattenIterableSubscriber);
    }
}
