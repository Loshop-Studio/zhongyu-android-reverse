package org.android.agoo.common;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: org.android.agoo.common.a */
/* loaded from: classes.dex */
public final class C2956a {

    /* renamed from: a */
    private static final byte[] f11425a;

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f11426b = new ThreadLocal<>();

    /* renamed from: c */
    private static final AlgorithmParameterSpec f11427c;

    static {
        byte[] bArr = {82, 22, 50, 44, -16, 124, -40, -114, -87, -40, 37, 23, -56, 23, -33, 75};
        f11425a = bArr;
        f11427c = new IvParameterSpec(bArr);
    }

    /* renamed from: a */
    public static byte[] m10027a(byte[] bArr, SecretKeySpec secretKeySpec, byte[] bArr2) throws IllegalArgumentException {
        try {
            return m10025a(secretKeySpec, bArr2, 2).doFinal(bArr);
        } catch (BadPaddingException e4) {
            throw new IllegalArgumentException("AES decrypt error:" + e4.getMessage(), e4);
        } catch (IllegalBlockSizeException e5) {
            throw new IllegalArgumentException("AES decrypt error:" + e5.getMessage(), e5);
        }
    }

    /* renamed from: a */
    private static Cipher m10025a(SecretKeySpec secretKeySpec, byte[] bArr, int i4) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipherM10024a = m10024a();
        try {
            cipherM10024a.init(i4, secretKeySpec, new IvParameterSpec(bArr));
            return cipherM10024a;
        } catch (IllegalArgumentException e4) {
            throw new RuntimeException("init Chipher error:" + e4.getMessage(), e4);
        } catch (InvalidAlgorithmParameterException e5) {
            throw new RuntimeException("init Chipher error:" + e5.getMessage(), e5);
        } catch (InvalidKeyException e6) {
            throw new RuntimeException("init Chipher error:" + e6.getMessage(), e6);
        }
    }

    /* renamed from: a */
    private static Cipher m10024a() throws NoSuchPaddingException, NoSuchAlgorithmException {
        ThreadLocal<Cipher> threadLocal = f11426b;
        Cipher cipher = threadLocal.get();
        if (cipher == null) {
            try {
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                threadLocal.set(cipher);
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException("get Chipher error:" + e4.getMessage(), e4);
            } catch (NoSuchPaddingException e5) {
                throw new RuntimeException("get Chipher error:" + e5.getMessage(), e5);
            }
        }
        return cipher;
    }

    /* renamed from: a */
    public static byte[] m10026a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable th) {
            throw new RuntimeException("md5 value Throwable", th);
        }
    }

    /* renamed from: a */
    public static byte[] m10028a(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA1");
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            return mac.doFinal(bArr2);
        } catch (Throwable th) {
            throw new RuntimeException("HmacSHA1 Throwable", th);
        }
    }
}
