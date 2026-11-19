package com.umeng.analytics.pro;

import kotlin.UByte;

/* renamed from: com.umeng.analytics.pro.an */
/* loaded from: classes2.dex */
public class C3340an {
    /* renamed from: a */
    public static final boolean m2945a(int i4, int i5) {
        return (i4 & (1 << i5)) != 0;
    }

    /* renamed from: b */
    public static final int m2949b(int i4, int i5) {
        return i4 & (~(1 << i5));
    }

    /* renamed from: a */
    public static final boolean m2946a(long j4, int i4) {
        return (j4 & (1 << i4)) != 0;
    }

    /* renamed from: b */
    public static final long m2950b(long j4, int i4) {
        return j4 & (~(1 << i4));
    }

    /* renamed from: a */
    public static final void m2942a(int i4, byte[] bArr) {
        m2943a(i4, bArr, 0);
    }

    /* renamed from: b */
    public static final byte m2948b(byte b4, int i4) {
        return (byte) m2949b((int) b4, i4);
    }

    /* renamed from: a */
    public static final void m2943a(int i4, byte[] bArr, int i5) {
        bArr[i5] = (byte) ((i4 >> 24) & 255);
        bArr[i5 + 1] = (byte) ((i4 >> 16) & 255);
        bArr[i5 + 2] = (byte) ((i4 >> 8) & 255);
        bArr[i5 + 3] = (byte) (i4 & 255);
    }

    /* renamed from: b */
    public static final short m2951b(short s3, int i4) {
        return (short) m2949b((int) s3, i4);
    }

    /* renamed from: a */
    public static final int m2938a(byte[] bArr) {
        return m2939a(bArr, 0);
    }

    /* renamed from: a */
    public static final int m2939a(byte[] bArr, int i4) {
        return (bArr[i4 + 3] & UByte.MAX_VALUE) | ((bArr[i4] & UByte.MAX_VALUE) << 24) | ((bArr[i4 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i4 + 2] & UByte.MAX_VALUE) << 8);
    }

    /* renamed from: a */
    public static final boolean m2944a(byte b4, int i4) {
        return m2945a((int) b4, i4);
    }

    /* renamed from: a */
    public static final boolean m2947a(short s3, int i4) {
        return m2945a((int) s3, i4);
    }

    /* renamed from: a */
    public static final byte m2936a(byte b4, int i4, boolean z3) {
        return (byte) m2937a((int) b4, i4, z3);
    }

    /* renamed from: a */
    public static final short m2941a(short s3, int i4, boolean z3) {
        return (short) m2937a((int) s3, i4, z3);
    }

    /* renamed from: a */
    public static final int m2937a(int i4, int i5, boolean z3) {
        return z3 ? i4 | (1 << i5) : m2949b(i4, i5);
    }

    /* renamed from: a */
    public static final long m2940a(long j4, int i4, boolean z3) {
        return z3 ? j4 | (1 << i4) : m2950b(j4, i4);
    }
}
