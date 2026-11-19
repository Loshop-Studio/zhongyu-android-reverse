package com.efs.sdk.base.p020a.p031h.p034c;

import com.efs.sdk.base.p020a.p031h.C2957d;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.efs.sdk.base.a.h.c.a */
/* loaded from: classes2.dex */
public final class C2955a {

    /* renamed from: a */
    private static final IvParameterSpec f1151a = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: a */
    public static byte[] m2206a(byte[] bArr, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            SecretKeySpec secretKeySpecM2204a = m2204a(str);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpecM2204a, f1151a);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e4) {
            C2957d.m2214b("efs.base", "aes decrypt error", e4);
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m2207b(byte[] bArr, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            SecretKeySpec secretKeySpecM2204a = m2204a(str);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpecM2204a, f1151a);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e4) {
            C2957d.m2214b("efs.base", "aes encrypt error", e4);
            return null;
        }
    }

    /* renamed from: a */
    private static SecretKeySpec m2204a(String str) {
        return new SecretKeySpec(str.getBytes(), "AES");
    }

    /* renamed from: a */
    public static byte[] m2205a(String str, String str2) {
        try {
            return m2207b(str.getBytes("UTF-8"), str2);
        } catch (UnsupportedEncodingException e4) {
            C2957d.m2214b("efs.base", "getBytes error", e4);
            return null;
        }
    }
}
