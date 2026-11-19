package p200z5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: z5.q */
/* loaded from: classes4.dex */
public abstract class AbstractC7976q {

    /* renamed from: a */
    public static Constructor f10784a;

    /* renamed from: a */
    public static Object m9850a(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException, SecurityException {
        Constructor declaredConstructor = f10784a;
        if (declaredConstructor == null) {
            declaredConstructor = AbstractC7971l.m9845a().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f10784a = declaredConstructor;
        }
        return AbstractC7972m.m9846a(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
