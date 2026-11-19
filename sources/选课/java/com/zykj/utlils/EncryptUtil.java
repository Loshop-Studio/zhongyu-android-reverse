package com.zykj.utlils;

import android.util.Base64;
import com.zykj.exception.SysException;
import com.zykj.message.client.BuildConfig;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes.dex */
public class EncryptUtil {
    private static final String encoding = "UTF-8";

    /* renamed from: iv */
    private static final String f35iv = "z2y0k1j8";
    static String secretKey = "1!QAZ2@WSXCDE#3$4RFVBGT%5^6YHNMJU7&8*IK<.LO9(0P";

    public static String encryptThreeDESECB(String str) throws SysException, InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("desede").generateSecret(new DESedeKeySpec(secretKey.getBytes()));
            Cipher cipher = Cipher.getInstance("desede/CBC/PKCS7Padding");
            cipher.init(1, secretKeyGenerateSecret, new IvParameterSpec(f35iv.getBytes()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes(encoding)), 0);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "加密程中出现异常", e);
        } catch (InvalidAlgorithmParameterException e2) {
            e2.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "加密程中出现异常", e2);
        } catch (InvalidKeyException e3) {
            e3.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "加密程中出现异常", e3);
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "加密程中出现异常", e4);
        } catch (InvalidKeySpecException e5) {
            e5.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "加密程中出现异常", e5);
        } catch (BadPaddingException e6) {
            e6.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "加密程中出现异常", e6);
        } catch (IllegalBlockSizeException e7) {
            e7.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "加密程中出现异常", e7);
        } catch (NoSuchPaddingException e8) {
            e8.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "加密程中出现异常", e8);
        }
    }

    public static String decryptThreeDESECB(String str) throws SysException, InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("desede").generateSecret(new DESedeKeySpec(secretKey.getBytes()));
            Cipher cipher = Cipher.getInstance("desede/CBC/PKCS7Padding");
            cipher.init(2, secretKeyGenerateSecret, new IvParameterSpec(f35iv.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str, 0)), encoding);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "解密程中出现异常", e);
        } catch (InvalidAlgorithmParameterException e2) {
            e2.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "解密程中出现异常", e2);
        } catch (InvalidKeyException e3) {
            e3.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "解密程中出现异常", e3);
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "解密程中出现异常", e4);
        } catch (InvalidKeySpecException e5) {
            e5.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "解密程中出现异常", e5);
        } catch (BadPaddingException e6) {
            e6.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "解密程中出现异常", e6);
        } catch (IllegalBlockSizeException e7) {
            e7.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "解密程中出现异常", e7);
        } catch (NoSuchPaddingException e8) {
            e8.printStackTrace();
            throw new SysException(BuildConfig.FLAVOR, "解密程中出现异常", e8);
        }
    }
}
