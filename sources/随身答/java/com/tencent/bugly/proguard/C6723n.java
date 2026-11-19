package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;

/* renamed from: com.tencent.bugly.proguard.n */
/* loaded from: classes4.dex */
public final class C6723n {

    /* renamed from: a */
    private static final byte[] f6208a;

    /* renamed from: b */
    private static final byte[] f6209b;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i9 = 0; i9 < 256; i9++) {
            bArr2[i9] = bArr[i9 >>> 4];
            bArr3[i9] = bArr[i9 & 15];
        }
        f6208a = bArr2;
        f6209b = bArr3;
    }

    /* renamed from: a */
    public static boolean m5404a(int i9, int i10) {
        return i9 == i10;
    }

    /* renamed from: a */
    public static boolean m5405a(long j9, long j10) {
        return j9 == j10;
    }

    /* renamed from: a */
    public static boolean m5407a(boolean z9, boolean z10) {
        return z9 == z10;
    }

    /* renamed from: a */
    public static boolean m5406a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static byte[] m5408a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        byte[] bArr = new byte[iPosition];
        System.arraycopy(byteBuffer.array(), 0, bArr, 0, iPosition);
        return bArr;
    }
}
