package com.tencent.smtt.utils;

import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

/* renamed from: com.tencent.smtt.utils.p */
/* loaded from: classes4.dex */
public class C6859p {

    /* renamed from: b */
    private static String f6988b = "";

    /* renamed from: c */
    private static byte[] f6989c;

    /* renamed from: g */
    private static String f6991g;

    /* renamed from: d */
    private Cipher f6992d;

    /* renamed from: e */
    private Cipher f6993e;

    /* renamed from: a */
    protected static final char[] f6987a = "0123456789abcdef".toCharArray();

    /* renamed from: f */
    private static C6859p f6990f = null;

    private C6859p() throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        this.f6992d = null;
        this.f6993e = null;
        f6991g = String.valueOf(new Random().nextInt(89999999) + 10000000) + String.valueOf(new Random().nextInt(89999999) + 10000000) + String.valueOf(new Random().nextInt(89999999) + 10000000);
        String str = "00000000";
        for (int i10 = 0; i10 < 12; i10++) {
            str = str + String.valueOf(new Random().nextInt(89999999) + 10000000);
        }
        f6989c = (str + f6991g).getBytes();
        this.f6992d = Cipher.getInstance("RSA/ECB/NoPadding");
        this.f6992d.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDcEQ3TCNWPBqgIiY7WQ/IqTOTTV2w8aZ/GPm68FK0fAJBemZKtYR3Li46VJ+Hwnor7ZpQnblGWPFaLv5JoPqvavgB0GInuhm+T+syPs1mw0uPLWaqwvZsCfoaIvUuxy5xHJgmWARrK4/9pHyDxRlZte0PCIoR1ko5B8lVVH1X1dQIDAQAB".getBytes(), 0))));
        f6988b = m6341b(this.f6992d.doFinal(f6989c));
        SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(f6991g.getBytes()));
        Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
        this.f6993e = cipher;
        cipher.init(1, secretKeyGenerateSecret);
    }

    /* renamed from: a */
    public static C6859p m6339a() {
        try {
            if (f6990f == null) {
                f6990f = new C6859p();
            }
            return f6990f;
        } catch (Exception e10) {
            f6990f = null;
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static String m6342c() {
        return f6991g;
    }

    /* renamed from: b */
    public String m6344b() {
        return f6988b;
    }

    /* renamed from: b */
    public static String m6341b(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f6987a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public byte[] m6343a(byte[] bArr) {
        return this.f6993e.doFinal(bArr);
    }

    /* renamed from: c */
    public byte[] m6345c(byte[] bArr) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(f6991g.getBytes()));
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(2, secretKeyGenerateSecret);
            return cipher.doFinal(bArr);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m6340a(byte[] bArr, String str) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(str.getBytes()));
        Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
        cipher.init(1, secretKeyGenerateSecret);
        return cipher.doFinal(bArr);
    }
}
