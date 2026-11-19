package sd;

import kotlinx.coroutines.InterfaceC9996b;

/* renamed from: sd.u0 */
/* loaded from: classes6.dex */
public final class C11166u0 implements InterfaceC9996b {

    /* renamed from: c */
    public final InterfaceC11163t0 f26827c;

    public C11166u0(InterfaceC11163t0 interfaceC11163t0) {
        this.f26827c = interfaceC11163t0;
    }

    @Override // kotlinx.coroutines.InterfaceC9996b
    /* renamed from: a */
    public void mo20494a(Throwable th) {
        this.f26827c.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f26827c + ']';
    }
}
