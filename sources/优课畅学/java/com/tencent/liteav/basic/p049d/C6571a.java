package com.tencent.liteav.basic.p049d;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.tencent.liteav.basic.d.a */
/* loaded from: classes4.dex */
public final class C6571a {

    /* renamed from: a */
    private static String f5285a = "RSA";

    /* renamed from: a */
    public static byte[] m4873a(byte[] bArr, PrivateKey privateKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, privateKey);
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int blockSize = 0;
        while (true) {
            int i10 = length - blockSize;
            if (i10 <= 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byteArrayOutputStream.write(i10 >= cipher.getBlockSize() ? cipher.doFinal(bArr, blockSize, cipher.getBlockSize()) : cipher.doFinal(bArr, blockSize, i10));
            blockSize += cipher.getBlockSize();
        }
    }

    /* renamed from: a */
    public static PrivateKey m4872a(byte[] bArr) {
        return KeyFactory.getInstance(f5285a).generatePrivate(new PKCS8EncodedKeySpec(bArr));
    }
}
