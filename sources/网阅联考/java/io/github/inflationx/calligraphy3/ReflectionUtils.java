package io.github.inflationx.calligraphy3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class ReflectionUtils {
    private static final String TAG = "ReflectionUtils";

    public static Method getMethod(Class cls, String str) throws SecurityException {
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    public static void invokeMethod(Object obj, Method method, Object... objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (method == null) {
            return;
        }
        try {
            method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
