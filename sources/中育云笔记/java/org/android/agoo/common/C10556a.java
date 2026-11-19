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
/* loaded from: classes6.dex */
public final class C10556a {

    /* renamed from: a */
    private static final byte[] f25307a;

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f25308b = new ThreadLocal<>();

    /* renamed from: c */
    private static final AlgorithmParameterSpec f25309c;

    static {
        byte[] bArr = {82, 22, 50, 44, -16, 124, -40, -114, -87, -40, 37, 23, -56, 23, -33, 75};
        f25307a = bArr;
        f25309c = new IvParameterSpec(bArr);
    }

    /* renamed from: a */
    public static byte[] m22245a(byte[] bArr, SecretKeySpec secretKeySpec, byte[] bArr2) {
        try {
            return m22243a(secretKeySpec, bArr2, 2).doFinal(bArr);
        } catch (BadPaddingException e10) {
            throw new IllegalArgumentException("AES decrypt error:" + e10.getMessage(), e10);
        } catch (IllegalBlockSizeException e11) {
            throw new IllegalArgumentException("AES decrypt error:" + e11.getMessage(), e11);
        }
    }

    /* renamed from: a */
    private static Cipher m22243a(SecretKeySpec secretKeySpec, byte[] bArr, int i10) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipherM22242a = m22242a();
        try {
            cipherM22242a.init(i10, secretKeySpec, new IvParameterSpec(bArr));
            return cipherM22242a;
        } catch (IllegalArgumentException e10) {
            throw new RuntimeException("init Chipher error:" + e10.getMessage(), e10);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new RuntimeException("init Chipher error:" + e11.getMessage(), e11);
        } catch (InvalidKeyException e12) {
            throw new RuntimeException("init Chipher error:" + e12.getMessage(), e12);
        }
    }

    /* renamed from: a */
    private static Cipher m22242a() throws NoSuchPaddingException, NoSuchAlgorithmException {
        ThreadLocal<Cipher> threadLocal = f25308b;
        Cipher cipher = threadLocal.get();
        if (cipher != null) {
            return cipher;
        }
        try {
            Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            threadLocal.set(cipher2);
            return cipher2;
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("get Chipher error:" + e10.getMessage(), e10);
        } catch (NoSuchPaddingException e11) {
            throw new RuntimeException("get Chipher error:" + e11.getMessage(), e11);
        }
    }

    /* renamed from: a */
    public static byte[] m22244a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable th) {
            throw new RuntimeException("md5 value Throwable", th);
        }
    }

    /* renamed from: a */
    public static byte[] m22246a(byte[] bArr, byte[] bArr2) {
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
