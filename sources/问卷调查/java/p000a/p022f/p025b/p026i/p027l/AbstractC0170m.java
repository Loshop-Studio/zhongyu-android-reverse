package p000a.p022f.p025b.p026i.p027l;

import p000a.p022f.p025b.p026i.C0149c;
import p000a.p022f.p025b.p026i.C0150d;

/* renamed from: a.f.b.i.l.m */
/* loaded from: classes.dex */
public abstract class AbstractC0170m implements InterfaceC0161d {

    /* renamed from: a */
    public int f1207a;

    /* renamed from: b */
    public C0150d f1208b;

    /* renamed from: c */
    public C0168k f1209c;

    /* renamed from: d */
    public C0150d.a f1210d;

    /* renamed from: e */
    public C0164g f1211e = new C0164g(this);

    /* renamed from: f */
    public int f1212f = 0;

    /* renamed from: g */
    public boolean f1213g = false;

    /* renamed from: h */
    public C0163f f1214h = new C0163f(this);

    /* renamed from: i */
    public C0163f f1215i = new C0163f(this);

    /* renamed from: j */
    public a f1216j = a.NONE;

    /* renamed from: a.f.b.i.l.m$a */
    public enum a {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC0170m(C0150d c0150d) {
        this.f1208b = c0150d;
    }

    @Override // p000a.p022f.p025b.p026i.p027l.InterfaceC0161d
    /* renamed from: a */
    public void mo627a(InterfaceC0161d interfaceC0161d) {
    }

    /* renamed from: b */
    public final void m651b(C0163f c0163f, C0163f c0163f2, int i) {
        c0163f.f1190l.add(c0163f2);
        c0163f.f1184f = i;
        c0163f2.f1189k.add(c0163f);
    }

    /* renamed from: c */
    public final void m652c(C0163f c0163f, C0163f c0163f2, int i, C0164g c0164g) {
        c0163f.f1190l.add(c0163f2);
        c0163f.f1190l.add(this.f1211e);
        c0163f.f1186h = i;
        c0163f.f1187i = c0164g;
        c0163f2.f1189k.add(c0163f);
        c0164g.f1189k.add(c0163f);
    }

    /* renamed from: d */
    public abstract void mo628d();

    /* renamed from: e */
    public abstract void mo629e();

    /* renamed from: f */
    public abstract void mo630f();

    /* renamed from: g */
    public final int m653g(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            C0150d c0150d = this.f1208b;
            int i3 = c0150d.f1115n;
            iMax = Math.max(c0150d.f1114m, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            C0150d c0150d2 = this.f1208b;
            int i4 = c0150d2.f1118q;
            iMax = Math.max(c0150d2.f1117p, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    /* renamed from: h */
    public final C0163f m654h(C0149c c0149c) {
        AbstractC0170m abstractC0170m;
        AbstractC0170m abstractC0170m2;
        C0149c c0149c2 = c0149c.f1058d;
        if (c0149c2 == null) {
            return null;
        }
        C0150d c0150d = c0149c2.f1056b;
        int iOrdinal = c0149c2.f1057c.ordinal();
        if (iOrdinal == 1) {
            abstractC0170m = c0150d.f1104d;
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    abstractC0170m2 = c0150d.f1104d;
                } else {
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            return null;
                        }
                        return c0150d.f1106e.f1205k;
                    }
                    abstractC0170m2 = c0150d.f1106e;
                }
                return abstractC0170m2.f1215i;
            }
            abstractC0170m = c0150d.f1106e;
        }
        return abstractC0170m.f1214h;
    }

    /* renamed from: i */
    public final C0163f m655i(C0149c c0149c, int i) {
        C0149c c0149c2 = c0149c.f1058d;
        if (c0149c2 == null) {
            return null;
        }
        C0150d c0150d = c0149c2.f1056b;
        AbstractC0170m abstractC0170m = i == 0 ? c0150d.f1104d : c0150d.f1106e;
        int iOrdinal = c0149c2.f1057c.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return abstractC0170m.f1214h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return abstractC0170m.f1215i;
        }
        return null;
    }

    /* renamed from: j */
    public long mo631j() {
        if (this.f1211e.f1188j) {
            return r0.f1185g;
        }
        return 0L;
    }

    /* renamed from: k */
    public abstract boolean mo632k();

    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m656l(p000a.p022f.p025b.p026i.C0149c r18, p000a.p022f.p025b.p026i.C0149c r19, int r20) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p025b.p026i.p027l.AbstractC0170m.m656l(a.f.b.i.c, a.f.b.i.c, int):void");
    }
}
