package p081j0;

import p016b1.C4405g;
import p053f0.InterfaceC6283b;
import p067h0.InterfaceC6440j;
import p081j0.InterfaceC6580h;

/* renamed from: j0.g */
/* loaded from: classes3.dex */
public class C6579g extends C4405g implements InterfaceC6580h {

    /* renamed from: e */
    public InterfaceC6580h.a f8530e;

    public C6579g(long j6) {
        super(j6);
    }

    @Override // p081j0.InterfaceC6580h
    /* renamed from: a */
    public void mo7448a(int i6) {
        if (i6 >= 40) {
            m1423b();
        } else if (i6 >= 20 || i6 == 15) {
            m1431m(m1426h() / 2);
        }
    }

    @Override // p081j0.InterfaceC6580h
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC6440j mo7449c(InterfaceC6283b interfaceC6283b) {
        return (InterfaceC6440j) super.m1430l(interfaceC6283b);
    }

    @Override // p081j0.InterfaceC6580h
    /* renamed from: d */
    public void mo7450d(InterfaceC6580h.a aVar) {
        this.f8530e = aVar;
    }

    @Override // p081j0.InterfaceC6580h
    /* renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC6440j mo7451e(InterfaceC6283b interfaceC6283b, InterfaceC6440j interfaceC6440j) {
        return (InterfaceC6440j) super.m1429k(interfaceC6283b, interfaceC6440j);
    }

    @Override // p016b1.C4405g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo1427i(InterfaceC6440j interfaceC6440j) {
        return interfaceC6440j == null ? super.mo1427i(null) : interfaceC6440j.getSize();
    }

    @Override // p016b1.C4405g
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1428j(InterfaceC6283b interfaceC6283b, InterfaceC6440j interfaceC6440j) {
        InterfaceC6580h.a aVar = this.f8530e;
        if (aVar == null || interfaceC6440j == null) {
            return;
        }
        aVar.mo2712a(interfaceC6440j);
    }
}
