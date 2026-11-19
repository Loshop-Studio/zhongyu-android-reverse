package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;

/* renamed from: com.tencent.bugly.proguard.n */
/* loaded from: classes3.dex */
public final class C5840n {

    /* renamed from: a */
    private static final byte[] f4352a;

    /* renamed from: b */
    private static final byte[] f4353b;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i6 = 0; i6 < 256; i6++) {
            bArr2[i6] = bArr[i6 >>> 4];
            bArr3[i6] = bArr[i6 & 15];
        }
        f4352a = bArr2;
        f4353b = bArr3;
    }

    /* renamed from: a */
    public static boolean m4230a(int i6, int i7) {
        return i6 == i7;
    }

    /* renamed from: a */
    public static boolean m4231a(long j6, long j7) {
        return j6 == j7;
    }

    /* renamed from: a */
    public static boolean m4233a(boolean z6, boolean z7) {
        return z6 == z7;
    }

    /* renamed from: a */
    public static boolean m4232a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static byte[] m4234a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        byte[] bArr = new byte[iPosition];
        System.arraycopy(byteBuffer.array(), 0, bArr, 0, iPosition);
        return bArr;
    }
}
