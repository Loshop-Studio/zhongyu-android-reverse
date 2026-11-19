package sd;

import kotlin.coroutines.InterfaceC9945d;

/* renamed from: sd.k2 */
/* loaded from: classes6.dex */
public final class C11132k2 extends AbstractC11106e0 {

    /* renamed from: c */
    public static final C11132k2 f26797c = new C11132k2();

    @Override // sd.AbstractC11106e0
    public void dispatch(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        C11148o2 c11148o2 = (C11148o2) interfaceC9945d.get(C11148o2.f26809d);
        if (c11148o2 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c11148o2.f26810c = true;
    }

    @Override // sd.AbstractC11106e0
    public boolean isDispatchNeeded(InterfaceC9945d interfaceC9945d) {
        return false;
    }

    @Override // sd.AbstractC11106e0
    public AbstractC11106e0 limitedParallelism(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // sd.AbstractC11106e0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
