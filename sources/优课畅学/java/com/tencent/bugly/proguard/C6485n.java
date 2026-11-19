package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;

/* renamed from: com.tencent.bugly.proguard.n */
/* loaded from: classes4.dex */
public final class C6485n {

    /* renamed from: a */
    private static final byte[] f4974a;

    /* renamed from: b */
    private static final byte[] f4975b;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i10 = 0; i10 < 256; i10++) {
            bArr2[i10] = bArr[i10 >>> 4];
            bArr3[i10] = bArr[i10 & 15];
        }
        f4974a = bArr2;
        f4975b = bArr3;
    }

    /* renamed from: a */
    public static boolean m4585a(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: a */
    public static boolean m4586a(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: a */
    public static boolean m4588a(boolean z10, boolean z11) {
        return z10 == z11;
    }

    /* renamed from: a */
    public static boolean m4587a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static byte[] m4589a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        byte[] bArr = new byte[iPosition];
        System.arraycopy(byteBuffer.array(), 0, bArr, 0, iPosition);
        return bArr;
    }
}
