package p276v8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v8.j */
/* loaded from: classes5.dex */
public final class C9782j {

    /* renamed from: d */
    public static final a f17402d = new a(null);

    /* renamed from: a */
    public final Method f17403a;

    /* renamed from: b */
    public final Method f17404b;

    /* renamed from: c */
    public final Method f17405c;

    /* renamed from: v8.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9782j m16583a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
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
            return new C9782j(method3, method2, method);
        }

        public a() {
        }
    }

    public C9782j(Method method, Method method2, Method method3) {
        this.f17403a = method;
        this.f17404b = method2;
        this.f17405c = method3;
    }

    /* renamed from: a */
    public final Object m16581a(String closer) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(closer, "closer");
        Method method = this.f17403a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = this.f17404b;
                Intrinsics.checkNotNull(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m16582b(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f17405c;
            Intrinsics.checkNotNull(method);
            method.invoke(obj, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
