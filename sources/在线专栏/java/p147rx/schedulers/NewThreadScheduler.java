package p147rx.schedulers;

import p147rx.Scheduler;

@Deprecated
/* loaded from: classes2.dex */
public final class NewThreadScheduler extends Scheduler {
    private NewThreadScheduler() {
        throw new IllegalStateException("No instances!");
    }

    @Override // p147rx.Scheduler
    public Scheduler.Worker createWorker() {
        return null;
    }
}
