package p318r5;

import android.util.Base64;
import anet.channel.request.Request;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import p007a6.AbstractC0064d;

/* renamed from: r5.v */
/* loaded from: classes5.dex */
public abstract class AbstractC10899v {
    /* renamed from: a */
    public static String m23662a(String str, String str2) {
        try {
            return m23663b(str, str2.getBytes(Request.DEFAULT_CHARSET));
        } catch (UnsupportedEncodingException unused) {
            AbstractC10861f1.m23436h("hmsSdk", "Unsupported encoding exception,utf-8");
            return "";
        }
    }

    /* renamed from: b */
    public static String m23663b(String str, byte[] bArr) {
        String str2;
        if (bArr == null || bArr.length == 0) {
            AbstractC10861f1.m23441m("hmsSdk", "encrypt: content is empty or null");
            return "";
        }
        try {
            return AbstractC0064d.m127a(m23665d(bArr, m23664c(Base64.decode(str, 0))));
        } catch (NoSuchAlgorithmException unused) {
            str2 = "encrypt(): getInstance - No such algorithm,transformation";
            AbstractC10861f1.m23441m("hmsSdk", str2);
            return "";
        } catch (InvalidKeySpecException unused2) {
            str2 = "encrypt(): Invalid key specification";
            AbstractC10861f1.m23441m("hmsSdk", str2);
            return "";
        }
    }

    /* renamed from: c */
    public static PublicKey m23664c(byte[] bArr) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
    }

    /* renamed from: d */
    public static byte[] m23665d(byte[] bArr, PublicKey publicKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        String str;
        try {
            if (publicKey == null) {
                throw new UnsupportedEncodingException("The loaded public key is null");
            }
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (UnsupportedEncodingException unused) {
            str = "rsaEncrypt(): getBytes - Unsupported coding format!";
            AbstractC10861f1.m23441m("hmsSdk", str);
            return new byte[0];
        } catch (InvalidKeyException unused2) {
            str = "rsaEncrypt(): init - Invalid key!";
            AbstractC10861f1.m23441m("hmsSdk", str);
            return new byte[0];
        } catch (NoSuchAlgorithmException unused3) {
            str = "rsaEncrypt(): getInstance - No such algorithm,transformation";
            AbstractC10861f1.m23441m("hmsSdk", str);
            return new byte[0];
        } catch (BadPaddingException unused4) {
            str = "rsaEncrypt():False filling parameters!";
            AbstractC10861f1.m23441m("hmsSdk", str);
            return new byte[0];
        } catch (IllegalBlockSizeException unused5) {
            str = "rsaEncrypt(): doFinal - The provided block is not filled with";
            AbstractC10861f1.m23441m("hmsSdk", str);
            return new byte[0];
        } catch (NoSuchPaddingException unused6) {
            str = "rsaEncrypt():  No such filling parameters ";
            AbstractC10861f1.m23441m("hmsSdk", str);
            return new byte[0];
        }
    }
}
