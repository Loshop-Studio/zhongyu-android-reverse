package p418y5;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import p007a6.AbstractC0067g;

/* renamed from: y5.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11912a {

    /* renamed from: a */
    public static final String f28227a = "PBKDF2";

    /* renamed from: a */
    public static byte[] m26446a(char[] cArr, byte[] bArr, int i10, int i11, boolean z10) {
        if (cArr == null || cArr.length <= 0) {
            AbstractC0067g.m138c(f28227a, "pbkdf password is empty.");
            return new byte[0];
        }
        if (bArr == null || bArr.length <= 0) {
            AbstractC0067g.m138c(f28227a, "pbkdf salt is empty.");
            return new byte[0];
        }
        if (bArr.length < 16) {
            AbstractC0067g.m138c(f28227a, "pbkdf salt parameter length is not enough, length must be more than 16.");
            return new byte[0];
        }
        if (i10 < 1000) {
            AbstractC0067g.m138c(f28227a, "pbkdf iterations parameter count is less than 1000.");
            return new byte[0];
        }
        if (i11 >= 256) {
            return m26448c(cArr, bArr, i10, i11, z10);
        }
        AbstractC0067g.m138c(f28227a, "pbkdf bytes parameter count is less than 256.");
        return new byte[0];
    }

    /* renamed from: b */
    public static byte[] m26447b(char[] cArr, byte[] bArr, int i10, int i11) {
        return m26446a(cArr, bArr, i10, i11, false);
    }

    /* renamed from: c */
    public static byte[] m26448c(char[] cArr, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return (z10 ? SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256") : SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")).generateSecret(new PBEKeySpec(cArr, bArr, i10, i11)).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e10) {
            AbstractC0067g.m138c(f28227a, "pbkdf exception : " + e10.getMessage());
            return new byte[0];
        }
    }
}
