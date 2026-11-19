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
public final class FlowableInterval extends Flowable<Long> {
    final long initialDelay;
    final long period;
    final Scheduler scheduler;
    final TimeUnit unit;

    public static final class IntervalSubscriber extends AtomicLong implements InterfaceC0051d, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final InterfaceC0050c downstream;
        final AtomicReference<Disposable> resource = new AtomicReference<>();

        public IntervalSubscriber(InterfaceC0050c interfaceC0050c) {
            this.downstream = interfaceC0050c;
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
            if (this.resource.get() != DisposableHelper.DISPOSED) {
                if (get() != 0) {
                    InterfaceC0050c interfaceC0050c = this.downstream;
                    long j9 = this.count;
                    this.count = j9 + 1;
                    interfaceC0050c.onNext(Long.valueOf(j9));
                    BackpressureHelper.produced(this, 1L);
                    return;
                }
                this.downstream.onError(new MissingBackpressureException("Can't deliver value " + this.count + " due to lack of requests"));
                DisposableHelper.dispose(this.resource);
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.setOnce(this.resource, disposable);
        }
    }

    public FlowableInterval(long j9, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.initialDelay = j9;
        this.period = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC0050c interfaceC0050c) {
        IntervalSubscriber intervalSubscriber = new IntervalSubscriber(interfaceC0050c);
        interfaceC0050c.onSubscribe(intervalSubscriber);
        Scheduler scheduler = this.scheduler;
        if (!(scheduler instanceof TrampolineScheduler)) {
            intervalSubscriber.setResource(scheduler.schedulePeriodicallyDirect(intervalSubscriber, this.initialDelay, this.period, this.unit));
            return;
        }
        Scheduler.Worker workerCreateWorker = scheduler.createWorker();
        intervalSubscriber.setResource(workerCreateWorker);
        workerCreateWorker.schedulePeriodically(intervalSubscriber, this.initialDelay, this.period, this.unit);
    }
}
