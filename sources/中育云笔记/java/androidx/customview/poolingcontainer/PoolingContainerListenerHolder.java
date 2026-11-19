package androidx.customview.poolingcontainer;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10978w;

/* loaded from: classes2.dex */
final class PoolingContainerListenerHolder {
    private final ArrayList<PoolingContainerListener> listeners = new ArrayList<>();

    public final void addListener(PoolingContainerListener listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.listeners.add(listener);
    }

    public final void onRelease() {
        for (int iM24138p = AbstractC10978w.m24138p(this.listeners); -1 < iM24138p; iM24138p--) {
            this.listeners.get(iM24138p).onRelease();
        }
    }

    public final void removeListener(PoolingContainerListener listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.listeners.remove(listener);
    }
}
