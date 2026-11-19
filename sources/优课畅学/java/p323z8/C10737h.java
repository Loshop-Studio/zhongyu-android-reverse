package p323z8;

/* renamed from: z8.h */
/* loaded from: classes5.dex */
public class C10737h extends AbstractC10732c {

    /* renamed from: L */
    public float f21325L = 0.0f;

    /* renamed from: M */
    public float f21326M = -1.0f;

    /* renamed from: N */
    public float[] f21327N = null;

    /* renamed from: O */
    public float f21328O;

    /* renamed from: P */
    public float f21329P;

    /* renamed from: Q */
    public int f21330Q;

    public C10737h(C10735f c10735f) {
        this.f21310q = c10735f;
    }

    /* renamed from: E */
    public float m20072E(InterfaceC10742m interfaceC10742m) {
        if (this.f21330Q == interfaceC10742m.getWidth() && this.f21329P == this.f21308o) {
            return this.f21328O;
        }
        float width = (interfaceC10742m.getWidth() - this.f21308o) / 2.0f;
        this.f21330Q = interfaceC10742m.getWidth();
        this.f21329P = this.f21308o;
        this.f21328O = width;
        return width;
    }

    @Override // p323z8.AbstractC10732c
    /* renamed from: d */
    public float mo20045d() {
        return this.f21326M + this.f21309p;
    }

    @Override // p323z8.AbstractC10732c
    /* renamed from: g */
    public float mo20048g() {
        return this.f21325L;
    }

    @Override // p323z8.AbstractC10732c
    /* renamed from: h */
    public float[] mo20049h(InterfaceC10742m interfaceC10742m, long j10) {
        if (!m20058q()) {
            return null;
        }
        float fM20072E = m20072E(interfaceC10742m);
        if (this.f21327N == null) {
            this.f21327N = new float[4];
        }
        float[] fArr = this.f21327N;
        fArr[0] = fM20072E;
        float f10 = this.f21326M;
        fArr[1] = f10;
        fArr[2] = fM20072E + this.f21308o;
        fArr[3] = f10 + this.f21309p;
        return fArr;
    }

    @Override // p323z8.AbstractC10732c
    /* renamed from: i */
    public float mo20050i() {
        return this.f21325L + this.f21308o;
    }

    @Override // p323z8.AbstractC10732c
    /* renamed from: l */
    public float mo20053l() {
        return this.f21326M;
    }

    @Override // p323z8.AbstractC10732c
    /* renamed from: m */
    public int mo20054m() {
        return 5;
    }

    @Override // p323z8.AbstractC10732c
    /* renamed from: y */
    public void mo20066y(InterfaceC10742m interfaceC10742m, float f10, float f11) {
        C10734e c10734e = this.f21286D;
        if (c10734e != null) {
            long jM20043b = c10734e.f21320a - m20043b();
            if (jM20043b <= 0 || jM20043b >= this.f21310q.f21324c) {
                m20041D(false);
                this.f21326M = -1.0f;
                this.f21325L = interfaceC10742m.getWidth();
            } else {
                if (mo20063v()) {
                    return;
                }
                this.f21325L = m20072E(interfaceC10742m);
                this.f21326M = f11;
                m20041D(true);
            }
        }
    }
}
