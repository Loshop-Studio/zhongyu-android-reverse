package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.an */
/* loaded from: classes.dex */
public class C1856an {
    /* renamed from: a */
    public static final void m6865a(int i4, byte[] bArr) {
        m6866a(i4, bArr, 0);
    }

    /* renamed from: a */
    public static final boolean m6868a(int i4, int i5) {
        return (i4 & (1 << i5)) != 0;
    }

    /* renamed from: a */
    public static final boolean m6869a(long j4, int i4) {
        return (j4 & (1 << i4)) != 0;
    }

    /* renamed from: b */
    public static final byte m6871b(byte b4, int i4) {
        return (byte) m6872b((int) b4, i4);
    }

    /* renamed from: b */
    public static final int m6872b(int i4, int i5) {
        return i4 & (~(1 << i5));
    }

    /* renamed from: b */
    public static final long m6873b(long j4, int i4) {
        return j4 & (~(1 << i4));
    }

    /* renamed from: a */
    public static final void m6866a(int i4, byte[] bArr, int i5) {
        bArr[i5] = (byte) ((i4 >> 24) & 255);
        bArr[i5 + 1] = (byte) ((i4 >> 16) & 255);
        bArr[i5 + 2] = (byte) ((i4 >> 8) & 255);
        bArr[i5 + 3] = (byte) (i4 & 255);
    }

    /* renamed from: b */
    public static final short m6874b(short s3, int i4) {
        return (short) m6872b((int) s3, i4);
    }

    /* renamed from: a */
    public static final int m6861a(byte[] bArr) {
        return m6862a(bArr, 0);
    }

    /* renamed from: a */
    public static final int m6862a(byte[] bArr, int i4) {
        return (bArr[i4 + 3] & 255) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
    }

    /* renamed from: a */
    public static final boolean m6867a(byte b4, int i4) {
        return m6868a((int) b4, i4);
    }

    /* renamed from: a */
    public static final boolean m6870a(short s3, int i4) {
        return m6868a((int) s3, i4);
    }

    /* renamed from: a */
    public static final byte m6859a(byte b4, int i4, boolean z3) {
        return (byte) m6860a((int) b4, i4, z3);
    }

    /* renamed from: a */
    public static final short m6864a(short s3, int i4, boolean z3) {
        return (short) m6860a((int) s3, i4, z3);
    }

    /* renamed from: a */
    public static final int m6860a(int i4, int i5, boolean z3) {
        return z3 ? i4 | (1 << i5) : m6872b(i4, i5);
    }

    /* renamed from: a */
    public static final long m6863a(long j4, int i4, boolean z3) {
        return z3 ? j4 | (1 << i4) : m6873b(j4, i4);
    }
}
