package p121n;

import java.util.ArrayList;
import java.util.HashMap;
import p117m.C2852d;
import p121n.C2869e;

/* renamed from: n.g */
/* loaded from: classes.dex */
public class C2871g extends C2876l {

    /* renamed from: s1 */
    private C2869e[] f11243s1;

    /* renamed from: V0 */
    private int f11220V0 = -1;

    /* renamed from: W0 */
    private int f11221W0 = -1;

    /* renamed from: X0 */
    private int f11222X0 = -1;

    /* renamed from: Y0 */
    private int f11223Y0 = -1;

    /* renamed from: Z0 */
    private int f11224Z0 = -1;

    /* renamed from: a1 */
    private int f11225a1 = -1;

    /* renamed from: b1 */
    private float f11226b1 = 0.5f;

    /* renamed from: c1 */
    private float f11227c1 = 0.5f;

    /* renamed from: d1 */
    private float f11228d1 = 0.5f;

    /* renamed from: e1 */
    private float f11229e1 = 0.5f;

    /* renamed from: f1 */
    private float f11230f1 = 0.5f;

    /* renamed from: g1 */
    private float f11231g1 = 0.5f;

    /* renamed from: h1 */
    private int f11232h1 = 0;

    /* renamed from: i1 */
    private int f11233i1 = 0;

    /* renamed from: j1 */
    private int f11234j1 = 2;

    /* renamed from: k1 */
    private int f11235k1 = 2;

    /* renamed from: l1 */
    private int f11236l1 = 0;

    /* renamed from: m1 */
    private int f11237m1 = -1;

    /* renamed from: n1 */
    private int f11238n1 = 0;

    /* renamed from: o1 */
    private ArrayList<a> f11239o1 = new ArrayList<>();

    /* renamed from: p1 */
    private C2869e[] f11240p1 = null;

    /* renamed from: q1 */
    private C2869e[] f11241q1 = null;

    /* renamed from: r1 */
    private int[] f11242r1 = null;

    /* renamed from: t1 */
    private int f11244t1 = 0;

    /* renamed from: n.g$a */
    private class a {

        /* renamed from: a */
        private int f11245a;

        /* renamed from: d */
        private C2868d f11248d;

        /* renamed from: e */
        private C2868d f11249e;

        /* renamed from: f */
        private C2868d f11250f;

        /* renamed from: g */
        private C2868d f11251g;

        /* renamed from: h */
        private int f11252h;

        /* renamed from: i */
        private int f11253i;

        /* renamed from: j */
        private int f11254j;

        /* renamed from: k */
        private int f11255k;

        /* renamed from: q */
        private int f11261q;

        /* renamed from: b */
        private C2869e f11246b = null;

        /* renamed from: c */
        int f11247c = 0;

        /* renamed from: l */
        private int f11256l = 0;

        /* renamed from: m */
        private int f11257m = 0;

        /* renamed from: n */
        private int f11258n = 0;

        /* renamed from: o */
        private int f11259o = 0;

        /* renamed from: p */
        private int f11260p = 0;

        public a(int i4, C2868d c2868d, C2868d c2868d2, C2868d c2868d3, C2868d c2868d4, int i5) {
            this.f11252h = 0;
            this.f11253i = 0;
            this.f11254j = 0;
            this.f11255k = 0;
            this.f11261q = 0;
            this.f11245a = i4;
            this.f11248d = c2868d;
            this.f11249e = c2868d2;
            this.f11250f = c2868d3;
            this.f11251g = c2868d4;
            this.f11252h = C2871g.this.m9869Q0();
            this.f11253i = C2871g.this.m9871S0();
            this.f11254j = C2871g.this.m9870R0();
            this.f11255k = C2871g.this.m9868P0();
            this.f11261q = i5;
        }

