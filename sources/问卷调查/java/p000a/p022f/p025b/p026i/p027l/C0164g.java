package p000a.p022f.p025b.p026i.p027l;

import p000a.p022f.p025b.p026i.p027l.C0163f;

/* renamed from: a.f.b.i.l.g */
/* loaded from: classes.dex */
public class C0164g extends C0163f {

    /* renamed from: m */
    public int f1200m;

    public C0164g(AbstractC0170m abstractC0170m) {
        super(abstractC0170m);
        this.f1183e = abstractC0170m instanceof C0167j ? C0163f.a.HORIZONTAL_DIMENSION : C0163f.a.VERTICAL_DIMENSION;
    }

    @Override // p000a.p022f.p025b.p026i.p027l.C0163f
    /* renamed from: c */
    public void mo643c(int i) {
        if (this.f1188j) {
            return;
        }
        this.f1188j = true;
        this.f1185g = i;
        for (InterfaceC0161d interfaceC0161d : this.f1189k) {
            interfaceC0161d.mo627a(interfaceC0161d);
        }
    }
}
