package androidx.room.concurrent;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes3.dex */
public final class CloseBarrier {
    private final AtomicInteger blockers;
    private final InterfaceC9529a closeAction;
    private final AtomicBoolean closeInitiated;

    public CloseBarrier(InterfaceC9529a closeAction) {
        AbstractC9979u.m20294g(closeAction, "closeAction");
        this.closeAction = closeAction;
        this.blockers = new AtomicInteger(0);
        this.closeInitiated = new AtomicBoolean(false);
    }

    private final boolean isClosed() {
        return this.closeInitiated.get();
    }

    public final boolean block$room_runtime_release() {
        synchronized (this) {
            if (isClosed()) {
                return false;
            }
            this.blockers.incrementAndGet();
            return true;
        }
    }

    public final void close$room_runtime_release() {
        synchronized (this) {
            if (this.closeInitiated.compareAndSet(false, true)) {
                C10786q c10786q = C10786q.f26013a;
                while (this.blockers.get() != 0) {
                }
                this.closeAction.invoke();
            }
        }
    }

    public final void unblock$room_runtime_release() {
        synchronized (this) {
            this.blockers.decrementAndGet();
            if (this.blockers.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            C10786q c10786q = C10786q.f26013a;
        }
    }
}