        /* renamed from: h */
        private void m9842h() {
            this.f11256l = 0;
            this.f11257m = 0;
            this.f11246b = null;
            this.f11247c = 0;
            int i4 = this.f11259o;
            for (int i5 = 0; i5 < i4 && this.f11258n + i5 < C2871g.this.f11244t1; i5++) {
                C2869e c2869e = C2871g.this.f11243s1[this.f11258n + i5];
                if (this.f11245a == 0) {
                    int iM9718Q = c2869e.m9718Q();
                    int i6 = C2871g.this.f11232h1;
                    if (c2869e.m9717P() == 8) {
                        i6 = 0;
                    }
                    this.f11256l += iM9718Q + i6;
                    int iM9796B1 = C2871g.this.m9796B1(c2869e, this.f11261q);
                    if (this.f11246b == null || this.f11247c < iM9796B1) {
                        this.f11246b = c2869e;
                        this.f11247c = iM9796B1;
                        this.f11257m = iM9796B1;
                    }
                } else {
                    int iM9797C1 = C2871g.this.m9797C1(c2869e, this.f11261q);
                    int iM9796B12 = C2871g.this.m9796B1(c2869e, this.f11261q);
                    int i7 = C2871g.this.f11233i1;
                    if (c2869e.m9717P() == 8) {
                        i7 = 0;
                    }
                    this.f11257m += iM9796B12 + i7;
                    if (this.f11246b == null || this.f11247c < iM9797C1) {
                        this.f11246b = c2869e;
                        this.f11247c = iM9797C1;
                        this.f11256l = iM9797C1;
                    }
                }
            }
        }

        /* renamed from: b */
        public void m9843b(C2869e c2869e) {
            if (this.f11245a == 0) {
                int iM9797C1 = C2871g.this.m9797C1(c2869e, this.f11261q);
                if (c2869e.m9769z() == C2869e.b.MATCH_CONSTRAINT) {
                    this.f11260p++;
                    iM9797C1 = 0;
                }
                this.f11256l += iM9797C1 + (c2869e.m9717P() != 8 ? C2871g.this.f11232h1 : 0);
                int iM9796B1 = C2871g.this.m9796B1(c2869e, this.f11261q);
                if (this.f11246b == null || this.f11247c < iM9796B1) {
                    this.f11246b = c2869e;
                    this.f11247c = iM9796B1;
                    this.f11257m = iM9796B1;
                }
            } else {
                int iM9797C12 = C2871g.this.m9797C1(c2869e, this.f11261q);
                int iM9796B12 = C2871g.this.m9796B1(c2869e, this.f11261q);
                if (c2869e.m9715N() == C2869e.b.MATCH_CONSTRAINT) {
                    this.f11260p++;
                    iM9796B12 = 0;
                }
                this.f11257m += iM9796B12 + (c2869e.m9717P() != 8 ? C2871g.this.f11233i1 : 0);
                if (this.f11246b == null || this.f11247c < iM9797C12) {
                    this.f11246b = c2869e;
                    this.f11247c = iM9797C12;
                    this.f11256l = iM9797C12;
                }
            }
            this.f11259o++;
        }

        /* renamed from: c */
        public void m9844c() {
            this.f11247c = 0;
            this.f11246b = null;
            this.f11256l = 0;
            this.f11257m = 0;
            this.f11258n = 0;
            this.f11259o = 0;
            this.f11260p = 0;
        }

