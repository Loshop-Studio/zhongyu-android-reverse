package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;

/* renamed from: com.tencent.bugly.proguard.n */
/* loaded from: classes3.dex */
public final class C4125n {

    /* renamed from: a */
    private static final byte[] f3853a;

    /* renamed from: b */
    private static final byte[] f3854b;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i = 0; i < 256; i++) {
            bArr2[i] = bArr[i >>> 4];
            bArr3[i] = bArr[i & 15];
        }
        f3853a = bArr2;
        f3854b = bArr3;
    }

    /* renamed from: a */
    public static boolean m3321a(int i, int i8) {
        return i == i8;
    }

    /* renamed from: a */
    public static boolean m3322a(long j7, long j8) {
        return j7 == j8;
    }

    /* renamed from: a */
    public static boolean m3324a(boolean z8, boolean z9) {
        return z8 == z9;
    }

    /* renamed from: a */
    public static boolean m3323a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static byte[] m3325a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        byte[] bArr = new byte[iPosition];
        System.arraycopy(byteBuffer.array(), 0, bArr, 0, iPosition);
        return bArr;
    }
}
