package p113l;

/* renamed from: l.d */
/* loaded from: classes.dex */
public class C2828d extends AbstractC2826b {

    /* renamed from: a */
    private double[] f10886a;

    /* renamed from: b */
    private double[][] f10887b;

    /* renamed from: c */
    private double f10888c;

    public C2828d(double[] dArr, double[][] dArr2) {
        this.f10888c = Double.NaN;
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f10886a = dArr;
        this.f10887b = dArr2;
        if (length2 > 2) {
            double d4 = 0.0d;
            double d5 = 0.0d;
            int i4 = 0;
            while (i4 < dArr.length) {
                double d6 = dArr2[i4][0];
                double d7 = dArr2[i4][0];
                if (i4 > 0) {
                    Math.hypot(d6 - d4, d7 - d5);
                }
                i4++;
                d4 = d6;
                d5 = d7;
            }
            this.f10888c = 0.0d;
        }
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: c */
    public double mo9435c(double d4, int i4) {
        double[] dArr = this.f10886a;
        int length = dArr.length;
        int i5 = 0;
        if (d4 <= dArr[0]) {
            return this.f10887b[0][i4];
        }
        int i6 = length - 1;
        if (d4 >= dArr[i6]) {
            return this.f10887b[i6][i4];
        }
        while (i5 < i6) {
            double[] dArr2 = this.f10886a;
            if (d4 == dArr2[i5]) {
                return this.f10887b[i5][i4];
            }
            int i7 = i5 + 1;
            if (d4 < dArr2[i7]) {
                double d5 = (d4 - dArr2[i5]) / (dArr2[i7] - dArr2[i5]);
                double[][] dArr3 = this.f10887b;
                return (dArr3[i5][i4] * (1.0d - d5)) + (dArr3[i7][i4] * d5);
            }
            i5 = i7;
        }
        return 0.0d;
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: d */
    public void mo9436d(double d4, double[] dArr) {
        double[] dArr2 = this.f10886a;
        int length = dArr2.length;
        int i4 = 0;
        int length2 = this.f10887b[0].length;
        if (d4 <= dArr2[0]) {
            for (int i5 = 0; i5 < length2; i5++) {
                dArr[i5] = this.f10887b[0][i5];
            }
            return;
        }
        int i6 = length - 1;
        if (d4 >= dArr2[i6]) {
            while (i4 < length2) {
                dArr[i4] = this.f10887b[i6][i4];
                i4++;
            }
            return;
        }
        int i7 = 0;
        while (i7 < i6) {
            if (d4 == this.f10886a[i7]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    dArr[i8] = this.f10887b[i7][i8];
                }
            }
            double[] dArr3 = this.f10886a;
            int i9 = i7 + 1;
            if (d4 < dArr3[i9]) {
                double d5 = (d4 - dArr3[i7]) / (dArr3[i9] - dArr3[i7]);
                while (i4 < length2) {
                    double[][] dArr4 = this.f10887b;
                    dArr[i4] = (dArr4[i7][i4] * (1.0d - d5)) + (dArr4[i9][i4] * d5);
                    i4++;
                }
                return;
            }
            i7 = i9;
        }
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: e */
    public void mo9437e(double d4, float[] fArr) {
        double[] dArr = this.f10886a;
        int length = dArr.length;
        int i4 = 0;
        int length2 = this.f10887b[0].length;
        if (d4 <= dArr[0]) {
            for (int i5 = 0; i5 < length2; i5++) {
                fArr[i5] = (float) this.f10887b[0][i5];
            }
            return;
        }
        int i6 = length - 1;
        if (d4 >= dArr[i6]) {
            while (i4 < length2) {
                fArr[i4] = (float) this.f10887b[i6][i4];
                i4++;
            }
            return;
        }
        int i7 = 0;
        while (i7 < i6) {
            if (d4 == this.f10886a[i7]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    fArr[i8] = (float) this.f10887b[i7][i8];
                }
            }
            double[] dArr2 = this.f10886a;
            int i9 = i7 + 1;
            if (d4 < dArr2[i9]) {
                double d5 = (d4 - dArr2[i7]) / (dArr2[i9] - dArr2[i7]);
                while (i4 < length2) {
                    double[][] dArr3 = this.f10887b;
                    fArr[i4] = (float) ((dArr3[i7][i4] * (1.0d - d5)) + (dArr3[i9][i4] * d5));
                    i4++;
                }
                return;
            }
            i7 = i9;
        }
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: f */
    public double mo9438f(double d4, int i4) {
        double[] dArr = this.f10886a;
        int length = dArr.length;
        int i5 = 0;
        if (d4 < dArr[0]) {
            d4 = dArr[0];
        } else {
            int i6 = length - 1;
            if (d4 >= dArr[i6]) {
                d4 = dArr[i6];
            }
        }
        while (i5 < length - 1) {
            double[] dArr2 = this.f10886a;
            int i7 = i5 + 1;
            if (d4 <= dArr2[i7]) {
                double d5 = dArr2[i7] - dArr2[i5];
                double d6 = dArr2[i5];
                double[][] dArr3 = this.f10887b;
                return (dArr3[i7][i4] - dArr3[i5][i4]) / d5;
            }
            i5 = i7;
        }
        return 0.0d;
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: g */
    public void mo9439g(double d4, double[] dArr) {
        double[] dArr2 = this.f10886a;
        int length = dArr2.length;
        int length2 = this.f10887b[0].length;
        if (d4 <= dArr2[0]) {
            d4 = dArr2[0];
        } else {
            int i4 = length - 1;
            if (d4 >= dArr2[i4]) {
                d4 = dArr2[i4];
            }
        }
        int i5 = 0;
        while (i5 < length - 1) {
            double[] dArr3 = this.f10886a;
            int i6 = i5 + 1;
            if (d4 <= dArr3[i6]) {
                double d5 = dArr3[i6] - dArr3[i5];
                double d6 = dArr3[i5];
                for (int i7 = 0; i7 < length2; i7++) {
                    double[][] dArr4 = this.f10887b;
                    dArr[i7] = (dArr4[i6][i7] - dArr4[i5][i7]) / d5;
                }
                return;
            }
            i5 = i6;
        }
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: h */
    public double[] mo9440h() {
        return this.f10886a;
    }
}
