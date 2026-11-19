package p135i8;

import kotlinx.coroutines.InterfaceC9212n;

/* renamed from: i8.p */
/* loaded from: classes5.dex */
public final class C8863p extends AbstractC8894z0 implements InterfaceC8860o {

    /* renamed from: e */
    public final InterfaceC8866q f16532e;

    public C8863p(InterfaceC8866q interfaceC8866q) {
        this.f16532e = interfaceC8866q;
    }

    @Override // kotlinx.coroutines.InterfaceC9211m
    /* renamed from: a */
    public void mo14884a(Throwable th) {
        this.f16532e.mo14899b(m14829t());
    }

    @Override // p135i8.InterfaceC8860o
    /* renamed from: b */
    public boolean mo14877b(Throwable th) {
        return m14829t().mo14903K(th);
    }

    @Override // p135i8.InterfaceC8860o
    public InterfaceC9212n getParent() {
        return m14829t();
    }
}
