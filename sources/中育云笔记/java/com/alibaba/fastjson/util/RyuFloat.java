package com.alibaba.fastjson.util;

/* loaded from: classes3.dex */
public final class RyuFloat {
    private static final int[][] POW5_SPLIT = {new int[]{536870912, 0}, new int[]{671088640, 0}, new int[]{838860800, 0}, new int[]{1048576000, 0}, new int[]{655360000, 0}, new int[]{819200000, 0}, new int[]{1024000000, 0}, new int[]{640000000, 0}, new int[]{800000000, 0}, new int[]{1000000000, 0}, new int[]{625000000, 0}, new int[]{781250000, 0}, new int[]{976562500, 0}, new int[]{610351562, 1073741824}, new int[]{762939453, 268435456}, new int[]{953674316, 872415232}, new int[]{596046447, 1619001344}, new int[]{745058059, 1486880768}, new int[]{931322574, 1321730048}, new int[]{582076609, 289210368}, new int[]{727595761, 898383872}, new int[]{909494701, 1659850752}, new int[]{568434188, 1305842176}, new int[]{710542735, 1632302720}, new int[]{888178419, 1503507488}, new int[]{555111512, 671256724}, new int[]{693889390, 839070905}, new int[]{867361737, 2122580455}, new int[]{542101086, 521306416}, new int[]{677626357, 1725374844}, new int[]{847032947, 546105819}, new int[]{1058791184, 145761362}, new int[]{661744490, 91100851}, new int[]{827180612, 1187617888}, new int[]{1033975765, 1484522360}, new int[]{646234853, 1196261931}, new int[]{807793566, 2032198326}, new int[]{1009741958, 1466506084}, new int[]{631088724, 379695390}, new int[]{788860905, 474619238}, new int[]{986076131, 1130144959}, new int[]{616297582, 437905143}, new int[]{770371977, 1621123253}, new int[]{962964972, 415791331}, new int[]{601853107, 1333611405}, new int[]{752316384, 1130143345}, new int[]{940395480, 1412679181}};
    private static final int[][] POW5_INV_SPLIT = {new int[]{268435456, 1}, new int[]{214748364, 1717986919}, new int[]{171798691, 1803886265}, new int[]{137438953, 1013612282}, new int[]{219902325, 1192282922}, new int[]{175921860, 953826338}, new int[]{140737488, 763061070}, new int[]{225179981, 791400982}, new int[]{180143985, 203624056}, new int[]{144115188, 162899245}, new int[]{230584300, 1978625710}, new int[]{184467440, 1582900568}, new int[]{147573952, 1266320455}, new int[]{236118324, 308125809}, new int[]{188894659, 675997377}, new int[]{151115727, 970294631}, new int[]{241785163, 1981968139}, new int[]{193428131, 297084323}, new int[]{154742504, 1955654377}, new int[]{247588007, 1840556814}, new int[]{198070406, 613451992}, new int[]{158456325, 61264864}, new int[]{253530120, 98023782}, new int[]{202824096, 78419026}, new int[]{162259276, 1780722139}, new int[]{259614842, 1990161963}, new int[]{207691874, 733136111}, new int[]{166153499, 1016005619}, new int[]{265845599, 337118801}, new int[]{212676479, 699191770}, new int[]{170141183, 988850146}};

    public static String toString(float f10) {
        char[] cArr = new char[15];
        return new String(cArr, 0, toString(f10, cArr, 0));
    }

