package com.efs.sdk.base.p035a.p046h.p049c;

import com.efs.sdk.base.p035a.p046h.C1329d;
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
/* loaded from: classes.dex */
public final class C1327a {

    /* renamed from: a */
    private static final IvParameterSpec f7121a = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: a */
    public static byte[] m5565a(byte[] bArr, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            SecretKeySpec secretKeySpecM5563a = m5563a(str);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpecM5563a, f7121a);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e4) {
            C1329d.m5573b("efs.base", "aes decrypt error", e4);
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m5566b(byte[] bArr, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            SecretKeySpec secretKeySpecM5563a = m5563a(str);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpecM5563a, f7121a);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e4) {
            C1329d.m5573b("efs.base", "aes encrypt error", e4);
            return null;
        }
    }

    /* renamed from: a */
    private static SecretKeySpec m5563a(String str) {
        return new SecretKeySpec(str.getBytes(), "AES");
    }

    /* renamed from: a */
    public static byte[] m5564a(String str, String str2) {
        try {
            return m5566b(str.getBytes("UTF-8"), str2);
        } catch (UnsupportedEncodingException e4) {
            C1329d.m5573b("efs.base", "getBytes error", e4);
            return null;
        }
    }
}
