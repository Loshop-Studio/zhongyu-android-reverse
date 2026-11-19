package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
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
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableMergeWithSingle<T> extends AbstractFlowableWithUpstream<T, T> {
    final SingleSource<? extends T> other;

    public static final class MergeWithObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC8990d {
        static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean cancelled;
        int consumed;
        final InterfaceC8989c downstream;
        long emitted;
        final int limit;
        volatile boolean mainDone;
        volatile int otherState;
        final int prefetch;
        volatile SimplePlainQueue<T> queue;
        T singleItem;
        final AtomicReference<InterfaceC8990d> mainSubscription = new AtomicReference<>();
        final OtherObserver<T> otherObserver = new OtherObserver<>(this);
        final AtomicThrowable error = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();

        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final MergeWithObserver<T> parent;

            public OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t10) {
                this.parent.otherSuccess(t10);
            }
        }

        public MergeWithObserver(InterfaceC8989c interfaceC8989c) {
            this.downstream = interfaceC8989c;
            int iBufferSize = Flowable.bufferSize();
            this.prefetch = iBufferSize;
            this.limit = iBufferSize - (iBufferSize >> 2);
        }

        @Override // p215q9.InterfaceC8990d
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
            InterfaceC8989c interfaceC8989c = this.downstream;
            long j10 = this.emitted;
            int i10 = this.consumed;
            int i11 = this.limit;
            int i12 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.requested.get();
                while (j10 != j11) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        interfaceC8989c.onError(this.error.terminate());
                        return;
                    }
                    int i13 = this.otherState;
                    if (i13 == i12) {
                        T t10 = this.singleItem;
                        this.singleItem = null;
                        this.otherState = 2;
                        interfaceC8989c.onNext(t10);
                        j10++;
                    } else {
                        boolean z9 = this.mainDone;
                        SimplePlainQueue<T> simplePlainQueue = this.queue;
                        T tPoll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                        boolean z10 = tPoll == null;
                        if (z9 && z10 && i13 == 2) {
                            this.queue = null;
                            interfaceC8989c.onComplete();
                            return;
                        } else {
                            if (z10) {
                                break;
                            }
                            interfaceC8989c.onNext(tPoll);
                            j10++;
                            i10++;
                            if (i10 == i11) {
                                this.mainSubscription.get().request(i11);
                                i10 = 0;
                            }
                            i12 = 1;
                        }
                    }
                }
                if (j10 == j11) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        interfaceC8989c.onError(this.error.terminate());
                        return;
                    }
                    boolean z11 = this.mainDone;
                    SimplePlainQueue<T> simplePlainQueue2 = this.queue;
                    boolean z12 = simplePlainQueue2 == null || simplePlainQueue2.isEmpty();
                    if (z11 && z12 && this.otherState == 2) {
                        this.queue = null;
                        interfaceC8989c.onComplete();
                        return;
                    }
                }
                this.emitted = j10;
                this.consumed = i10;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i12 = 1;
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

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (!this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                SubscriptionHelper.cancel(this.mainSubscription);
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                long j10 = this.emitted;
                if (this.requested.get() != j10) {
                    SimplePlainQueue<T> simplePlainQueue = this.queue;
                    if (simplePlainQueue == null || simplePlainQueue.isEmpty()) {
                        this.emitted = j10 + 1;
                        this.downstream.onNext(t10);
                        int i10 = this.consumed + 1;
                        if (i10 == this.limit) {
                            this.consumed = 0;
                            this.mainSubscription.get().request(i10);
                        } else {
                            this.consumed = i10;
                        }
                    } else {
                        simplePlainQueue.offer(t10);
                    }
                } else {
                    getOrCreateQueue().offer(t10);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.setOnce(this.mainSubscription, interfaceC8990d, this.prefetch);
        }

        public void otherError(Throwable th) {
            if (!this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                SubscriptionHelper.cancel(this.mainSubscription);
                drain();
            }
        }

        public void otherSuccess(T t10) {
            if (compareAndSet(0, 1)) {
                long j10 = this.emitted;
                if (this.requested.get() != j10) {
                    this.emitted = j10 + 1;
                    this.downstream.onNext(t10);
                    this.otherState = 2;
                } else {
                    this.singleItem = t10;
                    this.otherState = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.singleItem = t10;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            BackpressureHelper.add(this.requested, j10);
            drain();
        }
    }

    public FlowableMergeWithSingle(Flowable<T> flowable, SingleSource<? extends T> singleSource) {
        super(flowable);
        this.other = singleSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(interfaceC8989c);
        interfaceC8989c.onSubscribe(mergeWithObserver);
        this.source.subscribe((FlowableSubscriber) mergeWithObserver);
        this.other.subscribe(mergeWithObserver.otherObserver);
    }
}