    public static int toString(float f10, char[] cArr, int i10) {
        int i11;
        char c10;
        char c11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z11;
        boolean z12;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        char c12;
        long j10;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        if (!Float.isNaN(f10)) {
            if (f10 == Float.POSITIVE_INFINITY) {
                cArr[i10] = 'I';
                cArr[i10 + 1] = 'n';
                cArr[i10 + 2] = 'f';
                cArr[i10 + 3] = 'i';
                cArr[i10 + 4] = 'n';
                cArr[i10 + 5] = 'i';
                cArr[i10 + 6] = 't';
                i27 = i10 + 8;
                cArr[i10 + 7] = 'y';
            } else if (f10 == Float.NEGATIVE_INFINITY) {
                cArr[i10] = '-';
                cArr[i10 + 1] = 'I';
                cArr[i10 + 2] = 'n';
                cArr[i10 + 3] = 'f';
                cArr[i10 + 4] = 'i';
                cArr[i10 + 5] = 'n';
                cArr[i10 + 6] = 'i';
                cArr[i10 + 7] = 't';
                i28 = i10 + 9;
                cArr[i10 + 8] = 'y';
            } else {
                int iFloatToIntBits = Float.floatToIntBits(f10);
                if (iFloatToIntBits == 0) {
                    cArr[i10] = '0';
                    cArr[i10 + 1] = '.';
                    i28 = i10 + 3;
                    cArr[i10 + 2] = '0';
                } else if (iFloatToIntBits == Integer.MIN_VALUE) {
                    cArr[i10] = '-';
                    cArr[i10 + 1] = '0';
                    cArr[i10 + 2] = '.';
                    i27 = i10 + 4;
                    cArr[i10 + 3] = '0';
                } else {
                    int i29 = (iFloatToIntBits >> 23) & 255;
                    int i30 = 8388607 & iFloatToIntBits;
                    if (i29 == 0) {
                        i11 = -149;
                    } else {
                        i11 = i29 - 150;
                        i30 |= 8388608;
                    }
                    boolean z13 = iFloatToIntBits < 0;
                    boolean z14 = (i30 & 1) == 0;
                    int i31 = i30 * 4;
                    int i32 = i31 + 2;
                    int i33 = i31 - ((((long) i30) != 8388608 || i29 <= 1) ? 2 : 1);
                    int i34 = i11 - 2;
                    if (i34 >= 0) {
                        c11 = '-';
                        i17 = (int) ((i34 * 3010299) / 10000000);
                        if (i17 == 0) {
                            i23 = 1;
                            c12 = 2;
                            j10 = 9999999;
                        } else {
                            c12 = 2;
                            j10 = 9999999;
                            i23 = (int) (((i17 * 23219280) + 9999999) / 10000000);
                        }
                        int i35 = (-i34) + i17;
                        int[][] iArr = POW5_INV_SPLIT;
                        int[] iArr2 = iArr[i17];
                        c10 = '0';
                        long j11 = iArr2[0];
                        long j12 = iArr2[1];
                        i13 = 10;
                        long j13 = i31;
                        int i36 = ((i23 + 58) + i35) - 31;
                        i12 = 0;
                        int i37 = (int) (((j13 * j11) + ((j13 * j12) >> 31)) >> i36);
                        z10 = z13;
                        long j14 = i32;
                        int i38 = (int) (((j14 * j11) + ((j14 * j12) >> 31)) >> i36);
                        long j15 = i33;
                        int i39 = (int) (((j11 * j15) + ((j15 * j12) >> 31)) >> i36);
                        if (i17 == 0 || (i38 - 1) / 10 > i39 / 10) {
                            i24 = i38;
                            i25 = i39;
                            i26 = 0;
                        } else {
                            int i40 = i17 - 1;
                            int i41 = (i35 - 1) + (i40 == 0 ? 1 : (int) (((i40 * 23219280) + j10) / 10000000)) + 58;
                            int[] iArr3 = iArr[i40];
                            i24 = i38;
                            i25 = i39;
                            i26 = (int) ((((iArr3[0] * j13) + ((j13 * iArr3[1]) >> 31)) >> (i41 - 31)) % 10);
                        }
                        int i42 = 0;
                        while (i32 > 0 && i32 % 5 == 0) {
                            i32 /= 5;
                            i42++;
                        }
                        int i43 = 0;
                        while (i31 > 0 && i31 % 5 == 0) {
                            i31 /= 5;
                            i43++;
                        }
                        int i44 = 0;
                        while (i33 > 0 && i33 % 5 == 0) {
                            i33 /= 5;
                            i44++;
                        }
                        boolean z15 = i42 >= i17;
                        boolean z16 = i43 >= i17;
                        i18 = i44 >= i17 ? 1 : 0;
                        z12 = z16;
                        i15 = i25;
                        i14 = i37;
                        z11 = z15;
                        i19 = i26;
                        i20 = i24;
                    } else {
                        c10 = '0';
                        c11 = '-';
                        i12 = 0;
                        i13 = 10;
                        z10 = z13;
                        int i45 = -i34;
                        int i46 = (int) ((i45 * 6989700) / 10000000);
                        int i47 = i45 - i46;
                        int i48 = i47 == 0 ? 1 : (int) (((i47 * 23219280) + 9999999) / 10000000);
                        int[][] iArr4 = POW5_SPLIT;
                        int[] iArr5 = iArr4[i47];
                        long j16 = iArr5[0];
                        long j17 = iArr5[1];
                        int i49 = (i46 - (i48 - 61)) - 31;
                        long j18 = i31;
                        i14 = (int) (((j18 * j16) + ((j18 * j17) >> 31)) >> i49);
                        long j19 = i32;
                        int i50 = (int) (((j19 * j16) + ((j19 * j17) >> 31)) >> i49);
                        long j20 = i33;
                        i15 = (int) (((j16 * j20) + ((j20 * j17) >> 31)) >> i49);
                        if (i46 == 0 || (i50 - 1) / 10 > i15 / 10) {
                            i16 = 0;
                        } else {
                            int i51 = i47 + 1;
                            int i52 = (i46 - 1) - ((i51 == 0 ? 1 : (int) (((i51 * 23219280) + 9999999) / 10000000)) - 61);
                            int[] iArr6 = iArr4[i51];
                            i16 = (int) ((((iArr6[0] * j18) + ((iArr6[1] * j18) >> 31)) >> (i52 - 31)) % 10);
                        }
                        i17 = i46 + i34;
                        z11 = 1 >= i46;
                        z12 = i46 < 23 && (((1 << (i46 + (-1))) - 1) & i31) == 0;
                        i18 = (i33 % 2 == 1 ? 0 : 1) >= i46 ? 1 : 0;
                        i19 = i16;
                        i20 = i50;
                    }
                    int i53 = 1000000000;
                    int i54 = i13;
                    while (i54 > 0 && i20 < i53) {
                        i53 /= 10;
                        i54--;
                    }
                    int i55 = i17 + i54;
                    int i56 = i55 - 1;
                    int i57 = (i56 < -3 || i56 >= 7) ? 1 : i12;
                    if (z11 && !z14) {
                        i20--;
                    }
                    int i58 = i12;
                    while (true) {
                        int i59 = i20 / 10;
                        int i60 = i15 / 10;
                        if (i59 <= i60 || (i20 < 100 && i57 != 0)) {
                            break;
                        }
                        i18 &= i15 % 10 == 0 ? 1 : i12;
                        i19 = i14 % 10;
                        i14 /= 10;
                        i58++;
                        i20 = i59;
                        i15 = i60;
                    }
                    if (i18 != 0 && z14) {
                        while (i15 % 10 == 0 && (i20 >= 100 || i57 == 0)) {
                            i20 /= 10;
                            i19 = i14 % 10;
                            i14 /= 10;
                            i15 /= 10;
                            i58++;
                        }
                    }
                    int i61 = i14;
                    if (z12 && i19 == 5 && i61 % 2 == 0) {
                        i19 = 4;
                    }
                    int i62 = i61 + (((i61 != i15 || (i18 != 0 && z14)) && i19 < 5) ? i12 : 1);
                    int i63 = i54 - i58;
                    if (z10) {
                        i21 = i10 + 1;
                        cArr[i10] = c11;
                    } else {
                        i21 = i10;
                    }
                    if (i57 != 0) {
                        for (int i64 = i12; i64 < i63 - 1; i64++) {
                            int i65 = i62 % 10;
                            i62 /= 10;
                            cArr[(i21 + i63) - i64] = (char) (i65 + 48);
                        }
                        cArr[i21] = (char) ((i62 % 10) + 48);
                        cArr[i21 + 1] = '.';
                        int i66 = i21 + i63 + 1;
                        if (i63 == 1) {
                            cArr[i66] = c10;
                            i66++;
                        }
                        int i67 = i66 + 1;
                        cArr[i66] = 'E';
                        if (i56 < 0) {
                            cArr[i67] = c11;
                            i56 = -i56;
                            i67 = i66 + 2;
                        }
                        if (i56 >= i13) {
                            cArr[i67] = (char) ((i56 / 10) + 48);
                            i67++;
                        }
                        i22 = i67 + 1;
                        cArr[i67] = (char) ((i56 % 10) + 48);
                    } else if (i56 < 0) {
                        int i68 = i21 + 1;
                        cArr[i21] = c10;
                        int i69 = i21 + 2;
                        cArr[i68] = '.';
                        int i70 = -1;
                        while (i70 > i56) {
                            cArr[i69] = c10;
                            i70--;
                            i69++;
                        }
                        int i71 = i69;
                        for (int i72 = i12; i72 < i63; i72++) {
                            cArr[((i69 + i63) - i72) - 1] = (char) ((i62 % 10) + 48);
                            i62 /= 10;
                            i71++;
                        }
                        i22 = i71;
                    } else if (i55 >= i63) {
                        for (int i73 = i12; i73 < i63; i73++) {
                            cArr[((i21 + i63) - i73) - 1] = (char) ((i62 % 10) + 48);
                            i62 /= 10;
                        }
                        int i74 = i21 + i63;
                        while (i63 < i55) {
                            cArr[i74] = c10;
                            i63++;
                            i74++;
                        }
                        cArr[i74] = '.';
                        i22 = i74 + 2;
                        cArr[i74 + 1] = c10;
                    } else {
                        int i75 = i21 + 1;
                        for (int i76 = i12; i76 < i63; i76++) {
                            if ((i63 - i76) - 1 == i56) {
                                cArr[((i75 + i63) - i76) - 1] = '.';
                                i75--;
                            }
                            cArr[((i75 + i63) - i76) - 1] = (char) ((i62 % 10) + 48);
                            i62 /= 10;
                        }
                        i22 = i63 + 1 + i21;
                    }
                    return i22 - i10;
                }
            }
            return i27 - i10;
        }
        cArr[i10] = 'N';
        cArr[i10 + 1] = 'a';
        i28 = i10 + 3;
        cArr[i10 + 2] = 'N';
        return i28 - i10;
    }
}
