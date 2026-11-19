package p080j3;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: j3.f0 */
/* loaded from: classes2.dex */
public abstract class AbstractC3816f0 {
    /* renamed from: b */
    public static AbstractC3816f0 m5044b(C3814e0 c3814e0, Method method) {
        C3810c0 c3810c0M5003b = C3810c0.m5003b(c3814e0, method);
        Type genericReturnType = method.getGenericReturnType();
        if (AbstractC3822i0.m5062j(genericReturnType)) {
            throw AbstractC3822i0.m5065m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return AbstractC3826m.m5080f(c3814e0, method, c3810c0M5003b);
        }
        throw AbstractC3822i0.m5065m(method, "Service methods cannot return void.", new Object[0]);
    }

    /* renamed from: a */
    public abstract Object mo5045a(Object[] objArr);
}
