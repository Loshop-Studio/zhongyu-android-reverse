package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;
    double hue;
    Hct keyColor;

    private TonalPalette(double d6, double d7, Hct hct) {
        this.hue = d6;
        this.chroma = d7;
        this.keyColor = hct;
    }

    private static Hct createKeyColor(double d6, double d7) {
        Hct hctFrom = Hct.from(d6, d7, 50.0d);
        double dAbs = Math.abs(hctFrom.getChroma() - d7);
        for (double d8 = 1.0d; d8 < 50.0d && Math.round(d7) != Math.round(hctFrom.getChroma()); d8 += 1.0d) {
            Hct hctFrom2 = Hct.from(d6, d7, 50.0d + d8);
            double dAbs2 = Math.abs(hctFrom2.getChroma() - d7);
            if (dAbs2 < dAbs) {
                dAbs = dAbs2;
                hctFrom = hctFrom2;
            }
            Hct hctFrom3 = Hct.from(d6, d7, 50.0d - d8);
            double dAbs3 = Math.abs(hctFrom3.getChroma() - d7);
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

    public static TonalPalette fromHueAndChroma(double d6, double d7) {
        return new TonalPalette(d6, d7, createKeyColor(d6, d7));
    }

    public static TonalPalette fromInt(int i6) {
        return fromHct(Hct.fromInt(i6));
    }

    public double getChroma() {
        return this.chroma;
    }

    public Hct getHct(double d6) {
        return Hct.from(this.hue, this.chroma, d6);
    }

    public double getHue() {
        return this.hue;
    }

    public Hct getKeyColor() {
        return this.keyColor;
    }

    public int tone(int i6) {
        Integer numValueOf = this.cache.get(Integer.valueOf(i6));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Hct.from(this.hue, this.chroma, i6).toInt());
            this.cache.put(Integer.valueOf(i6), numValueOf);
        }
        return numValueOf.intValue();
    }
}
