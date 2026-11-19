package p102o;

import p062g0.C3746f;
import p076j.InterfaceC3792b;
import p093m.InterfaceC4361j;
import p102o.InterfaceC4417h;

/* renamed from: o.g */
/* loaded from: classes2.dex */
public class C4416g extends C3746f implements InterfaceC4417h {

    /* renamed from: e */
    public InterfaceC4417h.a f4961e;

    public C4416g(long j4) {
        super(j4);
    }

    @Override // p102o.InterfaceC4417h
    /* renamed from: a */
    public void mo5506a(int i4) {
        if (i4 >= 40) {
            m4753b();
        } else if (i4 >= 20 || i4 == 15) {
            m4761m(m4756h() / 2);
        }
    }

    @Override // p102o.InterfaceC4417h
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC4361j mo5507c(InterfaceC3792b interfaceC3792b, InterfaceC4361j interfaceC4361j) {
        return (InterfaceC4361j) super.m4759k(interfaceC3792b, interfaceC4361j);
    }

    @Override // p102o.InterfaceC4417h
    /* renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC4361j mo5508d(InterfaceC3792b interfaceC3792b) {
        return (InterfaceC4361j) super.m4760l(interfaceC3792b);
    }

    @Override // p102o.InterfaceC4417h
    /* renamed from: e */
    public void mo5509e(InterfaceC4417h.a aVar) {
        this.f4961e = aVar;
    }

    @Override // p062g0.C3746f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo4757i(InterfaceC4361j interfaceC4361j) {
        return interfaceC4361j == null ? super.mo4757i(null) : interfaceC4361j.getSize();
    }

    @Override // p062g0.C3746f
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo4758j(InterfaceC3792b interfaceC3792b, InterfaceC4361j interfaceC4361j) {
        InterfaceC4417h.a aVar = this.f4961e;
        if (aVar == null || interfaceC4361j == null) {
            return;
        }
        aVar.mo1859a(interfaceC4361j);
    }
}
