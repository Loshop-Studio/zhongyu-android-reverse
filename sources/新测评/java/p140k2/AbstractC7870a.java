package p140k2;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okio.Utf8;
import p129j2.AbstractC7787g;

/* renamed from: k2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7870a {
    /* renamed from: a */
    public static byte[] m13387a() {
        return AbstractC7787g.m13174c(new byte[]{33, 83, -50, -89, -84, -114, 80, 99, 10, Utf8.REPLACEMENT_BYTE, 22, -65, -11, 30, 101, -118});
    }

    /* renamed from: b */
    public static byte[] m13388b(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = Integer.valueOf(str.substring(i11, i11 + 2), 16).byteValue();
        }
        return bArr;
    }

    /* renamed from: c */
    public static byte[] m13389c() {
        try {
            byte[] bArrM13393b = AbstractC7871b.m13393b("IUQSvE6r1TfFPdPEjfklLw==".getBytes("UTF-8"), 2);
            if (bArrM13393b != null) {
                return AbstractC7787g.m13174c(bArrM13393b);
            }
        } catch (Exception unused) {
        }
        return new byte[16];
    }

    /* renamed from: d */
    public static byte[] m13390d(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(m13389c()));
        return cipher.doFinal(bArr2);
    }

    /* renamed from: e */
    public static String m13391e(String str) {
        try {
            return new String(m13390d(m13387a(), m13388b(str)));
        } catch (Exception unused) {
            return null;
        }
    }
}
