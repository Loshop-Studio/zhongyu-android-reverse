package com.tencent.smtt.utils;

/* renamed from: com.tencent.smtt.utils.c */
/* loaded from: classes4.dex */
public class C6846c {
    /* renamed from: a */
    public static String m6281a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if ((bArr[i10] & 255) < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Long.toString(bArr[i10] & 255, 16));
        }
        return stringBuffer.toString();
    }
}
