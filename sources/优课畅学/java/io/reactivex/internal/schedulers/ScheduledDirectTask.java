package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class ScheduledDirectTask extends AbstractDirectTask implements Callable<Void> {
    public ScheduledDirectTask(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f17101b = Thread.currentThread();
        try {
            this.f17100a.run();
            return null;
        } finally {
            lazySet(AbstractDirectTask.f17098c);
            this.f17101b = null;
        }
    }
}
