package p270v2;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;

/* renamed from: v2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9753a {

    /* renamed from: a */
    public static final byte[] f17261a = {10, 1, 11, 5, 4, 15, 7, 9, 23, 3, 1, 6, 8, 12, 13, 91};

    /* renamed from: b */
    public static long f17262b = 614400;

    /* renamed from: c */
    public static long f17263c = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;

    /* renamed from: d */
    public static long f17264d = 204800;

    /* renamed from: e */
    public static String f17265e = "umeng+0123456789";

    /* renamed from: a */
    public static String m16335a(String str) {
        return "https://" + str;
    }

    /* renamed from: b */
    public static String m16336b(String str) {
        return "https://" + str;
    }

    /* renamed from: c */
    public static String m16337c(byte[] bArr) {
        String str = "";
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & UByte.MAX_VALUE);
            if (hexString.length() == 1) {
                str = str + "0";
            }
            str = str + hexString;
        }
        return str;
    }

    /* renamed from: d */
    public static String m16338d(Throwable th) throws IOException {
        String string = null;
        if (th == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                cause.printStackTrace(printWriter);
            }
            string = stringWriter.toString();
            printWriter.close();
            stringWriter.close();
            return string;
        } catch (Exception unused) {
            return string;
        }
    }

    /* renamed from: e */
    public static byte[] m16339e(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(f17261a));
        return cipher.doFinal(bArr);
    }

    /* renamed from: f */
    public static byte[] m16340f(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(f17261a));
        return cipher.doFinal(bArr);
    }

    /* renamed from: g */
    public static String m16341g(String str) throws NoSuchAlgorithmException {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(bytes);
            return m16337c(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static byte[] m16342h(byte[] bArr) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m16343i(long j9, long j10) {
        return j9 > j10;
    }

    /* renamed from: j */
    public static byte[] m16344j(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length % 2 != 0) {
            return null;
        }
        byte[] bArr = new byte[length / 2];
        int i9 = 0;
        while (i9 < length) {
            int i10 = i9 + 2;
            bArr[i9 / 2] = (byte) Integer.valueOf(str.substring(i9, i10), 16).intValue();
            i9 = i10;
        }
        return bArr;
    }

    /* renamed from: k */
    public static String m16345k(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            stringBuffer.append(String.format("%02X", Byte.valueOf(b10)));
        }
        return stringBuffer.toString().toLowerCase(Locale.US);
    }
}
