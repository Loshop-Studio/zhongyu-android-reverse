package com.taobao.accs.utl;

import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: com.taobao.accs.utl.d */
/* loaded from: classes5.dex */
public final class C7678d {

    /* renamed from: a */
    private static final byte[] f13230a;

    /* renamed from: b */
    private static final ThreadLocal<Cipher> f13231b = new ThreadLocal<>();

    /* renamed from: c */
    private static final AlgorithmParameterSpec f13232c;

    static {
        byte[] bArr = {82, 22, 50, 44, -16, 124, -40, -114, -87, -40, 37, 23, -56, 23, -33, 75};
        f13230a = bArr;
        f13232c = new IvParameterSpec(bArr);
    }

    /* renamed from: a */
    public static byte[] m10169a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable th) {
            throw new RuntimeException("md5 value Throwable", th);
        }
    }
}