        /* renamed from: d */
        public void m9845d(boolean z3, int i4, boolean z4) {
            C2869e c2869e;
            int i5 = this.f11259o;
            for (int i6 = 0; i6 < i5 && this.f11258n + i6 < C2871g.this.f11244t1; i6++) {
                C2869e c2869e2 = C2871g.this.f11243s1[this.f11258n + i6];
                if (c2869e2 != null) {
                    c2869e2.m9727a0();
                }
            }
            if (i5 == 0 || this.f11246b == null) {
                return;
            }
            boolean z5 = z4 && i4 == 0;
            int i7 = -1;
            int i8 = -1;
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = z3 ? (i5 - 1) - i9 : i9;
                if (this.f11258n + i10 >= C2871g.this.f11244t1) {
                    break;
                }
                if (C2871g.this.f11243s1[this.f11258n + i10].m9717P() == 0) {
                    if (i7 == -1) {
                        i7 = i9;
                    }
                    i8 = i9;
                }
            }
            C2869e c2869e3 = null;
            if (this.f11245a != 0) {
                C2869e c2869e4 = this.f11246b;
                c2869e4.m9741k0(C2871g.this.f11220V0);
                int i11 = this.f11252h;
                if (i4 > 0) {
                    i11 += C2871g.this.f11232h1;
                }
                if (z3) {
                    c2869e4.f11117F.m9674a(this.f11250f, i11);
                    if (z4) {
                        c2869e4.f11113D.m9674a(this.f11248d, this.f11254j);
                    }
                    if (i4 > 0) {
                        this.f11250f.f11089b.f11113D.m9674a(c2869e4.f11117F, 0);
                    }
                } else {
                    c2869e4.f11113D.m9674a(this.f11248d, i11);
                    if (z4) {
                        c2869e4.f11117F.m9674a(this.f11250f, this.f11254j);
                    }
                    if (i4 > 0) {
                        this.f11248d.f11089b.f11117F.m9674a(c2869e4.f11113D, 0);
                    }
                }
                int i12 = 0;
                while (i12 < i5 && this.f11258n + i12 < C2871g.this.f11244t1) {
                    C2869e c2869e5 = C2871g.this.f11243s1[this.f11258n + i12];
                    if (i12 == 0) {
                        c2869e5.m9738j(c2869e5.f11115E, this.f11249e, this.f11253i);
                        int i13 = C2871g.this.f11221W0;
                        float f4 = C2871g.this.f11227c1;
                        if (this.f11258n == 0 && C2871g.this.f11223Y0 != -1) {
                            i13 = C2871g.this.f11223Y0;
                            f4 = C2871g.this.f11229e1;
                        } else if (z4 && C2871g.this.f11225a1 != -1) {
                            i13 = C2871g.this.f11225a1;
                            f4 = C2871g.this.f11231g1;
                        }
                        c2869e5.m9770z0(i13);
                        c2869e5.m9768y0(f4);
                    }
                    if (i12 == i5 - 1) {
                        c2869e5.m9738j(c2869e5.f11118G, this.f11251g, this.f11255k);
                    }
                    if (c2869e3 != null) {
                        c2869e5.f11115E.m9674a(c2869e3.f11118G, C2871g.this.f11233i1);
                        if (i12 == i7) {
                            c2869e5.f11115E.m9687n(this.f11253i);
                        }
                        c2869e3.f11118G.m9674a(c2869e5.f11115E, 0);
                        if (i12 == i8 + 1) {
                            c2869e3.f11118G.m9687n(this.f11255k);
                        }
                    }
                    if (c2869e5 != c2869e4) {
                        if (z3) {
                            int i14 = C2871g.this.f11234j1;
                            if (i14 == 0) {
                                c2869e5.f11117F.m9674a(c2869e4.f11117F, 0);
                            } else if (i14 == 1) {
                                c2869e5.f11113D.m9674a(c2869e4.f11113D, 0);
                            } else if (i14 == 2) {
                                c2869e5.f11113D.m9674a(c2869e4.f11113D, 0);
                                c2869e5.f11117F.m9674a(c2869e4.f11117F, 0);
                            }
                        } else {
                            int i15 = C2871g.this.f11234j1;
                            if (i15 == 0) {
                                c2869e5.f11113D.m9674a(c2869e4.f11113D, 0);
                            } else if (i15 == 1) {
                                c2869e5.f11117F.m9674a(c2869e4.f11117F, 0);
                            } else if (i15 == 2) {
                                if (z5) {
                                    c2869e5.f11113D.m9674a(this.f11248d, this.f11252h);
                                    c2869e5.f11117F.m9674a(this.f11250f, this.f11254j);
                                } else {
                                    c2869e5.f11113D.m9674a(c2869e4.f11113D, 0);
                                    c2869e5.f11117F.m9674a(c2869e4.f11117F, 0);
                                }
                            }
                        }
                    }
                    i12++;
                    c2869e3 = c2869e5;
                }
                return;
            }
            C2869e c2869e6 = this.f11246b;
            c2869e6.m9770z0(C2871g.this.f11221W0);
            int i16 = this.f11253i;
            if (i4 > 0) {
                i16 += C2871g.this.f11233i1;
            }
            c2869e6.f11115E.m9674a(this.f11249e, i16);
            if (z4) {
                c2869e6.f11118G.m9674a(this.f11251g, this.f11255k);
            }
            if (i4 > 0) {
                this.f11249e.f11089b.f11118G.m9674a(c2869e6.f11115E, 0);
            }
            if (C2871g.this.f11235k1 != 3 || c2869e6.m9721T()) {
                c2869e = c2869e6;
            } else {
                for (int i17 = 0; i17 < i5; i17++) {
                    int i18 = z3 ? (i5 - 1) - i17 : i17;
                    if (this.f11258n + i18 >= C2871g.this.f11244t1) {
                        break;
                    }
                    c2869e = C2871g.this.f11243s1[this.f11258n + i18];
                    if (c2869e.m9721T()) {
                        break;
                    }
                }
                c2869e = c2869e6;
            }
            int i19 = 0;
            while (i19 < i5) {
                int i20 = z3 ? (i5 - 1) - i19 : i19;
                if (this.f11258n + i20 >= C2871g.this.f11244t1) {
                    return;
                }
                C2869e c2869e7 = C2871g.this.f11243s1[this.f11258n + i20];
                if (i19 == 0) {
                    c2869e7.m9738j(c2869e7.f11113D, this.f11248d, this.f11252h);
                }
                if (i20 == 0) {
                    int i21 = C2871g.this.f11220V0;
                    float f5 = C2871g.this.f11226b1;
                    if (this.f11258n == 0 && C2871g.this.f11222X0 != -1) {
                        i21 = C2871g.this.f11222X0;
                        f5 = C2871g.this.f11228d1;
                    } else if (z4 && C2871g.this.f11224Z0 != -1) {
                        i21 = C2871g.this.f11224Z0;
                        f5 = C2871g.this.f11230f1;
                    }
                    c2869e7.m9741k0(i21);
                    c2869e7.m9739j0(f5);
                }
                if (i19 == i5 - 1) {
                    c2869e7.m9738j(c2869e7.f11117F, this.f11250f, this.f11254j);
                }
                if (c2869e3 != null) {
                    c2869e7.f11113D.m9674a(c2869e3.f11117F, C2871g.this.f11232h1);
                    if (i19 == i7) {
                        c2869e7.f11113D.m9687n(this.f11252h);
                    }
                    c2869e3.f11117F.m9674a(c2869e7.f11113D, 0);
                    if (i19 == i8 + 1) {
                        c2869e3.f11117F.m9687n(this.f11254j);
                    }
                }
                if (c2869e7 != c2869e6) {
                    if (C2871g.this.f11235k1 == 3 && c2869e.m9721T() && c2869e7 != c2869e && c2869e7.m9721T()) {
                        c2869e7.f11119H.m9674a(c2869e.f11119H, 0);
                    } else {
                        int i22 = C2871g.this.f11235k1;
                        if (i22 == 0) {
                            c2869e7.f11115E.m9674a(c2869e6.f11115E, 0);
                        } else if (i22 == 1) {
                            c2869e7.f11118G.m9674a(c2869e6.f11118G, 0);
                        } else if (z5) {
                            c2869e7.f11115E.m9674a(this.f11249e, this.f11253i);
                            c2869e7.f11118G.m9674a(this.f11251g, this.f11255k);
                        } else {
                            c2869e7.f11115E.m9674a(c2869e6.f11115E, 0);
                            c2869e7.f11118G.m9674a(c2869e6.f11118G, 0);
                        }
                    }
                }
                i19++;
                c2869e3 = c2869e7;
            }
        }

