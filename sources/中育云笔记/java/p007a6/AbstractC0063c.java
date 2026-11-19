package p007a6;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;

/* renamed from: a6.c */
/* loaded from: classes5.dex */
public abstract class AbstractC0063c {

    /* renamed from: a */
    public static boolean f54a = true;

    /* renamed from: b */
    public static boolean f55b = true;

    /* renamed from: a */
    public static SecureRandom m121a() {
        AbstractC0067g.m137b("EncryptUtil", "generateSecureRandomNew ");
        try {
        } catch (NoSuchAlgorithmException unused) {
            AbstractC0067g.m138c("EncryptUtil", "getSecureRandomBytes: NoSuchAlgorithmException");
        }
        SecureRandom instanceStrong = Build.VERSION.SDK_INT >= 26 ? SecureRandom.getInstanceStrong() : null;
        if (instanceStrong == null) {
            try {
                instanceStrong = SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException unused2) {
                AbstractC0067g.m138c("EncryptUtil", "NoSuchAlgorithmException");
                return instanceStrong;
            } catch (Throwable th) {
                if (f55b) {
                    AbstractC0067g.m138c("EncryptUtil", "exception : " + th.getMessage() + " , you should implementation bcprov-jdk15on library");
                    f55b = false;
                }
                return instanceStrong;
            }
        }
        AESEngine aESEngine = new AESEngine();
        byte[] bArr = new byte[32];
        instanceStrong.nextBytes(bArr);
        return new SP800SecureRandomBuilder(instanceStrong, true).setEntropyBitsRequired(384).buildCTR(aESEngine, 256, bArr, false);
    }

    /* renamed from: b */
    public static byte[] m122b(int i10) {
        SecureRandom secureRandomM121a = m121a();
        if (secureRandomM121a == null) {
            return new byte[0];
        }
        try {
            byte[] bArr = new byte[i10];
            secureRandomM121a.nextBytes(bArr);
            return bArr;
        } catch (NullPointerException e10) {
            AbstractC0067g.m138c("EncryptUtil", "secureRandom nextBytes error is : " + e10.getMessage());
            return new byte[0];
        }
    }

    /* renamed from: c */
    public static SecureRandom m123c() {
        if (f54a) {
            return m121a();
        }
        try {
            return Build.VERSION.SDK_INT >= 26 ? SecureRandom.getInstanceStrong() : SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException unused) {
            AbstractC0067g.m138c("EncryptUtil", "genSecureRandom: NoSuchAlgorithmException");
            return null;
        }
    }

    /* renamed from: d */
    public static byte[] m124d(int i10) throws NoSuchAlgorithmException {
        if (f54a) {
            return m122b(i10);
        }
        byte[] bArr = new byte[i10];
        try {
        } catch (NoSuchAlgorithmException unused) {
            AbstractC0067g.m138c("EncryptUtil", "getSecureRandomBytes: NoSuchAlgorithmException");
        }
        SecureRandom instanceStrong = Build.VERSION.SDK_INT >= 26 ? SecureRandom.getInstanceStrong() : null;
        if (instanceStrong == null) {
            try {
                instanceStrong = SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException unused2) {
                AbstractC0067g.m138c("EncryptUtil", "getSecureRandomBytes getInstance: NoSuchAlgorithmException");
                return new byte[0];
            } catch (Exception e10) {
                AbstractC0067g.m138c("EncryptUtil", "getSecureRandomBytes getInstance: exception : " + e10.getMessage());
                return new byte[0];
            }
        }
        instanceStrong.nextBytes(bArr);
        return bArr;
    }

    /* renamed from: e */
    public static String m125e(int i10) {
        return AbstractC0064d.m127a(m124d(i10));
    }

    /* renamed from: f */
    public static void m126f(boolean z10) {
        AbstractC0067g.m139d("EncryptUtil", "setBouncycastleFlag: " + z10);
        f54a = z10;
    }
}
