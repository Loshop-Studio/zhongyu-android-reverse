package com.alibaba.sdk.android.ams.common.util;

import com.umeng.analytics.pro.C1892bw;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.alibaba.sdk.android.ams.common.util.b */
/* loaded from: classes.dex */
public class C1108b {

    /* renamed from: a */
    private static final byte[] f6519a = {-128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: b */
    private static final C1108b f6520b = new C1108b();

    /* renamed from: c */
    private static final char[] f6521c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: d */
    private final long[] f6522d = new long[4];

    /* renamed from: e */
    private final long[] f6523e = new long[2];

    /* renamed from: f */
    private final byte[] f6524f = new byte[64];

    /* renamed from: g */
    private final byte[] f6525g = new byte[16];

    private C1108b() {
        m5048b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* renamed from: a */
    public static long m5036a(byte b4) {
        byte b5 = b4;
        if (b4 < 0) {
            b5 = b4 & 255;
        }
        return b5;
    }

    /* renamed from: a */
    private long m5037a(long j4, long j5, long j6) {
        return ((~j4) & j6) | (j5 & j4);
    }

    /* renamed from: a */
    private long m5038a(long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        int iM5037a = (int) (m5037a(j5, j6, j7) + j8 + j10 + j4);
        return ((iM5037a >>> ((int) (32 - j9))) | (iM5037a << ((int) j9))) + j5;
    }

    /* renamed from: a */
    public static C1108b m5039a() {
        return f6520b;
    }

    /* renamed from: a */
    public static String m5040a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b4 : bArr) {
            char[] cArr = f6521c;
            sb.append(cArr[(b4 & 240) >>> 4]);
            sb.append(cArr[b4 & C1892bw.f8538m]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m5041a(byte[] bArr, int i4) {
        int i5;
        byte[] bArr2 = new byte[64];
        long[] jArr = this.f6523e;
        int i6 = ((int) (jArr[0] >>> 3)) & 63;
        long j4 = i4 << 3;
        long j5 = jArr[0] + j4;
        jArr[0] = j5;
        if (j5 < j4) {
            jArr[1] = jArr[1] + 1;
        }
        jArr[1] = jArr[1] + (i4 >>> 29);
        int i7 = 64 - i6;
        if (i4 >= i7) {
            m5042a(this.f6524f, bArr, i6, 0, i7);
            m5049b(this.f6524f);
            while (i7 + 63 < i4) {
                m5042a(bArr2, bArr, 0, i7, 64);
                m5049b(bArr2);
                i7 += 64;
            }
            i5 = i7;
            i6 = 0;
        } else {
            i5 = 0;
        }
        m5042a(this.f6524f, bArr, i6, i5, i4 - i5);
    }

    /* renamed from: a */
    private void m5042a(byte[] bArr, byte[] bArr2, int i4, int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            bArr[i4 + i7] = bArr2[i5 + i7];
        }
    }

    /* renamed from: a */
    private void m5043a(byte[] bArr, long[] jArr, int i4) {
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6 += 4) {
            bArr[i6] = (byte) (jArr[i5] & 255);
            bArr[i6 + 1] = (byte) ((jArr[i5] >>> 8) & 255);
            bArr[i6 + 2] = (byte) ((jArr[i5] >>> 16) & 255);
            bArr[i6 + 3] = (byte) ((jArr[i5] >>> 24) & 255);
            i5++;
        }
    }

    /* renamed from: a */
    private void m5044a(long[] jArr, byte[] bArr, int i4) {
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6 += 4) {
            jArr[i5] = m5036a(bArr[i6]) | (m5036a(bArr[i6 + 1]) << 8) | (m5036a(bArr[i6 + 2]) << 16) | (m5036a(bArr[i6 + 3]) << 24);
            i5++;
        }
    }

    /* renamed from: b */
    private long m5045b(long j4, long j5, long j6) {
        return (j4 & j6) | (j5 & (~j6));
    }

    /* renamed from: b */
    private long m5046b(long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        int iM5045b = (int) (m5045b(j5, j6, j7) + j8 + j10 + j4);
        return ((iM5045b >>> ((int) (32 - j9))) | (iM5045b << ((int) j9))) + j5;
    }

