package androidx.customview.poolingcontainer;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;

/* loaded from: classes2.dex */
final class PoolingContainerListenerHolder {
    private final ArrayList<PoolingContainerListener> listeners = new ArrayList<>();

    public final void addListener(PoolingContainerListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.listeners.add(listener);
    }

    public final void onRelease() {
        for (int iM14773p = AbstractC8809v.m14773p(this.listeners); -1 < iM14773p; iM14773p--) {
            this.listeners.get(iM14773p).onRelease();
        }
    }

    public final void removeListener(PoolingContainerListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.listeners.remove(listener);
    }
}
