package p402x5;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p007a6.AbstractC0063c;
import p007a6.AbstractC0067g;

/* renamed from: x5.b */
/* loaded from: classes5.dex */
public abstract class AbstractC11797b {
    /* renamed from: a */
    public static byte[] m26040a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* renamed from: b */
    public static byte[] m26041b(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        byte[] bArrM124d = AbstractC0063c.m124d(12);
        return m26040a(bArrM124d, m26042c(bArr, bArr2, bArrM124d));
    }

    /* renamed from: c */
    public static byte[] m26042c(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr == null) {
            AbstractC0067g.m138c("GCM", "encrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            AbstractC0067g.m138c("GCM", "encrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            AbstractC0067g.m138c("GCM", "encrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            AbstractC0067g.m138c("GCM", "encrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3 == null) {
            AbstractC0067g.m138c("GCM", "encrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 12) {
            AbstractC0067g.m138c("GCM", "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        if (!m26044e()) {
            AbstractC0067g.m138c("GCM", "encrypt 6 build version not higher than 19");
            return new byte[0];
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, m26043d(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e10) {
            AbstractC0067g.m138c("GCM", "GCM encrypt data error" + e10.getMessage());
            return new byte[0];
        } catch (GeneralSecurityException e11) {
            AbstractC0067g.m138c("GCM", "GCM encrypt data error" + e11.getMessage());
            return new byte[0];
        }
    }

    /* renamed from: d */
    public static AlgorithmParameterSpec m26043d(byte[] bArr) {
        return new GCMParameterSpec(128, bArr);
    }

    /* renamed from: e */
    public static boolean m26044e() {
        return true;
    }
}
