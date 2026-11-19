package com.huawei.hms.hatool;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import p318r5.AbstractC10861f1;

/* renamed from: com.huawei.hms.hatool.o */
/* loaded from: classes5.dex */
public abstract class AbstractC7317o {

    /* renamed from: com.huawei.hms.hatool.o$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static Object m8634a(Class cls, String str, Class[] clsArr, Object[] objArr) throws a {
        String str2;
        if (cls == null) {
            throw new a("class is null in invokeStaticFun");
        }
        if (clsArr == null) {
            if (objArr != null) {
                throw new a("paramsType is null, but params is not null");
            }
        } else {
            if (objArr == null) {
                throw new a("paramsType or params should be same");
            }
            if (clsArr.length != objArr.length) {
                throw new a("paramsType len:" + clsArr.length + " should equal params.len:" + objArr.length);
            }
        }
        try {
        } catch (NoSuchMethodException unused) {
            AbstractC10861f1.m23441m("hmsSdk", "invokeStaticFun(): cls.getMethod(),No Such Method !");
        }
        try {
            return cls.getMethod(str, clsArr).invoke(null, objArr);
        } catch (IllegalAccessException unused2) {
            str2 = "invokeStaticFun(): method invoke Exception!";
            AbstractC10861f1.m23441m("hmsSdk", str2);
            return null;
        } catch (IllegalArgumentException unused3) {
            str2 = "invokeStaticFun(): Illegal Argument!";
            AbstractC10861f1.m23441m("hmsSdk", str2);
            return null;
        } catch (InvocationTargetException unused4) {
            str2 = "invokeStaticFun(): Invocation Target Exception!";
            AbstractC10861f1.m23441m("hmsSdk", str2);
            return null;
        }
    }

    /* renamed from: b */
    public static Object m8635b(String str, String str2, Class[] clsArr, Object[] objArr) {
        String str3;
        try {
            return m8634a(Class.forName(str), str2, clsArr, objArr);
        } catch (a unused) {
            str3 = "invokeStaticFun(): Static function call Exception ";
            AbstractC10861f1.m23441m("hmsSdk", str3);
            return null;
        } catch (ClassNotFoundException unused2) {
            str3 = "invokeStaticFun() Not found class!";
            AbstractC10861f1.m23441m("hmsSdk", str3);
            return null;
        }
    }

    /* renamed from: c */
    public static String m8636c() {
        return m8638e("ro.build.version.emui", "");
    }

    /* renamed from: d */
    public static String m8637d(Context context) {
        return context == null ? "" : Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    /* renamed from: e */
    public static String m8638e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String strM8639f = m8639f("android.os.SystemProperties", str, str2);
        return TextUtils.isEmpty(strM8639f) ? m8639f("com.huawei.android.os.SystemPropertiesEx", str, str2) : strM8639f;
    }

    /* renamed from: f */
    public static String m8639f(String str, String str2, String str3) {
        Object objM8635b = m8635b(str, "get", new Class[]{String.class, String.class}, new Object[]{str2, str3});
        return objM8635b != null ? (String) objM8635b : str3;
    }

    /* renamed from: g */
    public static String m8640g() {
        String strM8639f = m8639f("com.huawei.android.os.SystemPropertiesEx", "ro.huawei.build.display.id", "");
        AbstractC10861f1.m23430b("hmsSdk", "SystemPropertiesEx: get rom_ver: " + strM8639f);
        if (!TextUtils.isEmpty(strM8639f)) {
            return strM8639f;
        }
        String str = Build.DISPLAY;
        AbstractC10861f1.m23436h("hmsSdk", "SystemProperties: get rom_ver: " + str);
        return str;
    }

    /* renamed from: h */
    public static String m8641h(Context context) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("CHANNEL")) != null) {
                String string = obj.toString();
                return string.length() > 256 ? "Unknown" : string;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC10861f1.m23441m("hmsSdk", "getChannel(): The packageName is not correct!");
        }
        return "Unknown";
    }

    /* renamed from: i */
    public static String m8642i(Context context) {
        return context == null ? "" : context.getPackageName();
    }

    /* renamed from: j */
    public static String m8643j(Context context) throws PackageManager.NameNotFoundException {
        if (context == null) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(m8642i(context), 16384);
            return packageInfo != null ? packageInfo.versionName : "";
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC10861f1.m23441m("hmsSdk", "getVersion(): The package name is not correct!");
            return "";
        }
    }
}
