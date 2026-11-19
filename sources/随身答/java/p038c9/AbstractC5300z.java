package p038c9;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: c9.z */
/* loaded from: classes5.dex */
public abstract class AbstractC5300z {
    /* renamed from: b */
    public static AbstractC5300z m2543b(C5299y c5299y, Method method) {
        C5297w c5297wM2505b = C5297w.m2505b(c5299y, method);
        Type genericReturnType = method.getGenericReturnType();
        if (AbstractC5277c0.m2434j(genericReturnType)) {
            throw AbstractC5277c0.m2437m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return AbstractC5284j.m2455f(c5299y, method, c5297wM2505b);
        }
        throw AbstractC5277c0.m2437m(method, "Service methods cannot return void.", new Object[0]);
    }

    /* renamed from: a */
    public abstract Object mo2456a(Object[] objArr);
}
