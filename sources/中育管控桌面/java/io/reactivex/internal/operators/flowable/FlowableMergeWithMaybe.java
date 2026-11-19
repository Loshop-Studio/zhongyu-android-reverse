package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableMergeWithMaybe<T> extends AbstractFlowableWithUpstream<T, T> {
    final MaybeSource<? extends T> other;

    public static final class MergeWithObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC7918d {
        static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean cancelled;
        int consumed;
        final InterfaceC7917c downstream;
        long emitted;
        final int limit;
        volatile boolean mainDone;
        volatile int otherState;
        final int prefetch;
        volatile SimplePlainQueue<T> queue;
        T singleItem;
        final AtomicReference<InterfaceC7918d> mainSubscription = new AtomicReference<>();
        final OtherObserver<T> otherObserver = new OtherObserver<>(this);
        final AtomicThrowable error = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();

        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final MergeWithObserver<T> parent;

            public OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.otherComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(T t6) {
                this.parent.otherSuccess(t6);
            }
        }

        public MergeWithObserver(InterfaceC7917c interfaceC7917c) {
            this.downstream = interfaceC7917c;
            int iBufferSize = Flowable.bufferSize();
            this.prefetch = iBufferSize;
            this.limit = iBufferSize - (iBufferSize >> 2);
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            this.cancelled = true;
            SubscriptionHelper.cancel(this.mainSubscription);
            DisposableHelper.dispose(this.otherObserver);
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            InterfaceC7917c interfaceC7917c = this.downstream;
            long j6 = this.emitted;
            int i6 = this.consumed;
            int i7 = this.limit;
            int i8 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j7 = this.requested.get();
                while (j6 != j7) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        interfaceC7917c.onError(this.error.terminate());
                        return;
                    }
                    int i9 = this.otherState;
                    if (i9 == i8) {
                        T t6 = this.singleItem;
                        this.singleItem = null;
                        this.otherState = 2;
                        interfaceC7917c.onNext(t6);
                        j6++;
                    } else {
                        boolean z6 = this.mainDone;
                        SimplePlainQueue<T> simplePlainQueue = this.queue;
                        T tPoll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                        boolean z7 = tPoll == null;
                        if (z6 && z7 && i9 == 2) {
                            this.queue = null;
                            interfaceC7917c.onComplete();
                            return;
                        } else {
                            if (z7) {
                                break;
                            }
                            interfaceC7917c.onNext(tPoll);
                            j6++;
                            i6++;
                            if (i6 == i7) {
                                this.mainSubscription.get().request(i7);
                                i6 = 0;
                            }
                            i8 = 1;
                        }
                    }
                }
                if (j6 == j7) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        interfaceC7917c.onError(this.error.terminate());
                        return;
                    }
                    boolean z8 = this.mainDone;
                    SimplePlainQueue<T> simplePlainQueue2 = this.queue;
                    boolean z9 = simplePlainQueue2 == null || simplePlainQueue2.isEmpty();
                    if (z8 && z9 && this.otherState == 2) {
                        this.queue = null;
                        interfaceC7917c.onComplete();
                        return;
                    }
                }
                this.emitted = j6;
                this.consumed = i6;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i8 = 1;
                }
            }
        }

        public SimplePlainQueue<T> getOrCreateQueue() {
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                return simplePlainQueue;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(Flowable.bufferSize());
            this.queue = spscArrayQueue;
            return spscArrayQueue;
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            if (!this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                DisposableHelper.dispose(this.otherObserver);
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            if (compareAndSet(0, 1)) {
                long j6 = this.emitted;
                if (this.requested.get() != j6) {
                    SimplePlainQueue<T> simplePlainQueue = this.queue;
                    if (simplePlainQueue == null || simplePlainQueue.isEmpty()) {
                        this.emitted = j6 + 1;
                        this.downstream.onNext(t6);
                        int i6 = this.consumed + 1;
                        if (i6 == this.limit) {
                            this.consumed = 0;
                            this.mainSubscription.get().request(i6);
                        } else {
                            this.consumed = i6;
                        }
                    } else {
                        simplePlainQueue.offer(t6);
                    }
                } else {
                    getOrCreateQueue().offer(t6);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t6);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            SubscriptionHelper.setOnce(this.mainSubscription, interfaceC7918d, this.prefetch);
        }

        public void otherComplete() {
            this.otherState = 2;
            drain();
        }

        public void otherError(Throwable th) {
            if (!this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                SubscriptionHelper.cancel(this.mainSubscription);
                drain();
            }
        }

        public void otherSuccess(T t6) {
            if (compareAndSet(0, 1)) {
                long j6 = this.emitted;
                if (this.requested.get() != j6) {
                    this.emitted = j6 + 1;
                    this.downstream.onNext(t6);
                    this.otherState = 2;
                } else {
                    this.singleItem = t6;
                    this.otherState = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.singleItem = t6;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            BackpressureHelper.add(this.requested, j6);
            drain();
        }
    }

    public FlowableMergeWithMaybe(Flowable<T> flowable, MaybeSource<? extends T> maybeSource) {
        super(flowable);
        this.other = maybeSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(interfaceC7917c);
        interfaceC7917c.onSubscribe(mergeWithObserver);
        this.source.subscribe((FlowableSubscriber) mergeWithObserver);
        this.other.subscribe(mergeWithObserver.otherObserver);
    }
}
