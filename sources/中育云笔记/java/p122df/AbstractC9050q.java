package p122df;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: df.q */
/* loaded from: classes6.dex */
public abstract class AbstractC9050q {

    /* renamed from: a */
    public static Constructor f21132a;

    /* renamed from: a */
    public static Object m17768a(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException, SecurityException {
        Constructor declaredConstructor = f21132a;
        if (declaredConstructor == null) {
            declaredConstructor = AbstractC9045l.m17763a().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f21132a = declaredConstructor;
        }
        return AbstractC9046m.m17764a(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
