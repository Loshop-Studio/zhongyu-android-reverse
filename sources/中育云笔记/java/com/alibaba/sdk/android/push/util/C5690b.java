package com.alibaba.sdk.android.push.util;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.android.SystemUtils;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.alibaba.sdk.android.push.util.b */
/* loaded from: classes3.dex */
public class C5690b {
    /* renamed from: a */
    private static String m3821a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m3823b() {
        return m3825d() && !m3826e();
    }

    /* renamed from: c */
    public static boolean m3824c() {
        return Build.MANUFACTURER.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_VIVO);
    }

    /* renamed from: d */
    private static boolean m3825d() {
        return Build.MANUFACTURER.equalsIgnoreCase(SystemUtils.PRODUCT_HONOR);
    }

    /* renamed from: e */
    private static boolean m3826e() throws ClassNotFoundException {
        String str = "";
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.version.emui", "");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("MagicUI") || str.contains("MagicOS");
    }

    /* renamed from: a */
    public static boolean m3822a() {
        boolean zEqualsIgnoreCase = Build.BRAND.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_HUAWEI);
        if (zEqualsIgnoreCase) {
            return zEqualsIgnoreCase;
        }
        return (TextUtils.isEmpty(m3821a("ro.build.version.emui")) && TextUtils.isEmpty(m3821a("hw_sc.build.platform.version"))) ? false : true;
    }
}
