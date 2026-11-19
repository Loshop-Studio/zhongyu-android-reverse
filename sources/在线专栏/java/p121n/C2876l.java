package p121n;

import p121n.C2869e;
import p125o.C2892b;

/* renamed from: n.l */
/* loaded from: classes.dex */
public class C2876l extends C2874j {

    /* renamed from: I0 */
    private int f11273I0 = 0;

    /* renamed from: J0 */
    private int f11274J0 = 0;

    /* renamed from: K0 */
    private int f11275K0 = 0;

    /* renamed from: L0 */
    private int f11276L0 = 0;

    /* renamed from: M0 */
    private int f11277M0 = 0;

    /* renamed from: N0 */
    private int f11278N0 = 0;

    /* renamed from: O0 */
    private int f11279O0 = 0;

    /* renamed from: P0 */
    private int f11280P0 = 0;

    /* renamed from: Q0 */
    private boolean f11281Q0 = false;

    /* renamed from: R0 */
    private int f11282R0 = 0;

    /* renamed from: S0 */
    private int f11283S0 = 0;

    /* renamed from: T0 */
    protected C2892b.a f11284T0 = new C2892b.a();

    /* renamed from: U0 */
    C2892b.b f11285U0 = null;

    /* renamed from: L0 */
    public void m9864L0(boolean z3) {
        int i4 = this.f11277M0;
        if (i4 > 0 || this.f11278N0 > 0) {
            if (z3) {
                this.f11279O0 = this.f11278N0;
                this.f11280P0 = i4;
            } else {
                this.f11279O0 = i4;
                this.f11280P0 = this.f11278N0;
            }
        }
    }

    /* renamed from: M0 */
    public void m9865M0() {
        for (int i4 = 0; i4 < this.f11271H0; i4++) {
            C2869e c2869e = this.f11270G0[i4];
            if (c2869e != null) {
                c2869e.m9754r0(true);
            }
        }
    }

    /* renamed from: N0 */
    public int m9866N0() {
        return this.f11283S0;
    }

    /* renamed from: O0 */
    public int m9867O0() {
        return this.f11282R0;
    }

    /* renamed from: P0 */
    public int m9868P0() {
        return this.f11274J0;
    }

    /* renamed from: Q0 */
    public int m9869Q0() {
        return this.f11279O0;
    }

    /* renamed from: R0 */
    public int m9870R0() {
        return this.f11280P0;
    }

    /* renamed from: S0 */
    public int m9871S0() {
        return this.f11273I0;
    }

    /* renamed from: T0 */
    public void mo9834T0(int i4, int i5, int i6, int i7) {
    }

    /* renamed from: U0 */
    protected void m9872U0(C2869e c2869e, C2869e.b bVar, int i4, C2869e.b bVar2, int i5) {
        while (this.f11285U0 == null && m9705H() != null) {
            this.f11285U0 = ((C2870f) m9705H()).m9780W0();
        }
        C2892b.a aVar = this.f11284T0;
        aVar.f11305a = bVar;
        aVar.f11306b = bVar2;
        aVar.f11307c = i4;
        aVar.f11308d = i5;
        this.f11285U0.mo1622b(c2869e, aVar);
        c2869e.m9702F0(this.f11284T0.f11309e);
        c2869e.m9737i0(this.f11284T0.f11310f);
        c2869e.m9735h0(this.f11284T0.f11312h);
        c2869e.m9729c0(this.f11284T0.f11311g);
    }

    /* renamed from: V0 */
    protected boolean m9873V0() {
        C2869e c2869e = this.f11127P;
        C2892b.b bVarM9780W0 = c2869e != null ? ((C2870f) c2869e).m9780W0() : null;
        if (bVarM9780W0 == null) {
            return false;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.f11271H0) {
                return true;
            }
            C2869e c2869e2 = this.f11270G0[i4];
            if (c2869e2 != null && !(c2869e2 instanceof C2872h)) {
                C2869e.b bVarM9757t = c2869e2.m9757t(0);
                C2869e.b bVarM9757t2 = c2869e2.m9757t(1);
                C2869e.b bVar = C2869e.b.MATCH_CONSTRAINT;
                if (!(bVarM9757t == bVar && c2869e2.f11160l != 1 && bVarM9757t2 == bVar && c2869e2.f11162m != 1)) {
                    if (bVarM9757t == bVar) {
                        bVarM9757t = C2869e.b.WRAP_CONTENT;
                    }
                    if (bVarM9757t2 == bVar) {
                        bVarM9757t2 = C2869e.b.WRAP_CONTENT;
                    }
                    C2892b.a aVar = this.f11284T0;
                    aVar.f11305a = bVarM9757t;
                    aVar.f11306b = bVarM9757t2;
                    aVar.f11307c = c2869e2.m9718Q();
                    this.f11284T0.f11308d = c2869e2.m9763w();
                    bVarM9780W0.mo1622b(c2869e2, this.f11284T0);
                    c2869e2.m9702F0(this.f11284T0.f11309e);
                    c2869e2.m9737i0(this.f11284T0.f11310f);
                    c2869e2.m9729c0(this.f11284T0.f11311g);
                }
            }
            i4++;
        }
    }

    /* renamed from: W0 */
    public boolean m9874W0() {
        return this.f11281Q0;
    }

    /* renamed from: X0 */
    protected void m9875X0(boolean z3) {
        this.f11281Q0 = z3;
    }

    /* renamed from: Y0 */
    public void m9876Y0(int i4, int i5) {
        this.f11282R0 = i4;
        this.f11283S0 = i5;
    }

    /* renamed from: Z0 */
    public void m9877Z0(int i4) {
        this.f11275K0 = i4;
        this.f11273I0 = i4;
        this.f11276L0 = i4;
        this.f11274J0 = i4;
        this.f11277M0 = i4;
        this.f11278N0 = i4;
    }

    @Override // p121n.C2874j, p121n.InterfaceC2873i
    /* renamed from: a */
    public void mo9859a(C2870f c2870f) {
        m9865M0();
    }

    /* renamed from: a1 */
    public void m9878a1(int i4) {
        this.f11274J0 = i4;
    }

    /* renamed from: b1 */
    public void m9879b1(int i4) {
        this.f11278N0 = i4;
    }

    /* renamed from: c1 */
    public void m9880c1(int i4) {
        this.f11275K0 = i4;
        this.f11279O0 = i4;
    }

    /* renamed from: d1 */
    public void m9881d1(int i4) {
        this.f11276L0 = i4;
        this.f11280P0 = i4;
    }

    /* renamed from: e1 */
    public void m9882e1(int i4) {
        this.f11277M0 = i4;
        this.f11279O0 = i4;
        this.f11280P0 = i4;
    }

    /* renamed from: f1 */
    public void m9883f1(int i4) {
        this.f11273I0 = i4;
    }
}
