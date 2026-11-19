package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;
import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public class HyperSpline {
    double[][] mCtl;
    Cubic[][] mCurve;
    double[] mCurveLength;
    int mDimensionality;
    int mPoints;
    double mTotalLength;

    public static class Cubic {

        /* renamed from: mA */
        double f1307mA;

        /* renamed from: mB */
        double f1308mB;

        /* renamed from: mC */
        double f1309mC;

        /* renamed from: mD */
        double f1310mD;

        public Cubic(double d10, double d11, double d12, double d13) {
            this.f1307mA = d10;
            this.f1308mB = d11;
            this.f1309mC = d12;
            this.f1310mD = d13;
        }

        public double eval(double d10) {
            return (((((this.f1310mD * d10) + this.f1309mC) * d10) + this.f1308mB) * d10) + this.f1307mA;
        }

        public double vel(double d10) {
            return (((this.f1310mD * 3.0d * d10) + (this.f1309mC * 2.0d)) * d10) + this.f1308mB;
        }
    }

    public HyperSpline(double[][] dArr) {
        setup(dArr);
    }

    public static Cubic[] calcNaturalCubic(int i9, double[] dArr) {
        double[] dArr2 = new double[i9];
        double[] dArr3 = new double[i9];
        double[] dArr4 = new double[i9];
        int i10 = i9 - 1;
        int i11 = 0;
        dArr2[0] = 0.5d;
        int i12 = 1;
        for (int i13 = 1; i13 < i10; i13++) {
            dArr2[i13] = 1.0d / (4.0d - dArr2[i13 - 1]);
        }
        int i14 = i9 - 2;
        dArr2[i10] = 1.0d / (2.0d - dArr2[i14]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i12 < i10) {
            int i15 = i12 + 1;
            int i16 = i12 - 1;
            dArr3[i12] = (((dArr[i15] - dArr[i16]) * 3.0d) - dArr3[i16]) * dArr2[i12];
            i12 = i15;
        }
        double d10 = (((dArr[i10] - dArr[i14]) * 3.0d) - dArr3[i14]) * dArr2[i10];
        dArr3[i10] = d10;
        dArr4[i10] = d10;
        while (i14 >= 0) {
            dArr4[i14] = dArr3[i14] - (dArr2[i14] * dArr4[i14 + 1]);
            i14--;
        }
        Cubic[] cubicArr = new Cubic[i10];
        while (i11 < i10) {
            double d11 = dArr[i11];
            double d12 = dArr4[i11];
            int i17 = i11 + 1;
            double d13 = dArr[i17];
            double d14 = dArr4[i17];
            cubicArr[i11] = new Cubic((float) d11, d12, (((d13 - d11) * 3.0d) - (d12 * 2.0d)) - d14, ((d11 - d13) * 2.0d) + d12 + d14);
            i11 = i17;
        }
        return cubicArr;
    }

    public double approxLength(Cubic[] cubicArr) {
        int i9;
        int length = cubicArr.length;
        double[] dArr = new double[length];
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double d11 = 0.0d;
        double dSqrt = 0.0d;
        while (true) {
            i9 = 0;
            if (d11 >= 1.0d) {
                break;
            }
            double d12 = 0.0d;
            while (i9 < length) {
                double d13 = dArr[i9];
                double dEval = cubicArr[i9].eval(d11);
                dArr[i9] = dEval;
                double d14 = d13 - dEval;
                d12 += d14 * d14;
                i9++;
            }
            if (d11 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                dSqrt += Math.sqrt(d12);
            }
            d11 += 0.1d;
        }
        while (i9 < length) {
            double d15 = dArr[i9];
            double dEval2 = cubicArr[i9].eval(1.0d);
            dArr[i9] = dEval2;
            double d16 = d15 - dEval2;
            d10 += d16 * d16;
            i9++;
        }
        return dSqrt + Math.sqrt(d10);
    }

    public void getPos(double d10, double[] dArr) {
        double d11 = d10 * this.mTotalLength;
        int i9 = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (i9 >= dArr2.length - 1) {
                break;
            }
            double d12 = dArr2[i9];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i9++;
        }
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr[i10] = this.mCurve[i10][i9].eval(d11 / this.mCurveLength[i9]);
        }
    }

    public void getVelocity(double d10, double[] dArr) {
        double d11 = d10 * this.mTotalLength;
        int i9 = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (i9 >= dArr2.length - 1) {
                break;
            }
            double d12 = dArr2[i9];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i9++;
        }
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr[i10] = this.mCurve[i10][i9].vel(d11 / this.mCurveLength[i9]);
        }
    }

    public void setup(double[][] dArr) {
        int i9;
        int length = dArr[0].length;
        this.mDimensionality = length;
        int length2 = dArr.length;
        this.mPoints = length2;
        this.mCtl = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        this.mCurve = new Cubic[this.mDimensionality][];
        for (int i10 = 0; i10 < this.mDimensionality; i10++) {
            for (int i11 = 0; i11 < this.mPoints; i11++) {
                this.mCtl[i10][i11] = dArr[i11][i10];
            }
        }
        int i12 = 0;
        while (true) {
            i9 = this.mDimensionality;
            if (i12 >= i9) {
                break;
            }
            Cubic[][] cubicArr = this.mCurve;
            double[] dArr2 = this.mCtl[i12];
            cubicArr[i12] = calcNaturalCubic(dArr2.length, dArr2);
            i12++;
        }
        this.mCurveLength = new double[this.mPoints - 1];
        this.mTotalLength = AudioStats.AUDIO_AMPLITUDE_NONE;
        Cubic[] cubicArr2 = new Cubic[i9];
        for (int i13 = 0; i13 < this.mCurveLength.length; i13++) {
            for (int i14 = 0; i14 < this.mDimensionality; i14++) {
                cubicArr2[i14] = this.mCurve[i14][i13];
            }
            double d10 = this.mTotalLength;
            double[] dArr3 = this.mCurveLength;
            double dApproxLength = approxLength(cubicArr2);
            dArr3[i13] = dApproxLength;
            this.mTotalLength = d10 + dApproxLength;
        }
    }

    public HyperSpline() {
    }

    public void getPos(double d10, float[] fArr) {
        double d11 = d10 * this.mTotalLength;
        int i9 = 0;
        while (true) {
            double[] dArr = this.mCurveLength;
            if (i9 >= dArr.length - 1) {
                break;
            }
            double d12 = dArr[i9];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i9++;
        }
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = (float) this.mCurve[i10][i9].eval(d11 / this.mCurveLength[i9]);
        }
    }

    public double getPos(double d10, int i9) {
        double[] dArr;
        double d11 = d10 * this.mTotalLength;
        int i10 = 0;
        while (true) {
            dArr = this.mCurveLength;
            if (i10 >= dArr.length - 1) {
                break;
            }
            double d12 = dArr[i10];
            if (d12 >= d11) {
                break;
            }
            d11 -= d12;
            i10++;
        }
        return this.mCurve[i9][i10].eval(d11 / dArr[i10]);
    }
}
