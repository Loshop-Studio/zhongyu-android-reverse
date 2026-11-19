package sd;

import kotlinx.coroutines.InterfaceC10045g;

/* renamed from: sd.q */
/* loaded from: classes6.dex */
public final class C11153q extends AbstractC11151p1 implements InterfaceC11149p {

    /* renamed from: g */
    public final InterfaceC11156r f26812g;

    public C11153q(InterfaceC11156r interfaceC11156r) {
        this.f26812g = interfaceC11156r;
    }

    @Override // sd.InterfaceC11149p
    /* renamed from: a */
    public boolean mo24781a(Throwable th) {
        return m24787t().mo20417K(th);
    }

    @Override // sd.InterfaceC11149p
    public InterfaceC10045g getParent() {
        return m24787t();
    }

    @Override // sd.AbstractC11151p1
    /* renamed from: u */
    public boolean mo20468u() {
        return true;
    }

    @Override // sd.AbstractC11151p1
    /* renamed from: v */
    public void mo20469v(Throwable th) {
        this.f26812g.mo20445m(m24787t());
    }
}
