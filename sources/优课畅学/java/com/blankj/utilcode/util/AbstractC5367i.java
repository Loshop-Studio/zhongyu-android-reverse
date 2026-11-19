package com.blankj.utilcode.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.blankj.utilcode.util.i */
/* loaded from: classes3.dex */
public abstract class AbstractC5367i {
    /* renamed from: a */
    public static byte[] m2486a(byte[] bArr) {
        return m2489d(bArr, "MD5");
    }

    /* renamed from: b */
    public static String m2487b(String str) {
        return (str == null || str.length() == 0) ? "" : m2488c(str.getBytes());
    }

    /* renamed from: c */
    public static String m2488c(byte[] bArr) {
        return AbstractC5372k0.m2546b(m2486a(bArr));
    }

    /* renamed from: d */
    public static byte[] m2489d(byte[] bArr, String str) throws NoSuchAlgorithmException {
        if (bArr != null && bArr.length > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }
}
