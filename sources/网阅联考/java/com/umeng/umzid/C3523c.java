package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;

/* renamed from: com.umeng.umzid.c */
/* loaded from: classes2.dex */
public class C3523c {
    /* renamed from: a */
    public static String m4023a(Context context) {
        SharedPreferences sharedPreferencesM4019a;
        if (context == null || (sharedPreferencesM4019a = C3521a.m4019a(context)) == null) {
            return null;
        }
        return sharedPreferencesM4019a.getString("aaid", null);
    }

    /* renamed from: b */
    public static String m4026b(Context context) {
        SharedPreferences sharedPreferencesM4019a;
        return (context == null || (sharedPreferencesM4019a = C3521a.m4019a(context)) == null) ? "" : sharedPreferencesM4019a.getString("zdata", null);
    }

    /* renamed from: c */
    public static String m4029c(Context context) {
        try {
            String str = DeviceConfig.UNKNOW;
            Method declaredMethod = DeviceConfig.class.getDeclaredMethod("getMac", Context.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(DeviceConfig.class, context);
                if (objInvoke != null && (objInvoke instanceof String)) {
                    return (String) objInvoke;
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: d */
    public static String m4032d(Context context) {
        try {
            String str = DeviceConfig.UNKNOW;
            Method declaredMethod = DeviceConfig.class.getDeclaredMethod("getOaid", Context.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(DeviceConfig.class, context);
                if (objInvoke != null && (objInvoke instanceof String)) {
                    return (String) objInvoke;
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: e */
    public static void m4034e(Context context, String str) {
        SharedPreferences sharedPreferencesM4019a;
        SharedPreferences.Editor editorEdit;
        if (context == null || str == null || TextUtils.isEmpty(str) || (sharedPreferencesM4019a = C3521a.m4019a(context)) == null || (editorEdit = sharedPreferencesM4019a.edit()) == null) {
            return;
        }
        editorEdit.putString("aaid", str).commit();
    }

    /* renamed from: f */
    public static void m4035f(Context context, String str) {
        SharedPreferences sharedPreferencesM4019a;
        SharedPreferences.Editor editorEdit;
        if (context == null || str == null || TextUtils.isEmpty(str) || (sharedPreferencesM4019a = C3521a.m4019a(context)) == null || (editorEdit = sharedPreferencesM4019a.edit()) == null) {
            return;
        }
        editorEdit.putString("zdata", str).commit();
    }

    /* renamed from: a */
    public static String m4024a(String str) {
        try {
            return new String(Base64.decode(str.getBytes("UTF-8"), 2));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m4027b(String str) {
        try {
            return Base64.encodeToString(str.getBytes("UTF-8"), 2);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static void m4030c(Context context, String str) {
        SharedPreferences sharedPreferencesM4019a;
        SharedPreferences.Editor editorEdit;
        if (context == null || TextUtils.isEmpty(str) || (sharedPreferencesM4019a = C3521a.m4019a(context)) == null || (editorEdit = sharedPreferencesM4019a.edit()) == null) {
            return;
        }
        editorEdit.putString("resetToken", str).commit();
    }

    /* renamed from: d */
    public static void m4033d(Context context, String str) {
        SharedPreferences sharedPreferencesM4019a;
        SharedPreferences.Editor editorEdit;
        if (context == null || TextUtils.isEmpty(str) || (sharedPreferencesM4019a = C3521a.m4019a(context)) == null || (editorEdit = sharedPreferencesM4019a.edit()) == null) {
            return;
        }
        editorEdit.putString("uabc", str).commit();
    }

    /* renamed from: a */
    public static void m4025a(Context context, String str) {
        SharedPreferences sharedPreferencesM4019a;
        SharedPreferences.Editor editorEdit;
        String strM4027b = m4027b(str);
        if (context == null || strM4027b == null || TextUtils.isEmpty(strM4027b) || (sharedPreferencesM4019a = C3521a.m4019a(context)) == null || (editorEdit = sharedPreferencesM4019a.edit()) == null) {
            return;
        }
        editorEdit.putString("mac", strM4027b).commit();
    }

    /* renamed from: b */
    public static void m4028b(Context context, String str) {
        SharedPreferences sharedPreferencesM4019a;
        SharedPreferences.Editor editorEdit;
        String strM4027b = m4027b(str);
        if (context == null || strM4027b == null || TextUtils.isEmpty(strM4027b) || (sharedPreferencesM4019a = C3521a.m4019a(context)) == null || (editorEdit = sharedPreferencesM4019a.edit()) == null) {
            return;
        }
        editorEdit.putString("oaid", strM4027b).commit();
    }

    /* renamed from: c */
    public static boolean m4031c(String str) {
        return !TextUtils.isEmpty(str) && str.equals(m4027b(m4024a(str)));
    }
}
