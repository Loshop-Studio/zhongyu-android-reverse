package p125o;

import java.util.Iterator;
import p121n.C2865a;
import p121n.C2869e;
import p125o.C2896f;

/* renamed from: o.i */
/* loaded from: classes.dex */
class C2899i extends AbstractC2903m {
    public C2899i(C2869e c2869e) {
        super(c2869e);
    }

    /* renamed from: q */
    private void m9954q(C2896f c2896f) {
        this.f11368h.f11336k.add(c2896f);
        c2896f.f11337l.add(this.f11368h);
    }

    @Override // p125o.AbstractC2903m, p125o.InterfaceC2894d
    /* renamed from: a */
    public void mo9930a(InterfaceC2894d interfaceC2894d) {
        C2865a c2865a = (C2865a) this.f11362b;
        int iM9660M0 = c2865a.m9660M0();
        Iterator<C2896f> it = this.f11368h.f11337l.iterator();
        int i4 = 0;
        int i5 = -1;
        while (it.hasNext()) {
            int i6 = it.next().f11332g;
            if (i5 == -1 || i6 < i5) {
                i5 = i6;
            }
            if (i4 < i6) {
                i4 = i6;
            }
        }
        if (iM9660M0 == 0 || iM9660M0 == 2) {
            this.f11368h.mo9952d(i5 + c2865a.m9661N0());
        } else {
            this.f11368h.mo9952d(i4 + c2865a.m9661N0());
        }
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: d */
    void mo9931d() {
        C2869e c2869e = this.f11362b;
        if (c2869e instanceof C2865a) {
            this.f11368h.f11327b = true;
            C2865a c2865a = (C2865a) c2869e;
            int iM9660M0 = c2865a.m9660M0();
            boolean zM9659L0 = c2865a.m9659L0();
            int i4 = 0;
            if (iM9660M0 == 0) {
                this.f11368h.f11330e = C2896f.a.LEFT;
                while (i4 < c2865a.f11271H0) {
                    C2869e c2869e2 = c2865a.f11270G0[i4];
                    if (zM9659L0 || c2869e2.m9717P() != 8) {
                        C2896f c2896f = c2869e2.f11146e.f11368h;
                        c2896f.f11336k.add(this.f11368h);
                        this.f11368h.f11337l.add(c2896f);
                    }
                    i4++;
                }
                m9954q(this.f11362b.f11146e.f11368h);
                m9954q(this.f11362b.f11146e.f11369i);
                return;
            }
            if (iM9660M0 == 1) {
                this.f11368h.f11330e = C2896f.a.RIGHT;
                while (i4 < c2865a.f11271H0) {
                    C2869e c2869e3 = c2865a.f11270G0[i4];
                    if (zM9659L0 || c2869e3.m9717P() != 8) {
                        C2896f c2896f2 = c2869e3.f11146e.f11369i;
                        c2896f2.f11336k.add(this.f11368h);
                        this.f11368h.f11337l.add(c2896f2);
                    }
                    i4++;
                }
                m9954q(this.f11362b.f11146e.f11368h);
                m9954q(this.f11362b.f11146e.f11369i);
                return;
            }
            if (iM9660M0 == 2) {
                this.f11368h.f11330e = C2896f.a.TOP;
                while (i4 < c2865a.f11271H0) {
                    C2869e c2869e4 = c2865a.f11270G0[i4];
                    if (zM9659L0 || c2869e4.m9717P() != 8) {
                        C2896f c2896f3 = c2869e4.f11148f.f11368h;
                        c2896f3.f11336k.add(this.f11368h);
                        this.f11368h.f11337l.add(c2896f3);
                    }
                    i4++;
                }
                m9954q(this.f11362b.f11148f.f11368h);
                m9954q(this.f11362b.f11148f.f11369i);
                return;
            }
            if (iM9660M0 != 3) {
                return;
            }
            this.f11368h.f11330e = C2896f.a.BOTTOM;
            while (i4 < c2865a.f11271H0) {
                C2869e c2869e5 = c2865a.f11270G0[i4];
                if (zM9659L0 || c2869e5.m9717P() != 8) {
                    C2896f c2896f4 = c2869e5.f11148f.f11369i;
                    c2896f4.f11336k.add(this.f11368h);
                    this.f11368h.f11337l.add(c2896f4);
                }
                i4++;
            }
            m9954q(this.f11362b.f11148f.f11368h);
            m9954q(this.f11362b.f11148f.f11369i);
        }
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: e */
    public void mo9932e() {
        C2869e c2869e = this.f11362b;
        if (c2869e instanceof C2865a) {
            int iM9660M0 = ((C2865a) c2869e).m9660M0();
            if (iM9660M0 == 0 || iM9660M0 == 1) {
                this.f11362b.m9704G0(this.f11368h.f11332g);
            } else {
                this.f11362b.m9706H0(this.f11368h.f11332g);
            }
        }
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: f */
    void mo9933f() {
        this.f11363c = null;
        this.f11368h.m9951c();
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: m */
    boolean mo9935m() {
        return false;
    }
}
