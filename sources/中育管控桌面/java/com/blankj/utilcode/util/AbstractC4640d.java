package com.blankj.utilcode.util;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: com.blankj.utilcode.util.d */
/* loaded from: classes3.dex */
public abstract class AbstractC4640d {
    /* renamed from: a */
    public static void m2147a() {
        AbstractC4663o0.m2323h();
        System.exit(0);
    }

    /* renamed from: b */
    public static String m2148b() {
        return m2149c(AbstractC4657l0.m2250a().getPackageName());
    }

    /* renamed from: c */
    public static String m2149c(String str) throws PackageManager.NameNotFoundException {
        if (AbstractC4663o0.m2304G(str)) {
            return "";
        }
        try {
            PackageManager packageManager = AbstractC4657l0.m2250a().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            return packageInfo == null ? "" : packageInfo.applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException e6) {
            e6.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public static String m2150d() {
        return AbstractC4657l0.m2250a().getPackageName();
    }

    /* renamed from: e */
    public static int m2151e() {
        return m2152f(AbstractC4657l0.m2250a().getPackageName());
    }

    /* renamed from: f */
    public static int m2152f(String str) throws PackageManager.NameNotFoundException {
        if (AbstractC4663o0.m2304G(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = AbstractC4657l0.m2250a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e6) {
            e6.printStackTrace();
            return -1;
        }
    }

    /* renamed from: g */
    public static String m2153g() {
        return m2154h(AbstractC4657l0.m2250a().getPackageName());
    }

    /* renamed from: h */
    public static String m2154h(String str) throws PackageManager.NameNotFoundException {
        if (AbstractC4663o0.m2304G(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = AbstractC4657l0.m2250a().getPackageManager().getPackageInfo(str, 0);
            return packageInfo == null ? "" : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e6) {
            e6.printStackTrace();
            return "";
        }
    }

    /* renamed from: i */
    public static boolean m2155i(String str) {
        if (AbstractC4663o0.m2304G(str)) {
            return false;
        }
        try {
            return AbstractC4657l0.m2250a().getPackageManager().getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public static void m2156j(String str) {
        if (AbstractC4663o0.m2304G(str)) {
            return;
        }
        Intent intentM2334s = AbstractC4663o0.m2334s(str);
        if (intentM2334s == null) {
            Log.e("AppUtils", "Didn't exist launcher activity.");
        } else {
            AbstractC4657l0.m2250a().startActivity(intentM2334s);
        }
    }
}
