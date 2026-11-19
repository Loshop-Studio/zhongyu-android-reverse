package com.alibaba.fastjson.util;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class Base64 {

    /* renamed from: CA */
    public static final char[] f3988CA;

    /* renamed from: IA */
    public static final int[] f3989IA;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f3988CA = charArray;
        int[] iArr = new int[256];
        f3989IA = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            f3989IA[f3988CA[i10]] = i10;
        }
        f3989IA[61] = 0;
    }

    public static byte[] decodeFast(char[] cArr, int i10, int i11) {
        int i12;
        int i13 = 0;
        if (i11 == 0) {
            return new byte[0];
        }
        int i14 = (i10 + i11) - 1;
        int i15 = i10;
        while (i15 < i14 && f3989IA[cArr[i15]] < 0) {
            i15++;
        }
        while (i14 > 0 && f3989IA[cArr[i14]] < 0) {
            i14--;
        }
        int i16 = cArr[i14] == '=' ? cArr[i14 + (-1)] == '=' ? 2 : 1 : 0;
        int i17 = (i14 - i15) + 1;
        if (i11 > 76) {
            i12 = (cArr[76] == '\r' ? i17 / 78 : 0) << 1;
        } else {
            i12 = 0;
        }
        int i18 = (((i17 - i12) * 6) >> 3) - i16;
        byte[] bArr = new byte[i18];
        int i19 = (i18 / 3) * 3;
        int i20 = 0;
        int i21 = 0;
        while (i20 < i19) {
            int[] iArr = f3989IA;
            int i22 = i15 + 4;
            int i23 = iArr[cArr[i15 + 3]] | (iArr[cArr[i15 + 1]] << 12) | (iArr[cArr[i15]] << 18) | (iArr[cArr[i15 + 2]] << 6);
            bArr[i20] = (byte) (i23 >> 16);
            int i24 = i20 + 2;
            bArr[i20 + 1] = (byte) (i23 >> 8);
            i20 += 3;
            bArr[i24] = (byte) i23;
            if (i12 <= 0 || (i21 = i21 + 1) != 19) {
                i15 = i22;
            } else {
                i15 += 6;
                i21 = 0;
            }
        }
        if (i20 < i18) {
            int i25 = 0;
            while (i15 <= i14 - i16) {
                i13 |= f3989IA[cArr[i15]] << (18 - (i25 * 6));
                i25++;
                i15++;
            }
            int i26 = 16;
            while (i20 < i18) {
                bArr[i20] = (byte) (i13 >> i26);
                i26 -= 8;
                i20++;
            }
        }
        return bArr;
    }

    public static byte[] decodeFast(String str, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            return new byte[0];
        }
        int i13 = (i10 + i11) - 1;
        int i14 = i10;
        while (i14 < i13 && f3989IA[str.charAt(i14)] < 0) {
            i14++;
        }
        while (i13 > 0 && f3989IA[str.charAt(i13)] < 0) {
            i13--;
        }
        int i15 = str.charAt(i13) == '=' ? str.charAt(i13 + (-1)) == '=' ? 2 : 1 : 0;
        int i16 = (i13 - i14) + 1;
        if (i11 > 76) {
            i12 = (str.charAt(76) == '\r' ? i16 / 78 : 0) << 1;
        } else {
            i12 = 0;
        }
        int i17 = (((i16 - i12) * 6) >> 3) - i15;
        byte[] bArr = new byte[i17];
        int i18 = (i17 / 3) * 3;
        int i19 = 0;
        int i20 = 0;
        while (i19 < i18) {
            int[] iArr = f3989IA;
            int i21 = i14 + 4;
            int i22 = iArr[str.charAt(i14 + 3)] | (iArr[str.charAt(i14 + 1)] << 12) | (iArr[str.charAt(i14)] << 18) | (iArr[str.charAt(i14 + 2)] << 6);
            bArr[i19] = (byte) (i22 >> 16);
            int i23 = i19 + 2;
            bArr[i19 + 1] = (byte) (i22 >> 8);
            i19 += 3;
            bArr[i23] = (byte) i22;
            if (i12 <= 0 || (i20 = i20 + 1) != 19) {
                i14 = i21;
            } else {
                i14 += 6;
                i20 = 0;
            }
        }
        if (i19 < i17) {
            int i24 = 0;
            int i25 = 0;
            while (i14 <= i13 - i15) {
                i24 |= f3989IA[str.charAt(i14)] << (18 - (i25 * 6));
                i25++;
                i14++;
            }
            int i26 = 16;
            while (i19 < i17) {
                bArr[i19] = (byte) (i24 >> i26);
                i26 -= 8;
                i19++;
            }
        }
        return bArr;
    }

    public static byte[] decodeFast(String str) {
        int i10;
        int length = str.length();
        if (length == 0) {
            return new byte[0];
        }
        int i11 = length - 1;
        int i12 = 0;
        while (i12 < i11 && f3989IA[str.charAt(i12) & 255] < 0) {
            i12++;
        }
        while (i11 > 0 && f3989IA[str.charAt(i11) & 255] < 0) {
            i11--;
        }
        int i13 = str.charAt(i11) == '=' ? str.charAt(i11 + (-1)) == '=' ? 2 : 1 : 0;
        int i14 = (i11 - i12) + 1;
        if (length > 76) {
            i10 = (str.charAt(76) == '\r' ? i14 / 78 : 0) << 1;
        } else {
            i10 = 0;
        }
        int i15 = (((i14 - i10) * 6) >> 3) - i13;
        byte[] bArr = new byte[i15];
        int i16 = (i15 / 3) * 3;
        int i17 = 0;
        int i18 = 0;
        while (i17 < i16) {
            int[] iArr = f3989IA;
            int i19 = i12 + 4;
            int i20 = iArr[str.charAt(i12 + 3)] | (iArr[str.charAt(i12 + 1)] << 12) | (iArr[str.charAt(i12)] << 18) | (iArr[str.charAt(i12 + 2)] << 6);
            bArr[i17] = (byte) (i20 >> 16);
            int i21 = i17 + 2;
            bArr[i17 + 1] = (byte) (i20 >> 8);
            i17 += 3;
            bArr[i21] = (byte) i20;
            if (i10 <= 0 || (i18 = i18 + 1) != 19) {
                i12 = i19;
            } else {
                i12 += 6;
                i18 = 0;
            }
        }
        if (i17 < i15) {
            int i22 = 0;
            int i23 = 0;
            while (i12 <= i11 - i13) {
                i22 |= f3989IA[str.charAt(i12)] << (18 - (i23 * 6));
                i23++;
                i12++;
            }
            int i24 = 16;
            while (i17 < i15) {
                bArr[i17] = (byte) (i22 >> i24);
                i24 -= 8;
                i17++;
            }
        }
        return bArr;
    }
}
