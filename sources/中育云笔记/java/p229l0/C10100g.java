package p229l0;

import p109d1.C8906g;
import p168h0.InterfaceC9435b;
import p198j0.InterfaceC9657j;
import p229l0.InterfaceC10101h;

/* renamed from: l0.g */
/* loaded from: classes3.dex */
public class C10100g extends C8906g implements InterfaceC10101h {

    /* renamed from: e */
    public InterfaceC10101h.a f24129e;

    public C10100g(long j10) {
        super(j10);
    }

    @Override // p229l0.InterfaceC10101h
    /* renamed from: a */
    public void mo21115a(int i10) {
        if (i10 >= 40) {
            m17453b();
        } else if (i10 >= 20 || i10 == 15) {
            m17461m(m17456h() / 2);
        }
    }

    @Override // p229l0.InterfaceC10101h
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC9657j mo21116c(InterfaceC9435b interfaceC9435b, InterfaceC9657j interfaceC9657j) {
        return (InterfaceC9657j) super.m17459k(interfaceC9435b, interfaceC9657j);
    }

    @Override // p229l0.InterfaceC10101h
    /* renamed from: d */
    public void mo21117d(InterfaceC10101h.a aVar) {
        this.f24129e = aVar;
    }

    @Override // p229l0.InterfaceC10101h
    /* renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC9657j mo21118e(InterfaceC9435b interfaceC9435b) {
        return (InterfaceC9657j) super.m17460l(interfaceC9435b);
    }

    @Override // p109d1.C8906g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo17457i(InterfaceC9657j interfaceC9657j) {
        return interfaceC9657j == null ? super.mo17457i(null) : interfaceC9657j.getSize();
    }

    @Override // p109d1.C8906g
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo17458j(InterfaceC9435b interfaceC9435b, InterfaceC9657j interfaceC9657j) {
        InterfaceC10101h.a aVar = this.f24129e;
        if (aVar == null || interfaceC9657j == null) {
            return;
        }
        aVar.mo4183b(interfaceC9657j);
    }
}
