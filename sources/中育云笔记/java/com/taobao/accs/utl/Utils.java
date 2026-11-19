package com.taobao.accs.utl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.taobao.accs.p084b.C7605a;

/* loaded from: classes5.dex */
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
        } catch (Exception e10) {
            ALog.m10117e(TAG, "clearAgooBindCache", e10, new Object[0]);
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
            ALog.m10117e(TAG, "clearAllSharePreferences", th, new Object[0]);
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
            ALog.m10117e(TAG, "getMetaInfo", th, new Object[0]);
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
            ALog.m10119i(TAG, "getSpValue", "value", string);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            ALog.m10118e(TAG, "getSpValue use default!", new Object[0]);
            return str2;
        } catch (Throwable th) {
            ALog.m10117e(TAG, "getSpValue fail", th, new Object[0]);
            return string;
        }
    }

    public static boolean isIPV6Address(String str) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length < 2) {
            return false;
        }
        if (charArray[0] != ':') {
            i10 = 0;
            z10 = false;
            i11 = 0;
            i12 = 0;
            z11 = true;
        } else {
            if (charArray[1] != ':') {
                return false;
            }
            z10 = false;
            i12 = 0;
            i10 = 1;
            i11 = 1;
            z11 = true;
        }
        while (i10 < charArray.length) {
            char c10 = charArray[i10];
            int iDigit = Character.digit(c10, 16);
            if (iDigit != -1) {
                i12 = (i12 << 4) + iDigit;
                if (i12 > 65535) {
                    return false;
                }
                z11 = false;
            } else {
                if (c10 != ':' || (i11 = i11 + 1) > 7) {
                    return false;
                }
                if (!z11) {
                    i12 = 0;
                    z11 = true;
                } else {
                    if (z10) {
                        return false;
                    }
                    z10 = true;
                }
            }
            i10++;
        }
        return z10 || i11 >= 7;
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
            Class<?> clsLoadClass = C7605a.m9861a().m9862b().loadClass("com.taobao.accs.utl.UtilityImpl");
            clsLoadClass.getMethod("killService", Context.class).invoke(clsLoadClass, context);
        } catch (Throwable th) {
            ALog.m10117e(TAG, "killService", th, new Object[0]);
        }
    }

    public static void setAgooAppKey(Context context, String str) {
        try {
            Class<?> clsLoadClass = C7605a.m9861a().m9862b().loadClass("org.android.agoo.common.Config");
            clsLoadClass.getMethod("setAgooAppKey", Context.class, String.class).invoke(clsLoadClass, context, str);
        } catch (Throwable th) {
            ALog.m10117e(TAG, "setAgooAppKey", th, new Object[0]);
            th.printStackTrace();
        }
    }

    public static void setMode(int i10) {
        debugMode = i10;
    }

    public static void setSpValue(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            ALog.m10118e(TAG, "setSpValue null", new Object[0]);
            return;
        }
        try {
            synchronized (mLock) {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                editorEdit.putString(str, str2);
                editorEdit.apply();
            }
            ALog.m10119i(TAG, "setSpValue", "key", str, "value", str2);
        } catch (Exception e10) {
            ALog.m10117e(TAG, "setSpValue fail", e10, new Object[0]);
        }
    }
}
