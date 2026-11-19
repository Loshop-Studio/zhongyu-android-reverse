package com.blankj.utilcode.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.blankj.utilcode.util.j */
/* loaded from: classes3.dex */
public abstract class AbstractC4652j {
    /* renamed from: a */
    public static byte[] m2198a(byte[] bArr) {
        return m2201d(bArr, "MD5");
    }

    /* renamed from: b */
    public static String m2199b(String str) {
        return (str == null || str.length() == 0) ? "" : m2200c(str.getBytes());
    }

    /* renamed from: c */
    public static String m2200c(byte[] bArr) {
        return AbstractC4663o0.m2318c(m2198a(bArr));
    }

    /* renamed from: d */
    public static byte[] m2201d(byte[] bArr, String str) throws NoSuchAlgorithmException {
        if (bArr != null && bArr.length > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e6) {
                e6.printStackTrace();
            }
        }
        return null;
    }
}
