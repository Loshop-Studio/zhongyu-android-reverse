package com.taobao.accs.utl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.taobao.accs.p063b.C1708a;

/* loaded from: classes.dex */
public class Utils {
    public static final String SP_AGOO_BIND_FILE_NAME = "EMAS_AGOO_BIND";
    private static final String TAG = "Utils";
    private static int debugMode = 0;
    private static final byte[] mLock = new byte[0];
    private static int targetSdkVersion = -1;

    public static void clearAgooBindCache(Context context) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("EMAS_AGOO_BIND", 0).edit();
            editorEdit.clear();
            editorEdit.apply();
        } catch (Exception e4) {
            ALog.m6091e(TAG, "clearAgooBindCache", e4, new Object[0]);
        }
    }

    public static void clearAllSharePreferences(Context context) {
        try {
            synchronized (mLock) {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                editorEdit.clear();
                editorEdit.apply();
            }
        } catch (Throwable th) {
            ALog.m6091e(TAG, "clearAllSharePreferences", th, new Object[0]);
        }
    }

    public static Bundle getMetaInfo(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            return null;
        } catch (Throwable th) {
            ALog.m6091e(TAG, "getMetaInfo", th, new Object[0]);
            return null;
        }
    }

    public static int getMode() {
        return debugMode;
    }

    public static String getSpValue(Context context, String str, String str2) {
        String string = null;
        try {
            synchronized (mLock) {
                string = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getString(str, null);
            }
            ALog.m6093i(TAG, "getSpValue", "value", string);
            if (TextUtils.isEmpty(string)) {
                ALog.m6092e(TAG, "getSpValue use default!", new Object[0]);
                return str2;
            }
        } catch (Throwable th) {
            ALog.m6091e(TAG, "getSpValue fail", th, new Object[0]);
        }
        return string;
    }

    public static boolean isIPV6Address(String str) {
        int i4;
        boolean z3;
        int i5;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length < 2) {
            return false;
        }
        if (charArray[0] != ':') {
            i4 = 0;
            z3 = false;
            i5 = 0;
        } else {
            if (charArray[1] != ':') {
                return false;
            }
            i4 = 1;
            z3 = false;
            i5 = 1;
        }
        int i6 = 0;
        boolean z4 = true;
        while (i4 < charArray.length) {
            char c4 = charArray[i4];
            int iDigit = Character.digit(c4, 16);
            if (iDigit != -1) {
                i6 = (i6 << 4) + iDigit;
                if (i6 > 65535) {
                    return false;
                }
                z4 = false;
            } else {
                if (c4 != ':' || (i5 = i5 + 1) > 7) {
                    return false;
                }
                if (!z4) {
                    i6 = 0;
                    z4 = true;
                } else {
                    if (z3) {
                        return false;
                    }
                    z3 = true;
                }
            }
            i4++;
        }
        return z3 || i5 >= 7;
    }

    public static boolean isTarget26(Context context) {
        if (context == null) {
            return false;
        }
        if (targetSdkVersion == -1) {
            targetSdkVersion = context.getApplicationInfo().targetSdkVersion;
        }
        return targetSdkVersion >= 26 && Build.VERSION.SDK_INT >= 26;
    }

    public static void killService(Context context) {
        try {
            Class<?> clsLoadClass = C1708a.m5835a().m5836b().loadClass("com.taobao.accs.utl.UtilityImpl");
            clsLoadClass.getMethod("killService", Context.class).invoke(clsLoadClass, context);
        } catch (Throwable th) {
            ALog.m6091e(TAG, "killService", th, new Object[0]);
        }
    }

    public static void setAgooAppKey(Context context, String str) {
        try {
            Class<?> clsLoadClass = C1708a.m5835a().m5836b().loadClass("org.android.agoo.common.Config");
            clsLoadClass.getMethod("setAgooAppKey", Context.class, String.class).invoke(clsLoadClass, context, str);
        } catch (Throwable th) {
            ALog.m6091e(TAG, "setAgooAppKey", th, new Object[0]);
            th.printStackTrace();
        }
    }

    public static void setMode(int i4) {
        debugMode = i4;
    }

    public static void setSpValue(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            ALog.m6092e(TAG, "setSpValue null", new Object[0]);
            return;
        }
        try {
            synchronized (mLock) {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                editorEdit.putString(str, str2);
                editorEdit.apply();
            }
            ALog.m6093i(TAG, "setSpValue", "key", str, "value", str2);
        } catch (Exception e4) {
            ALog.m6091e(TAG, "setSpValue fail", e4, new Object[0]);
        }
    }
}
