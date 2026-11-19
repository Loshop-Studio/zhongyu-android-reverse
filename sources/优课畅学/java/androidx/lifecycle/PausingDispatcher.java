package androidx.lifecycle;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p135i8.C8843i0;

/* loaded from: classes3.dex */
public final class PausingDispatcher extends CoroutineDispatcher {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(InterfaceC9100d context, Runnable block) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(block, "block");
        this.dispatchQueue.dispatchAndEnqueue(context, block);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(InterfaceC9100d context) {
        AbstractC9133u.m16133g(context, "context");
        if (C8843i0.m14868c().mo15693o().isDispatchNeeded(context)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
