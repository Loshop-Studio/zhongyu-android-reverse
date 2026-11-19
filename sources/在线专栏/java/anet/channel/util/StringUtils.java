package anet.channel.util;

import com.umeng.analytics.pro.C1892bw;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class StringUtils {
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String buildKey(String str, String str2) {
        return concatString(str, HttpConstant.SCHEME_SPLIT, str2);
    }

    private static String bytesToHexString(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i4 + 1;
            cArr2[i4] = cArr[(bArr[i5] & 240) >>> 4];
            i4 = i6 + 1;
            cArr2[i6] = cArr[bArr[i5] & C1892bw.f8538m];
        }
        return new String(cArr2);
    }

    public static String concatString(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static boolean isBlank(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i4 = 0; i4 < length; i4++) {
                if (!Character.isWhitespace(str.charAt(i4))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static boolean isStringEqual(String str, String str2) {
        return (str == null && str2 == null) || (str != null && str.equals(str2));
    }

    public static String md5ToHex(String str) {
        if (str == null) {
            return null;
        }
        try {
            return bytesToHexString(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String simplifyString(String str, int i4) {
        return str.length() <= i4 ? str : concatString(str.substring(0, i4), "......");
    }

    public static String stringNull2Empty(String str) {
        return str == null ? "" : str;
    }

    public static String concatString(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + str3.length());
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String bytesToHexString(byte[] bArr) {
        return bArr == null ? "" : bytesToHexString(bArr, DIGITS_LOWER);
    }
}
