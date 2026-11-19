package com.alibaba.sdk.android.oss.common.utils;

import java.lang.reflect.Array;
import java.util.zip.Checksum;
import kotlin.UByte;

/* loaded from: classes3.dex */
public class CRC64 implements Checksum {
    private static final int GF2_DIM = 64;
    private static final long POLY = -3932672073523589310L;
    private static final long[][] table = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 8, 256);
    private long value = 0;

    static {
        for (int i6 = 0; i6 < 256; i6++) {
            long j6 = i6;
            for (int i7 = 0; i7 < 8; i7++) {
                j6 = (j6 & 1) == 1 ? (j6 >>> 1) ^ POLY : j6 >>> 1;
            }
            table[0][i6] = j6;
        }
        for (int i8 = 0; i8 < 256; i8++) {
            long j7 = table[0][i8];
            for (int i9 = 1; i9 < 8; i9++) {
                long[][] jArr = table;
                j7 = (j7 >>> 8) ^ jArr[0][(int) (255 & j7)];
                jArr[i9][i8] = j7;
            }
        }
    }

    public static long combine(long j6, long j7, long j8) {
        if (j8 == 0) {
            return j6;
        }
        long[] jArr = new long[64];
        long[] jArr2 = new long[64];
        jArr2[0] = -3932672073523589310L;
        long j9 = 1;
        for (int i6 = 1; i6 < 64; i6++) {
            jArr2[i6] = j9;
            j9 <<= 1;
        }
        gf2MatrixSquare(jArr, jArr2);
        gf2MatrixSquare(jArr2, jArr);
        long j10 = j8;
        do {
            gf2MatrixSquare(jArr, jArr2);
            if ((j10 & 1) == 1) {
                j6 = gf2MatrixTimes(jArr, j6);
            }
            long j11 = j10 >>> 1;
            if (j11 == 0) {
                break;
            }
            gf2MatrixSquare(jArr2, jArr);
            if ((j11 & 1) == 1) {
                j6 = gf2MatrixTimes(jArr2, j6);
            }
            j10 >>>= 2;
        } while (j10 != 0);
        return j6 ^ j7;
    }

    private static void gf2MatrixSquare(long[] jArr, long[] jArr2) {
        for (int i6 = 0; i6 < 64; i6++) {
            jArr[i6] = gf2MatrixTimes(jArr2, jArr2[i6]);
        }
    }

    private static long gf2MatrixTimes(long[] jArr, long j6) {
        int i6 = 0;
        long j7 = 0;
        while (j6 != 0) {
            if ((j6 & 1) == 1) {
                j7 ^= jArr[i6];
            }
            j6 >>>= 1;
            i6++;
        }
        return j7;
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
    public void update(int i6) {
        update(new byte[]{(byte) (i6 & 255)}, 1);
    }

    public void update(byte[] bArr, int i6) {
        update(bArr, 0, i6);
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i6, int i7) {
        this.value = ~this.value;
        int i8 = i6;
        int i9 = i7;
        while (i9 >= 8) {
            long[][] jArr = table;
            long[] jArr2 = jArr[7];
            long j6 = this.value;
            this.value = ((((((jArr[6][(int) ((bArr[i8 + 1] & UByte.MAX_VALUE) ^ ((j6 >>> 8) & 255))] ^ jArr2[(int) ((j6 & 255) ^ (bArr[i8] & UByte.MAX_VALUE))]) ^ jArr[5][(int) (((j6 >>> 16) & 255) ^ (bArr[i8 + 2] & UByte.MAX_VALUE))]) ^ jArr[4][(int) (((j6 >>> 24) & 255) ^ (bArr[i8 + 3] & UByte.MAX_VALUE))]) ^ jArr[3][(int) (((j6 >>> 32) & 255) ^ (bArr[i8 + 4] & UByte.MAX_VALUE))]) ^ jArr[2][(int) (((j6 >>> 40) & 255) ^ (bArr[i8 + 5] & UByte.MAX_VALUE))]) ^ jArr[1][(int) ((255 & (j6 >>> 48)) ^ (bArr[i8 + 6] & UByte.MAX_VALUE))]) ^ jArr[0][(int) ((j6 >>> 56) ^ (bArr[i8 + 7] & UByte.MAX_VALUE))];
            i8 += 8;
            i9 -= 8;
        }
        while (i9 > 0) {
            long[] jArr3 = table[0];
            long j7 = this.value;
            this.value = (j7 >>> 8) ^ jArr3[(int) ((bArr[i8] ^ j7) & 255)];
            i8++;
            i9--;
        }
        this.value = ~this.value;
    }
}
