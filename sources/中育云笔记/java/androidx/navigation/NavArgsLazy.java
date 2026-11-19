package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import gd.AbstractC9293a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p280od.InterfaceC10469c;
import p309qc.InterfaceC10773d;

/* loaded from: classes.dex */
public final class NavArgsLazy<Args extends NavArgs> implements InterfaceC10773d {
    private final InterfaceC9529a argumentProducer;
    private Args cached;
    private final InterfaceC10469c navArgsClass;

    public NavArgsLazy(InterfaceC10469c navArgsClass, InterfaceC9529a argumentProducer) {
        AbstractC9979u.m20294g(navArgsClass, "navArgsClass");
        AbstractC9979u.m20294g(argumentProducer, "argumentProducer");
        this.navArgsClass = navArgsClass;
        this.argumentProducer = argumentProducer;
    }

    @Override // p309qc.InterfaceC10773d
    public boolean isInitialized() {
        return this.cached != null;
    }

    @Override // p309qc.InterfaceC10773d
    public Args getValue() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Bundle bundle = (Bundle) this.argumentProducer.invoke();
        Method method = NavArgsLazy_androidKt.getMethodMap().get(this.navArgsClass);
        if (method == null) {
            Class clsM18324a = AbstractC9293a.m18324a(this.navArgsClass);
            Class<Bundle>[] methodSignature = NavArgsLazy_androidKt.getMethodSignature();
            method = clsM18324a.getMethod("fromBundle", (Class[]) Arrays.copyOf(methodSignature, methodSignature.length));
            NavArgsLazy_androidKt.getMethodMap().put(this.navArgsClass, method);
            AbstractC9979u.m20293f(method, "also(...)");
        }
        Object objInvoke = method.invoke(null, bundle);
        AbstractC9979u.m20292e(objInvoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        Args args2 = (Args) objInvoke;
        this.cached = args2;
        return args2;
    }
}
