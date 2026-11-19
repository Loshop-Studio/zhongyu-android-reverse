package com.umeng.analytics.pro;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.umeng.analytics.pro.av */
/* loaded from: classes.dex */
public class C1864av {
    /* renamed from: a */
    public static InterfaceC1863au m6921a(Class<? extends InterfaceC1863au> cls, int i4) {
        try {
            return (InterfaceC1863au) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i4));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
