package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.k */
/* loaded from: classes4.dex */
public final class C5974k extends AbstractC6017y0 implements InterfaceC5971j {

    /* renamed from: e */
    public final C5871c1 f9466e;

    public C5974k(C5871c1 c5871c1) {
        this.f9466e = c5871c1;
    }

    @Override // kotlinx.coroutines.InterfaceC5971j
    /* renamed from: a */
    public final boolean mo5589a(Throwable th) {
        return m5657h().mo5465z(th);
    }

    @Override // kotlinx.coroutines.AbstractC6017y0
    /* renamed from: i */
    public final boolean mo5426i() {
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC6017y0
    /* renamed from: j */
    public final void mo5427j(Throwable th) {
        this.f9466e.m5462v(m5657h());
    }
}
