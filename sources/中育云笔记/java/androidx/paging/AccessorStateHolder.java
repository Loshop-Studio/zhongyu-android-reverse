package androidx.paging;

import androidx.paging.internal.SynchronizedLock;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;

/* loaded from: classes3.dex */
final class AccessorStateHolder<Key, Value> {
    private final SynchronizedLock lock = new SynchronizedLock();
    private final InterfaceC11603l _loadStates = AbstractC11613v.m25602a(LoadStates.Companion.getIDLE());
    private final AccessorState<Key, Value> internalState = new AccessorState<>();

    public final InterfaceC11612u getLoadStates() {
        return this._loadStates;
    }

    public final <R> R use(InterfaceC9540l block) {
        R r10;
        AbstractC9979u.m20294g(block, "block");
        synchronized (this.lock) {
            r10 = (R) block.invoke(this.internalState);
            this._loadStates.setValue(this.internalState.computeLoadStates());
        }
        return r10;
    }
}
