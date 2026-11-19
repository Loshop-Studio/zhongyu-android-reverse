package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C1908i;
import com.umeng.common.C1938b;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.utils.UMUtils;

/* loaded from: classes.dex */
public class AnalyticsConfig {
    public static boolean CATCH_EXCEPTION = false;
    public static boolean CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    public static boolean CLEAR_EKV_BL = false;
    public static boolean CLEAR_EKV_WL = false;
    public static String GPU_RENDERER = "";
    public static String GPU_VENDER = "";

    /* renamed from: a */
    static double[] f8143a = null;

    /* renamed from: b */
    private static String f8144b = null;

    /* renamed from: c */
    private static String f8145c = null;

    /* renamed from: d */
    private static String f8146d = null;

    /* renamed from: e */
    private static int f8147e = 0;
    public static boolean enable = true;
    public static long kContinueSessionMillis = 30000;
    public static String mWrapperType;
    public static String mWrapperVersion;

    /* renamed from: a */
    static void m6678a(String str) {
        f8145c = str;
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
        return f8143a;
    }

    public static String getSecretKey(Context context) {
        if (TextUtils.isEmpty(f8146d)) {
            f8146d = C1938b.m7305a(context).m7312c();
        }
        return f8146d;
    }

    public static int getVerticalType(Context context) {
        if (f8147e == 0) {
            f8147e = C1938b.m7305a(context).m7313d();
        }
        return f8147e;
    }

    /* renamed from: a */
    static void m6677a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            UMLog.m7349aq(C1908i.f8733A, 0, "\\|");
        } else {
            f8146d = str;
            C1938b.m7305a(context).m7308a(f8146d);
        }
    }

    /* renamed from: a */
    static void m6676a(Context context, int i4) {
        f8147e = i4;
        C1938b.m7305a(context).m7307a(f8147e);
    }
}
