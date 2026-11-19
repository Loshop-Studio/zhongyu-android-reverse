package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3392i;
import com.umeng.common.C3422b;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.utils.UMUtils;

/* loaded from: classes2.dex */
public class AnalyticsConfig {
    public static boolean CATCH_EXCEPTION = false;
    public static boolean CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    public static boolean CLEAR_EKV_BL = false;
    public static boolean CLEAR_EKV_WL = false;
    public static String GPU_RENDERER = "";
    public static String GPU_VENDER = "";

    /* renamed from: a */
    static double[] f1551a = null;

    /* renamed from: b */
    private static String f1552b = null;

    /* renamed from: c */
    private static String f1553c = null;

    /* renamed from: d */
    private static String f1554d = null;

    /* renamed from: e */
    private static int f1555e = 0;
    public static boolean enable = true;
    public static long kContinueSessionMillis = 30000;
    public static String mWrapperType;
    public static String mWrapperVersion;

    /* renamed from: a */
    public static void m2755a(String str) {
        f1553c = str;
    }

    public static String getAppkey(Context context) {
        return UMUtils.getAppkey(context);
    }

    public static String getChannel(Context context) {
        return UMUtils.getChannel(context);
    }

    public static String getGameSdkVersion(Context context) {
        try {
            Class<?> cls = Class.forName("com.umeng.analytics.game.GameSdkVersion");
            return (String) cls.getDeclaredField("SDK_VERSION").get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static double[] getLocation() {
        return f1551a;
    }

    public static String getSecretKey(Context context) {
        if (TextUtils.isEmpty(f1554d)) {
            f1554d = C3422b.m3382a(context).m3389c();
        }
        return f1554d;
    }

    public static int getVerticalType(Context context) {
        if (f1555e == 0) {
            f1555e = C3422b.m3382a(context).m3390d();
        }
        return f1555e;
    }

    /* renamed from: a */
    public static void m2754a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            UMLog.m3426aq(C3392i.f2141A, 0, "\\|");
        } else {
            f1554d = str;
            C3422b.m3382a(context).m3385a(f1554d);
        }
    }

    /* renamed from: a */
    public static void m2753a(Context context, int i4) {
        f1555e = i4;
        C3422b.m3382a(context).m3384a(f1555e);
    }
}
