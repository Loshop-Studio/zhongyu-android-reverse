package com.taobao.sophix.p052e;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.taobao.sophix.e.h */
/* loaded from: classes4.dex */
public class C6381h {

    /* renamed from: a */
    public static Class f4973a = m4721a("android.app.ContextImpl");

    /* renamed from: b */
    public static Class f4974b = m4721a("android.app.ActivityThread");

    /* renamed from: a */
    private static Class m4721a(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e10) {
            C6378e.m4708b("ReflectUtil", "fail to reflect", e10, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static Method m4724a(Class cls, String str, Class... clsArr) throws NoSuchMethodException, SecurityException {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod;
    }

    /* renamed from: a */
    public static Constructor m4722a(Class cls, Class... clsArr) throws NoSuchMethodException, SecurityException {
        Constructor declaredConstructor = cls.getDeclaredConstructor(clsArr);
        if (!declaredConstructor.isAccessible()) {
            declaredConstructor.setAccessible(true);
        }
        return declaredConstructor;
    }

    /* renamed from: a */
    public static Field m4723a(Class cls, String str) throws NoSuchFieldException, SecurityException {
        Field declaredField = cls.getDeclaredField(str);
        if (!declaredField.isAccessible()) {
            declaredField.setAccessible(true);
        }
        return declaredField;
    }
}
