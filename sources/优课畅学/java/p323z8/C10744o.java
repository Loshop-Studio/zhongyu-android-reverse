package p323z8;

/* renamed from: z8.o */
/* loaded from: classes5.dex */
public class C10744o extends C10745p {
    public C10744o(C10735f c10735f) {
        super(c10735f);
    }

    @Override // p323z8.C10745p
    /* renamed from: E */
    public float mo20079E(InterfaceC10742m interfaceC10742m, long j10) {
        long jM20043b = j10 - m20043b();
        return jM20043b >= this.f21310q.f21324c ? interfaceC10742m.getWidth() : (this.f21341P * jM20043b) - this.f21308o;
    }

    @Override // p323z8.C10745p, p323z8.AbstractC10732c
    /* renamed from: d */
    public float mo20045d() {
        return this.f21338M + this.f21309p;
    }

    @Override // p323z8.C10745p, p323z8.AbstractC10732c
    /* renamed from: g */
    public float mo20048g() {
        return this.f21337L;
    }

    @Override // p323z8.C10745p, p323z8.AbstractC10732c
    /* renamed from: h */
    public float[] mo20049h(InterfaceC10742m interfaceC10742m, long j10) {
        if (!m20058q()) {
            return null;
        }
        float fMo20079E = mo20079E(interfaceC10742m, j10);
        if (this.f21340O == null) {
            this.f21340O = new float[4];
        }
        float[] fArr = this.f21340O;
        fArr[0] = fMo20079E;
        float f10 = this.f21338M;
        fArr[1] = f10;
        fArr[2] = fMo20079E + this.f21308o;
        fArr[3] = f10 + this.f21309p;
        return fArr;
    }

    @Override // p323z8.C10745p, p323z8.AbstractC10732c
    /* renamed from: i */
    public float mo20050i() {
        return this.f21337L + this.f21308o;
    }

    @Override // p323z8.C10745p, p323z8.AbstractC10732c
    /* renamed from: l */
    public float mo20053l() {
        return this.f21338M;
    }

    @Override // p323z8.C10745p, p323z8.AbstractC10732c
    /* renamed from: m */
    public int mo20054m() {
        return 6;
    }

    @Override // p323z8.C10745p, p323z8.AbstractC10732c
    /* renamed from: y */
    public void mo20066y(InterfaceC10742m interfaceC10742m, float f10, float f11) {
        C10734e c10734e = this.f21286D;
        if (c10734e != null) {
            long j10 = c10734e.f21320a;
            long jM20043b = j10 - m20043b();
            if (jM20043b > 0 && jM20043b < this.f21310q.f21324c) {
                this.f21337L = mo20079E(interfaceC10742m, j10);
                if (!mo20063v()) {
                    this.f21338M = f11;
                    m20041D(true);
                }
                this.f21342Q = j10;
                return;
            }
            this.f21342Q = j10;
        }
        m20041D(false);
    }
}
