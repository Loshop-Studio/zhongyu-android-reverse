package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.coroutines.jvm.internal.i */
/* loaded from: classes.dex */
final class C2753i {

    /* renamed from: a */
    @NotNull
    public static final C2753i f10711a = new C2753i();

    /* renamed from: b */
    @NotNull
    private static final a f10712b = new a(null, null, null);

    /* renamed from: c */
    @Nullable
    private static a f10713c;

    /* renamed from: kotlin.coroutines.jvm.internal.i$a */
    private static final class a {

        /* renamed from: a */
        @Nullable
        public final Method f10714a;

        /* renamed from: b */
        @Nullable
        public final Method f10715b;

        /* renamed from: c */
        @Nullable
        public final Method f10716c;

        public a(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
            this.f10714a = method;
            this.f10715b = method2;
            this.f10716c = method3;
        }
    }

    private C2753i() {
    }

    /* renamed from: a */
    private final a m9218a(AbstractC2745a abstractC2745a) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), abstractC2745a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), abstractC2745a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f10713c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f10712b;
            f10713c = aVar2;
            return aVar2;
        }
    }

    @Nullable
    /* renamed from: b */
    public final String m9219b(@NotNull AbstractC2745a continuation) {
        C2769l.m9241e(continuation, "continuation");
        a aVarM9218a = f10713c;
        if (aVarM9218a == null) {
            aVarM9218a = m9218a(continuation);
        }
        if (aVarM9218a == f10712b) {
            return null;
        }
        Method method = aVarM9218a.f10714a;
        Object objInvoke = method == null ? null : method.invoke(continuation.getClass(), new Object[0]);
        if (objInvoke == null) {
            return null;
        }
        Method method2 = aVarM9218a.f10715b;
        Object objInvoke2 = method2 == null ? null : method2.invoke(objInvoke, new Object[0]);
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = aVarM9218a.f10716c;
        Object objInvoke3 = method3 == null ? null : method3.invoke(objInvoke2, new Object[0]);
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
