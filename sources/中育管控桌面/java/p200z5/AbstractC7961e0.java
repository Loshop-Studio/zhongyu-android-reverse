package p200z5;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: z5.e0 */
/* loaded from: classes4.dex */
public abstract class AbstractC7961e0 {
    /* renamed from: b */
    public static AbstractC7961e0 m9813b(C7959d0 c7959d0, Class cls, Method method) {
        C7955b0 c7955b0M9769b = C7955b0.m9769b(c7959d0, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (AbstractC7967h0.m9830j(genericReturnType)) {
            throw AbstractC7967h0.m9834n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return AbstractC7977r.m9853f(c7959d0, method, c7955b0M9769b);
        }
        throw AbstractC7967h0.m9834n(method, "Service methods cannot return void.", new Object[0]);
    }

    /* renamed from: a */
    public abstract Object mo9814a(Object obj, Object[] objArr);
}
