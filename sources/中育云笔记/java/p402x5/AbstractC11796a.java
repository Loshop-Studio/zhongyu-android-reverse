package p402x5;

import android.text.TextUtils;
import anet.channel.request.Request;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p007a6.AbstractC0063c;
import p007a6.AbstractC0064d;
import p007a6.AbstractC0067g;

/* renamed from: x5.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11796a {
    /* renamed from: a */
    public static String m26027a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(0, 6) + str.substring(12, 16) + str.substring(26, 32) + str.substring(48);
        } catch (Exception e10) {
            AbstractC0067g.m138c("CBC", "get encryptword exception : " + e10.getMessage());
            return "";
        }
    }

    /* renamed from: b */
    public static String m26028b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return str2.substring(0, 6) + str.substring(0, 6) + str2.substring(6, 10) + str.substring(6, 16) + str2.substring(10, 16) + str.substring(16) + str2.substring(16);
            } catch (Exception e10) {
                AbstractC0067g.m138c("CBC", "mix exception: " + e10.getMessage());
            }
        }
        return "";
    }

    /* renamed from: c */
    public static byte[] m26029c(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            AbstractC0067g.m138c("CBC", "encrypt 5 content is null");
            return new byte[0];
        }
        if (bArr == null) {
            AbstractC0067g.m138c("CBC", "encrypt 5 key is null");
            return new byte[0];
        }
        if (bArr.length < 16) {
            AbstractC0067g.m138c("CBC", "encrypt 5 key error: 5 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr2 == null) {
            AbstractC0067g.m138c("CBC", "encrypt 5 iv is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            AbstractC0067g.m138c("CBC", "encrypt 5 iv error: 5 iv length less than 16 bytes.");
            return new byte[0];
        }
        try {
            return m26039m(str.getBytes(Request.DEFAULT_CHARSET), bArr, bArr2);
        } catch (UnsupportedEncodingException e10) {
            AbstractC0067g.m138c("CBC", " cbc encrypt data error" + e10.getMessage());
            return new byte[0];
        }
    }

    /* renamed from: d */
    public static byte[] m26030d(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* renamed from: e */
    public static String m26031e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(6, 12) + str.substring(16, 26) + str.substring(32, 48);
        } catch (Exception e10) {
            AbstractC0067g.m138c("CBC", "getIv exception : " + e10.getMessage());
            return "";
        }
    }

    /* renamed from: f */
    public static String m26032f(String str, String str2) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            AbstractC0067g.m138c("CBC", "decrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            AbstractC0067g.m138c("CBC", "decrypt 1 key is null");
            return "";
        }
        byte[] bArrM128b = AbstractC0064d.m128b(str2);
        if (bArrM128b.length >= 16) {
            return m26033g(str, bArrM128b);
        }
        AbstractC0067g.m138c("CBC", "decrypt 1 key error: 1 key length less than 16 bytes.");
        return "";
    }

    /* renamed from: g */
    public static String m26033g(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            AbstractC0067g.m138c("CBC", "decrypt 2 content is null");
            return "";
        }
        if (bArr == null) {
            AbstractC0067g.m138c("CBC", "decrypt 2 key is null");
            return "";
        }
        if (bArr.length < 16) {
            AbstractC0067g.m138c("CBC", "decrypt 2 key error: 2 key length less than 16 bytes.");
            return "";
        }
        String strM26031e = m26031e(str);
        String strM26027a = m26027a(str);
        if (TextUtils.isEmpty(strM26031e)) {
            AbstractC0067g.m138c("CBC", "decrypt 2 iv is null");
            return "";
        }
        if (!TextUtils.isEmpty(strM26027a)) {
            return m26034h(strM26027a, bArr, AbstractC0064d.m128b(strM26031e));
        }
        AbstractC0067g.m138c("CBC", "decrypt 2 encrypt content is null");
        return "";
    }

    /* renamed from: h */
    public static String m26034h(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            AbstractC0067g.m138c("CBC", "decrypt 4 content is null");
            return "";
        }
        if (bArr == null) {
            AbstractC0067g.m138c("CBC", "decrypt 4 key is null");
            return "";
        }
        if (bArr.length < 16) {
            AbstractC0067g.m138c("CBC", "decrypt 4 key error: 4 key length less than 16 bytes.");
            return "";
        }
        if (bArr2 == null) {
            AbstractC0067g.m138c("CBC", "decrypt 4 iv is null");
            return "";
        }
        if (bArr2.length < 16) {
            AbstractC0067g.m138c("CBC", "decrypt 4 iv error: 4 iv length less than 16 bytes.");
            return "";
        }
        try {
            return new String(m26035i(AbstractC0064d.m128b(str), bArr, bArr2), Request.DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e10) {
            AbstractC0067g.m138c("CBC", " cbc decrypt data error" + e10.getMessage());
            return "";
        }
    }

    /* renamed from: i */
    public static byte[] m26035i(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr == null) {
            AbstractC0067g.m138c("CBC", "decrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            AbstractC0067g.m138c("CBC", "decrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            AbstractC0067g.m138c("CBC", "decrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            AbstractC0067g.m138c("CBC", "decrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3 == null) {
            AbstractC0067g.m138c("CBC", "decrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 16) {
            AbstractC0067g.m138c("CBC", "decrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e10) {
            AbstractC0067g.m138c("CBC", "NullPointerException: " + e10.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e11) {
            AbstractC0067g.m138c("CBC", "InvalidAlgorithmParameterException: " + e11.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e12) {
            AbstractC0067g.m138c("CBC", "InvalidKeyException: " + e12.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e13) {
            AbstractC0067g.m138c("CBC", "NoSuchAlgorithmException: " + e13.getMessage());
            return new byte[0];
        } catch (BadPaddingException e14) {
            AbstractC0067g.m138c("CBC", "BadPaddingException: " + e14.getMessage());
            AbstractC0067g.m138c("CBC", "key is not right");
            return new byte[0];
        } catch (IllegalBlockSizeException e15) {
            AbstractC0067g.m138c("CBC", "IllegalBlockSizeException: " + e15.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e16) {
            AbstractC0067g.m138c("CBC", "NoSuchPaddingException: " + e16.getMessage());
            return new byte[0];
        }
    }

    /* renamed from: j */
    public static String m26036j(String str, String str2) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str)) {
            AbstractC0067g.m138c("CBC", "encrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            AbstractC0067g.m138c("CBC", "encrypt 1 key is null");
            return "";
        }
        byte[] bArrM128b = AbstractC0064d.m128b(str2);
        if (bArrM128b.length >= 16) {
            return m26037k(str, bArrM128b);
        }
        AbstractC0067g.m138c("CBC", "encrypt 1 key error: 1 key length less than 16 bytes.");
        return "";
    }

    /* renamed from: k */
    public static String m26037k(String str, byte[] bArr) throws NoSuchAlgorithmException {
        if (TextUtils.isEmpty(str)) {
            AbstractC0067g.m138c("CBC", "encrypt 2 content is null");
            return "";
        }
        if (bArr == null) {
            AbstractC0067g.m138c("CBC", "encrypt 2 key is null");
            return "";
        }
        if (bArr.length < 16) {
            AbstractC0067g.m138c("CBC", "encrypt 2 key error: 2 key length less than 16 bytes.");
            return "";
        }
        byte[] bArrM124d = AbstractC0063c.m124d(16);
        byte[] bArrM26029c = m26029c(str, bArr, bArrM124d);
        return (bArrM26029c == null || bArrM26029c.length == 0) ? "" : m26028b(AbstractC0064d.m127a(bArrM124d), AbstractC0064d.m127a(bArrM26029c));
    }

    /* renamed from: l */
    public static byte[] m26038l(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrM124d = AbstractC0063c.m124d(16);
        byte[] bArrM26039m = m26039m(bArr, bArr2, bArrM124d);
        if (!Arrays.equals(bArrM26039m, new byte[0])) {
            return m26030d(bArrM124d, bArrM26039m);
        }
        AbstractC0067g.m138c("CBC", "encrypt encryptContent is null");
        return new byte[0];
    }

    /* renamed from: m */
    public static byte[] m26039m(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr == null) {
            AbstractC0067g.m138c("CBC", "encrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            AbstractC0067g.m138c("CBC", "encrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            AbstractC0067g.m138c("CBC", "encrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            AbstractC0067g.m138c("CBC", "encrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3 == null) {
            AbstractC0067g.m138c("CBC", "encrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 16) {
            AbstractC0067g.m138c("CBC", "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e10) {
            AbstractC0067g.m138c("CBC", "NullPointerException: " + e10.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e11) {
            AbstractC0067g.m138c("CBC", "InvalidAlgorithmParameterException: " + e11.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e12) {
            AbstractC0067g.m138c("CBC", "InvalidKeyException: " + e12.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e13) {
            AbstractC0067g.m138c("CBC", "NoSuchAlgorithmException: " + e13.getMessage());
            return new byte[0];
        } catch (BadPaddingException e14) {
            AbstractC0067g.m138c("CBC", "BadPaddingException: " + e14.getMessage());
            return new byte[0];
        } catch (IllegalBlockSizeException e15) {
            AbstractC0067g.m138c("CBC", "IllegalBlockSizeException: " + e15.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e16) {
            AbstractC0067g.m138c("CBC", "NoSuchPaddingException: " + e16.getMessage());
            return new byte[0];
        }
    }
}
