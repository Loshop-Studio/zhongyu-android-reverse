package com.tencent.liteav.basic.datareport;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.security.MessageDigest;
import java.util.UUID;

/* loaded from: classes4.dex */
public class TXCDRApi {
    static final int NETWORK_TYPE_2G = 4;
    static final int NETWORK_TYPE_3G = 3;
    static final int NETWORK_TYPE_4G = 2;
    static final int NETWORK_TYPE_UNKNOWN = 255;
    static final int NETWORK_TYPE_WIFI = 1;
    private static final String TAG = "TXCDRApi";
    private static String g_simulate_idfa = "";
    private static String mAppName = "";
    private static String mDevId = "";
    private static String mDevType = "";
    private static String mDevUUID = "";
    private static String mNetType = "";
    private static String mSysVersion = "";
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    static boolean initRpt = false;

    static {
        C6592e.m5058f();
        nativeInitDataReport();
    }

    public static void InitEvent(Context context, String str, int i10, int i11, TXCDRExtInfo tXCDRExtInfo) {
        setCommonInfo(context);
        if (str == null) {
            return;
        }
        nativeInitEventInternal(str, i10, i11, tXCDRExtInfo);
    }

    private static String byteArrayToHexString(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = DIGITS_LOWER;
            cArr[i10] = cArr2[(b10 & 240) >>> 4];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static String getApplicationNameByPackageName(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getDevUUID(Context context, String str) {
        return getSimulateIDFA(context);
    }

    public static int getNetworkType(Context context) {
        int i10 = 255;
        if (context == null) {
            return 255;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 255;
            }
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (activeNetworkInfo.getType() == 0) {
                i10 = 2;
                try {
                    switch (telephonyManager.getNetworkType()) {
                    }
                } catch (Exception e10) {
                    TXCLog.m4992e(TAG, "TXCDRApi: get network type fail, exception occurred.", e10);
                }
                return 255;
            }
            return i10;
        } catch (Exception e11) {
            TXCLog.m4992e(TAG, "getActiveNetworkInfo exception:", e11);
            return 255;
        }
    }

    public static String getOrigAndroidID(Context context) {
        String string;
        try {
            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            string = "";
        }
        return string2Md5(string);
    }

    private static String getPackageName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception e10) {
            TXCLog.m4992e(TAG, "get package name failed.", e10);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9 A[LOOP:0: B:40:0x00b3->B:42:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6 A[LOOP:1: B:44:0x00e4->B:45:0x00e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0176 A[Catch: Exception -> 0x017a, TryCatch #1 {Exception -> 0x017a, blocks: (B:51:0x0156, B:53:0x0176, B:56:0x017c, B:58:0x019a, B:59:0x019d), top: B:70:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a A[Catch: Exception -> 0x017a, TryCatch #1 {Exception -> 0x017a, blocks: (B:51:0x0156, B:53:0x0176, B:56:0x017c, B:58:0x019a, B:59:0x019d), top: B:70:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getSimulateIDFA(android.content.Context r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.basic.datareport.TXCDRApi.getSimulateIDFA(android.content.Context):java.lang.String");
    }

    public static int getStatusReportInterval() {
        return nativeGetStatusReportInterval();
    }

    public static void initCrashReport(Context context) {
        String sDKVersionStr;
        try {
            synchronized (TXCDRApi.class) {
                try {
                    if (!initRpt && context != null && (sDKVersionStr = TXCCommonUtil.getSDKVersionStr()) != null) {
                        SharedPreferences.Editor editorEdit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
                        editorEdit.putString("8e50744bf0", sDKVersionStr);
                        editorEdit.commit();
                        initRpt = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e10) {
            TXCLog.m4992e(TAG, "init crash report failed.", e10);
        }
    }

    public static native int nativeGetStatusReportInterval();

    private static native void nativeInitDataReport();

    private static native void nativeInitEventInternal(String str, int i10, int i11, TXCDRExtInfo tXCDRExtInfo);

    public static native void nativeReportAVRoomEvent(int i10, long j10, String str, int i11, int i12, String str2, String str3);

    private static native void nativeReportDAUInterval(int i10, int i11, String str);

    public static native void nativeReportEvent(String str, int i10);

    public static native void nativeReportEvent40003(String str, int i10, int i11, String str2, String str3);

    public static native void nativeSetCommonValue(String str, String str2);

    private static native void nativeSetEventValueInterval(String str, int i10, String str2, String str3);

    private static native void nativeUninitDataReport();

    public static void reportAVRoomEvent(int i10, long j10, String str, int i11, int i12, String str2, String str3) {
        nativeReportAVRoomEvent(i10, j10, str, i11, i12, str2, str3);
    }

    public static void reportEvent40003(String str, int i10, int i11, String str2, String str3) {
        nativeReportEvent40003(str, i10, i11, str2, str3);
    }

    public static void setCommonInfo(Context context) {
        mDevType = Build.MODEL;
        mNetType = Integer.toString(getNetworkType(context));
        if (mDevId.isEmpty()) {
            mDevId = getSimulateIDFA(context);
        }
        if (mDevUUID.isEmpty()) {
            mDevUUID = getDevUUID(context, mDevId);
        }
        String packageName = getPackageName(context);
        mAppName = getApplicationNameByPackageName(context, packageName) + ":" + packageName;
        mSysVersion = String.valueOf(Build.VERSION.SDK_INT);
        txSetCommonInfo();
    }

    public static String string2Md5(String str) {
        String strByteArrayToHexString;
        if (str == null) {
            return "";
        }
        try {
            strByteArrayToHexString = byteArrayToHexString(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8")));
        } catch (Exception e10) {
            TXCLog.m4992e(TAG, "string2Md5 failed.", e10);
            strByteArrayToHexString = "";
        }
        return strByteArrayToHexString == null ? "" : strByteArrayToHexString;
    }

    public static String txCreateToken() {
        return UUID.randomUUID().toString();
    }

    public static void txReportDAU(Context context, int i10) {
        if (context != null) {
            setCommonInfo(context);
        }
        nativeReportDAUInterval(i10, 0, "");
    }

    public static void txSetAppVersion(String str) {
        if (str != null) {
            nativeSetCommonValue(C6574a.f5440k, str);
        }
    }

    public static void txSetCommonInfo() {
        if (mDevType != null) {
            nativeSetCommonValue(C6574a.f5435f, mDevType);
        }
        if (mNetType != null) {
            nativeSetCommonValue(C6574a.f5436g, mNetType);
        }
        if (mDevId != null) {
            nativeSetCommonValue(C6574a.f5437h, mDevId);
        }
        if (mDevUUID != null) {
            nativeSetCommonValue(C6574a.f5438i, mDevUUID);
        }
        if (mAppName != null) {
            nativeSetCommonValue(C6574a.f5439j, mAppName);
        }
        if (mSysVersion != null) {
            nativeSetCommonValue(C6574a.f5441l, mSysVersion);
        }
    }

    public static void txSetEventIntValue(String str, int i10, String str2, long j10) {
        nativeSetEventValueInterval(str, i10, str2, "" + j10);
    }

    public static void txSetEventValue(String str, int i10, String str2, String str3) {
        nativeSetEventValueInterval(str, i10, str2, str3);
    }

    public static void txReportDAU(Context context, int i10, int i11, String str) {
        if (context != null) {
            setCommonInfo(context);
        }
        nativeReportDAUInterval(i10, i11, str);
    }
}
