package p125o;

import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import p117m.C2852d;
import p121n.C2868d;
import p121n.C2869e;
import p121n.C2870f;
import p121n.C2872h;
import p121n.C2875k;
import p121n.C2876l;
import p121n.InterfaceC2873i;

/* renamed from: o.b */
/* loaded from: classes.dex */
public class C2892b {

    /* renamed from: a */
    private final ArrayList<C2869e> f11302a = new ArrayList<>();

    /* renamed from: b */
    private a f11303b = new a();

    /* renamed from: c */
    private C2870f f11304c;

    /* renamed from: o.b$a */
    public static class a {

        /* renamed from: a */
        public C2869e.b f11305a;

        /* renamed from: b */
        public C2869e.b f11306b;

        /* renamed from: c */
        public int f11307c;

        /* renamed from: d */
        public int f11308d;

        /* renamed from: e */
        public int f11309e;

        /* renamed from: f */
        public int f11310f;

        /* renamed from: g */
        public int f11311g;

        /* renamed from: h */
        public boolean f11312h;

        /* renamed from: i */
        public boolean f11313i;

        /* renamed from: j */
        public boolean f11314j;
    }

    /* renamed from: o.b$b */
    public interface b {
        /* renamed from: a */
        void mo1621a();

        /* renamed from: b */
        void mo1622b(C2869e c2869e, a aVar);
    }

    public C2892b(C2870f c2870f) {
        this.f11304c = c2870f;
    }

    /* renamed from: a */
    private boolean m9922a(b bVar, C2869e c2869e, boolean z3) {
        this.f11303b.f11305a = c2869e.m9769z();
        this.f11303b.f11306b = c2869e.m9715N();
        this.f11303b.f11307c = c2869e.m9718Q();
        this.f11303b.f11308d = c2869e.m9763w();
        a aVar = this.f11303b;
        aVar.f11313i = false;
        aVar.f11314j = z3;
        C2869e.b bVar2 = aVar.f11305a;
        C2869e.b bVar3 = C2869e.b.MATCH_CONSTRAINT;
        boolean z4 = bVar2 == bVar3;
        boolean z5 = aVar.f11306b == bVar3;
        boolean z6 = z4 && c2869e.f11130S > IGoodView.DEFAULT_TO_ALPHA;
        boolean z7 = z5 && c2869e.f11130S > IGoodView.DEFAULT_TO_ALPHA;
        if (z6 && c2869e.f11164n[0] == 4) {
            aVar.f11305a = C2869e.b.FIXED;
        }
        if (z7 && c2869e.f11164n[1] == 4) {
            aVar.f11306b = C2869e.b.FIXED;
        }
        bVar.mo1622b(c2869e, aVar);
        c2869e.m9702F0(this.f11303b.f11309e);
        c2869e.m9737i0(this.f11303b.f11310f);
        c2869e.m9735h0(this.f11303b.f11312h);
        c2869e.m9729c0(this.f11303b.f11311g);
        a aVar2 = this.f11303b;
        aVar2.f11314j = false;
        return aVar2.f11313i;
    }

    /* renamed from: b */
    private void m9923b(C2870f c2870f) {
        int size = c2870f.f11286G0.size();
        b bVarM9780W0 = c2870f.m9780W0();
        for (int i4 = 0; i4 < size; i4++) {
            C2869e c2869e = c2870f.f11286G0.get(i4);
            if (!(c2869e instanceof C2872h) && (!c2869e.f11146e.f11365e.f11335j || !c2869e.f11148f.f11365e.f11335j)) {
                C2869e.b bVarM9757t = c2869e.m9757t(0);
                C2869e.b bVarM9757t2 = c2869e.m9757t(1);
                C2869e.b bVar = C2869e.b.MATCH_CONSTRAINT;
                if (!(bVarM9757t == bVar && c2869e.f11160l != 1 && bVarM9757t2 == bVar && c2869e.f11162m != 1)) {
                    m9922a(bVarM9780W0, c2869e, false);
                }
            }
        }
        bVarM9780W0.mo1621a();
    }

    /* renamed from: c */
    private void m9924c(C2870f c2870f, String str, int i4, int i5) {
        int iM9701F = c2870f.m9701F();
        int iM9699E = c2870f.m9699E();
        c2870f.m9762v0(0);
        c2870f.m9760u0(0);
        c2870f.m9702F0(i4);
        c2870f.m9737i0(i5);
        c2870f.m9762v0(iM9701F);
        c2870f.m9760u0(iM9699E);
        this.f11304c.mo9774M0();
    }

