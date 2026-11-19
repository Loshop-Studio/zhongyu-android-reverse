package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class Cam16 {
    private final double astar;
    private final double bstar;
    private final double chroma;
    private final double hue;

    /* renamed from: j */
    private final double f3430j;
    private final double jstar;

    /* renamed from: m */
    private final double f3431m;

    /* renamed from: q */
    private final double f3432q;

    /* renamed from: s */
    private final double f3433s;
    private final double[] tempArray = {0.0d, 0.0d, 0.0d};
    static final double[][] XYZ_TO_CAM16RGB = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    static final double[][] CAM16RGB_TO_XYZ = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    private Cam16(double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
        this.hue = d6;
        this.chroma = d7;
        this.f3430j = d8;
        this.f3432q = d9;
        this.f3431m = d10;
        this.f3433s = d11;
        this.jstar = d12;
        this.astar = d13;
        this.bstar = d14;
    }

    public static Cam16 fromInt(int i6) {
        return fromIntInViewingConditions(i6, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromIntInViewingConditions(int i6, ViewingConditions viewingConditions) {
        double dLinearized = ColorUtils.linearized((16711680 & i6) >> 16);
        double dLinearized2 = ColorUtils.linearized((65280 & i6) >> 8);
        double dLinearized3 = ColorUtils.linearized(i6 & 255);
        return fromXyzInViewingConditions((0.41233895d * dLinearized) + (0.35762064d * dLinearized2) + (0.18051042d * dLinearized3), (0.2126d * dLinearized) + (0.7152d * dLinearized2) + (0.0722d * dLinearized3), (dLinearized * 0.01932141d) + (dLinearized2 * 0.11916382d) + (dLinearized3 * 0.95034478d), viewingConditions);
    }

    public static Cam16 fromJch(double d6, double d7, double d8) {
        return fromJchInViewingConditions(d6, d7, d8, ViewingConditions.DEFAULT);
    }

    private static Cam16 fromJchInViewingConditions(double d6, double d7, double d8, ViewingConditions viewingConditions) {
        double d9 = d6 / 100.0d;
        double c7 = (4.0d / viewingConditions.getC()) * Math.sqrt(d9) * (viewingConditions.getAw() + 4.0d) * viewingConditions.getFlRoot();
        double flRoot = d7 * viewingConditions.getFlRoot();
        double dSqrt = Math.sqrt(((d7 / Math.sqrt(d9)) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d8);
        double d10 = (1.7000000000000002d * d6) / ((0.007d * d6) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot) * 43.859649122807014d;
        return new Cam16(d8, d7, d6, c7, flRoot, dSqrt, d10, dLog1p * Math.cos(radians), dLog1p * Math.sin(radians));
    }

    public static Cam16 fromUcs(double d6, double d7, double d8) {
        return fromUcsInViewingConditions(d6, d7, d8, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(double d6, double d7, double d8, ViewingConditions viewingConditions) {
        double dExpm1 = (Math.expm1(Math.hypot(d7, d8) * 0.0228d) / 0.0228d) / viewingConditions.getFlRoot();
        double dAtan2 = Math.atan2(d8, d7) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return fromJchInViewingConditions(d6 / (1.0d - ((d6 - 100.0d) * 0.007d)), dExpm1, dAtan2, viewingConditions);
    }

    public static Cam16 fromXyzInViewingConditions(double d6, double d7, double d8, ViewingConditions viewingConditions) {
        double[][] dArr = XYZ_TO_CAM16RGB;
        double[] dArr2 = dArr[0];
        double d9 = (dArr2[0] * d6) + (dArr2[1] * d7) + (dArr2[2] * d8);
        double[] dArr3 = dArr[1];
        double d10 = (dArr3[0] * d6) + (dArr3[1] * d7) + (dArr3[2] * d8);
        double[] dArr4 = dArr[2];
        double d11 = (dArr4[0] * d6) + (dArr4[1] * d7) + (dArr4[2] * d8);
        double d12 = viewingConditions.getRgbD()[0] * d9;
        double d13 = viewingConditions.getRgbD()[1] * d10;
        double d14 = viewingConditions.getRgbD()[2] * d11;
        double dPow = Math.pow((viewingConditions.getFl() * Math.abs(d12)) / 100.0d, 0.42d);
        double dPow2 = Math.pow((viewingConditions.getFl() * Math.abs(d13)) / 100.0d, 0.42d);
        double dPow3 = Math.pow((viewingConditions.getFl() * Math.abs(d14)) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d12) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d13) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d14) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d15 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d16 = ((dSignum + dSignum2) - (dSignum3 * 2.0d)) / 9.0d;
        double d17 = dSignum2 * 20.0d;
        double d18 = (((dSignum * 20.0d) + d17) + (21.0d * dSignum3)) / 20.0d;
        double d19 = (((dSignum * 40.0d) + d17) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d16, d15));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d20 = degrees;
        double radians = Math.toRadians(d20);
        double dPow4 = Math.pow((d19 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ()) * 100.0d;
        double d21 = dPow4 / 100.0d;
        double flRoot = viewingConditions.getFlRoot() * (4.0d / viewingConditions.getC()) * Math.sqrt(d21) * (viewingConditions.getAw() + 4.0d);
        double dPow5 = Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d) * Math.pow(((((((Math.cos(Math.toRadians(d20 < 20.14d ? d20 + 360.0d : d20) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * viewingConditions.getNc()) * viewingConditions.getNcb()) * Math.hypot(d15, d16)) / (d18 + 0.305d), 0.9d);
        double dSqrt = dPow5 * Math.sqrt(d21);
        double flRoot2 = dSqrt * viewingConditions.getFlRoot();
        double dSqrt2 = Math.sqrt((dPow5 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double d22 = (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot2) * 43.859649122807014d;
        return new Cam16(d20, dSqrt, dPow4, flRoot, flRoot2, dSqrt2, d22, dLog1p * Math.cos(radians), dLog1p * Math.sin(radians));
    }

    public double distance(Cam16 cam16) {
        double jstar = getJstar() - cam16.getJstar();
        double astar = getAstar() - cam16.getAstar();
        double bstar = getBstar() - cam16.getBstar();
        return Math.pow(Math.sqrt((jstar * jstar) + (astar * astar) + (bstar * bstar)), 0.63d) * 1.41d;
    }

    public double getAstar() {
        return this.astar;
    }

    public double getBstar() {
        return this.bstar;
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getJ() {
        return this.f3430j;
    }

    public double getJstar() {
        return this.jstar;
    }

    public double getM() {
        return this.f3431m;
    }

    public double getQ() {
        return this.f3432q;
    }

    public double getS() {
        return this.f3433s;
    }

    public int toInt() {
        return viewed(ViewingConditions.DEFAULT);
    }

    public int viewed(ViewingConditions viewingConditions) {
        double[] dArrXyzInViewingConditions = xyzInViewingConditions(viewingConditions, this.tempArray);
        return ColorUtils.argbFromXyz(dArrXyzInViewingConditions[0], dArrXyzInViewingConditions[1], dArrXyzInViewingConditions[2]);
    }

    public double[] xyzInViewingConditions(ViewingConditions viewingConditions, double[] dArr) {
        double dPow = Math.pow(((getChroma() == 0.0d || getJ() == 0.0d) ? 0.0d : getChroma() / Math.sqrt(getJ() / 100.0d)) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(getHue());
        double dCos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double aw = viewingConditions.getAw() * Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ());
        double nc = dCos * 3846.153846153846d * viewingConditions.getNc() * viewingConditions.getNcb();
        double nbb = aw / viewingConditions.getNbb();
        double dSin = Math.sin(radians);
        double dCos2 = Math.cos(radians);
        double d6 = (((0.305d + nbb) * 23.0d) * dPow) / (((nc * 23.0d) + ((11.0d * dPow) * dCos2)) + ((dPow * 108.0d) * dSin));
        double d7 = dCos2 * d6;
        double d8 = d6 * dSin;
        double d9 = nbb * 460.0d;
        double d10 = (((451.0d * d7) + d9) + (288.0d * d8)) / 1403.0d;
        double d11 = ((d9 - (891.0d * d7)) - (261.0d * d8)) / 1403.0d;
        double d12 = ((d9 - (d7 * 220.0d)) - (d8 * 6300.0d)) / 1403.0d;
        double dSignum = Math.signum(d10) * (100.0d / viewingConditions.getFl()) * Math.pow(Math.max(0.0d, (Math.abs(d10) * 27.13d) / (400.0d - Math.abs(d10))), 2.380952380952381d);
        double dSignum2 = Math.signum(d11) * (100.0d / viewingConditions.getFl()) * Math.pow(Math.max(0.0d, (Math.abs(d11) * 27.13d) / (400.0d - Math.abs(d11))), 2.380952380952381d);
        double dSignum3 = Math.signum(d12) * (100.0d / viewingConditions.getFl()) * Math.pow(Math.max(0.0d, (Math.abs(d12) * 27.13d) / (400.0d - Math.abs(d12))), 2.380952380952381d);
        double d13 = dSignum / viewingConditions.getRgbD()[0];
        double d14 = dSignum2 / viewingConditions.getRgbD()[1];
        double d15 = dSignum3 / viewingConditions.getRgbD()[2];
        double[][] dArr2 = CAM16RGB_TO_XYZ;
        double[] dArr3 = dArr2[0];
        double d16 = (dArr3[0] * d13) + (dArr3[1] * d14) + (dArr3[2] * d15);
        double[] dArr4 = dArr2[1];
        double d17 = (dArr4[0] * d13) + (dArr4[1] * d14) + (dArr4[2] * d15);
        double[] dArr5 = dArr2[2];
        double d18 = (d13 * dArr5[0]) + (d14 * dArr5[1]) + (d15 * dArr5[2]);
        if (dArr == null) {
            return new double[]{d16, d17, d18};
        }
        dArr[0] = d16;
        dArr[1] = d17;
        dArr[2] = d18;
        return dArr;
    }
}
