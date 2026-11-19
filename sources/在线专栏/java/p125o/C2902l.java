package p125o;

import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import p121n.C2868d;
import p121n.C2869e;
import p121n.InterfaceC2873i;
import p125o.AbstractC2903m;
import p125o.C2896f;

/* renamed from: o.l */
/* loaded from: classes.dex */
public class C2902l extends AbstractC2903m {

    /* renamed from: k */
    public C2896f f11358k;

    /* renamed from: l */
    C2897g f11359l;

    /* renamed from: o.l$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11360a;

        static {
            int[] iArr = new int[AbstractC2903m.b.values().length];
            f11360a = iArr;
            try {
                iArr[AbstractC2903m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11360a[AbstractC2903m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11360a[AbstractC2903m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C2902l(C2869e c2869e) {
        super(c2869e);
        C2896f c2896f = new C2896f(this);
        this.f11358k = c2896f;
        this.f11359l = null;
        this.f11368h.f11330e = C2896f.a.TOP;
        this.f11369i.f11330e = C2896f.a.BOTTOM;
        c2896f.f11330e = C2896f.a.BASELINE;
        this.f11366f = 1;
    }

    @Override // p125o.AbstractC2903m, p125o.InterfaceC2894d
    /* renamed from: a */
    public void mo9930a(InterfaceC2894d interfaceC2894d) {
        float f4;
        float fM9759u;
        float fM9759u2;
        int i4;
        int i5 = a.f11360a[this.f11370j.ordinal()];
        if (i5 == 1) {
            m9971p(interfaceC2894d);
        } else if (i5 == 2) {
            m9970o(interfaceC2894d);
        } else if (i5 == 3) {
            C2869e c2869e = this.f11362b;
            m9969n(interfaceC2894d, c2869e.f11115E, c2869e.f11118G, 1);
            return;
        }
        C2897g c2897g = this.f11365e;
        if (c2897g.f11328c && !c2897g.f11335j && this.f11364d == C2869e.b.MATCH_CONSTRAINT) {
            C2869e c2869e2 = this.f11362b;
            int i6 = c2869e2.f11162m;
            if (i6 == 2) {
                C2869e c2869eM9705H = c2869e2.m9705H();
                if (c2869eM9705H != null) {
                    if (c2869eM9705H.f11148f.f11365e.f11335j) {
                        this.f11365e.mo9952d((int) ((r7.f11332g * this.f11362b.f11176t) + 0.5f));
                    }
                }
            } else if (i6 == 3 && c2869e2.f11146e.f11365e.f11335j) {
                int iM9761v = c2869e2.m9761v();
                if (iM9761v == -1) {
                    C2869e c2869e3 = this.f11362b;
                    f4 = c2869e3.f11146e.f11365e.f11332g;
                    fM9759u = c2869e3.m9759u();
                } else if (iM9761v == 0) {
                    fM9759u2 = r7.f11146e.f11365e.f11332g * this.f11362b.m9759u();
                    i4 = (int) (fM9759u2 + 0.5f);
                    this.f11365e.mo9952d(i4);
                } else if (iM9761v != 1) {
                    i4 = 0;
                    this.f11365e.mo9952d(i4);
                } else {
                    C2869e c2869e4 = this.f11362b;
                    f4 = c2869e4.f11146e.f11365e.f11332g;
                    fM9759u = c2869e4.m9759u();
                }
                fM9759u2 = f4 / fM9759u;
                i4 = (int) (fM9759u2 + 0.5f);
                this.f11365e.mo9952d(i4);
            }
        }
        C2896f c2896f = this.f11368h;
        if (c2896f.f11328c) {
            C2896f c2896f2 = this.f11369i;
            if (c2896f2.f11328c) {
                if (c2896f.f11335j && c2896f2.f11335j && this.f11365e.f11335j) {
                    return;
                }
                if (!this.f11365e.f11335j && this.f11364d == C2869e.b.MATCH_CONSTRAINT) {
                    C2869e c2869e5 = this.f11362b;
                    if (c2869e5.f11160l == 0 && !c2869e5.m9725Y()) {
                        C2896f c2896f3 = this.f11368h.f11337l.get(0);
                        C2896f c2896f4 = this.f11369i.f11337l.get(0);
                        int i7 = c2896f3.f11332g;
                        C2896f c2896f5 = this.f11368h;
                        int i8 = i7 + c2896f5.f11331f;
                        int i9 = c2896f4.f11332g + this.f11369i.f11331f;
                        c2896f5.mo9952d(i8);
                        this.f11369i.mo9952d(i9);
                        this.f11365e.mo9952d(i9 - i8);
                        return;
                    }
                }
                if (!this.f11365e.f11335j && this.f11364d == C2869e.b.MATCH_CONSTRAINT && this.f11361a == 1 && this.f11368h.f11337l.size() > 0 && this.f11369i.f11337l.size() > 0) {
                    C2896f c2896f6 = this.f11368h.f11337l.get(0);
                    int i10 = (this.f11369i.f11337l.get(0).f11332g + this.f11369i.f11331f) - (c2896f6.f11332g + this.f11368h.f11331f);
                    C2897g c2897g2 = this.f11365e;
                    int i11 = c2897g2.f11347m;
                    if (i10 < i11) {
                        c2897g2.mo9952d(i10);
                    } else {
                        c2897g2.mo9952d(i11);
                    }
                }
                if (this.f11365e.f11335j && this.f11368h.f11337l.size() > 0 && this.f11369i.f11337l.size() > 0) {
                    C2896f c2896f7 = this.f11368h.f11337l.get(0);
                    C2896f c2896f8 = this.f11369i.f11337l.get(0);
                    int i12 = c2896f7.f11332g + this.f11368h.f11331f;
                    int i13 = c2896f8.f11332g + this.f11369i.f11331f;
                    float fM9713L = this.f11362b.m9713L();
                    if (c2896f7 == c2896f8) {
                        i12 = c2896f7.f11332g;
                        i13 = c2896f8.f11332g;
                        fM9713L = 0.5f;
                    }
                    this.f11368h.mo9952d((int) (i12 + 0.5f + (((i13 - i12) - this.f11365e.f11332g) * fM9713L)));
                    this.f11369i.mo9952d(this.f11368h.f11332g + this.f11365e.f11332g);
                }
            }
        }
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: d */
    void mo9931d() {
        C2869e c2869eM9705H;
        C2869e c2869eM9705H2;
        C2869e c2869e = this.f11362b;
        if (c2869e.f11138a) {
            this.f11365e.mo9952d(c2869e.m9763w());
        }
        if (!this.f11365e.f11335j) {
            this.f11364d = this.f11362b.m9715N();
            if (this.f11362b.m9721T()) {
                this.f11359l = new C2891a(this);
            }
            C2869e.b bVar = this.f11364d;
            if (bVar != C2869e.b.MATCH_CONSTRAINT) {
                if (bVar == C2869e.b.MATCH_PARENT && (c2869eM9705H2 = this.f11362b.m9705H()) != null && c2869eM9705H2.m9715N() == C2869e.b.FIXED) {
                    int iM9763w = (c2869eM9705H2.m9763w() - this.f11362b.f11115E.m9676c()) - this.f11362b.f11118G.m9676c();
                    m9963b(this.f11368h, c2869eM9705H2.f11148f.f11368h, this.f11362b.f11115E.m9676c());
                    m9963b(this.f11369i, c2869eM9705H2.f11148f.f11369i, -this.f11362b.f11118G.m9676c());
                    this.f11365e.mo9952d(iM9763w);
                    return;
                }
                if (this.f11364d == C2869e.b.FIXED) {
                    this.f11365e.mo9952d(this.f11362b.m9763w());
                }
            }
        } else if (this.f11364d == C2869e.b.MATCH_PARENT && (c2869eM9705H = this.f11362b.m9705H()) != null && c2869eM9705H.m9715N() == C2869e.b.FIXED) {
            m9963b(this.f11368h, c2869eM9705H.f11148f.f11368h, this.f11362b.f11115E.m9676c());
            m9963b(this.f11369i, c2869eM9705H.f11148f.f11369i, -this.f11362b.f11118G.m9676c());
            return;
        }
        C2897g c2897g = this.f11365e;
        boolean z3 = c2897g.f11335j;
        if (z3) {
            C2869e c2869e2 = this.f11362b;
            if (c2869e2.f11138a) {
                C2868d[] c2868dArr = c2869e2.f11123L;
                if (c2868dArr[2].f11091d != null && c2868dArr[3].f11091d != null) {
                    if (c2869e2.m9725Y()) {
                        this.f11368h.f11331f = this.f11362b.f11123L[2].m9676c();
                        this.f11369i.f11331f = -this.f11362b.f11123L[3].m9676c();
                    } else {
                        C2896f c2896fM9966h = m9966h(this.f11362b.f11123L[2]);
                        if (c2896fM9966h != null) {
                            m9963b(this.f11368h, c2896fM9966h, this.f11362b.f11123L[2].m9676c());
                        }
                        C2896f c2896fM9966h2 = m9966h(this.f11362b.f11123L[3]);
                        if (c2896fM9966h2 != null) {
                            m9963b(this.f11369i, c2896fM9966h2, -this.f11362b.f11123L[3].m9676c());
                        }
                        this.f11368h.f11327b = true;
                        this.f11369i.f11327b = true;
                    }
                    if (this.f11362b.m9721T()) {
                        m9963b(this.f11358k, this.f11368h, this.f11362b.m9747o());
                        return;
                    }
                    return;
                }
                if (c2868dArr[2].f11091d != null) {
                    C2896f c2896fM9966h3 = m9966h(c2868dArr[2]);
                    if (c2896fM9966h3 != null) {
                        m9963b(this.f11368h, c2896fM9966h3, this.f11362b.f11123L[2].m9676c());
                        m9963b(this.f11369i, this.f11368h, this.f11365e.f11332g);
                        if (this.f11362b.m9721T()) {
                            m9963b(this.f11358k, this.f11368h, this.f11362b.m9747o());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (c2868dArr[3].f11091d != null) {
                    C2896f c2896fM9966h4 = m9966h(c2868dArr[3]);
                    if (c2896fM9966h4 != null) {
                        m9963b(this.f11369i, c2896fM9966h4, -this.f11362b.f11123L[3].m9676c());
                        m9963b(this.f11368h, this.f11369i, -this.f11365e.f11332g);
                    }
                    if (this.f11362b.m9721T()) {
                        m9963b(this.f11358k, this.f11368h, this.f11362b.m9747o());
                        return;
                    }
                    return;
                }
                if (c2868dArr[4].f11091d != null) {
                    C2896f c2896fM9966h5 = m9966h(c2868dArr[4]);
                    if (c2896fM9966h5 != null) {
                        m9963b(this.f11358k, c2896fM9966h5, 0);
                        m9963b(this.f11368h, this.f11358k, -this.f11362b.m9747o());
                        m9963b(this.f11369i, this.f11368h, this.f11365e.f11332g);
                        return;
                    }
                    return;
                }
                if ((c2869e2 instanceof InterfaceC2873i) || c2869e2.m9705H() == null || this.f11362b.mo9745n(C2868d.b.CENTER).f11091d != null) {
                    return;
                }
                m9963b(this.f11368h, this.f11362b.m9705H().f11148f.f11368h, this.f11362b.m9720S());
                m9963b(this.f11369i, this.f11368h, this.f11365e.f11332g);
                if (this.f11362b.m9721T()) {
                    m9963b(this.f11358k, this.f11368h, this.f11362b.m9747o());
                    return;
                }
                return;
            }
        }
        if (z3 || this.f11364d != C2869e.b.MATCH_CONSTRAINT) {
            c2897g.m9950b(this);
        } else {
            C2869e c2869e3 = this.f11362b;
            int i4 = c2869e3.f11162m;
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
            } else if (i4 == 3 && !c2869e3.m9725Y()) {
                C2869e c2869e4 = this.f11362b;
                if (c2869e4.f11160l != 3) {
                    C2897g c2897g4 = c2869e4.f11146e.f11365e;
                    this.f11365e.f11337l.add(c2897g4);
                    c2897g4.f11336k.add(this.f11365e);
                    C2897g c2897g5 = this.f11365e;
                    c2897g5.f11327b = true;
                    c2897g5.f11336k.add(this.f11368h);
                    this.f11365e.f11336k.add(this.f11369i);
                }
            }
        }
        C2869e c2869e5 = this.f11362b;
        C2868d[] c2868dArr2 = c2869e5.f11123L;
        if (c2868dArr2[2].f11091d != null && c2868dArr2[3].f11091d != null) {
            if (c2869e5.m9725Y()) {
                this.f11368h.f11331f = this.f11362b.f11123L[2].m9676c();
                this.f11369i.f11331f = -this.f11362b.f11123L[3].m9676c();
            } else {
                C2896f c2896fM9966h6 = m9966h(this.f11362b.f11123L[2]);
                C2896f c2896fM9966h7 = m9966h(this.f11362b.f11123L[3]);
                c2896fM9966h6.m9950b(this);
                c2896fM9966h7.m9950b(this);
                this.f11370j = AbstractC2903m.b.CENTER;
            }
            if (this.f11362b.m9721T()) {
                m9964c(this.f11358k, this.f11368h, 1, this.f11359l);
            }
        } else if (c2868dArr2[2].f11091d != null) {
            C2896f c2896fM9966h8 = m9966h(c2868dArr2[2]);
            if (c2896fM9966h8 != null) {
                m9963b(this.f11368h, c2896fM9966h8, this.f11362b.f11123L[2].m9676c());
                m9964c(this.f11369i, this.f11368h, 1, this.f11365e);
                if (this.f11362b.m9721T()) {
                    m9964c(this.f11358k, this.f11368h, 1, this.f11359l);
                }
                C2869e.b bVar2 = this.f11364d;
                C2869e.b bVar3 = C2869e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f11362b.m9759u() > IGoodView.DEFAULT_TO_ALPHA) {
                    C2900j c2900j = this.f11362b.f11146e;
                    if (c2900j.f11364d == bVar3) {
                        c2900j.f11365e.f11336k.add(this.f11365e);
                        this.f11365e.f11337l.add(this.f11362b.f11146e.f11365e);
                        this.f11365e.f11326a = this;
                    }
                }
            }
        } else if (c2868dArr2[3].f11091d != null) {
            C2896f c2896fM9966h9 = m9966h(c2868dArr2[3]);
            if (c2896fM9966h9 != null) {
                m9963b(this.f11369i, c2896fM9966h9, -this.f11362b.f11123L[3].m9676c());
                m9964c(this.f11368h, this.f11369i, -1, this.f11365e);
                if (this.f11362b.m9721T()) {
                    m9964c(this.f11358k, this.f11368h, 1, this.f11359l);
                }
            }
        } else if (c2868dArr2[4].f11091d != null) {
            C2896f c2896fM9966h10 = m9966h(c2868dArr2[4]);
            if (c2896fM9966h10 != null) {
                m9963b(this.f11358k, c2896fM9966h10, 0);
                m9964c(this.f11368h, this.f11358k, -1, this.f11359l);
                m9964c(this.f11369i, this.f11368h, 1, this.f11365e);
            }
        } else if (!(c2869e5 instanceof InterfaceC2873i) && c2869e5.m9705H() != null) {
            m9963b(this.f11368h, this.f11362b.m9705H().f11148f.f11368h, this.f11362b.m9720S());
            m9964c(this.f11369i, this.f11368h, 1, this.f11365e);
            if (this.f11362b.m9721T()) {
                m9964c(this.f11358k, this.f11368h, 1, this.f11359l);
            }
            C2869e.b bVar4 = this.f11364d;
            C2869e.b bVar5 = C2869e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.f11362b.m9759u() > IGoodView.DEFAULT_TO_ALPHA) {
                C2900j c2900j2 = this.f11362b.f11146e;
                if (c2900j2.f11364d == bVar5) {
                    c2900j2.f11365e.f11336k.add(this.f11365e);
                    this.f11365e.f11337l.add(this.f11362b.f11146e.f11365e);
                    this.f11365e.f11326a = this;
                }
            }
        }
        if (this.f11365e.f11337l.size() == 0) {
            this.f11365e.f11328c = true;
        }
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: e */
    public void mo9932e() {
        C2896f c2896f = this.f11368h;
        if (c2896f.f11335j) {
            this.f11362b.m9706H0(c2896f.f11332g);
        }
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: f */
    void mo9933f() {
        this.f11363c = null;
        this.f11368h.m9951c();
        this.f11369i.m9951c();
        this.f11358k.m9951c();
        this.f11365e.m9951c();
        this.f11367g = false;
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: m */
    boolean mo9935m() {
        return this.f11364d != C2869e.b.MATCH_CONSTRAINT || this.f11362b.f11162m == 0;
    }

    /* renamed from: q */
    void m9961q() {
        this.f11367g = false;
        this.f11368h.m9951c();
        this.f11368h.f11335j = false;
        this.f11369i.m9951c();
        this.f11369i.f11335j = false;
        this.f11358k.m9951c();
        this.f11358k.f11335j = false;
        this.f11365e.f11335j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f11362b.m9755s();
    }
}
