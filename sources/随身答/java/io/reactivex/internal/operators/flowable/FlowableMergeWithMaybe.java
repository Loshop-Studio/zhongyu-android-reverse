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
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableMergeWithMaybe<T> extends AbstractFlowableWithUpstream<T, T> {
    final MaybeSource<? extends T> other;

    public static final class MergeWithObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC0051d {
        static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean cancelled;
        int consumed;
        final InterfaceC0050c downstream;
        long emitted;
        final int limit;
        volatile boolean mainDone;
        volatile int otherState;
        final int prefetch;
        volatile SimplePlainQueue<T> queue;
        T singleItem;
        final AtomicReference<InterfaceC0051d> mainSubscription = new AtomicReference<>();
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
            public void onSuccess(T t9) {
                this.parent.otherSuccess(t9);
            }
        }

        public MergeWithObserver(InterfaceC0050c interfaceC0050c) {
            this.downstream = interfaceC0050c;
            int iBufferSize = Flowable.bufferSize();
            this.prefetch = iBufferSize;
            this.limit = iBufferSize - (iBufferSize >> 2);
        }

        @Override // p010a9.InterfaceC0051d
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
            InterfaceC0050c interfaceC0050c = this.downstream;
            long j9 = this.emitted;
            int i9 = this.consumed;
            int i10 = this.limit;
            int i11 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j10 = this.requested.get();
                while (j9 != j10) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        interfaceC0050c.onError(this.error.terminate());
                        return;
                    }
                    int i12 = this.otherState;
                    if (i12 == i11) {
                        T t9 = this.singleItem;
                        this.singleItem = null;
                        this.otherState = 2;
                        interfaceC0050c.onNext(t9);
                        j9++;
                    } else {
                        boolean z9 = this.mainDone;
                        SimplePlainQueue<T> simplePlainQueue = this.queue;
                        T tPoll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                        boolean z10 = tPoll == null;
                        if (z9 && z10 && i12 == 2) {
                            this.queue = null;
                            interfaceC0050c.onComplete();
                            return;
                        } else {
                            if (z10) {
                                break;
                            }
                            interfaceC0050c.onNext(tPoll);
                            j9++;
                            i9++;
                            if (i9 == i10) {
                                this.mainSubscription.get().request(i10);
                                i9 = 0;
                            }
                            i11 = 1;
                        }
                    }
                }
                if (j9 == j10) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        interfaceC0050c.onError(this.error.terminate());
                        return;
                    }
                    boolean z11 = this.mainDone;
                    SimplePlainQueue<T> simplePlainQueue2 = this.queue;
                    boolean z12 = simplePlainQueue2 == null || simplePlainQueue2.isEmpty();
                    if (z11 && z12 && this.otherState == 2) {
                        this.queue = null;
                        interfaceC0050c.onComplete();
                        return;
                    }
                }
                this.emitted = j9;
                this.consumed = i9;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i11 = 1;
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

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onError(Throwable th) {
            if (!this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                SubscriptionHelper.cancel(this.mainSubscription);
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onNext(T t9) {
            if (compareAndSet(0, 1)) {
                long j9 = this.emitted;
                if (this.requested.get() != j9) {
                    SimplePlainQueue<T> simplePlainQueue = this.queue;
                    if (simplePlainQueue == null || simplePlainQueue.isEmpty()) {
                        this.emitted = j9 + 1;
                        this.downstream.onNext(t9);
                        int i9 = this.consumed + 1;
                        if (i9 == this.limit) {
                            this.consumed = 0;
                            this.mainSubscription.get().request(i9);
                        } else {
                            this.consumed = i9;
                        }
                    } else {
                        simplePlainQueue.offer(t9);
                    }
                } else {
                    getOrCreateQueue().offer(t9);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t9);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, p010a9.InterfaceC0050c
        public void onSubscribe(InterfaceC0051d interfaceC0051d) {
            SubscriptionHelper.setOnce(this.mainSubscription, interfaceC0051d, this.prefetch);
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

        public void otherSuccess(T t9) {
            if (compareAndSet(0, 1)) {
                long j9 = this.emitted;
                if (this.requested.get() != j9) {
                    this.emitted = j9 + 1;
                    this.downstream.onNext(t9);
                    this.otherState = 2;
                } else {
                    this.singleItem = t9;
                    this.otherState = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.singleItem = t9;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            BackpressureHelper.add(this.requested, j9);
            drain();
        }
    }

    public FlowableMergeWithMaybe(Flowable<T> flowable, MaybeSource<? extends T> maybeSource) {
        super(flowable);
        this.other = maybeSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(interfaceC0050c);
        interfaceC0050c.onSubscribe(mergeWithObserver);
        this.source.subscribe((FlowableSubscriber) mergeWithObserver);
        this.other.subscribe(mergeWithObserver.otherObserver);
    }
}