        /* renamed from: e */
        public int m9846e() {
            return this.f11245a == 1 ? this.f11257m - C2871g.this.f11233i1 : this.f11257m;
        }

        /* renamed from: f */
        public int m9847f() {
            return this.f11245a == 0 ? this.f11256l - C2871g.this.f11232h1 : this.f11256l;
        }

        /* renamed from: g */
        public void m9848g(int i4) {
            int i5 = this.f11260p;
            if (i5 == 0) {
                return;
            }
            int i6 = this.f11259o;
            int i7 = i4 / i5;
            for (int i8 = 0; i8 < i6 && this.f11258n + i8 < C2871g.this.f11244t1; i8++) {
                C2869e c2869e = C2871g.this.f11243s1[this.f11258n + i8];
                if (this.f11245a == 0) {
                    if (c2869e != null && c2869e.m9769z() == C2869e.b.MATCH_CONSTRAINT && c2869e.f11160l == 0) {
                        C2871g.this.m9872U0(c2869e, C2869e.b.FIXED, i7, c2869e.m9715N(), c2869e.m9763w());
                    }
                } else if (c2869e != null && c2869e.m9715N() == C2869e.b.MATCH_CONSTRAINT && c2869e.f11162m == 0) {
                    C2871g.this.m9872U0(c2869e, c2869e.m9769z(), c2869e.m9718Q(), C2869e.b.FIXED, i7);
                }
            }
            m9842h();
        }

        /* renamed from: i */
        public void m9849i(int i4) {
            this.f11258n = i4;
        }

