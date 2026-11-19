package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;
    double hue;
    Hct keyColor;

    private TonalPalette(double d9, double d10, Hct hct) {
        this.hue = d9;
        this.chroma = d10;
        this.keyColor = hct;
    }

    private static Hct createKeyColor(double d9, double d10) {
        Hct hctFrom = Hct.from(d9, d10, 50.0d);
        double dAbs = Math.abs(hctFrom.getChroma() - d10);
        for (double d11 = 1.0d; d11 < 50.0d && Math.round(d10) != Math.round(hctFrom.getChroma()); d11 += 1.0d) {
            Hct hctFrom2 = Hct.from(d9, d10, 50.0d + d11);
            double dAbs2 = Math.abs(hctFrom2.getChroma() - d10);
            if (dAbs2 < dAbs) {
                dAbs = dAbs2;
                hctFrom = hctFrom2;
            }
            Hct hctFrom3 = Hct.from(d9, d10, 50.0d - d11);
            double dAbs3 = Math.abs(hctFrom3.getChroma() - d10);
            if (dAbs3 < dAbs) {
                dAbs = dAbs3;
                hctFrom = hctFrom3;
            }
        }
        return hctFrom;
    }

    public static TonalPalette fromHct(Hct hct) {
        return new TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static TonalPalette fromHueAndChroma(double d9, double d10) {
        return new TonalPalette(d9, d10, createKeyColor(d9, d10));
    }

    public static TonalPalette fromInt(int i) {
        return fromHct(Hct.fromInt(i));
    }

    public double getChroma() {
        return this.chroma;
    }

    public Hct getHct(double d9) {
        return Hct.from(this.hue, this.chroma, d9);
    }

    public double getHue() {
        return this.hue;
    }

    public Hct getKeyColor() {
        return this.keyColor;
    }

    public int tone(int i) {
        Integer numValueOf = this.cache.get(Integer.valueOf(i));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Hct.from(this.hue, this.chroma, i).toInt());
            this.cache.put(Integer.valueOf(i), numValueOf);
        }
        return numValueOf.intValue();
    }
}
