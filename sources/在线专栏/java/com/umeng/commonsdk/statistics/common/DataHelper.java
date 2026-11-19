package com.umeng.commonsdk.statistics.common;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import com.umeng.analytics.pro.C1892bw;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.android.agoo.message.MessageService;

/* loaded from: classes.dex */
public class DataHelper {

    /* renamed from: iv */
    private static final byte[] f9351iv = {10, 1, 11, 5, 4, C1892bw.f8538m, 7, 9, 23, 3, 1, 6, 8, 12, C1892bw.f8536k, 91};
    public static long ENVELOPE_EXTRA_LENGTH = 614400;
    public static long ENVELOPE_ENTITY_RAW_LENGTH_MAX = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
    public static long ENVELOPE_LENGTH_MAX = 204800;
    private static String UMENG_PLUS = "umeng+0123456789";

    public static String assembleStatelessURL(String str) {
        return "https://" + str;
    }

    public static String assembleURL(String str) {
        return "https://" + str;
    }

    static String bytes2Hex(byte[] bArr) {
        String str = "";
        for (byte b4 : bArr) {
            String hexString = Integer.toHexString(b4 & 255);
            if (hexString.length() == 1) {
                str = str + MessageService.MSG_DB_READY_REPORT;
            }
            str = str + hexString;
        }
        return str;
    }

    public static String convertExceptionToString(Throwable th) throws IOException {
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

    public static byte[] decrypt(byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(f9351iv));
        return cipher.doFinal(bArr);
    }

    public static String decryptEx(String str) {
        try {
            return new String(decrypt(Base64.decode(str.getBytes(), 0), UMENG_PLUS.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(f9351iv));
        return cipher.doFinal(bArr);
    }

    public static String encryptBySHA1(String str) throws NoSuchAlgorithmException {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(bytes);
            return bytes2Hex(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String encryptEx(String str) {
        try {
            return Base64.encodeToString(encrypt(str.getBytes(), UMENG_PLUS.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] hash(byte[] bArr) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean largeThanMaxSize(long j4, long j5) {
        return j4 > j5;
    }

    public static int random(int i4, String str) throws NumberFormatException {
        if (new Random().nextFloat() < 0.001d) {
            int i5 = 0;
            if (str == null) {
                MLog.m7573e("--->", "null signature..");
            }
            try {
                i5 = Integer.parseInt(str.substring(9, 11), 16);
            } catch (Exception unused) {
            }
            return (i5 | 128) * 1000;
        }
        int iNextInt = new Random().nextInt(i4);
        if (iNextInt > 255000 || iNextInt < 128000) {
            return iNextInt;
        }
        return 127000;
    }

    public static byte[] reverseHexString(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length % 2 != 0) {
            return null;
        }
        byte[] bArr = new byte[length / 2];
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 2;
            bArr[i4 / 2] = (byte) Integer.valueOf(str.substring(i4, i5), 16).intValue();
            i4 = i5;
        }
        return bArr;
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b4 : bArr) {
            stringBuffer.append(String.format("%02X", Byte.valueOf(b4)));
        }
        return stringBuffer.toString().toLowerCase(Locale.US);
    }
}
