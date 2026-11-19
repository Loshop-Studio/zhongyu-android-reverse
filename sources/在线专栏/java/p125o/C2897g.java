package p125o;

import p125o.C2896f;

/* renamed from: o.g */
/* loaded from: classes.dex */
class C2897g extends C2896f {

    /* renamed from: m */
    public int f11347m;

    public C2897g(AbstractC2903m abstractC2903m) {
        super(abstractC2903m);
        if (abstractC2903m instanceof C2900j) {
            this.f11330e = C2896f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f11330e = C2896f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // p125o.C2896f
    /* renamed from: d */
    public void mo9952d(int i4) {
        if (this.f11335j) {
            return;
        }
        this.f11335j = true;
        this.f11332g = i4;
        for (InterfaceC2894d interfaceC2894d : this.f11336k) {
            interfaceC2894d.mo9930a(interfaceC2894d);
        }
    }
}
