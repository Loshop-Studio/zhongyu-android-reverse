package com.alibaba.sdk.android.ams.common.p020a;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.alibaba.sdk.android.ams.common.logger.AmsLogger;

/* renamed from: com.alibaba.sdk.android.ams.common.a.a */
/* loaded from: classes.dex */
public class C1096a {

    /* renamed from: a */
    static volatile Context f6507a = null;

    /* renamed from: b */
    static volatile Application f6508b = null;

    /* renamed from: c */
    static volatile boolean f6509c = false;

    /* renamed from: d */
    static volatile String f6510d;

    /* renamed from: e */
    static volatile String f6511e;

    /* renamed from: f */
    static volatile String f6512f;

    /* renamed from: a */
    public static Context m4981a() {
        return f6507a;
    }

    /* renamed from: a */
    public static String m4982a(String str) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = f6507a.getPackageManager().getApplicationInfo(f6507a.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(str)) {
                return null;
            }
            return String.valueOf(applicationInfo.metaData.get(str));
        } catch (PackageManager.NameNotFoundException unused) {
            AmsLogger.getImportantLogger().m5019e("Meta data name " + str + " not found!");
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m4983b() {
        return f6509c;
    }

    /* renamed from: c */
    public static String m4984c() {
        return f6510d == null ? "mpush-api.aliyun.com" : f6510d;
    }

    /* renamed from: d */
    public static String m4985d() {
        return f6511e == null ? "msgacs.cn-zhangjiakou.aliyuncs.com" : f6511e;
    }

    /* renamed from: e */
    public static String m4986e() {
        return f6512f == null ? "jmacs.cn-zhangjiakou.aliyuncs.com" : f6512f;
    }

    /* renamed from: f */
    public static boolean m4987f() {
        return m4984c().equals("mpush-api.aliyun.com");
    }

    /* renamed from: g */
    public static String m4988g() {
        return "https://" + m4984c() + "/config";
    }

    /* renamed from: h */
    public static SharedPreferences m4989h() {
        return PreferenceManager.getDefaultSharedPreferences(f6507a);
    }

    /* renamed from: i */
    public static String m4990i() {
        return f6507a.getPackageName();
    }
}
