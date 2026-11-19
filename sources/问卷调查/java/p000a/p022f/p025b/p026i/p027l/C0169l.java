package p000a.p022f.p025b.p026i.p027l;

import p000a.p022f.p025b.p026i.C0150d;
import p000a.p022f.p025b.p026i.p027l.C0163f;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.f.b.i.l.l */
/* loaded from: classes.dex */
public class C0169l extends AbstractC0170m {

    /* renamed from: k */
    public C0163f f1205k;

    /* renamed from: l */
    public C0164g f1206l;

    public C0169l(C0150d c0150d) {
        super(c0150d);
        C0163f c0163f = new C0163f(this);
        this.f1205k = c0163f;
        this.f1206l = null;
        this.f1214h.f1183e = C0163f.a.TOP;
        this.f1215i.f1183e = C0163f.a.BOTTOM;
        c0163f.f1183e = C0163f.a.BASELINE;
        this.f1212f = 1;
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m, p000a.p022f.p025b.p026i.p027l.InterfaceC0161d
    /* renamed from: a */
    public void mo627a(InterfaceC0161d interfaceC0161d) {
        float f2;
        float f3;
        float f4;
        int i;
        C0150d.a aVar = C0150d.a.MATCH_CONSTRAINT;
        int iOrdinal = this.f1216j.ordinal();
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal == 3) {
            C0150d c0150d = this.f1208b;
            m656l(c0150d.f1127z, c0150d.f1073B, 1);
            return;
        }
        C0164g c0164g = this.f1211e;
        if (c0164g.f1181c && !c0164g.f1188j && this.f1210d == aVar) {
            C0150d c0150d2 = this.f1208b;
            int i2 = c0150d2.f1112k;
            if (i2 == 2) {
                C0150d c0150d3 = c0150d2.f1082K;
                if (c0150d3 != null) {
                    C0164g c0164g2 = c0150d3.f1106e.f1211e;
                    if (c0164g2.f1188j) {
                        f2 = c0150d2.f1119r;
                        f3 = c0164g2.f1185g;
                        f4 = f3 * f2;
                    }
                }
            } else if (i2 == 3) {
                C0164g c0164g3 = c0150d2.f1104d.f1211e;
                if (c0164g3.f1188j) {
                    int i3 = c0150d2.f1086O;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = c0164g3.f1185g;
                            f2 = c0150d2.f1085N;
                            f4 = f3 * f2;
                        } else if (i3 != 1) {
                            i = 0;
                            c0164g.mo643c(i);
                        }
                    }
                    f4 = c0164g3.f1185g / c0150d2.f1085N;
                }
            }
            i = (int) (f4 + 0.5f);
            c0164g.mo643c(i);
        }
        C0163f c0163f = this.f1214h;
        if (c0163f.f1181c) {
            C0163f c0163f2 = this.f1215i;
            if (c0163f2.f1181c) {
                if (c0163f.f1188j && c0163f2.f1188j && this.f1211e.f1188j) {
                    return;
                }
                if (!this.f1211e.f1188j && this.f1210d == aVar) {
                    C0150d c0150d4 = this.f1208b;
                    if (c0150d4.f1111j == 0 && !c0150d4.m609t()) {
                        C0163f c0163f3 = this.f1214h.f1190l.get(0);
                        C0163f c0163f4 = this.f1215i.f1190l.get(0);
                        int i4 = c0163f3.f1185g;
                        C0163f c0163f5 = this.f1214h;
                        int i5 = i4 + c0163f5.f1184f;
                        int i6 = c0163f4.f1185g + this.f1215i.f1184f;
                        c0163f5.mo643c(i5);
                        this.f1215i.mo643c(i6);
                        this.f1211e.mo643c(i6 - i5);
                        return;
                    }
                }
                if (!this.f1211e.f1188j && this.f1210d == aVar && this.f1207a == 1 && this.f1214h.f1190l.size() > 0 && this.f1215i.f1190l.size() > 0) {
                    C0163f c0163f6 = this.f1214h.f1190l.get(0);
                    int i7 = (this.f1215i.f1190l.get(0).f1185g + this.f1215i.f1184f) - (c0163f6.f1185g + this.f1214h.f1184f);
                    C0164g c0164g4 = this.f1211e;
                    int i8 = c0164g4.f1200m;
                    if (i7 < i8) {
                        c0164g4.mo643c(i7);
                    } else {
                        c0164g4.mo643c(i8);
                    }
                }
                if (this.f1211e.f1188j && this.f1214h.f1190l.size() > 0 && this.f1215i.f1190l.size() > 0) {
                    C0163f c0163f7 = this.f1214h.f1190l.get(0);
                    C0163f c0163f8 = this.f1215i.f1190l.get(0);
                    int i9 = c0163f7.f1185g;
                    C0163f c0163f9 = this.f1214h;
                    int i10 = c0163f9.f1184f + i9;
                    int i11 = c0163f8.f1185g;
                    int i12 = this.f1215i.f1184f + i11;
                    float f5 = this.f1208b.f1093V;
                    if (c0163f7 == c0163f8) {
                        f5 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    c0163f9.mo643c((int) ((((i11 - i9) - this.f1211e.f1185g) * f5) + i9 + 0.5f));
                    this.f1215i.mo643c(this.f1214h.f1185g + this.f1211e.f1185g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x031c, code lost:
    
        if (r10.f1208b.f1124w != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x031e, code lost:
    
        r0 = r10.f1205k;
        r1 = r10.f1214h;
        r2 = r10.f1206l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03b1, code lost:
    
        if (r10.f1208b.f1124w != false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0421 A[PHI: r0
      0x0421: PHI (r0v27 a.f.b.i.l.j) = (r0v14 a.f.b.i.l.j), (r0v41 a.f.b.i.l.j) binds: [B:158:0x041f, B:132:0x0378] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo628d() {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p025b.p026i.p027l.C0169l.mo628d():void");
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: e */
    public void mo629e() {
        C0163f c0163f = this.f1214h;
        if (c0163f.f1188j) {
            this.f1208b.f1088Q = c0163f.f1185g;
        }
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: f */
    public void mo630f() {
        this.f1209c = null;
        this.f1214h.m642b();
        this.f1215i.m642b();
        this.f1205k.m642b();
        this.f1211e.m642b();
        this.f1213g = false;
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: k */
    public boolean mo632k() {
        return this.f1210d != C0150d.a.MATCH_CONSTRAINT || this.f1208b.f1112k == 0;
    }

    /* renamed from: m */
    public void m650m() {
        this.f1213g = false;
        this.f1214h.m642b();
        this.f1214h.f1188j = false;
        this.f1215i.m642b();
        this.f1215i.f1188j = false;
        this.f1205k.m642b();
        this.f1205k.f1188j = false;
        this.f1211e.f1188j = false;
    }

    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g("VerticalRun ");
        sbM2079g.append(this.f1208b.f1096Y);
        return sbM2079g.toString();
    }
}
