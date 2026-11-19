package p135i8;

import kotlinx.coroutines.InterfaceC9154b;

/* renamed from: i8.l0 */
/* loaded from: classes5.dex */
public final class C8852l0 implements InterfaceC9154b {

    /* renamed from: a */
    public final InterfaceC8849k0 f16520a;

    public C8852l0(InterfaceC8849k0 interfaceC8849k0) {
        this.f16520a = interfaceC8849k0;
    }

    @Override // kotlinx.coroutines.InterfaceC9154b
    /* renamed from: a */
    public void mo14865a(Throwable th) {
        this.f16520a.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f16520a + ']';
    }
}
