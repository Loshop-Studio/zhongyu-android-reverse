package com.tencent.smtt.utils;

import android.util.Base64;
import com.tencent.smtt.sdk.p058a.C6771a;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.tencent.smtt.utils.q */
/* loaded from: classes4.dex */
public class C6860q {

    /* renamed from: a */
    private static final char[] f6994a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static C6860q f6995b;

    /* renamed from: c */
    private String f6996c;

    /* renamed from: d */
    private String f6997d;

    /* renamed from: e */
    private String f6998e;

    private C6860q() {
        int iNextInt = new Random().nextInt(89999999) + 10000000;
        int iNextInt2 = new Random().nextInt(89999999) + 10000000;
        this.f6998e = String.valueOf(iNextInt);
        this.f6996c = this.f6998e + String.valueOf(iNextInt2);
    }

    /* renamed from: a */
    public static synchronized C6860q m6346a() {
        try {
            if (f6995b == null) {
                f6995b = new C6860q();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6995b;
    }

    /* renamed from: b */
    private String m6347b(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f6994a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: c */
    public String m6351c() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher;
        if (this.f6997d == null) {
            byte[] bytes = this.f6996c.getBytes();
            try {
                try {
                    cipher = Cipher.getInstance("RSA/ECB/NoPadding");
                } catch (Exception e10) {
                    e10.printStackTrace();
                    cipher = null;
                }
            } catch (Exception unused) {
                m6350b();
                cipher = Cipher.getInstance("RSA/ECB/NoPadding");
            }
            cipher.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MCwwDQYJKoZIhvcNAQEBBQADGwAwGAIRAMRB/Q0hTCD+XtnQhpQJefUCAwEAAQ==".getBytes(), 0))));
            this.f6997d = m6347b(cipher.doFinal(bytes));
        }
        return this.f6997d;
    }

    /* renamed from: a */
    public String m6348a(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher;
        byte[] bytes = str.getBytes();
        try {
            try {
                cipher = Cipher.getInstance("RSA/ECB/NoPadding");
            } catch (Exception unused) {
                m6350b();
                cipher = Cipher.getInstance("RSA/ECB/NoPadding");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            cipher = null;
        }
        cipher.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MCwwDQYJKoZIhvcNAQEBBQADGwAwGAIRAMRB/Q0hTCD+XtnQhpQJefUCAwEAAQ==".getBytes(), 0))));
        return m6347b(cipher.doFinal(bytes));
    }

    /* renamed from: b */
    public void m6350b() {
        Security.addProvider((Provider) Class.forName("com.android.org.bouncycastle.jce.provider.BouncyCastleProvider", true, ClassLoader.getSystemClassLoader()).newInstance());
    }

    /* renamed from: a */
    public byte[] m6349a(byte[] bArr) {
        return C6771a.m5983a(this.f6998e.getBytes(), bArr, 1);
    }
}
