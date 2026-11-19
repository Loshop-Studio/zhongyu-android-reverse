package p113l;

/* renamed from: l.b */
/* loaded from: classes.dex */
public abstract class AbstractC2826b {

    /* renamed from: l.b$a */
    static class a extends AbstractC2826b {

        /* renamed from: a */
        double f10875a;

        /* renamed from: b */
        double[] f10876b;

        a(double d4, double[] dArr) {
            this.f10875a = d4;
            this.f10876b = dArr;
        }

        @Override // p113l.AbstractC2826b
        /* renamed from: c */
        public double mo9435c(double d4, int i4) {
            return this.f10876b[i4];
        }

        @Override // p113l.AbstractC2826b
        /* renamed from: d */
        public void mo9436d(double d4, double[] dArr) {
            double[] dArr2 = this.f10876b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // p113l.AbstractC2826b
        /* renamed from: e */
        public void mo9437e(double d4, float[] fArr) {
            int i4 = 0;
            while (true) {
                double[] dArr = this.f10876b;
                if (i4 >= dArr.length) {
                    return;
                }
                fArr[i4] = (float) dArr[i4];
                i4++;
            }
        }

        @Override // p113l.AbstractC2826b
        /* renamed from: f */
        public double mo9438f(double d4, int i4) {
            return 0.0d;
        }

        @Override // p113l.AbstractC2826b
        /* renamed from: g */
        public void mo9439g(double d4, double[] dArr) {
            for (int i4 = 0; i4 < this.f10876b.length; i4++) {
                dArr[i4] = 0.0d;
            }
        }

        @Override // p113l.AbstractC2826b
        /* renamed from: h */
        public double[] mo9440h() {
            return new double[]{this.f10875a};
        }
    }

    /* renamed from: a */
    public static AbstractC2826b m9452a(int i4, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i4 = 2;
        }
        return i4 != 0 ? i4 != 2 ? new C2828d(dArr, dArr2) : new a(dArr[0], dArr2[0]) : new C2829e(dArr, dArr2);
    }

    /* renamed from: b */
    public static AbstractC2826b m9453b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C2825a(iArr, dArr, dArr2);
    }

    /* renamed from: c */
    public abstract double mo9435c(double d4, int i4);

    /* renamed from: d */
    public abstract void mo9436d(double d4, double[] dArr);

    /* renamed from: e */
    public abstract void mo9437e(double d4, float[] fArr);

    /* renamed from: f */
    public abstract double mo9438f(double d4, int i4);

    /* renamed from: g */
    public abstract void mo9439g(double d4, double[] dArr);

    /* renamed from: h */
    public abstract double[] mo9440h();
}
