package com.tendcloud.tenddata;

import com.tendcloud.tenddata.C7902cg;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

/* renamed from: com.tendcloud.tenddata.dh */
/* loaded from: classes5.dex */
final class C7930dh {

    /* renamed from: a */
    private static final int f14694a = 128;

    /* renamed from: b */
    private static final int f14695b = 10000;

    /* renamed from: c */
    private static final String f14696c = "iv";

    /* renamed from: d */
    private static final String f14697d = "salt";

    /* renamed from: e */
    private static final int f14698e = 16;

    /* renamed from: f */
    private static final int f14699f = 32;

    /* renamed from: g */
    private static final String f14700g = "AES/CBC/PKCS5Padding";

    /* renamed from: h */
    private static final String f14701h = "PBKDF2WithHmacSHA1";

    /* renamed from: i */
    private static final String f14702i = "AES";

    /* renamed from: a */
    public static IvParameterSpec m11697a() {
        try {
            C7902cg.b bVar = C7902cg.b.AES_IV_LOCK;
            C7902cg.getFileLock(bVar.toString());
            byte[] bArrM11707a = C7931di.m11707a(f14696c, 16);
            if (bArrM11707a == null) {
                bArrM11707a = m11698a(16);
                C7931di.m11705a(f14696c, bArrM11707a);
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrM11707a);
            C7902cg.releaseFileLock(bVar.toString());
            return ivParameterSpec;
        } catch (Throwable unused) {
            C7902cg.releaseFileLock(C7902cg.b.AES_IV_LOCK.toString());
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m11700b() {
        String string;
        byte[] bArrM11707a = null;
        try {
            C7902cg.b bVar = C7902cg.b.AES_SALT_LOCK;
            C7902cg.getFileLock(bVar.toString());
            bArrM11707a = C7931di.m11707a(f14697d, 32);
            if (bArrM11707a == null || bArrM11707a.length == 0) {
                bArrM11707a = m11698a(32);
                C7931di.m11705a(f14697d, bArrM11707a);
            }
            string = bVar.toString();
        } catch (Throwable unused) {
            string = C7902cg.b.AES_SALT_LOCK.toString();
        }
        C7902cg.releaseFileLock(string);
        return bArrM11707a;
    }

    /* renamed from: a */
    private static byte[] m11698a(int i10) {
        byte[] bArr = new byte[i10];
        C7912cq.m11603b().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: b */
    public static byte[] m11701b(byte[] bArr, SecretKey secretKey, IvParameterSpec ivParameterSpec) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        if (C7912cq.m11605b(19)) {
            str = f14702i;
        } else {
            str = f14700g;
        }
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(2, secretKey, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    /* renamed from: a */
    public static SecretKey m11696a(char[] cArr, byte[] bArr) {
        return SecretKeyFactory.getInstance(f14701h).generateSecret(new PBEKeySpec(cArr, bArr, 10000, 128));
    }

    /* renamed from: a */
    public static byte[] m11699a(byte[] bArr, SecretKey secretKey, IvParameterSpec ivParameterSpec) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        if (C7912cq.m11605b(19)) {
            str = f14702i;
        } else {
            str = f14700g;
        }
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(1, secretKey, ivParameterSpec);
        return cipher.doFinal(bArr);
    }
}
