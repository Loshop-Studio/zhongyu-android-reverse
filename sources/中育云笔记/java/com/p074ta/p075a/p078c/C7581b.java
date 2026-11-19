package com.p074ta.p075a.p078c;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.ta.a.c.b */
/* loaded from: classes5.dex */
public class C7581b {

    /* renamed from: a */
    private static final char[] f12840a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    private static String m9780a(String str, String str2) {
        try {
            byte[] bArrM9783a = m9783a(str.getBytes(), str2.getBytes());
            return bArrM9783a != null ? m9781a(bArrM9783a) : "0000000000000000";
        } catch (Exception e10) {
            C7585f.m9796a("", e10);
            return "0000000000000000";
        }
    }

    /* renamed from: d */
    public static String m9784d(String str) {
        return m9780a(m9785f(), str);
    }

    /* renamed from: f */
    private static String m9785f() {
        byte[] bytes = "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn".getBytes();
        for (byte b10 = 0; b10 < 32; b10 = (byte) (b10 + 1)) {
            try {
                bytes[b10] = (byte) (bytes[b10] + b10);
            } catch (Exception unused) {
                return null;
            }
        }
        return m9781a(bytes);
    }

    /* renamed from: a */
    private static byte[] m9782a(byte[] bArr) throws NoSuchAlgorithmException {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception e10) {
            C7585f.m9795a("", e10, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    private static String m9781a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            char[] cArr = f12840a;
            sb2.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }

    /* renamed from: a */
    private static byte[] m9783a(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        for (int i10 = 0; i10 < 64; i10++) {
            bArr3[i10] = 54;
            bArr4[i10] = 92;
        }
        byte[] bArr5 = new byte[64];
        if (bArr.length > 64) {
            bArr = m9782a(bArr);
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr5[i11] = bArr[i11];
        }
        if (bArr.length < 64) {
            for (int length = bArr.length; length < 64; length++) {
                bArr5[length] = 0;
            }
        }
        byte[] bArr6 = new byte[64];
        for (int i12 = 0; i12 < 64; i12++) {
            bArr6[i12] = (byte) (bArr5[i12] ^ bArr3[i12]);
        }
        byte[] bArr7 = new byte[bArr2.length + 64];
        for (int i13 = 0; i13 < 64; i13++) {
            bArr7[i13] = bArr6[i13];
        }
        for (int i14 = 0; i14 < bArr2.length; i14++) {
            bArr7[i14 + 64] = bArr2[i14];
        }
        byte[] bArrM9782a = m9782a(bArr7);
        byte[] bArr8 = new byte[64];
        for (int i15 = 0; i15 < 64; i15++) {
            bArr8[i15] = (byte) (bArr5[i15] ^ bArr4[i15]);
        }
        byte[] bArr9 = new byte[bArrM9782a.length + 64];
        for (int i16 = 0; i16 < 64; i16++) {
            bArr9[i16] = bArr8[i16];
        }
        for (int i17 = 0; i17 < bArrM9782a.length; i17++) {
            bArr9[i17 + 64] = bArrM9782a[i17];
        }
        return m9782a(bArr9);
    }
}
