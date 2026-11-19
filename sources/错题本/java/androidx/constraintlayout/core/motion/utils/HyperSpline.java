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
        double f950mA;

        /* renamed from: mB */
        double f951mB;

        /* renamed from: mC */
        double f952mC;

        /* renamed from: mD */
        double f953mD;

        public Cubic(double d9, double d10, double d11, double d12) {
            this.f950mA = d9;
            this.f951mB = d10;
            this.f952mC = d11;
            this.f953mD = d12;
        }

        public double eval(double d9) {
            return (((((this.f953mD * d9) + this.f952mC) * d9) + this.f951mB) * d9) + this.f950mA;
        }

        public double vel(double d9) {
            return (((this.f952mC * 2.0d) + (this.f953mD * 3.0d * d9)) * d9) + this.f951mB;
        }
    }

    public HyperSpline(double[][] dArr) {
        setup(dArr);
    }

    public static Cubic[] calcNaturalCubic(int i, double[] dArr) {
        double[] dArr2 = new double[i];
        double[] dArr3 = new double[i];
        double[] dArr4 = new double[i];
        int i8 = i - 1;
        int i9 = 0;
        dArr2[0] = 0.5d;
        int i10 = 1;
        for (int i11 = 1; i11 < i8; i11++) {
            dArr2[i11] = 1.0d / (4.0d - dArr2[i11 - 1]);
        }
        int i12 = i - 2;
        dArr2[i8] = 1.0d / (2.0d - dArr2[i12]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i10 < i8) {
            int i13 = i10 + 1;
            int i14 = i10 - 1;
            dArr3[i10] = (((dArr[i13] - dArr[i14]) * 3.0d) - dArr3[i14]) * dArr2[i10];
            i10 = i13;
        }
        double d9 = (((dArr[i8] - dArr[i12]) * 3.0d) - dArr3[i12]) * dArr2[i8];
        dArr3[i8] = d9;
        dArr4[i8] = d9;
        while (i12 >= 0) {
            dArr4[i12] = dArr3[i12] - (dArr2[i12] * dArr4[i12 + 1]);
            i12--;
        }
        Cubic[] cubicArr = new Cubic[i8];
        while (i9 < i8) {
            double d10 = dArr[i9];
            double d11 = dArr4[i9];
            int i15 = i9 + 1;
            double d12 = dArr[i15];
            double d13 = dArr4[i15];
            cubicArr[i9] = new Cubic((float) d10, d11, (((d12 - d10) * 3.0d) - (d11 * 2.0d)) - d13, ((d10 - d12) * 2.0d) + d11 + d13);
            i9 = i15;
        }
        return cubicArr;
    }

    public double approxLength(Cubic[] cubicArr) {
        int i;
        int length = cubicArr.length;
        double[] dArr = new double[length];
        double d9 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double d10 = 0.0d;
        double dSqrt = 0.0d;
        while (true) {
            i = 0;
            if (d10 >= 1.0d) {
                break;
            }
            double d11 = 0.0d;
            while (i < length) {
                double d12 = dArr[i];
                double dEval = cubicArr[i].eval(d10);
                dArr[i] = dEval;
                double d13 = d12 - dEval;
                d11 += d13 * d13;
                i++;
            }
            if (d10 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                dSqrt += Math.sqrt(d11);
            }
            d10 += 0.1d;
        }
        while (i < length) {
            double d14 = dArr[i];
            double dEval2 = cubicArr[i].eval(1.0d);
            dArr[i] = dEval2;
            double d15 = d14 - dEval2;
            d9 += d15 * d15;
            i++;
        }
        return Math.sqrt(d9) + dSqrt;
    }

    public void getPos(double d9, double[] dArr) {
        double d10 = d9 * this.mTotalLength;
        int i = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d11 = dArr2[i];
            if (d11 >= d10) {
                break;
            }
            d10 -= d11;
            i++;
        }
        for (int i8 = 0; i8 < dArr.length; i8++) {
            dArr[i8] = this.mCurve[i8][i].eval(d10 / this.mCurveLength[i]);
        }
    }

    public void getVelocity(double d9, double[] dArr) {
        double d10 = d9 * this.mTotalLength;
        int i = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d11 = dArr2[i];
            if (d11 >= d10) {
                break;
            }
            d10 -= d11;
            i++;
        }
        for (int i8 = 0; i8 < dArr.length; i8++) {
            dArr[i8] = this.mCurve[i8][i].vel(d10 / this.mCurveLength[i]);
        }
    }

    public void setup(double[][] dArr) {
        int i;
        int length = dArr[0].length;
        this.mDimensionality = length;
        int length2 = dArr.length;
        this.mPoints = length2;
        this.mCtl = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        this.mCurve = new Cubic[this.mDimensionality][];
        for (int i8 = 0; i8 < this.mDimensionality; i8++) {
            for (int i9 = 0; i9 < this.mPoints; i9++) {
                this.mCtl[i8][i9] = dArr[i9][i8];
            }
        }
        int i10 = 0;
        while (true) {
            i = this.mDimensionality;
            if (i10 >= i) {
                break;
            }
            Cubic[][] cubicArr = this.mCurve;
            double[] dArr2 = this.mCtl[i10];
            cubicArr[i10] = calcNaturalCubic(dArr2.length, dArr2);
            i10++;
        }
        this.mCurveLength = new double[this.mPoints - 1];
        this.mTotalLength = AudioStats.AUDIO_AMPLITUDE_NONE;
        Cubic[] cubicArr2 = new Cubic[i];
        for (int i11 = 0; i11 < this.mCurveLength.length; i11++) {
            for (int i12 = 0; i12 < this.mDimensionality; i12++) {
                cubicArr2[i12] = this.mCurve[i12][i11];
            }
            double d9 = this.mTotalLength;
            double[] dArr3 = this.mCurveLength;
            double dApproxLength = approxLength(cubicArr2);
            dArr3[i11] = dApproxLength;
            this.mTotalLength = d9 + dApproxLength;
        }
    }

    public HyperSpline() {
    }

    public void getPos(double d9, float[] fArr) {
        double d10 = d9 * this.mTotalLength;
        int i = 0;
        while (true) {
            double[] dArr = this.mCurveLength;
            if (i >= dArr.length - 1) {
                break;
            }
            double d11 = dArr[i];
            if (d11 >= d10) {
                break;
            }
            d10 -= d11;
            i++;
        }
        for (int i8 = 0; i8 < fArr.length; i8++) {
            fArr[i8] = (float) this.mCurve[i8][i].eval(d10 / this.mCurveLength[i]);
        }
    }

    public double getPos(double d9, int i) {
        double[] dArr;
        double d10 = d9 * this.mTotalLength;
        int i8 = 0;
        while (true) {
            dArr = this.mCurveLength;
            if (i8 >= dArr.length - 1) {
                break;
            }
            double d11 = dArr[i8];
            if (d11 >= d10) {
                break;
            }
            d10 -= d11;
            i8++;
        }
        return this.mCurve[i][i8].eval(d10 / dArr[i8]);
    }
}
