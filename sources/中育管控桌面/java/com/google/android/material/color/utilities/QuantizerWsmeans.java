package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
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

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i6) {
        boolean z6;
        double[] dArr;
        double[] dArr2;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr3 = new double[iArr.length][];
        int[] iArr3 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            z6 = true;
            if (i7 >= iArr.length) {
                break;
            }
            int i9 = iArr[i7];
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i9));
            if (num == null) {
                dArr3[i8] = pointProviderLab.fromInt(i9);
                iArr3[i8] = i9;
                i8++;
                linkedHashMap.put(Integer.valueOf(i9), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i9), Integer.valueOf(num.intValue() + 1));
            }
            i7++;
        }
        int[] iArr4 = new int[i8];
        for (int i10 = 0; i10 < i8; i10++) {
            iArr4[i10] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i10]))).intValue();
        }
        int iMin = Math.min(i6, i8);
        if (iArr2.length != 0) {
            iMin = Math.min(iMin, iArr2.length);
        }
        double[][] dArr4 = new double[iMin][];
        int i11 = 0;
        for (int i12 = 0; i12 < iArr2.length; i12++) {
            dArr4[i12] = pointProviderLab.fromInt(iArr2[i12]);
            i11++;
        }
        int i13 = iMin - i11;
        if (i13 > 0) {
            for (int i14 = 0; i14 < i13; i14++) {
            }
        }
        int[] iArr5 = new int[i8];
        for (int i15 = 0; i15 < i8; i15++) {
            iArr5[i15] = random.nextInt(iMin);
        }
        int[][] iArr6 = new int[iMin][];
        for (int i16 = 0; i16 < iMin; i16++) {
            iArr6[i16] = new int[iMin];
        }
        Distance[][] distanceArr = new Distance[iMin][];
        for (int i17 = 0; i17 < iMin; i17++) {
            distanceArr[i17] = new Distance[iMin];
            for (int i18 = 0; i18 < iMin; i18++) {
                distanceArr[i17][i18] = new Distance();
            }
        }
        int[] iArr7 = new int[iMin];
        int i19 = 0;
        while (i19 < 10) {
            int i20 = 0;
            while (i20 < iMin) {
                int i21 = i20 + 1;
                int i22 = i21;
                while (i22 < iMin) {
                    int[] iArr8 = iArr4;
                    double dDistance = pointProviderLab.distance(dArr4[i20], dArr4[i22]);
                    Distance distance = distanceArr[i22][i20];
                    distance.distance = dDistance;
                    distance.index = i20;
                    Distance distance2 = distanceArr[i20][i22];
                    distance2.distance = dDistance;
                    distance2.index = i22;
                    i22++;
                    iArr4 = iArr8;
                    iArr5 = iArr5;
                    z6 = z6;
                }
                int[] iArr9 = iArr4;
                int[] iArr10 = iArr5;
                boolean z7 = z6;
                Arrays.sort(distanceArr[i20]);
                for (int i23 = 0; i23 < iMin; i23++) {
                    iArr6[i20][i23] = distanceArr[i20][i23].index;
                }
                iArr4 = iArr9;
                iArr5 = iArr10;
                i20 = i21;
                z6 = z7;
            }
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            boolean z8 = z6;
            int i24 = 0;
            int i25 = 0;
            while (i24 < i8) {
                double[] dArr5 = dArr3[i24];
                int i26 = iArr12[i24];
                double dDistance2 = pointProviderLab.distance(dArr5, dArr4[i26]);
                int i27 = i24;
                double d6 = dDistance2;
                int i28 = -1;
                int i29 = 0;
                while (i29 < iMin) {
                    int i30 = i25;
                    int[][] iArr13 = iArr6;
                    if (distanceArr[i26][i29].distance < 4.0d * dDistance2) {
                        double dDistance3 = pointProviderLab.distance(dArr5, dArr4[i29]);
                        if (dDistance3 < d6) {
                            d6 = dDistance3;
                            i28 = i29;
                        }
                    }
                    i29++;
                    iArr6 = iArr13;
                    i25 = i30;
                }
                int i31 = i25;
                int[][] iArr14 = iArr6;
                if (i28 == -1 || Math.abs(Math.sqrt(d6) - Math.sqrt(dDistance2)) <= 3.0d) {
                    i25 = i31;
                } else {
                    i25 = i31 + 1;
                    iArr12[i27] = i28;
                }
                i24 = i27 + 1;
                iArr6 = iArr14;
            }
            int[][] iArr15 = iArr6;
            if (i25 == 0 && i19 != 0) {
                break;
            }
            double[] dArr6 = new double[iMin];
            double[] dArr7 = new double[iMin];
            double[] dArr8 = new double[iMin];
            boolean z9 = false;
            Arrays.fill(iArr7, 0);
            int i32 = 0;
            while (i32 < i8) {
                int i33 = iArr12[i32];
                double[] dArr9 = dArr3[i32];
                boolean z10 = z9;
                int i34 = iArr11[i32];
                iArr7[i33] = iArr7[i33] + i34;
                double d7 = i34;
                dArr6[i33] = dArr6[i33] + (dArr9[z10 ? 1 : 0] * d7);
                dArr7[i33] = dArr7[i33] + (dArr9[z8 ? 1 : 0] * d7);
                dArr8[i33] = dArr8[i33] + (dArr9[2] * d7);
                i32++;
                z9 = false;
            }
            int i35 = 0;
            while (i35 < iMin) {
                int i36 = iArr7[i35];
                if (i36 == 0) {
                    dArr4[i35] = new double[]{0.0d, 0.0d, 0.0d};
                    dArr = dArr6;
                    dArr2 = dArr7;
                } else {
                    double d8 = dArr6[i35];
                    dArr = dArr6;
                    dArr2 = dArr7;
                    double d9 = i36;
                    double d10 = d8 / d9;
                    double d11 = dArr2[i35] / d9;
                    double d12 = dArr8[i35] / d9;
                    double[] dArr10 = dArr4[i35];
                    dArr10[0] = d10;
                    dArr10[z8 ? 1 : 0] = d11;
                    dArr10[2] = d12;
                }
                i35++;
                dArr6 = dArr;
                dArr7 = dArr2;
            }
            i19++;
            iArr4 = iArr11;
            iArr5 = iArr12;
            z6 = z8 ? 1 : 0;
            iArr6 = iArr15;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i37 = 0; i37 < iMin; i37++) {
            int i38 = iArr7[i37];
            if (i38 != 0) {
                int i39 = pointProviderLab.toInt(dArr4[i37]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i39))) {
                    linkedHashMap2.put(Integer.valueOf(i39), Integer.valueOf(i38));
                }
            }
        }
        return linkedHashMap2;
    }
}
