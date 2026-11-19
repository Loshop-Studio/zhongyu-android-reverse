package com.efs.sdk.base.p020a.p031h.p034c;

import android.util.Base64;
import com.efs.sdk.base.p020a.p031h.C2957d;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: com.efs.sdk.base.a.h.c.b */
/* loaded from: classes2.dex */
public final class C2956b {
    /* renamed from: a */
    public static String m2209a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11));
    }

    /* renamed from: b */
    public static String m2211b(byte[] bArr) {
        try {
            return new String(Base64.decode(bArr, 11));
        } catch (Throwable th) {
            C2957d.m2214b("efs.base", "decode error", th);
            return "";
        }
    }

    /* renamed from: a */
    public static String m2208a(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        try {
            return String.format(Locale.CHINA, "%032x", new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e4) {
            C2957d.m2214b("efs.base", "md5 error", e4);
            return "";
        }
    }

    /* renamed from: b */
    public static String m2210b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e4) {
            C2957d.m2214b("efs.base", "urlEncode error", e4);
            return "";
        }
    }
}
