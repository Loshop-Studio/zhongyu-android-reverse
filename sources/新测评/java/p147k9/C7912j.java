package p147k9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k9.j */
/* loaded from: classes5.dex */
public final class C7912j {

    /* renamed from: d */
    public static final a f13795d = new a(null);

    /* renamed from: a */
    public final Method f13796a;

    /* renamed from: b */
    public final Method f13797b;

    /* renamed from: c */
    public final Method f13798c;

    /* renamed from: k9.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7912j m13550a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
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
            return new C7912j(method3, method2, method);
        }

        public a() {
        }
    }

    public C7912j(Method method, Method method2, Method method3) {
        this.f13796a = method;
        this.f13797b = method2;
        this.f13798c = method3;
    }

    /* renamed from: a */
    public final Object m13548a(String closer) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(closer, "closer");
        Method method = this.f13796a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = this.f13797b;
                Intrinsics.checkNotNull(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m13549b(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f13798c;
            Intrinsics.checkNotNull(method);
            method.invoke(obj, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
