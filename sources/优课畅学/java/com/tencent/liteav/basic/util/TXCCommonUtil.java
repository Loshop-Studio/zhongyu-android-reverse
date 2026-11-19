package com.tencent.liteav.basic.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public class TXCCommonUtil {
    private static final String TAG = "TXCCommonUtil";
    private static String mAppID = "";
    private static String mStrAppVersion = "";
    private static String mUserId = "";
    public static String pituLicencePath = "YTFaceSDK.licence";
    private static Context sApplicationContext;

    static {
        C6592e.m5058f();
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Context getAppContext() {
        return sApplicationContext;
    }

    public static String getAppFilePath() {
        Context context = sApplicationContext;
        String absolutePath = context != null ? context.getFilesDir().getAbsolutePath() : "/sdcard/liteav";
        File file = new File(absolutePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return absolutePath;
    }

    public static String getAppID() {
        return mAppID;
    }

    public static String getAppNameByStreamUrl(String str) {
        if (str != null && str.length() != 0) {
            int iIndexOf = str.indexOf("?");
            if (iIndexOf != -1) {
                str = str.substring(0, iIndexOf);
            }
            if (str != null && str.length() != 0) {
                int iLastIndexOf = str.lastIndexOf("/");
                if (iLastIndexOf != -1) {
                    str = str.substring(0, iLastIndexOf);
                }
                if (str != null && str.length() != 0) {
                    int iLastIndexOf2 = str.lastIndexOf("/");
                    if (iLastIndexOf2 != -1) {
                        str = str.substring(iLastIndexOf2 + 1);
                    }
                    if (str != null && str.length() != 0) {
                        return str;
                    }
                }
            }
        }
        return null;
    }

    public static String getAppPackageName() {
        return C6592e.m5050b(sApplicationContext);
    }

    public static String getAppVersion() {
        return mStrAppVersion;
    }

    public static String getConfigCenterKey() {
        return nativeGetConfigCenterKey();
    }

    public static String getFileExtension(String str) {
        int iLastIndexOf;
        if (str == null || str.length() <= 0 || (iLastIndexOf = str.lastIndexOf(46)) <= -1 || iLastIndexOf >= str.length() - 1) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    public static int getGateway() {
        Context context = sApplicationContext;
        if (context == null) {
            return 0;
        }
        try {
            return ((WifiManager) context.getSystemService("wifi")).getDhcpInfo().gateway;
        } catch (Exception e10) {
            TXCLog.m4992e(TAG, "getGateway error ", e10);
            return 0;
        }
    }

    public static String getLogUploadPath() {
        File externalFilesDir;
        Context context = sApplicationContext;
        if (context == null || (externalFilesDir = context.getExternalFilesDir(null)) == null) {
            return "";
        }
        return externalFilesDir.getAbsolutePath() + "/log/tencent/liteav";
    }

    public static String getMD5(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer("");
            for (int i10 = 0; i10 < bArrDigest.length; i10++) {
                int i11 = bArrDigest[i10];
                if (i11 < 0) {
                    i11 += 256;
                }
                if (i11 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i11));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static int getSDKID() {
        return nativeGetSDKID();
    }

    public static int[] getSDKVersion() {
        String[] strArrSplit = nativeGetSDKVersion().split("\\.");
        int[] iArr = new int[strArrSplit.length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                iArr[i10] = Integer.parseInt(strArrSplit[i10]);
            } catch (NumberFormatException e10) {
                TXCLog.m4992e(TAG, "parse version failed.", e10);
                iArr[i10] = 0;
            }
        }
        return iArr;
    }

    public static String getSDKVersionStr() {
        return nativeGetSDKVersion();
    }

    public static String getStreamIDByStreamUrl(String str) {
        if (str != null && str.length() != 0) {
            int iIndexOf = str.indexOf("?");
            if (iIndexOf != -1) {
                str = str.substring(0, iIndexOf);
            }
            if (str != null && str.length() != 0) {
                int iLastIndexOf = str.lastIndexOf("/");
                if (iLastIndexOf != -1) {
                    str = str.substring(iLastIndexOf + 1);
                }
                if (str != null && str.length() != 0) {
                    int iIndexOf2 = str.indexOf(".");
                    if (iIndexOf2 != -1) {
                        str = str.substring(0, iIndexOf2);
                    }
                    if (str != null && str.length() != 0) {
                        return str;
                    }
                }
            }
        }
        return null;
    }

    public static String getUserId() {
        return mUserId;
    }

    public static String loadString(String str) {
        Context context = sApplicationContext;
        if (context == null) {
            return "";
        }
        try {
            return context.getSharedPreferences("TXCCommonConfig", 0).getString(str, "");
        } catch (Exception e10) {
            TXCLog.m4992e(TAG, "load string failed.", e10);
            return "";
        }
    }

    public static long loadUInt64(String str) {
        Context context = sApplicationContext;
        if (context == null) {
            return 0L;
        }
        try {
            return context.getSharedPreferences("TXCCommonConfig", 0).getLong(str, 0L);
        } catch (Exception e10) {
            TXCLog.m4992e(TAG, "load uint64 failed.", e10);
            return 0L;
        }
    }

    private static native String nativeGetConfigCenterKey();

    private static native int nativeGetSDKID();

    private static native String nativeGetSDKVersion();

    public static void saveString(String str, String str2) {
        Context context = sApplicationContext;
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("TXCCommonConfig", 0).edit();
            editorEdit.putString(str, str2);
            editorEdit.commit();
        } catch (Exception e10) {
            TXCLog.m4992e(TAG, "save string failed", e10);
        }
    }

    public static void saveUInt64(String str, long j10) {
        Context context = sApplicationContext;
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("TXCCommonConfig", 0).edit();
            editorEdit.putLong(str, j10);
            editorEdit.commit();
        } catch (Exception e10) {
            TXCLog.m4992e(TAG, "save uint64 failed.", e10);
        }
    }

    public static void setAppContext(Context context) {
        if (context == null) {
            return;
        }
        sApplicationContext = context.getApplicationContext();
    }

    public static void setAppID(String str) {
        mAppID = str;
    }

    public static void setAppVersion(String str) {
        mStrAppVersion = str;
    }

    public static void setPituLicencePath(String str) {
        pituLicencePath = str;
    }

    public static void setUserId(String str) {
        mUserId = str;
    }

    public static void sleep(int i10) throws InterruptedException {
        try {
            Thread.sleep(i10);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:7|(2:73|8)|(9:77|13|56|14|(3:15|(1:17)(0)|54)|23|27|79|78)|67|32|80|78|5) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zip(java.util.ArrayList<java.lang.String> r9, java.lang.String r10) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "TXCCommonUtil"
            java.io.File r1 = new java.io.File
            r1.<init>(r10)
            r10 = 0
            java.util.zip.ZipOutputStream r2 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L8c java.io.FileNotFoundException -> L8e
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8c java.io.FileNotFoundException -> L8e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L8c java.io.FileNotFoundException -> L8e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8c java.io.FileNotFoundException -> L8e
            java.lang.String r1 = "LiteAV log"
            r2.setComment(r1)     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
        L1b:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
            if (r1 == 0) goto L88
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
            long r4 = r3.length()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L78
            long r4 = r3.length()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            r6 = 8388608(0x800000, double:4.144523E-317)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L42
            goto L78
        L42:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            java.util.zip.ZipEntry r10 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            r10.<init>(r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            r2.putNextEntry(r10)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            r10 = 8192(0x2000, float:1.148E-41)
            byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
        L57:
            int r3 = r1.read(r10)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            r4 = -1
            if (r3 == r4) goto L68
            r4 = 0
            r2.write(r10, r4, r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            goto L57
        L63:
            r9 = move-exception
            r10 = r1
            goto L82
        L66:
            r10 = move-exception
            goto L7c
        L68:
            r1.close()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            goto L6f
        L6c:
            r9 = move-exception
            r10 = r2
            goto L97
        L6f:
            r10 = r1
            goto L1b
        L71:
            r9 = move-exception
            goto L82
        L73:
            r1 = move-exception
            r8 = r1
            r1 = r10
            r10 = r8
            goto L7c
        L78:
            r10.close()     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L6c
            goto L1b
        L7c:
            java.lang.String r3 = "zip failed."
            com.tencent.liteav.basic.log.TXCLog.m4992e(r0, r3, r10)     // Catch: java.lang.Throwable -> L63
            goto L68
        L82:
            r10.close()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L85
        L85:
            throw r9     // Catch: java.lang.Throwable -> L6c java.io.FileNotFoundException -> L86
        L86:
            r10 = r2
            goto L8e
        L88:
            r2.close()     // Catch: java.lang.Exception -> L96
            goto L96
        L8c:
            r9 = move-exception
            goto L97
        L8e:
            java.lang.String r9 = "zip log error"
            com.tencent.liteav.basic.log.TXCLog.m4998w(r0, r9)     // Catch: java.lang.Throwable -> L8c
            r10.close()     // Catch: java.lang.Exception -> L96
        L96:
            return
        L97:
            r10.close()     // Catch: java.lang.Exception -> L9a
        L9a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.basic.util.TXCCommonUtil.zip(java.util.ArrayList, java.lang.String):void");
    }

    public static byte[] getMD5(byte[] bArr) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }
}
