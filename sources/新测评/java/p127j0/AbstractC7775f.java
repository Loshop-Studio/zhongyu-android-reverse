package p127j0;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: j0.f */
/* loaded from: classes3.dex */
public abstract class AbstractC7775f {

    /* renamed from: a */
    public static char[] f13413a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static byte[] m13122a(byte[] bArr) throws NoSuchAlgorithmException {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static String m13123b(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrM13122a = m13122a(bArr);
        return bArrM13122a != null ? m13124c(bArrM13122a) : "0000000000000000";
    }

    /* renamed from: c */
    public static String m13124c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb.append(f13413a[(bArr[i10] & 240) >>> 4]);
            sb.append(f13413a[bArr[i10] & 15]);
        }
        return sb.toString();
    }
}
