package com.tencent.smtt.utils;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class LogFileUtils {

    /* renamed from: a */
    private static OutputStream f6942a;

    public static void closeOutputStream(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e10) {
                Log.e("LOG_FILE", "Couldn't close stream!", e10);
            }
        }
    }

    public static byte[] createHeaderText(String str, String str2) {
        try {
            byte[] bArrEncryptKey = encryptKey(str, str2);
            String str3 = String.format("%03d", Integer.valueOf(bArrEncryptKey.length));
            byte[] bArr = new byte[bArrEncryptKey.length + 3];
            bArr[0] = (byte) str3.charAt(0);
            bArr[1] = (byte) str3.charAt(1);
            bArr[2] = (byte) str3.charAt(2);
            System.arraycopy(bArrEncryptKey, 0, bArr, 3, bArrEncryptKey.length);
            return bArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String createKey() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static byte[] encrypt(String str, String str2) {
        try {
            byte[] bytes = str2.getBytes("UTF-8");
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(str.getBytes("UTF-8"), "RC4"));
            return cipher.update(bytes);
        } catch (Throwable th) {
            Log.e("LOG_FILE", "encrypt exception:" + th.getMessage());
            return null;
        }
    }

    public static byte[] encryptKey(String str, String str2) {
        try {
            byte[] bytes = str2.getBytes("UTF-8");
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(str.getBytes("UTF-8"), "RC4"));
            return cipher.update(bytes);
        } catch (Throwable th) {
            Log.e("LOG_FILE", "encrypt exception:" + th.getMessage());
            return null;
        }
    }

    public static synchronized void writeDataToStorage(File file, String str, byte[] bArr, String str2, boolean z10) {
        OutputStream outputStream;
        byte[] bArrEncrypt = encrypt(str, str2);
        if (bArrEncrypt != null) {
            str2 = null;
        } else {
            bArrEncrypt = null;
        }
        try {
            file.getParentFile().mkdirs();
            if (file.isFile() && file.exists() && file.length() > PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
                file.delete();
                file.createNewFile();
            }
            if (f6942a == null) {
                f6942a = new BufferedOutputStream(new FileOutputStream(file, z10));
            }
            if (str2 != null) {
                f6942a.write(str2.getBytes());
            } else {
                f6942a.write(bArr);
                f6942a.write(bArrEncrypt);
                f6942a.write(new byte[]{10, 10});
            }
            outputStream = f6942a;
        } catch (Throwable unused) {
            outputStream = f6942a;
            if (outputStream != null) {
            }
        }
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (Throwable unused2) {
            }
        }
    }
}
