package androidx.navigation;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavArgs;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;
import p185v7.AbstractC6675d;
import p207y6.InterfaceC6779c;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001e\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m5110d2 = {"Landroidx/navigation/NavArgsLazy;", "Landroidx/navigation/NavArgs;", "Args", "Ld6/e;", "Ly6/c;", "navArgsClass", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "argumentProducer", "<init>", "(Ly6/c;Lr6/a;)V", "", "isInitialized", "()Z", "Ly6/c;", "Lr6/a;", "cached", "Landroidx/navigation/NavArgs;", "getValue", "()Landroidx/navigation/NavArgs;", "value", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NavArgsLazy<Args extends NavArgs> implements InterfaceC5429e {

    @NotNull
    private final InterfaceC6469a argumentProducer;

    @Nullable
    private Args cached;

    @NotNull
    private final InterfaceC6779c navArgsClass;

    public NavArgsLazy(@NotNull InterfaceC6779c navArgsClass, @NotNull InterfaceC6469a argumentProducer) {
        AbstractC5830k.m5330g(navArgsClass, "navArgsClass");
        AbstractC5830k.m5330g(argumentProducer, "argumentProducer");
        this.navArgsClass = navArgsClass;
        this.argumentProducer = argumentProducer;
    }

    public boolean isInitialized() {
        return this.cached != null;
    }

    @Override // p045d6.InterfaceC5429e
    @NotNull
    public Args getValue() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Bundle bundle = (Bundle) this.argumentProducer.invoke();
        Method method = NavArgsLazy_androidKt.getMethodMap().get(this.navArgsClass);
        if (method == null) {
            Class clsM6349m = AbstractC6675d.m6349m(this.navArgsClass);
            Class<Bundle>[] methodSignature = NavArgsLazy_androidKt.getMethodSignature();
            method = clsM6349m.getMethod("fromBundle", (Class[]) Arrays.copyOf(methodSignature, methodSignature.length));
            NavArgsLazy_androidKt.getMethodMap().put(this.navArgsClass, method);
            AbstractC5830k.m5329f(method, "also(...)");
        }
        Object objInvoke = method.invoke(null, bundle);
        AbstractC5830k.m5328e(objInvoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        Args args2 = (Args) objInvoke;
        this.cached = args2;
        return args2;
    }
}
