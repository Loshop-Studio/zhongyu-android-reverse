package com.p053ta.p054a.p057c;

import com.umeng.analytics.pro.C1892bw;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.ta.a.c.b */
/* loaded from: classes.dex */
public class C1684b {

    /* renamed from: a */
    private static final char[] f7442a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    private static String m5754a(String str, String str2) {
        try {
            byte[] bArrM5757a = m5757a(str.getBytes(), str2.getBytes());
            return bArrM5757a != null ? m5755a(bArrM5757a) : "0000000000000000";
        } catch (Exception e4) {
            C1688f.m5770a("", e4);
            return "0000000000000000";
        }
    }

    /* renamed from: d */
    public static String m5758d(String str) {
        return m5754a(m5759f(), str);
    }

    /* renamed from: f */
    private static String m5759f() {
        byte[] bytes = "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn".getBytes();
        for (byte b4 = 0; b4 < 32; b4 = (byte) (b4 + 1)) {
            try {
                bytes[b4] = (byte) (bytes[b4] + b4);
            } catch (Exception unused) {
                return null;
            }
        }
        return m5755a(bytes);
    }

    /* renamed from: a */
    private static byte[] m5756a(byte[] bArr) throws NoSuchAlgorithmException {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception e4) {
            C1688f.m5769a("", e4, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    private static String m5755a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i4 = 0; i4 < bArr.length; i4++) {
            char[] cArr = f7442a;
            sb.append(cArr[(bArr[i4] & 240) >>> 4]);
            sb.append(cArr[bArr[i4] & C1892bw.f8538m]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static byte[] m5757a(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        for (int i4 = 0; i4 < 64; i4++) {
            bArr3[i4] = 54;
            bArr4[i4] = 92;
        }
        byte[] bArr5 = new byte[64];
        if (bArr.length > 64) {
            bArr = m5756a(bArr);
        }
        for (int i5 = 0; i5 < bArr.length; i5++) {
            bArr5[i5] = bArr[i5];
        }
        if (bArr.length < 64) {
            for (int length = bArr.length; length < 64; length++) {
                bArr5[length] = 0;
            }
        }
        byte[] bArr6 = new byte[64];
        for (int i6 = 0; i6 < 64; i6++) {
            bArr6[i6] = (byte) (bArr5[i6] ^ bArr3[i6]);
        }
        byte[] bArr7 = new byte[bArr2.length + 64];
        for (int i7 = 0; i7 < 64; i7++) {
            bArr7[i7] = bArr6[i7];
        }
        for (int i8 = 0; i8 < bArr2.length; i8++) {
            bArr7[i8 + 64] = bArr2[i8];
        }
        byte[] bArrM5756a = m5756a(bArr7);
        byte[] bArr8 = new byte[64];
        for (int i9 = 0; i9 < 64; i9++) {
            bArr8[i9] = (byte) (bArr5[i9] ^ bArr4[i9]);
        }
        byte[] bArr9 = new byte[bArrM5756a.length + 64];
        for (int i10 = 0; i10 < 64; i10++) {
            bArr9[i10] = bArr8[i10];
        }
        for (int i11 = 0; i11 < bArrM5756a.length; i11++) {
            bArr9[i11 + 64] = bArrM5756a[i11];
        }
        return m5756a(bArr9);
    }
}
