package p000a.p022f.p025b.p026i;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p000a.p005b.C0013a;
import p000a.p022f.p025b.C0142d;
import p000a.p022f.p025b.p026i.C0150d;
import p000a.p022f.p025b.p026i.p027l.AbstractC0170m;
import p000a.p022f.p025b.p026i.p027l.C0159b;
import p000a.p022f.p025b.p026i.p027l.C0160c;
import p000a.p022f.p025b.p026i.p027l.C0162e;
import p000a.p022f.p025b.p026i.p027l.C0164g;

/* renamed from: a.f.b.i.e */
/* loaded from: classes.dex */
public class C0151e extends C0157k {

    /* renamed from: k0 */
    public int f1138k0;

    /* renamed from: l0 */
    public int f1139l0;

    /* renamed from: f0 */
    public C0159b f1133f0 = new C0159b(this);

    /* renamed from: g0 */
    public C0162e f1134g0 = new C0162e(this);

    /* renamed from: h0 */
    public C0159b.b f1135h0 = null;

    /* renamed from: i0 */
    public boolean f1136i0 = false;

    /* renamed from: j0 */
    public C0142d f1137j0 = new C0142d();

    /* renamed from: m0 */
    public int f1140m0 = 0;

    /* renamed from: n0 */
    public int f1141n0 = 0;

    /* renamed from: o0 */
    public C0148b[] f1142o0 = new C0148b[4];

    /* renamed from: p0 */
    public C0148b[] f1143p0 = new C0148b[4];

    /* renamed from: q0 */
    public int f1144q0 = 263;

    /* renamed from: r0 */
    public boolean f1145r0 = false;

    /* renamed from: s0 */
    public boolean f1146s0 = false;

