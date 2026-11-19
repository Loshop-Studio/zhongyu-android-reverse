package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.InterfaceC8723c;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, InterfaceC9129q {
    private final /* synthetic */ InterfaceC10570l function;

    public Transformations$sam$androidx_lifecycle_Observer$0(InterfaceC10570l function) {
        AbstractC9133u.m16133g(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
            return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC9129q
    public final InterfaceC8723c getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