    /* renamed from: d */
    public long m9925d(C2870f c2870f, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        boolean zM9777T0;
        int i13;
        boolean z3;
        boolean z4;
        int i14;
        int i15;
        b bVar;
        int i16;
        boolean z5;
        boolean zM9779V0;
        int i17;
        b bVarM9780W0 = c2870f.m9780W0();
        int size = c2870f.f11286G0.size();
        int iM9718Q = c2870f.m9718Q();
        int iM9763w = c2870f.m9763w();
        boolean zM9863b = C2875k.m9863b(i4, 128);
        boolean z6 = zM9863b || C2875k.m9863b(i4, 64);
        if (z6) {
            for (int i18 = 0; i18 < size; i18++) {
                C2869e c2869e = c2870f.f11286G0.get(i18);
                C2869e.b bVarM9769z = c2869e.m9769z();
                C2869e.b bVar2 = C2869e.b.MATCH_CONSTRAINT;
                boolean z7 = (bVarM9769z == bVar2) && (c2869e.m9715N() == bVar2) && c2869e.m9759u() > IGoodView.DEFAULT_TO_ALPHA;
                if ((c2869e.m9723W() && z7) || ((c2869e.m9725Y() && z7) || (c2869e instanceof C2876l) || c2869e.m9723W() || c2869e.m9725Y())) {
                    z6 = false;
                    break;
                }
            }
        }
        if (z6) {
            boolean z8 = C2852d.f10981r;
        }
        if (z6 && ((i7 == 1073741824 && i9 == 1073741824) || zM9863b)) {
            int iMin = Math.min(c2870f.m9697D(), i8);
            int iMin2 = Math.min(c2870f.m9695C(), i10);
            if (i7 == 1073741824 && c2870f.m9718Q() != iMin) {
                c2870f.m9702F0(iMin);
                c2870f.m9783Z0();
            }
            if (i9 == 1073741824 && c2870f.m9763w() != iMin2) {
                c2870f.m9737i0(iMin2);
                c2870f.m9783Z0();
            }
            if (i7 == 1073741824 && i9 == 1073741824) {
                zM9777T0 = c2870f.m9777T0(zM9863b);
                i13 = 2;
            } else {
                boolean zM9778U0 = c2870f.m9778U0(zM9863b);
                if (i7 == 1073741824) {
                    zM9779V0 = zM9778U0 & c2870f.m9779V0(zM9863b, 0);
                    i17 = 1;
                } else {
                    zM9779V0 = zM9778U0;
                    i17 = 0;
                }
                if (i9 == 1073741824) {
                    boolean zM9779V02 = c2870f.m9779V0(zM9863b, 1) & zM9779V0;
                    i13 = i17 + 1;
                    zM9777T0 = zM9779V02;
                } else {
                    i13 = i17;
                    zM9777T0 = zM9779V0;
                }
            }
            if (zM9777T0) {
                c2870f.mo9710J0(i7 == 1073741824, i9 == 1073741824);
            }
        } else {
            zM9777T0 = false;
            i13 = 0;
        }
        if (zM9777T0 && i13 == 2) {
            return 0L;
        }
        if (size > 0) {
            m9923b(c2870f);
        }
        int iM9781X0 = c2870f.m9781X0();
        int size2 = this.f11302a.size();
        if (size > 0) {
            m9924c(c2870f, "First pass", iM9718Q, iM9763w);
        }
        if (size2 > 0) {
            C2869e.b bVarM9769z2 = c2870f.m9769z();
            C2869e.b bVar3 = C2869e.b.WRAP_CONTENT;
            boolean z9 = bVarM9769z2 == bVar3;
            boolean z10 = c2870f.m9715N() == bVar3;
            int iMax = Math.max(c2870f.m9718Q(), this.f11304c.m9701F());
            int iMax2 = Math.max(c2870f.m9763w(), this.f11304c.m9699E());
            int i19 = 0;
            boolean zM9922a = false;
            while (i19 < size2) {
                C2869e c2869e2 = this.f11302a.get(i19);
                if (c2869e2 instanceof C2876l) {
                    int iM9718Q2 = c2869e2.m9718Q();
                    int iM9763w2 = c2869e2.m9763w();
                    i16 = iM9781X0;
                    boolean zM9922a2 = zM9922a | m9922a(bVarM9780W0, c2869e2, true);
                    int iM9718Q3 = c2869e2.m9718Q();
                    int iM9763w3 = c2869e2.m9763w();
                    if (iM9718Q3 != iM9718Q2) {
                        c2869e2.m9702F0(iM9718Q3);
                        if (z9 && c2869e2.m9709J() > iMax) {
                            iMax = Math.max(iMax, c2869e2.m9709J() + c2869e2.mo9745n(C2868d.b.RIGHT).m9676c());
                        }
                        z5 = true;
                    } else {
                        z5 = zM9922a2;
                    }
                    if (iM9763w3 != iM9763w2) {
                        c2869e2.m9737i0(iM9763w3);
                        if (z10 && c2869e2.m9751q() > iMax2) {
                            iMax2 = Math.max(iMax2, c2869e2.m9751q() + c2869e2.mo9745n(C2868d.b.BOTTOM).m9676c());
                        }
                        z5 = true;
                    }
                    zM9922a = z5 | ((C2876l) c2869e2).m9874W0();
                } else {
                    i16 = iM9781X0;
                }
                i19++;
                iM9781X0 = i16;
            }
            int i20 = iM9781X0;
            int i21 = 0;
            while (i21 < 2) {
                int i22 = 0;
                while (i22 < size2) {
                    C2869e c2869e3 = this.f11302a.get(i22);
                    if (((c2869e3 instanceof InterfaceC2873i) && !(c2869e3 instanceof C2876l)) || (c2869e3 instanceof C2872h) || c2869e3.m9717P() == 8 || ((c2869e3.f11146e.f11365e.f11335j && c2869e3.f11148f.f11365e.f11335j) || (c2869e3 instanceof C2876l))) {
                        i15 = i21;
                        i14 = size2;
                        bVar = bVarM9780W0;
                    } else {
                        int iM9718Q4 = c2869e3.m9718Q();
                        int iM9763w4 = c2869e3.m9763w();
                        i14 = size2;
                        int iM9747o = c2869e3.m9747o();
                        i15 = i21;
                        zM9922a |= m9922a(bVarM9780W0, c2869e3, true);
                        int iM9718Q5 = c2869e3.m9718Q();
                        bVar = bVarM9780W0;
                        int iM9763w5 = c2869e3.m9763w();
                        if (iM9718Q5 != iM9718Q4) {
                            c2869e3.m9702F0(iM9718Q5);
                            if (z9 && c2869e3.m9709J() > iMax) {
                                iMax = Math.max(iMax, c2869e3.m9709J() + c2869e3.mo9745n(C2868d.b.RIGHT).m9676c());
                            }
                            zM9922a = true;
                        }
                        if (iM9763w5 != iM9763w4) {
                            c2869e3.m9737i0(iM9763w5);
                            if (z10 && c2869e3.m9751q() > iMax2) {
                                iMax2 = Math.max(iMax2, c2869e3.m9751q() + c2869e3.mo9745n(C2868d.b.BOTTOM).m9676c());
                            }
                            zM9922a = true;
                        }
                        if (c2869e3.m9721T() && iM9747o != c2869e3.m9747o()) {
                            zM9922a = true;
                        }
                    }
                    i22++;
                    size2 = i14;
                    bVarM9780W0 = bVar;
                    i21 = i15;
                }
                int i23 = i21;
                int i24 = size2;
                b bVar4 = bVarM9780W0;
                if (zM9922a) {
                    m9924c(c2870f, "intermediate pass", iM9718Q, iM9763w);
                    zM9922a = false;
                }
                i21 = i23 + 1;
                size2 = i24;
                bVarM9780W0 = bVar4;
            }
            if (zM9922a) {
                m9924c(c2870f, "2nd pass", iM9718Q, iM9763w);
                if (c2870f.m9718Q() < iMax) {
                    c2870f.m9702F0(iMax);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c2870f.m9763w() < iMax2) {
                    c2870f.m9737i0(iMax2);
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (z4) {
                    m9924c(c2870f, "3rd pass", iM9718Q, iM9763w);
                }
            }
            iM9781X0 = i20;
        }
        c2870f.m9791i1(iM9781X0);
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m9926e(p121n.C2870f r7) {
        /*
            r6 = this;
            java.util.ArrayList<n.e> r0 = r6.f11302a
            r0.clear()
            java.util.ArrayList<n.e> r0 = r7.f11286G0
            int r0 = r0.size()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L3a
            java.util.ArrayList<n.e> r2 = r7.f11286G0
            java.lang.Object r2 = r2.get(r1)
            n.e r2 = (p121n.C2869e) r2
            n.e$b r3 = r2.m9769z()
            n.e$b r4 = p121n.C2869e.b.MATCH_CONSTRAINT
            if (r3 == r4) goto L32
            n.e$b r3 = r2.m9769z()
            n.e$b r5 = p121n.C2869e.b.MATCH_PARENT
            if (r3 == r5) goto L32
            n.e$b r3 = r2.m9715N()
            if (r3 == r4) goto L32
            n.e$b r3 = r2.m9715N()
            if (r3 != r5) goto L37
        L32:
            java.util.ArrayList<n.e> r3 = r6.f11302a
            r3.add(r2)
        L37:
            int r1 = r1 + 1
            goto Lc
        L3a:
            r7.m9783Z0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p125o.C2892b.m9926e(n.f):void");
    }
}
