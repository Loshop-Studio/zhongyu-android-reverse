package com.tendcloud.tenddata;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.tendcloud.tenddata.cm */
/* loaded from: classes5.dex */
public class C7908cm {

    /* renamed from: a */
    private static final String f14595a = "RC4/ECB/NoPadding";

    /* renamed from: b */
    private static final String f14596b = "ARCFOUR";

    /* renamed from: c */
    private static final String f14597c = "r5czusfu0wjcaz4pp01v2k7qte55xc25fngq4ylby2civ230vdy6uy6goz9w4kgfqjk31l8khfzfvbxj7emcprjyy8nngf0r9dvxzwbhm2uw7ljre52jt95lg0knyp8e5c4go44s3z5ciy58h0tuosmwhupa62rdnkeicgdba6w6f0kenp0xac7so8j1vdbjpqwyprx2ouenv22isustwnpltt9ui5plnijd4bq4013o3mzdkllozn26zwds9x38";

    /* renamed from: d */
    private static final byte[] f14598d = f14597c.getBytes();

    /* renamed from: a */
    public static byte[] m11575a(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(f14595a);
        cipher.init(1, new SecretKeySpec(f14598d, f14596b));
        return cipher.doFinal(bArr);
    }

    /* renamed from: b */
    public static byte[] m11577b(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(f14595a);
        cipher.init(2, new SecretKeySpec(f14598d, f14596b));
        return cipher.doFinal(bArr);
    }

    /* renamed from: a */
    public static byte[] m11576a(byte[] bArr, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(f14595a);
        cipher.init(1, new SecretKeySpec(str.getBytes(), f14596b));
        return cipher.doFinal(bArr);
    }

    /* renamed from: b */
    public static byte[] m11578b(byte[] bArr, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(f14595a);
        cipher.init(2, new SecretKeySpec(str.getBytes(), f14596b));
        return cipher.doFinal(bArr);
    }
}
