package com.huawei.hms.framework.common;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes5.dex */
public class ReflectionUtils {

    /* renamed from: a */
    public static int f11647a;

    /* renamed from: a */
    public static Class m8600a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Object m8601b(Object obj, Method method, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (RuntimeException e10) {
            Logger.m8574e("ReflectionUtils", "RuntimeException in invoke:", e10);
            return null;
        } catch (Exception e11) {
            Logger.m8574e("ReflectionUtils", "Exception in invoke:", e11);
            return null;
        }
    }

    /* renamed from: c */
    public static void m8602c(Class[] clsArr, Object obj, int i10) {
        if (obj instanceof Integer) {
            clsArr[i10] = Integer.TYPE;
            return;
        }
        if (obj instanceof Long) {
            clsArr[i10] = Long.TYPE;
            return;
        }
        if (obj instanceof Double) {
            clsArr[i10] = Double.TYPE;
            return;
        }
        if (obj instanceof Float) {
            clsArr[i10] = Float.TYPE;
            return;
        }
        if (obj instanceof Boolean) {
            clsArr[i10] = Boolean.TYPE;
            return;
        }
        if (obj instanceof Character) {
            clsArr[i10] = Character.TYPE;
            return;
        }
        if (obj instanceof Byte) {
            clsArr[i10] = Byte.TYPE;
            return;
        }
        if (obj instanceof Void) {
            clsArr[i10] = Void.TYPE;
        } else if (obj instanceof Short) {
            clsArr[i10] = Short.TYPE;
        } else {
            clsArr[i10] = obj.getClass();
        }
    }

    public static boolean checkCompatible(String str) {
        try {
            m8603d(str);
            return true;
        } catch (Exception unused) {
            Logger.m8588w("ReflectionUtils", str + "ClassNotFoundException");
            return false;
        }
    }

    /* renamed from: d */
    public static void m8603d(String str) throws ClassNotFoundException {
        ClassLoader classLoader = ReflectionUtils.class.getClassLoader();
        if (classLoader == null) {
            throw new ClassNotFoundException("not found classloader");
        }
        classLoader.loadClass(str);
    }

    public static Field getField(Object obj, String str) throws NoSuchFieldException {
        if (obj != null && !TextUtils.isEmpty(str)) {
            try {
                final Field declaredField = obj.getClass().getDeclaredField(str);
                AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.ReflectionUtils.2
                    @Override // java.security.PrivilegedAction
                    public Object run() throws SecurityException {
                        declaredField.setAccessible(true);
                        return null;
                    }
                });
                return declaredField;
            } catch (IllegalArgumentException e10) {
                Logger.m8574e("ReflectionUtils", "Exception in getField :: IllegalArgumentException:", e10);
            } catch (NoSuchFieldException e11) {
                Logger.m8574e("ReflectionUtils", "Exception in getField :: NoSuchFieldException:", e11);
            } catch (SecurityException e12) {
                Logger.m8574e("ReflectionUtils", "not security int method getField,SecurityException:", e12);
            }
        }
        return null;
    }

    public static Object getFieldObj(Object obj, String str) throws NoSuchFieldException {
        if (obj != null && !TextUtils.isEmpty(str)) {
            try {
                final Field declaredField = obj.getClass().getDeclaredField(str);
                AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.ReflectionUtils.1
                    @Override // java.security.PrivilegedAction
                    public Object run() throws SecurityException {
                        declaredField.setAccessible(true);
                        return null;
                    }
                });
                return declaredField.get(obj);
            } catch (IllegalAccessException e10) {
                Logger.m8574e("ReflectionUtils", "Exception in getFieldObj :: IllegalAccessException:", e10);
            } catch (IllegalArgumentException e11) {
                Logger.m8574e("ReflectionUtils", "Exception in getFieldObj :: IllegalArgumentException:", e11);
            } catch (NoSuchFieldException e12) {
                Logger.m8574e("ReflectionUtils", "Exception in getFieldObj :: NoSuchFieldException:", e12);
            } catch (SecurityException e13) {
                Logger.m8574e("ReflectionUtils", "not security int method getFieldObj,SecurityException:", e13);
            }
        }
        return null;
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null || str == null) {
            Logger.m8588w("ReflectionUtils", "targetClass is  null pr name is null:");
            return null;
        }
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            Logger.m8574e("ReflectionUtils", "NoSuchMethodException:", e10);
            return null;
        } catch (SecurityException e11) {
            Logger.m8574e("ReflectionUtils", "SecurityException:", e11);
            return null;
        }
    }

    public static Object getStaticFieldObj(String str, String str2) throws NoSuchFieldException {
        Class clsM8600a;
        if (str != null && (clsM8600a = m8600a(str)) != null && !TextUtils.isEmpty(str2)) {
            try {
                final Field declaredField = clsM8600a.getDeclaredField(str2);
                AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.ReflectionUtils.3
                    @Override // java.security.PrivilegedAction
                    public Object run() throws SecurityException {
                        declaredField.setAccessible(true);
                        return null;
                    }
                });
                return declaredField.get(clsM8600a);
            } catch (IllegalAccessException e10) {
                Logger.m8574e("ReflectionUtils", "Exception in getFieldObj :: IllegalAccessException:", e10);
            } catch (IllegalArgumentException e11) {
                Logger.m8574e("ReflectionUtils", "Exception in getFieldObj :: IllegalArgumentException:", e11);
            } catch (NoSuchFieldException e12) {
                Logger.m8574e("ReflectionUtils", "Exception in getFieldObj :: NoSuchFieldException:", e12);
            } catch (SecurityException e13) {
                Logger.m8574e("ReflectionUtils", "not security int method getStaticFieldObj,SecurityException:", e13);
            }
        }
        return null;
    }

    public static Object invokeStaticMethod(String str, String str2, Object... objArr) {
        Class[] clsArr;
        if (str == null) {
            return null;
        }
        if (objArr != null) {
            int length = objArr.length;
            clsArr = new Class[length];
            for (int i10 = 0; i10 < length; i10++) {
                m8602c(clsArr, objArr[i10], i10);
            }
        } else {
            clsArr = null;
        }
        Method method = getMethod(m8600a(str), str2, clsArr);
        if (method == null) {
            return null;
        }
        return m8601b(null, method, objArr);
    }

    public static boolean isAbTestEnable() {
        int i10 = f11647a;
        if (i10 != 0) {
            return i10 == 2;
        }
        boolean zCheckCompatible = checkCompatible("com.huawei.hms.network.abtest.ABHelper");
        f11647a = zCheckCompatible ? 2 : 1;
        return zCheckCompatible;
    }

    public static boolean checkCompatible(String str, String str2, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        try {
            if (str == null || str2 == null) {
                Logger.m8588w("ReflectionUtils", "targetClass is  null or name is null:");
                return false;
            }
            Class.forName(str).getDeclaredMethod(str2, clsArr);
            Logger.m8586v("ReflectionUtils", "has method : " + str2);
            return true;
        } catch (RuntimeException unused) {
            Logger.m8588w("ReflectionUtils", str + " RuntimeException");
            return false;
        } catch (Exception unused2) {
            Logger.m8588w("ReflectionUtils", str2 + " NoSuchMethodException");
            return false;
        }
    }

    public static Object invokeStaticMethod(String str, String str2, Class<?>[] clsArr, Object... objArr) {
        Method method = getMethod(m8600a(str), str2, clsArr);
        if (method == null) {
            return null;
        }
        return m8601b(null, method, objArr);
    }
}