        /* renamed from: j */
        public void m9850j(int i4, C2868d c2868d, C2868d c2868d2, C2868d c2868d3, C2868d c2868d4, int i5, int i6, int i7, int i8, int i9) {
            this.f11245a = i4;
            this.f11248d = c2868d;
            this.f11249e = c2868d2;
            this.f11250f = c2868d3;
            this.f11251g = c2868d4;
            this.f11252h = i5;
            this.f11253i = i6;
            this.f11254j = i7;
            this.f11255k = i8;
            this.f11261q = i9;
        }
    }

    /* renamed from: A1 */
    private void m9795A1(boolean z3) {
        C2869e c2869e;
        if (this.f11242r1 == null || this.f11241q1 == null || this.f11240p1 == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f11244t1; i4++) {
            this.f11243s1[i4].m9727a0();
        }
        int[] iArr = this.f11242r1;
        int i5 = iArr[0];
        int i6 = iArr[1];
        C2869e c2869e2 = null;
        for (int i7 = 0; i7 < i5; i7++) {
            C2869e c2869e3 = this.f11241q1[z3 ? (i5 - i7) - 1 : i7];
            if (c2869e3 != null && c2869e3.m9717P() != 8) {
                if (i7 == 0) {
                    c2869e3.m9738j(c2869e3.f11113D, this.f11113D, m9869Q0());
                    c2869e3.m9741k0(this.f11220V0);
                    c2869e3.m9739j0(this.f11226b1);
                }
                if (i7 == i5 - 1) {
                    c2869e3.m9738j(c2869e3.f11117F, this.f11117F, m9870R0());
                }
                if (i7 > 0) {
                    c2869e3.m9738j(c2869e3.f11113D, c2869e2.f11117F, this.f11232h1);
                    c2869e2.m9738j(c2869e2.f11117F, c2869e3.f11113D, 0);
                }
                c2869e2 = c2869e3;
            }
        }
        for (int i8 = 0; i8 < i6; i8++) {
            C2869e c2869e4 = this.f11240p1[i8];
            if (c2869e4 != null && c2869e4.m9717P() != 8) {
                if (i8 == 0) {
                    c2869e4.m9738j(c2869e4.f11115E, this.f11115E, m9871S0());
                    c2869e4.m9770z0(this.f11221W0);
                    c2869e4.m9768y0(this.f11227c1);
                }
                if (i8 == i6 - 1) {
                    c2869e4.m9738j(c2869e4.f11118G, this.f11118G, m9868P0());
                }
                if (i8 > 0) {
                    c2869e4.m9738j(c2869e4.f11115E, c2869e2.f11118G, this.f11233i1);
                    c2869e2.m9738j(c2869e2.f11118G, c2869e4.f11115E, 0);
                }
                c2869e2 = c2869e4;
            }
        }
        for (int i9 = 0; i9 < i5; i9++) {
            for (int i10 = 0; i10 < i6; i10++) {
                int i11 = (i10 * i5) + i9;
                if (this.f11238n1 == 1) {
                    i11 = (i9 * i6) + i10;
                }
                C2869e[] c2869eArr = this.f11243s1;
                if (i11 < c2869eArr.length && (c2869e = c2869eArr[i11]) != null && c2869e.m9717P() != 8) {
                    C2869e c2869e5 = this.f11241q1[i9];
                    C2869e c2869e6 = this.f11240p1[i10];
                    if (c2869e != c2869e5) {
                        c2869e.m9738j(c2869e.f11113D, c2869e5.f11113D, 0);
                        c2869e.m9738j(c2869e.f11117F, c2869e5.f11117F, 0);
                    }
                    if (c2869e != c2869e6) {
                        c2869e.m9738j(c2869e.f11115E, c2869e6.f11115E, 0);
                        c2869e.m9738j(c2869e.f11118G, c2869e6.f11118G, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public final int m9796B1(C2869e c2869e, int i4) {
        if (c2869e == null) {
            return 0;
        }
        if (c2869e.m9715N() == C2869e.b.MATCH_CONSTRAINT) {
            int i5 = c2869e.f11162m;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (c2869e.f11176t * i4);
                if (i6 != c2869e.m9763w()) {
                    m9872U0(c2869e, c2869e.m9769z(), c2869e.m9718Q(), C2869e.b.FIXED, i6);
                }
                return i6;
            }
            if (i5 == 1) {
                return c2869e.m9763w();
            }
            if (i5 == 3) {
                return (int) ((c2869e.m9718Q() * c2869e.f11130S) + 0.5f);
            }
        }
        return c2869e.m9763w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C1 */
    public final int m9797C1(C2869e c2869e, int i4) {
        if (c2869e == null) {
            return 0;
        }
        if (c2869e.m9769z() == C2869e.b.MATCH_CONSTRAINT) {
            int i5 = c2869e.f11160l;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (c2869e.f11170q * i4);
                if (i6 != c2869e.m9718Q()) {
                    m9872U0(c2869e, C2869e.b.FIXED, i6, c2869e.m9715N(), c2869e.m9763w());
                }
                return i6;
            }
            if (i5 == 1) {
                return c2869e.m9718Q();
            }
            if (i5 == 3) {
                return (int) ((c2869e.m9763w() * c2869e.f11130S) + 0.5f);
            }
        }
        return c2869e.m9718Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x011b -> B:42:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x011d -> B:42:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0123 -> B:42:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0125 -> B:42:0x0063). Please report as a decompilation issue!!! */
    /* renamed from: D1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m9798D1(p121n.C2869e[] r17, int r18, int r19, int r20, int[] r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p121n.C2871g.m9798D1(n.e[], int, int, int, int[]):void");
    }

    /* renamed from: E1 */
    private void m9799E1(C2869e[] c2869eArr, int i4, int i5, int i6, int[] iArr) {
        int i7;
        int i8;
        int i9;
        C2868d c2868d;
        int iM9870R0;
        C2868d c2868d2;
        int iM9868P0;
        int i10;
        if (i4 == 0) {
            return;
        }
        this.f11239o1.clear();
        a aVar = new a(i5, this.f11113D, this.f11115E, this.f11117F, this.f11118G, i6);
        this.f11239o1.add(aVar);
        if (i5 == 0) {
            i7 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i4) {
                C2869e c2869e = c2869eArr[i12];
                int iM9797C1 = m9797C1(c2869e, i6);
                if (c2869e.m9769z() == C2869e.b.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i13 = i7;
                boolean z3 = (i11 == i6 || (this.f11232h1 + i11) + iM9797C1 > i6) && aVar.f11246b != null;
                if (!z3 && i12 > 0 && (i10 = this.f11237m1) > 0 && i12 % i10 == 0) {
                    z3 = true;
                }
                if (z3) {
                    aVar = new a(i5, this.f11113D, this.f11115E, this.f11117F, this.f11118G, i6);
                    aVar.m9849i(i12);
                    this.f11239o1.add(aVar);
                } else {
                    if (i12 > 0) {
                        i11 += this.f11232h1 + iM9797C1;
                    }
                    aVar.m9843b(c2869e);
                    i12++;
                    i7 = i13;
                }
                i11 = iM9797C1;
                aVar.m9843b(c2869e);
                i12++;
                i7 = i13;
            }
        } else {
            i7 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i15 < i4) {
                C2869e c2869e2 = c2869eArr[i15];
                int iM9796B1 = m9796B1(c2869e2, i6);
                if (c2869e2.m9715N() == C2869e.b.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i16 = i7;
                boolean z4 = (i14 == i6 || (this.f11233i1 + i14) + iM9796B1 > i6) && aVar.f11246b != null;
                if (!z4 && i15 > 0 && (i8 = this.f11237m1) > 0 && i15 % i8 == 0) {
                    z4 = true;
                }
                if (z4) {
                    aVar = new a(i5, this.f11113D, this.f11115E, this.f11117F, this.f11118G, i6);
                    aVar.m9849i(i15);
                    this.f11239o1.add(aVar);
                } else {
                    if (i15 > 0) {
                        i14 += this.f11233i1 + iM9796B1;
                    }
                    aVar.m9843b(c2869e2);
                    i15++;
                    i7 = i16;
                }
                i14 = iM9796B1;
                aVar.m9843b(c2869e2);
                i15++;
                i7 = i16;
            }
        }
        int size = this.f11239o1.size();
        C2868d c2868d3 = this.f11113D;
        C2868d c2868d4 = this.f11115E;
        C2868d c2868d5 = this.f11117F;
        C2868d c2868d6 = this.f11118G;
        int iM9869Q0 = m9869Q0();
        int iM9871S0 = m9871S0();
        int iM9870R02 = m9870R0();
        int iM9868P02 = m9868P0();
        C2869e.b bVarM9769z = m9769z();
        C2869e.b bVar = C2869e.b.WRAP_CONTENT;
        boolean z5 = bVarM9769z == bVar || m9715N() == bVar;
        if (i7 > 0 && z5) {
            for (int i17 = 0; i17 < size; i17++) {
                a aVar2 = this.f11239o1.get(i17);
                if (i5 == 0) {
                    aVar2.m9848g(i6 - aVar2.m9847f());
                } else {
                    aVar2.m9848g(i6 - aVar2.m9846e());
                }
            }
        }
        int i18 = iM9871S0;
        int i19 = iM9870R02;
        int iM9846e = 0;
        int iM9847f = 0;
        int i20 = 0;
        int i21 = iM9869Q0;
        C2868d c2868d7 = c2868d4;
        C2868d c2868d8 = c2868d3;
        int i22 = iM9868P02;
        while (i20 < size) {
            a aVar3 = this.f11239o1.get(i20);
            if (i5 == 0) {
                if (i20 < size - 1) {
                    c2868d2 = this.f11239o1.get(i20 + 1).f11246b.f11115E;
                    iM9868P0 = 0;
                } else {
                    c2868d2 = this.f11118G;
                    iM9868P0 = m9868P0();
                }
                C2868d c2868d9 = aVar3.f11246b.f11118G;
                C2868d c2868d10 = c2868d8;
                C2868d c2868d11 = c2868d8;
                int i23 = iM9846e;
                C2868d c2868d12 = c2868d7;
                int i24 = iM9847f;
                C2868d c2868d13 = c2868d5;
                C2868d c2868d14 = c2868d5;
                i9 = i20;
                aVar3.m9850j(i5, c2868d10, c2868d12, c2868d13, c2868d2, i21, i18, i19, iM9868P0, i6);
                int iMax = Math.max(i24, aVar3.m9847f());
                iM9846e = i23 + aVar3.m9846e();
                if (i9 > 0) {
                    iM9846e += this.f11233i1;
                }
                c2868d8 = c2868d11;
                iM9847f = iMax;
                c2868d7 = c2868d9;
                i18 = 0;
                c2868d = c2868d14;
                int i25 = iM9868P0;
                c2868d6 = c2868d2;
                i22 = i25;
            } else {
                C2868d c2868d15 = c2868d8;
                int i26 = iM9846e;
                int i27 = iM9847f;
                i9 = i20;
                if (i9 < size - 1) {
                    c2868d = this.f11239o1.get(i9 + 1).f11246b.f11113D;
                    iM9870R0 = 0;
                } else {
                    c2868d = this.f11117F;
                    iM9870R0 = m9870R0();
                }
                C2868d c2868d16 = aVar3.f11246b.f11117F;
                aVar3.m9850j(i5, c2868d15, c2868d7, c2868d, c2868d6, i21, i18, iM9870R0, i22, i6);
                iM9847f = i27 + aVar3.m9847f();
                int iMax2 = Math.max(i26, aVar3.m9846e());
                if (i9 > 0) {
                    iM9847f += this.f11232h1;
                }
                iM9846e = iMax2;
                i19 = iM9870R0;
                c2868d8 = c2868d16;
                i21 = 0;
            }
            i20 = i9 + 1;
            c2868d5 = c2868d;
        }
        iArr[0] = iM9847f;
        iArr[1] = iM9846e;
    }

    /* renamed from: F1 */
    private void m9800F1(C2869e[] c2869eArr, int i4, int i5, int i6, int[] iArr) {
        a aVar;
        if (i4 == 0) {
            return;
        }
        if (this.f11239o1.size() == 0) {
            aVar = new a(i5, this.f11113D, this.f11115E, this.f11117F, this.f11118G, i6);
            this.f11239o1.add(aVar);
        } else {
            a aVar2 = this.f11239o1.get(0);
            aVar2.m9844c();
            aVar = aVar2;
            aVar.m9850j(i5, this.f11113D, this.f11115E, this.f11117F, this.f11118G, m9869Q0(), m9871S0(), m9870R0(), m9868P0(), i6);
        }
        for (int i7 = 0; i7 < i4; i7++) {
            aVar.m9843b(c2869eArr[i7]);
        }
        iArr[0] = aVar.m9847f();
        iArr[1] = aVar.m9846e();
    }

    /* renamed from: G1 */
    public void m9821G1(float f4) {
        this.f11228d1 = f4;
    }

    /* renamed from: H1 */
    public void m9822H1(int i4) {
        this.f11222X0 = i4;
    }

    /* renamed from: I1 */
    public void m9823I1(float f4) {
        this.f11229e1 = f4;
    }

    /* renamed from: J1 */
    public void m9824J1(int i4) {
        this.f11223Y0 = i4;
    }

    /* renamed from: K1 */
    public void m9825K1(int i4) {
        this.f11234j1 = i4;
    }

    /* renamed from: L1 */
    public void m9826L1(float f4) {
        this.f11226b1 = f4;
    }

    /* renamed from: M1 */
    public void m9827M1(int i4) {
        this.f11232h1 = i4;
    }

    /* renamed from: N1 */
    public void m9828N1(int i4) {
        this.f11220V0 = i4;
    }

    /* renamed from: O1 */
    public void m9829O1(float f4) {
        this.f11230f1 = f4;
    }

    /* renamed from: P1 */
    public void m9830P1(int i4) {
        this.f11224Z0 = i4;
    }

    /* renamed from: Q1 */
    public void m9831Q1(float f4) {
        this.f11231g1 = f4;
    }

    /* renamed from: R1 */
    public void m9832R1(int i4) {
        this.f11225a1 = i4;
    }

    /* renamed from: S1 */
    public void m9833S1(int i4) {
        this.f11237m1 = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    @Override // p121n.C2876l
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9834T0(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p121n.C2871g.mo9834T0(int, int, int, int):void");
    }

    /* renamed from: T1 */
    public void m9835T1(int i4) {
        this.f11238n1 = i4;
    }

    /* renamed from: U1 */
    public void m9836U1(int i4) {
        this.f11235k1 = i4;
    }

    /* renamed from: V1 */
    public void m9837V1(float f4) {
        this.f11227c1 = f4;
    }

    /* renamed from: W1 */
    public void m9838W1(int i4) {
        this.f11233i1 = i4;
    }

    /* renamed from: X1 */
    public void m9839X1(int i4) {
        this.f11221W0 = i4;
    }

    /* renamed from: Y1 */
    public void m9840Y1(int i4) {
        this.f11236l1 = i4;
    }

    @Override // p121n.C2869e
    /* renamed from: f */
    public void mo9666f(C2852d c2852d) {
        super.mo9666f(c2852d);
        boolean zM9786c1 = m9705H() != null ? ((C2870f) m9705H()).m9786c1() : false;
        int i4 = this.f11236l1;
        if (i4 != 0) {
            if (i4 == 1) {
                int size = this.f11239o1.size();
                int i5 = 0;
                while (i5 < size) {
                    this.f11239o1.get(i5).m9845d(zM9786c1, i5, i5 == size + (-1));
                    i5++;
                }
            } else if (i4 == 2) {
                m9795A1(zM9786c1);
            }
        } else if (this.f11239o1.size() > 0) {
            this.f11239o1.get(0).m9845d(zM9786c1, 0, true);
        }
        m9875X0(false);
    }

    @Override // p121n.C2874j, p121n.C2869e
    /* renamed from: l */
    public void mo9668l(C2869e c2869e, HashMap<C2869e, C2869e> map) {
        super.mo9668l(c2869e, map);
        C2871g c2871g = (C2871g) c2869e;
        this.f11220V0 = c2871g.f11220V0;
        this.f11221W0 = c2871g.f11221W0;
        this.f11222X0 = c2871g.f11222X0;
        this.f11223Y0 = c2871g.f11223Y0;
        this.f11224Z0 = c2871g.f11224Z0;
        this.f11225a1 = c2871g.f11225a1;
        this.f11226b1 = c2871g.f11226b1;
        this.f11227c1 = c2871g.f11227c1;
        this.f11228d1 = c2871g.f11228d1;
        this.f11229e1 = c2871g.f11229e1;
        this.f11230f1 = c2871g.f11230f1;
        this.f11231g1 = c2871g.f11231g1;
        this.f11232h1 = c2871g.f11232h1;
        this.f11233i1 = c2871g.f11233i1;
        this.f11234j1 = c2871g.f11234j1;
        this.f11235k1 = c2871g.f11235k1;
        this.f11236l1 = c2871g.f11236l1;
        this.f11237m1 = c2871g.f11237m1;
        this.f11238n1 = c2871g.f11238n1;
    }
}
