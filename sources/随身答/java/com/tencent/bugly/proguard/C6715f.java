package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.f */
/* loaded from: classes4.dex */
public final class C6715f {

    /* renamed from: b */
    private static final char[] f6186b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static final byte[] f6185a = new byte[0];

    /* renamed from: a */
    public static String m5328a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i9 = 0; i9 < bArr.length; i9++) {
            byte b10 = bArr[i9];
            int i10 = i9 * 2;
            char[] cArr2 = f6186b;
            cArr[i10 + 1] = cArr2[b10 & 15];
            cArr[i10] = cArr2[((byte) (b10 >>> 4)) & 15];
        }
        return new String(cArr);
    }
}
