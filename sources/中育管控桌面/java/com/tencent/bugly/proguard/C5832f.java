package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.f */
/* loaded from: classes3.dex */
public final class C5832f {

    /* renamed from: b */
    private static final char[] f4330b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static final byte[] f4329a = new byte[0];

    /* renamed from: a */
    public static String m4154a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i6 = 0; i6 < bArr.length; i6++) {
            byte b7 = bArr[i6];
            int i7 = i6 * 2;
            char[] cArr2 = f4330b;
            cArr[i7 + 1] = cArr2[b7 & 15];
            cArr[i7] = cArr2[((byte) (b7 >>> 4)) & 15];
        }
        return new String(cArr);
    }
}
