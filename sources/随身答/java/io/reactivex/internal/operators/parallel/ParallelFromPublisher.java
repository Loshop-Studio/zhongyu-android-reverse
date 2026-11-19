package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import p010a9.InterfaceC0049b;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {
    final int parallelism;
    final int prefetch;
    final InterfaceC0049b source;

    public static final class ParallelDispatcher<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4470634016609963609L;
        volatile boolean cancelled;
        volatile boolean done;
        final long[] emissions;
        Throwable error;
        int index;
        final int limit;
        final int prefetch;
        int produced;
        SimpleQueue<T> queue;
        final AtomicLongArray requests;
        int sourceMode;
        final AtomicInteger subscriberCount = new AtomicInteger();
        final InterfaceC0050c[] subscribers;
        InterfaceC0051d upstream;

        public final class RailSubscription implements InterfaceC0051d {

            /* renamed from: j */
            final int f14172j;

            /* renamed from: m */
            final int f14173m;

            public RailSubscription(int i9, int i10) {
                this.f14172j = i9;
                this.f14173m = i10;
            }

            @Override // p010a9.InterfaceC0051d
            public void cancel() {
                if (ParallelDispatcher.this.requests.compareAndSet(this.f14172j + this.f14173m, 0L, 1L)) {
                    ParallelDispatcher parallelDispatcher = ParallelDispatcher.this;
                    int i9 = this.f14173m;
                    parallelDispatcher.cancel(i9 + i9);
                }
            }

            @Override // p010a9.InterfaceC0051d
            public void request(long j9) {
                long j10;
                if (SubscriptionHelper.validate(j9)) {
                    AtomicLongArray atomicLongArray = ParallelDispatcher.this.requests;
                    do {
                        j10 = atomicLongArray.get(this.f14172j);
                        if (j10 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f14172j, j10, BackpressureHelper.addCap(j10, j9)));
                    if (ParallelDispatcher.this.subscriberCount.get() == this.f14173m) {
                        ParallelDispatcher.this.drain();
                    }
                }
            }
        }

        public ParallelDispatcher(InterfaceC0050c[] interfaceC0050cArr, int i9) {
            this.subscribers = interfaceC0050cArr;
            this.prefetch = i9;
            this.limit = i9 - (i9 >> 2);
            int length = interfaceC0050cArr.length;
            int i10 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i10 + 1);
            this.requests = atomicLongArray;
            atomicLongArray.lazySet(i10, length);
            this.emissions = new long[length];
        }

        public void cancel(int i9) {
            if (this.requests.decrementAndGet(i9) == 0) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.sourceMode == 1) {
                drainSync();
            } else {
                drainAsync();
            }
        }

        public void drainAsync() {
            Throwable th;
            SimpleQueue<T> simpleQueue = this.queue;
            InterfaceC0050c[] interfaceC0050cArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i9 = this.index;
            int i10 = this.produced;
            int iAddAndGet = 1;
            while (true) {
                int i11 = 0;
                int i12 = 0;
                while (!this.cancelled) {
                    boolean z9 = this.done;
                    if (z9 && (th = this.error) != null) {
                        simpleQueue.clear();
                        int length2 = interfaceC0050cArr.length;
                        while (i11 < length2) {
                            interfaceC0050cArr[i11].onError(th);
                            i11++;
                        }
                        return;
                    }
                    boolean zIsEmpty = simpleQueue.isEmpty();
                    if (z9 && zIsEmpty) {
                        int length3 = interfaceC0050cArr.length;
                        while (i11 < length3) {
                            interfaceC0050cArr[i11].onComplete();
                            i11++;
                        }
                        return;
                    }
                    if (!zIsEmpty) {
                        long j9 = atomicLongArray.get(i9);
                        long j10 = jArr[i9];
                        if (j9 == j10 || atomicLongArray.get(length + i9) != 0) {
                            i12++;
                        } else {
                            try {
                                T tPoll = simpleQueue.poll();
                                if (tPoll != null) {
                                    interfaceC0050cArr[i9].onNext(tPoll);
                                    jArr[i9] = j10 + 1;
                                    i10++;
                                    if (i10 == this.limit) {
                                        this.upstream.request(i10);
                                        i10 = 0;
                                    }
                                    i12 = 0;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.upstream.cancel();
                                int length4 = interfaceC0050cArr.length;
                                while (i11 < length4) {
                                    interfaceC0050cArr[i11].onError(th2);
                                    i11++;
                                }
                                return;
                            }
                        }
                        i9++;
                        if (i9 == length) {
                            i9 = 0;
                        }
                        if (i12 == length) {
                        }
                    }
                    int i13 = get();
                    if (i13 == iAddAndGet) {
                        this.index = i9;
                        this.produced = i10;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i13;
                    }
                }
                simpleQueue.clear();
                return;
            }
        }

        public void drainSync() {
            SimpleQueue<T> simpleQueue = this.queue;
            InterfaceC0050c[] interfaceC0050cArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i9 = this.index;
            int iAddAndGet = 1;
            while (true) {
                int i10 = 0;
                int i11 = 0;
                while (!this.cancelled) {
                    if (simpleQueue.isEmpty()) {
                        int length2 = interfaceC0050cArr.length;
                        while (i10 < length2) {
                            interfaceC0050cArr[i10].onComplete();
                            i10++;
                        }
                        return;
                    }
                    long j9 = atomicLongArray.get(i9);
                    long j10 = jArr[i9];
                    if (j9 == j10 || atomicLongArray.get(length + i9) != 0) {
                        i11++;
                    } else {
                        try {
                            T tPoll = simpleQueue.poll();
                            if (tPoll == null) {
                                int length3 = interfaceC0050cArr.length;
                                while (i10 < length3) {
                                    interfaceC0050cArr[i10].onComplete();
                                    i10++;
                                }
                                return;
                            }
                            interfaceC0050cArr[i9].onNext(tPoll);
                            jArr[i9] = j10 + 1;
                            i11 = 0;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.upstream.cancel();
                            int length4 = interfaceC0050cArr.length;
                            while (i10 < length4) {
                                interfaceC0050cArr[i10].onError(th);
                                i10++;
                            }
                            return;
                        }
                    }
                    i9++;
                    if (i9 == length) {
                        i9 = 0;
                    }
                    if (i11 == length) {
                        int i12 = get();
                        if (i12 == iAddAndGet) {
                            this.index = i9;
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        } else {
                            iAddAndGet = i12;
                        }
                    }
                }
                simpleQueue.clear();
                return;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            if (this.sourceMode != 0 || this.queue.offer(t9)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC0051d)) {
                this.upstream = interfaceC0051d;
                if (interfaceC0051d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC0051d;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        setupSubscribers();
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        setupSubscribers();
                        interfaceC0051d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                setupSubscribers();
                interfaceC0051d.request(this.prefetch);
            }
        }

        public void setupSubscribers() {
            InterfaceC0050c[] interfaceC0050cArr = this.subscribers;
            int length = interfaceC0050cArr.length;
            int i9 = 0;
            while (i9 < length && !this.cancelled) {
                int i10 = i9 + 1;
                this.subscriberCount.lazySet(i10);
                interfaceC0050cArr[i9].onSubscribe(new RailSubscription(i9, length));
                i9 = i10;
            }
        }
    }

    public ParallelFromPublisher(InterfaceC0049b interfaceC0049b, int i9, int i10) {
        this.source = interfaceC0049b;
        this.parallelism = i9;
        this.prefetch = i10;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.parallelism;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC0050c[] interfaceC0050cArr) {
        if (validate(interfaceC0050cArr)) {
            this.source.subscribe(new ParallelDispatcher(interfaceC0050cArr, this.prefetch));
        }
    }
}
