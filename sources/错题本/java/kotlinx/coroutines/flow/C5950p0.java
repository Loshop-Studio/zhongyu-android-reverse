package kotlinx.coroutines.flow;

import p075h6.InterfaceC5631c;

/* renamed from: kotlinx.coroutines.flow.p0 */
/* loaded from: classes4.dex */
public final class C5950p0 implements InterfaceC5912g {

    /* renamed from: a */
    public final Throwable f9434a;

    public C5950p0(Throwable th) {
        this.f9434a = th;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    public final Object emit(Object obj, InterfaceC5631c interfaceC5631c) throws Throwable {
        throw this.f9434a;
    }
}
