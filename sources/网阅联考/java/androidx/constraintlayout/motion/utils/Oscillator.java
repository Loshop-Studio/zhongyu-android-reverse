package androidx.constraintlayout.motion.utils;

import java.util.Arrays;

/* loaded from: classes.dex */
public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    double[] mArea;
    int mType;
    float[] mPeriod = new float[0];
    double[] mPosition = new double[0];
    double PI2 = 6.283185307179586d;
    private boolean mNormalized = false;

    public void addPoint(double d4, float f4) {
        int length = this.mPeriod.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.mPosition, d4);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.mPosition = Arrays.copyOf(this.mPosition, length);
        this.mPeriod = Arrays.copyOf(this.mPeriod, length);
        this.mArea = new double[length];
        double[] dArr = this.mPosition;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.mPosition[iBinarySearch] = d4;
        this.mPeriod[iBinarySearch] = f4;
        this.mNormalized = false;
    }

    public double getDP(double d4) {
        if (d4 <= 0.0d) {
            d4 = 1.0E-5d;
        } else if (d4 >= 1.0d) {
            d4 = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch(this.mPosition, d4);
        if (iBinarySearch > 0 || iBinarySearch == 0) {
            return 0.0d;
        }
        int i4 = (-iBinarySearch) - 1;
        float[] fArr = this.mPeriod;
        float f4 = fArr[i4];
        int i5 = i4 - 1;
        float f5 = fArr[i5];
        double d5 = f4 - f5;
        double[] dArr = this.mPosition;
        double d6 = dArr[i4];
        double d7 = dArr[i5];
        double d8 = d5 / (d6 - d7);
        return (f5 - (d8 * d7)) + (d4 * d8);
    }

    public double getP(double d4) {
        if (d4 < 0.0d) {
            d4 = 0.0d;
        } else if (d4 > 1.0d) {
            d4 = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.mPosition, d4);
        if (iBinarySearch > 0) {
            return 1.0d;
        }
        if (iBinarySearch == 0) {
            return 0.0d;
        }
        int i4 = (-iBinarySearch) - 1;
        float[] fArr = this.mPeriod;
        float f4 = fArr[i4];
        int i5 = i4 - 1;
        float f5 = fArr[i5];
        double d5 = f4 - f5;
        double[] dArr = this.mPosition;
        double d6 = dArr[i4];
        double d7 = dArr[i5];
        double d8 = d5 / (d6 - d7);
        return this.mArea[i5] + ((f5 - (d8 * d7)) * (d4 - d7)) + ((d8 * ((d4 * d4) - (d7 * d7))) / 2.0d);
    }

    public double getSlope(double d4) {
        double dp;
        double dSignum;
        double dp2;
        double dp3;
        double dSin;
        switch (this.mType) {
            case 1:
                return 0.0d;
            case 2:
                dp = getDP(d4) * 4.0d;
                dSignum = Math.signum((((getP(d4) * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                return dp * dSignum;
            case 3:
                dp2 = getDP(d4);
                return dp2 * 2.0d;
            case 4:
                dp2 = -getDP(d4);
                return dp2 * 2.0d;
            case 5:
                dp3 = (-this.PI2) * getDP(d4);
                dSin = Math.sin(this.PI2 * getP(d4));
                return dp3 * dSin;
            case 6:
                dp = getDP(d4) * 4.0d;
                dSignum = (((getP(d4) * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                return dp * dSignum;
            default:
                dp3 = this.PI2 * getDP(d4);
                dSin = Math.cos(this.PI2 * getP(d4));
                return dp3 * dSin;
        }
    }

    public double getValue(double d4) {
        double dAbs;
        switch (this.mType) {
            case 1:
                return Math.signum(0.5d - (getP(d4) % 1.0d));
            case 2:
                dAbs = Math.abs((((getP(d4) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((getP(d4) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((getP(d4) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.PI2 * getP(d4));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((getP(d4) * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            default:
                return Math.sin(this.PI2 * getP(d4));
        }
        return 1.0d - dAbs;
    }

    public void normalize() {
        double d4 = 0.0d;
        int i4 = 0;
        while (true) {
            if (i4 >= this.mPeriod.length) {
                break;
            }
            d4 += r7[i4];
            i4++;
        }
        double d5 = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr = this.mPeriod;
            if (i5 >= fArr.length) {
                break;
            }
            int i6 = i5 - 1;
            float f4 = (fArr[i6] + fArr[i5]) / 2.0f;
            double[] dArr = this.mPosition;
            d5 += (dArr[i5] - dArr[i6]) * f4;
            i5++;
        }
        int i7 = 0;
        while (true) {
            float[] fArr2 = this.mPeriod;
            if (i7 >= fArr2.length) {
                break;
            }
            fArr2[i7] = (float) (fArr2[i7] * (d4 / d5));
            i7++;
        }
        this.mArea[0] = 0.0d;
        int i8 = 1;
        while (true) {
            float[] fArr3 = this.mPeriod;
            if (i8 >= fArr3.length) {
                this.mNormalized = true;
                return;
            }
            int i9 = i8 - 1;
            float f5 = (fArr3[i9] + fArr3[i8]) / 2.0f;
            double[] dArr2 = this.mPosition;
            double d6 = dArr2[i8] - dArr2[i9];
            double[] dArr3 = this.mArea;
            dArr3[i8] = dArr3[i9] + (d6 * f5);
            i8++;
        }
    }

    public void setType(int i4) {
        this.mType = i4;
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.mPosition) + " period=" + Arrays.toString(this.mPeriod);
    }
}
