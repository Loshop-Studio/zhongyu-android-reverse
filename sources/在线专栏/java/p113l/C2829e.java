package p113l;

import java.lang.reflect.Array;

/* renamed from: l.e */
/* loaded from: classes.dex */
public class C2829e extends AbstractC2826b {

    /* renamed from: a */
    private double[] f10889a;

    /* renamed from: b */
    private double[][] f10890b;

    /* renamed from: c */
    private double[][] f10891c;

    public C2829e(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        int i4 = length - 1;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) double.class, i4, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) double.class, length, length2);
        for (int i5 = 0; i5 < length2; i5++) {
            int i6 = 0;
            while (i6 < i4) {
                int i7 = i6 + 1;
                dArr3[i6][i5] = (dArr2[i7][i5] - dArr2[i6][i5]) / (dArr[i7] - dArr[i6]);
                if (i6 == 0) {
                    dArr4[i6][i5] = dArr3[i6][i5];
                } else {
                    dArr4[i6][i5] = (dArr3[i6 - 1][i5] + dArr3[i6][i5]) * 0.5d;
                }
                i6 = i7;
            }
            dArr4[i4][i5] = dArr3[length - 2][i5];
        }
        for (int i8 = 0; i8 < i4; i8++) {
            for (int i9 = 0; i9 < length2; i9++) {
                if (dArr3[i8][i9] == 0.0d) {
                    dArr4[i8][i9] = 0.0d;
                    dArr4[i8 + 1][i9] = 0.0d;
                } else {
                    double d4 = dArr4[i8][i9] / dArr3[i8][i9];
                    int i10 = i8 + 1;
                    double d5 = dArr4[i10][i9] / dArr3[i8][i9];
                    double dHypot = Math.hypot(d4, d5);
                    if (dHypot > 9.0d) {
                        double d6 = 3.0d / dHypot;
                        dArr4[i8][i9] = d4 * d6 * dArr3[i8][i9];
                        dArr4[i10][i9] = d6 * d5 * dArr3[i8][i9];
                    }
                }
            }
        }
        this.f10889a = dArr;
        this.f10890b = dArr2;
        this.f10891c = dArr4;
    }

    /* renamed from: i */
    private static double m9459i(double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d5 * d5;
        double d11 = d5 * 6.0d;
        double d12 = 3.0d * d4;
        return ((((((((((-6.0d) * d10) * d7) + (d11 * d7)) + ((6.0d * d10) * d6)) - (d11 * d6)) + ((d12 * d9) * d10)) + ((d12 * d8) * d10)) - (((2.0d * d4) * d9) * d5)) - (((4.0d * d4) * d8) * d5)) + (d4 * d8);
    }

    /* renamed from: j */
    private static double m9460j(double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d5 * d5;
        double d11 = d10 * d5;
        double d12 = 3.0d * d10;
        double d13 = ((((((-2.0d) * d11) * d7) + (d12 * d7)) + ((d11 * 2.0d) * d6)) - (d12 * d6)) + d6;
        double d14 = d4 * d9;
        double d15 = d4 * d8;
        return ((((d13 + (d14 * d11)) + (d11 * d15)) - (d14 * d10)) - (((d4 * 2.0d) * d8) * d10)) + (d15 * d5);
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: c */
    public double mo9435c(double d4, int i4) {
        double[] dArr = this.f10889a;
        int length = dArr.length;
        int i5 = 0;
        if (d4 <= dArr[0]) {
            return this.f10890b[0][i4];
        }
        int i6 = length - 1;
        if (d4 >= dArr[i6]) {
            return this.f10890b[i6][i4];
        }
        while (i5 < i6) {
            double[] dArr2 = this.f10889a;
            if (d4 == dArr2[i5]) {
                return this.f10890b[i5][i4];
            }
            int i7 = i5 + 1;
            if (d4 < dArr2[i7]) {
                double d5 = dArr2[i7] - dArr2[i5];
                double d6 = (d4 - dArr2[i5]) / d5;
                double[][] dArr3 = this.f10890b;
                double d7 = dArr3[i5][i4];
                double d8 = dArr3[i7][i4];
                double[][] dArr4 = this.f10891c;
                return m9460j(d5, d6, d7, d8, dArr4[i5][i4], dArr4[i7][i4]);
            }
            i5 = i7;
        }
        return 0.0d;
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: d */
    public void mo9436d(double d4, double[] dArr) {
        double[] dArr2 = this.f10889a;
        int length = dArr2.length;
        int i4 = 0;
        int length2 = this.f10890b[0].length;
        if (d4 <= dArr2[0]) {
            for (int i5 = 0; i5 < length2; i5++) {
                dArr[i5] = this.f10890b[0][i5];
            }
            return;
        }
        int i6 = length - 1;
        if (d4 >= dArr2[i6]) {
            while (i4 < length2) {
                dArr[i4] = this.f10890b[i6][i4];
                i4++;
            }
            return;
        }
        int i7 = 0;
        while (i7 < i6) {
            if (d4 == this.f10889a[i7]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    dArr[i8] = this.f10890b[i7][i8];
                }
            }
            double[] dArr3 = this.f10889a;
            int i9 = i7 + 1;
            if (d4 < dArr3[i9]) {
                double d5 = dArr3[i9] - dArr3[i7];
                double d6 = (d4 - dArr3[i7]) / d5;
                while (i4 < length2) {
                    double[][] dArr4 = this.f10890b;
                    double d7 = dArr4[i7][i4];
                    double d8 = dArr4[i9][i4];
                    double[][] dArr5 = this.f10891c;
                    dArr[i4] = m9460j(d5, d6, d7, d8, dArr5[i7][i4], dArr5[i9][i4]);
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
        double[] dArr = this.f10889a;
        int length = dArr.length;
        int i4 = 0;
        int length2 = this.f10890b[0].length;
        if (d4 <= dArr[0]) {
            for (int i5 = 0; i5 < length2; i5++) {
                fArr[i5] = (float) this.f10890b[0][i5];
            }
            return;
        }
        int i6 = length - 1;
        if (d4 >= dArr[i6]) {
            while (i4 < length2) {
                fArr[i4] = (float) this.f10890b[i6][i4];
                i4++;
            }
            return;
        }
        int i7 = 0;
        while (i7 < i6) {
            if (d4 == this.f10889a[i7]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    fArr[i8] = (float) this.f10890b[i7][i8];
                }
            }
            double[] dArr2 = this.f10889a;
            int i9 = i7 + 1;
            if (d4 < dArr2[i9]) {
                double d5 = dArr2[i9] - dArr2[i7];
                double d6 = (d4 - dArr2[i7]) / d5;
                while (i4 < length2) {
                    double[][] dArr3 = this.f10890b;
                    double d7 = dArr3[i7][i4];
                    double d8 = dArr3[i9][i4];
                    double[][] dArr4 = this.f10891c;
                    fArr[i4] = (float) m9460j(d5, d6, d7, d8, dArr4[i7][i4], dArr4[i9][i4]);
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
        double d5;
        double[] dArr = this.f10889a;
        int length = dArr.length;
        int i5 = 0;
        if (d4 < dArr[0]) {
            d5 = dArr[0];
        } else {
            int i6 = length - 1;
            d5 = d4 >= dArr[i6] ? dArr[i6] : d4;
        }
        while (i5 < length - 1) {
            double[] dArr2 = this.f10889a;
            int i7 = i5 + 1;
            if (d5 <= dArr2[i7]) {
                double d6 = dArr2[i7] - dArr2[i5];
                double d7 = (d5 - dArr2[i5]) / d6;
                double[][] dArr3 = this.f10890b;
                double d8 = dArr3[i5][i4];
                double d9 = dArr3[i7][i4];
                double[][] dArr4 = this.f10891c;
                return m9459i(d6, d7, d8, d9, dArr4[i5][i4], dArr4[i7][i4]) / d6;
            }
            i5 = i7;
        }
        return 0.0d;
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: g */
    public void mo9439g(double d4, double[] dArr) {
        double d5;
        double[] dArr2 = this.f10889a;
        int length = dArr2.length;
        int length2 = this.f10890b[0].length;
        if (d4 <= dArr2[0]) {
            d5 = dArr2[0];
        } else {
            int i4 = length - 1;
            d5 = d4 >= dArr2[i4] ? dArr2[i4] : d4;
        }
        int i5 = 0;
        while (i5 < length - 1) {
            double[] dArr3 = this.f10889a;
            int i6 = i5 + 1;
            if (d5 <= dArr3[i6]) {
                double d6 = dArr3[i6] - dArr3[i5];
                double d7 = (d5 - dArr3[i5]) / d6;
                for (int i7 = 0; i7 < length2; i7++) {
                    double[][] dArr4 = this.f10890b;
                    double d8 = dArr4[i5][i7];
                    double d9 = dArr4[i6][i7];
                    double[][] dArr5 = this.f10891c;
                    dArr[i7] = m9459i(d6, d7, d8, d9, dArr5[i5][i7], dArr5[i6][i7]) / d6;
                }
                return;
            }
            i5 = i6;
        }
    }

    @Override // p113l.AbstractC2826b
    /* renamed from: h */
    public double[] mo9440h() {
        return this.f10889a;
    }
}
