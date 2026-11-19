package com.alibaba.sdk.android.emas;

import android.text.TextUtils;
import com.alibaba.sdk.android.tbrest.utils.Base64;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.alibaba.sdk.android.emas.f */
/* loaded from: classes3.dex */
public final class C5597f {

    /* renamed from: a */
    private static final char[] f4056a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m3504a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return Base64.encodeBase64String(m3507a(str, str2));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m3508b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return m3506a(Base64.decode(str2), str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private static String m3509c(String str, String str2) throws NoSuchAlgorithmException {
        if (str == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(str.getBytes());
            return m3505a(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static byte[] m3507a(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(m3509c(str, "MD5").substring(0, 16).getBytes("utf-8"), "AES/ECB/PKCS5Padding");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(1, secretKeySpec);
        return cipher.doFinal(str2.getBytes("utf-8"));
    }

    /* renamed from: a */
    private static String m3506a(byte[] bArr, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(m3509c(str, "MD5").substring(0, 16).getBytes("utf-8"), "AES/ECB/PKCS5Padding");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(2, secretKeySpec);
        return new String(cipher.doFinal(bArr));
    }

    /* renamed from: a */
    private static String m3505a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length * 2);
        for (int i10 = 0; i10 < length; i10++) {
            char[] cArr = f4056a;
            sb2.append(cArr[(bArr[i10] >> 4) & 15]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }
}
