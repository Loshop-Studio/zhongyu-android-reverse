package com.tencent.smtt.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.tencent.smtt.utils.o */
/* loaded from: classes4.dex */
public class C6858o {
    /* renamed from: a */
    public static String m6338a(String str) throws NoSuchAlgorithmException {
        if (str == null) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            return C6846c.m6281a(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }
}
