package com.blankj.utilcode.util;

/* renamed from: com.blankj.utilcode.util.g */
/* loaded from: classes3.dex */
public abstract class AbstractC5363g {

    /* renamed from: a */
    public static final char[] f2704a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    public static final char[] f2705b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m2465a(byte[] bArr) {
        return m2466b(bArr, true);
    }

    /* renamed from: b */
    public static String m2466b(byte[] bArr, boolean z10) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = z10 ? f2704a : f2705b;
        int length = bArr.length;
        if (length <= 0) {
            return "";
        }
        char[] cArr2 = new char[length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 >> 4) & 15];
            i10 += 2;
            cArr2[i11] = cArr[b10 & 15];
        }
        return new String(cArr2);
    }

    /* renamed from: c */
    public static int m2467c(float f10) {
        return AbstractC5372k0.m2550f(f10);
    }
}
