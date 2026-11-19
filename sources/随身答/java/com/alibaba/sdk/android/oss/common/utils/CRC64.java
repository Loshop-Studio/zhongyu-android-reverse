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
        for (int i9 = 0; i9 < 256; i9++) {
            long j9 = i9;
            for (int i10 = 0; i10 < 8; i10++) {
                j9 = (j9 & 1) == 1 ? (j9 >>> 1) ^ POLY : j9 >>> 1;
            }
            table[0][i9] = j9;
        }
        for (int i11 = 0; i11 < 256; i11++) {
            long j10 = table[0][i11];
            for (int i12 = 1; i12 < 8; i12++) {
                long[][] jArr = table;
                j10 = (j10 >>> 8) ^ jArr[0][(int) (255 & j10)];
                jArr[i12][i11] = j10;
            }
        }
    }

    public static long combine(long j9, long j10, long j11) {
        if (j11 == 0) {
            return j9;
        }
        long[] jArr = new long[64];
        long[] jArr2 = new long[64];
        jArr2[0] = -3932672073523589310L;
        long j12 = 1;
        for (int i9 = 1; i9 < 64; i9++) {
            jArr2[i9] = j12;
            j12 <<= 1;
        }
        gf2MatrixSquare(jArr, jArr2);
        gf2MatrixSquare(jArr2, jArr);
        long j13 = j11;
        do {
            gf2MatrixSquare(jArr, jArr2);
            if ((j13 & 1) == 1) {
                j9 = gf2MatrixTimes(jArr, j9);
            }
            long j14 = j13 >>> 1;
            if (j14 == 0) {
                break;
            }
            gf2MatrixSquare(jArr2, jArr);
            if ((j14 & 1) == 1) {
                j9 = gf2MatrixTimes(jArr2, j9);
            }
            j13 >>>= 2;
        } while (j13 != 0);
        return j9 ^ j10;
    }

    private static void gf2MatrixSquare(long[] jArr, long[] jArr2) {
        for (int i9 = 0; i9 < 64; i9++) {
            jArr[i9] = gf2MatrixTimes(jArr2, jArr2[i9]);
        }
    }

    private static long gf2MatrixTimes(long[] jArr, long j9) {
        int i9 = 0;
        long j10 = 0;
        while (j9 != 0) {
            if ((j9 & 1) == 1) {
                j10 ^= jArr[i9];
            }
            j9 >>>= 1;
            i9++;
        }
        return j10;
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
    public void update(int i9) {
        update(new byte[]{(byte) (i9 & 255)}, 1);
    }

    public void update(byte[] bArr, int i9) {
        update(bArr, 0, i9);
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i9, int i10) {
        this.value = ~this.value;
        int i11 = i9;
        int i12 = i10;
        while (i12 >= 8) {
            long[][] jArr = table;
            long[] jArr2 = jArr[7];
            long j9 = this.value;
            this.value = ((((((jArr[6][(int) ((bArr[i11 + 1] & UByte.MAX_VALUE) ^ ((j9 >>> 8) & 255))] ^ jArr2[(int) ((j9 & 255) ^ (bArr[i11] & UByte.MAX_VALUE))]) ^ jArr[5][(int) (((j9 >>> 16) & 255) ^ (bArr[i11 + 2] & UByte.MAX_VALUE))]) ^ jArr[4][(int) (((j9 >>> 24) & 255) ^ (bArr[i11 + 3] & UByte.MAX_VALUE))]) ^ jArr[3][(int) (((j9 >>> 32) & 255) ^ (bArr[i11 + 4] & UByte.MAX_VALUE))]) ^ jArr[2][(int) (((j9 >>> 40) & 255) ^ (bArr[i11 + 5] & UByte.MAX_VALUE))]) ^ jArr[1][(int) ((255 & (j9 >>> 48)) ^ (bArr[i11 + 6] & UByte.MAX_VALUE))]) ^ jArr[0][(int) ((j9 >>> 56) ^ (bArr[i11 + 7] & UByte.MAX_VALUE))];
            i11 += 8;
            i12 -= 8;
        }
        while (i12 > 0) {
            long[] jArr3 = table[0];
            long j10 = this.value;
            this.value = (j10 >>> 8) ^ jArr3[(int) ((bArr[i11] ^ j10) & 255)];
            i11++;
            i12--;
        }
        this.value = ~this.value;
    }
}
