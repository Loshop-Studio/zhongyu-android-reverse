package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class MonotonicCurveFit extends CurveFit {
    private static final String TAG = "MonotonicCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;

    /* renamed from: mT */
    private double[] f362mT;
    private double[][] mTangent;

    /* renamed from: mY */
    private double[][] f363mY;

    public MonotonicCurveFit(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.mSlopeTemp = new double[length2];
        int i6 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i6, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i7 = 0; i7 < length2; i7++) {
            int i8 = 0;
            while (i8 < i6) {
                int i9 = i8 + 1;
                double d6 = dArr[i9] - dArr[i8];
                double[] dArr5 = dArr3[i8];
                double d7 = (dArr2[i9][i7] - dArr2[i8][i7]) / d6;
                dArr5[i7] = d7;
                if (i8 == 0) {
                    dArr4[i8][i7] = d7;
                } else {
                    dArr4[i8][i7] = (dArr3[i8 - 1][i7] + d7) * 0.5d;
                }
                i8 = i9;
            }
            dArr4[i6][i7] = dArr3[length - 2][i7];
        }
        for (int i10 = 0; i10 < i6; i10++) {
            for (int i11 = 0; i11 < length2; i11++) {
                double d8 = dArr3[i10][i11];
                if (d8 == 0.0d) {
                    dArr4[i10][i11] = 0.0d;
                    dArr4[i10 + 1][i11] = 0.0d;
                } else {
                    double d9 = dArr4[i10][i11] / d8;
                    int i12 = i10 + 1;
                    double d10 = dArr4[i12][i11] / d8;
                    double dHypot = Math.hypot(d9, d10);
                    if (dHypot > 9.0d) {
                        double d11 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i10];
                        double[] dArr7 = dArr3[i10];
                        dArr6[i11] = d9 * d11 * dArr7[i11];
                        dArr4[i12][i11] = d11 * d10 * dArr7[i11];
                    }
                }
            }
        }
        this.f362mT = dArr;
        this.f363mY = dArr2;
        this.mTangent = dArr4;
    }

    public static MonotonicCurveFit buildWave(String str) {
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i6 = 0;
        while (iIndexOf2 != -1) {
            dArr[i6] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i6++;
        }
        dArr[i6] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        return buildWave(Arrays.copyOf(dArr, i6 + 1));
    }

    private static double diff(double d6, double d7, double d8, double d9, double d10, double d11) {
        double d12 = d7 * d7;
        double d13 = d7 * 6.0d;
        double d14 = (((((-6.0d) * d12) * d9) + (d13 * d9)) + ((6.0d * d12) * d8)) - (d13 * d8);
        double d15 = 3.0d * d6;
        return ((((d14 + ((d15 * d11) * d12)) + ((d15 * d10) * d12)) - (((2.0d * d6) * d11) * d7)) - (((4.0d * d6) * d10) * d7)) + (d6 * d10);
    }

    private static double interpolate(double d6, double d7, double d8, double d9, double d10, double d11) {
        double d12 = d7 * d7;
        double d13 = d12 * d7;
        double d14 = 3.0d * d12;
        double d15 = ((((((-2.0d) * d13) * d9) + (d14 * d9)) + ((d13 * 2.0d) * d8)) - (d14 * d8)) + d8;
        double d16 = d6 * d11;
        double d17 = d6 * d10;
        return ((((d15 + (d16 * d13)) + (d13 * d17)) - (d16 * d12)) - (((d6 * 2.0d) * d10) * d12)) + (d17 * d7);
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d6, double[] dArr) {
        double[] dArr2 = this.f362mT;
        int length = dArr2.length;
        int i6 = 0;
        int length2 = this.f363mY[0].length;
        if (this.mExtrapolate) {
            double d7 = dArr2[0];
            if (d6 <= d7) {
                getSlope(d7, this.mSlopeTemp);
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f363mY[0][i7] + ((d6 - this.f362mT[0]) * this.mSlopeTemp[i7]);
                }
                return;
            }
            int i8 = length - 1;
            double d8 = dArr2[i8];
            if (d6 >= d8) {
                getSlope(d8, this.mSlopeTemp);
                while (i6 < length2) {
                    dArr[i6] = this.f363mY[i8][i6] + ((d6 - this.f362mT[i8]) * this.mSlopeTemp[i6]);
                    i6++;
                }
                return;
            }
        } else {
            if (d6 <= dArr2[0]) {
                for (int i9 = 0; i9 < length2; i9++) {
                    dArr[i9] = this.f363mY[0][i9];
                }
                return;
            }
            int i10 = length - 1;
            if (d6 >= dArr2[i10]) {
                while (i6 < length2) {
                    dArr[i6] = this.f363mY[i10][i6];
                    i6++;
                }
                return;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            if (d6 == this.f362mT[i11]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = this.f363mY[i11][i12];
                }
            }
            double[] dArr3 = this.f362mT;
            int i13 = i11 + 1;
            double d9 = dArr3[i13];
            if (d6 < d9) {
                double d10 = dArr3[i11];
                double d11 = d9 - d10;
                double d12 = (d6 - d10) / d11;
                while (i6 < length2) {
                    double[][] dArr4 = this.f363mY;
                    double d13 = dArr4[i11][i6];
                    double d14 = dArr4[i13][i6];
                    double[][] dArr5 = this.mTangent;
                    dArr[i6] = interpolate(d11, d12, d13, d14, dArr5[i11][i6], dArr5[i13][i6]);
                    i6++;
                }
                return;
            }
            i11 = i13;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d6, double[] dArr) {
        double[] dArr2 = this.f362mT;
        int length = dArr2.length;
        int length2 = this.f363mY[0].length;
        double d7 = dArr2[0];
        if (d6 > d7) {
            d7 = dArr2[length - 1];
            if (d6 < d7) {
                d7 = d6;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            double[] dArr3 = this.f362mT;
            int i7 = i6 + 1;
            double d8 = dArr3[i7];
            if (d7 <= d8) {
                double d9 = dArr3[i6];
                double d10 = d8 - d9;
                double d11 = (d7 - d9) / d10;
                for (int i8 = 0; i8 < length2; i8++) {
                    double[][] dArr4 = this.f363mY;
                    double d12 = dArr4[i6][i8];
                    double d13 = dArr4[i7][i8];
                    double[][] dArr5 = this.mTangent;
                    dArr[i8] = diff(d10, d11, d12, d13, dArr5[i6][i8], dArr5[i7][i8]) / d10;
                }
                return;
            }
            i6 = i7;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.f362mT;
    }

    private static MonotonicCurveFit buildWave(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d6 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i6 = 0; i6 < dArr.length; i6++) {
            double d7 = dArr[i6];
            int i7 = i6 + length2;
            dArr2[i7][0] = d7;
            double d8 = i6 * d6;
            dArr3[i7] = d8;
            if (i6 > 0) {
                int i8 = (length2 * 2) + i6;
                dArr2[i8][0] = d7 + 1.0d;
                dArr3[i8] = d8 + 1.0d;
                int i9 = i6 - 1;
                dArr2[i9][0] = (d7 - 1.0d) - d6;
                dArr3[i9] = (d8 - 1.0d) - d6;
            }
        }
        return new MonotonicCurveFit(dArr3, dArr2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d6, int i6) {
        double[] dArr = this.f362mT;
        int length = dArr.length;
        int i7 = 0;
        double d7 = dArr[0];
        if (d6 >= d7) {
            d7 = dArr[length - 1];
            if (d6 < d7) {
                d7 = d6;
            }
        }
        while (i7 < length - 1) {
            double[] dArr2 = this.f362mT;
            int i8 = i7 + 1;
            double d8 = dArr2[i8];
            if (d7 <= d8) {
                double d9 = dArr2[i7];
                double d10 = d8 - d9;
                double[][] dArr3 = this.f363mY;
                double d11 = dArr3[i7][i6];
                double d12 = dArr3[i8][i6];
                double[][] dArr4 = this.mTangent;
                return diff(d10, (d7 - d9) / d10, d11, d12, dArr4[i7][i6], dArr4[i8][i6]) / d10;
            }
            i7 = i8;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d6, float[] fArr) {
        double[] dArr = this.f362mT;
        int length = dArr.length;
        int i6 = 0;
        int length2 = this.f363mY[0].length;
        if (this.mExtrapolate) {
            double d7 = dArr[0];
            if (d6 <= d7) {
                getSlope(d7, this.mSlopeTemp);
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) (this.f363mY[0][i7] + ((d6 - this.f362mT[0]) * this.mSlopeTemp[i7]));
                }
                return;
            }
            int i8 = length - 1;
            double d8 = dArr[i8];
            if (d6 >= d8) {
                getSlope(d8, this.mSlopeTemp);
                while (i6 < length2) {
                    fArr[i6] = (float) (this.f363mY[i8][i6] + ((d6 - this.f362mT[i8]) * this.mSlopeTemp[i6]));
                    i6++;
                }
                return;
            }
        } else {
            if (d6 <= dArr[0]) {
                for (int i9 = 0; i9 < length2; i9++) {
                    fArr[i9] = (float) this.f363mY[0][i9];
                }
                return;
            }
            int i10 = length - 1;
            if (d6 >= dArr[i10]) {
                while (i6 < length2) {
                    fArr[i6] = (float) this.f363mY[i10][i6];
                    i6++;
                }
                return;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            if (d6 == this.f362mT[i11]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    fArr[i12] = (float) this.f363mY[i11][i12];
                }
            }
            double[] dArr2 = this.f362mT;
            int i13 = i11 + 1;
            double d9 = dArr2[i13];
            if (d6 < d9) {
                double d10 = dArr2[i11];
                double d11 = d9 - d10;
                double d12 = (d6 - d10) / d11;
                while (i6 < length2) {
                    double[][] dArr3 = this.f363mY;
                    double d13 = dArr3[i11][i6];
                    double d14 = dArr3[i13][i6];
                    double[][] dArr4 = this.mTangent;
                    fArr[i6] = (float) interpolate(d11, d12, d13, d14, dArr4[i11][i6], dArr4[i13][i6]);
                    i6++;
                }
                return;
            }
            i11 = i13;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d6, int i6) {
        double d7;
        double d8;
        double slope;
        double[] dArr = this.f362mT;
        int length = dArr.length;
        int i7 = 0;
        if (this.mExtrapolate) {
            double d9 = dArr[0];
            if (d6 <= d9) {
                d7 = this.f363mY[0][i6];
                d8 = d6 - d9;
                slope = getSlope(d9, i6);
            } else {
                int i8 = length - 1;
                double d10 = dArr[i8];
                if (d6 >= d10) {
                    d7 = this.f363mY[i8][i6];
                    d8 = d6 - d10;
                    slope = getSlope(d10, i6);
                }
            }
            return d7 + (d8 * slope);
        }
        if (d6 <= dArr[0]) {
            return this.f363mY[0][i6];
        }
        int i9 = length - 1;
        if (d6 >= dArr[i9]) {
            return this.f363mY[i9][i6];
        }
        while (i7 < length - 1) {
            double[] dArr2 = this.f362mT;
            double d11 = dArr2[i7];
            if (d6 == d11) {
                return this.f363mY[i7][i6];
            }
            int i10 = i7 + 1;
            double d12 = dArr2[i10];
            if (d6 < d12) {
                double d13 = d12 - d11;
                double d14 = (d6 - d11) / d13;
                double[][] dArr3 = this.f363mY;
                double d15 = dArr3[i7][i6];
                double d16 = dArr3[i10][i6];
                double[][] dArr4 = this.mTangent;
                return interpolate(d13, d14, d15, d16, dArr4[i7][i6], dArr4[i10][i6]);
            }
            i7 = i10;
        }
        return 0.0d;
    }
}
