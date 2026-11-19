package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class Score {
    private static final int BLUE_500 = -12417548;
    private static final double CUTOFF_CHROMA = 5.0d;
    private static final double CUTOFF_EXCITED_PROPORTION = 0.01d;
    private static final int MAX_COLOR_COUNT = 4;
    private static final double TARGET_CHROMA = 48.0d;
    private static final double WEIGHT_CHROMA_ABOVE = 0.3d;
    private static final double WEIGHT_CHROMA_BELOW = 0.1d;
    private static final double WEIGHT_PROPORTION = 0.7d;

    public static class ScoredComparator implements Comparator<ScoredHCT> {
        @Override // java.util.Comparator
        public int compare(ScoredHCT scoredHCT, ScoredHCT scoredHCT2) {
            return Double.compare(scoredHCT2.score, scoredHCT.score);
        }
    }

    public static class ScoredHCT {
        public final Hct hct;
        public final double score;

        public ScoredHCT(Hct hct, double d10) {
            this.hct = hct;
            this.score = d10;
        }
    }

    private Score() {
    }

    public static List<Integer> score(Map<Integer, Integer> map) {
        return score(map, 4, BLUE_500, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i9) {
        return score(map, i9, BLUE_500, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i9, int i10) {
        return score(map, i9, i10, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i9, int i10, boolean z9) {
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[360];
        double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Hct hctFromInt = Hct.fromInt(entry.getKey().intValue());
            arrayList.add(hctFromInt);
            int iFloor = (int) Math.floor(hctFromInt.getHue());
            int iIntValue = entry.getValue().intValue();
            iArr[iFloor] = iArr[iFloor] + iIntValue;
            d10 += iIntValue;
        }
        double[] dArr = new double[360];
        int i11 = 0;
        for (int i12 = 0; i12 < 360; i12++) {
            double d11 = iArr[i12] / d10;
            for (int i13 = i12 - 14; i13 < i12 + 16; i13++) {
                int iSanitizeDegreesInt = MathUtils.sanitizeDegreesInt(i13);
                dArr[iSanitizeDegreesInt] = dArr[iSanitizeDegreesInt] + d11;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            Hct hct = (Hct) obj;
            double d12 = dArr[MathUtils.sanitizeDegreesInt((int) Math.round(hct.getHue()))];
            if (!z9 || (hct.getChroma() >= CUTOFF_CHROMA && d12 > CUTOFF_EXCITED_PROPORTION)) {
                arrayList2.add(new ScoredHCT(hct, (d12 * 100.0d * WEIGHT_PROPORTION) + ((hct.getChroma() - TARGET_CHROMA) * (hct.getChroma() < TARGET_CHROMA ? WEIGHT_CHROMA_BELOW : WEIGHT_CHROMA_ABOVE))));
            }
        }
        Collections.sort(arrayList2, new ScoredComparator());
        ArrayList arrayList3 = new ArrayList();
        for (int i15 = 90; i15 >= 15; i15--) {
            arrayList3.clear();
            int size2 = arrayList2.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj2 = arrayList2.get(i16);
                i16++;
                Hct hct2 = ((ScoredHCT) obj2).hct;
                int size3 = arrayList3.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size3) {
                        arrayList3.add(hct2);
                        break;
                    }
                    Object obj3 = arrayList3.get(i17);
                    i17++;
                    if (MathUtils.differenceDegrees(hct2.getHue(), ((Hct) obj3).getHue()) < i15) {
                        break;
                    }
                }
                if (arrayList3.size() >= i9) {
                    break;
                }
            }
            if (arrayList3.size() >= i9) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(Integer.valueOf(i10));
            return arrayList4;
        }
        int size4 = arrayList3.size();
        while (i11 < size4) {
            Object obj4 = arrayList3.get(i11);
            i11++;
            arrayList4.add(Integer.valueOf(((Hct) obj4).toInt()));
        }
        return arrayList4;
    }
}
