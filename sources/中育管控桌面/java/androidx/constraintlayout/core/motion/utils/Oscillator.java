package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    double[] mArea;
    MonotonicCurveFit mCustomCurve;
    String mCustomType;
    int mType;
    float[] mPeriod = new float[0];
    double[] mPosition = new double[0];
    double mPI2 = 6.283185307179586d;
    private boolean mNormalized = false;

    public void addPoint(double d6, float f6) {
        int length = this.mPeriod.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.mPosition, d6);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.mPosition = Arrays.copyOf(this.mPosition, length);
        this.mPeriod = Arrays.copyOf(this.mPeriod, length);
        this.mArea = new double[length];
        double[] dArr = this.mPosition;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.mPosition[iBinarySearch] = d6;
        this.mPeriod[iBinarySearch] = f6;
        this.mNormalized = false;
    }

    public double getDP(double d6) {
        if (d6 <= 0.0d) {
            return 0.0d;
        }
        if (d6 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.mPosition, d6);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.mPeriod;
        float f6 = fArr[iBinarySearch];
        int i6 = iBinarySearch - 1;
        float f7 = fArr[i6];
        double d7 = f6 - f7;
        double[] dArr = this.mPosition;
        double d8 = dArr[iBinarySearch];
        double d9 = dArr[i6];
        double d10 = d7 / (d8 - d9);
        return (d6 * d10) + (f7 - (d10 * d9));
    }

    public double getP(double d6) {
        if (d6 <= 0.0d) {
            return 0.0d;
        }
        if (d6 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.mPosition, d6);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.mPeriod;
        float f6 = fArr[iBinarySearch];
        int i6 = iBinarySearch - 1;
        float f7 = fArr[i6];
        double d7 = f6 - f7;
        double[] dArr = this.mPosition;
        double d8 = dArr[iBinarySearch];
        double d9 = dArr[i6];
        double d10 = d7 / (d8 - d9);
        return this.mArea[i6] + ((f7 - (d10 * d9)) * (d6 - d9)) + ((d10 * ((d6 * d6) - (d9 * d9))) / 2.0d);
    }

    public double getSlope(double d6, double d7, double d8) {
        double p6 = d7 + getP(d6);
        double dp = getDP(d6) + d8;
        switch (this.mType) {
            case 1:
                return 0.0d;
            case 2:
                return dp * 4.0d * Math.signum((((p6 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return dp * 2.0d;
            case 4:
                return (-dp) * 2.0d;
            case 5:
                double d9 = this.mPI2;
                return (-d9) * dp * Math.sin(d9 * p6);
            case 6:
                return dp * 4.0d * ((((p6 * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.mCustomCurve.getSlope(p6 % 1.0d, 0);
            default:
                double d10 = this.mPI2;
                return dp * d10 * Math.cos(d10 * p6);
        }
    }

    public double getValue(double d6, double d7) {
        double dAbs;
        double p6 = getP(d6) + d7;
        switch (this.mType) {
            case 1:
                return Math.signum(0.5d - (p6 % 1.0d));
            case 2:
                dAbs = Math.abs((((p6 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((p6 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((p6 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.mPI2 * (d7 + p6));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((p6 * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.mCustomCurve.getPos(p6 % 1.0d, 0);
            default:
                return Math.sin(this.mPI2 * p6);
        }
        return 1.0d - dAbs;
    }

    public void normalize() {
        double d6 = 0.0d;
        int i6 = 0;
        while (true) {
            if (i6 >= this.mPeriod.length) {
                break;
            }
            d6 += r6[i6];
            i6++;
        }
        double d7 = 0.0d;
        int i7 = 1;
        while (true) {
            float[] fArr = this.mPeriod;
            if (i7 >= fArr.length) {
                break;
            }
            int i8 = i7 - 1;
            float f6 = (fArr[i8] + fArr[i7]) / 2.0f;
            double[] dArr = this.mPosition;
            d7 += (dArr[i7] - dArr[i8]) * f6;
            i7++;
        }
        int i9 = 0;
        while (true) {
            float[] fArr2 = this.mPeriod;
            if (i9 >= fArr2.length) {
                break;
            }
            fArr2[i9] = fArr2[i9] * ((float) (d6 / d7));
            i9++;
        }
        this.mArea[0] = 0.0d;
        int i10 = 1;
        while (true) {
            float[] fArr3 = this.mPeriod;
            if (i10 >= fArr3.length) {
                this.mNormalized = true;
                return;
            }
            int i11 = i10 - 1;
            float f7 = (fArr3[i11] + fArr3[i10]) / 2.0f;
            double[] dArr2 = this.mPosition;
            double d8 = dArr2[i10] - dArr2[i11];
            double[] dArr3 = this.mArea;
            dArr3[i10] = dArr3[i11] + (d8 * f7);
            i10++;
        }
    }

    public void setType(int i6, String str) {
        this.mType = i6;
        this.mCustomType = str;
        if (str != null) {
            this.mCustomCurve = MonotonicCurveFit.buildWave(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.mPosition) + " period=" + Arrays.toString(this.mPeriod);
    }
}
