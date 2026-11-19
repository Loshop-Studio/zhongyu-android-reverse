package com.taobao.sophix.p099e;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.taobao.sophix.e.h */
/* loaded from: classes5.dex */
public class C7747h {

    /* renamed from: a */
    public static Class f13415a = m10412a("android.app.ContextImpl");

    /* renamed from: b */
    public static Class f13416b = m10412a("android.app.ActivityThread");

    /* renamed from: a */
    private static Class m10412a(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e10) {
            C7744e.m10399b("ReflectUtil", "fail to reflect", e10, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static Method m10415a(Class cls, String str, Class... clsArr) throws NoSuchMethodException, SecurityException {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod;
    }

    /* renamed from: a */
    public static Constructor m10413a(Class cls, Class... clsArr) throws NoSuchMethodException, SecurityException {
        Constructor declaredConstructor = cls.getDeclaredConstructor(clsArr);
        if (!declaredConstructor.isAccessible()) {
            declaredConstructor.setAccessible(true);
        }
        return declaredConstructor;
    }

    /* renamed from: a */
    public static Field m10414a(Class cls, String str) throws NoSuchFieldException, SecurityException {
        Field declaredField = cls.getDeclaredField(str);
        if (!declaredField.isAccessible()) {
            declaredField.setAccessible(true);
        }
        return declaredField;
    }
}
