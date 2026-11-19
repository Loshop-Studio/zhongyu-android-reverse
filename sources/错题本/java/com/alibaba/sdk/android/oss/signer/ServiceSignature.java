package com.alibaba.sdk.android.oss.signer;

import android.support.v4.media.AbstractC0037f;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public abstract class ServiceSignature {
    public static ServiceSignature create() {
        return new HmacSHA1Signature();
    }

    public abstract byte[] computeHash(byte[] bArr, byte[] bArr2);

    public abstract String computeSignature(String str, String str2);

    public abstract String getAlgorithm();

    public abstract String getVersion();

    public byte[] sign(byte[] bArr, byte[] bArr2, Mac mac, Object obj, String str) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac2;
        if (mac == null) {
            try {
                synchronized (obj) {
                    if (mac == null) {
                        try {
                            mac = Mac.getInstance(str);
                        } finally {
                        }
                    }
                }
            } catch (InvalidKeyException e) {
                throw new RuntimeException("Invalid key: " + bArr, e);
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(AbstractC0037f.m85j("Unsupported algorithm: ", str), e4);
            }
        }
        try {
            mac2 = (Mac) mac.clone();
        } catch (CloneNotSupportedException unused) {
            mac2 = Mac.getInstance(str);
        }
        mac2.init(new SecretKeySpec(bArr, str));
        return mac2.doFinal(bArr2);
    }

    public static ServiceSignature create(String str) {
        if ("HmacSHA256".equals(str)) {
            return new HmacSHA256Signature();
        }
        if ("HmacSHA1".equals(str)) {
            return new HmacSHA1Signature();
        }
        throw new RuntimeException(AbstractC0037f.m85j("Unsupported algorithm: ", str));
    }
}
