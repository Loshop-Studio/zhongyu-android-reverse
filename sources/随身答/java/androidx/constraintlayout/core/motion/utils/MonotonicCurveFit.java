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
    private double[] f1313mT;
    private double[][] mTangent;

    /* renamed from: mY */
    private double[][] f1314mY;

    public MonotonicCurveFit(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.mSlopeTemp = new double[length2];
        int i9 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i9, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i10 = 0; i10 < length2; i10++) {
            int i11 = 0;
            while (i11 < i9) {
                int i12 = i11 + 1;
                double d10 = dArr[i12] - dArr[i11];
                double[] dArr5 = dArr3[i11];
                double d11 = (dArr2[i12][i10] - dArr2[i11][i10]) / d10;
                dArr5[i10] = d11;
                if (i11 == 0) {
                    dArr4[i11][i10] = d11;
                } else {
                    dArr4[i11][i10] = (dArr3[i11 - 1][i10] + d11) * 0.5d;
                }
                i11 = i12;
            }
            dArr4[i9][i10] = dArr3[length - 2][i10];
        }
        for (int i13 = 0; i13 < i9; i13++) {
            for (int i14 = 0; i14 < length2; i14++) {
                double d12 = dArr3[i13][i14];
                if (d12 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                    dArr4[i13][i14] = 0.0d;
                    dArr4[i13 + 1][i14] = 0.0d;
                } else {
                    double d13 = dArr4[i13][i14] / d12;
                    int i15 = i13 + 1;
                    double d14 = dArr4[i15][i14] / d12;
                    double dHypot = Math.hypot(d13, d14);
                    if (dHypot > 9.0d) {
                        double d15 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i13];
                        double[] dArr7 = dArr3[i13];
                        dArr6[i14] = d13 * d15 * dArr7[i14];
                        dArr4[i15][i14] = d15 * d14 * dArr7[i14];
                    }
                }
            }
        }
        this.f1313mT = dArr;
        this.f1314mY = dArr2;
        this.mTangent = dArr4;
    }

    public static MonotonicCurveFit buildWave(String str) {
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i9 = 0;
        while (iIndexOf2 != -1) {
            dArr[i9] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i9++;
        }
        dArr[i9] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        return buildWave(Arrays.copyOf(dArr, i9 + 1));
    }

    private static double diff(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d11 * 6.0d;
        double d18 = (((((-6.0d) * d16) * d13) + (d17 * d13)) + ((6.0d * d16) * d12)) - (d17 * d12);
        double d19 = 3.0d * d10;
        return ((((d18 + ((d19 * d15) * d16)) + ((d19 * d14) * d16)) - (((2.0d * d10) * d15) * d11)) - (((4.0d * d10) * d14) * d11)) + (d10 * d14);
    }

    private static double interpolate(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d16 * d11;
        double d18 = 3.0d * d16;
        double d19 = ((((((-2.0d) * d17) * d13) + (d18 * d13)) + ((d17 * 2.0d) * d12)) - (d18 * d12)) + d12;
        double d20 = d10 * d15;
        double d21 = d10 * d14;
        return ((((d19 + (d20 * d17)) + (d17 * d21)) - (d20 * d16)) - (((d10 * 2.0d) * d14) * d16)) + (d21 * d11);
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d10, double[] dArr) {
        double[] dArr2 = this.f1313mT;
        int length = dArr2.length;
        int i9 = 0;
        int length2 = this.f1314mY[0].length;
        if (this.mExtrapolate) {
            double d11 = dArr2[0];
            if (d10 <= d11) {
                getSlope(d11, this.mSlopeTemp);
                for (int i10 = 0; i10 < length2; i10++) {
                    dArr[i10] = this.f1314mY[0][i10] + ((d10 - this.f1313mT[0]) * this.mSlopeTemp[i10]);
                }
                return;
            }
            int i11 = length - 1;
            double d12 = dArr2[i11];
            if (d10 >= d12) {
                getSlope(d12, this.mSlopeTemp);
                while (i9 < length2) {
                    dArr[i9] = this.f1314mY[i11][i9] + ((d10 - this.f1313mT[i11]) * this.mSlopeTemp[i9]);
                    i9++;
                }
                return;
            }
        } else {
            if (d10 <= dArr2[0]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = this.f1314mY[0][i12];
                }
                return;
            }
            int i13 = length - 1;
            if (d10 >= dArr2[i13]) {
                while (i9 < length2) {
                    dArr[i9] = this.f1314mY[i13][i9];
                    i9++;
                }
                return;
            }
        }
        int i14 = 0;
        while (i14 < length - 1) {
            if (d10 == this.f1313mT[i14]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    dArr[i15] = this.f1314mY[i14][i15];
                }
            }
            double[] dArr3 = this.f1313mT;
            int i16 = i14 + 1;
            double d13 = dArr3[i16];
            if (d10 < d13) {
                double d14 = dArr3[i14];
                double d15 = d13 - d14;
                double d16 = (d10 - d14) / d15;
                while (i9 < length2) {
                    double[][] dArr4 = this.f1314mY;
                    double d17 = dArr4[i14][i9];
                    double d18 = dArr4[i16][i9];
                    double[][] dArr5 = this.mTangent;
                    dArr[i9] = interpolate(d15, d16, d17, d18, dArr5[i14][i9], dArr5[i16][i9]);
                    i9++;
                }
                return;
            }
            i14 = i16;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d10, double[] dArr) {
        double[] dArr2 = this.f1313mT;
        int length = dArr2.length;
        int length2 = this.f1314mY[0].length;
        double d11 = dArr2[0];
        if (d10 > d11) {
            d11 = dArr2[length - 1];
            if (d10 < d11) {
                d11 = d10;
            }
        }
        int i9 = 0;
        while (i9 < length - 1) {
            double[] dArr3 = this.f1313mT;
            int i10 = i9 + 1;
            double d12 = dArr3[i10];
            if (d11 <= d12) {
                double d13 = dArr3[i9];
                double d14 = d12 - d13;
                double d15 = (d11 - d13) / d14;
                for (int i11 = 0; i11 < length2; i11++) {
                    double[][] dArr4 = this.f1314mY;
                    double d16 = dArr4[i9][i11];
                    double d17 = dArr4[i10][i11];
                    double[][] dArr5 = this.mTangent;
                    dArr[i11] = diff(d14, d15, d16, d17, dArr5[i9][i11], dArr5[i10][i11]) / d14;
                }
                return;
            }
            i9 = i10;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.f1313mT;
    }

    private static MonotonicCurveFit buildWave(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d10 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i9 = 0; i9 < dArr.length; i9++) {
            double d11 = dArr[i9];
            int i10 = i9 + length2;
            dArr2[i10][0] = d11;
            double d12 = i9 * d10;
            dArr3[i10] = d12;
            if (i9 > 0) {
                int i11 = (length2 * 2) + i9;
                dArr2[i11][0] = d11 + 1.0d;
                dArr3[i11] = d12 + 1.0d;
                int i12 = i9 - 1;
                dArr2[i12][0] = (d11 - 1.0d) - d10;
                dArr3[i12] = (d12 - 1.0d) - d10;
            }
        }
        return new MonotonicCurveFit(dArr3, dArr2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d10, int i9) {
        double[] dArr = this.f1313mT;
        int length = dArr.length;
        int i10 = 0;
        double d11 = dArr[0];
        if (d10 >= d11) {
            d11 = dArr[length - 1];
            if (d10 < d11) {
                d11 = d10;
            }
        }
        while (i10 < length - 1) {
            double[] dArr2 = this.f1313mT;
            int i11 = i10 + 1;
            double d12 = dArr2[i11];
            if (d11 <= d12) {
                double d13 = dArr2[i10];
                double d14 = d12 - d13;
                double[][] dArr3 = this.f1314mY;
                double d15 = dArr3[i10][i9];
                double d16 = dArr3[i11][i9];
                double[][] dArr4 = this.mTangent;
                return diff(d14, (d11 - d13) / d14, d15, d16, dArr4[i10][i9], dArr4[i11][i9]) / d14;
            }
            i10 = i11;
        }
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d10, float[] fArr) {
        double[] dArr = this.f1313mT;
        int length = dArr.length;
        int i9 = 0;
        int length2 = this.f1314mY[0].length;
        if (this.mExtrapolate) {
            double d11 = dArr[0];
            if (d10 <= d11) {
                getSlope(d11, this.mSlopeTemp);
                for (int i10 = 0; i10 < length2; i10++) {
                    fArr[i10] = (float) (this.f1314mY[0][i10] + ((d10 - this.f1313mT[0]) * this.mSlopeTemp[i10]));
                }
                return;
            }
            int i11 = length - 1;
            double d12 = dArr[i11];
            if (d10 >= d12) {
                getSlope(d12, this.mSlopeTemp);
                while (i9 < length2) {
                    fArr[i9] = (float) (this.f1314mY[i11][i9] + ((d10 - this.f1313mT[i11]) * this.mSlopeTemp[i9]));
                    i9++;
                }
                return;
            }
        } else {
            if (d10 <= dArr[0]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    fArr[i12] = (float) this.f1314mY[0][i12];
                }
                return;
            }
            int i13 = length - 1;
            if (d10 >= dArr[i13]) {
                while (i9 < length2) {
                    fArr[i9] = (float) this.f1314mY[i13][i9];
                    i9++;
                }
                return;
            }
        }
        int i14 = 0;
        while (i14 < length - 1) {
            if (d10 == this.f1313mT[i14]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    fArr[i15] = (float) this.f1314mY[i14][i15];
                }
            }
            double[] dArr2 = this.f1313mT;
            int i16 = i14 + 1;
            double d13 = dArr2[i16];
            if (d10 < d13) {
                double d14 = dArr2[i14];
                double d15 = d13 - d14;
                double d16 = (d10 - d14) / d15;
                while (i9 < length2) {
                    double[][] dArr3 = this.f1314mY;
                    double d17 = dArr3[i14][i9];
                    double d18 = dArr3[i16][i9];
                    double[][] dArr4 = this.mTangent;
                    fArr[i9] = (float) interpolate(d15, d16, d17, d18, dArr4[i14][i9], dArr4[i16][i9]);
                    i9++;
                }
                return;
            }
            i14 = i16;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d10, int i9) {
        double d11;
        double d12;
        double slope;
        double[] dArr = this.f1313mT;
        int length = dArr.length;
        int i10 = 0;
        if (this.mExtrapolate) {
            double d13 = dArr[0];
            if (d10 <= d13) {
                d11 = this.f1314mY[0][i9];
                d12 = d10 - d13;
                slope = getSlope(d13, i9);
            } else {
                int i11 = length - 1;
                double d14 = dArr[i11];
                if (d10 >= d14) {
                    d11 = this.f1314mY[i11][i9];
                    d12 = d10 - d14;
                    slope = getSlope(d14, i9);
                }
            }
            return d11 + (d12 * slope);
        }
        if (d10 <= dArr[0]) {
            return this.f1314mY[0][i9];
        }
        int i12 = length - 1;
        if (d10 >= dArr[i12]) {
            return this.f1314mY[i12][i9];
        }
        while (i10 < length - 1) {
            double[] dArr2 = this.f1313mT;
            double d15 = dArr2[i10];
            if (d10 == d15) {
                return this.f1314mY[i10][i9];
            }
            int i13 = i10 + 1;
            double d16 = dArr2[i13];
            if (d10 < d16) {
                double d17 = d16 - d15;
                double d18 = (d10 - d15) / d17;
                double[][] dArr3 = this.f1314mY;
                double d19 = dArr3[i10][i9];
                double d20 = dArr3[i13][i9];
                double[][] dArr4 = this.mTangent;
                return interpolate(d17, d18, d19, d20, dArr4[i10][i9], dArr4[i13][i9]);
            }
            i10 = i13;
        }
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }
}
