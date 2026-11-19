package com.taobao.sophix.p069e;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.taobao.sophix.e.h */
/* loaded from: classes4.dex */
public class C6641h {

    /* renamed from: a */
    public static Class f5550a = m4900a("android.app.ContextImpl");

    /* renamed from: b */
    public static Class f5551b = m4900a("android.app.ActivityThread");

    /* renamed from: a */
    private static Class m4900a(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e10) {
            C6638e.m4887b("ReflectUtil", "fail to reflect", e10, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static Method m4903a(Class cls, String str, Class... clsArr) throws NoSuchMethodException, SecurityException {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod;
    }

    /* renamed from: a */
    public static Constructor m4901a(Class cls, Class... clsArr) throws NoSuchMethodException, SecurityException {
        Constructor declaredConstructor = cls.getDeclaredConstructor(clsArr);
        if (!declaredConstructor.isAccessible()) {
            declaredConstructor.setAccessible(true);
        }
        return declaredConstructor;
    }

    /* renamed from: a */
    public static Field m4902a(Class cls, String str) throws NoSuchFieldException, SecurityException {
        Field declaredField = cls.getDeclaredField(str);
        if (!declaredField.isAccessible()) {
            declaredField.setAccessible(true);
        }
        return declaredField;
    }
}
