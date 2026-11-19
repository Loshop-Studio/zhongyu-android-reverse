package p129j2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: j2.d */
/* loaded from: classes4.dex */
public abstract class AbstractC7784d {

    /* renamed from: a */
    public static final char[] f13422a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m13161a(String str, String str2) {
        try {
            byte[] bArrM13164d = m13164d(str.getBytes(), str2.getBytes());
            return bArrM13164d != null ? m13162b(bArrM13164d) : "0000000000000000";
        } catch (Exception e10) {
            AbstractC7788h.m13179e("", e10);
            return "0000000000000000";
        }
    }

    /* renamed from: b */
    public static String m13162b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            char[] cArr = f13422a;
            sb.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb.append(cArr[bArr[i10] & 15]);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static byte[] m13163c(byte[] bArr) throws NoSuchAlgorithmException {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception e10) {
            AbstractC7788h.m13178d("", e10, new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    public static byte[] m13164d(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        for (int i10 = 0; i10 < 64; i10++) {
            bArr3[i10] = 54;
            bArr4[i10] = 92;
        }
        byte[] bArr5 = new byte[64];
        if (bArr.length > 64) {
            bArr = m13163c(bArr);
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
        byte[] bArrM13163c = m13163c(bArr7);
        byte[] bArr8 = new byte[64];
        for (int i15 = 0; i15 < 64; i15++) {
            bArr8[i15] = (byte) (bArr5[i15] ^ bArr4[i15]);
        }
        byte[] bArr9 = new byte[bArrM13163c.length + 64];
        for (int i16 = 0; i16 < 64; i16++) {
            bArr9[i16] = bArr8[i16];
        }
        for (int i17 = 0; i17 < bArrM13163c.length; i17++) {
            bArr9[i17 + 64] = bArrM13163c[i17];
        }
        return m13163c(bArr9);
    }

    /* renamed from: e */
    public static String m13165e(String str) {
        return m13161a(m13166f(), str);
    }

    /* renamed from: f */
    public static String m13166f() {
        byte[] bytes = "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn".getBytes();
        for (byte b10 = 0; b10 < 32; b10 = (byte) (b10 + 1)) {
            try {
                bytes[b10] = (byte) (bytes[b10] + b10);
            } catch (Exception unused) {
                return null;
            }
        }
        return m13162b(bytes);
    }
}
