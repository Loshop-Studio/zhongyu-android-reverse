package p125o;

import p121n.C2868d;
import p121n.C2869e;
import p121n.InterfaceC2873i;
import p125o.AbstractC2903m;
import p125o.C2896f;

/* renamed from: o.j */
/* loaded from: classes.dex */
public class C2900j extends AbstractC2903m {

    /* renamed from: k */
    private static int[] f11348k = new int[2];

    /* renamed from: o.j$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11349a;

        static {
            int[] iArr = new int[AbstractC2903m.b.values().length];
            f11349a = iArr;
            try {
                iArr[AbstractC2903m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11349a[AbstractC2903m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11349a[AbstractC2903m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C2900j(C2869e c2869e) {
        super(c2869e);
        this.f11368h.f11330e = C2896f.a.LEFT;
        this.f11369i.f11330e = C2896f.a.RIGHT;
        this.f11366f = 0;
    }

    /* renamed from: q */
    private void m9955q(int[] iArr, int i4, int i5, int i6, int i7, float f4, int i8) {
        int i9 = i5 - i4;
        int i10 = i7 - i6;
        if (i8 != -1) {
            if (i8 == 0) {
                iArr[0] = (int) ((i10 * f4) + 0.5f);
                iArr[1] = i10;
                return;
            } else {
                if (i8 != 1) {
                    return;
                }
                iArr[0] = i9;
                iArr[1] = (int) ((i9 * f4) + 0.5f);
                return;
            }
        }
        int i11 = (int) ((i10 * f4) + 0.5f);
        int i12 = (int) ((i9 / f4) + 0.5f);
        if (i11 <= i9) {
            iArr[0] = i11;
            iArr[1] = i10;
        } else if (i12 <= i10) {
            iArr[0] = i9;
            iArr[1] = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02e2  */
    @Override // p125o.AbstractC2903m, p125o.InterfaceC2894d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9930a(p125o.InterfaceC2894d r17) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p125o.C2900j.mo9930a(o.d):void");
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: d */
    void mo9931d() {
        C2869e c2869eM9705H;
        C2869e c2869eM9705H2;
        C2869e c2869e = this.f11362b;
        if (c2869e.f11138a) {
            this.f11365e.mo9952d(c2869e.m9718Q());
        }
        if (this.f11365e.f11335j) {
            C2869e.b bVar = this.f11364d;
            C2869e.b bVar2 = C2869e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((c2869eM9705H = this.f11362b.m9705H()) != null && c2869eM9705H.m9769z() == C2869e.b.FIXED) || c2869eM9705H.m9769z() == bVar2)) {
                m9963b(this.f11368h, c2869eM9705H.f11146e.f11368h, this.f11362b.f11113D.m9676c());
                m9963b(this.f11369i, c2869eM9705H.f11146e.f11369i, -this.f11362b.f11117F.m9676c());
                return;
            }
        } else {
            C2869e.b bVarM9769z = this.f11362b.m9769z();
            this.f11364d = bVarM9769z;
            if (bVarM9769z != C2869e.b.MATCH_CONSTRAINT) {
                C2869e.b bVar3 = C2869e.b.MATCH_PARENT;
                if (bVarM9769z == bVar3 && (((c2869eM9705H2 = this.f11362b.m9705H()) != null && c2869eM9705H2.m9769z() == C2869e.b.FIXED) || c2869eM9705H2.m9769z() == bVar3)) {
                    int iM9718Q = (c2869eM9705H2.m9718Q() - this.f11362b.f11113D.m9676c()) - this.f11362b.f11117F.m9676c();
                    m9963b(this.f11368h, c2869eM9705H2.f11146e.f11368h, this.f11362b.f11113D.m9676c());
                    m9963b(this.f11369i, c2869eM9705H2.f11146e.f11369i, -this.f11362b.f11117F.m9676c());
                    this.f11365e.mo9952d(iM9718Q);
                    return;
                }
                if (this.f11364d == C2869e.b.FIXED) {
                    this.f11365e.mo9952d(this.f11362b.m9718Q());
                }
            }
        }
        C2897g c2897g = this.f11365e;
        if (c2897g.f11335j) {
            C2869e c2869e2 = this.f11362b;
            if (c2869e2.f11138a) {
                C2868d[] c2868dArr = c2869e2.f11123L;
                if (c2868dArr[0].f11091d != null && c2868dArr[1].f11091d != null) {
                    if (c2869e2.m9723W()) {
                        this.f11368h.f11331f = this.f11362b.f11123L[0].m9676c();
                        this.f11369i.f11331f = -this.f11362b.f11123L[1].m9676c();
                        return;
                    }
                    C2896f c2896fM9966h = m9966h(this.f11362b.f11123L[0]);
                    if (c2896fM9966h != null) {
                        m9963b(this.f11368h, c2896fM9966h, this.f11362b.f11123L[0].m9676c());
                    }
                    C2896f c2896fM9966h2 = m9966h(this.f11362b.f11123L[1]);
                    if (c2896fM9966h2 != null) {
                        m9963b(this.f11369i, c2896fM9966h2, -this.f11362b.f11123L[1].m9676c());
                    }
                    this.f11368h.f11327b = true;
                    this.f11369i.f11327b = true;
                    return;
                }
                if (c2868dArr[0].f11091d != null) {
                    C2896f c2896fM9966h3 = m9966h(c2868dArr[0]);
                    if (c2896fM9966h3 != null) {
                        m9963b(this.f11368h, c2896fM9966h3, this.f11362b.f11123L[0].m9676c());
                        m9963b(this.f11369i, this.f11368h, this.f11365e.f11332g);
                        return;
                    }
                    return;
                }
                if (c2868dArr[1].f11091d != null) {
                    C2896f c2896fM9966h4 = m9966h(c2868dArr[1]);
                    if (c2896fM9966h4 != null) {
                        m9963b(this.f11369i, c2896fM9966h4, -this.f11362b.f11123L[1].m9676c());
                        m9963b(this.f11368h, this.f11369i, -this.f11365e.f11332g);
                        return;
                    }
                    return;
                }
                if ((c2869e2 instanceof InterfaceC2873i) || c2869e2.m9705H() == null || this.f11362b.mo9745n(C2868d.b.CENTER).f11091d != null) {
                    return;
                }
                m9963b(this.f11368h, this.f11362b.m9705H().f11146e.f11368h, this.f11362b.m9719R());
                m9963b(this.f11369i, this.f11368h, this.f11365e.f11332g);
                return;
            }
        }
        if (this.f11364d == C2869e.b.MATCH_CONSTRAINT) {
            C2869e c2869e3 = this.f11362b;
            int i4 = c2869e3.f11160l;
            if (i4 == 2) {
                C2869e c2869eM9705H3 = c2869e3.m9705H();
                if (c2869eM9705H3 != null) {
                    C2897g c2897g2 = c2869eM9705H3.f11148f.f11365e;
                    this.f11365e.f11337l.add(c2897g2);
                    c2897g2.f11336k.add(this.f11365e);
                    C2897g c2897g3 = this.f11365e;
                    c2897g3.f11327b = true;
                    c2897g3.f11336k.add(this.f11368h);
                    this.f11365e.f11336k.add(this.f11369i);
                }
            } else if (i4 == 3) {
                if (c2869e3.f11162m == 3) {
                    this.f11368h.f11326a = this;
                    this.f11369i.f11326a = this;
                    C2902l c2902l = c2869e3.f11148f;
                    c2902l.f11368h.f11326a = this;
                    c2902l.f11369i.f11326a = this;
                    c2897g.f11326a = this;
                    if (c2869e3.m9725Y()) {
                        this.f11365e.f11337l.add(this.f11362b.f11148f.f11365e);
                        this.f11362b.f11148f.f11365e.f11336k.add(this.f11365e);
                        C2902l c2902l2 = this.f11362b.f11148f;
                        c2902l2.f11365e.f11326a = this;
                        this.f11365e.f11337l.add(c2902l2.f11368h);
                        this.f11365e.f11337l.add(this.f11362b.f11148f.f11369i);
                        this.f11362b.f11148f.f11368h.f11336k.add(this.f11365e);
                        this.f11362b.f11148f.f11369i.f11336k.add(this.f11365e);
                    } else if (this.f11362b.m9723W()) {
                        this.f11362b.f11148f.f11365e.f11337l.add(this.f11365e);
                        this.f11365e.f11336k.add(this.f11362b.f11148f.f11365e);
                    } else {
                        this.f11362b.f11148f.f11365e.f11337l.add(this.f11365e);
                    }
                } else {
                    C2897g c2897g4 = c2869e3.f11148f.f11365e;
                    c2897g.f11337l.add(c2897g4);
                    c2897g4.f11336k.add(this.f11365e);
                    this.f11362b.f11148f.f11368h.f11336k.add(this.f11365e);
                    this.f11362b.f11148f.f11369i.f11336k.add(this.f11365e);
                    C2897g c2897g5 = this.f11365e;
                    c2897g5.f11327b = true;
                    c2897g5.f11336k.add(this.f11368h);
                    this.f11365e.f11336k.add(this.f11369i);
                    this.f11368h.f11337l.add(this.f11365e);
                    this.f11369i.f11337l.add(this.f11365e);
                }
            }
        }
        C2869e c2869e4 = this.f11362b;
        C2868d[] c2868dArr2 = c2869e4.f11123L;
        if (c2868dArr2[0].f11091d != null && c2868dArr2[1].f11091d != null) {
            if (c2869e4.m9723W()) {
                this.f11368h.f11331f = this.f11362b.f11123L[0].m9676c();
                this.f11369i.f11331f = -this.f11362b.f11123L[1].m9676c();
                return;
            }
            C2896f c2896fM9966h5 = m9966h(this.f11362b.f11123L[0]);
            C2896f c2896fM9966h6 = m9966h(this.f11362b.f11123L[1]);
            c2896fM9966h5.m9950b(this);
            c2896fM9966h6.m9950b(this);
            this.f11370j = AbstractC2903m.b.CENTER;
            return;
        }
        if (c2868dArr2[0].f11091d != null) {
            C2896f c2896fM9966h7 = m9966h(c2868dArr2[0]);
            if (c2896fM9966h7 != null) {
                m9963b(this.f11368h, c2896fM9966h7, this.f11362b.f11123L[0].m9676c());
                m9964c(this.f11369i, this.f11368h, 1, this.f11365e);
                return;
            }
            return;
        }
        if (c2868dArr2[1].f11091d != null) {
            C2896f c2896fM9966h8 = m9966h(c2868dArr2[1]);
            if (c2896fM9966h8 != null) {
                m9963b(this.f11369i, c2896fM9966h8, -this.f11362b.f11123L[1].m9676c());
                m9964c(this.f11368h, this.f11369i, -1, this.f11365e);
                return;
            }
            return;
        }
        if ((c2869e4 instanceof InterfaceC2873i) || c2869e4.m9705H() == null) {
            return;
        }
        m9963b(this.f11368h, this.f11362b.m9705H().f11146e.f11368h, this.f11362b.m9719R());
        m9964c(this.f11369i, this.f11368h, 1, this.f11365e);
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: e */
    public void mo9932e() {
        C2896f c2896f = this.f11368h;
        if (c2896f.f11335j) {
            this.f11362b.m9704G0(c2896f.f11332g);
        }
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: f */
    void mo9933f() {
        this.f11363c = null;
        this.f11368h.m9951c();
        this.f11369i.m9951c();
        this.f11365e.m9951c();
        this.f11367g = false;
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: m */
    boolean mo9935m() {
        return this.f11364d != C2869e.b.MATCH_CONSTRAINT || this.f11362b.f11160l == 0;
    }

    /* renamed from: r */
    void m9956r() {
        this.f11367g = false;
        this.f11368h.m9951c();
        this.f11368h.f11335j = false;
        this.f11369i.m9951c();
        this.f11369i.f11335j = false;
        this.f11365e.f11335j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f11362b.m9755s();
    }
}
