package p110m;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC5995r;
import p075h6.InterfaceC5636h;

/* renamed from: m.c */
/* loaded from: classes2.dex */
public final class C6075c extends AbstractC5995r {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9674c = AtomicIntegerFieldUpdater.newUpdater(C6075c.class, "b");

    /* renamed from: a */
    public final AbstractC5995r f9675a;

    /* renamed from: b */
    public volatile /* synthetic */ int f9676b = 1;

    public C6075c(AbstractC5995r abstractC5995r) {
        this.f9675a = abstractC5995r;
    }

    /* renamed from: d */
    public final AbstractC5995r m5788d() {
        return f9674c.get(this) == 1 ? AbstractC5896f0.f9344b : this.f9675a;
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final void dispatch(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        m5788d().dispatch(interfaceC5636h, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final void dispatchYield(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        m5788d().dispatchYield(interfaceC5636h, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final boolean isDispatchNeeded(InterfaceC5636h interfaceC5636h) {
        return m5788d().isDispatchNeeded(interfaceC5636h);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final AbstractC5995r limitedParallelism(int i, String str) {
        return m5788d().limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.f9675a + ")";
    }
}
