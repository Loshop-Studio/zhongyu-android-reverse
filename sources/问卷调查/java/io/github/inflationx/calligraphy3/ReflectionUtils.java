package io.github.inflationx.calligraphy3;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ReflectionUtils {
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
        String str;
        String str2;
        if (method == null) {
            return;
        }
        try {
            method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            e = e2;
            str = TAG;
            str2 = "Can't access method using reflection";
            Log.d(str, str2, e);
        } catch (InvocationTargetException e3) {
            e = e3;
            str = TAG;
            str2 = "Can't invoke method using reflection";
            Log.d(str, str2, e);
        }
    }
}
