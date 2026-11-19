package com.alibaba.sdk.android.ams.common.util;

import anet.channel.request.Request;
import com.tendcloud.tenddata.C7863av;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.alibaba.sdk.android.ams.common.util.b */
/* loaded from: classes3.dex */
public class C5583b {

    /* renamed from: a */
    private static final byte[] f4004a = {-128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: b */
    private static final C5583b f4005b = new C5583b();

    /* renamed from: c */
    private static final char[] f4006c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: d */
    private final long[] f4007d = new long[4];

    /* renamed from: e */
    private final long[] f4008e = new long[2];

    /* renamed from: f */
    private final byte[] f4009f = new byte[64];

    /* renamed from: g */
    private final byte[] f4010g = new byte[16];

    private C5583b() {
        m3449b();
    }

    /* renamed from: a */
    public static long m3437a(byte b10) {
        return b10 < 0 ? b10 & C7863av.f14384i : b10;
    }

    /* renamed from: b */
    private long m3446b(long j10, long j11, long j12) {
        return (j10 & j12) | (j11 & (~j12));
    }

    /* renamed from: c */
    private long m3451c(long j10, long j11, long j12) {
        return (j10 ^ j11) ^ j12;
    }

    /* renamed from: d */
    private long m3454d(long j10, long j11, long j12) {
        return (j10 | (~j12)) ^ j11;
    }

    /* renamed from: a */
    private long m3438a(long j10, long j11, long j12) {
        return ((~j10) & j12) | (j11 & j10);
    }

    /* renamed from: b */
    private long m3447b(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        int iM3446b = (int) (j10 + m3446b(j11, j12, j13) + j14 + j16);
        return ((iM3446b >>> ((int) (32 - j15))) | (iM3446b << ((int) j15))) + j11;
    }

    /* renamed from: c */
    private long m3452c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        int iM3451c = (int) (j10 + m3451c(j11, j12, j13) + j14 + j16);
        return ((iM3451c >>> ((int) (32 - j15))) | (iM3451c << ((int) j15))) + j11;
    }

    /* renamed from: d */
    private long m3455d(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        int iM3454d = (int) (j10 + m3454d(j11, j12, j13) + j14 + j16);
        return ((iM3454d >>> ((int) (32 - j15))) | (iM3454d << ((int) j15))) + j11;
    }

    /* renamed from: a */
    private long m3439a(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        int iM3438a = (int) (j10 + m3438a(j11, j12, j13) + j14 + j16);
        return ((iM3438a >>> ((int) (32 - j15))) | (iM3438a << ((int) j15))) + j11;
    }

