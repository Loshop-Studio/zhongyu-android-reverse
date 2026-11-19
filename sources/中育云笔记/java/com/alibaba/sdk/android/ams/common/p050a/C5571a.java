package com.alibaba.sdk.android.ams.common.p050a;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;

/* renamed from: com.alibaba.sdk.android.ams.common.a.a */
/* loaded from: classes3.dex */
public class C5571a {

    /* renamed from: a */
    static volatile Context f3992a = null;

    /* renamed from: b */
    static volatile Application f3993b = null;

    /* renamed from: c */
    static volatile boolean f3994c = false;

    /* renamed from: d */
    static volatile String f3995d;

    /* renamed from: e */
    static volatile String f3996e;

    /* renamed from: f */
    static volatile String f3997f;

    /* renamed from: a */
    public static Context m3382a() {
        return f3992a;
    }

    /* renamed from: b */
    public static boolean m3384b() {
        return f3994c;
    }

    /* renamed from: c */
    public static String m3385c() {
        return f3995d == null ? "mpush-api.aliyun.com" : f3995d;
    }

    /* renamed from: d */
    public static String m3386d() {
        return f3996e == null ? "msgacs.cn-zhangjiakou.aliyuncs.com" : f3996e;
    }

    /* renamed from: e */
    public static String m3387e() {
        return f3997f == null ? "jmacs.cn-zhangjiakou.aliyuncs.com" : f3997f;
    }

    /* renamed from: f */
    public static boolean m3388f() {
        return m3385c().equals("mpush-api.aliyun.com");
    }

    /* renamed from: g */
    public static String m3389g() {
        return "https://" + m3385c() + "/config";
    }

    /* renamed from: h */
    public static SharedPreferences m3390h() {
        return PreferenceManager.getDefaultSharedPreferences(f3992a);
    }

    /* renamed from: i */
    public static String m3391i() {
        return f3992a.getPackageName();
    }

    /* renamed from: a */
    public static String m3383a(String str) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = f3992a.getPackageManager().getApplicationInfo(f3992a.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(str)) {
                return null;
            }
            return String.valueOf(applicationInfo.metaData.get(str));
        } catch (PackageManager.NameNotFoundException unused) {
            AmsLogger.getImportantLogger().m3420e("Meta data name " + str + " not found!");
            return null;
        }
    }
}