    /* renamed from: b */
    public static String m5047b(byte b4) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        return new String(new char[]{cArr[(b4 >>> 4) & 15], cArr[b4 & C1892bw.f8538m]});
    }

    /* renamed from: b */
    private void m5048b() {
        long[] jArr = this.f6523e;
        jArr[0] = 0;
        jArr[1] = 0;
        long[] jArr2 = this.f6522d;
        jArr2[0] = 1732584193;
        jArr2[1] = 4023233417L;
        jArr2[2] = 2562383102L;
        jArr2[3] = 271733878;
    }

    /* renamed from: b */
    private void m5049b(byte[] bArr) {
        long[] jArr = this.f6522d;
        long j4 = jArr[0];
        long j5 = jArr[1];
        long j6 = jArr[2];
        long j7 = jArr[3];
        long[] jArr2 = new long[16];
        m5044a(jArr2, bArr, 64);
        long jM5038a = m5038a(j4, j5, j6, j7, jArr2[0], 7L, 3614090360L);
        long jM5038a2 = m5038a(j7, jM5038a, j5, j6, jArr2[1], 12L, 3905402710L);
        long jM5038a3 = m5038a(j6, jM5038a2, jM5038a, j5, jArr2[2], 17L, 606105819L);
        long jM5038a4 = m5038a(j5, jM5038a3, jM5038a2, jM5038a, jArr2[3], 22L, 3250441966L);
        long jM5038a5 = m5038a(jM5038a, jM5038a4, jM5038a3, jM5038a2, jArr2[4], 7L, 4118548399L);
        long jM5038a6 = m5038a(jM5038a2, jM5038a5, jM5038a4, jM5038a3, jArr2[5], 12L, 1200080426L);
        long jM5038a7 = m5038a(jM5038a3, jM5038a6, jM5038a5, jM5038a4, jArr2[6], 17L, 2821735955L);
        long jM5038a8 = m5038a(jM5038a4, jM5038a7, jM5038a6, jM5038a5, jArr2[7], 22L, 4249261313L);
        long jM5038a9 = m5038a(jM5038a5, jM5038a8, jM5038a7, jM5038a6, jArr2[8], 7L, 1770035416L);
        long jM5038a10 = m5038a(jM5038a6, jM5038a9, jM5038a8, jM5038a7, jArr2[9], 12L, 2336552879L);
        long jM5038a11 = m5038a(jM5038a7, jM5038a10, jM5038a9, jM5038a8, jArr2[10], 17L, 4294925233L);
        long jM5038a12 = m5038a(jM5038a8, jM5038a11, jM5038a10, jM5038a9, jArr2[11], 22L, 2304563134L);
        long jM5038a13 = m5038a(jM5038a9, jM5038a12, jM5038a11, jM5038a10, jArr2[12], 7L, 1804603682L);
        long jM5038a14 = m5038a(jM5038a10, jM5038a13, jM5038a12, jM5038a11, jArr2[13], 12L, 4254626195L);
        long jM5038a15 = m5038a(jM5038a11, jM5038a14, jM5038a13, jM5038a12, jArr2[14], 17L, 2792965006L);
        long jM5038a16 = m5038a(jM5038a12, jM5038a15, jM5038a14, jM5038a13, jArr2[15], 22L, 1236535329L);
        long jM5046b = m5046b(jM5038a13, jM5038a16, jM5038a15, jM5038a14, jArr2[1], 5L, 4129170786L);
        long jM5046b2 = m5046b(jM5038a14, jM5046b, jM5038a16, jM5038a15, jArr2[6], 9L, 3225465664L);
        long jM5046b3 = m5046b(jM5038a15, jM5046b2, jM5046b, jM5038a16, jArr2[11], 14L, 643717713L);
        long jM5046b4 = m5046b(jM5038a16, jM5046b3, jM5046b2, jM5046b, jArr2[0], 20L, 3921069994L);
        long jM5046b5 = m5046b(jM5046b, jM5046b4, jM5046b3, jM5046b2, jArr2[5], 5L, 3593408605L);
        long jM5046b6 = m5046b(jM5046b2, jM5046b5, jM5046b4, jM5046b3, jArr2[10], 9L, 38016083L);
        long jM5046b7 = m5046b(jM5046b3, jM5046b6, jM5046b5, jM5046b4, jArr2[15], 14L, 3634488961L);
        long jM5046b8 = m5046b(jM5046b4, jM5046b7, jM5046b6, jM5046b5, jArr2[4], 20L, 3889429448L);
        long jM5046b9 = m5046b(jM5046b5, jM5046b8, jM5046b7, jM5046b6, jArr2[9], 5L, 568446438L);
        long jM5046b10 = m5046b(jM5046b6, jM5046b9, jM5046b8, jM5046b7, jArr2[14], 9L, 3275163606L);
        long jM5046b11 = m5046b(jM5046b7, jM5046b10, jM5046b9, jM5046b8, jArr2[3], 14L, 4107603335L);
        long jM5046b12 = m5046b(jM5046b8, jM5046b11, jM5046b10, jM5046b9, jArr2[8], 20L, 1163531501L);
        long jM5046b13 = m5046b(jM5046b9, jM5046b12, jM5046b11, jM5046b10, jArr2[13], 5L, 2850285829L);
        long jM5046b14 = m5046b(jM5046b10, jM5046b13, jM5046b12, jM5046b11, jArr2[2], 9L, 4243563512L);
        long jM5046b15 = m5046b(jM5046b11, jM5046b14, jM5046b13, jM5046b12, jArr2[7], 14L, 1735328473L);
        long jM5046b16 = m5046b(jM5046b12, jM5046b15, jM5046b14, jM5046b13, jArr2[12], 20L, 2368359562L);
        long jM5051c = m5051c(jM5046b13, jM5046b16, jM5046b15, jM5046b14, jArr2[5], 4L, 4294588738L);
        long jM5051c2 = m5051c(jM5046b14, jM5051c, jM5046b16, jM5046b15, jArr2[8], 11L, 2272392833L);
        long jM5051c3 = m5051c(jM5046b15, jM5051c2, jM5051c, jM5046b16, jArr2[11], 16L, 1839030562L);
        long jM5051c4 = m5051c(jM5046b16, jM5051c3, jM5051c2, jM5051c, jArr2[14], 23L, 4259657740L);
        long jM5051c5 = m5051c(jM5051c, jM5051c4, jM5051c3, jM5051c2, jArr2[1], 4L, 2763975236L);
        long jM5051c6 = m5051c(jM5051c2, jM5051c5, jM5051c4, jM5051c3, jArr2[4], 11L, 1272893353L);
        long jM5051c7 = m5051c(jM5051c3, jM5051c6, jM5051c5, jM5051c4, jArr2[7], 16L, 4139469664L);
        long jM5051c8 = m5051c(jM5051c4, jM5051c7, jM5051c6, jM5051c5, jArr2[10], 23L, 3200236656L);
        long jM5051c9 = m5051c(jM5051c5, jM5051c8, jM5051c7, jM5051c6, jArr2[13], 4L, 681279174L);
        long jM5051c10 = m5051c(jM5051c6, jM5051c9, jM5051c8, jM5051c7, jArr2[0], 11L, 3936430074L);
        long jM5051c11 = m5051c(jM5051c7, jM5051c10, jM5051c9, jM5051c8, jArr2[3], 16L, 3572445317L);
        long jM5051c12 = m5051c(jM5051c8, jM5051c11, jM5051c10, jM5051c9, jArr2[6], 23L, 76029189L);
        long jM5051c13 = m5051c(jM5051c9, jM5051c12, jM5051c11, jM5051c10, jArr2[9], 4L, 3654602809L);
        long jM5051c14 = m5051c(jM5051c10, jM5051c13, jM5051c12, jM5051c11, jArr2[12], 11L, 3873151461L);
        long jM5051c15 = m5051c(jM5051c11, jM5051c14, jM5051c13, jM5051c12, jArr2[15], 16L, 530742520L);
        long jM5051c16 = m5051c(jM5051c12, jM5051c15, jM5051c14, jM5051c13, jArr2[2], 23L, 3299628645L);
        long jM5054d = m5054d(jM5051c13, jM5051c16, jM5051c15, jM5051c14, jArr2[0], 6L, 4096336452L);
        long jM5054d2 = m5054d(jM5051c14, jM5054d, jM5051c16, jM5051c15, jArr2[7], 10L, 1126891415L);
        long jM5054d3 = m5054d(jM5051c15, jM5054d2, jM5054d, jM5051c16, jArr2[14], 15L, 2878612391L);
        long jM5054d4 = m5054d(jM5051c16, jM5054d3, jM5054d2, jM5054d, jArr2[5], 21L, 4237533241L);
        long jM5054d5 = m5054d(jM5054d, jM5054d4, jM5054d3, jM5054d2, jArr2[12], 6L, 1700485571L);
        long jM5054d6 = m5054d(jM5054d2, jM5054d5, jM5054d4, jM5054d3, jArr2[3], 10L, 2399980690L);
        long jM5054d7 = m5054d(jM5054d3, jM5054d6, jM5054d5, jM5054d4, jArr2[10], 15L, 4293915773L);
        long jM5054d8 = m5054d(jM5054d4, jM5054d7, jM5054d6, jM5054d5, jArr2[1], 21L, 2240044497L);
        long jM5054d9 = m5054d(jM5054d5, jM5054d8, jM5054d7, jM5054d6, jArr2[8], 6L, 1873313359L);
        long jM5054d10 = m5054d(jM5054d6, jM5054d9, jM5054d8, jM5054d7, jArr2[15], 10L, 4264355552L);
        long jM5054d11 = m5054d(jM5054d7, jM5054d10, jM5054d9, jM5054d8, jArr2[6], 15L, 2734768916L);
        long jM5054d12 = m5054d(jM5054d8, jM5054d11, jM5054d10, jM5054d9, jArr2[13], 21L, 1309151649L);
        long jM5054d13 = m5054d(jM5054d9, jM5054d12, jM5054d11, jM5054d10, jArr2[4], 6L, 4149444226L);
        long jM5054d14 = m5054d(jM5054d10, jM5054d13, jM5054d12, jM5054d11, jArr2[11], 10L, 3174756917L);
        long jM5054d15 = m5054d(jM5054d11, jM5054d14, jM5054d13, jM5054d12, jArr2[2], 15L, 718787259L);
        long jM5054d16 = m5054d(jM5054d12, jM5054d15, jM5054d14, jM5054d13, jArr2[9], 21L, 3951481745L);
        long[] jArr3 = this.f6522d;
        jArr3[0] = jArr3[0] + jM5054d13;
        jArr3[1] = jArr3[1] + jM5054d16;
        jArr3[2] = jArr3[2] + jM5054d15;
        jArr3[3] = jArr3[3] + jM5054d14;
    }

    /* renamed from: c */
    private long m5050c(long j4, long j5, long j6) {
        return (j4 ^ j5) ^ j6;
    }

    /* renamed from: c */
    private long m5051c(long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        int iM5050c = (int) (m5050c(j5, j6, j7) + j8 + j10 + j4);
        return ((iM5050c >>> ((int) (32 - j9))) | (iM5050c << ((int) j9))) + j5;
    }

    /* renamed from: c */
    private void m5052c() {
        byte[] bArr = new byte[8];
        m5043a(bArr, this.f6523e, 8);
        int i4 = ((int) (this.f6523e[0] >>> 3)) & 63;
        m5041a(f6519a, i4 < 56 ? 56 - i4 : 120 - i4);
        m5041a(bArr, 8);
        m5043a(this.f6525g, this.f6522d, 16);
    }

    /* renamed from: d */
    private long m5053d(long j4, long j5, long j6) {
        return (j4 | (~j6)) ^ j5;
    }

    /* renamed from: d */
    private long m5054d(long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        int iM5053d = (int) (m5053d(j5, j6, j7) + j8 + j10 + j4);
        return ((iM5053d >>> ((int) (32 - j9))) | (iM5053d << ((int) j9))) + j5;
    }

    /* renamed from: a */
    public String m5055a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
            messageDigest = null;
        }
        messageDigest.update(str.getBytes(Charset.forName("UTF-8")));
        return m5040a(messageDigest.digest());
    }

    /* renamed from: b */
    public String m5056b(String str) {
        m5048b();
        m5041a(str.getBytes(Charset.forName("UTF-8")), str.length());
        m5052c();
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < 16; i4++) {
            sb.append(m5047b(this.f6525g[i4]));
        }
        return sb.toString();
    }
}
