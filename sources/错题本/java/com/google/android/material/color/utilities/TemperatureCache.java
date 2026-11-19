package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import androidx.compose.foundation.lazy.layout.C1148a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class TemperatureCache {
    private final Hct input;
    private Hct precomputedComplement;
    private List<Hct> precomputedHctsByHue;
    private List<Hct> precomputedHctsByTemp;
    private Map<Hct, Double> precomputedTempsByHct;

    private TemperatureCache() {
        throw new UnsupportedOperationException();
    }

    private Hct getColdest() {
        return getHctsByTemp().get(0);
    }

    private List<Hct> getHctsByHue() {
        List<Hct> list = this.precomputedHctsByHue;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d9 = 0.0d; d9 <= 360.0d; d9 += 1.0d) {
            arrayList.add(Hct.from(d9, this.input.getChroma(), this.input.getTone()));
        }
        List<Hct> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.precomputedHctsByHue = listUnmodifiableList;
        return listUnmodifiableList;
    }

    private List<Hct> getHctsByTemp() {
        List<Hct> list = this.precomputedHctsByTemp;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.input);
        Collections.sort(arrayList, Comparator.comparing(new C3535a(this, 2), new C1148a(4)));
        this.precomputedHctsByTemp = arrayList;
        return arrayList;
    }

    private Map<Hct, Double> getTempsByHct() {
        Map<Hct, Double> map = this.precomputedTempsByHct;
        if (map != null) {
            return map;
        }
        ArrayList arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.input);
        HashMap map2 = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Hct hct = (Hct) obj;
            map2.put(hct, Double.valueOf(rawTemperature(hct)));
        }
        this.precomputedTempsByHct = map2;
        return map2;
    }

    private Hct getWarmest() {
        return getHctsByTemp().get(getHctsByTemp().size() - 1);
    }

    private static boolean isBetween(double d9, double d10, double d11) {
        return d10 < d11 ? d10 <= d9 && d9 <= d11 : d10 <= d9 || d9 <= d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$getHctsByTemp$0(Hct hct) {
        return getTempsByHct().get(hct);
    }

    public static double rawTemperature(Hct hct) {
        double[] dArrLabFromArgb = ColorUtils.labFromArgb(hct.toInt());
        double dSanitizeDegreesDouble = MathUtils.sanitizeDegreesDouble(Math.toDegrees(Math.atan2(dArrLabFromArgb[2], dArrLabFromArgb[1])));
        return (Math.cos(Math.toRadians(MathUtils.sanitizeDegreesDouble(dSanitizeDegreesDouble - 50.0d))) * (Math.pow(Math.hypot(dArrLabFromArgb[1], dArrLabFromArgb[2]), 1.07d) * 0.02d)) - 0.5d;
    }

    public List<Hct> getAnalogousColors() {
        return getAnalogousColors(5, 12);
    }

    public Hct getComplement() {
        double d9;
        Hct hct = this.precomputedComplement;
        if (hct != null) {
            return hct;
        }
        double hue = getColdest().getHue();
        double dDoubleValue = getTempsByHct().get(getColdest()).doubleValue();
        double hue2 = getWarmest().getHue();
        double dDoubleValue2 = getTempsByHct().get(getWarmest()).doubleValue() - dDoubleValue;
        boolean zIsBetween = isBetween(this.input.getHue(), hue, hue2);
        double d10 = zIsBetween ? hue2 : hue;
        double d11 = zIsBetween ? hue : hue2;
        Hct hct2 = getHctsByHue().get((int) Math.round(this.input.getHue()));
        double d12 = 1.0d;
        double relativeTemperature = 1.0d - getRelativeTemperature(this.input);
        double d13 = 1000.0d;
        double d14 = 0.0d;
        while (d14 <= 360.0d) {
            double dSanitizeDegreesDouble = MathUtils.sanitizeDegreesDouble((d12 * d14) + d10);
            if (isBetween(dSanitizeDegreesDouble, d10, d11)) {
                d9 = d12;
                Hct hct3 = getHctsByHue().get((int) Math.round(dSanitizeDegreesDouble));
                double dAbs = Math.abs(relativeTemperature - ((getTempsByHct().get(hct3).doubleValue() - dDoubleValue) / dDoubleValue2));
                if (dAbs < d13) {
                    hct2 = hct3;
                    d13 = dAbs;
                }
            } else {
                d9 = d12;
            }
            d14 += d9;
            d12 = d9;
        }
        this.precomputedComplement = hct2;
        return hct2;
    }

    public double getRelativeTemperature(Hct hct) {
        double dDoubleValue = getTempsByHct().get(getWarmest()).doubleValue() - getTempsByHct().get(getColdest()).doubleValue();
        double dDoubleValue2 = getTempsByHct().get(hct).doubleValue() - getTempsByHct().get(getColdest()).doubleValue();
        if (dDoubleValue == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return 0.5d;
        }
        return dDoubleValue2 / dDoubleValue;
    }

    public List<Hct> getAnalogousColors(int i, int i8) {
        int iRound = (int) Math.round(this.input.getHue());
        Hct hct = getHctsByHue().get(iRound);
        double relativeTemperature = getRelativeTemperature(hct);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hct);
        double dAbs = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dAbs2 = 0.0d;
        int i9 = 0;
        while (i9 < 360) {
            double relativeTemperature2 = getRelativeTemperature(getHctsByHue().get(MathUtils.sanitizeDegreesInt(iRound + i9)));
            dAbs2 += Math.abs(relativeTemperature2 - relativeTemperature);
            i9++;
            relativeTemperature = relativeTemperature2;
        }
        double d9 = dAbs2 / i8;
        double relativeTemperature3 = getRelativeTemperature(hct);
        int i10 = 1;
        while (true) {
            if (arrayList.size() >= i8) {
                break;
            }
            Hct hct2 = getHctsByHue().get(MathUtils.sanitizeDegreesInt(iRound + i10));
            double relativeTemperature4 = getRelativeTemperature(hct2);
            dAbs += Math.abs(relativeTemperature4 - relativeTemperature3);
            boolean z8 = dAbs >= ((double) arrayList.size()) * d9;
            int i11 = 1;
            while (z8 && arrayList.size() < i8) {
                arrayList.add(hct2);
                int i12 = i10;
                z8 = dAbs >= ((double) (arrayList.size() + i11)) * d9;
                i11++;
                i10 = i12;
            }
            i10++;
            if (i10 > 360) {
                while (arrayList.size() < i8) {
                    arrayList.add(hct2);
                }
            } else {
                relativeTemperature3 = relativeTemperature4;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.input);
        int iFloor = (int) Math.floor((i - 1.0d) / 2.0d);
        for (int i13 = 1; i13 < iFloor + 1; i13++) {
            int size = 0 - i13;
            while (size < 0) {
                size += arrayList.size();
            }
            if (size >= arrayList.size()) {
                size %= arrayList.size();
            }
            arrayList2.add(0, (Hct) arrayList.get(size));
        }
        int i14 = i - iFloor;
        for (int i15 = 1; i15 < i14; i15++) {
            int size2 = i15;
            while (size2 < 0) {
                size2 += arrayList.size();
            }
            if (size2 >= arrayList.size()) {
                size2 %= arrayList.size();
            }
            arrayList2.add((Hct) arrayList.get(size2));
        }
        return arrayList2;
    }

    public TemperatureCache(Hct hct) {
        this.input = hct;
    }
}
