package p409xc;

import androidx.autofill.HintConstants;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: xc.g */
/* loaded from: classes6.dex */
public final class C11832g {

    /* renamed from: a */
    public static final C11832g f28069a = new C11832g();

    /* renamed from: b */
    public static final a f28070b = new a(null, null, null);

    /* renamed from: c */
    public static a f28071c;

    /* renamed from: xc.g$a */
    public static final class a {

        /* renamed from: a */
        public final Method f28072a;

        /* renamed from: b */
        public final Method f28073b;

        /* renamed from: c */
        public final Method f28074c;

        public a(Method method, Method method2, Method method3) {
            this.f28072a = method;
            this.f28073b = method2;
            this.f28074c = method3;
        }
    }

    /* renamed from: a */
    public final a m26222a(BaseContinuationImpl baseContinuationImpl) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(HintConstants.AUTOFILL_HINT_NAME, null));
            f28071c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f28070b;
            f28071c = aVar2;
            return aVar2;
        }
    }

    /* renamed from: b */
    public final String m26223b(BaseContinuationImpl continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        AbstractC9979u.m20294g(continuation, "continuation");
        a aVarM26222a = f28071c;
        if (aVarM26222a == null) {
            aVarM26222a = m26222a(continuation);
        }
        if (aVarM26222a != f28070b && (method = aVarM26222a.f28072a) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = aVarM26222a.f28073b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarM26222a.f28074c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
