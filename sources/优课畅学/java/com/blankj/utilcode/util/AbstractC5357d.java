package com.blankj.utilcode.util;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: com.blankj.utilcode.util.d */
/* loaded from: classes3.dex */
public abstract class AbstractC5357d {
    /* renamed from: a */
    public static void m2435a() {
        AbstractC5372k0.m2551g();
        System.exit(0);
    }

    /* renamed from: b */
    public static String m2436b() {
        return AbstractC5366h0.m2478a().getPackageName();
    }

    /* renamed from: c */
    public static int m2437c() {
        return m2438d(AbstractC5366h0.m2478a().getPackageName());
    }

    /* renamed from: d */
    public static int m2438d(String str) throws PackageManager.NameNotFoundException {
        if (AbstractC5372k0.m2533D(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = AbstractC5366h0.m2478a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    /* renamed from: e */
    public static String m2439e() {
        return m2440f(AbstractC5366h0.m2478a().getPackageName());
    }

    /* renamed from: f */
    public static String m2440f(String str) throws PackageManager.NameNotFoundException {
        if (AbstractC5372k0.m2533D(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = AbstractC5366h0.m2478a().getPackageManager().getPackageInfo(str, 0);
            return packageInfo == null ? "" : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return "";
        }
    }
}
