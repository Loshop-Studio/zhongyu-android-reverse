package p121n;

import java.util.HashMap;
import p117m.C2852d;
import p117m.C2857i;
import p121n.C2868d;
import p121n.C2869e;

/* renamed from: n.h */
/* loaded from: classes.dex */
public class C2872h extends C2869e {

    /* renamed from: G0 */
    protected float f11263G0 = -1.0f;

    /* renamed from: H0 */
    protected int f11264H0 = -1;

    /* renamed from: I0 */
    protected int f11265I0 = -1;

    /* renamed from: J0 */
    private C2868d f11266J0 = this.f11115E;

    /* renamed from: K0 */
    private int f11267K0 = 0;

    /* renamed from: L0 */
    private int f11268L0 = 0;

    /* renamed from: n.h$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11269a;

        static {
            int[] iArr = new int[C2868d.b.values().length];
            f11269a = iArr;
            try {
                iArr[C2868d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11269a[C2868d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11269a[C2868d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11269a[C2868d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11269a[C2868d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11269a[C2868d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11269a[C2868d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11269a[C2868d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11269a[C2868d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C2872h() {
        this.f11124M.clear();
        this.f11124M.add(this.f11266J0);
        int length = this.f11123L.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f11123L[i4] = this.f11266J0;
        }
    }

    @Override // p121n.C2869e
    /* renamed from: K0 */
    public void mo9712K0(C2852d c2852d) {
        if (m9705H() == null) {
            return;
        }
        int iM9623x = c2852d.m9623x(this.f11266J0);
        if (this.f11267K0 == 1) {
            m9704G0(iM9623x);
            m9706H0(0);
            m9737i0(m9705H().m9763w());
            m9702F0(0);
            return;
        }
        m9704G0(0);
        m9706H0(iM9623x);
        m9702F0(m9705H().m9718Q());
        m9737i0(0);
    }

    /* renamed from: L0 */
    public int m9851L0() {
        return this.f11267K0;
    }

    /* renamed from: M0 */
    public int m9852M0() {
        return this.f11264H0;
    }

    /* renamed from: N0 */
    public int m9853N0() {
        return this.f11265I0;
    }

    /* renamed from: O0 */
    public float m9854O0() {
        return this.f11263G0;
    }

    /* renamed from: P0 */
    public void m9855P0(int i4) {
        if (i4 > -1) {
            this.f11263G0 = -1.0f;
            this.f11264H0 = i4;
            this.f11265I0 = -1;
        }
    }

    /* renamed from: Q0 */
    public void m9856Q0(int i4) {
        if (i4 > -1) {
            this.f11263G0 = -1.0f;
            this.f11264H0 = -1;
            this.f11265I0 = i4;
        }
    }

    /* renamed from: R0 */
    public void m9857R0(float f4) {
        if (f4 > -1.0f) {
            this.f11263G0 = f4;
            this.f11264H0 = -1;
            this.f11265I0 = -1;
        }
    }

    /* renamed from: S0 */
    public void m9858S0(int i4) {
        if (this.f11267K0 == i4) {
            return;
        }
        this.f11267K0 = i4;
        this.f11124M.clear();
        if (this.f11267K0 == 1) {
            this.f11266J0 = this.f11113D;
        } else {
            this.f11266J0 = this.f11115E;
        }
        this.f11124M.add(this.f11266J0);
        int length = this.f11123L.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.f11123L[i5] = this.f11266J0;
        }
    }

    @Override // p121n.C2869e
    /* renamed from: f */
    public void mo9666f(C2852d c2852d) {
        C2870f c2870f = (C2870f) m9705H();
        if (c2870f == null) {
            return;
        }
        C2868d c2868dMo9745n = c2870f.mo9745n(C2868d.b.LEFT);
        C2868d c2868dMo9745n2 = c2870f.mo9745n(C2868d.b.RIGHT);
        C2869e c2869e = this.f11127P;
        boolean z3 = c2869e != null && c2869e.f11126O[0] == C2869e.b.WRAP_CONTENT;
        if (this.f11267K0 == 0) {
            c2868dMo9745n = c2870f.mo9745n(C2868d.b.TOP);
            c2868dMo9745n2 = c2870f.mo9745n(C2868d.b.BOTTOM);
            C2869e c2869e2 = this.f11127P;
            z3 = c2869e2 != null && c2869e2.f11126O[1] == C2869e.b.WRAP_CONTENT;
        }
        if (this.f11264H0 != -1) {
            C2857i c2857iM9619q = c2852d.m9619q(this.f11266J0);
            c2852d.m9609e(c2857iM9619q, c2852d.m9619q(c2868dMo9745n), this.f11264H0, 8);
            if (z3) {
                c2852d.m9612h(c2852d.m9619q(c2868dMo9745n2), c2857iM9619q, 0, 5);
                return;
            }
            return;
        }
        if (this.f11265I0 == -1) {
            if (this.f11263G0 != -1.0f) {
                c2852d.m9608d(C2852d.m9600s(c2852d, c2852d.m9619q(this.f11266J0), c2852d.m9619q(c2868dMo9745n2), this.f11263G0));
                return;
            }
            return;
        }
        C2857i c2857iM9619q2 = c2852d.m9619q(this.f11266J0);
        C2857i c2857iM9619q3 = c2852d.m9619q(c2868dMo9745n2);
        c2852d.m9609e(c2857iM9619q2, c2857iM9619q3, -this.f11265I0, 8);
        if (z3) {
            c2852d.m9612h(c2857iM9619q2, c2852d.m9619q(c2868dMo9745n), 0, 5);
            c2852d.m9612h(c2857iM9619q3, c2857iM9619q2, 0, 5);
        }
    }

    @Override // p121n.C2869e
    /* renamed from: g */
    public boolean mo9667g() {
        return true;
    }

    @Override // p121n.C2869e
    /* renamed from: l */
    public void mo9668l(C2869e c2869e, HashMap<C2869e, C2869e> map) {
        super.mo9668l(c2869e, map);
        C2872h c2872h = (C2872h) c2869e;
        this.f11263G0 = c2872h.f11263G0;
        this.f11264H0 = c2872h.f11264H0;
        this.f11265I0 = c2872h.f11265I0;
        m9858S0(c2872h.f11267K0);
    }

    @Override // p121n.C2869e
    /* renamed from: n */
    public C2868d mo9745n(C2868d.b bVar) {
        switch (a.f11269a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f11267K0 == 1) {
                    return this.f11266J0;
                }
                break;
            case 3:
            case 4:
                if (this.f11267K0 == 0) {
                    return this.f11266J0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
