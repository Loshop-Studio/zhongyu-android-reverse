package com.umeng.analytics.pro;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.umeng.analytics.pro.av */
/* loaded from: classes2.dex */
public class C3348av {
    /* renamed from: a */
    public static InterfaceC3347au m2998a(Class<? extends InterfaceC3347au> cls, int i4) {
        try {
            return (InterfaceC3347au) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i4));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
