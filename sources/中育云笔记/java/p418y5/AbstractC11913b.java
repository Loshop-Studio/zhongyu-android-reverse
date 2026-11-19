package p418y5;

import android.text.TextUtils;
import anet.channel.request.Request;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p007a6.AbstractC0064d;
import p007a6.AbstractC0067g;

/* renamed from: y5.b */
/* loaded from: classes5.dex */
public abstract class AbstractC11913b {

    /* renamed from: a */
    public static final String f28228a = "SHA";

    /* renamed from: b */
    public static final String[] f28229b = {"SHA-256", "SHA-384", "SHA-512"};

    /* renamed from: a */
    public static boolean m26449a(String str) {
        for (String str2 : f28229b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static String m26450b(String str) {
        return m26451c(str, "SHA-256");
    }

    /* renamed from: c */
    public static String m26451c(String str, String str2) throws UnsupportedEncodingException {
        byte[] bytes;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            AbstractC0067g.m138c(f28228a, "content or algorithm is null.");
            return "";
        }
        if (!m26449a(str2)) {
            AbstractC0067g.m138c(f28228a, "algorithm is not safe or legal");
            return "";
        }
        try {
            bytes = str.getBytes(Request.DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException unused) {
            bytes = new byte[0];
            AbstractC0067g.m138c(f28228a, "Error in generate SHA UnsupportedEncodingException");
        }
        return AbstractC0064d.m127a(m26452d(bytes, str2));
    }

    /* renamed from: d */
    public static byte[] m26452d(byte[] bArr, String str) throws NoSuchAlgorithmException {
        if (bArr == null || TextUtils.isEmpty(str)) {
            AbstractC0067g.m138c(f28228a, "content or algorithm is null.");
            return new byte[0];
        }
        if (!m26449a(str)) {
            AbstractC0067g.m138c(f28228a, "algorithm is not safe or legal");
            return new byte[0];
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            AbstractC0067g.m138c(f28228a, "Error in generate SHA NoSuchAlgorithmException");
            return new byte[0];
        }
    }
}
