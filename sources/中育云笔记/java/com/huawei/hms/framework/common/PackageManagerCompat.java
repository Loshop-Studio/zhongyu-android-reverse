package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class PackageManagerCompat {

    /* renamed from: a */
    public static String f11646a = "";

    /* renamed from: a */
    public static Bundle m8597a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager;
        Bundle bundle = Bundle.EMPTY;
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        if (context != null && (packageManager = context.getPackageManager()) != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null) {
                    Bundle bundle2 = applicationInfo.metaData;
                    if (bundle2 != null) {
                        return bundle2;
                    }
                }
            } catch (PackageManager.NameNotFoundException | RuntimeException e10) {
                Logger.m8589w("PackageUtils", "NameNotFoundException:", e10);
                return bundle;
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m8598b(Context context) {
        if (ContextHolder.getKitContext() != null) {
            context = ContextHolder.getKitContext();
        }
        if (context == null) {
            Logger.m8586v("PackageUtils", "the kitContext is null");
            return Bundle.EMPTY;
        }
        if (context.getApplicationInfo() == null) {
            Logger.m8586v("PackageUtils", "the kit applicationInfo is null");
            return Bundle.EMPTY;
        }
        Logger.m8580i("PackageUtils", "kitContext: " + context.getPackageName());
        Bundle bundle = context.getApplicationInfo().metaData;
        return bundle == null ? Bundle.EMPTY : bundle;
    }

    /* renamed from: c */
    public static Bundle m8599c(Context context) {
        Bundle bundleM8598b = m8598b(context);
        return (bundleM8598b == null || bundleM8598b.isEmpty()) ? m8597a(context) : bundleM8598b;
    }

    public static String getAppPackageName(Context context) {
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "";
        }
        try {
            return packageManager.getPackageInfo(context.getPackageName(), 16384).packageName;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            Logger.m8588w("PackageUtils", "Failed to get Package managers Package Info");
            return "";
        }
    }

    public static String getAppVersion(Context context) {
        if (!TextUtils.isEmpty(f11646a)) {
            return f11646a;
        }
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return f11646a;
        }
        try {
            f11646a = String.valueOf(packageManager.getPackageInfo(context.getPackageName(), 16384).versionCode);
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            Logger.m8588w("PackageUtils", "Failed to get Package managers Package Info");
        }
        return f11646a;
    }

    public static String getMetaDataFromApp(Context context, String str, String str2) throws PackageManager.NameNotFoundException {
        Bundle bundleM8597a = m8597a(context);
        return bundleM8597a != null ? bundleM8597a.getString(str, str2) : str2;
    }

    public static String getMetaDataFromKit(Context context, String str, String str2) {
        try {
            Bundle bundleM8598b = m8598b(context);
            return bundleM8598b == null ? str2 : bundleM8598b.getString(str, str2);
        } catch (RuntimeException unused) {
            Logger.m8586v("PackageUtils", "the kit metaData is runtimeException");
            return str2;
        }
    }

    public static String getMetaDataFromKitOrApp(Context context, String str, String str2) {
        return m8599c(context).getString(str, str2);
    }

    public static Map<String, String> getMetaDataMapFromKitOrApp(Context context, String str) {
        HashMap map = new HashMap();
        Bundle bundleM8599c = m8599c(context);
        for (String str2 : bundleM8599c.keySet()) {
            if (str2.startsWith(str)) {
                String string = bundleM8599c.getString(str2);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str2.substring(str.length()), string);
                }
            }
        }
        return map;
    }
}
