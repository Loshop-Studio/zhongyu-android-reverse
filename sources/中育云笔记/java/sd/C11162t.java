package sd;

import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.JobSupport;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* renamed from: sd.t */
/* loaded from: classes6.dex */
public final class C11162t extends JobSupport implements InterfaceC11159s {
    public C11162t(InterfaceC10045g interfaceC10045g) {
        super(true);
        m20433c0(interfaceC10045g);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: T */
    public boolean mo20426T() {
        return true;
    }

    @Override // sd.InterfaceC11159s
    /* renamed from: a */
    public boolean mo24802a(Throwable th) {
        return m20441i0(new C11174x(th, false, 2, null));
    }

    @Override // sd.InterfaceC11138m0
    /* renamed from: e */
    public Object mo24759e() {
        return m20422P();
    }

    @Override // sd.InterfaceC11159s
    /* renamed from: n */
    public boolean mo24803n(Object obj) {
        return m20441i0(obj);
    }

    @Override // sd.InterfaceC11138m0
    /* renamed from: z */
    public Object mo24760z(InterfaceC11588c interfaceC11588c) throws Throwable {
        Object objM20462x = m20462x(interfaceC11588c);
        AbstractC11725a.m25952f();
        return objM20462x;
    }
}
