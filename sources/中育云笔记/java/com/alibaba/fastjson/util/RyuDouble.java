package com.alibaba.fastjson.util;

import androidx.collection.SieveCacheKt;
import androidx.compose.animation.core.AnimationKt;
import androidx.work.WorkRequest;
import com.taobao.sophix.PatchStatus;
import java.lang.reflect.Array;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class RyuDouble {
    private static final int[][] POW5_INV_SPLIT;
    private static final int[][] POW5_SPLIT;

    static {
        Class cls = Integer.TYPE;
        POW5_SPLIT = (int[][]) Array.newInstance((Class<?>) cls, 326, 4);
        POW5_INV_SPLIT = (int[][]) Array.newInstance((Class<?>) cls, 291, 4);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger.shiftLeft(31).subtract(bigInteger);
        BigInteger bigIntegerSubtract2 = bigInteger.shiftLeft(31).subtract(bigInteger);
        int i10 = 0;
        while (i10 < 326) {
            BigInteger bigIntegerPow = BigInteger.valueOf(5L).pow(i10);
            int iBitLength = bigIntegerPow.bitLength();
            int i11 = i10 == 0 ? 1 : (int) (((i10 * 23219280) + 9999999) / 10000000);
            if (i11 != iBitLength) {
                throw new IllegalStateException(iBitLength + " != " + i11);
            }
            if (i10 < POW5_SPLIT.length) {
                for (int i12 = 0; i12 < 4; i12++) {
                    POW5_SPLIT[i10][i12] = bigIntegerPow.shiftRight((iBitLength - 121) + ((3 - i12) * 31)).and(bigIntegerSubtract).intValue();
                }
            }
            if (i10 < POW5_INV_SPLIT.length) {
                int i13 = iBitLength + PatchStatus.CODE_LOAD_RES_INJECT_PATH;
                BigInteger bigInteger2 = BigInteger.ONE;
                BigInteger bigIntegerAdd = bigInteger2.shiftLeft(i13).divide(bigIntegerPow).add(bigInteger2);
                for (int i14 = 0; i14 < 4; i14++) {
                    if (i14 == 0) {
                        POW5_INV_SPLIT[i10][i14] = bigIntegerAdd.shiftRight((3 - i14) * 31).intValue();
                    } else {
                        POW5_INV_SPLIT[i10][i14] = bigIntegerAdd.shiftRight((3 - i14) * 31).and(bigIntegerSubtract2).intValue();
                    }
                }
            }
            i10++;
        }
    }

    public static String toString(double d10) {
        char[] cArr = new char[24];
        return new String(cArr, 0, toString(d10, cArr, 0));
    }

    public static int toString(double d10, char[] cArr, int i10) {
        int i11;
        char c10;
        char c11;
        boolean z10;
        long j10;
        int i12;
        boolean z11;
        long j11;
        long j12;
        boolean z12;
        int i13;
        long j13;
        boolean z13;
        long j14;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z14;
        int i18;
        int i19;
        int i20;
        int i21;
        if (Double.isNaN(d10)) {
            cArr[i10] = 'N';
            cArr[i10 + 1] = 'a';
            i21 = i10 + 3;
            cArr[i10 + 2] = 'N';
        } else {
            if (d10 == Double.POSITIVE_INFINITY) {
                cArr[i10] = 'I';
                cArr[i10 + 1] = 'n';
                cArr[i10 + 2] = 'f';
                cArr[i10 + 3] = 'i';
                cArr[i10 + 4] = 'n';
                cArr[i10 + 5] = 'i';
                cArr[i10 + 6] = 't';
                cArr[i10 + 7] = 'y';
                return (i10 + 8) - i10;
            }
            if (d10 == Double.NEGATIVE_INFINITY) {
                cArr[i10] = '-';
                cArr[i10 + 1] = 'I';
                cArr[i10 + 2] = 'n';
                cArr[i10 + 3] = 'f';
                cArr[i10 + 4] = 'i';
                cArr[i10 + 5] = 'n';
                cArr[i10 + 6] = 'i';
                cArr[i10 + 7] = 't';
                i21 = i10 + 9;
                cArr[i10 + 8] = 'y';
            } else {
                long jDoubleToLongBits = Double.doubleToLongBits(d10);
                if (jDoubleToLongBits != 0) {
                    if (jDoubleToLongBits == Long.MIN_VALUE) {
                        cArr[i10] = '-';
                        cArr[i10 + 1] = '0';
                        cArr[i10 + 2] = '.';
                        i17 = i10 + 4;
                        cArr[i10 + 3] = '0';
                    } else {
                        int i22 = (int) ((jDoubleToLongBits >>> 52) & 2047);
                        long j15 = jDoubleToLongBits & 4503599627370495L;
                        if (i22 == 0) {
                            i11 = -1074;
                        } else {
                            i11 = i22 - 1075;
                            j15 |= 4503599627370496L;
                        }
                        boolean z15 = jDoubleToLongBits < 0;
                        boolean z16 = (j15 & 1) == 0;
                        long j16 = 4 * j15;
                        long j17 = j16 + 2;
                        int i23 = (j15 != 4503599627370496L || i22 <= 1) ? 1 : 0;
                        long j18 = (j16 - 1) - i23;
                        int i24 = i11 - 2;
                        int i25 = 3;
                        if (i24 >= 0) {
                            j10 = 10000000;
                            int iMax = Math.max(0, ((int) ((i24 * 3010299) / 10000000)) - 1);
                            int i26 = (((-i24) + iMax) + ((iMax == 0 ? 1 : (int) (((iMax * 23219280) + 9999999) / 10000000)) + PatchStatus.CODE_LOAD_RES_INJECT_PATH)) - 114;
                            if (i26 >= 0) {
                                int[] iArr = POW5_INV_SPLIT[iMax];
                                long j19 = j16 >>> 31;
                                long j20 = j16 & SieveCacheKt.NodeLinkMask;
                                int i27 = iArr[0];
                                c10 = '.';
                                c11 = '0';
                                int i28 = iArr[1];
                                int i29 = iArr[2];
                                z10 = z16;
                                i12 = 10;
                                int i30 = iArr[3];
                                long j21 = ((((((((((((j20 * i30) >>> 31) + (i29 * j20)) + (j19 * i30)) >>> 31) + (i28 * j20)) + (i29 * j19)) >>> 31) + (i27 * j20)) + (i28 * j19)) >>> 21) + ((i27 * j19) << 10)) >>> i26;
                                long j22 = j17 >>> 31;
                                long j23 = j17 & SieveCacheKt.NodeLinkMask;
                                z11 = z15;
                                long j24 = ((((((((((((j23 * i30) >>> 31) + (i29 * j23)) + (j22 * i30)) >>> 31) + (i28 * j23)) + (i29 * j22)) >>> 31) + (i27 * j23)) + (i28 * j22)) >>> 21) + ((i27 * j22) << 10)) >>> i26;
                                long j25 = j18 >>> 31;
                                long j26 = j18 & SieveCacheKt.NodeLinkMask;
                                j12 = j24;
                                j13 = ((((((((((((j26 * i30) >>> 31) + (i29 * j26)) + (j25 * i30)) >>> 31) + (i28 * j26)) + (i29 * j25)) >>> 31) + (i27 * j26)) + (i28 * j25)) >>> 21) + ((i27 * j25) << 10)) >>> i26;
                                i13 = iMax;
                                if (i13 <= 21) {
                                    long j27 = j16 % 5;
                                    if (j27 == 0) {
                                        if (j27 != 0) {
                                            i20 = 0;
                                        } else if (j16 % 25 != 0) {
                                            i20 = 1;
                                        } else if (j16 % 125 != 0) {
                                            i20 = 2;
                                        } else if (j16 % 625 != 0) {
                                            i20 = 3;
                                        } else {
                                            long j28 = j16 / 625;
                                            i20 = 4;
                                            while (j28 > 0 && j28 % 5 == 0) {
                                                j28 /= 5;
                                                i20++;
                                            }
                                        }
                                        z14 = i20 >= i13;
                                        z13 = false;
                                        z12 = z14;
                                        j11 = j21;
                                    } else if (z10) {
                                        if (j18 % 5 != 0) {
                                            i19 = 0;
                                        } else if (j18 % 25 != 0) {
                                            i19 = 1;
                                        } else if (j18 % 125 != 0) {
                                            i19 = 2;
                                        } else if (j18 % 625 != 0) {
                                            i19 = 3;
                                        } else {
                                            long j29 = j18 / 625;
                                            i19 = 4;
                                            while (j29 > 0 && j29 % 5 == 0) {
                                                j29 /= 5;
                                                i19++;
                                            }
                                        }
                                        z13 = i19 >= i13;
                                        z14 = false;
                                        z12 = z14;
                                        j11 = j21;
                                    } else {
                                        if (j17 % 5 != 0) {
                                            i18 = 0;
                                        } else if (j17 % 25 != 0) {
                                            i18 = 1;
                                        } else if (j17 % 125 != 0) {
                                            i18 = 2;
                                        } else if (j17 % 625 != 0) {
                                            i18 = 3;
                                        } else {
                                            long j30 = j17 / 625;
                                            i18 = 4;
                                            while (j30 > 0 && j30 % 5 == 0) {
                                                j30 /= 5;
                                                i18++;
                                            }
                                        }
                                        if (i18 >= i13) {
                                            j12--;
                                        }
                                    }
                                    z13 = false;
                                    z12 = z14;
                                    j11 = j21;
                                } else {
                                    z13 = false;
                                    z12 = z14;
                                    j11 = j21;
                                }
                            } else {
                                throw new IllegalArgumentException("" + i26);
                            }
                        } else {
                            c10 = '.';
                            c11 = '0';
                            z10 = z16;
                            j10 = 10000000;
                            i12 = 10;
                            z11 = z15;
                            int iMax2 = Math.max(0, ((int) ((r0 * 6989700) / 10000000)) - 1);
                            int i31 = (-i24) - iMax2;
                            int i32 = (iMax2 - ((i31 == 0 ? 1 : (int) (((i31 * 23219280) + 9999999) / 10000000)) - 121)) - 114;
                            if (i32 >= 0) {
                                int[] iArr2 = POW5_SPLIT[i31];
                                long j31 = j16 >>> 31;
                                long j32 = j16 & SieveCacheKt.NodeLinkMask;
                                int i33 = iArr2[0];
                                int i34 = iArr2[1];
                                int i35 = iArr2[2];
                                int i36 = iArr2[3];
                                long j33 = ((((((((((((j32 * i36) >>> 31) + (i35 * j32)) + (i36 * j31)) >>> 31) + (i34 * j32)) + (i35 * j31)) >>> 31) + (i33 * j32)) + (i34 * j31)) >>> 21) + ((i33 * j31) << 10)) >>> i32;
                                long j34 = j17 >>> 31;
                                long j35 = j17 & SieveCacheKt.NodeLinkMask;
                                j11 = j33;
                                j12 = ((((((((((((j35 * i36) >>> 31) + (i35 * j35)) + (j34 * i36)) >>> 31) + (i34 * j35)) + (i35 * j34)) >>> 31) + (i33 * j35)) + (i34 * j34)) >>> 21) + ((i33 * j34) << 10)) >>> i32;
                                long j36 = j18 >>> 31;
                                long j37 = j18 & SieveCacheKt.NodeLinkMask;
                                long j38 = ((((((((((((j37 * i36) >>> 31) + (i35 * j37)) + (i36 * j36)) >>> 31) + (i34 * j37)) + (i35 * j36)) >>> 31) + (i33 * j37)) + (i34 * j36)) >>> 21) + ((i33 * j36) << 10)) >>> i32;
                                int i37 = iMax2 + i24;
                                z12 = true;
                                if (iMax2 <= 1) {
                                    if (z10) {
                                        boolean z17 = i23 == 1;
                                        i13 = i37;
                                        j13 = j38;
                                        z13 = z17;
                                    } else {
                                        j12--;
                                        i13 = i37;
                                    }
                                } else if (iMax2 < 63) {
                                    i13 = i37;
                                    z12 = (((1 << (iMax2 - 1)) - 1) & j16) == 0;
                                } else {
                                    i13 = i37;
                                    j13 = j38;
                                    z12 = false;
                                    z13 = false;
                                }
                                j13 = j38;
                                z13 = false;
                            } else {
                                throw new IllegalArgumentException("" + i32);
                            }
                        }
                        if (j12 >= 1000000000000000000L) {
                            i25 = 19;
                        } else if (j12 >= 100000000000000000L) {
                            i25 = 18;
                        } else if (j12 >= 10000000000000000L) {
                            i25 = 17;
                        } else if (j12 >= 1000000000000000L) {
                            i25 = 16;
                        } else if (j12 >= 100000000000000L) {
                            i25 = 15;
                        } else if (j12 >= 10000000000000L) {
                            i25 = 14;
                        } else if (j12 >= 1000000000000L) {
                            i25 = 13;
                        } else if (j12 >= 100000000000L) {
                            i25 = 12;
                        } else if (j12 >= 10000000000L) {
                            i25 = 11;
                        } else if (j12 >= 1000000000) {
                            i25 = i12;
                        } else if (j12 >= 100000000) {
                            i25 = 9;
                        } else if (j12 >= j10) {
                            i25 = 8;
                        } else if (j12 >= AnimationKt.MillisToNanos) {
                            i25 = 7;
                        } else if (j12 >= 100000) {
                            i25 = 6;
                        } else if (j12 >= WorkRequest.MIN_BACKOFF_MILLIS) {
                            i25 = 5;
                        } else if (j12 >= 1000) {
                            i25 = 4;
                        } else if (j12 < 100) {
                            i25 = j12 >= 10 ? 2 : 1;
                        }
                        int i38 = i13 + i25;
                        int i39 = i38 - 1;
                        boolean z18 = i39 < -3 || i39 >= 7;
                        if (z13 || z12) {
                            int i40 = 0;
                            int i41 = 0;
                            while (true) {
                                long j39 = j12 / 10;
                                long j40 = j13 / 10;
                                if (j39 <= j40 || (j12 < 100 && z18)) {
                                    break;
                                }
                                z13 &= j13 % 10 == 0;
                                z12 &= i40 == 0;
                                i40 = (int) (j11 % 10);
                                j11 /= 10;
                                i41++;
                                j12 = j39;
                                j13 = j40;
                            }
                            if (z13 && z10) {
                                while (j13 % 10 == 0 && (j12 >= 100 || !z18)) {
                                    z12 &= i40 == 0;
                                    i40 = (int) (j11 % 10);
                                    j12 /= 10;
                                    j11 /= 10;
                                    j13 /= 10;
                                    i41++;
                                }
                            }
                            if (z12 && i40 == 5 && j11 % 2 == 0) {
                                i40 = 4;
                            }
                            j14 = j11 + (((j11 != j13 || (z13 && z10)) && i40 < 5) ? 0 : 1);
                            i14 = i41;
                        } else {
                            i14 = 0;
                            int i42 = 0;
                            while (true) {
                                long j41 = j12 / 10;
                                long j42 = j13 / 10;
                                if (j41 <= j42 || (j12 < 100 && z18)) {
                                    break;
                                }
                                i42 = (int) (j11 % 10);
                                j11 /= 10;
                                i14++;
                                j12 = j41;
                                j13 = j42;
                            }
                            j14 = j11 + ((j11 == j13 || i42 >= 5) ? 1 : 0);
                        }
                        int i43 = i25 - i14;
                        if (z11) {
                            i15 = i10 + 1;
                            cArr[i10] = '-';
                        } else {
                            i15 = i10;
                        }
                        if (!z18) {
                            if (i39 < 0) {
                                int i44 = i15 + 1;
                                cArr[i15] = c11;
                                int i45 = i15 + 2;
                                cArr[i44] = c10;
                                int i46 = -1;
                                while (i46 > i39) {
                                    cArr[i45] = c11;
                                    i46--;
                                    i45++;
                                }
                                i16 = i45;
                                for (int i47 = 0; i47 < i43; i47++) {
                                    cArr[((i45 + i43) - i47) - 1] = (char) ((j14 % 10) + 48);
                                    j14 /= 10;
                                    i16++;
                                }
                            } else if (i38 >= i43) {
                                for (int i48 = 0; i48 < i43; i48++) {
                                    cArr[((i15 + i43) - i48) - 1] = (char) ((j14 % 10) + 48);
                                    j14 /= 10;
                                }
                                int i49 = i15 + i43;
                                while (i43 < i38) {
                                    cArr[i49] = c11;
                                    i43++;
                                    i49++;
                                }
                                cArr[i49] = c10;
                                i16 = i49 + 2;
                                cArr[i49 + 1] = c11;
                            } else {
                                int i50 = i15 + 1;
                                for (int i51 = 0; i51 < i43; i51++) {
                                    if ((i43 - i51) - 1 == i39) {
                                        cArr[((i50 + i43) - i51) - 1] = c10;
                                        i50--;
                                    }
                                    cArr[((i50 + i43) - i51) - 1] = (char) ((j14 % 10) + 48);
                                    j14 /= 10;
                                }
                                i16 = i15 + i43 + 1;
                            }
                            return i16 - i10;
                        }
                        for (int i52 = 0; i52 < i43 - 1; i52++) {
                            int i53 = (int) (j14 % 10);
                            j14 /= 10;
                            cArr[(i15 + i43) - i52] = (char) (i53 + 48);
                        }
                        cArr[i15] = (char) ((j14 % 10) + 48);
                        cArr[i15 + 1] = c10;
                        int i54 = i15 + i43 + 1;
                        if (i43 == 1) {
                            cArr[i54] = c11;
                            i54++;
                        }
                        int i55 = i54 + 1;
                        cArr[i54] = 'E';
                        if (i39 < 0) {
                            cArr[i55] = '-';
                            i39 = -i39;
                            i55 = i54 + 2;
                        }
                        if (i39 >= 100) {
                            int i56 = i55 + 1;
                            cArr[i55] = (char) ((i39 / 100) + 48);
                            i39 %= 100;
                            i55 += 2;
                            cArr[i56] = (char) ((i39 / 10) + 48);
                        } else if (i39 >= i12) {
                            cArr[i55] = (char) ((i39 / 10) + 48);
                            i55++;
                        }
                        i17 = i55 + 1;
                        cArr[i55] = (char) ((i39 % 10) + 48);
                    }
                    return i17 - i10;
                }
                cArr[i10] = '0';
                cArr[i10 + 1] = '.';
                i21 = i10 + 3;
                cArr[i10 + 2] = '0';
            }
        }
        return i21 - i10;
    }
}
