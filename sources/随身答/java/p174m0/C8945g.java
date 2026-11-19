package p174m0;

import p091e1.C7834f;
import p122h0.InterfaceC8082b;
import p152k0.InterfaceC8259j;
import p174m0.InterfaceC8946h;

/* renamed from: m0.g */
/* loaded from: classes3.dex */
public class C8945g extends C7834f implements InterfaceC8946h {

    /* renamed from: e */
    public InterfaceC8946h.a f14989e;

    public C8945g(long j9) {
        super(j9);
    }

    @Override // p174m0.InterfaceC8946h
    /* renamed from: a */
    public void mo14259a(int i9) {
        if (i9 >= 40) {
            m12241b();
        } else if (i9 >= 20 || i9 == 15) {
            m12249m(m12244h() / 2);
        }
    }

    @Override // p174m0.InterfaceC8946h
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC8259j mo14260c(InterfaceC8082b interfaceC8082b) {
        return (InterfaceC8259j) super.m12248l(interfaceC8082b);
    }

    @Override // p174m0.InterfaceC8946h
    /* renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC8259j mo14261d(InterfaceC8082b interfaceC8082b, InterfaceC8259j interfaceC8259j) {
        return (InterfaceC8259j) super.m12247k(interfaceC8082b, interfaceC8259j);
    }

    @Override // p174m0.InterfaceC8946h
    /* renamed from: e */
    public void mo14262e(InterfaceC8946h.a aVar) {
        this.f14989e = aVar;
    }

    @Override // p091e1.C7834f
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo12245i(InterfaceC8259j interfaceC8259j) {
        return interfaceC8259j == null ? super.mo12245i(null) : interfaceC8259j.getSize();
    }

    @Override // p091e1.C7834f
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo12246j(InterfaceC8082b interfaceC8082b, InterfaceC8259j interfaceC8259j) {
        InterfaceC8946h.a aVar = this.f14989e;
        if (aVar == null || interfaceC8259j == null) {
            return;
        }
        aVar.mo3187d(interfaceC8259j);
    }
}
