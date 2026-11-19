package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8988b;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableTimeout<T, U, V> extends AbstractFlowableWithUpstream<T, T> {
    final InterfaceC8988b firstTimeoutIndicator;
    final Function<? super T, ? extends InterfaceC8988b> itemTimeoutIndicator;
    final InterfaceC8988b other;

    public static final class TimeoutConsumer extends AtomicReference<InterfaceC8990d> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = 8708641127342403073L;
        final long idx;
        final TimeoutSelectorSupport parent;

        public TimeoutConsumer(long j10, TimeoutSelectorSupport timeoutSelectorSupport) {
            this.idx = j10;
            this.parent = timeoutSelectorSupport;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (obj != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (obj == subscriptionHelper) {
                RxJavaPlugins.onError(th);
            } else {
                lazySet(subscriptionHelper);
                this.parent.onTimeoutError(this.idx, th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(Object obj) {
            InterfaceC8990d interfaceC8990d = (InterfaceC8990d) get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (interfaceC8990d != subscriptionHelper) {
                interfaceC8990d.cancel();
                lazySet(subscriptionHelper);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.setOnce(this, interfaceC8990d, Long.MAX_VALUE);
        }
    }

    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final InterfaceC8989c downstream;
        InterfaceC8988b fallback;
        final AtomicLong index;
        final Function<? super T, ? extends InterfaceC8988b> itemTimeoutIndicator;
        final SequentialDisposable task;
        final AtomicReference<InterfaceC8990d> upstream;

        public TimeoutFallbackSubscriber(InterfaceC8989c interfaceC8989c, Function<? super T, ? extends InterfaceC8988b> function, InterfaceC8988b interfaceC8988b) {
            super(true);
            this.downstream = interfaceC8989c;
            this.itemTimeoutIndicator = function;
            this.task = new SequentialDisposable();
            this.upstream = new AtomicReference<>();
            this.fallback = interfaceC8988b;
            this.index = new AtomicLong();
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, p215q9.InterfaceC8990d
        public void cancel() {
            super.cancel();
            this.task.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.task.dispose();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th);
            this.task.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            long j10 = this.index.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = j10 + 1;
                if (this.index.compareAndSet(j10, j11)) {
                    Disposable disposable = this.task.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.consumed++;
                    this.downstream.onNext(t10);
                    try {
                        InterfaceC8988b interfaceC8988b = (InterfaceC8988b) ObjectHelper.requireNonNull(this.itemTimeoutIndicator.apply(t10), "The itemTimeoutIndicator returned a null Publisher.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j11, this);
                        if (this.task.replace(timeoutConsumer)) {
                            interfaceC8988b.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.upstream.get().cancel();
                        this.index.getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.setOnce(this.upstream, interfaceC8990d)) {
                setSubscription(interfaceC8990d);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j10) {
            if (this.index.compareAndSet(j10, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                InterfaceC8988b interfaceC8988b = this.fallback;
                this.fallback = null;
                long j11 = this.consumed;
                if (j11 != 0) {
                    produced(j11);
                }
                interfaceC8988b.subscribe(new FlowableTimeoutTimed.FallbackSubscriber(this.downstream, this));
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        public void onTimeoutError(long j10, Throwable th) {
            if (!this.index.compareAndSet(j10, Long.MAX_VALUE)) {
                RxJavaPlugins.onError(th);
            } else {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(th);
            }
        }

        public void startFirstTimeout(InterfaceC8988b interfaceC8988b) {
            if (interfaceC8988b != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, this);
                if (this.task.replace(timeoutConsumer)) {
                    interfaceC8988b.subscribe(timeoutConsumer);
                }
            }
        }
    }

    public interface TimeoutSelectorSupport extends FlowableTimeoutTimed.TimeoutSupport {
        void onTimeoutError(long j10, Throwable th);
    }

    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC8990d, TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final InterfaceC8989c downstream;
        final Function<? super T, ? extends InterfaceC8988b> itemTimeoutIndicator;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicReference<InterfaceC8990d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public TimeoutSubscriber(InterfaceC8989c interfaceC8989c, Function<? super T, ? extends InterfaceC8988b> function) {
            this.downstream = interfaceC8989c;
            this.itemTimeoutIndicator = function;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.task.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th);
            } else {
                this.task.dispose();
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    Disposable disposable = this.task.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.downstream.onNext(t10);
                    try {
                        InterfaceC8988b interfaceC8988b = (InterfaceC8988b) ObjectHelper.requireNonNull(this.itemTimeoutIndicator.apply(t10), "The itemTimeoutIndicator returned a null Publisher.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j11, this);
                        if (this.task.replace(timeoutConsumer)) {
                            interfaceC8988b.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.upstream.get().cancel();
                        getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC8990d);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        public void onTimeoutError(long j10, Throwable th) {
            if (!compareAndSet(j10, Long.MAX_VALUE)) {
                RxJavaPlugins.onError(th);
            } else {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(th);
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j10);
        }

        public void startFirstTimeout(InterfaceC8988b interfaceC8988b) {
            if (interfaceC8988b != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, this);
                if (this.task.replace(timeoutConsumer)) {
                    interfaceC8988b.subscribe(timeoutConsumer);
                }
            }
        }
    }

    public FlowableTimeout(Flowable<T> flowable, InterfaceC8988b interfaceC8988b, Function<? super T, ? extends InterfaceC8988b> function, InterfaceC8988b interfaceC8988b2) {
        super(flowable);
        this.firstTimeoutIndicator = interfaceC8988b;
        this.itemTimeoutIndicator = function;
        this.other = interfaceC8988b2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        if (this.other == null) {
            TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(interfaceC8989c, this.itemTimeoutIndicator);
            interfaceC8989c.onSubscribe(timeoutSubscriber);
            timeoutSubscriber.startFirstTimeout(this.firstTimeoutIndicator);
            this.source.subscribe((FlowableSubscriber) timeoutSubscriber);
            return;
        }
        TimeoutFallbackSubscriber timeoutFallbackSubscriber = new TimeoutFallbackSubscriber(interfaceC8989c, this.itemTimeoutIndicator, this.other);
        interfaceC8989c.onSubscribe(timeoutFallbackSubscriber);
        timeoutFallbackSubscriber.startFirstTimeout(this.firstTimeoutIndicator);
        this.source.subscribe((FlowableSubscriber) timeoutFallbackSubscriber);
    }
}
