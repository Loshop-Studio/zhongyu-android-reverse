package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class Blend {
    private Blend() {
    }

    public static int cam16Ucs(int i9, int i10, double d10) {
        Cam16 cam16FromInt = Cam16.fromInt(i9);
        Cam16 cam16FromInt2 = Cam16.fromInt(i10);
        double jstar = cam16FromInt.getJstar();
        double astar = cam16FromInt.getAstar();
        double bstar = cam16FromInt.getBstar();
        return Cam16.fromUcs(jstar + ((cam16FromInt2.getJstar() - jstar) * d10), astar + ((cam16FromInt2.getAstar() - astar) * d10), bstar + ((cam16FromInt2.getBstar() - bstar) * d10)).toInt();
    }

    public static int harmonize(int i9, int i10) {
        Hct hctFromInt = Hct.fromInt(i9);
        Hct hctFromInt2 = Hct.fromInt(i10);
        return Hct.from(MathUtils.sanitizeDegreesDouble(hctFromInt.getHue() + (Math.min(MathUtils.differenceDegrees(hctFromInt.getHue(), hctFromInt2.getHue()) * 0.5d, 15.0d) * MathUtils.rotationDirection(hctFromInt.getHue(), hctFromInt2.getHue()))), hctFromInt.getChroma(), hctFromInt.getTone()).toInt();
    }

    public static int hctHue(int i9, int i10, double d10) {
        return Hct.from(Cam16.fromInt(cam16Ucs(i9, i10, d10)).getHue(), Cam16.fromInt(i9).getChroma(), ColorUtils.lstarFromArgb(i9)).toInt();
    }
}
