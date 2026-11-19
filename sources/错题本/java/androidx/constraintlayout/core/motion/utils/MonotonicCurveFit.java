package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class MonotonicCurveFit extends CurveFit {
    private static final String TAG = "MonotonicCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;

    /* renamed from: mT */
    private double[] f956mT;
    private double[][] mTangent;

    /* renamed from: mY */
    private double[][] f957mY;

    public MonotonicCurveFit(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.mSlopeTemp = new double[length2];
        int i = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i8 = 0; i8 < length2; i8++) {
            int i9 = 0;
            while (i9 < i) {
                int i10 = i9 + 1;
                double d9 = dArr[i10] - dArr[i9];
                double[] dArr5 = dArr3[i9];
                double d10 = (dArr2[i10][i8] - dArr2[i9][i8]) / d9;
                dArr5[i8] = d10;
                if (i9 == 0) {
                    dArr4[i9][i8] = d10;
                } else {
                    dArr4[i9][i8] = (dArr3[i9 - 1][i8] + d10) * 0.5d;
                }
                i9 = i10;
            }
            dArr4[i][i8] = dArr3[length - 2][i8];
        }
        for (int i11 = 0; i11 < i; i11++) {
            for (int i12 = 0; i12 < length2; i12++) {
                double d11 = dArr3[i11][i12];
                if (d11 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                    dArr4[i11][i12] = 0.0d;
                    dArr4[i11 + 1][i12] = 0.0d;
                } else {
                    double d12 = dArr4[i11][i12] / d11;
                    int i13 = i11 + 1;
                    double d13 = dArr4[i13][i12] / d11;
                    double dHypot = Math.hypot(d12, d13);
                    if (dHypot > 9.0d) {
                        double d14 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i11];
                        double[] dArr7 = dArr3[i11];
                        dArr6[i12] = d12 * d14 * dArr7[i12];
                        dArr4[i13][i12] = d14 * d13 * dArr7[i12];
                    }
                }
            }
        }
        this.f956mT = dArr;
        this.f957mY = dArr2;
        this.mTangent = dArr4;
    }

    public static MonotonicCurveFit buildWave(String str) {
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i = 0;
        while (iIndexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        return buildWave(Arrays.copyOf(dArr, i + 1));
    }

    private static double diff(double d9, double d10, double d11, double d12, double d13, double d14) {
        double d15 = d10 * d10;
        double d16 = d10 * 6.0d;
        double d17 = 6.0d * d15 * d11;
        double d18 = (d17 + ((d16 * d12) + (((-6.0d) * d15) * d12))) - (d16 * d11);
        double d19 = 3.0d * d9;
        return (d9 * d13) + (((((d19 * d13) * d15) + (((d19 * d14) * d15) + d18)) - (((2.0d * d9) * d14) * d10)) - (((4.0d * d9) * d13) * d10));
    }

    private static double interpolate(double d9, double d10, double d11, double d12, double d13, double d14) {
        double d15 = d10 * d10;
        double d16 = d15 * d10;
        double d17 = 3.0d * d15;
        double d18 = d16 * 2.0d * d11;
        double d19 = ((d18 + ((d17 * d12) + (((-2.0d) * d16) * d12))) - (d17 * d11)) + d11;
        double d20 = d9 * d14;
        double d21 = (d20 * d16) + d19;
        double d22 = d9 * d13;
        return (d22 * d10) + ((((d16 * d22) + d21) - (d20 * d15)) - (((d9 * 2.0d) * d13) * d15));
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d9, double[] dArr) {
        double[] dArr2 = this.f956mT;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f957mY[0].length;
        if (this.mExtrapolate) {
            double d10 = dArr2[0];
            if (d9 <= d10) {
                getSlope(d10, this.mSlopeTemp);
                for (int i8 = 0; i8 < length2; i8++) {
                    dArr[i8] = ((d9 - this.f956mT[0]) * this.mSlopeTemp[i8]) + this.f957mY[0][i8];
                }
                return;
            }
            int i9 = length - 1;
            double d11 = dArr2[i9];
            if (d9 >= d11) {
                getSlope(d11, this.mSlopeTemp);
                while (i < length2) {
                    dArr[i] = ((d9 - this.f956mT[i9]) * this.mSlopeTemp[i]) + this.f957mY[i9][i];
                    i++;
                }
                return;
            }
        } else {
            if (d9 <= dArr2[0]) {
                for (int i10 = 0; i10 < length2; i10++) {
                    dArr[i10] = this.f957mY[0][i10];
                }
                return;
            }
            int i11 = length - 1;
            if (d9 >= dArr2[i11]) {
                while (i < length2) {
                    dArr[i] = this.f957mY[i11][i];
                    i++;
                }
                return;
            }
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d9 == this.f956mT[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = this.f957mY[i12][i13];
                }
            }
            double[] dArr3 = this.f956mT;
            int i14 = i12 + 1;
            double d12 = dArr3[i14];
            if (d9 < d12) {
                double d13 = dArr3[i12];
                double d14 = d12 - d13;
                double d15 = (d9 - d13) / d14;
                while (i < length2) {
                    double[][] dArr4 = this.f957mY;
                    double d16 = dArr4[i12][i];
                    double d17 = dArr4[i14][i];
                    double[][] dArr5 = this.mTangent;
                    dArr[i] = interpolate(d14, d15, d16, d17, dArr5[i12][i], dArr5[i14][i]);
                    i++;
                }
                return;
            }
            i12 = i14;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d9, double[] dArr) {
        double[] dArr2 = this.f956mT;
        int length = dArr2.length;
        int length2 = this.f957mY[0].length;
        double d10 = dArr2[0];
        if (d9 > d10) {
            d10 = dArr2[length - 1];
            if (d9 < d10) {
                d10 = d9;
            }
        }
        int i = 0;
        while (i < length - 1) {
            double[] dArr3 = this.f956mT;
            int i8 = i + 1;
            double d11 = dArr3[i8];
            if (d10 <= d11) {
                double d12 = dArr3[i];
                double d13 = d11 - d12;
                double d14 = (d10 - d12) / d13;
                for (int i9 = 0; i9 < length2; i9++) {
                    double[][] dArr4 = this.f957mY;
                    double d15 = dArr4[i][i9];
                    double d16 = dArr4[i8][i9];
                    double[][] dArr5 = this.mTangent;
                    dArr[i9] = diff(d13, d14, d15, d16, dArr5[i][i9], dArr5[i8][i9]) / d13;
                }
                return;
            }
            i = i8;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.f956mT;
    }

    private static MonotonicCurveFit buildWave(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d9 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d10 = dArr[i];
            int i8 = i + length2;
            dArr2[i8][0] = d10;
            double d11 = i * d9;
            dArr3[i8] = d11;
            if (i > 0) {
                int i9 = (length2 * 2) + i;
                dArr2[i9][0] = d10 + 1.0d;
                dArr3[i9] = d11 + 1.0d;
                int i10 = i - 1;
                dArr2[i10][0] = (d10 - 1.0d) - d9;
                dArr3[i10] = (d11 - 1.0d) - d9;
            }
        }
        return new MonotonicCurveFit(dArr3, dArr2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d9, int i) {
        double[] dArr = this.f956mT;
        int length = dArr.length;
        int i8 = 0;
        double d10 = dArr[0];
        if (d9 >= d10) {
            d10 = dArr[length - 1];
            if (d9 < d10) {
                d10 = d9;
            }
        }
        while (i8 < length - 1) {
            double[] dArr2 = this.f956mT;
            int i9 = i8 + 1;
            double d11 = dArr2[i9];
            if (d10 <= d11) {
                double d12 = dArr2[i8];
                double d13 = d11 - d12;
                double[][] dArr3 = this.f957mY;
                double d14 = dArr3[i8][i];
                double d15 = dArr3[i9][i];
                double[][] dArr4 = this.mTangent;
                return diff(d13, (d10 - d12) / d13, d14, d15, dArr4[i8][i], dArr4[i9][i]) / d13;
            }
            i8 = i9;
        }
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d9, float[] fArr) {
        double[] dArr = this.f956mT;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f957mY[0].length;
        if (this.mExtrapolate) {
            double d10 = dArr[0];
            if (d9 <= d10) {
                getSlope(d10, this.mSlopeTemp);
                for (int i8 = 0; i8 < length2; i8++) {
                    fArr[i8] = (float) (((d9 - this.f956mT[0]) * this.mSlopeTemp[i8]) + this.f957mY[0][i8]);
                }
                return;
            }
            int i9 = length - 1;
            double d11 = dArr[i9];
            if (d9 >= d11) {
                getSlope(d11, this.mSlopeTemp);
                while (i < length2) {
                    fArr[i] = (float) (((d9 - this.f956mT[i9]) * this.mSlopeTemp[i]) + this.f957mY[i9][i]);
                    i++;
                }
                return;
            }
        } else {
            if (d9 <= dArr[0]) {
                for (int i10 = 0; i10 < length2; i10++) {
                    fArr[i10] = (float) this.f957mY[0][i10];
                }
                return;
            }
            int i11 = length - 1;
            if (d9 >= dArr[i11]) {
                while (i < length2) {
                    fArr[i] = (float) this.f957mY[i11][i];
                    i++;
                }
                return;
            }
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d9 == this.f956mT[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    fArr[i13] = (float) this.f957mY[i12][i13];
                }
            }
            double[] dArr2 = this.f956mT;
            int i14 = i12 + 1;
            double d12 = dArr2[i14];
            if (d9 < d12) {
                double d13 = dArr2[i12];
                double d14 = d12 - d13;
                double d15 = (d9 - d13) / d14;
                while (i < length2) {
                    double[][] dArr3 = this.f957mY;
                    double d16 = dArr3[i12][i];
                    double d17 = dArr3[i14][i];
                    double[][] dArr4 = this.mTangent;
                    fArr[i] = (float) interpolate(d14, d15, d16, d17, dArr4[i12][i], dArr4[i14][i]);
                    i++;
                }
                return;
            }
            i12 = i14;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d9, int i) {
        double[] dArr = this.f956mT;
        int length = dArr.length;
        int i8 = 0;
        if (this.mExtrapolate) {
            double d10 = dArr[0];
            if (d9 <= d10) {
                return (getSlope(d10, i) * (d9 - d10)) + this.f957mY[0][i];
            }
            int i9 = length - 1;
            double d11 = dArr[i9];
            if (d9 >= d11) {
                return (getSlope(d11, i) * (d9 - d11)) + this.f957mY[i9][i];
            }
        } else {
            if (d9 <= dArr[0]) {
                return this.f957mY[0][i];
            }
            int i10 = length - 1;
            if (d9 >= dArr[i10]) {
                return this.f957mY[i10][i];
            }
        }
        while (i8 < length - 1) {
            double[] dArr2 = this.f956mT;
            double d12 = dArr2[i8];
            if (d9 == d12) {
                return this.f957mY[i8][i];
            }
            int i11 = i8 + 1;
            double d13 = dArr2[i11];
            if (d9 < d13) {
                double d14 = d13 - d12;
                double d15 = (d9 - d12) / d14;
                double[][] dArr3 = this.f957mY;
                double d16 = dArr3[i8][i];
                double d17 = dArr3[i11][i];
                double[][] dArr4 = this.mTangent;
                return interpolate(d14, d15, d16, d17, dArr4[i8][i], dArr4[i11][i]);
            }
            i8 = i11;
        }
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }
}
