package io.reactivex.internal.schedulers;

import p100f7.AbstractC8462a;

/* loaded from: classes5.dex */
public final class ScheduledDirectPeriodicTask extends AbstractDirectTask implements Runnable {
    public ScheduledDirectPeriodicTask(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f17101b = Thread.currentThread();
        try {
            this.f17100a.run();
            this.f17101b = null;
        } catch (Throwable th) {
            this.f17101b = null;
            lazySet(AbstractDirectTask.f17098c);
            AbstractC8462a.m13801k(th);
        }
    }
}
