package p226r9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: r9.q */
/* loaded from: classes5.dex */
public abstract class AbstractC9076q {

    /* renamed from: a */
    public static Constructor f15629a;

    /* renamed from: a */
    public static Object m15308a(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException, SecurityException {
        Constructor declaredConstructor = f15629a;
        if (declaredConstructor == null) {
            declaredConstructor = AbstractC9071l.m15303a().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f15629a = declaredConstructor;
        }
        return AbstractC9072m.m15304a(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
