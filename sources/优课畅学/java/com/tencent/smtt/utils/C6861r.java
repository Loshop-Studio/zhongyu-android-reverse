package com.tencent.smtt.utils;

import android.text.TextUtils;
import java.lang.reflect.Method;

/* renamed from: com.tencent.smtt.utils.r */
/* loaded from: classes4.dex */
public class C6861r {

    /* renamed from: a */
    private static Class f6999a;

    /* renamed from: b */
    private static Method f7000b;

    static {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            f6999a = cls;
            f7000b = cls.getDeclaredMethod("get", String.class, String.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static String m6352a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : m6353b(str, str2);
    }

    /* renamed from: b */
    private static String m6353b(String str, String str2) {
        Method method;
        Class cls = f6999a;
        if (cls != null && (method = f7000b) != null) {
            try {
                return (String) method.invoke(cls, str, str2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return str2;
    }
}
