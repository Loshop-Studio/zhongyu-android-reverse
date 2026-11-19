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
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {
    final int parallelism;
    final int prefetch;
    final InterfaceC8988b source;

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
        final InterfaceC8989c[] subscribers;
        InterfaceC8990d upstream;

        public final class RailSubscription implements InterfaceC8990d {

            /* renamed from: j */
            final int f13358j;

            /* renamed from: m */
            final int f13359m;

            public RailSubscription(int i10, int i11) {
                this.f13358j = i10;
                this.f13359m = i11;
            }

            @Override // p215q9.InterfaceC8990d
            public void cancel() {
                if (ParallelDispatcher.this.requests.compareAndSet(this.f13358j + this.f13359m, 0L, 1L)) {
                    ParallelDispatcher parallelDispatcher = ParallelDispatcher.this;
                    int i10 = this.f13359m;
                    parallelDispatcher.cancel(i10 + i10);
                }
            }

            @Override // p215q9.InterfaceC8990d
            public void request(long j10) {
                long j11;
                if (SubscriptionHelper.validate(j10)) {
                    AtomicLongArray atomicLongArray = ParallelDispatcher.this.requests;
                    do {
                        j11 = atomicLongArray.get(this.f13358j);
                        if (j11 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f13358j, j11, BackpressureHelper.addCap(j11, j10)));
                    if (ParallelDispatcher.this.subscriberCount.get() == this.f13359m) {
                        ParallelDispatcher.this.drain();
                    }
                }
            }
        }

        public ParallelDispatcher(InterfaceC8989c[] interfaceC8989cArr, int i10) {
            this.subscribers = interfaceC8989cArr;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
            int length = interfaceC8989cArr.length;
            int i11 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i11 + 1);
            this.requests = atomicLongArray;
            atomicLongArray.lazySet(i11, length);
            this.emissions = new long[length];
        }

        public void cancel(int i10) {
            if (this.requests.decrementAndGet(i10) == 0) {
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
            InterfaceC8989c[] interfaceC8989cArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i10 = this.index;
            int i11 = this.produced;
            int iAddAndGet = 1;
            while (true) {
                int i12 = 0;
                int i13 = 0;
                while (!this.cancelled) {
                    boolean z9 = this.done;
                    if (z9 && (th = this.error) != null) {
                        simpleQueue.clear();
                        int length2 = interfaceC8989cArr.length;
                        while (i12 < length2) {
                            interfaceC8989cArr[i12].onError(th);
                            i12++;
                        }
                        return;
                    }
                    boolean zIsEmpty = simpleQueue.isEmpty();
                    if (z9 && zIsEmpty) {
                        int length3 = interfaceC8989cArr.length;
                        while (i12 < length3) {
                            interfaceC8989cArr[i12].onComplete();
                            i12++;
                        }
                        return;
                    }
                    if (!zIsEmpty) {
                        long j10 = atomicLongArray.get(i10);
                        long j11 = jArr[i10];
                        if (j10 == j11 || atomicLongArray.get(length + i10) != 0) {
                            i13++;
                        } else {
                            try {
                                T tPoll = simpleQueue.poll();
                                if (tPoll != null) {
                                    interfaceC8989cArr[i10].onNext(tPoll);
                                    jArr[i10] = j11 + 1;
                                    i11++;
                                    if (i11 == this.limit) {
                                        this.upstream.request(i11);
                                        i11 = 0;
                                    }
                                    i13 = 0;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.upstream.cancel();
                                int length4 = interfaceC8989cArr.length;
                                while (i12 < length4) {
                                    interfaceC8989cArr[i12].onError(th2);
                                    i12++;
                                }
                                return;
                            }
                        }
                        i10++;
                        if (i10 == length) {
                            i10 = 0;
                        }
                        if (i13 == length) {
                        }
                    }
                    int i14 = get();
                    if (i14 == iAddAndGet) {
                        this.index = i10;
                        this.produced = i11;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i14;
                    }
                }
                simpleQueue.clear();
                return;
            }
        }

        public void drainSync() {
            SimpleQueue<T> simpleQueue = this.queue;
            InterfaceC8989c[] interfaceC8989cArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i10 = this.index;
            int iAddAndGet = 1;
            while (true) {
                int i11 = 0;
                int i12 = 0;
                while (!this.cancelled) {
                    if (simpleQueue.isEmpty()) {
                        int length2 = interfaceC8989cArr.length;
                        while (i11 < length2) {
                            interfaceC8989cArr[i11].onComplete();
                            i11++;
                        }
                        return;
                    }
                    long j10 = atomicLongArray.get(i10);
                    long j11 = jArr[i10];
                    if (j10 == j11 || atomicLongArray.get(length + i10) != 0) {
                        i12++;
                    } else {
                        try {
                            T tPoll = simpleQueue.poll();
                            if (tPoll == null) {
                                int length3 = interfaceC8989cArr.length;
                                while (i11 < length3) {
                                    interfaceC8989cArr[i11].onComplete();
                                    i11++;
                                }
                                return;
                            }
                            interfaceC8989cArr[i10].onNext(tPoll);
                            jArr[i10] = j11 + 1;
                            i12 = 0;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.upstream.cancel();
                            int length4 = interfaceC8989cArr.length;
                            while (i11 < length4) {
                                interfaceC8989cArr[i11].onError(th);
                                i11++;
                            }
                            return;
                        }
                    }
                    i10++;
                    if (i10 == length) {
                        i10 = 0;
                    }
                    if (i12 == length) {
                        int i13 = get();
                        if (i13 == iAddAndGet) {
                            this.index = i10;
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        } else {
                            iAddAndGet = i13;
                        }
                    }
                }
                simpleQueue.clear();
                return;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (this.sourceMode != 0 || this.queue.offer(t10)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                if (interfaceC8990d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC8990d;
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
                        interfaceC8990d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                setupSubscribers();
                interfaceC8990d.request(this.prefetch);
            }
        }

        public void setupSubscribers() {
            InterfaceC8989c[] interfaceC8989cArr = this.subscribers;
            int length = interfaceC8989cArr.length;
            int i10 = 0;
            while (i10 < length && !this.cancelled) {
                int i11 = i10 + 1;
                this.subscriberCount.lazySet(i11);
                interfaceC8989cArr[i10].onSubscribe(new RailSubscription(i10, length));
                i10 = i11;
            }
        }
    }

    public ParallelFromPublisher(InterfaceC8988b interfaceC8988b, int i10, int i11) {
        this.source = interfaceC8988b;
        this.parallelism = i10;
        this.prefetch = i11;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.parallelism;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC8989c[] interfaceC8989cArr) {
        if (validate(interfaceC8989cArr)) {
            this.source.subscribe(new ParallelDispatcher(interfaceC8989cArr, this.prefetch));
        }
    }
}
