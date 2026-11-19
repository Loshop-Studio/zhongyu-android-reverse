package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;
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

    public void addPoint(double d9, float f) {
        int length = this.mPeriod.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.mPosition, d9);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.mPosition = Arrays.copyOf(this.mPosition, length);
        this.mPeriod = Arrays.copyOf(this.mPeriod, length);
        this.mArea = new double[length];
        double[] dArr = this.mPosition;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.mPosition[iBinarySearch] = d9;
        this.mPeriod[iBinarySearch] = f;
        this.mNormalized = false;
    }

    public double getDP(double d9) {
        if (d9 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        if (d9 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.mPosition, d9);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.mPeriod;
        float f = fArr[iBinarySearch];
        int i = iBinarySearch - 1;
        float f7 = fArr[i];
        double d10 = f - f7;
        double[] dArr = this.mPosition;
        double d11 = dArr[iBinarySearch];
        double d12 = dArr[i];
        double d13 = d10 / (d11 - d12);
        return (f7 - (d13 * d12)) + (d9 * d13);
    }

    public double getP(double d9) {
        if (d9 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        if (d9 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.mPosition, d9);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.mPeriod;
        float f = fArr[iBinarySearch];
        int i = iBinarySearch - 1;
        float f7 = fArr[i];
        double d10 = f - f7;
        double[] dArr = this.mPosition;
        double d11 = dArr[iBinarySearch];
        double d12 = dArr[i];
        double d13 = d10 / (d11 - d12);
        return ((((d9 * d9) - (d12 * d12)) * d13) / 2.0d) + ((d9 - d12) * (f7 - (d13 * d12))) + this.mArea[i];
    }

    public double getSlope(double d9, double d10, double d11) {
        double d12;
        double dSignum;
        double p6 = getP(d9) + d10;
        double dp = getDP(d9) + d11;
        switch (this.mType) {
            case 1:
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            case 2:
                d12 = dp * 4.0d;
                dSignum = Math.signum((((p6 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return dp * 2.0d;
            case 4:
                return (-dp) * 2.0d;
            case 5:
                double d13 = this.mPI2;
                return Math.sin(d13 * p6) * (-d13) * dp;
            case 6:
                return ((((p6 * 4.0d) + 2.0d) % 4.0d) - 2.0d) * dp * 4.0d;
            case 7:
                return this.mCustomCurve.getSlope(p6 % 1.0d, 0);
            default:
                double d14 = this.mPI2;
                d12 = dp * d14;
                dSignum = Math.cos(d14 * p6);
                break;
        }
        return dSignum * d12;
    }

    public double getValue(double d9, double d10) {
        double dAbs;
        double p6 = getP(d9) + d10;
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
                return Math.cos((d10 + p6) * this.mPI2);
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
        double d9 = 0.0d;
        int i = 0;
        while (true) {
            if (i >= this.mPeriod.length) {
                break;
            }
            d9 += r6[i];
            i++;
        }
        double d10 = 0.0d;
        int i8 = 1;
        while (true) {
            float[] fArr = this.mPeriod;
            if (i8 >= fArr.length) {
                break;
            }
            int i9 = i8 - 1;
            float f = (fArr[i9] + fArr[i8]) / 2.0f;
            double[] dArr = this.mPosition;
            d10 += (dArr[i8] - dArr[i9]) * f;
            i8++;
        }
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.mPeriod;
            if (i10 >= fArr2.length) {
                break;
            }
            fArr2[i10] = fArr2[i10] * ((float) (d9 / d10));
            i10++;
        }
        this.mArea[0] = 0.0d;
        int i11 = 1;
        while (true) {
            float[] fArr3 = this.mPeriod;
            if (i11 >= fArr3.length) {
                this.mNormalized = true;
                return;
            }
            int i12 = i11 - 1;
            float f7 = (fArr3[i12] + fArr3[i11]) / 2.0f;
            double[] dArr2 = this.mPosition;
            double d11 = dArr2[i11] - dArr2[i12];
            double[] dArr3 = this.mArea;
            dArr3[i11] = (d11 * f7) + dArr3[i12];
            i11++;
        }
    }

    public void setType(int i, String str) {
        this.mType = i;
        this.mCustomType = str;
        if (str != null) {
            this.mCustomCurve = MonotonicCurveFit.buildWave(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.mPosition) + " period=" + Arrays.toString(this.mPeriod);
    }
}
