package p206q0;

import p117i1.C7648g;
import p162m0.InterfaceC8537b;
import p184o0.InterfaceC8690j;
import p206q0.InterfaceC8873h;

/* renamed from: q0.g */
/* loaded from: classes3.dex */
public class C8872g extends C7648g implements InterfaceC8873h {

    /* renamed from: e */
    public InterfaceC8873h.a f15085e;

    public C8872g(long j10) {
        super(j10);
    }

    @Override // p206q0.InterfaceC8873h
    /* renamed from: a */
    public void mo14877a(int i10) {
        if (i10 >= 40) {
            m12668b();
        } else if (i10 >= 20 || i10 == 15) {
            m12676m(m12671h() / 2);
        }
    }

    @Override // p206q0.InterfaceC8873h
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC8690j mo14878c(InterfaceC8537b interfaceC8537b, InterfaceC8690j interfaceC8690j) {
        return (InterfaceC8690j) super.m12674k(interfaceC8537b, interfaceC8690j);
    }

    @Override // p206q0.InterfaceC8873h
    /* renamed from: d */
    public void mo14879d(InterfaceC8873h.a aVar) {
        this.f15085e = aVar;
    }

    @Override // p206q0.InterfaceC8873h
    /* renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC8690j mo14880e(InterfaceC8537b interfaceC8537b) {
        return (InterfaceC8690j) super.m12675l(interfaceC8537b);
    }

    @Override // p117i1.C7648g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo12672i(InterfaceC8690j interfaceC8690j) {
        return interfaceC8690j == null ? super.mo12672i(null) : interfaceC8690j.getSize();
    }

    @Override // p117i1.C7648g
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo12673j(InterfaceC8537b interfaceC8537b, InterfaceC8690j interfaceC8690j) {
        InterfaceC8873h.a aVar = this.f15085e;
        if (aVar == null || interfaceC8690j == null) {
            return;
        }
        aVar.mo3533b(interfaceC8690j);
    }
}
