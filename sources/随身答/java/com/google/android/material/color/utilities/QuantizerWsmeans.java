package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
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

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i9) {
        boolean z9;
        double[] dArr;
        double[] dArr2;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr3 = new double[iArr.length][];
        int[] iArr3 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            z9 = true;
            if (i10 >= iArr.length) {
                break;
            }
            int i12 = iArr[i10];
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i12));
            if (num == null) {
                dArr3[i11] = pointProviderLab.fromInt(i12);
                iArr3[i11] = i12;
                i11++;
                linkedHashMap.put(Integer.valueOf(i12), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i12), Integer.valueOf(num.intValue() + 1));
            }
            i10++;
        }
        int[] iArr4 = new int[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            iArr4[i13] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i13]))).intValue();
        }
        int iMin = Math.min(i9, i11);
        if (iArr2.length != 0) {
            iMin = Math.min(iMin, iArr2.length);
        }
        double[][] dArr4 = new double[iMin][];
        int i14 = 0;
        for (int i15 = 0; i15 < iArr2.length; i15++) {
            dArr4[i15] = pointProviderLab.fromInt(iArr2[i15]);
            i14++;
        }
        int i16 = iMin - i14;
        if (i16 > 0) {
            for (int i17 = 0; i17 < i16; i17++) {
            }
        }
        int[] iArr5 = new int[i11];
        for (int i18 = 0; i18 < i11; i18++) {
            iArr5[i18] = random.nextInt(iMin);
        }
        int[][] iArr6 = new int[iMin][];
        for (int i19 = 0; i19 < iMin; i19++) {
            iArr6[i19] = new int[iMin];
        }
        Distance[][] distanceArr = new Distance[iMin][];
        for (int i20 = 0; i20 < iMin; i20++) {
            distanceArr[i20] = new Distance[iMin];
            for (int i21 = 0; i21 < iMin; i21++) {
                distanceArr[i20][i21] = new Distance();
            }
        }
        int[] iArr7 = new int[iMin];
        int i22 = 0;
        while (i22 < 10) {
            int i23 = 0;
            while (i23 < iMin) {
                int i24 = i23 + 1;
                int i25 = i24;
                while (i25 < iMin) {
                    int[] iArr8 = iArr4;
                    double dDistance = pointProviderLab.distance(dArr4[i23], dArr4[i25]);
                    Distance distance = distanceArr[i25][i23];
                    distance.distance = dDistance;
                    distance.index = i23;
                    Distance distance2 = distanceArr[i23][i25];
                    distance2.distance = dDistance;
                    distance2.index = i25;
                    i25++;
                    iArr4 = iArr8;
                    iArr5 = iArr5;
                    z9 = z9;
                }
                int[] iArr9 = iArr4;
                int[] iArr10 = iArr5;
                boolean z10 = z9;
                Arrays.sort(distanceArr[i23]);
                for (int i26 = 0; i26 < iMin; i26++) {
                    iArr6[i23][i26] = distanceArr[i23][i26].index;
                }
                iArr4 = iArr9;
                iArr5 = iArr10;
                i23 = i24;
                z9 = z10;
            }
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            boolean z11 = z9;
            int i27 = 0;
            int i28 = 0;
            while (i27 < i11) {
                double[] dArr5 = dArr3[i27];
                int i29 = iArr12[i27];
                double dDistance2 = pointProviderLab.distance(dArr5, dArr4[i29]);
                int i30 = i27;
                double d10 = dDistance2;
                int i31 = -1;
                int i32 = 0;
                while (i32 < iMin) {
                    int i33 = i28;
                    int[][] iArr13 = iArr6;
                    if (distanceArr[i29][i32].distance < 4.0d * dDistance2) {
                        double dDistance3 = pointProviderLab.distance(dArr5, dArr4[i32]);
                        if (dDistance3 < d10) {
                            d10 = dDistance3;
                            i31 = i32;
                        }
                    }
                    i32++;
                    iArr6 = iArr13;
                    i28 = i33;
                }
                int i34 = i28;
                int[][] iArr14 = iArr6;
                if (i31 == -1 || Math.abs(Math.sqrt(d10) - Math.sqrt(dDistance2)) <= 3.0d) {
                    i28 = i34;
                } else {
                    i28 = i34 + 1;
                    iArr12[i30] = i31;
                }
                i27 = i30 + 1;
                iArr6 = iArr14;
            }
            int[][] iArr15 = iArr6;
            if (i28 == 0 && i22 != 0) {
                break;
            }
            double[] dArr6 = new double[iMin];
            double[] dArr7 = new double[iMin];
            double[] dArr8 = new double[iMin];
            boolean z12 = false;
            Arrays.fill(iArr7, 0);
            int i35 = 0;
            while (i35 < i11) {
                int i36 = iArr12[i35];
                double[] dArr9 = dArr3[i35];
                boolean z13 = z12;
                int i37 = iArr11[i35];
                iArr7[i36] = iArr7[i36] + i37;
                double d11 = i37;
                dArr6[i36] = dArr6[i36] + (dArr9[z13 ? 1 : 0] * d11);
                dArr7[i36] = dArr7[i36] + (dArr9[z11 ? 1 : 0] * d11);
                dArr8[i36] = dArr8[i36] + (dArr9[2] * d11);
                i35++;
                z12 = false;
            }
            int i38 = 0;
            while (i38 < iMin) {
                int i39 = iArr7[i38];
                if (i39 == 0) {
                    dArr4[i38] = new double[]{AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE};
                    dArr = dArr6;
                    dArr2 = dArr7;
                } else {
                    double d12 = dArr6[i38];
                    dArr = dArr6;
                    dArr2 = dArr7;
                    double d13 = i39;
                    double d14 = d12 / d13;
                    double d15 = dArr2[i38] / d13;
                    double d16 = dArr8[i38] / d13;
                    double[] dArr10 = dArr4[i38];
                    dArr10[0] = d14;
                    dArr10[z11 ? 1 : 0] = d15;
                    dArr10[2] = d16;
                }
                i38++;
                dArr6 = dArr;
                dArr7 = dArr2;
            }
            i22++;
            iArr4 = iArr11;
            iArr5 = iArr12;
            z9 = z11 ? 1 : 0;
            iArr6 = iArr15;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i40 = 0; i40 < iMin; i40++) {
            int i41 = iArr7[i40];
            if (i41 != 0) {
                int i42 = pointProviderLab.toInt(dArr4[i40]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i42))) {
                    linkedHashMap2.put(Integer.valueOf(i42), Integer.valueOf(i41));
                }
            }
        }
        return linkedHashMap2;
    }
}
