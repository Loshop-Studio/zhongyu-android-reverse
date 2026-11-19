package com.p053ta.utdid2.p058a.p059a;

/* renamed from: com.ta.utdid2.a.a.b */
/* loaded from: classes.dex */
public class C1690b {
    public static byte[] getBytes(int i4) {
        byte[] bArr = {(byte) ((i >> 8) % 256), (byte) (i % 256), (byte) (i % 256), (byte) (i4 % 256)};
        int i5 = i4 >> 8;
        int i6 = i5 >> 8;
        return bArr;
    }
}
