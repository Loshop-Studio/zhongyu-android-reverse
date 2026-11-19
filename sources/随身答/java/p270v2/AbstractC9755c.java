package p270v2;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.UByte;

/* renamed from: v2.c */
/* loaded from: classes4.dex */
public abstract class AbstractC9755c {

    /* renamed from: a */
    public static final String f17272a = System.getProperty("line.separator");

    /* renamed from: a */
    public static String m16392a(String str) throws NoSuchAlgorithmException {
        if (str == null) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b10 : bArrDigest) {
                stringBuffer.append(String.format("%02X", Byte.valueOf(b10)));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return str.replaceAll("[^[a-z][A-Z][0-9][.][_]]", "");
        }
    }

    /* renamed from: b */
    public static String m16393b(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b10 : bArrDigest) {
                stringBuffer.append(Integer.toHexString((b10 & UByte.MAX_VALUE) | (-256)).substring(6));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e10) {
            AbstractC9756d.m16410i("helper", "getMD5 error", e10);
            return "";
        }
    }

    /* renamed from: c */
    public static String m16394c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b10 : bArrDigest) {
                stringBuffer.append(Integer.toHexString(b10 & UByte.MAX_VALUE));
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            AbstractC9756d.m16410i("helper", "getMD5 error", th);
            return "";
        }
    }

    /* renamed from: d */
    public static String m16395d(File file) throws IOException {
        FileInputStream fileInputStream;
        try {
            if (!file.exists()) {
                m16397f(null);
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                String str = new String(bArr);
                m16397f(fileInputStream);
                return str;
            } catch (Throwable unused) {
                m16397f(fileInputStream);
                return null;
            }
        } catch (Throwable unused2) {
            fileInputStream = null;
        }
    }

    /* renamed from: e */
    public static byte[] m16396e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i9 = inputStream.read(bArr);
            if (-1 == i9) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i9);
        }
    }

    /* renamed from: f */
    public static void m16397f(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public static void m16398g(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public static String m16399h(String str, int i9) {
        String strSubstring = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                strSubstring = str.substring(0, str.length() < i9 ? str.length() : i9);
                int length = strSubstring.getBytes("UTF-8").length;
                int i10 = i9;
                while (length > i9) {
                    i10--;
                    strSubstring = str.substring(0, i10 > str.length() ? str.length() : i10);
                    length = strSubstring.getBytes("UTF-8").length;
                }
            }
            return strSubstring;
        } catch (Exception e10) {
            AbstractC9756d.m16408g(e10);
            return strSubstring;
        }
    }

    /* renamed from: i */
    public static void m16400i(File file, String str) throws IOException {
        m16401j(file, str.getBytes());
    }

    /* renamed from: j */
    public static void m16401j(File file, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
        } finally {
            m16398g(fileOutputStream);
        }
    }
}
