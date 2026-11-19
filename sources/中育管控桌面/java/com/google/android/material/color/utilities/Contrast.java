package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class Contrast {
    private static final double CONTRAST_RATIO_EPSILON = 0.04d;
    private static final double LUMINANCE_GAMUT_MAP_TOLERANCE = 0.4d;
    public static final double RATIO_30 = 3.0d;
    public static final double RATIO_45 = 4.5d;
    public static final double RATIO_70 = 7.0d;
    public static final double RATIO_MAX = 21.0d;
    public static final double RATIO_MIN = 1.0d;

    private Contrast() {
    }

    public static double darker(double d6, double d7) {
        if (d6 >= 0.0d && d6 <= 100.0d) {
            double dYFromLstar = ColorUtils.yFromLstar(d6);
            double d8 = ((dYFromLstar + 5.0d) / d7) - 5.0d;
            if (d8 >= 0.0d && d8 <= 100.0d) {
                double dRatioOfYs = ratioOfYs(dYFromLstar, d8);
                double dAbs = Math.abs(dRatioOfYs - d7);
                if (dRatioOfYs < d7 && dAbs > CONTRAST_RATIO_EPSILON) {
                    return -1.0d;
                }
                double dLstarFromY = ColorUtils.lstarFromY(d8) - LUMINANCE_GAMUT_MAP_TOLERANCE;
                if (dLstarFromY >= 0.0d && dLstarFromY <= 100.0d) {
                    return dLstarFromY;
                }
            }
        }
        return -1.0d;
    }

    public static double darkerUnsafe(double d6, double d7) {
        return Math.max(0.0d, darker(d6, d7));
    }

    public static double lighter(double d6, double d7) {
        if (d6 >= 0.0d && d6 <= 100.0d) {
            double dYFromLstar = ColorUtils.yFromLstar(d6);
            double d8 = ((dYFromLstar + 5.0d) * d7) - 5.0d;
            if (d8 >= 0.0d && d8 <= 100.0d) {
                double dRatioOfYs = ratioOfYs(d8, dYFromLstar);
                double dAbs = Math.abs(dRatioOfYs - d7);
                if (dRatioOfYs < d7 && dAbs > CONTRAST_RATIO_EPSILON) {
                    return -1.0d;
                }
                double dLstarFromY = ColorUtils.lstarFromY(d8) + LUMINANCE_GAMUT_MAP_TOLERANCE;
                if (dLstarFromY >= 0.0d && dLstarFromY <= 100.0d) {
                    return dLstarFromY;
                }
            }
        }
        return -1.0d;
    }

    public static double lighterUnsafe(double d6, double d7) {
        double dLighter = lighter(d6, d7);
        if (dLighter < 0.0d) {
            return 100.0d;
        }
        return dLighter;
    }

    public static double ratioOfTones(double d6, double d7) {
        return ratioOfYs(ColorUtils.yFromLstar(d6), ColorUtils.yFromLstar(d7));
    }

    public static double ratioOfYs(double d6, double d7) {
        double dMax = Math.max(d6, d7);
        if (dMax != d7) {
            d6 = d7;
        }
        return (dMax + 5.0d) / (d6 + 5.0d);
    }
}
