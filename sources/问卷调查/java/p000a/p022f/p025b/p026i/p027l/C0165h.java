package p000a.p022f.p025b.p026i.p027l;

import p000a.p022f.p025b.p026i.C0150d;
import p000a.p022f.p025b.p026i.C0152f;

/* renamed from: a.f.b.i.l.h */
/* loaded from: classes.dex */
public class C0165h extends AbstractC0170m {
    public C0165h(C0150d c0150d) {
        super(c0150d);
        c0150d.f1104d.mo630f();
        c0150d.f1106e.mo630f();
        this.f1212f = ((C0152f) c0150d).f1151i0;
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m, p000a.p022f.p025b.p026i.p027l.InterfaceC0161d
    /* renamed from: a */
    public void mo627a(InterfaceC0161d interfaceC0161d) {
        C0163f c0163f = this.f1214h;
        if (c0163f.f1181c && !c0163f.f1188j) {
            this.f1214h.mo643c((int) ((c0163f.f1190l.get(0).f1185g * ((C0152f) this.f1208b).f1147e0) + 0.5f));
        }
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: d */
    public void mo628d() {
        AbstractC0170m abstractC0170m;
        C0150d c0150d = this.f1208b;
        C0152f c0152f = (C0152f) c0150d;
        int i = c0152f.f1148f0;
        int i2 = c0152f.f1149g0;
        if (c0152f.f1151i0 == 1) {
            C0163f c0163f = this.f1214h;
            if (i != -1) {
                c0163f.f1190l.add(c0150d.f1082K.f1104d.f1214h);
                this.f1208b.f1082K.f1104d.f1214h.f1189k.add(this.f1214h);
                this.f1214h.f1184f = i;
            } else if (i2 != -1) {
                c0163f.f1190l.add(c0150d.f1082K.f1104d.f1215i);
                this.f1208b.f1082K.f1104d.f1215i.f1189k.add(this.f1214h);
                this.f1214h.f1184f = -i2;
            } else {
                c0163f.f1180b = true;
                c0163f.f1190l.add(c0150d.f1082K.f1104d.f1215i);
                this.f1208b.f1082K.f1104d.f1215i.f1189k.add(this.f1214h);
            }
            m644m(this.f1208b.f1104d.f1214h);
            abstractC0170m = this.f1208b.f1104d;
        } else {
            C0163f c0163f2 = this.f1214h;
            if (i != -1) {
                c0163f2.f1190l.add(c0150d.f1082K.f1106e.f1214h);
                this.f1208b.f1082K.f1106e.f1214h.f1189k.add(this.f1214h);
                this.f1214h.f1184f = i;
            } else if (i2 != -1) {
                c0163f2.f1190l.add(c0150d.f1082K.f1106e.f1215i);
                this.f1208b.f1082K.f1106e.f1215i.f1189k.add(this.f1214h);
                this.f1214h.f1184f = -i2;
            } else {
                c0163f2.f1180b = true;
                c0163f2.f1190l.add(c0150d.f1082K.f1106e.f1215i);
                this.f1208b.f1082K.f1106e.f1215i.f1189k.add(this.f1214h);
            }
            m644m(this.f1208b.f1106e.f1214h);
            abstractC0170m = this.f1208b.f1106e;
        }
        m644m(abstractC0170m.f1215i);
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: e */
    public void mo629e() {
        C0150d c0150d = this.f1208b;
        if (((C0152f) c0150d).f1151i0 == 1) {
            c0150d.f1087P = this.f1214h.f1185g;
        } else {
            c0150d.f1088Q = this.f1214h.f1185g;
        }
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: f */
    public void mo630f() {
        this.f1214h.m642b();
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: k */
    public boolean mo632k() {
        return false;
    }

    /* renamed from: m */
    public final void m644m(C0163f c0163f) {
        this.f1214h.f1189k.add(c0163f);
        c0163f.f1190l.add(this.f1214h);
    }
}
