package com.alibaba.sdk.android.oss.common.utils;

import java.lang.reflect.Array;
import java.util.zip.Checksum;

/* loaded from: classes.dex */
public class CRC64 implements Checksum {
    private static final int GF2_DIM = 64;
    private static final long POLY = -3932672073523589310L;
    private static final long[][] table = (long[][]) Array.newInstance((Class<?>) long.class, 8, 256);
    private long value = 0;

    static {
        for (int i4 = 0; i4 < 256; i4++) {
            long j4 = i4;
            for (int i5 = 0; i5 < 8; i5++) {
                j4 = (j4 & 1) == 1 ? (j4 >>> 1) ^ POLY : j4 >>> 1;
            }
            table[0][i4] = j4;
        }
        for (int i6 = 0; i6 < 256; i6++) {
            long j5 = table[0][i6];
            for (int i7 = 1; i7 < 8; i7++) {
                long[][] jArr = table;
                j5 = (j5 >>> 8) ^ jArr[0][(int) (255 & j5)];
                jArr[i7][i6] = j5;
            }
        }
    }

    public static long combine(long j4, long j5, long j6) {
        if (j6 == 0) {
            return j4;
        }
        long[] jArr = new long[64];
        long[] jArr2 = new long[64];
        jArr2[0] = -3932672073523589310L;
        long j7 = 1;
        for (int i4 = 1; i4 < 64; i4++) {
            jArr2[i4] = j7;
            j7 <<= 1;
        }
        gf2MatrixSquare(jArr, jArr2);
        gf2MatrixSquare(jArr2, jArr);
        long jGf2MatrixTimes = j4;
        long j8 = j6;
        do {
            gf2MatrixSquare(jArr, jArr2);
            if ((j8 & 1) == 1) {
                jGf2MatrixTimes = gf2MatrixTimes(jArr, jGf2MatrixTimes);
            }
            long j9 = j8 >>> 1;
            if (j9 == 0) {
                break;
            }
            gf2MatrixSquare(jArr2, jArr);
            if ((j9 & 1) == 1) {
                jGf2MatrixTimes = gf2MatrixTimes(jArr2, jGf2MatrixTimes);
            }
            j8 = j9 >>> 1;
        } while (j8 != 0);
        return jGf2MatrixTimes ^ j5;
    }

    private static void gf2MatrixSquare(long[] jArr, long[] jArr2) {
        for (int i4 = 0; i4 < 64; i4++) {
            jArr[i4] = gf2MatrixTimes(jArr2, jArr2[i4]);
        }
    }

    private static long gf2MatrixTimes(long[] jArr, long j4) {
        int i4 = 0;
        long j5 = 0;
        while (j4 != 0) {
            if ((j4 & 1) == 1) {
                j5 ^= jArr[i4];
            }
            j4 >>>= 1;
            i4++;
        }
        return j5;
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        return this.value;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        this.value = 0L;
    }

    @Override // java.util.zip.Checksum
    public void update(int i4) {
        update(new byte[]{(byte) (i4 & 255)}, 1);
    }

    public void update(byte[] bArr, int i4) {
        update(bArr, 0, i4);
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i4, int i5) {
        this.value = ~this.value;
        int i6 = i4;
        int i7 = i5;
        while (i7 >= 8) {
            long[][] jArr = table;
            long[] jArr2 = jArr[7];
            long j4 = this.value;
            this.value = ((((((jArr[6][(int) ((bArr[i6 + 1] & 255) ^ ((j4 >>> 8) & 255))] ^ jArr2[(int) ((j4 & 255) ^ (bArr[i6] & 255))]) ^ jArr[5][(int) (((j4 >>> 16) & 255) ^ (bArr[i6 + 2] & 255))]) ^ jArr[4][(int) (((j4 >>> 24) & 255) ^ (bArr[i6 + 3] & 255))]) ^ jArr[3][(int) (((j4 >>> 32) & 255) ^ (bArr[i6 + 4] & 255))]) ^ jArr[2][(int) (((j4 >>> 40) & 255) ^ (bArr[i6 + 5] & 255))]) ^ jArr[1][(int) ((255 & (j4 >>> 48)) ^ (bArr[i6 + 6] & 255))]) ^ jArr[0][(int) ((j4 >>> 56) ^ (bArr[i6 + 7] & 255))];
            i6 += 8;
            i7 -= 8;
        }
        while (i7 > 0) {
            long[] jArr3 = table[0];
            long j5 = this.value;
            this.value = (j5 >>> 8) ^ jArr3[(int) ((bArr[i6] ^ j5) & 255)];
            i6++;
            i7--;
        }
        this.value = ~this.value;
    }
}
