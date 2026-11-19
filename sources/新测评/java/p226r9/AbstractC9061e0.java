package p226r9;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: r9.e0 */
/* loaded from: classes5.dex */
public abstract class AbstractC9061e0 {
    /* renamed from: b */
    public static AbstractC9061e0 m15269b(C9059d0 c9059d0, Class cls, Method method) {
        C9055b0 c9055b0M15226b = C9055b0.m15226b(c9059d0, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (AbstractC9067h0.m15288j(genericReturnType)) {
            throw AbstractC9067h0.m15292n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return AbstractC9077r.m15311f(c9059d0, method, c9055b0M15226b);
        }
        throw AbstractC9067h0.m15292n(method, "Service methods cannot return void.", new Object[0]);
    }

    /* renamed from: a */
    public abstract Object mo15270a(Object obj, Object[] objArr);
}
