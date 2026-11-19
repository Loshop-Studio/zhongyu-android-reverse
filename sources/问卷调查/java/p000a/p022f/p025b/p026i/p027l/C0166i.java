package p000a.p022f.p025b.p026i.p027l;

import java.util.Iterator;
import p000a.p022f.p025b.p026i.C0147a;
import p000a.p022f.p025b.p026i.C0150d;
import p000a.p022f.p025b.p026i.p027l.C0163f;

/* renamed from: a.f.b.i.l.i */
/* loaded from: classes.dex */
public class C0166i extends AbstractC0170m {
    public C0166i(C0150d c0150d) {
        super(c0150d);
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m, p000a.p022f.p025b.p026i.p027l.InterfaceC0161d
    /* renamed from: a */
    public void mo627a(InterfaceC0161d interfaceC0161d) {
        C0147a c0147a = (C0147a) this.f1208b;
        int i = c0147a.f1032g0;
        int i2 = 0;
        Iterator<C0163f> it = this.f1214h.f1190l.iterator();
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = it.next().f1185g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.f1214h.mo643c(i3 + c0147a.f1034i0);
        } else {
            this.f1214h.mo643c(i2 + c0147a.f1034i0);
        }
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: d */
    public void mo628d() {
        AbstractC0170m abstractC0170m;
        C0150d c0150d = this.f1208b;
        if (c0150d instanceof C0147a) {
            C0163f c0163f = this.f1214h;
            c0163f.f1180b = true;
            C0147a c0147a = (C0147a) c0150d;
            int i = c0147a.f1032g0;
            boolean z = c0147a.f1033h0;
            int i2 = 0;
            if (i == 0) {
                c0163f.f1183e = C0163f.a.LEFT;
                while (i2 < c0147a.f1153f0) {
                    C0150d c0150d2 = c0147a.f1152e0[i2];
                    if (z || c0150d2.f1095X != 8) {
                        C0163f c0163f2 = c0150d2.f1104d.f1214h;
                        c0163f2.f1189k.add(this.f1214h);
                        this.f1214h.f1190l.add(c0163f2);
                    }
                    i2++;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        c0163f.f1183e = C0163f.a.TOP;
                        while (i2 < c0147a.f1153f0) {
                            C0150d c0150d3 = c0147a.f1152e0[i2];
                            if (z || c0150d3.f1095X != 8) {
                                C0163f c0163f3 = c0150d3.f1106e.f1214h;
                                c0163f3.f1189k.add(this.f1214h);
                                this.f1214h.f1190l.add(c0163f3);
                            }
                            i2++;
                        }
                    } else {
                        if (i != 3) {
                            return;
                        }
                        c0163f.f1183e = C0163f.a.BOTTOM;
                        while (i2 < c0147a.f1153f0) {
                            C0150d c0150d4 = c0147a.f1152e0[i2];
                            if (z || c0150d4.f1095X != 8) {
                                C0163f c0163f4 = c0150d4.f1106e.f1215i;
                                c0163f4.f1189k.add(this.f1214h);
                                this.f1214h.f1190l.add(c0163f4);
                            }
                            i2++;
                        }
                    }
                    m645m(this.f1208b.f1106e.f1214h);
                    abstractC0170m = this.f1208b.f1106e;
                    m645m(abstractC0170m.f1215i);
                }
                c0163f.f1183e = C0163f.a.RIGHT;
                while (i2 < c0147a.f1153f0) {
                    C0150d c0150d5 = c0147a.f1152e0[i2];
                    if (z || c0150d5.f1095X != 8) {
                        C0163f c0163f5 = c0150d5.f1104d.f1215i;
                        c0163f5.f1189k.add(this.f1214h);
                        this.f1214h.f1190l.add(c0163f5);
                    }
                    i2++;
                }
            }
            m645m(this.f1208b.f1104d.f1214h);
            abstractC0170m = this.f1208b.f1104d;
            m645m(abstractC0170m.f1215i);
        }
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: e */
    public void mo629e() {
        C0150d c0150d = this.f1208b;
        if (c0150d instanceof C0147a) {
            int i = ((C0147a) c0150d).f1032g0;
            if (i == 0 || i == 1) {
                c0150d.f1087P = this.f1214h.f1185g;
            } else {
                c0150d.f1088Q = this.f1214h.f1185g;
            }
        }
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: f */
    public void mo630f() {
        this.f1209c = null;
        this.f1214h.m642b();
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: k */
    public boolean mo632k() {
        return false;
    }

    /* renamed from: m */
    public final void m645m(C0163f c0163f) {
        this.f1214h.f1189k.add(c0163f);
        c0163f.f1190l.add(this.f1214h);
    }
}
