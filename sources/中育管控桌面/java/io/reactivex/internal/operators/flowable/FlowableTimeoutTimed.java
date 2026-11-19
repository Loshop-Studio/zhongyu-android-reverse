package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p193y5.InterfaceC7916b;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class FlowableTimeoutTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final InterfaceC7916b other;
    final Scheduler scheduler;
    final long timeout;
    final TimeUnit unit;

    public static final class FallbackSubscriber<T> implements FlowableSubscriber<T> {
        final SubscriptionArbiter arbiter;
        final InterfaceC7917c downstream;

        public FallbackSubscriber(InterfaceC7917c interfaceC7917c, SubscriptionArbiter subscriptionArbiter) {
            this.downstream = interfaceC7917c;
            this.arbiter = subscriptionArbiter;
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            this.downstream.onNext(t6);
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            this.arbiter.setSubscription(interfaceC7918d);
        }
    }

    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final InterfaceC7917c downstream;
        InterfaceC7916b fallback;
        final AtomicLong index;
        final SequentialDisposable task;
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<InterfaceC7918d> upstream;
        final Scheduler.Worker worker;

        public TimeoutFallbackSubscriber(InterfaceC7917c interfaceC7917c, long j6, TimeUnit timeUnit, Scheduler.Worker worker, InterfaceC7916b interfaceC7916b) {
            super(true);
            this.downstream = interfaceC7917c;
            this.timeout = j6;
            this.unit = timeUnit;
            this.worker = worker;
            this.fallback = interfaceC7916b;
            this.task = new SequentialDisposable();
            this.upstream = new AtomicReference<>();
            this.index = new AtomicLong();
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, p193y5.InterfaceC7918d
        public void cancel() {
            super.cancel();
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            long j6 = this.index.get();
            if (j6 != Long.MAX_VALUE) {
                long j7 = j6 + 1;
                if (this.index.compareAndSet(j6, j7)) {
                    this.task.get().dispose();
                    this.consumed++;
                    this.downstream.onNext(t6);
                    startTimeout(j7);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            if (SubscriptionHelper.setOnce(this.upstream, interfaceC7918d)) {
                setSubscription(interfaceC7918d);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j6) {
            if (this.index.compareAndSet(j6, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                long j7 = this.consumed;
                if (j7 != 0) {
                    produced(j7);
                }
                InterfaceC7916b interfaceC7916b = this.fallback;
                this.fallback = null;
                interfaceC7916b.subscribe(new FallbackSubscriber(this.downstream, this));
                this.worker.dispose();
            }
        }

        public void startTimeout(long j6) {
            this.task.replace(this.worker.schedule(new TimeoutTask(j6, this), this.timeout, this.unit));
        }
    }

    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC7918d, TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final InterfaceC7917c downstream;
        final long timeout;
        final TimeUnit unit;
        final Scheduler.Worker worker;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicReference<InterfaceC7918d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public TimeoutSubscriber(InterfaceC7917c interfaceC7917c, long j6, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.downstream = interfaceC7917c;
            this.timeout = j6;
            this.unit = timeUnit;
            this.worker = worker;
        }

        @Override // p193y5.InterfaceC7918d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onNext(T t6) {
            long j6 = get();
            if (j6 != Long.MAX_VALUE) {
                long j7 = 1 + j6;
                if (compareAndSet(j6, j7)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t6);
                    startTimeout(j7);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p193y5.InterfaceC7917c
        public void onSubscribe(InterfaceC7918d interfaceC7918d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC7918d);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j6) {
            if (compareAndSet(j6, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.timeoutMessage(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        @Override // p193y5.InterfaceC7918d
        public void request(long j6) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j6);
        }

        public void startTimeout(long j6) {
            this.task.replace(this.worker.schedule(new TimeoutTask(j6, this), this.timeout, this.unit));
        }
    }

    public interface TimeoutSupport {
        void onTimeout(long j6);
    }

    public static final class TimeoutTask implements Runnable {
        final long idx;
        final TimeoutSupport parent;

        public TimeoutTask(long j6, TimeoutSupport timeoutSupport) {
            this.idx = j6;
            this.parent = timeoutSupport;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.onTimeout(this.idx);
        }
    }

    public FlowableTimeoutTimed(Flowable<T> flowable, long j6, TimeUnit timeUnit, Scheduler scheduler, InterfaceC7916b interfaceC7916b) {
        super(flowable);
        this.timeout = j6;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.other = interfaceC7916b;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC7917c interfaceC7917c) {
        if (this.other == null) {
            TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(interfaceC7917c, this.timeout, this.unit, this.scheduler.createWorker());
            interfaceC7917c.onSubscribe(timeoutSubscriber);
            timeoutSubscriber.startTimeout(0L);
            this.source.subscribe((FlowableSubscriber) timeoutSubscriber);
            return;
        }
        TimeoutFallbackSubscriber timeoutFallbackSubscriber = new TimeoutFallbackSubscriber(interfaceC7917c, this.timeout, this.unit, this.scheduler.createWorker(), this.other);
        interfaceC7917c.onSubscribe(timeoutFallbackSubscriber);
        timeoutFallbackSubscriber.startTimeout(0L);
        this.source.subscribe((FlowableSubscriber) timeoutFallbackSubscriber);
    }
}