    /* renamed from: b */
    public static String m3448b(byte b10) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        return new String(new char[]{cArr[(b10 >>> 4) & 15], cArr[b10 & 15]});
    }

    /* renamed from: c */
    private void m3453c() {
        byte[] bArr = new byte[8];
        m3444a(bArr, this.f4008e, 8);
        int i10 = ((int) (this.f4008e[0] >>> 3)) & 63;
        m3442a(f4004a, i10 < 56 ? 56 - i10 : 120 - i10);
        m3442a(bArr, 8);
        m3444a(this.f4010g, this.f4007d, 16);
    }

    /* renamed from: a */
    public static C5583b m3440a() {
        return f4005b;
    }

    /* renamed from: b */
    public String m3457b(String str) {
        m3449b();
        m3442a(str.getBytes(Charset.forName(Request.DEFAULT_CHARSET)), str.length());
        m3453c();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 16; i10++) {
            sb2.append(m3448b(this.f4010g[i10]));
        }
        return sb2.toString();
    }

    /* renamed from: b */
    private void m3449b() {
        long[] jArr = this.f4008e;
        jArr[0] = 0;
        jArr[1] = 0;
        long[] jArr2 = this.f4007d;
        jArr2[0] = 1732584193;
        jArr2[1] = 4023233417L;
        jArr2[2] = 2562383102L;
        jArr2[3] = 271733878;
    }

    /* renamed from: a */
    public String m3456a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            messageDigest = null;
        }
        messageDigest.update(str.getBytes(Charset.forName(Request.DEFAULT_CHARSET)));
        return m3441a(messageDigest.digest());
    }

    /* renamed from: a */
    public static String m3441a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            char[] cArr = f4006c;
            sb2.append(cArr[(b10 & 240) >>> 4]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    private void m3450b(byte[] bArr) {
        long[] jArr = this.f4007d;
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long[] jArr2 = new long[16];
        m3445a(jArr2, bArr, 64);
        long jM3439a = m3439a(j10, j11, j12, j13, jArr2[0], 7L, 3614090360L);
        long jM3439a2 = m3439a(j13, jM3439a, j11, j12, jArr2[1], 12L, 3905402710L);
        long jM3439a3 = m3439a(j12, jM3439a2, jM3439a, j11, jArr2[2], 17L, 606105819L);
        long jM3439a4 = m3439a(j11, jM3439a3, jM3439a2, jM3439a, jArr2[3], 22L, 3250441966L);
        long jM3439a5 = m3439a(jM3439a, jM3439a4, jM3439a3, jM3439a2, jArr2[4], 7L, 4118548399L);
        long jM3439a6 = m3439a(jM3439a2, jM3439a5, jM3439a4, jM3439a3, jArr2[5], 12L, 1200080426L);
        long jM3439a7 = m3439a(jM3439a3, jM3439a6, jM3439a5, jM3439a4, jArr2[6], 17L, 2821735955L);
        long jM3439a8 = m3439a(jM3439a4, jM3439a7, jM3439a6, jM3439a5, jArr2[7], 22L, 4249261313L);
        long jM3439a9 = m3439a(jM3439a5, jM3439a8, jM3439a7, jM3439a6, jArr2[8], 7L, 1770035416L);
        long jM3439a10 = m3439a(jM3439a6, jM3439a9, jM3439a8, jM3439a7, jArr2[9], 12L, 2336552879L);
        long jM3439a11 = m3439a(jM3439a7, jM3439a10, jM3439a9, jM3439a8, jArr2[10], 17L, 4294925233L);
        long jM3439a12 = m3439a(jM3439a8, jM3439a11, jM3439a10, jM3439a9, jArr2[11], 22L, 2304563134L);
        long jM3439a13 = m3439a(jM3439a9, jM3439a12, jM3439a11, jM3439a10, jArr2[12], 7L, 1804603682L);
        long jM3439a14 = m3439a(jM3439a10, jM3439a13, jM3439a12, jM3439a11, jArr2[13], 12L, 4254626195L);
        long jM3439a15 = m3439a(jM3439a11, jM3439a14, jM3439a13, jM3439a12, jArr2[14], 17L, 2792965006L);
        long jM3439a16 = m3439a(jM3439a12, jM3439a15, jM3439a14, jM3439a13, jArr2[15], 22L, 1236535329L);
        long jM3447b = m3447b(jM3439a13, jM3439a16, jM3439a15, jM3439a14, jArr2[1], 5L, 4129170786L);
        long jM3447b2 = m3447b(jM3439a14, jM3447b, jM3439a16, jM3439a15, jArr2[6], 9L, 3225465664L);
        long jM3447b3 = m3447b(jM3439a15, jM3447b2, jM3447b, jM3439a16, jArr2[11], 14L, 643717713L);
        long jM3447b4 = m3447b(jM3439a16, jM3447b3, jM3447b2, jM3447b, jArr2[0], 20L, 3921069994L);
        long jM3447b5 = m3447b(jM3447b, jM3447b4, jM3447b3, jM3447b2, jArr2[5], 5L, 3593408605L);
        long jM3447b6 = m3447b(jM3447b2, jM3447b5, jM3447b4, jM3447b3, jArr2[10], 9L, 38016083L);
        long jM3447b7 = m3447b(jM3447b3, jM3447b6, jM3447b5, jM3447b4, jArr2[15], 14L, 3634488961L);
        long jM3447b8 = m3447b(jM3447b4, jM3447b7, jM3447b6, jM3447b5, jArr2[4], 20L, 3889429448L);
        long jM3447b9 = m3447b(jM3447b5, jM3447b8, jM3447b7, jM3447b6, jArr2[9], 5L, 568446438L);
        long jM3447b10 = m3447b(jM3447b6, jM3447b9, jM3447b8, jM3447b7, jArr2[14], 9L, 3275163606L);
        long jM3447b11 = m3447b(jM3447b7, jM3447b10, jM3447b9, jM3447b8, jArr2[3], 14L, 4107603335L);
        long jM3447b12 = m3447b(jM3447b8, jM3447b11, jM3447b10, jM3447b9, jArr2[8], 20L, 1163531501L);
        long jM3447b13 = m3447b(jM3447b9, jM3447b12, jM3447b11, jM3447b10, jArr2[13], 5L, 2850285829L);
        long jM3447b14 = m3447b(jM3447b10, jM3447b13, jM3447b12, jM3447b11, jArr2[2], 9L, 4243563512L);
        long jM3447b15 = m3447b(jM3447b11, jM3447b14, jM3447b13, jM3447b12, jArr2[7], 14L, 1735328473L);
        long jM3447b16 = m3447b(jM3447b12, jM3447b15, jM3447b14, jM3447b13, jArr2[12], 20L, 2368359562L);
        long jM3452c = m3452c(jM3447b13, jM3447b16, jM3447b15, jM3447b14, jArr2[5], 4L, 4294588738L);
        long jM3452c2 = m3452c(jM3447b14, jM3452c, jM3447b16, jM3447b15, jArr2[8], 11L, 2272392833L);
        long jM3452c3 = m3452c(jM3447b15, jM3452c2, jM3452c, jM3447b16, jArr2[11], 16L, 1839030562L);
        long jM3452c4 = m3452c(jM3447b16, jM3452c3, jM3452c2, jM3452c, jArr2[14], 23L, 4259657740L);
        long jM3452c5 = m3452c(jM3452c, jM3452c4, jM3452c3, jM3452c2, jArr2[1], 4L, 2763975236L);
        long jM3452c6 = m3452c(jM3452c2, jM3452c5, jM3452c4, jM3452c3, jArr2[4], 11L, 1272893353L);
        long jM3452c7 = m3452c(jM3452c3, jM3452c6, jM3452c5, jM3452c4, jArr2[7], 16L, 4139469664L);
        long jM3452c8 = m3452c(jM3452c4, jM3452c7, jM3452c6, jM3452c5, jArr2[10], 23L, 3200236656L);
        long jM3452c9 = m3452c(jM3452c5, jM3452c8, jM3452c7, jM3452c6, jArr2[13], 4L, 681279174L);
        long jM3452c10 = m3452c(jM3452c6, jM3452c9, jM3452c8, jM3452c7, jArr2[0], 11L, 3936430074L);
        long jM3452c11 = m3452c(jM3452c7, jM3452c10, jM3452c9, jM3452c8, jArr2[3], 16L, 3572445317L);
        long jM3452c12 = m3452c(jM3452c8, jM3452c11, jM3452c10, jM3452c9, jArr2[6], 23L, 76029189L);
        long jM3452c13 = m3452c(jM3452c9, jM3452c12, jM3452c11, jM3452c10, jArr2[9], 4L, 3654602809L);
        long jM3452c14 = m3452c(jM3452c10, jM3452c13, jM3452c12, jM3452c11, jArr2[12], 11L, 3873151461L);
        long jM3452c15 = m3452c(jM3452c11, jM3452c14, jM3452c13, jM3452c12, jArr2[15], 16L, 530742520L);
        long jM3452c16 = m3452c(jM3452c12, jM3452c15, jM3452c14, jM3452c13, jArr2[2], 23L, 3299628645L);
        long jM3455d = m3455d(jM3452c13, jM3452c16, jM3452c15, jM3452c14, jArr2[0], 6L, 4096336452L);
        long jM3455d2 = m3455d(jM3452c14, jM3455d, jM3452c16, jM3452c15, jArr2[7], 10L, 1126891415L);
        long jM3455d3 = m3455d(jM3452c15, jM3455d2, jM3455d, jM3452c16, jArr2[14], 15L, 2878612391L);
        long jM3455d4 = m3455d(jM3452c16, jM3455d3, jM3455d2, jM3455d, jArr2[5], 21L, 4237533241L);
        long jM3455d5 = m3455d(jM3455d, jM3455d4, jM3455d3, jM3455d2, jArr2[12], 6L, 1700485571L);
        long jM3455d6 = m3455d(jM3455d2, jM3455d5, jM3455d4, jM3455d3, jArr2[3], 10L, 2399980690L);
        long jM3455d7 = m3455d(jM3455d3, jM3455d6, jM3455d5, jM3455d4, jArr2[10], 15L, 4293915773L);
        long jM3455d8 = m3455d(jM3455d4, jM3455d7, jM3455d6, jM3455d5, jArr2[1], 21L, 2240044497L);
        long jM3455d9 = m3455d(jM3455d5, jM3455d8, jM3455d7, jM3455d6, jArr2[8], 6L, 1873313359L);
        long jM3455d10 = m3455d(jM3455d6, jM3455d9, jM3455d8, jM3455d7, jArr2[15], 10L, 4264355552L);
        long jM3455d11 = m3455d(jM3455d7, jM3455d10, jM3455d9, jM3455d8, jArr2[6], 15L, 2734768916L);
        long jM3455d12 = m3455d(jM3455d8, jM3455d11, jM3455d10, jM3455d9, jArr2[13], 21L, 1309151649L);
        long jM3455d13 = m3455d(jM3455d9, jM3455d12, jM3455d11, jM3455d10, jArr2[4], 6L, 4149444226L);
        long jM3455d14 = m3455d(jM3455d10, jM3455d13, jM3455d12, jM3455d11, jArr2[11], 10L, 3174756917L);
        long jM3455d15 = m3455d(jM3455d11, jM3455d14, jM3455d13, jM3455d12, jArr2[2], 15L, 718787259L);
        long jM3455d16 = m3455d(jM3455d12, jM3455d15, jM3455d14, jM3455d13, jArr2[9], 21L, 3951481745L);
        long[] jArr3 = this.f4007d;
        jArr3[0] = jArr3[0] + jM3455d13;
        jArr3[1] = jArr3[1] + jM3455d16;
        jArr3[2] = jArr3[2] + jM3455d15;
        jArr3[3] = jArr3[3] + jM3455d14;
    }

    /* renamed from: a */
    private void m3442a(byte[] bArr, int i10) {
        int i11;
        int i12;
        byte[] bArr2 = new byte[64];
        long[] jArr = this.f4008e;
        long j10 = jArr[0];
        int i13 = ((int) (j10 >>> 3)) & 63;
        long j11 = i10 << 3;
        long j12 = j10 + j11;
        jArr[0] = j12;
        if (j12 < j11) {
            jArr[1] = jArr[1] + 1;
        }
        jArr[1] = jArr[1] + (i10 >>> 29);
        int i14 = 64 - i13;
        if (i10 >= i14) {
            m3443a(this.f4009f, bArr, i13, 0, i14);
            m3450b(this.f4009f);
            i12 = i14;
            while (i12 + 63 < i10) {
                m3443a(bArr2, bArr, 0, i12, 64);
                m3450b(bArr2);
                i12 += 64;
            }
            i11 = 0;
        } else {
            i11 = i13;
            i12 = 0;
        }
        m3443a(this.f4009f, bArr, i11, i12, i10 - i12);
    }

    /* renamed from: a */
    private void m3443a(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[i10 + i13] = bArr2[i11 + i13];
        }
    }

    /* renamed from: a */
    private void m3444a(byte[] bArr, long[] jArr, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12 += 4) {
            long j10 = jArr[i11];
            bArr[i12] = (byte) (j10 & 255);
            bArr[i12 + 1] = (byte) ((j10 >>> 8) & 255);
            bArr[i12 + 2] = (byte) ((j10 >>> 16) & 255);
            bArr[i12 + 3] = (byte) ((j10 >>> 24) & 255);
            i11++;
        }
    }

    /* renamed from: a */
    private void m3445a(long[] jArr, byte[] bArr, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12 += 4) {
            jArr[i11] = m3437a(bArr[i12]) | (m3437a(bArr[i12 + 1]) << 8) | (m3437a(bArr[i12 + 2]) << 16) | (m3437a(bArr[i12 + 3]) << 24);
            i11++;
        }
    }
}
