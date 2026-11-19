package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.f */
/* loaded from: classes5.dex */
public final class C7820f {

    /* renamed from: b */
    private static final char[] f14051b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static final byte[] f14050a = new byte[0];

    /* renamed from: a */
    public static String m10839a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f14051b;
            cArr[i11 + 1] = cArr2[b10 & 15];
            cArr[i11] = cArr2[((byte) (b10 >>> 4)) & 15];
        }
        return new String(cArr);
    }
}
