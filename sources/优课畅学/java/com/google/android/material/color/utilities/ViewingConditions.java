package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);

    /* renamed from: aw */
    private final double f3841aw;

    /* renamed from: c */
    private final double f3842c;

    /* renamed from: fl */
    private final double f3843fl;
    private final double flRoot;

    /* renamed from: n */
    private final double f3844n;
    private final double nbb;

    /* renamed from: nc */
    private final double f3845nc;
    private final double ncb;
    private final double[] rgbD;

    /* renamed from: z */
    private final double f3846z;

    private ViewingConditions(double d10, double d11, double d12, double d13, double d14, double d15, double[] dArr, double d16, double d17, double d18) {
        this.f3844n = d10;
        this.f3841aw = d11;
        this.nbb = d12;
        this.ncb = d13;
        this.f3842c = d14;
        this.f3845nc = d15;
        this.rgbD = dArr;
        this.f3843fl = d16;
        this.flRoot = d17;
        this.f3846z = d18;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d10) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d10, 2.0d, false);
    }

    public static ViewingConditions make(double[] dArr, double d10, double d11, double d12, boolean z10) {
        double d13;
        double dExp;
        double dMax = Math.max(0.1d, d11);
        double[][] dArr2 = Cam16.XYZ_TO_CAM16RGB;
        double d14 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d15 = dArr3[0] * d14;
        double d16 = dArr[1];
        double d17 = d15 + (dArr3[1] * d16);
        double d18 = dArr[2];
        double d19 = d17 + (dArr3[2] * d18);
        double[] dArr4 = dArr2[1];
        double d20 = (dArr4[0] * d14) + (dArr4[1] * d16) + (dArr4[2] * d18);
        double[] dArr5 = dArr2[2];
        double d21 = (d14 * dArr5[0]) + (d16 * dArr5[1]) + (d18 * dArr5[2]);
        double d22 = (d12 / 10.0d) + 0.8d;
        double dLerp = d22 >= 0.9d ? MathUtils.lerp(0.59d, 0.69d, (d22 - 0.9d) * 10.0d) : MathUtils.lerp(0.525d, 0.59d, (d22 - 0.8d) * 10.0d);
        if (z10) {
            d13 = 0.1d;
            dExp = 1.0d;
        } else {
            d13 = 0.1d;
            dExp = (1.0d - (Math.exp(((-d10) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d22;
        }
        double dClampDouble = MathUtils.clampDouble(AudioStats.AUDIO_AMPLITUDE_NONE, 1.0d, dExp);
        double[] dArr6 = {(((100.0d / d19) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d20) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d21) * dClampDouble) + 1.0d) - dClampDouble};
        double d23 = 5.0d * d10;
        double d24 = 1.0d / (d23 + 1.0d);
        double d25 = d24 * d24 * d24 * d24;
        double d26 = 1.0d - d25;
        double dCbrt = (d25 * d10) + (d26 * d13 * d26 * Math.cbrt(d23));
        double dYFromLstar = ColorUtils.yFromLstar(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dYFromLstar) + 1.48d;
        double dPow = 0.725d / Math.pow(dYFromLstar, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d19) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d20) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d21) / 100.0d, 0.42d)};
        double d27 = dArr7[0];
        double d28 = (d27 * 400.0d) / (d27 + 27.13d);
        double d29 = dArr7[1];
        double d30 = (d29 * 400.0d) / (d29 + 27.13d);
        double d31 = dArr7[2];
        double[] dArr8 = {d28, d30, (400.0d * d31) / (d31 + 27.13d)};
        return new ViewingConditions(dYFromLstar, ((dArr8[0] * 2.0d) + dArr8[1] + (dArr8[2] * 0.05d)) * dPow, dPow, dPow, dLerp, d22, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    public double getAw() {
        return this.f3841aw;
    }

    public double getC() {
        return this.f3842c;
    }

    public double getFl() {
        return this.f3843fl;
    }

    public double getFlRoot() {
        return this.flRoot;
    }

    public double getN() {
        return this.f3844n;
    }

    public double getNbb() {
        return this.nbb;
    }

    public double getNc() {
        return this.f3845nc;
    }

    public double getNcb() {
        return this.ncb;
    }

    public double[] getRgbD() {
        return this.rgbD;
    }

    public double getZ() {
        return this.f3846z;
    }
}
