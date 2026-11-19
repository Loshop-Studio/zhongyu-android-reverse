package com.efs.sdk.base.p039a.p050h.p053c;

import com.efs.sdk.base.p039a.p050h.C5697d;
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
/* loaded from: classes3.dex */
public final class C5695a {

    /* renamed from: a */
    private static final IvParameterSpec f4755a = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: a */
    public static byte[] m4175a(byte[] bArr, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            SecretKeySpec secretKeySpecM4173a = m4173a(str);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpecM4173a, f4755a);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e10) {
            C5697d.m4183b("efs.base", "aes decrypt error", e10);
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m4176b(byte[] bArr, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            SecretKeySpec secretKeySpecM4173a = m4173a(str);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpecM4173a, f4755a);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e10) {
            C5697d.m4183b("efs.base", "aes encrypt error", e10);
            return null;
        }
    }

    /* renamed from: a */
    private static SecretKeySpec m4173a(String str) {
        return new SecretKeySpec(str.getBytes(), "AES");
    }

    /* renamed from: a */
    public static byte[] m4174a(String str, String str2) {
        try {
            return m4176b(str.getBytes("UTF-8"), str2);
        } catch (UnsupportedEncodingException e10) {
            C5697d.m4183b("efs.base", "getBytes error", e10);
            return null;
        }
    }
}
