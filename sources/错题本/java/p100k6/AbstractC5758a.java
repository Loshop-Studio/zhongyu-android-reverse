package p100k6;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: k6.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5758a {

    /* renamed from: a */
    public static final Method f9108a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC5830k.m5327d(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (AbstractC5830k.m5325b(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC5830k.m5329f(parameterTypes, "getParameterTypes(...)");
                if (AbstractC5830k.m5325b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f9108a = method;
        int length2 = methods.length;
        for (int i8 = 0; i8 < length2 && !AbstractC5830k.m5325b(methods[i8].getName(), "getSuppressed"); i8++) {
        }
    }
}
