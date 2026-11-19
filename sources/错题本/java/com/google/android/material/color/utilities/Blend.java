package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class Blend {
    private Blend() {
    }

    public static int cam16Ucs(int i, int i8, double d9) {
        Cam16 cam16FromInt = Cam16.fromInt(i);
        Cam16 cam16FromInt2 = Cam16.fromInt(i8);
        double jstar = cam16FromInt.getJstar();
        double astar = cam16FromInt.getAstar();
        double bstar = cam16FromInt.getBstar();
        return Cam16.fromUcs(((cam16FromInt2.getJstar() - jstar) * d9) + jstar, ((cam16FromInt2.getAstar() - astar) * d9) + astar, ((cam16FromInt2.getBstar() - bstar) * d9) + bstar).toInt();
    }

    public static int harmonize(int i, int i8) {
        Hct hctFromInt = Hct.fromInt(i);
        Hct hctFromInt2 = Hct.fromInt(i8);
        double dMin = Math.min(MathUtils.differenceDegrees(hctFromInt.getHue(), hctFromInt2.getHue()) * 0.5d, 15.0d);
        return Hct.from(MathUtils.sanitizeDegreesDouble((MathUtils.rotationDirection(hctFromInt.getHue(), hctFromInt2.getHue()) * dMin) + hctFromInt.getHue()), hctFromInt.getChroma(), hctFromInt.getTone()).toInt();
    }

    public static int hctHue(int i, int i8, double d9) {
        return Hct.from(Cam16.fromInt(cam16Ucs(i, i8, d9)).getHue(), Cam16.fromInt(i).getChroma(), ColorUtils.lstarFromArgb(i)).toInt();
    }
}
