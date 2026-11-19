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
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {
    final int parallelism;
    final int prefetch;
    final InterfaceC7916b source;

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
        final InterfaceC7917c[] subscribers;
        InterfaceC7918d upstream;

        public final class RailSubscription implements InterfaceC7918d {

            /* renamed from: j */
            final int f8480j;

            /* renamed from: m */
            final int f8481m;

            public RailSubscription(int i6, int i7) {
                this.f8480j = i6;
                this.f8481m = i7;
            }

            @Override // p193y5.InterfaceC7918d
            public void cancel() {
                if (ParallelDispatcher.this.requests.compareAndSet(this.f8480j + this.f8481m, 0L, 1L)) {
                    ParallelDispatcher parallelDispatcher = ParallelDispatcher.this;
                    int i6 = this.f8481m;
                    parallelDispatcher.cancel(i6 + i6);
                }
            }

            @Override // p193y5.InterfaceC7918d
            public void request(long j6) {
                long j7;
                if (SubscriptionHelper.validate(j6)) {
                    AtomicLongArray atomicLongArray = ParallelDispatcher.this.requests;
                    do {
                        j7 = atomicLongArray.get(this.f8480j);
                        if (j7 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f8480j, j7, BackpressureHelper.addCap(j7, j6)));
                    if (ParallelDispatcher.this.subscriberCount.get() == this.f8481m) {
                        ParallelDispatcher.this.drain();
                    }
                }
            }
        }

        public ParallelDispatcher(InterfaceC7917c[] interfaceC7917cArr, int i6) {
            this.subscribers = interfaceC7917cArr;
            this.prefetch = i6;
            this.limit = i6 - (i6 >> 2);
            int length = interfaceC7917cArr.length;
            int i7 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i7 + 1);
            this.requests = atomicLongArray;
            atomicLongArray.lazySet(i7, length);
            this.emissions = new long[length];
        }

        public void cancel(int i6) {
            if (this.requests.decrementAndGet(i6) == 0) {
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
            InterfaceC7917c[] interfaceC7917cArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i6 = this.index;
            int i7 = this.produced;
            int iAddAndGet = 1;
            while (true) {
                int i8 = 0;
                int i9 = 0;
                while (!this.cancelled) {
                    boolean z6 = this.done;
                    if (z6 && (th = this.error) != null) {
                        simpleQueue.clear();
                        int length2 = interfaceC7917cArr.length;
                        while (i8 < length2) {
                            interfaceC7917cArr[i8].onError(th);
                            i8++;
                        }
                        return;
                    }
                    boolean zIsEmpty = simpleQueue.isEmpty();
                    if (z6 && zIsEmpty) {
                        int length3 = interfaceC7917cArr.length;
                        while (i8 < length3) {
                            interfaceC7917cArr[i8].onComplete();
                            i8++;
                        }
                        return;
                    }
                    if (!zIsEmpty) {
                        long j6 = atomicLongArray.get(i6);
                        long j7 = jArr[i6];
                        if (j6 == j7 || atomicLongArray.get(length + i6) != 0) {
                            i9++;
                        } else {
                            try {
                                T tPoll = simpleQueue.poll();
                                if (tPoll != null) {
                                    interfaceC7917cArr[i6].onNext(tPoll);
                                    jArr[i6] = j7 + 1;
                                    i7++;
                                    if (i7 == this.limit) {
                                        this.upstream.request(i7);
                                        i7 = 0;
                                    }
                                    i9 = 0;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.upstream.cancel();
                                int length4 = interfaceC7917cArr.length;
                                while (i8 < length4) {
                                    interfaceC7917cArr[i8].onError(th2);
                                    i8++;
                                }
                                return;
                            }
                        }
                        i6++;
                        if (i6 == length) {
                            i6 = 0;
                        }
                        if (i9 == length) {
                        }
                    }
                    int i10 = get();
                    if (i10 == iAddAndGet) {
                        this.index = i6;
                        this.produced = i7;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i10;
                    }
                }
                simpleQueue.clear();
                return;
            }
        }

        public void drainSync() {
            SimpleQueue<T> simpleQueue = this.queue;
            InterfaceC7917c[] interfaceC7917cArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i6 = this.index;
            int iAddAndGet = 1;
            while (true) {
                int i7 = 0;
                int i8 = 0;
                while (!this.cancelled) {
                    if (simpleQueue.isEmpty()) {
                        int length2 = interfaceC7917cArr.length;
                        while (i7 < length2) {
                            interfaceC7917cArr[i7].onComplete();
                            i7++;
                        }
                        return;
                    }
                    long j6 = atomicLongArray.get(i6);
                    long j7 = jArr[i6];
                    if (j6 == j7 || atomicLongArray.get(length + i6) != 0) {
                        i8++;
                    } else {
                        try {
                            T tPoll = simpleQueue.poll();
                            if (tPoll == null) {
                                int length3 = interfaceC7917cArr.length;
                                while (i7 < length3) {
                                    interfaceC7917cArr[i7].onComplete();
                                    i7++;
                                }
                                return;
                            }
                            interfaceC7917cArr[i6].onNext(tPoll);
                            jArr[i6] = j7 + 1;
                            i8 = 0;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.upstream.cancel();
                            int length4 = interfaceC7917cArr.length;
                            while (i7 < length4) {
                                interfaceC7917cArr[i7].onError(th);
                                i7++;
                            }
                            return;
                        }
                    }
                    i6++;
                    if (i6 == length) {
                        i6 = 0;
                    }
                    if (i8 == length) {
                        int i9 = get();
                        if (i9 == iAddAndGet) {
                            this.index = i6;
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        } else {
                            iAddAndGet = i9;
                        }
                    }
                }
                simpleQueue.clear();
                return;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            if (this.sourceMode != 0 || this.queue.offer(t6)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC7918d)) {
                this.upstream = interfaceC7918d;
                if (interfaceC7918d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC7918d;
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
                        interfaceC7918d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                setupSubscribers();
                interfaceC7918d.request(this.prefetch);
            }
        }

        public void setupSubscribers() {
            InterfaceC7917c[] interfaceC7917cArr = this.subscribers;
            int length = interfaceC7917cArr.length;
            int i6 = 0;
            while (i6 < length && !this.cancelled) {
                int i7 = i6 + 1;
                this.subscriberCount.lazySet(i7);
                interfaceC7917cArr[i6].onSubscribe(new RailSubscription(i6, length));
                i6 = i7;
            }
        }
    }

    public ParallelFromPublisher(InterfaceC7916b interfaceC7916b, int i6, int i7) {
        this.source = interfaceC7916b;
        this.parallelism = i6;
        this.prefetch = i7;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.parallelism;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC7917c[] interfaceC7917cArr) {
        if (validate(interfaceC7917cArr)) {
            this.source.subscribe(new ParallelDispatcher(interfaceC7917cArr, this.prefetch));
        }
    }
}
