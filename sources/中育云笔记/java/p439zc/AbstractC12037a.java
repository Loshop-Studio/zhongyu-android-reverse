package p439zc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.random.Random;
import p239ld.C10184b;
import p325rc.AbstractC10968r;

/* renamed from: zc.a */
/* loaded from: classes6.dex */
public abstract class AbstractC12037a {

    /* renamed from: zc.a$a */
    public static final class a {

        /* renamed from: a */
        public static final a f28409a = new a();

        /* renamed from: b */
        public static final Method f28410b;

        /* renamed from: c */
        public static final Method f28411c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            AbstractC9979u.m20291d(methods);
            int length = methods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (AbstractC9979u.m20289b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC9979u.m20293f(parameterTypes, "getParameterTypes(...)");
                    if (AbstractC9979u.m20289b(AbstractC10968r.m24067Z0(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i11++;
            }
            f28410b = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (AbstractC9979u.m20289b(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f28411c = method;
        }
    }

    /* renamed from: a */
    public void mo278a(Throwable cause, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(cause, "cause");
        AbstractC9979u.m20294g(exception, "exception");
        Method method = a.f28410b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    /* renamed from: b */
    public Random mo2739b() {
        return new C10184b();
    }
}
