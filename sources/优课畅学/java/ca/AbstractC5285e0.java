package ca;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: ca.e0 */
/* loaded from: classes5.dex */
public abstract class AbstractC5285e0 {
    /* renamed from: b */
    public static AbstractC5285e0 m2271b(C5283d0 c5283d0, Class cls, Method method) {
        C5279b0 c5279b0M2227b = C5279b0.m2227b(c5283d0, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (AbstractC5291h0.m2290j(genericReturnType)) {
            throw AbstractC5291h0.m2294n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return AbstractC5301r.m2313f(c5283d0, method, c5279b0M2227b);
        }
        throw AbstractC5291h0.m2294n(method, "Service methods cannot return void.", new Object[0]);
    }

    /* renamed from: a */
    public abstract Object mo2272a(Object obj, Object[] objArr);
}
