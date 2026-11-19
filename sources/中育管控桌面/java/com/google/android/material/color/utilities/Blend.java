package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class Blend {
    private Blend() {
    }

    public static int cam16Ucs(int i6, int i7, double d6) {
        Cam16 cam16FromInt = Cam16.fromInt(i6);
        Cam16 cam16FromInt2 = Cam16.fromInt(i7);
        double jstar = cam16FromInt.getJstar();
        double astar = cam16FromInt.getAstar();
        double bstar = cam16FromInt.getBstar();
        return Cam16.fromUcs(jstar + ((cam16FromInt2.getJstar() - jstar) * d6), astar + ((cam16FromInt2.getAstar() - astar) * d6), bstar + ((cam16FromInt2.getBstar() - bstar) * d6)).toInt();
    }

    public static int harmonize(int i6, int i7) {
        Hct hctFromInt = Hct.fromInt(i6);
        Hct hctFromInt2 = Hct.fromInt(i7);
        return Hct.from(MathUtils.sanitizeDegreesDouble(hctFromInt.getHue() + (Math.min(MathUtils.differenceDegrees(hctFromInt.getHue(), hctFromInt2.getHue()) * 0.5d, 15.0d) * MathUtils.rotationDirection(hctFromInt.getHue(), hctFromInt2.getHue()))), hctFromInt.getChroma(), hctFromInt.getTone()).toInt();
    }

    public static int hctHue(int i6, int i7, double d6) {
        return Hct.from(Cam16.fromInt(cam16Ucs(i6, i7, d6)).getHue(), Cam16.fromInt(i6).getChroma(), ColorUtils.lstarFromArgb(i6)).toInt();
    }
}
