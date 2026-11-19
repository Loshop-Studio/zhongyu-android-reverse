package p121n;

import java.util.Arrays;
import p117m.C2852d;
import p121n.C2869e;
import p125o.C2892b;
import p125o.C2895e;

/* renamed from: n.f */
/* loaded from: classes.dex */
public class C2870f extends C2877m {

    /* renamed from: M0 */
    int f11202M0;

    /* renamed from: N0 */
    int f11203N0;

    /* renamed from: O0 */
    int f11204O0;

    /* renamed from: P0 */
    int f11205P0;

    /* renamed from: H0 */
    C2892b f11197H0 = new C2892b(this);

    /* renamed from: I0 */
    public C2895e f11198I0 = new C2895e(this);

    /* renamed from: J0 */
    protected C2892b.b f11199J0 = null;

    /* renamed from: K0 */
    private boolean f11200K0 = false;

    /* renamed from: L0 */
    protected C2852d f11201L0 = new C2852d();

    /* renamed from: Q0 */
    int f11206Q0 = 0;

    /* renamed from: R0 */
    int f11207R0 = 0;

    /* renamed from: S0 */
    C2867c[] f11208S0 = new C2867c[4];

    /* renamed from: T0 */
    C2867c[] f11209T0 = new C2867c[4];

    /* renamed from: U0 */
    public boolean f11210U0 = false;

    /* renamed from: V0 */
    public boolean f11211V0 = false;

    /* renamed from: W0 */
    public boolean f11212W0 = false;

    /* renamed from: X0 */
    public int f11213X0 = 0;

    /* renamed from: Y0 */
    public int f11214Y0 = 0;

    /* renamed from: Z0 */
    private int f11215Z0 = 263;

    /* renamed from: a1 */
    public boolean f11216a1 = false;

    /* renamed from: b1 */
    private boolean f11217b1 = false;

    /* renamed from: c1 */
    private boolean f11218c1 = false;

    /* renamed from: d1 */
    int f11219d1 = 0;

    /* renamed from: R0 */
    private void m9771R0(C2869e c2869e) {
        int i4 = this.f11206Q0 + 1;
        C2867c[] c2867cArr = this.f11209T0;
        if (i4 >= c2867cArr.length) {
            this.f11209T0 = (C2867c[]) Arrays.copyOf(c2867cArr, c2867cArr.length * 2);
        }
        this.f11209T0[this.f11206Q0] = new C2867c(c2869e, 0, m9786c1());
        this.f11206Q0++;
    }

    /* renamed from: S0 */
    private void m9772S0(C2869e c2869e) {
        int i4 = this.f11207R0 + 1;
        C2867c[] c2867cArr = this.f11208S0;
        if (i4 >= c2867cArr.length) {
            this.f11208S0 = (C2867c[]) Arrays.copyOf(c2867cArr, c2867cArr.length * 2);
        }
        this.f11208S0[this.f11207R0] = new C2867c(c2869e, 1, m9786c1());
        this.f11207R0++;
    }

    /* renamed from: g1 */
    private void m9773g1() {
        this.f11206Q0 = 0;
        this.f11207R0 = 0;
    }

