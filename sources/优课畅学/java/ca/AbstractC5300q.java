package ca;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: ca.q */
/* loaded from: classes5.dex */
public abstract class AbstractC5300q {

    /* renamed from: a */
    public static Constructor f2523a;

    /* renamed from: a */
    public static Object m2310a(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException, SecurityException {
        Constructor declaredConstructor = f2523a;
        if (declaredConstructor == null) {
            declaredConstructor = AbstractC5295l.m2305a().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f2523a = declaredConstructor;
        }
        return AbstractC5296m.m2306a(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
