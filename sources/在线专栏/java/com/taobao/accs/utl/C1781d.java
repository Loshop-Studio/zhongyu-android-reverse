package com.taobao.accs.utl;

import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: com.taobao.accs.utl.d */
/* loaded from: classes.dex */
public final class C1781d {

    /* renamed from: a */
    private static final byte[] f7832a;

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f7833b = new ThreadLocal<>();

    /* renamed from: c */
    private static final AlgorithmParameterSpec f7834c;

    static {
        byte[] bArr = {82, 22, 50, 44, -16, 124, -40, -114, -87, -40, 37, 23, -56, 23, -33, 75};
        f7832a = bArr;
        f7834c = new IvParameterSpec(bArr);
    }

    /* renamed from: a */
    public static byte[] m6143a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable th) {
            throw new RuntimeException("md5 value Throwable", th);
        }
    }
}
