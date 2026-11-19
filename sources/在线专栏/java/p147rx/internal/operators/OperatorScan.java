package p147rx.internal.operators;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p001a0.InterfaceC0004c;
import p147rx.Observable;
import p147rx.Observer;
import p147rx.Producer;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Func0;
import p147rx.functions.Func2;
import p147rx.internal.util.atomic.SpscLinkedAtomicQueue;
import p147rx.internal.util.unsafe.SpscLinkedQueue;
import p147rx.internal.util.unsafe.UnsafeAccess;

/* loaded from: classes2.dex */
public final class OperatorScan<R, T> implements Observable.Operator<R, T> {
    private static final Object NO_INITIAL_VALUE = new Object();
    final Func2<R, ? super T, R> accumulator;
    private final Func0<R> initialValueFactory;

    static final class InitialProducer<R> implements Producer, Observer<R> {
        final Subscriber<? super R> child;
        volatile boolean done;
        boolean emitting;
        Throwable error;
        boolean missed;
        long missedRequested;
        volatile Producer producer;
        final Queue<Object> queue;
        final AtomicLong requested;

        public InitialProducer(R r3, Subscriber<? super R> subscriber) {
            this.child = subscriber;
            Queue<Object> spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue<>() : new SpscLinkedAtomicQueue<>();
            this.queue = spscLinkedQueue;
            spscLinkedQueue.offer(NotificationLite.next(r3));
            this.requested = new AtomicLong();
        }

        boolean checkTerminated(boolean z3, boolean z4, Subscriber<? super R> subscriber) {
            if (subscriber.isUnsubscribed()) {
                return true;
            }
            if (!z3) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                subscriber.onError(th);
                return true;
            }
            if (!z4) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }

        void emit() {
            synchronized (this) {
                if (this.emitting) {
                    this.missed = true;
                } else {
                    this.emitting = true;
                    emitLoop();
                }
            }
        }

        void emitLoop() {
            Subscriber<? super R> subscriber = this.child;
            Queue<Object> queue = this.queue;
            AtomicLong atomicLong = this.requested;
            long jProduced = atomicLong.get();
            while (!checkTerminated(this.done, queue.isEmpty(), subscriber)) {
                long j4 = 0;
                while (j4 != jProduced) {
                    boolean z3 = this.done;
                    Object objPoll = queue.poll();
                    boolean z4 = objPoll == null;
                    if (checkTerminated(z3, z4, subscriber)) {
                        return;
                    }
                    if (z4) {
                        break;
                    }
                    InterfaceC0004c interfaceC0004c = (Object) NotificationLite.getValue(objPoll);
                    try {
                        subscriber.onNext(interfaceC0004c);
                        j4++;
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, subscriber, interfaceC0004c);
                        return;
                    }
                }
                if (j4 != 0 && jProduced != Long.MAX_VALUE) {
                    jProduced = BackpressureUtils.produced(atomicLong, j4);
                }
                synchronized (this) {
                    if (!this.missed) {
                        this.emitting = false;
                        return;
                    }
                    this.missed = false;
                }
            }
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            this.done = true;
            emit();
        }

        @Override // p147rx.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            emit();
        }

        @Override // p147rx.Observer
        public void onNext(R r3) {
            this.queue.offer(NotificationLite.next(r3));
            emit();
        }

        @Override // p147rx.Producer
        public void request(long j4) {
            if (j4 < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j4);
            }
            if (j4 != 0) {
                BackpressureUtils.getAndAddRequest(this.requested, j4);
                Producer producer = this.producer;
                if (producer == null) {
                    synchronized (this.requested) {
                        producer = this.producer;
                        if (producer == null) {
                            this.missedRequested = BackpressureUtils.addCap(this.missedRequested, j4);
                        }
                    }
                }
                if (producer != null) {
                    producer.request(j4);
                }
                emit();
            }
        }

        public void setProducer(Producer producer) {
            long j4;
            Objects.requireNonNull(producer);
            synchronized (this.requested) {
                if (this.producer != null) {
                    throw new IllegalStateException("Can't set more than one Producer!");
                }
                j4 = this.missedRequested;
                if (j4 != Long.MAX_VALUE) {
                    j4--;
                }
                this.missedRequested = 0L;
                this.producer = producer;
            }
            if (j4 > 0) {
                producer.request(j4);
            }
            emit();
        }
    }

    public OperatorScan(final R r3, Func2<R, ? super T, R> func2) {
        this((Func0) new Func0<R>() { // from class: rx.internal.operators.OperatorScan.1
            @Override // p147rx.functions.Func0, java.util.concurrent.Callable
            public R call() {
                return (R) r3;
            }
        }, (Func2) func2);
    }

    public OperatorScan(Func0<R> func0, Func2<R, ? super T, R> func2) {
        this.initialValueFactory = func0;
        this.accumulator = func2;
    }

    @Override // p147rx.functions.Func1
    public Subscriber<? super T> call(final Subscriber<? super R> subscriber) {
        R rCall = this.initialValueFactory.call();
        if (rCall == NO_INITIAL_VALUE) {
            return new Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorScan.2
                boolean once;
                R value;

                @Override // p147rx.Observer
                public void onCompleted() {
                    subscriber.onCompleted();
                }

                @Override // p147rx.Observer
                public void onError(Throwable th) {
                    subscriber.onError(th);
                }

                @Override // p147rx.Observer
                public void onNext(T t3) {
                    if (this.once) {
                        try {
                            t3 = OperatorScan.this.accumulator.call(this.value, t3);
                        } catch (Throwable th) {
                            Exceptions.throwOrReport(th, subscriber, t3);
                            return;
                        }
                    } else {
                        this.once = true;
                    }
                    this.value = (R) t3;
                    subscriber.onNext(t3);
                }
            };
        }
        InitialProducer initialProducer = new InitialProducer(rCall, subscriber);
        Subscriber<T> subscriber2 = new Subscriber<T>(rCall, initialProducer) { // from class: rx.internal.operators.OperatorScan.3
            final /* synthetic */ Object val$initialValue;
            final /* synthetic */ InitialProducer val$ip;
            private R value;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.val$initialValue = rCall;
                this.val$ip = initialProducer;
                this.value = rCall;
            }

            @Override // p147rx.Observer
            public void onCompleted() {
                this.val$ip.onCompleted();
            }

            @Override // p147rx.Observer
            public void onError(Throwable th) {
                this.val$ip.onError(th);
            }

            @Override // p147rx.Observer
            public void onNext(T t3) {
                try {
                    R rCall2 = OperatorScan.this.accumulator.call(this.value, t3);
                    this.value = rCall2;
                    this.val$ip.onNext(rCall2);
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this, t3);
                }
            }

            @Override // p147rx.Subscriber, p147rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                this.val$ip.setProducer(producer);
            }
        };
        subscriber.add(subscriber2);
        subscriber.setProducer(initialProducer);
        return subscriber2;
    }

    public OperatorScan(Func2<R, ? super T, R> func2) {
        this(NO_INITIAL_VALUE, func2);
    }
}
