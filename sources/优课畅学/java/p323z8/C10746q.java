package p323z8;

/* renamed from: z8.q */
/* loaded from: classes5.dex */
public class C10746q extends AbstractC10732c {

    /* renamed from: L */
    public float f21343L;

    /* renamed from: M */
    public float f21344M;

    /* renamed from: N */
    public float f21345N;

    /* renamed from: O */
    public float f21346O;

    /* renamed from: P */
    public float f21347P;

    /* renamed from: Q */
    public float f21348Q;

    /* renamed from: R */
    public long f21349R;

    /* renamed from: S */
    public long f21350S;

    /* renamed from: T */
    public int f21351T;

    /* renamed from: U */
    public int f21352U;

    /* renamed from: V */
    public int f21353V;

    /* renamed from: W */
    public long f21354W;

    /* renamed from: X */
    public float[] f21355X = new float[4];

    /* renamed from: Y */
    public a[] f21356Y;

    /* renamed from: z8.q$a */
    public class a {

        /* renamed from: a */
        public b f21357a;

        /* renamed from: b */
        public b f21358b;

        /* renamed from: c */
        public long f21359c;

        /* renamed from: d */
        public long f21360d;

        /* renamed from: e */
        public long f21361e;

        /* renamed from: f */
        public float f21362f;

        /* renamed from: g */
        public float f21363g;

        public a() {
        }

        /* renamed from: a */
        public float[] m20082a() {
            b bVar = this.f21357a;
            return new float[]{bVar.f21365a, bVar.f21366b};
        }

        /* renamed from: b */
        public float m20083b() {
            return this.f21358b.m20086a(this.f21357a);
        }

        /* renamed from: c */
        public float[] m20084c() {
            b bVar = this.f21358b;
            return new float[]{bVar.f21365a, bVar.f21366b};
        }

        /* renamed from: d */
        public void m20085d(b bVar, b bVar2) {
            this.f21357a = bVar;
            this.f21358b = bVar2;
            this.f21362f = bVar2.f21365a - bVar.f21365a;
            this.f21363g = bVar2.f21366b - bVar.f21366b;
        }
    }

    /* renamed from: z8.q$b */
    public class b {

        /* renamed from: a */
        public float f21365a;

        /* renamed from: b */
        public float f21366b;

        public b(float f10, float f11) {
            this.f21365a = f10;
            this.f21366b = f11;
        }

        /* renamed from: a */
        public float m20086a(b bVar) {
            float fAbs = Math.abs(this.f21365a - bVar.f21365a);
            float fAbs2 = Math.abs(this.f21366b - bVar.f21366b);
            return (float) Math.sqrt((fAbs * fAbs) + (fAbs2 * fAbs2));
        }
    }

    /* renamed from: E */
    public void m20080E(float[][] fArr) {
        a[] aVarArr;
        if (fArr != null) {
            int length = fArr.length;
            int i10 = 0;
            float[] fArr2 = fArr[0];
            this.f21343L = fArr2[0];
            this.f21344M = fArr2[1];
            float[] fArr3 = fArr[length - 1];
            this.f21345N = fArr3[0];
            this.f21346O = fArr3[1];
            if (fArr.length > 1) {
                this.f21356Y = new a[fArr.length - 1];
                int i11 = 0;
                while (true) {
                    aVarArr = this.f21356Y;
                    if (i11 >= aVarArr.length) {
                        break;
                    }
                    aVarArr[i11] = new a();
                    a aVar = this.f21356Y[i11];
                    float[] fArr4 = fArr[i11];
                    b bVar = new b(fArr4[0], fArr4[1]);
                    i11++;
                    float[] fArr5 = fArr[i11];
                    aVar.m20085d(bVar, new b(fArr5[0], fArr5[1]));
                }
                float fM20083b = 0.0f;
                for (a aVar2 : aVarArr) {
                    fM20083b += aVar2.m20083b();
                }
                a[] aVarArr2 = this.f21356Y;
                int length2 = aVarArr2.length;
                a aVar3 = null;
                while (i10 < length2) {
                    a aVar4 = aVarArr2[i10];
                    long jM20083b = (long) ((aVar4.m20083b() / fM20083b) * this.f21349R);
                    aVar4.f21359c = jM20083b;
                    long j10 = aVar3 == null ? 0L : aVar3.f21361e;
                    aVar4.f21360d = j10;
                    aVar4.f21361e = j10 + jM20083b;
                    i10++;
                    aVar3 = aVar4;
                }
            }
        }
    }

