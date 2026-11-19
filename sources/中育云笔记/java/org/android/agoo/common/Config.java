package org.android.agoo.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.utl.ALog;

/* loaded from: classes6.dex */
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
    public static String f25303a;

    /* renamed from: b */
    private static String f25304b;

    /* renamed from: c */
    private static String f25305c;

    /* renamed from: d */
    private static String f25306d;

    /* renamed from: a */
    public static void m22233a(Context context, String str) {
        try {
        } catch (Throwable th) {
            ALog.m10117e(TAG, "setAgooAppSecret", th, new Object[0]);
        }
        if (TextUtils.isEmpty(str)) {
            ALog.m10118e(TAG, "setAgooAppSecret appSecret null", new Object[0]);
            return;
        }
        f25305c = str;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
        editorEdit.putString(PROPERTY_APP_SECRET, str);
        editorEdit.apply();
        ALog.m10116d(TAG, "setAgooAppSecret", "appSecret", str);
    }

    /* renamed from: b */
    public static String m22234b(Context context) {
        String string = f25304b;
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            string = context.getSharedPreferences(PREFERENCES, 4).getString(PROPERTY_APP_KEY, f25304b);
        } catch (Throwable th) {
            ALog.m10117e(TAG, "getAgooAppKey", th, new Object[0]);
        }
        if (TextUtils.isEmpty(string)) {
            ALog.m10118e(TAG, "getAgooAppKey null!!", new Object[0]);
        }
        ALog.m10116d(TAG, "getAgooAppKey", "appkey", string);
        return string;
    }

    /* renamed from: c */
    public static String m22237c(Context context) {
        String string = f25305c;
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            string = context.getSharedPreferences(PREFERENCES, 4).getString(PROPERTY_APP_SECRET, f25305c);
        } catch (Throwable th) {
            ALog.m10117e(TAG, "getAgooAppSecret", th, new Object[0]);
        }
        if (TextUtils.isEmpty(string)) {
            ALog.m10118e(TAG, "getAgooAppSecret null!!", new Object[0]);
        }
        ALog.m10116d(TAG, "getAgooAppSecret", "appSecret", string);
        return string;
    }

    /* renamed from: d */
    public static String m22238d(Context context) {
        return TextUtils.isEmpty(f25303a) ? ACCSManager.getDefaultConfig(context) : f25303a;
    }

    /* renamed from: e */
    public static boolean m22239e(Context context) {
        return context.getSharedPreferences(PREFERENCES, 4).getInt(AGOO_UNREPORT_TIMES, 0) > 0;
    }

    /* renamed from: f */
    public static void m22240f(Context context) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
            editorEdit.putInt(AGOO_UNREPORT_TIMES, 0);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    public static int m22241g(Context context) {
        try {
            return context.getSharedPreferences(PREFERENCES, 4).getInt(AGOO_UNREPORT_TIMES, 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String getDeviceToken(Context context) {
        String string = f25306d;
        try {
            string = context.getSharedPreferences(PREFERENCES, 4).getString("deviceId", f25306d);
        } catch (Throwable th) {
            ALog.m10117e(TAG, "getDeviceToken", th, new Object[0]);
        }
        ALog.m10119i(TAG, "getDeviceToken", "token", string);
        return string;
    }

    public static void setAgooAppKey(Context context, String str) {
        try {
        } catch (Throwable th) {
            ALog.m10117e(TAG, "setAgooAppKey", th, new Object[0]);
        }
        if (TextUtils.isEmpty(str)) {
            ALog.m10118e(TAG, "setAgooAppKey appkey null", new Object[0]);
            return;
        }
        f25304b = str;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
        editorEdit.putString(PROPERTY_APP_KEY, str);
        editorEdit.apply();
        ALog.m10116d(TAG, "setAgooAppKey", "appkey", str);
    }

    /* renamed from: b */
    public static void m22235b(Context context, String str) {
        ALog.m10119i(TAG, "setDeviceToken", "token", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f25306d = str;
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
            editorEdit.putString("deviceId", str);
            editorEdit.apply();
        } catch (Throwable th) {
            ALog.m10117e(TAG, "setDeviceToken", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m22231a(Context context, int i10) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES, 4);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt(AGOO_UNREPORT_TIMES, sharedPreferences.getInt(AGOO_UNREPORT_TIMES, 0) + i10);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m22230a(Context context) {
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

    /* renamed from: b */
    public static boolean m22236b(Context context, long j10) {
        long j11;
        try {
            long j12 = context.getSharedPreferences(PREFERENCES, 4).getLong(AGOO_CLEAR_TIME, 0L);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("now=");
            sb2.append(j10);
            sb2.append(",now - lastTime=");
            j11 = j10 - j12;
            sb2.append(j11);
            sb2.append(",istrue=");
            sb2.append(j11 > 86400000);
            ALog.m10116d("isClearTime", sb2.toString(), new Object[0]);
        } catch (Throwable unused) {
        }
        return j10 != 0 && j11 > 86400000;
    }

    /* renamed from: a */
    public static void m22232a(Context context, long j10) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
            editorEdit.putLong(AGOO_CLEAR_TIME, j10);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }
}
