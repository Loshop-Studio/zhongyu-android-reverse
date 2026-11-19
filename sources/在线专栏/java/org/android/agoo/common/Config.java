package org.android.agoo.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.utl.ALog;

/* loaded from: classes.dex */
public class Config {
    public static final String AGOO_CLEAR_TIME = "agoo_clear_time";
    public static final String AGOO_ENABLE_DAEMONSERVER = "agoo_enable_daemonserver";
    public static final String AGOO_UNREPORT_TIMES = "agoo_UnReport_times";
    public static final String KEY_DEVICE_TOKEN = "deviceId";
    public static final String PREFERENCES = "EMAS_Agoo_AppStore";
    public static final String PROPERTY_AGOO_SERVICE_MODE = "agoo_service_mode";
    public static final String PROPERTY_APP_KEY = "agoo_app_key";
    public static final String PROPERTY_APP_SECRET = "agoo_app_secret";
    public static final String PROPERTY_APP_VERSION = "app_version";
    public static final String PROPERTY_DEVICE_TOKEN = "app_device_token";
    public static final String PROPERTY_PUSH_USER_TOKEN = "app_push_user_token";
    public static final String PROPERTY_TT_ID = "app_tt_id";
    public static final String TAG = "Config";

    /* renamed from: a */
    public static String f11421a;

    /* renamed from: b */
    private static String f11422b;

    /* renamed from: c */
    private static String f11423c;

    /* renamed from: d */
    private static String f11424d;

    /* renamed from: a */
    public static void m10015a(Context context, String str) {
        try {
        } catch (Throwable th) {
            ALog.m6091e(TAG, "setAgooAppSecret", th, new Object[0]);
        }
        if (TextUtils.isEmpty(str)) {
            ALog.m6092e(TAG, "setAgooAppSecret appSecret null", new Object[0]);
            return;
        }
        f11423c = str;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
        editorEdit.putString(PROPERTY_APP_SECRET, str);
        editorEdit.apply();
        ALog.m6090d(TAG, "setAgooAppSecret", "appSecret", str);
    }

    /* renamed from: b */
    public static String m10016b(Context context) {
        String string = f11422b;
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            string = context.getSharedPreferences(PREFERENCES, 4).getString(PROPERTY_APP_KEY, f11422b);
        } catch (Throwable th) {
            ALog.m6091e(TAG, "getAgooAppKey", th, new Object[0]);
        }
        if (TextUtils.isEmpty(string)) {
            ALog.m6092e(TAG, "getAgooAppKey null!!", new Object[0]);
        }
        ALog.m6090d(TAG, "getAgooAppKey", "appkey", string);
        return string;
    }

    /* renamed from: c */
    public static String m10019c(Context context) {
        String string = f11423c;
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            string = context.getSharedPreferences(PREFERENCES, 4).getString(PROPERTY_APP_SECRET, f11423c);
        } catch (Throwable th) {
            ALog.m6091e(TAG, "getAgooAppSecret", th, new Object[0]);
        }
        if (TextUtils.isEmpty(string)) {
            ALog.m6092e(TAG, "getAgooAppSecret null!!", new Object[0]);
        }
        ALog.m6090d(TAG, "getAgooAppSecret", "appSecret", string);
        return string;
    }

    /* renamed from: d */
    public static String m10020d(Context context) {
        return TextUtils.isEmpty(f11421a) ? ACCSManager.getDefaultConfig(context) : f11421a;
    }

    /* renamed from: e */
    public static boolean m10021e(Context context) {
        try {
            return context.getSharedPreferences(PREFERENCES, 4).getInt(AGOO_UNREPORT_TIMES, 0) > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static void m10022f(Context context) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
            editorEdit.putInt(AGOO_UNREPORT_TIMES, 0);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    public static int m10023g(Context context) {
        try {
            return context.getSharedPreferences(PREFERENCES, 4).getInt(AGOO_UNREPORT_TIMES, 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String getDeviceToken(Context context) {
        String string = f11424d;
        try {
            string = context.getSharedPreferences(PREFERENCES, 4).getString("deviceId", f11424d);
        } catch (Throwable th) {
            ALog.m6091e(TAG, "getDeviceToken", th, new Object[0]);
        }
        ALog.m6093i(TAG, "getDeviceToken", "token", string);
        return string;
    }

    public static void setAgooAppKey(Context context, String str) {
        try {
        } catch (Throwable th) {
            ALog.m6091e(TAG, "setAgooAppKey", th, new Object[0]);
        }
        if (TextUtils.isEmpty(str)) {
            ALog.m6092e(TAG, "setAgooAppKey appkey null", new Object[0]);
            return;
        }
        f11422b = str;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
        editorEdit.putString(PROPERTY_APP_KEY, str);
        editorEdit.apply();
        ALog.m6090d(TAG, "setAgooAppKey", "appkey", str);
    }

    /* renamed from: b */
    public static void m10017b(Context context, String str) {
        ALog.m6093i(TAG, "setDeviceToken", "token", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f11424d = str;
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
            editorEdit.putString("deviceId", str);
            editorEdit.apply();
        } catch (Throwable th) {
            ALog.m6091e(TAG, "setDeviceToken", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m10012a(Context context) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
            editorEdit.putInt("app_version", Integer.MIN_VALUE);
            editorEdit.remove(PROPERTY_DEVICE_TOKEN);
            editorEdit.remove(PROPERTY_APP_KEY);
            editorEdit.remove(PROPERTY_TT_ID);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m10013a(Context context, int i4) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES, 4);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt(AGOO_UNREPORT_TIMES, sharedPreferences.getInt(AGOO_UNREPORT_TIMES, 0) + i4);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static boolean m10018b(Context context, long j4) {
        try {
            long j5 = context.getSharedPreferences(PREFERENCES, 4).getLong(AGOO_CLEAR_TIME, 0L);
            StringBuilder sb = new StringBuilder();
            sb.append("now=");
            sb.append(j4);
            sb.append(",now - lastTime=");
            long j6 = j4 - j5;
            sb.append(j6);
            sb.append(",istrue=");
            sb.append(j6 > 86400000);
            ALog.m6090d("isClearTime", sb.toString(), new Object[0]);
            return j4 != 0 && j6 > 86400000;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m10014a(Context context, long j4) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
            editorEdit.putLong(AGOO_CLEAR_TIME, j4);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }
}
