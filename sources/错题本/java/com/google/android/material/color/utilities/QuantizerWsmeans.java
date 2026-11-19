package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    public static final class Distance implements Comparable<Distance> {
        int index = -1;
        double distance = -1.0d;

        @Override // java.lang.Comparable
        public int compareTo(Distance distance) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(distance.distance));
        }
    }

    private QuantizerWsmeans() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i) {
        boolean z8;
        double[] dArr;
        double[] dArr2;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr3 = new double[iArr.length][];
        int[] iArr3 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            z8 = true;
            if (i8 >= iArr.length) {
                break;
            }
            int i10 = iArr[i8];
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i10));
            if (num == null) {
                dArr3[i9] = pointProviderLab.fromInt(i10);
                iArr3[i9] = i10;
                i9++;
                linkedHashMap.put(Integer.valueOf(i10), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
            }
            i8++;
        }
        int[] iArr4 = new int[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            iArr4[i11] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i11]))).intValue();
        }
        int iMin = Math.min(i, i9);
        if (iArr2.length != 0) {
            iMin = Math.min(iMin, iArr2.length);
        }
        double[][] dArr4 = new double[iMin][];
        int i12 = 0;
        for (int i13 = 0; i13 < iArr2.length; i13++) {
            dArr4[i13] = pointProviderLab.fromInt(iArr2[i13]);
            i12++;
        }
        int i14 = iMin - i12;
        if (i14 > 0) {
            for (int i15 = 0; i15 < i14; i15++) {
            }
        }
        int[] iArr5 = new int[i9];
        for (int i16 = 0; i16 < i9; i16++) {
            iArr5[i16] = random.nextInt(iMin);
        }
        int[][] iArr6 = new int[iMin][];
        for (int i17 = 0; i17 < iMin; i17++) {
            iArr6[i17] = new int[iMin];
        }
        Distance[][] distanceArr = new Distance[iMin][];
        for (int i18 = 0; i18 < iMin; i18++) {
            distanceArr[i18] = new Distance[iMin];
            for (int i19 = 0; i19 < iMin; i19++) {
                distanceArr[i18][i19] = new Distance();
            }
        }
        int[] iArr7 = new int[iMin];
        int i20 = 0;
        while (i20 < 10) {
            int i21 = 0;
            while (i21 < iMin) {
                int i22 = i21 + 1;
                int i23 = i22;
                while (i23 < iMin) {
                    int[] iArr8 = iArr4;
                    double dDistance = pointProviderLab.distance(dArr4[i21], dArr4[i23]);
                    Distance distance = distanceArr[i23][i21];
                    distance.distance = dDistance;
                    distance.index = i21;
                    Distance distance2 = distanceArr[i21][i23];
                    distance2.distance = dDistance;
                    distance2.index = i23;
                    i23++;
                    iArr4 = iArr8;
                    iArr5 = iArr5;
                    z8 = z8;
                }
                int[] iArr9 = iArr4;
                int[] iArr10 = iArr5;
                boolean z9 = z8;
                Arrays.sort(distanceArr[i21]);
                for (int i24 = 0; i24 < iMin; i24++) {
                    iArr6[i21][i24] = distanceArr[i21][i24].index;
                }
                iArr4 = iArr9;
                iArr5 = iArr10;
                i21 = i22;
                z8 = z9;
            }
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            boolean z10 = z8;
            int i25 = 0;
            int i26 = 0;
            while (i25 < i9) {
                double[] dArr5 = dArr3[i25];
                int i27 = iArr12[i25];
                double dDistance2 = pointProviderLab.distance(dArr5, dArr4[i27]);
                int i28 = i25;
                double d9 = dDistance2;
                int i29 = -1;
                int i30 = 0;
                while (i30 < iMin) {
                    int i31 = i26;
                    int[][] iArr13 = iArr6;
                    if (distanceArr[i27][i30].distance < 4.0d * dDistance2) {
                        double dDistance3 = pointProviderLab.distance(dArr5, dArr4[i30]);
                        if (dDistance3 < d9) {
                            d9 = dDistance3;
                            i29 = i30;
                        }
                    }
                    i30++;
                    iArr6 = iArr13;
                    i26 = i31;
                }
                int i32 = i26;
                int[][] iArr14 = iArr6;
                if (i29 == -1 || Math.abs(Math.sqrt(d9) - Math.sqrt(dDistance2)) <= 3.0d) {
                    i26 = i32;
                } else {
                    i26 = i32 + 1;
                    iArr12[i28] = i29;
                }
                i25 = i28 + 1;
                iArr6 = iArr14;
            }
            int[][] iArr15 = iArr6;
            if (i26 == 0 && i20 != 0) {
                break;
            }
            double[] dArr6 = new double[iMin];
            double[] dArr7 = new double[iMin];
            double[] dArr8 = new double[iMin];
            boolean z11 = false;
            Arrays.fill(iArr7, 0);
            int i33 = 0;
            while (i33 < i9) {
                int i34 = iArr12[i33];
                double[] dArr9 = dArr3[i33];
                boolean z12 = z11;
                int i35 = iArr11[i33];
                iArr7[i34] = iArr7[i34] + i35;
                double d10 = i35;
                dArr6[i34] = (dArr9[z12 ? 1 : 0] * d10) + dArr6[i34];
                dArr7[i34] = (dArr9[z10 ? 1 : 0] * d10) + dArr7[i34];
                dArr8[i34] = (dArr9[2] * d10) + dArr8[i34];
                i33++;
                z11 = false;
            }
            int i36 = 0;
            while (i36 < iMin) {
                int i37 = iArr7[i36];
                if (i37 == 0) {
                    dArr4[i36] = new double[]{AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE};
                    dArr = dArr6;
                    dArr2 = dArr7;
                } else {
                    double d11 = dArr6[i36];
                    dArr = dArr6;
                    dArr2 = dArr7;
                    double d12 = i37;
                    double d13 = d11 / d12;
                    double d14 = dArr2[i36] / d12;
                    double d15 = dArr8[i36] / d12;
                    double[] dArr10 = dArr4[i36];
                    dArr10[0] = d13;
                    dArr10[z10 ? 1 : 0] = d14;
                    dArr10[2] = d15;
                }
                i36++;
                dArr6 = dArr;
                dArr7 = dArr2;
            }
            i20++;
            iArr4 = iArr11;
            iArr5 = iArr12;
            z8 = z10 ? 1 : 0;
            iArr6 = iArr15;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i38 = 0; i38 < iMin; i38++) {
            int i39 = iArr7[i38];
            if (i39 != 0) {
                int i40 = pointProviderLab.toInt(dArr4[i38]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i40))) {
                    linkedHashMap2.put(Integer.valueOf(i40), Integer.valueOf(i39));
                }
            }
        }
        return linkedHashMap2;
    }
}
