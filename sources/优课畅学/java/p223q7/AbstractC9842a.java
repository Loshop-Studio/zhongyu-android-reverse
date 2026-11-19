package p223q7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.random.Random;
import p028b8.C5211b;
import p134i7.AbstractC8801r;

/* renamed from: q7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9842a {

    /* renamed from: q7.a$a */
    public static final class a {

        /* renamed from: a */
        public static final a f19645a = new a();

        /* renamed from: b */
        public static final Method f19646b;

        /* renamed from: c */
        public static final Method f19647c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            AbstractC9133u.m16130d(methods);
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
                if (AbstractC9133u.m16128b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC9133u.m16132f(parameterTypes, "getParameterTypes(...)");
                    if (AbstractC9133u.m16128b(AbstractC8801r.m14702d1(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i11++;
            }
            f19646b = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (AbstractC9133u.m16128b(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f19647c = method;
        }
    }

    /* renamed from: a */
    public void mo18364a(Throwable cause, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(cause, "cause");
        AbstractC9133u.m16133g(exception, "exception");
        Method method = a.f19646b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    /* renamed from: b */
    public Random mo18365b() {
        return new C5211b();
    }
}
