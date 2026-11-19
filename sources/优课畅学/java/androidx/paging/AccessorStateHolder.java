package androidx.paging;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC9133u;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9280q;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
final class AccessorStateHolder<Key, Value> {
    private final ReentrantLock lock = new ReentrantLock();
    private final InterfaceC9271h _loadStates = AbstractC9281r.m17054a(LoadStates.Companion.getIDLE());
    private final AccessorState<Key, Value> internalState = new AccessorState<>();

    public final InterfaceC9280q getLoadStates() {
        return this._loadStates;
    }

    public final <R> R use(InterfaceC10570l block) {
        AbstractC9133u.m16133g(block, "block");
        ReentrantLock reentrantLock = this.lock;
        try {
            reentrantLock.lock();
            R r10 = (R) block.invoke(this.internalState);
            this._loadStates.setValue(this.internalState.computeLoadStates());
            return r10;
        } finally {
            reentrantLock.unlock();
        }
    }
}
