package p147rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import p147rx.Observable;
import p147rx.Observer;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import p147rx.exceptions.MissingBackpressureException;
import p147rx.functions.Func2;
import p147rx.functions.Func3;
import p147rx.functions.Func4;
import p147rx.functions.Func5;
import p147rx.functions.Func6;
import p147rx.functions.Func7;
import p147rx.functions.Func8;
import p147rx.functions.Func9;
import p147rx.functions.FuncN;
import p147rx.functions.Functions;
import p147rx.internal.util.RxRingBuffer;
import p147rx.subscriptions.CompositeSubscription;

/* loaded from: classes2.dex */
public final class OperatorZip<R> implements Observable.Operator<R, Observable<?>[]> {
    final FuncN<? extends R> zipFunction;

    static final class Zip<R> extends AtomicLong {
        static final int THRESHOLD = (int) (RxRingBuffer.SIZE * 0.7d);
        private static final long serialVersionUID = 5995274816189928317L;
        final Observer<? super R> child;
        private final CompositeSubscription childSubscription;
        int emitted;
        private AtomicLong requested;
        private volatile Object[] subscribers;
        private final FuncN<? extends R> zipFunction;

        final class InnerSubscriber extends Subscriber {
            final RxRingBuffer items = RxRingBuffer.getSpmcInstance();

            InnerSubscriber() {
            }

            @Override // p147rx.Observer
            public void onCompleted() {
                this.items.onCompleted();
                Zip.this.tick();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                Zip.this.child.onError(th);
            }

            @Override // p147rx.Observer
            public void onNext(Object obj) {
                try {
                    this.items.onNext(obj);
                } catch (MissingBackpressureException e4) {
                    onError(e4);
                }
                Zip.this.tick();
            }

            @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
            public void onStart() {
                request(RxRingBuffer.SIZE);
            }

            public void requestMore(long j4) {
                request(j4);
            }
        }

        public Zip(Subscriber<? super R> subscriber, FuncN<? extends R> funcN) {
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            this.childSubscription = compositeSubscription;
            this.child = subscriber;
            this.zipFunction = funcN;
            subscriber.add(compositeSubscription);
        }

        public void start(Observable[] observableArr, AtomicLong atomicLong) {
            Object[] objArr = new Object[observableArr.length];
            for (int i4 = 0; i4 < observableArr.length; i4++) {
                InnerSubscriber innerSubscriber = new InnerSubscriber();
                objArr[i4] = innerSubscriber;
                this.childSubscription.add(innerSubscriber);
            }
            this.requested = atomicLong;
            this.subscribers = objArr;
            for (int i5 = 0; i5 < observableArr.length; i5++) {
                observableArr[i5].unsafeSubscribe((InnerSubscriber) objArr[i5]);
            }
        }

        void tick() {
            Object[] objArr = this.subscribers;
            if (objArr == null || getAndIncrement() != 0) {
                return;
            }
            int length = objArr.length;
            Observer<? super R> observer = this.child;
            AtomicLong atomicLong = this.requested;
            while (true) {
                Object[] objArr2 = new Object[length];
                boolean z3 = true;
                for (int i4 = 0; i4 < length; i4++) {
                    RxRingBuffer rxRingBuffer = ((InnerSubscriber) objArr[i4]).items;
                    Object objPeek = rxRingBuffer.peek();
                    if (objPeek == null) {
                        z3 = false;
                    } else {
                        if (rxRingBuffer.isCompleted(objPeek)) {
                            observer.onCompleted();
                            this.childSubscription.unsubscribe();
                            return;
                        }
                        objArr2[i4] = rxRingBuffer.getValue(objPeek);
                    }
                }
                if (z3 && atomicLong.get() > 0) {
                    try {
                        observer.onNext(this.zipFunction.call(objArr2));
                        atomicLong.decrementAndGet();
                        this.emitted++;
                        for (Object obj : objArr) {
                            RxRingBuffer rxRingBuffer2 = ((InnerSubscriber) obj).items;
                            rxRingBuffer2.poll();
                            if (rxRingBuffer2.isCompleted(rxRingBuffer2.peek())) {
                                observer.onCompleted();
                                this.childSubscription.unsubscribe();
                                return;
                            }
                        }
                        if (this.emitted > THRESHOLD) {
                            for (Object obj2 : objArr) {
                                ((InnerSubscriber) obj2).requestMore(this.emitted);
                            }
                            this.emitted = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, observer, objArr2);
                        return;
                    }
                } else if (decrementAndGet() <= 0) {
                    return;
                }
            }
        }
    }

    static final class ZipProducer<R> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -1216676403723546796L;
        final Zip<R> zipper;

        public ZipProducer(Zip<R> zip) {
            this.zipper = zip;
        }

        @Override // p147rx.Producer
        public void request(long j4) {
            BackpressureUtils.getAndAddRequest(this, j4);
            this.zipper.tick();
        }
    }

    final class ZipSubscriber extends Subscriber<Observable[]> {
        final Subscriber<? super R> child;
        final ZipProducer<R> producer;
        boolean started;
        final Zip<R> zipper;

        public ZipSubscriber(Subscriber<? super R> subscriber, Zip<R> zip, ZipProducer<R> zipProducer) {
            this.child = subscriber;
            this.zipper = zip;
            this.producer = zipProducer;
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            if (this.started) {
                return;
            }
            this.child.onCompleted();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.child.onError(th);
        }

        @Override // p147rx.Observer
        public void onNext(Observable[] observableArr) {
            if (observableArr == null || observableArr.length == 0) {
                this.child.onCompleted();
            } else {
                this.started = true;
                this.zipper.start(observableArr, this.producer);
            }
        }
    }

    public OperatorZip(FuncN<? extends R> funcN) {
        this.zipFunction = funcN;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super Observable[]> call(Subscriber<? super R> subscriber) {
        Zip zip = new Zip(subscriber, this.zipFunction);
        ZipProducer zipProducer = new ZipProducer(zip);
        ZipSubscriber zipSubscriber = new ZipSubscriber(subscriber, zip, zipProducer);
        subscriber.add(zipSubscriber);
        subscriber.setProducer(zipProducer);
        return zipSubscriber;
    }

    public OperatorZip(Func2 func2) {
        this.zipFunction = Functions.fromFunc(func2);
    }

    public OperatorZip(Func3 func3) {
        this.zipFunction = Functions.fromFunc(func3);
    }

    public OperatorZip(Func4 func4) {
        this.zipFunction = Functions.fromFunc(func4);
    }

    public OperatorZip(Func5 func5) {
        this.zipFunction = Functions.fromFunc(func5);
    }

    public OperatorZip(Func6 func6) {
        this.zipFunction = Functions.fromFunc(func6);
    }

    public OperatorZip(Func7 func7) {
        this.zipFunction = Functions.fromFunc(func7);
    }

    public OperatorZip(Func8 func8) {
        this.zipFunction = Functions.fromFunc(func8);
    }

    public OperatorZip(Func9 func9) {
        this.zipFunction = Functions.fromFunc(func9);
    }
}
