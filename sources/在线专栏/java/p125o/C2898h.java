package p125o;

import p121n.C2869e;
import p121n.C2872h;

/* renamed from: o.h */
/* loaded from: classes.dex */
class C2898h extends AbstractC2903m {
    public C2898h(C2869e c2869e) {
        super(c2869e);
        c2869e.f11146e.mo9933f();
        c2869e.f11148f.mo9933f();
        this.f11366f = ((C2872h) c2869e).m9851L0();
    }

    /* renamed from: q */
    private void m9953q(C2896f c2896f) {
        this.f11368h.f11336k.add(c2896f);
        c2896f.f11337l.add(this.f11368h);
    }

    @Override // p125o.AbstractC2903m, p125o.InterfaceC2894d
    /* renamed from: a */
    public void mo9930a(InterfaceC2894d interfaceC2894d) {
        C2896f c2896f = this.f11368h;
        if (c2896f.f11328c && !c2896f.f11335j) {
            this.f11368h.mo9952d((int) ((c2896f.f11337l.get(0).f11332g * ((C2872h) this.f11362b).m9854O0()) + 0.5f));
        }
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: d */
    void mo9931d() {
        C2872h c2872h = (C2872h) this.f11362b;
        int iM9852M0 = c2872h.m9852M0();
        int iM9853N0 = c2872h.m9853N0();
        c2872h.m9854O0();
        if (c2872h.m9851L0() == 1) {
            if (iM9852M0 != -1) {
                this.f11368h.f11337l.add(this.f11362b.f11127P.f11146e.f11368h);
                this.f11362b.f11127P.f11146e.f11368h.f11336k.add(this.f11368h);
                this.f11368h.f11331f = iM9852M0;
            } else if (iM9853N0 != -1) {
                this.f11368h.f11337l.add(this.f11362b.f11127P.f11146e.f11369i);
                this.f11362b.f11127P.f11146e.f11369i.f11336k.add(this.f11368h);
                this.f11368h.f11331f = -iM9853N0;
            } else {
                C2896f c2896f = this.f11368h;
                c2896f.f11327b = true;
                c2896f.f11337l.add(this.f11362b.f11127P.f11146e.f11369i);
                this.f11362b.f11127P.f11146e.f11369i.f11336k.add(this.f11368h);
            }
            m9953q(this.f11362b.f11146e.f11368h);
            m9953q(this.f11362b.f11146e.f11369i);
            return;
        }
        if (iM9852M0 != -1) {
            this.f11368h.f11337l.add(this.f11362b.f11127P.f11148f.f11368h);
            this.f11362b.f11127P.f11148f.f11368h.f11336k.add(this.f11368h);
            this.f11368h.f11331f = iM9852M0;
        } else if (iM9853N0 != -1) {
            this.f11368h.f11337l.add(this.f11362b.f11127P.f11148f.f11369i);
            this.f11362b.f11127P.f11148f.f11369i.f11336k.add(this.f11368h);
            this.f11368h.f11331f = -iM9853N0;
        } else {
            C2896f c2896f2 = this.f11368h;
            c2896f2.f11327b = true;
            c2896f2.f11337l.add(this.f11362b.f11127P.f11148f.f11369i);
            this.f11362b.f11127P.f11148f.f11369i.f11336k.add(this.f11368h);
        }
        m9953q(this.f11362b.f11148f.f11368h);
        m9953q(this.f11362b.f11148f.f11369i);
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: e */
    public void mo9932e() {
        if (((C2872h) this.f11362b).m9851L0() == 1) {
            this.f11362b.m9704G0(this.f11368h.f11332g);
        } else {
            this.f11362b.m9706H0(this.f11368h.f11332g);
        }
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: f */
    void mo9933f() {
        this.f11368h.m9951c();
    }

    @Override // p125o.AbstractC2903m
    /* renamed from: m */
    boolean mo9935m() {
        return false;
    }
}