    @Override // p121n.C2869e
    /* renamed from: J0 */
    public void mo9710J0(boolean z3, boolean z4) {
        super.mo9710J0(z3, z4);
        int size = this.f11286G0.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f11286G0.get(i4).mo9710J0(z3, z4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01c7 A[PHI: r0 r5
      0x01c7: PHI (r0v26 boolean) = (r0v25 boolean), (r0v28 boolean), (r0v28 boolean), (r0v28 boolean) binds: [B:69:0x018c, B:77:0x01af, B:78:0x01b1, B:80:0x01b7] A[DONT_GENERATE, DONT_INLINE]
      0x01c7: PHI (r5v11 boolean) = (r5v10 boolean), (r5v13 boolean), (r5v13 boolean), (r5v13 boolean) binds: [B:69:0x018c, B:77:0x01af, B:78:0x01b1, B:80:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    @Override // p121n.C2877m
    /* renamed from: M0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9774M0() {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p121n.C2870f.mo9774M0():void");
    }

    /* renamed from: P0 */
    void m9775P0(C2869e c2869e, int i4) {
        if (i4 == 0) {
            m9771R0(c2869e);
        } else if (i4 == 1) {
            m9772S0(c2869e);
        }
    }

    /* renamed from: Q0 */
    public boolean m9776Q0(C2852d c2852d) {
        mo9666f(c2852d);
        int size = this.f11286G0.size();
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            C2869e c2869e = this.f11286G0.get(i4);
            c2869e.m9750p0(0, false);
            c2869e.m9750p0(1, false);
            if (c2869e instanceof C2865a) {
                z3 = true;
            }
        }
        if (z3) {
            for (int i5 = 0; i5 < size; i5++) {
                C2869e c2869e2 = this.f11286G0.get(i5);
                if (c2869e2 instanceof C2865a) {
                    ((C2865a) c2869e2).m9662O0();
                }
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            C2869e c2869e3 = this.f11286G0.get(i6);
            if (c2869e3.m9731e()) {
                c2869e3.mo9666f(c2852d);
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            C2869e c2869e4 = this.f11286G0.get(i7);
            if (c2869e4 instanceof C2870f) {
                C2869e.b[] bVarArr = c2869e4.f11126O;
                C2869e.b bVar = bVarArr[0];
                C2869e.b bVar2 = bVarArr[1];
                C2869e.b bVar3 = C2869e.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    c2869e4.m9744m0(C2869e.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    c2869e4.m9694B0(C2869e.b.FIXED);
                }
                c2869e4.mo9666f(c2852d);
                if (bVar == bVar3) {
                    c2869e4.m9744m0(bVar);
                }
                if (bVar2 == bVar3) {
                    c2869e4.m9694B0(bVar2);
                }
            } else {
                C2875k.m9862a(this, c2852d, c2869e4);
                if (!c2869e4.m9731e()) {
                    c2869e4.mo9666f(c2852d);
                }
            }
        }
        if (this.f11206Q0 > 0) {
            C2866b.m9669a(this, c2852d, 0);
        }
        if (this.f11207R0 > 0) {
            C2866b.m9669a(this, c2852d, 1);
        }
        return true;
    }

    /* renamed from: T0 */
    public boolean m9777T0(boolean z3) {
        return this.f11198I0.m9943f(z3);
    }

    /* renamed from: U0 */
    public boolean m9778U0(boolean z3) {
        return this.f11198I0.m9944g(z3);
    }

    /* renamed from: V0 */
    public boolean m9779V0(boolean z3, int i4) {
        return this.f11198I0.m9945h(z3, i4);
    }

    /* renamed from: W0 */
    public C2892b.b m9780W0() {
        return this.f11199J0;
    }

    /* renamed from: X0 */
    public int m9781X0() {
        return this.f11215Z0;
    }

    /* renamed from: Y0 */
    public boolean m9782Y0() {
        return false;
    }

    @Override // p121n.C2877m, p121n.C2869e
    /* renamed from: Z */
    public void mo9726Z() {
        this.f11201L0.m9605D();
        this.f11202M0 = 0;
        this.f11204O0 = 0;
        this.f11203N0 = 0;
        this.f11205P0 = 0;
        this.f11216a1 = false;
        super.mo9726Z();
    }

    /* renamed from: Z0 */
    public void m9783Z0() {
        this.f11198I0.m9946j();
    }

    /* renamed from: a1 */
    public void m9784a1() {
        this.f11198I0.m9947k();
    }

    /* renamed from: b1 */
    public boolean m9785b1() {
        return this.f11218c1;
    }

    /* renamed from: c1 */
    public boolean m9786c1() {
        return this.f11200K0;
    }

    /* renamed from: d1 */
    public boolean m9787d1() {
        return this.f11217b1;
    }

    /* renamed from: e1 */
    public long m9788e1(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f11202M0 = i11;
        this.f11203N0 = i12;
        return this.f11197H0.m9925d(this, i4, i11, i12, i5, i6, i7, i8, i9, i10);
    }

    /* renamed from: f1 */
    public boolean m9789f1(int i4) {
        return (this.f11215Z0 & i4) == i4;
    }

    /* renamed from: h1 */
    public void m9790h1(C2892b.b bVar) {
        this.f11199J0 = bVar;
        this.f11198I0.m9949n(bVar);
    }

    /* renamed from: i1 */
    public void m9791i1(int i4) {
        this.f11215Z0 = i4;
        C2852d.f10981r = C2875k.m9863b(i4, 256);
    }

    /* renamed from: j1 */
    public void m9792j1(boolean z3) {
        this.f11200K0 = z3;
    }

    /* renamed from: k1 */
    public void m9793k1(C2852d c2852d, boolean[] zArr) {
        zArr[2] = false;
        mo9712K0(c2852d);
        int size = this.f11286G0.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f11286G0.get(i4).mo9712K0(c2852d);
        }
    }

    /* renamed from: l1 */
    public void m9794l1() {
        this.f11197H0.m9926e(this);
    }
}
