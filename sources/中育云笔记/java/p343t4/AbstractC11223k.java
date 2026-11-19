package p343t4;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: t4.k */
/* loaded from: classes5.dex */
public abstract class AbstractC11223k {
    /* renamed from: a */
    public static SecretKey m24968a(C11217e c11217e) {
        if (c11217e == null || !c11217e.m24950a()) {
            throw new IllegalArgumentException("invalid data for generating the key.");
        }
        c11217e.m24956g();
        return new SecretKeySpec(SecretKeyFactory.getInstance(c11217e.m24955f()).generateSecret(new PBEKeySpec(AbstractC11213a.m24933c(m24972e(AbstractC11213a.m24932b(c11217e.m24951b()), AbstractC11213a.m24932b(c11217e.m24952c()), AbstractC11213a.m24932b(c11217e.m24953d()))).toCharArray(), AbstractC11213a.m24932b(c11217e.m24954e()), c11217e.m24956g(), c11217e.m24957h() * 8)).getEncoded(), "AES");
    }

    /* renamed from: b */
    public static byte[] m24969b(SecretKey secretKey, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (secretKey == null || bArr == null) {
            throw new NullPointerException("key or cipherText must not be null.");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 1, 17);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKey, new IvParameterSpec(bArrCopyOfRange));
        return cipher.doFinal(bArr, bArrCopyOfRange.length + 1, (bArr.length - bArrCopyOfRange.length) - 1);
    }

    /* renamed from: c */
    public static byte[] m24970c(byte[] bArr, int i10) {
        if (bArr == null) {
            throw new NullPointerException("bytes must not be null.");
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (i10 < 0) {
                bArr[i11] = (byte) (bArr[i11] << (-i10));
            } else {
                bArr[i11] = (byte) (bArr[i11] >> i10);
            }
        }
        return bArr;
    }

    /* renamed from: d */
    public static byte[] m24971d(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw new NullPointerException("left or right must not be null.");
        }
        if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("left and right must be the same length.");
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    /* renamed from: e */
    public static byte[] m24972e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return m24971d(m24970c(m24971d(m24970c(bArr, -4), bArr2), 6), bArr3);
    }
}
