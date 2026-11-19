package androidx.lifecycle;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import sd.AbstractC11106e0;
import sd.C11157r0;

/* loaded from: classes2.dex */
public final class PausingDispatcher extends AbstractC11106e0 {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // sd.AbstractC11106e0
    public void dispatch(InterfaceC9945d context, Runnable block) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(block, "block");
        this.dispatchQueue.dispatchAndEnqueue(context, block);
    }

    @Override // sd.AbstractC11106e0
    public boolean isDispatchNeeded(InterfaceC9945d context) {
        AbstractC9979u.m20294g(context, "context");
        if (C11157r0.m24800c().mo25209k().isDispatchNeeded(context)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
