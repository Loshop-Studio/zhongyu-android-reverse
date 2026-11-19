package p147rx.internal.schedulers;

import p147rx.Scheduler;
import p147rx.exceptions.Exceptions;
import p147rx.functions.Action0;

/* loaded from: classes2.dex */
class SleepingAction implements Action0 {
    private final long execTime;
    private final Scheduler.Worker innerScheduler;
    private final Action0 underlying;

    public SleepingAction(Action0 action0, Scheduler.Worker worker, long j4) {
        this.underlying = action0;
        this.innerScheduler = worker;
        this.execTime = j4;
    }

    @Override // p147rx.functions.Action0
    public void call() throws InterruptedException {
        if (this.innerScheduler.isUnsubscribed()) {
            return;
        }
        long jNow = this.execTime - this.innerScheduler.now();
        if (jNow > 0) {
            try {
                Thread.sleep(jNow);
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                Exceptions.propagate(e4);
            }
        }
        if (this.innerScheduler.isUnsubscribed()) {
            return;
        }
        this.underlying.call();
    }
}
