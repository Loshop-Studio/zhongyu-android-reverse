package p122df;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: df.e0 */
/* loaded from: classes6.dex */
public abstract class AbstractC9035e0 {
    /* renamed from: b */
    public static AbstractC9035e0 m17732b(C9033d0 c9033d0, Class cls, Method method) {
        C9029b0 c9029b0M17688b = C9029b0.m17688b(c9033d0, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (AbstractC9041h0.m17748j(genericReturnType)) {
            throw AbstractC9041h0.m17752n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return AbstractC9051r.m17771f(c9033d0, method, c9029b0M17688b);
        }
        throw AbstractC9041h0.m17752n(method, "Service methods cannot return void.", new Object[0]);
    }

    /* renamed from: a */
    public abstract Object mo17733a(Object obj, Object[] objArr);
}