    @Override // p000a.p022f.p025b.p026i.C0150d
    /* renamed from: C */
    public void mo591C(boolean z, boolean z2) {
        super.mo591C(z, z2);
        int size = this.f1155e0.size();
        for (int i = 0; i < size; i++) {
            this.f1155e0.get(i).mo591C(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0225 A[PHI: r0 r15
      0x0225: PHI (r0v23 boolean) = (r0v22 boolean), (r0v25 boolean), (r0v25 boolean), (r0v25 boolean) binds: [B:98:0x01ef, B:106:0x020f, B:107:0x0211, B:109:0x0217] A[DONT_GENERATE, DONT_INLINE]
      0x0225: PHI (r15v6 boolean) = (r15v5 boolean), (r15v8 boolean), (r15v8 boolean), (r15v8 boolean) binds: [B:98:0x01ef, B:106:0x020f, B:107:0x0211, B:109:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f1  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    @Override // p000a.p022f.p025b.p026i.C0157k
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo616E() {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p025b.p026i.C0151e.mo616E():void");
    }

    /* renamed from: F */
    public void m617F(C0150d c0150d, int i) {
        if (i == 0) {
            int i2 = this.f1140m0 + 1;
            C0148b[] c0148bArr = this.f1143p0;
            if (i2 >= c0148bArr.length) {
                this.f1143p0 = (C0148b[]) Arrays.copyOf(c0148bArr, c0148bArr.length * 2);
            }
            C0148b[] c0148bArr2 = this.f1143p0;
            int i3 = this.f1140m0;
            c0148bArr2[i3] = new C0148b(c0150d, 0, this.f1136i0);
            this.f1140m0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f1141n0 + 1;
            C0148b[] c0148bArr3 = this.f1142o0;
            if (i4 >= c0148bArr3.length) {
                this.f1142o0 = (C0148b[]) Arrays.copyOf(c0148bArr3, c0148bArr3.length * 2);
            }
            C0148b[] c0148bArr4 = this.f1142o0;
            int i5 = this.f1141n0;
            c0148bArr4[i5] = new C0148b(c0150d, 1, this.f1136i0);
            this.f1141n0 = i5 + 1;
        }
    }

    /* renamed from: G */
    public boolean m618G(C0142d c0142d) {
        C0150d.a aVar = C0150d.a.FIXED;
        C0150d.a aVar2 = C0150d.a.WRAP_CONTENT;
        mo581b(c0142d);
        int size = this.f1155e0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C0150d c0150d = this.f1155e0.get(i);
            boolean[] zArr = c0150d.f1080I;
            zArr[0] = false;
            zArr[1] = false;
            if (c0150d instanceof C0147a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C0150d c0150d2 = this.f1155e0.get(i2);
                if (c0150d2 instanceof C0147a) {
                    C0147a c0147a = (C0147a) c0150d2;
                    for (int i3 = 0; i3 < c0147a.f1153f0; i3++) {
                        C0150d c0150d3 = c0147a.f1152e0[i3];
                        int i4 = c0147a.f1032g0;
                        if (i4 == 0 || i4 == 1) {
                            c0150d3.f1080I[0] = true;
                        } else if (i4 == 2 || i4 == 3) {
                            c0150d3.f1080I[1] = true;
                        }
                    }
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            C0150d c0150d4 = this.f1155e0.get(i5);
            Objects.requireNonNull(c0150d4);
            if ((c0150d4 instanceof C0156j) || (c0150d4 instanceof C0152f)) {
                c0150d4.mo581b(c0142d);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            C0150d c0150d5 = this.f1155e0.get(i6);
            if (c0150d5 instanceof C0151e) {
                C0150d.a[] aVarArr = c0150d5.f1081J;
                C0150d.a aVar3 = aVarArr[0];
                C0150d.a aVar4 = aVarArr[1];
                if (aVar3 == aVar2) {
                    aVarArr[0] = aVar;
                }
                if (aVar4 == aVar2) {
                    aVarArr[1] = aVar;
                }
                c0150d5.mo581b(c0142d);
                if (aVar3 == aVar2) {
                    c0150d5.m613x(aVar3);
                }
                if (aVar4 == aVar2) {
                    c0150d5.m589A(aVar4);
                }
            } else {
                C0150d.a aVar5 = C0150d.a.MATCH_PARENT;
                c0150d5.f1109h = -1;
                c0150d5.f1110i = -1;
                if (this.f1081J[0] != aVar2 && c0150d5.f1081J[0] == aVar5) {
                    int i7 = c0150d5.f1126y.f1059e;
                    int iM604o = m604o() - c0150d5.f1072A.f1059e;
                    C0149c c0149c = c0150d5.f1126y;
                    c0149c.f1061g = c0142d.m560l(c0149c);
                    C0149c c0149c2 = c0150d5.f1072A;
                    c0149c2.f1061g = c0142d.m560l(c0149c2);
                    c0142d.m553e(c0150d5.f1126y.f1061g, i7);
                    c0142d.m553e(c0150d5.f1072A.f1061g, iM604o);
                    c0150d5.f1109h = 2;
                    c0150d5.f1087P = i7;
                    int i8 = iM604o - i7;
                    c0150d5.f1083L = i8;
                    int i9 = c0150d5.f1090S;
                    if (i8 < i9) {
                        c0150d5.f1083L = i9;
                    }
                }
                if (this.f1081J[1] != aVar2 && c0150d5.f1081J[1] == aVar5) {
                    int i10 = c0150d5.f1127z.f1059e;
                    int iM598i = m598i() - c0150d5.f1073B.f1059e;
                    C0149c c0149c3 = c0150d5.f1127z;
                    c0149c3.f1061g = c0142d.m560l(c0149c3);
                    C0149c c0149c4 = c0150d5.f1073B;
                    c0149c4.f1061g = c0142d.m560l(c0149c4);
                    c0142d.m553e(c0150d5.f1127z.f1061g, i10);
                    c0142d.m553e(c0150d5.f1073B.f1061g, iM598i);
                    if (c0150d5.f1089R > 0 || c0150d5.f1095X == 8) {
                        C0149c c0149c5 = c0150d5.f1074C;
                        c0149c5.f1061g = c0142d.m560l(c0149c5);
                        c0142d.m553e(c0150d5.f1074C.f1061g, c0150d5.f1089R + i10);
                    }
                    c0150d5.f1110i = 2;
                    c0150d5.f1088Q = i10;
                    int i11 = iM598i - i10;
                    c0150d5.f1084M = i11;
                    int i12 = c0150d5.f1091T;
                    if (i11 < i12) {
                        c0150d5.f1084M = i12;
                    }
                }
                if (!((c0150d5 instanceof C0156j) || (c0150d5 instanceof C0152f))) {
                    c0150d5.mo581b(c0142d);
                }
            }
        }
        if (this.f1140m0 > 0) {
            C0013a.m10a(this, c0142d, 0);
        }
        if (this.f1141n0 > 0) {
            C0013a.m10a(this, c0142d, 1);
        }
        return true;
    }

    /* renamed from: H */
    public boolean m619H(boolean z, int i) {
        C0164g c0164g;
        int i2;
        boolean z2;
        C0164g c0164g2;
        int iM598i;
        C0162e c0162e = this.f1134g0;
        C0150d.a aVar = C0150d.a.MATCH_PARENT;
        C0150d.a aVar2 = C0150d.a.WRAP_CONTENT;
        C0150d.a aVar3 = C0150d.a.FIXED;
        boolean z3 = true;
        boolean z4 = z & true;
        C0150d.a aVarM597h = c0162e.f1171a.m597h(0);
        C0150d.a aVarM597h2 = c0162e.f1171a.m597h(1);
        int iM605p = c0162e.f1171a.m605p();
        int iM606q = c0162e.f1171a.m606q();
        if (z4 && (aVarM597h == aVar2 || aVarM597h2 == aVar2)) {
            Iterator<AbstractC0170m> it = c0162e.f1175e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC0170m next = it.next();
                if (next.f1212f == i && !next.mo632k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && aVarM597h == aVar2) {
                    C0151e c0151e = c0162e.f1171a;
                    c0151e.f1081J[0] = aVar3;
                    c0151e.m590B(c0162e.m638d(c0151e, 0));
                    C0151e c0151e2 = c0162e.f1171a;
                    c0164g2 = c0151e2.f1104d.f1211e;
                    iM598i = c0151e2.m604o();
                    c0164g2.mo643c(iM598i);
                }
            } else if (z4 && aVarM597h2 == aVar2) {
                C0151e c0151e3 = c0162e.f1171a;
                c0151e3.f1081J[1] = aVar3;
                c0151e3.m612w(c0162e.m638d(c0151e3, 1));
                C0151e c0151e4 = c0162e.f1171a;
                c0164g2 = c0151e4.f1106e.f1211e;
                iM598i = c0151e4.m598i();
                c0164g2.mo643c(iM598i);
            }
        }
        C0151e c0151e5 = c0162e.f1171a;
        C0150d.a[] aVarArr = c0151e5.f1081J;
        if (i == 0) {
            if (aVarArr[0] == aVar3 || aVarArr[0] == aVar) {
                int iM604o = c0151e5.m604o() + iM605p;
                c0162e.f1171a.f1104d.f1215i.mo643c(iM604o);
                c0164g = c0162e.f1171a.f1104d.f1211e;
                i2 = iM604o - iM605p;
                c0164g.mo643c(i2);
                z2 = true;
            }
            z2 = false;
        } else {
            if (aVarArr[1] == aVar3 || aVarArr[1] == aVar) {
                int iM598i2 = c0151e5.m598i() + iM606q;
                c0162e.f1171a.f1106e.f1215i.mo643c(iM598i2);
                c0164g = c0162e.f1171a.f1106e.f1211e;
                i2 = iM598i2 - iM606q;
                c0164g.mo643c(i2);
                z2 = true;
            }
            z2 = false;
        }
        c0162e.m641g();
        Iterator<AbstractC0170m> it2 = c0162e.f1175e.iterator();
        while (it2.hasNext()) {
            AbstractC0170m next2 = it2.next();
            if (next2.f1212f == i && (next2.f1208b != c0162e.f1171a || next2.f1213g)) {
                next2.mo629e();
            }
        }
        Iterator<AbstractC0170m> it3 = c0162e.f1175e.iterator();
        while (it3.hasNext()) {
            AbstractC0170m next3 = it3.next();
            if (next3.f1212f == i && (z2 || next3.f1208b != c0162e.f1171a)) {
                if (!next3.f1214h.f1188j || !next3.f1215i.f1188j || (!(next3 instanceof C0160c) && !next3.f1211e.f1188j)) {
                    z3 = false;
                    break;
                }
            }
        }
        c0162e.f1171a.m613x(aVarM597h);
        c0162e.f1171a.m589A(aVarM597h2);
        return z3;
    }

    /* renamed from: I */
    public void m620I() {
        this.f1134g0.f1172b = true;
    }

    /* renamed from: J */
    public void m621J(int i) {
        this.f1144q0 = i;
        C0142d.f976p = C0155i.m624a(i, 256);
    }

    @Override // p000a.p022f.p025b.p026i.C0157k, p000a.p022f.p025b.p026i.C0150d
    /* renamed from: u */
    public void mo610u() {
        this.f1137j0.m568t();
        this.f1138k0 = 0;
        this.f1139l0 = 0;
        super.mo610u();
    }
}
