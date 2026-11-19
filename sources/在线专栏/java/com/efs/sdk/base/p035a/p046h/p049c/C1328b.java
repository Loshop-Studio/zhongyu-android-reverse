package com.efs.sdk.base.p035a.p046h.p049c;

import android.util.Base64;
import com.efs.sdk.base.p035a.p046h.C1329d;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: com.efs.sdk.base.a.h.c.b */
/* loaded from: classes.dex */
public final class C1328b {
    /* renamed from: a */
    public static String m5568a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11));
    }

    /* renamed from: b */
    public static String m5570b(byte[] bArr) {
        try {
            return new String(Base64.decode(bArr, 11));
        } catch (Throwable th) {
            C1329d.m5573b("efs.base", "decode error", th);
            return "";
        }
    }

    /* renamed from: a */
    public static String m5567a(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        try {
            return String.format(Locale.CHINA, "%032x", new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e4) {
            C1329d.m5573b("efs.base", "md5 error", e4);
            return "";
        }
    }

    /* renamed from: b */
    public static String m5569b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e4) {
            C1329d.m5573b("efs.base", "urlEncode error", e4);
            return "";
        }
    }
}