    /* renamed from: F */
    public void m20081F(float f10, float f11, float f12, float f13, long j10, long j11) {
        this.f21343L = f10;
        this.f21344M = f11;
        this.f21345N = f12;
        this.f21346O = f13;
        this.f21347P = f12 - f10;
        this.f21348Q = f13 - f11;
        this.f21349R = j10;
        this.f21350S = j11;
    }

    @Override // p323z8.AbstractC10732c
    /* renamed from: d */
    public float mo20045d() {
        return this.f21355X[3];
    }

    @Override // p323z8.AbstractC10732c
    /* renamed from: g */
    public float mo20048g() {
        return this.f21355X[0];
    }

    @Override // p323z8.AbstractC10732c
    /* renamed from: h */
    public float[] mo20049h(InterfaceC10742m interfaceC10742m, long j10) {
        int i10;
        a aVar = null;
        if (!m20058q()) {
            return null;
        }
        long jM20043b = j10 - m20043b();
        long j11 = this.f21354W;
        if (j11 > 0 && (i10 = this.f21353V) != 0) {
            if (jM20043b >= j11) {
                this.f21287E = this.f21352U;
            } else {
                this.f21287E = this.f21351T + ((int) (i10 * (jM20043b / j11)));
            }
        }
        float f10 = this.f21343L;
        float f11 = this.f21344M;
        long j12 = jM20043b - this.f21350S;
        long j13 = this.f21349R;
        if (j13 > 0 && j12 >= 0 && j12 <= j13) {
            float f12 = j12 / j13;
            a[] aVarArr = this.f21356Y;
            if (aVarArr != null) {
                int length = aVarArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    a aVar2 = aVarArr[i11];
                    if (j12 >= aVar2.f21360d && j12 < aVar2.f21361e) {
                        aVar = aVar2;
                        break;
                    }
                    b bVar = aVar2.f21358b;
                    float f13 = bVar.f21365a;
                    i11++;
                    f11 = bVar.f21366b;
                    f10 = f13;
                }
                if (aVar != null) {
                    float f14 = aVar.f21362f;
                    float f15 = aVar.f21363g;
                    float f16 = (jM20043b - aVar.f21360d) / aVar.f21359c;
                    b bVar2 = aVar.f21357a;
                    float f17 = bVar2.f21365a;
                    float f18 = bVar2.f21366b;
                    if (f14 != 0.0f) {
                        f10 = f17 + (f14 * f16);
                    }
                    if (f15 != 0.0f) {
                        f11 = f18 + (f15 * f16);
                    }
                }
            } else {
                float f19 = this.f21347P;
                if (f19 != 0.0f) {
                    f10 += f19 * f12;
                }
                float f20 = this.f21348Q;
                if (f20 != 0.0f) {
                    f11 += f20 * f12;
                }
            }
        } else if (j12 > j13) {
            f10 = this.f21345N;
            f11 = this.f21346O;
        }
        float[] fArr = this.f21355X;
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f10 + this.f21308o;
        fArr[3] = f11 + this.f21309p;
        m20041D(!m20060s());
        return this.f21355X;
    }

    @Override // p323z8.AbstractC10732c
    /* renamed from: i */
    public float mo20050i() {
        return this.f21355X[2];
    }

    @Override // p323z8.AbstractC10732c
    /* renamed from: l */
    public float mo20053l() {
        return this.f21355X[1];
    }

    @Override // p323z8.AbstractC10732c
    /* renamed from: m */
    public int mo20054m() {
        return 7;
    }

    @Override // p323z8.AbstractC10732c
    /* renamed from: y */
    public void mo20066y(InterfaceC10742m interfaceC10742m, float f10, float f11) {
        mo20049h(interfaceC10742m, this.f21286D.f21320a);
    }
}
