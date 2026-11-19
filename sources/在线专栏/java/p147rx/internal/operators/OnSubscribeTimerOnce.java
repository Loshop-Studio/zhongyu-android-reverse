package p147rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p147rx.Observable;
import p147rx.Scheduler;
import p147rx.Subscriber;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Action0;

/* loaded from: classes2.dex */
public final class OnSubscribeTimerOnce implements Observable.OnSubscribe<Long> {
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    public OnSubscribeTimerOnce(long j4, TimeUnit timeUnit, Scheduler scheduler) {
        this.time = j4;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // p147rx.functions.Action1
    public void call(final Subscriber<? super Long> subscriber) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        subscriber.add(workerCreateWorker);
        workerCreateWorker.schedule(new Action0() { // from class: rx.internal.operators.OnSubscribeTimerOnce.1
            @Override // p147rx.functions.Action0
            public void call() {
                try {
                    subscriber.onNext(0L);
                    subscriber.onCompleted();
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, subscriber);
                }
            }
        }, this.time, this.unit);
    }
}
