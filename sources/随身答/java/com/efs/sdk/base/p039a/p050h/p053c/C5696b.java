package com.efs.sdk.base.p039a.p050h.p053c;

import android.util.Base64;
import com.efs.sdk.base.p039a.p050h.C5697d;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: com.efs.sdk.base.a.h.c.b */
/* loaded from: classes3.dex */
public final class C5696b {
    /* renamed from: a */
    public static String m4178a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11));
    }

    /* renamed from: b */
    public static String m4180b(byte[] bArr) {
        try {
            return new String(Base64.decode(bArr, 11));
        } catch (Throwable th) {
            C5697d.m4183b("efs.base", "decode error", th);
            return "";
        }
    }

    /* renamed from: a */
    public static String m4177a(String str) {
        if (str != null && str.length() > 0) {
            try {
                return String.format(Locale.CHINA, "%032x", new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())));
            } catch (NoSuchAlgorithmException e10) {
                C5697d.m4183b("efs.base", "md5 error", e10);
            }
        }
        return "";
    }

    /* renamed from: b */
    public static String m4179b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C5697d.m4183b("efs.base", "urlEncode error", e10);
            return "";
        }
    }
}
