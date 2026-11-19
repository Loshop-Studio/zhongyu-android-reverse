package com.p053ta.utdid2.p058a.p059a;

import com.p053ta.p054a.p057c.C1688f;

/* renamed from: com.ta.utdid2.a.a.e */
/* loaded from: classes.dex */
public class C1693e {
    public static String get(String str, String str2) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e4) {
            C1688f.m5772b("", e4, new Object[0]);
            return str2;
        }
    }
}
