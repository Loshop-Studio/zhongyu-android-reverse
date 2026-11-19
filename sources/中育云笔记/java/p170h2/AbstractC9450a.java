package p170h2;

import android.util.Base64;
import android.util.Log;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: h2.a */
/* loaded from: classes3.dex */
public abstract class AbstractC9450a {

    /* renamed from: a */
    public static final String f21863a = AbstractC9450a.class.getSimpleName() + " --> ";

    /* renamed from: b */
    public static final Charset f21864b = StandardCharsets.UTF_8;

    /* renamed from: a */
    public static byte[] m18631a(String str) {
        return Base64.decode(str, 2);
    }

    /* renamed from: b */
    public static String m18632b(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    /* renamed from: c */
    public static String m18633c(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.init(2, m18635e(str2));
            return new String(cipher.doFinal(m18631a(str)), f21864b);
        } catch (Exception e10) {
            m18636f(e10);
            return null;
        }
    }

    /* renamed from: d */
    public static String m18634d(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.init(1, m18635e(str2));
            return m18632b(cipher.doFinal(str.getBytes(f21864b)));
        } catch (Exception e10) {
            m18636f(e10);
            return null;
        }
    }

    /* renamed from: e */
    public static SecretKeySpec m18635e(String str) {
        return new SecretKeySpec(m18637g(str, 16, "0").getBytes(f21864b), "AES");
    }

    /* renamed from: f */
    public static void m18636f(Exception exc) {
        exc.printStackTrace();
        String str = f21863a;
        Log.e(str, str + exc);
    }

    /* renamed from: g */
    public static String m18637g(String str, int i10, String str2) {
        int length = str.length();
        if (length >= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        for (int i11 = 0; i11 < i10 - length; i11++) {
            sb2.append(str2);
        }
        return sb2.toString();
    }
}
