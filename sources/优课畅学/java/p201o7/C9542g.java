package p201o7;

import androidx.autofill.HintConstants;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: o7.g */
/* loaded from: classes5.dex */
public final class C9542g {

    /* renamed from: a */
    public static final C9542g f18902a = new C9542g();

    /* renamed from: b */
    public static final a f18903b = new a(null, null, null);

    /* renamed from: c */
    public static a f18904c;

    /* renamed from: o7.g$a */
    public static final class a {

        /* renamed from: a */
        public final Method f18905a;

        /* renamed from: b */
        public final Method f18906b;

        /* renamed from: c */
        public final Method f18907c;

        public a(Method method, Method method2, Method method3) {
            this.f18905a = method;
            this.f18906b = method2;
            this.f18907c = method3;
        }
    }

    /* renamed from: a */
    public final a m17812a(BaseContinuationImpl baseContinuationImpl) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(HintConstants.AUTOFILL_HINT_NAME, null));
            f18904c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f18903b;
            f18904c = aVar2;
            return aVar2;
        }
    }

    /* renamed from: b */
    public final String m17813b(BaseContinuationImpl continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        AbstractC9133u.m16133g(continuation, "continuation");
        a aVarM17812a = f18904c;
        if (aVarM17812a == null) {
            aVarM17812a = m17812a(continuation);
        }
        if (aVarM17812a != f18903b && (method = aVarM17812a.f18905a) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = aVarM17812a.f18906b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarM17812a.f18907c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
