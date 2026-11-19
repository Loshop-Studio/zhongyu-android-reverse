package androidx.lifecycle;

import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import sd.AbstractC11164t1;
import sd.C11157r0;

/* loaded from: classes2.dex */
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused = true;
    private final Queue<Runnable> queue = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void enqueue(Runnable runnable) {
        if (!this.queue.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        drainQueue();
    }

    @MainThread
    public final boolean canRun() {
        return this.finished || !this.paused;
    }

    @AnyThread
    public final void dispatchAndEnqueue(InterfaceC9945d context, final Runnable runnable) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(runnable, "runnable");
        AbstractC11164t1 abstractC11164t1Mo25209k = C11157r0.m24800c().mo25209k();
        if (abstractC11164t1Mo25209k.isDispatchNeeded(context) || canRun()) {
            abstractC11164t1Mo25209k.dispatch(context, new Runnable() { // from class: androidx.lifecycle.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1603c.enqueue(runnable);
                }
            });
        } else {
            enqueue(runnable);
        }
    }

    @MainThread
    public final void drainQueue() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while (!this.queue.isEmpty() && canRun()) {
                Runnable runnablePoll = this.queue.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
        } finally {
            this.isDraining = false;
        }
    }

    @MainThread
    public final void finish() {
        this.finished = true;
        drainQueue();
    }

    @MainThread
    public final void pause() {
        this.paused = true;
    }

    @MainThread
    public final void resume() {
        if (this.paused) {
            if (this.finished) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.paused = false;
            drainQueue();
        }
    }
}
