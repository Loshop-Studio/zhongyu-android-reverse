package com.huawei.hms.framework.common;

import android.text.TextUtils;

/* loaded from: classes5.dex */
public class SystemPropUtils {

    /* renamed from: a */
    public static final String f11654a = "SystemPropUtils";

    public static String getProperty(String str, String str2, String str3, String str4) throws ClassNotFoundException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            Logger.m8588w(f11654a, "reflect class for method has exception.");
            return str4;
        }
        try {
            Class<?> cls = Class.forName(str3);
            return (String) cls.getMethod(str, String.class, String.class).invoke(cls, str2, str4);
        } catch (Exception e10) {
            Logger.m8574e(f11654a, "getProperty catch exception: ", e10);
            return str4;
        }
    }
}
