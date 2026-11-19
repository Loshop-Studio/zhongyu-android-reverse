package kotlinx.coroutines;

import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.r1 */
/* loaded from: classes4.dex */
public final class C5997r1 extends AbstractC5995r {

    /* renamed from: a */
    public static final C5997r1 f9495a = new C5997r1();

    @Override // kotlinx.coroutines.AbstractC5995r
    public final void dispatch(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        C6011v1 c6011v1 = (C6011v1) interfaceC5636h.get(C6011v1.f9514b);
        if (c6011v1 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c6011v1.f9515a = true;
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final boolean isDispatchNeeded(InterfaceC5636h interfaceC5636h) {
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final AbstractC5995r limitedParallelism(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
