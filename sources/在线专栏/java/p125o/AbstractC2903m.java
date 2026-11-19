package p125o;

import p121n.C2868d;
import p121n.C2869e;

/* renamed from: o.m */
/* loaded from: classes.dex */
public abstract class AbstractC2903m implements InterfaceC2894d {

    /* renamed from: a */
    public int f11361a;

    /* renamed from: b */
    C2869e f11362b;

    /* renamed from: c */
    C2901k f11363c;

    /* renamed from: d */
    protected C2869e.b f11364d;

    /* renamed from: e */
    C2897g f11365e = new C2897g(this);

    /* renamed from: f */
    public int f11366f = 0;

    /* renamed from: g */
    boolean f11367g = false;

    /* renamed from: h */
    public C2896f f11368h = new C2896f(this);

    /* renamed from: i */
    public C2896f f11369i = new C2896f(this);

    /* renamed from: j */
    protected b f11370j = b.NONE;

    /* renamed from: o.m$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11371a;

        static {
            int[] iArr = new int[C2868d.b.values().length];
            f11371a = iArr;
            try {
                iArr[C2868d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11371a[C2868d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11371a[C2868d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11371a[C2868d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11371a[C2868d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: o.m$b */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC2903m(C2869e c2869e) {
        this.f11362b = c2869e;
    }

