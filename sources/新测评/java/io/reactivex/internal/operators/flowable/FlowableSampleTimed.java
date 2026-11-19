package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8989c;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public final class FlowableSampleTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean emitLast;
    final long period;
    final Scheduler scheduler;
    final TimeUnit unit;

    public static final class SampleTimedEmitLast<T> extends SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip;

        public SampleTimedEmitLast(InterfaceC8989c interfaceC8989c, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            super(interfaceC8989c, j10, timeUnit, scheduler);
            this.wip = new AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        public void complete() {
            emit();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.incrementAndGet() == 2) {
                emit();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }
    }

    public static final class SampleTimedNoLast<T> extends SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public SampleTimedNoLast(InterfaceC8989c interfaceC8989c, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            super(interfaceC8989c, j10, timeUnit, scheduler);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        public void complete() {
            this.downstream.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            emit();
        }
    }

    public static abstract class SampleTimedSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, InterfaceC8990d, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final InterfaceC8989c downstream;
        final long period;
        final Scheduler scheduler;
        final TimeUnit unit;
        InterfaceC8990d upstream;
        final AtomicLong requested = new AtomicLong();
        final SequentialDisposable timer = new SequentialDisposable();

        public SampleTimedSubscriber(InterfaceC8989c interfaceC8989c, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.downstream = interfaceC8989c;
            this.period = j10;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // p215q9.InterfaceC8990d
        public void cancel() {
            cancelTimer();
            this.upstream.cancel();
        }

        public void cancelTimer() {
            DisposableHelper.dispose(this.timer);
        }

        public abstract void complete();

        public void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(andSet);
                    BackpressureHelper.produced(this.requested, 1L);
                } else {
                    cancel();
                    this.downstream.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onComplete() {
            cancelTimer();
            complete();
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onError(Throwable th) {
            cancelTimer();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onNext(T t10) {
            lazySet(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p215q9.InterfaceC8989c
        public void onSubscribe(InterfaceC8990d interfaceC8990d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC8990d)) {
                this.upstream = interfaceC8990d;
                this.downstream.onSubscribe(this);
                SequentialDisposable sequentialDisposable = this.timer;
                Scheduler scheduler = this.scheduler;
                long j10 = this.period;
                sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j10, j10, this.unit));
                interfaceC8990d.request(Long.MAX_VALUE);
            }
        }

        @Override // p215q9.InterfaceC8990d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
            }
        }
    }

    public FlowableSampleTimed(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z9) {
        super(flowable);
        this.period = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.emitLast = z9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC8989c interfaceC8989c) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(interfaceC8989c);
        if (this.emitLast) {
            this.source.subscribe((FlowableSubscriber) new SampleTimedEmitLast(serializedSubscriber, this.period, this.unit, this.scheduler));
        } else {
            this.source.subscribe((FlowableSubscriber) new SampleTimedNoLast(serializedSubscriber, this.period, this.unit, this.scheduler));
        }
    }
}
