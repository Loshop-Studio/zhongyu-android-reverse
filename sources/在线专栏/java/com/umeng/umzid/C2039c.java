package com.umeng.umzid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;

/* renamed from: com.umeng.umzid.c */
/* loaded from: classes.dex */
public class C2039c {
    /* renamed from: a */
    public static String m7946a(Context context) {
        SharedPreferences sharedPreferencesM7942a;
        if (context == null || (sharedPreferencesM7942a = C2037a.m7942a(context)) == null) {
            return null;
        }
        return sharedPreferencesM7942a.getString("aaid", null);
    }

    /* renamed from: a */
    public static String m7947a(String str) {
        try {
            return new String(Base64.decode(str.getBytes("UTF-8"), 2));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static void m7948a(Context context, String str) {
        SharedPreferences sharedPreferencesM7942a;
        SharedPreferences.Editor editorEdit;
        String strM7950b = m7950b(str);
        if (context == null || strM7950b == null || TextUtils.isEmpty(strM7950b) || (sharedPreferencesM7942a = C2037a.m7942a(context)) == null || (editorEdit = sharedPreferencesM7942a.edit()) == null) {
            return;
        }
        editorEdit.putString("mac", strM7950b).commit();
    }

    /* renamed from: b */
    public static String m7949b(Context context) {
        SharedPreferences sharedPreferencesM7942a;
        return (context == null || (sharedPreferencesM7942a = C2037a.m7942a(context)) == null) ? "" : sharedPreferencesM7942a.getString("zdata", null);
    }

    /* renamed from: b */
    public static String m7950b(String str) {
        try {
            return Base64.encodeToString(str.getBytes("UTF-8"), 2);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static void m7951b(Context context, String str) {
        SharedPreferences sharedPreferencesM7942a;
        SharedPreferences.Editor editorEdit;
        String strM7950b = m7950b(str);
        if (context == null || strM7950b == null || TextUtils.isEmpty(strM7950b) || (sharedPreferencesM7942a = C2037a.m7942a(context)) == null || (editorEdit = sharedPreferencesM7942a.edit()) == null) {
            return;
        }
        editorEdit.putString("oaid", strM7950b).commit();
    }

    /* renamed from: c */
    public static String m7952c(Context context) {
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

    /* renamed from: c */
    public static void m7953c(Context context, String str) {
        SharedPreferences sharedPreferencesM7942a;
        SharedPreferences.Editor editorEdit;
        if (context == null || TextUtils.isEmpty(str) || (sharedPreferencesM7942a = C2037a.m7942a(context)) == null || (editorEdit = sharedPreferencesM7942a.edit()) == null) {
            return;
        }
        editorEdit.putString("resetToken", str).commit();
    }

    /* renamed from: c */
    public static boolean m7954c(String str) {
        return !TextUtils.isEmpty(str) && str.equals(m7950b(m7947a(str)));
    }

    /* renamed from: d */
    public static String m7955d(Context context) {
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

    /* renamed from: d */
    public static void m7956d(Context context, String str) {
        SharedPreferences sharedPreferencesM7942a;
        SharedPreferences.Editor editorEdit;
        if (context == null || TextUtils.isEmpty(str) || (sharedPreferencesM7942a = C2037a.m7942a(context)) == null || (editorEdit = sharedPreferencesM7942a.edit()) == null) {
            return;
        }
        editorEdit.putString("uabc", str).commit();
    }

    /* renamed from: e */
    public static void m7957e(Context context, String str) {
        SharedPreferences sharedPreferencesM7942a;
        SharedPreferences.Editor editorEdit;
        if (context == null || str == null || TextUtils.isEmpty(str) || (sharedPreferencesM7942a = C2037a.m7942a(context)) == null || (editorEdit = sharedPreferencesM7942a.edit()) == null) {
            return;
        }
        editorEdit.putString("aaid", str).commit();
    }

    /* renamed from: f */
    public static void m7958f(Context context, String str) {
        SharedPreferences sharedPreferencesM7942a;
        SharedPreferences.Editor editorEdit;
        if (context == null || str == null || TextUtils.isEmpty(str) || (sharedPreferencesM7942a = C2037a.m7942a(context)) == null || (editorEdit = sharedPreferencesM7942a.edit()) == null) {
            return;
        }
        editorEdit.putString("zdata", str).commit();
    }
}
