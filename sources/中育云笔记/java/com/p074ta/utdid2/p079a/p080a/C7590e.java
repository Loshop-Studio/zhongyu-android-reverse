package com.p074ta.utdid2.p079a.p080a;

import com.p074ta.p075a.p078c.C7585f;

/* renamed from: com.ta.utdid2.a.a.e */
/* loaded from: classes5.dex */
public class C7590e {
    public static String get(String str, String str2) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e10) {
            C7585f.m9798b("", e10, new Object[0]);
            return str2;
        }
    }
}