    /* renamed from: l */
    private void m9962l(int i4, int i5) {
        int i6 = this.f11361a;
        if (i6 == 0) {
            this.f11365e.mo9952d(m9965g(i5, i4));
            return;
        }
        if (i6 == 1) {
            this.f11365e.mo9952d(Math.min(m9965g(this.f11365e.f11347m, i4), i5));
            return;
        }
        if (i6 == 2) {
            C2869e c2869eM9705H = this.f11362b.m9705H();
            if (c2869eM9705H != null) {
                if ((i4 == 0 ? c2869eM9705H.f11146e : c2869eM9705H.f11148f).f11365e.f11335j) {
                    C2869e c2869e = this.f11362b;
                    this.f11365e.mo9952d(m9965g((int) ((r9.f11332g * (i4 == 0 ? c2869e.f11170q : c2869e.f11176t)) + 0.5f), i4));
                    return;
                }
                return;
            }
            return;
        }
        if (i6 != 3) {
            return;
        }
        C2869e c2869e2 = this.f11362b;
        AbstractC2903m abstractC2903m = c2869e2.f11146e;
        C2869e.b bVar = abstractC2903m.f11364d;
        C2869e.b bVar2 = C2869e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && abstractC2903m.f11361a == 3) {
            C2902l c2902l = c2869e2.f11148f;
            if (c2902l.f11364d == bVar2 && c2902l.f11361a == 3) {
                return;
            }
        }
        if (i4 == 0) {
            abstractC2903m = c2869e2.f11148f;
        }
        if (abstractC2903m.f11365e.f11335j) {
            float fM9759u = c2869e2.m9759u();
            this.f11365e.mo9952d(i4 == 1 ? (int) ((abstractC2903m.f11365e.f11332g / fM9759u) + 0.5f) : (int) ((fM9759u * abstractC2903m.f11365e.f11332g) + 0.5f));
        }
    }

    @Override // p125o.InterfaceC2894d
    /* renamed from: a */
    public void mo9930a(InterfaceC2894d interfaceC2894d) {
    }

    /* renamed from: b */
    protected final void m9963b(C2896f c2896f, C2896f c2896f2, int i4) {
        c2896f.f11337l.add(c2896f2);
        c2896f.f11331f = i4;
        c2896f2.f11336k.add(c2896f);
    }

    /* renamed from: c */
    protected final void m9964c(C2896f c2896f, C2896f c2896f2, int i4, C2897g c2897g) {
        c2896f.f11337l.add(c2896f2);
        c2896f.f11337l.add(this.f11365e);
        c2896f.f11333h = i4;
        c2896f.f11334i = c2897g;
        c2896f2.f11336k.add(c2896f);
        c2897g.f11336k.add(c2896f);
    }

    /* renamed from: d */
    abstract void mo9931d();

    /* renamed from: e */
    abstract void mo9932e();

    /* renamed from: f */
    abstract void mo9933f();

    /* renamed from: g */
    protected final int m9965g(int i4, int i5) {
        int iMax;
        if (i5 == 0) {
            C2869e c2869e = this.f11362b;
            int i6 = c2869e.f11168p;
            iMax = Math.max(c2869e.f11166o, i4);
            if (i6 > 0) {
                iMax = Math.min(i6, i4);
            }
            if (iMax == i4) {
                return i4;
            }
        } else {
            C2869e c2869e2 = this.f11362b;
            int i7 = c2869e2.f11174s;
            iMax = Math.max(c2869e2.f11172r, i4);
            if (i7 > 0) {
                iMax = Math.min(i7, i4);
            }
            if (iMax == i4) {
                return i4;
            }
        }
        return iMax;
    }

    /* renamed from: h */
    protected final C2896f m9966h(C2868d c2868d) {
        C2868d c2868d2 = c2868d.f11091d;
        if (c2868d2 == null) {
            return null;
        }
        C2869e c2869e = c2868d2.f11089b;
        int i4 = a.f11371a[c2868d2.f11090c.ordinal()];
        if (i4 == 1) {
            return c2869e.f11146e.f11368h;
        }
        if (i4 == 2) {
            return c2869e.f11146e.f11369i;
        }
        if (i4 == 3) {
            return c2869e.f11148f.f11368h;
        }
        if (i4 == 4) {
            return c2869e.f11148f.f11358k;
        }
        if (i4 != 5) {
            return null;
        }
        return c2869e.f11148f.f11369i;
    }

    /* renamed from: i */
    protected final C2896f m9967i(C2868d c2868d, int i4) {
        C2868d c2868d2 = c2868d.f11091d;
        if (c2868d2 == null) {
            return null;
        }
        C2869e c2869e = c2868d2.f11089b;
        AbstractC2903m abstractC2903m = i4 == 0 ? c2869e.f11146e : c2869e.f11148f;
        int i5 = a.f11371a[c2868d2.f11090c.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 5) {
                        return null;
                    }
                }
            }
            return abstractC2903m.f11369i;
        }
        return abstractC2903m.f11368h;
    }

    /* renamed from: j */
    public long mo9934j() {
        if (this.f11365e.f11335j) {
            return r0.f11332g;
        }
        return 0L;
    }

    /* renamed from: k */
    public boolean m9968k() {
        return this.f11367g;
    }

    /* renamed from: m */
    abstract boolean mo9935m();

    /* renamed from: n */
    protected void m9969n(InterfaceC2894d interfaceC2894d, C2868d c2868d, C2868d c2868d2, int i4) {
        C2896f c2896fM9966h = m9966h(c2868d);
        C2896f c2896fM9966h2 = m9966h(c2868d2);
        if (c2896fM9966h.f11335j && c2896fM9966h2.f11335j) {
            int iM9676c = c2896fM9966h.f11332g + c2868d.m9676c();
            int iM9676c2 = c2896fM9966h2.f11332g - c2868d2.m9676c();
            int i5 = iM9676c2 - iM9676c;
            if (!this.f11365e.f11335j && this.f11364d == C2869e.b.MATCH_CONSTRAINT) {
                m9962l(i4, i5);
            }
            C2897g c2897g = this.f11365e;
            if (c2897g.f11335j) {
                if (c2897g.f11332g == i5) {
                    this.f11368h.mo9952d(iM9676c);
                    this.f11369i.mo9952d(iM9676c2);
                    return;
                }
                C2869e c2869e = this.f11362b;
                float fM9765x = i4 == 0 ? c2869e.m9765x() : c2869e.m9713L();
                if (c2896fM9966h == c2896fM9966h2) {
                    iM9676c = c2896fM9966h.f11332g;
                    iM9676c2 = c2896fM9966h2.f11332g;
                    fM9765x = 0.5f;
                }
                this.f11368h.mo9952d((int) (iM9676c + 0.5f + (((iM9676c2 - iM9676c) - this.f11365e.f11332g) * fM9765x)));
                this.f11369i.mo9952d(this.f11368h.f11332g + this.f11365e.f11332g);
            }
        }
    }

    /* renamed from: o */
    protected void m9970o(InterfaceC2894d interfaceC2894d) {
    }

    /* renamed from: p */
    protected void m9971p(InterfaceC2894d interfaceC2894d) {
    }
}
