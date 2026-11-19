package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);

    /* renamed from: aw */
    private final double f3446aw;

    /* renamed from: c */
    private final double f3447c;

    /* renamed from: fl */
    private final double f3448fl;
    private final double flRoot;

    /* renamed from: n */
    private final double f3449n;
    private final double nbb;

    /* renamed from: nc */
    private final double f3450nc;
    private final double ncb;
    private final double[] rgbD;

    /* renamed from: z */
    private final double f3451z;

    private ViewingConditions(double d6, double d7, double d8, double d9, double d10, double d11, double[] dArr, double d12, double d13, double d14) {
        this.f3449n = d6;
        this.f3446aw = d7;
        this.nbb = d8;
        this.ncb = d9;
        this.f3447c = d10;
        this.f3450nc = d11;
        this.rgbD = dArr;
        this.f3448fl = d12;
        this.flRoot = d13;
        this.f3451z = d14;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d6) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d6, 2.0d, false);
    }

    public static ViewingConditions make(double[] dArr, double d6, double d7, double d8, boolean z6) {
        double d9;
        double dExp;
        double dMax = Math.max(0.1d, d7);
        double[][] dArr2 = Cam16.XYZ_TO_CAM16RGB;
        double d10 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d11 = dArr3[0] * d10;
        double d12 = dArr[1];
        double d13 = d11 + (dArr3[1] * d12);
        double d14 = dArr[2];
        double d15 = d13 + (dArr3[2] * d14);
        double[] dArr4 = dArr2[1];
        double d16 = (dArr4[0] * d10) + (dArr4[1] * d12) + (dArr4[2] * d14);
        double[] dArr5 = dArr2[2];
        double d17 = (d10 * dArr5[0]) + (d12 * dArr5[1]) + (d14 * dArr5[2]);
        double d18 = (d8 / 10.0d) + 0.8d;
        double dLerp = d18 >= 0.9d ? MathUtils.lerp(0.59d, 0.69d, (d18 - 0.9d) * 10.0d) : MathUtils.lerp(0.525d, 0.59d, (d18 - 0.8d) * 10.0d);
        if (z6) {
            d9 = 0.1d;
            dExp = 1.0d;
        } else {
            d9 = 0.1d;
            dExp = (1.0d - (Math.exp(((-d6) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d18;
        }
        double dClampDouble = MathUtils.clampDouble(0.0d, 1.0d, dExp);
        double[] dArr6 = {(((100.0d / d15) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d16) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d17) * dClampDouble) + 1.0d) - dClampDouble};
        double d19 = 5.0d * d6;
        double d20 = 1.0d / (d19 + 1.0d);
        double d21 = d20 * d20 * d20 * d20;
        double d22 = 1.0d - d21;
        double dCbrt = (d21 * d6) + (d22 * d9 * d22 * Math.cbrt(d19));
        double dYFromLstar = ColorUtils.yFromLstar(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dYFromLstar) + 1.48d;
        double dPow = 0.725d / Math.pow(dYFromLstar, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d15) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d16) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d17) / 100.0d, 0.42d)};
        double d23 = dArr7[0];
        double d24 = (d23 * 400.0d) / (d23 + 27.13d);
        double d25 = dArr7[1];
        double d26 = (d25 * 400.0d) / (d25 + 27.13d);
        double d27 = dArr7[2];
        double[] dArr8 = {d24, d26, (400.0d * d27) / (d27 + 27.13d)};
        return new ViewingConditions(dYFromLstar, ((dArr8[0] * 2.0d) + dArr8[1] + (dArr8[2] * 0.05d)) * dPow, dPow, dPow, dLerp, d18, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    public double getAw() {
        return this.f3446aw;
    }

    public double getC() {
        return this.f3447c;
    }

    public double getFl() {
        return this.f3448fl;
    }

    public double getFlRoot() {
        return this.flRoot;
    }

    public double getN() {
        return this.f3449n;
    }

    public double getNbb() {
        return this.nbb;
    }

    public double getNc() {
        return this.f3450nc;
    }

    public double getNcb() {
        return this.ncb;
    }

    public double[] getRgbD() {
        return this.rgbD;
    }

    public double getZ() {
        return this.f3451z;
    }
}
