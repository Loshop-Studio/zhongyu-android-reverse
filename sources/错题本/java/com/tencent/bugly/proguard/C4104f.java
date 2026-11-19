package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.f */
/* loaded from: classes3.dex */
public final class C4104f {

    /* renamed from: b */
    private static final char[] f3815b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static final byte[] f3814a = new byte[0];

    /* renamed from: a */
    public static String m3245a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b6 = bArr[i];
            int i8 = i * 2;
            char[] cArr2 = f3815b;
            cArr[i8 + 1] = cArr2[b6 & 15];
            cArr[i8] = cArr2[((byte) (b6 >>> 4)) & 15];
        }
        return new String(cArr);
    }
}
