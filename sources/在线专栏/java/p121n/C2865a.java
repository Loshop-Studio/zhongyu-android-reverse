package p121n;

import java.util.HashMap;
import p117m.C2852d;
import p117m.C2857i;
import p121n.C2869e;

/* renamed from: n.a */
/* loaded from: classes.dex */
public class C2865a extends C2874j {

    /* renamed from: I0 */
    private int f11063I0 = 0;

    /* renamed from: J0 */
    private boolean f11064J0 = true;

    /* renamed from: K0 */
    private int f11065K0 = 0;

    /* renamed from: L0 */
    public boolean m9659L0() {
        return this.f11064J0;
    }

    /* renamed from: M0 */
    public int m9660M0() {
        return this.f11063I0;
    }

    /* renamed from: N0 */
    public int m9661N0() {
        return this.f11065K0;
    }

    /* renamed from: O0 */
    protected void m9662O0() {
        for (int i4 = 0; i4 < this.f11271H0; i4++) {
            C2869e c2869e = this.f11270G0[i4];
            int i5 = this.f11063I0;
            if (i5 == 0 || i5 == 1) {
                c2869e.m9750p0(0, true);
            } else if (i5 == 2 || i5 == 3) {
                c2869e.m9750p0(1, true);
            }
        }
    }

    /* renamed from: P0 */
    public void m9663P0(boolean z3) {
        this.f11064J0 = z3;
    }

    /* renamed from: Q0 */
    public void m9664Q0(int i4) {
        this.f11063I0 = i4;
    }

    /* renamed from: R0 */
    public void m9665R0(int i4) {
        this.f11065K0 = i4;
    }

    @Override // p121n.C2869e
    /* renamed from: f */
    public void mo9666f(C2852d c2852d) {
        C2868d[] c2868dArr;
        boolean z3;
        int i4;
        int i5;
        int i6;
        C2868d[] c2868dArr2 = this.f11123L;
        c2868dArr2[0] = this.f11113D;
        c2868dArr2[2] = this.f11115E;
        c2868dArr2[1] = this.f11117F;
        c2868dArr2[3] = this.f11118G;
        int i7 = 0;
        while (true) {
            c2868dArr = this.f11123L;
            if (i7 >= c2868dArr.length) {
                break;
            }
            c2868dArr[i7].f11094g = c2852d.m9619q(c2868dArr[i7]);
            i7++;
        }
        int i8 = this.f11063I0;
        if (i8 < 0 || i8 >= 4) {
            return;
        }
        C2868d c2868d = c2868dArr[i8];
        for (int i9 = 0; i9 < this.f11271H0; i9++) {
            C2869e c2869e = this.f11270G0[i9];
            if ((this.f11064J0 || c2869e.mo9667g()) && ((((i5 = this.f11063I0) == 0 || i5 == 1) && c2869e.m9769z() == C2869e.b.MATCH_CONSTRAINT && c2869e.f11113D.f11091d != null && c2869e.f11117F.f11091d != null) || (((i6 = this.f11063I0) == 2 || i6 == 3) && c2869e.m9715N() == C2869e.b.MATCH_CONSTRAINT && c2869e.f11115E.f11091d != null && c2869e.f11118G.f11091d != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = this.f11113D.m9682i() || this.f11117F.m9682i();
        boolean z5 = this.f11115E.m9682i() || this.f11118G.m9682i();
        int i10 = !z3 && (((i4 = this.f11063I0) == 0 && z4) || ((i4 == 2 && z5) || ((i4 == 1 && z4) || (i4 == 3 && z5)))) ? 5 : 4;
        for (int i11 = 0; i11 < this.f11271H0; i11++) {
            C2869e c2869e2 = this.f11270G0[i11];
            if (this.f11064J0 || c2869e2.mo9667g()) {
                C2857i c2857iM9619q = c2852d.m9619q(c2869e2.f11123L[this.f11063I0]);
                C2868d[] c2868dArr3 = c2869e2.f11123L;
                int i12 = this.f11063I0;
                c2868dArr3[i12].f11094g = c2857iM9619q;
                int i13 = (c2868dArr3[i12].f11091d == null || c2868dArr3[i12].f11091d.f11089b != this) ? 0 : c2868dArr3[i12].f11092e + 0;
                if (i12 == 0 || i12 == 2) {
                    c2852d.m9613i(c2868d.f11094g, c2857iM9619q, this.f11065K0 - i13, z3);
                } else {
                    c2852d.m9611g(c2868d.f11094g, c2857iM9619q, this.f11065K0 + i13, z3);
                }
                c2852d.m9609e(c2868d.f11094g, c2857iM9619q, this.f11065K0 + i13, i10);
            }
        }
        int i14 = this.f11063I0;
        if (i14 == 0) {
            c2852d.m9609e(this.f11117F.f11094g, this.f11113D.f11094g, 0, 8);
            c2852d.m9609e(this.f11113D.f11094g, this.f11127P.f11117F.f11094g, 0, 4);
            c2852d.m9609e(this.f11113D.f11094g, this.f11127P.f11113D.f11094g, 0, 0);
            return;
        }
        if (i14 == 1) {
            c2852d.m9609e(this.f11113D.f11094g, this.f11117F.f11094g, 0, 8);
            c2852d.m9609e(this.f11113D.f11094g, this.f11127P.f11113D.f11094g, 0, 4);
            c2852d.m9609e(this.f11113D.f11094g, this.f11127P.f11117F.f11094g, 0, 0);
        } else if (i14 == 2) {
            c2852d.m9609e(this.f11118G.f11094g, this.f11115E.f11094g, 0, 8);
            c2852d.m9609e(this.f11115E.f11094g, this.f11127P.f11118G.f11094g, 0, 4);
            c2852d.m9609e(this.f11115E.f11094g, this.f11127P.f11115E.f11094g, 0, 0);
        } else if (i14 == 3) {
            c2852d.m9609e(this.f11115E.f11094g, this.f11118G.f11094g, 0, 8);
            c2852d.m9609e(this.f11115E.f11094g, this.f11127P.f11115E.f11094g, 0, 4);
            c2852d.m9609e(this.f11115E.f11094g, this.f11127P.f11118G.f11094g, 0, 0);
        }
    }

    @Override // p121n.C2869e
    /* renamed from: g */
    public boolean mo9667g() {
        return true;
    }

    @Override // p121n.C2874j, p121n.C2869e
    /* renamed from: l */
    public void mo9668l(C2869e c2869e, HashMap<C2869e, C2869e> map) {
        super.mo9668l(c2869e, map);
        C2865a c2865a = (C2865a) c2869e;
        this.f11063I0 = c2865a.f11063I0;
        this.f11064J0 = c2865a.f11064J0;
        this.f11065K0 = c2865a.f11065K0;
    }

    @Override // p121n.C2869e
    public String toString() {
        String str = "[Barrier] " + m9755s() + " {";
        for (int i4 = 0; i4 < this.f11271H0; i4++) {
            C2869e c2869e = this.f11270G0[i4];
            if (i4 > 0) {
                str = str + ", ";
            }
            str = str + c2869e.m9755s();
        }
        return str + "}";
    }
}
