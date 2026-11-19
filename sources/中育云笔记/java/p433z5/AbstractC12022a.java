package p433z5;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import anet.channel.request.Request;
import com.huawei.secure.android.common.encrypt.keystore.aes.AesKsParamException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import p007a6.AbstractC0064d;
import p007a6.AbstractC0067g;

/* renamed from: z5.a */
/* loaded from: classes5.dex */
public abstract class AbstractC12022a {

    /* renamed from: a */
    public static Map f28389a = new ConcurrentHashMap();

    /* renamed from: a */
    public static SecretKey m26614a(String str, Boolean bool) throws AesKsParamException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        AbstractC0067g.m139d("GCMKS", "load key");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey(str, null);
            if (key instanceof SecretKey) {
                return (SecretKey) key;
            }
            if (!bool.booleanValue()) {
                return null;
            }
            AbstractC0067g.m139d("GCMKS", "generate key");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
            return keyGenerator.generateKey();
        } catch (IOException e10) {
            AbstractC0067g.m138c("GCMKS", "IOException : " + e10.getMessage());
            throw new AesKsParamException("IOException : " + e10.getMessage());
        } catch (InvalidAlgorithmParameterException e11) {
            AbstractC0067g.m138c("GCMKS", "InvalidAlgorithmParameterException : " + e11.getMessage());
            throw new AesKsParamException("InvalidAlgorithmParameterException : " + e11.getMessage());
        } catch (KeyStoreException e12) {
            AbstractC0067g.m138c("GCMKS", "KeyStoreException : " + e12.getMessage());
            throw new AesKsParamException("KeyStoreException : " + e12.getMessage());
        } catch (NoSuchAlgorithmException e13) {
            AbstractC0067g.m138c("GCMKS", "NoSuchAlgorithmException : " + e13.getMessage());
            throw new AesKsParamException("NoSuchAlgorithmException : " + e13.getMessage());
        } catch (NoSuchProviderException e14) {
            AbstractC0067g.m138c("GCMKS", "NoSuchProviderException : " + e14.getMessage());
            throw new AesKsParamException("NoSuchProviderException : " + e14.getMessage());
        } catch (UnrecoverableKeyException e15) {
            AbstractC0067g.m138c("GCMKS", "UnrecoverableKeyException : " + e15.getMessage());
            throw new AesKsParamException("UnrecoverableKeyException : " + e15.getMessage());
        } catch (CertificateException e16) {
            AbstractC0067g.m138c("GCMKS", "CertificateException : " + e16.getMessage());
            throw new AesKsParamException("CertificateException : " + e16.getMessage());
        } catch (Exception e17) {
            AbstractC0067g.m138c("GCMKS", "Exception: " + e17.getMessage());
            throw new AesKsParamException("Exception : " + e17.getMessage());
        }
    }

    /* renamed from: b */
    public static boolean m26615b() {
        return true;
    }

    /* renamed from: c */
    public static byte[] m26616c(SecretKey secretKey, byte[] bArr) throws AesKsParamException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKey, new GCMParameterSpec(128, bArrCopyOf));
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        } catch (InvalidAlgorithmParameterException e10) {
            AbstractC0067g.m138c("GCMKS", "InvalidAlgorithmParameterException : " + e10.getMessage());
            throw new AesKsParamException("InvalidAlgorithmParameterException : " + e10.getMessage());
        } catch (InvalidKeyException e11) {
            AbstractC0067g.m138c("GCMKS", "InvalidKeyException : " + e11.getMessage());
            throw new AesKsParamException("InvalidKeyException : " + e11.getMessage());
        } catch (NoSuchAlgorithmException e12) {
            AbstractC0067g.m138c("GCMKS", "NoSuchAlgorithmException : " + e12.getMessage());
            throw new AesKsParamException("NoSuchAlgorithmException : " + e12.getMessage());
        } catch (BadPaddingException e13) {
            AbstractC0067g.m138c("GCMKS", "BadPaddingException : " + e13.getMessage());
            throw new AesKsParamException("BadPaddingException : " + e13.getMessage());
        } catch (IllegalBlockSizeException e14) {
            AbstractC0067g.m138c("GCMKS", "IllegalBlockSizeException : " + e14.getMessage());
            throw new AesKsParamException("IllegalBlockSizeException : " + e14.getMessage());
        } catch (NoSuchPaddingException e15) {
            AbstractC0067g.m138c("GCMKS", "NoSuchPaddingException : " + e15.getMessage());
            throw new AesKsParamException("NoSuchPaddingException : " + e15.getMessage());
        } catch (Exception e16) {
            AbstractC0067g.m138c("GCMKS", "Exception: " + e16.getMessage());
            throw new AesKsParamException("Exception: " + e16.getMessage());
        }
    }

    /* renamed from: d */
    public static SecretKey m26617d(String str, Boolean bool) throws AesKsParamException {
        if (TextUtils.isEmpty(str)) {
            throw new AesKsParamException("alias is null");
        }
        if (((SecretKey) f28389a.get(str)) == null) {
            synchronized (AbstractC12022a.class) {
                try {
                    if (((SecretKey) f28389a.get(str)) == null) {
                        SecretKey secretKeyM26614a = m26614a(str, bool);
                        if (secretKeyM26614a == null) {
                            throw new AesKsParamException("AES GCM is decrypt,but alias is null");
                        }
                        f28389a.put(str, secretKeyM26614a);
                    }
                } finally {
                }
            }
        }
        return (SecretKey) f28389a.get(str);
    }

    /* renamed from: e */
    public static byte[] m26618e(SecretKey secretKey, byte[] bArr) throws BadPaddingException, AesKsParamException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArr2 = new byte[0];
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] iv = cipher.getIV();
            if (iv != null && iv.length == 12) {
                byte[] bArrCopyOf = Arrays.copyOf(iv, iv.length + bArrDoFinal.length);
                System.arraycopy(bArrDoFinal, 0, bArrCopyOf, iv.length, bArrDoFinal.length);
                return bArrCopyOf;
            }
            AbstractC0067g.m138c("GCMKS", "IV is invalid.");
            return bArr2;
        } catch (InvalidKeyException e10) {
            AbstractC0067g.m138c("GCMKS", "InvalidKeyException : " + e10.getMessage());
            throw new AesKsParamException("InvalidKeyException : " + e10.getMessage());
        } catch (NoSuchAlgorithmException e11) {
            AbstractC0067g.m138c("GCMKS", "NoSuchAlgorithmException : " + e11.getMessage());
            throw new AesKsParamException("NoSuchAlgorithmException : " + e11.getMessage());
        } catch (BadPaddingException e12) {
            AbstractC0067g.m138c("GCMKS", "BadPaddingException : " + e12.getMessage());
            throw new AesKsParamException("BadPaddingException : " + e12.getMessage());
        } catch (IllegalBlockSizeException e13) {
            AbstractC0067g.m138c("GCMKS", "IllegalBlockSizeException : " + e13.getMessage());
            throw new AesKsParamException("IllegalBlockSizeException : " + e13.getMessage());
        } catch (NoSuchPaddingException e14) {
            AbstractC0067g.m138c("GCMKS", "NoSuchPaddingException : " + e14.getMessage());
            throw new AesKsParamException("NoSuchPaddingException : " + e14.getMessage());
        } catch (Exception e15) {
            AbstractC0067g.m138c("GCMKS", "Exception: " + e15.getMessage());
            throw new AesKsParamException("Exception : " + e15.getMessage());
        }
    }

    /* renamed from: f */
    public static String m26619f(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            AbstractC0067g.m138c("GCMKS", "alias or encrypt content is null");
            return "";
        }
        try {
            return new String(m26620g(str, AbstractC0064d.m128b(str2)), Request.DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e10) {
            AbstractC0067g.m138c("GCMKS", "decrypt: UnsupportedEncodingException : " + e10.getMessage());
            return "";
        }
    }

    /* renamed from: g */
    public static byte[] m26620g(String str, byte[] bArr) {
        SecretKey secretKeyM26617d;
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            AbstractC0067g.m138c("GCMKS", "alias or encrypt content is null");
            return bArr2;
        }
        if (!m26615b()) {
            AbstractC0067g.m138c("GCMKS", "sdk version is too low");
            return bArr2;
        }
        if (bArr.length <= 12) {
            AbstractC0067g.m138c("GCMKS", "Decrypt source data is invalid.");
            return bArr2;
        }
        try {
            secretKeyM26617d = m26617d(str, Boolean.FALSE);
        } catch (AesKsParamException e10) {
            AbstractC0067g.m138c("GCMKS", "e : " + e10.getMessage());
            secretKeyM26617d = null;
        }
        return secretKeyM26617d == null ? bArr2 : m26621h(secretKeyM26617d, bArr);
    }

    /* renamed from: h */
    public static byte[] m26621h(SecretKey secretKey, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (secretKey == null) {
            AbstractC0067g.m138c("GCMKS", "Decrypt secret key is null");
            return bArr2;
        }
        if (bArr == null) {
            AbstractC0067g.m138c("GCMKS", "content is null");
            return bArr2;
        }
        if (!m26615b()) {
            AbstractC0067g.m138c("GCMKS", "sdk version is too low");
            return bArr2;
        }
        if (bArr.length <= 12) {
            AbstractC0067g.m138c("GCMKS", "Decrypt source data is invalid.");
            return bArr2;
        }
        try {
            return m26616c(secretKey, bArr);
        } catch (AesKsParamException e10) {
            AbstractC0067g.m138c("GCMKS", "e : " + e10.getMessage());
            return bArr2;
        }
    }

    /* renamed from: i */
    public static String m26622i(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            AbstractC0067g.m138c("GCMKS", "alias or encrypt content is null");
            return "";
        }
        try {
            return AbstractC0064d.m127a(m26623j(str, str2.getBytes(Request.DEFAULT_CHARSET)));
        } catch (UnsupportedEncodingException e10) {
            AbstractC0067g.m138c("GCMKS", "encrypt: UnsupportedEncodingException : " + e10.getMessage());
            return "";
        }
    }

    /* renamed from: j */
    public static byte[] m26623j(String str, byte[] bArr) {
        SecretKey secretKeyM26617d;
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            AbstractC0067g.m138c("GCMKS", "alias or encrypt content is null");
            return bArr2;
        }
        if (!m26615b()) {
            AbstractC0067g.m138c("GCMKS", "sdk version is too low");
            return bArr2;
        }
        try {
            secretKeyM26617d = m26617d(str, Boolean.TRUE);
        } catch (AesKsParamException e10) {
            AbstractC0067g.m138c("GCMKS", "e : " + e10.getMessage());
            secretKeyM26617d = null;
        }
        return secretKeyM26617d == null ? bArr2 : m26624k(secretKeyM26617d, bArr);
    }

    /* renamed from: k */
    public static byte[] m26624k(SecretKey secretKey, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null) {
            AbstractC0067g.m138c("GCMKS", "content is null");
            return bArr2;
        }
        if (secretKey == null) {
            AbstractC0067g.m138c("GCMKS", "secret key is null");
            return bArr2;
        }
        if (!m26615b()) {
            AbstractC0067g.m138c("GCMKS", "sdk version is too low");
            return bArr2;
        }
        try {
            return m26618e(secretKey, bArr);
        } catch (AesKsParamException e10) {
            AbstractC0067g.m138c("GCMKS", "e : " + e10.getMessage());
            return bArr2;
        }
    }
}
