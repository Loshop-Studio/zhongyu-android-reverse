package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class FlowableIntervalRange extends Flowable<Long> {
    final long end;
    final long initialDelay;
    final long period;
    final Scheduler scheduler;
    final long start;
    final TimeUnit unit;

    public static final class IntervalRangeSubscriber extends AtomicLong implements InterfaceC0051d, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final InterfaceC0050c downstream;
        final long end;
        final AtomicReference<Disposable> resource = new AtomicReference<>();

        public IntervalRangeSubscriber(InterfaceC0050c interfaceC0050c, long j9, long j10) {
            this.downstream = interfaceC0050c;
            this.count = j9;
            this.end = j10;
        }

        @Override // p010a9.InterfaceC0051d
        public void cancel() {
            DisposableHelper.dispose(this.resource);
        }

        @Override // p010a9.InterfaceC0051d
        public void request(long j9) {
            if (SubscriptionHelper.validate(j9)) {
                BackpressureHelper.add(this, j9);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Disposable disposable = this.resource.get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                long j9 = get();
                if (j9 == 0) {
                    this.downstream.onError(new MissingBackpressureException("Can't deliver value " + this.count + " due to lack of requests"));
                    DisposableHelper.dispose(this.resource);
                    return;
                }
                long j10 = this.count;
                this.downstream.onNext(Long.valueOf(j10));
                if (j10 == this.end) {
                    if (this.resource.get() != disposableHelper) {
                        this.downstream.onComplete();
                    }
                    DisposableHelper.dispose(this.resource);
                } else {
                    this.count = j10 + 1;
                    if (j9 != Long.MAX_VALUE) {
                        decrementAndGet();
                    }
                }
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.setOnce(this.resource, disposable);
        }
    }

    public FlowableIntervalRange(long j9, long j10, long j11, long j12, TimeUnit timeUnit, Scheduler scheduler) {
        this.initialDelay = j11;
        this.period = j12;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.start = j9;
        this.end = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        IntervalRangeSubscriber intervalRangeSubscriber = new IntervalRangeSubscriber(interfaceC0050c, this.start, this.end);
        interfaceC0050c.onSubscribe(intervalRangeSubscriber);
        Scheduler scheduler = this.scheduler;
        if (!(scheduler instanceof TrampolineScheduler)) {
            intervalRangeSubscriber.setResource(scheduler.schedulePeriodicallyDirect(intervalRangeSubscriber, this.initialDelay, this.period, this.unit));
            return;
        }
        Scheduler.Worker workerCreateWorker = scheduler.createWorker();
        intervalRangeSubscriber.setResource(workerCreateWorker);
        workerCreateWorker.schedulePeriodically(intervalRangeSubscriber, this.initialDelay, this.period, this.unit);
    }
}
