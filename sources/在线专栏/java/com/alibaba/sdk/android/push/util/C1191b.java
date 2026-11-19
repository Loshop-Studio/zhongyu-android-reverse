package com.alibaba.sdk.android.push.util;

import android.os.Build;
import android.text.TextUtils;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.alibaba.sdk.android.push.util.b */
/* loaded from: classes.dex */
public class C1191b {
    /* renamed from: a */
    private static String m5369a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static boolean m5370a() {
        boolean zEqualsIgnoreCase = Build.BRAND.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_HUAWEI);
        if (zEqualsIgnoreCase) {
            return zEqualsIgnoreCase;
        }
        return (TextUtils.isEmpty(m5369a("ro.build.version.emui")) && TextUtils.isEmpty(m5369a("hw_sc.build.platform.version"))) ? false : true;
    }

    /* renamed from: b */
    public static boolean m5371b() {
        return m5373d() && !m5374e();
    }

    /* renamed from: c */
    public static boolean m5372c() {
        return Build.MANUFACTURER.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_VIVO);
    }

    /* renamed from: d */
    private static boolean m5373d() {
        return Build.MANUFACTURER.equalsIgnoreCase("HONOR");
    }

    /* renamed from: e */
    private static boolean m5374e() throws ClassNotFoundException {
        String str = "";
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.version.emui", "");
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return !TextUtils.isEmpty(str) && (str.contains("MagicUI") || str.contains("MagicOS"));
    }
}
