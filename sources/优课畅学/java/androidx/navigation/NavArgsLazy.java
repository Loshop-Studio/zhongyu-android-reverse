package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p123h7.InterfaceC8724d;
import p289w7.AbstractC10360a;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class NavArgsLazy<Args extends NavArgs> implements InterfaceC8724d {
    private final InterfaceC10559a argumentProducer;
    private Args cached;
    private final InterfaceC8375c navArgsClass;

    public NavArgsLazy(InterfaceC8375c navArgsClass, InterfaceC10559a argumentProducer) {
        AbstractC9133u.m16133g(navArgsClass, "navArgsClass");
        AbstractC9133u.m16133g(argumentProducer, "argumentProducer");
        this.navArgsClass = navArgsClass;
        this.argumentProducer = argumentProducer;
    }

    @Override // p123h7.InterfaceC8724d
    public boolean isInitialized() {
        return this.cached != null;
    }

    @Override // p123h7.InterfaceC8724d
    public Args getValue() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Bundle bundle = (Bundle) this.argumentProducer.invoke();
        Method method = NavArgsLazy_androidKt.getMethodMap().get(this.navArgsClass);
        if (method == null) {
            Class clsM19298a = AbstractC10360a.m19298a(this.navArgsClass);
            Class<Bundle>[] methodSignature = NavArgsLazy_androidKt.getMethodSignature();
            method = clsM19298a.getMethod("fromBundle", (Class[]) Arrays.copyOf(methodSignature, methodSignature.length));
            NavArgsLazy_androidKt.getMethodMap().put(this.navArgsClass, method);
            AbstractC9133u.m16132f(method, "also(...)");
        }
        Object objInvoke = method.invoke(null, bundle);
        AbstractC9133u.m16131e(objInvoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        Args args2 = (Args) objInvoke;
        this.cached = args2;
        return args2;
    }
}
