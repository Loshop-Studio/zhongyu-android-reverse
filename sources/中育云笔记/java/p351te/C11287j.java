package p351te;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: te.j */
/* loaded from: classes6.dex */
public final class C11287j {

    /* renamed from: d */
    public static final a f27106d = new a(null);

    /* renamed from: a */
    public final Method f27107a;

    /* renamed from: b */
    public final Method f27108b;

    /* renamed from: c */
    public final Method f27109c;

    /* renamed from: te.j$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C11287j m25240a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new C11287j(method3, method2, method);
        }

        public a() {
        }
    }

    public C11287j(Method method, Method method2, Method method3) {
        this.f27107a = method;
        this.f27108b = method2;
        this.f27109c = method3;
    }

    /* renamed from: a */
    public final Object m25238a(String closer) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(closer, "closer");
        Method method = this.f27107a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = this.f27108b;
                AbstractC9979u.m20291d(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m25239b(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f27109c;
            AbstractC9979u.m20291d(method);
            method.invoke(obj, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
