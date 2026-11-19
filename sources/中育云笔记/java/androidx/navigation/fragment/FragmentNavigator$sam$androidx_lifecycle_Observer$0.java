package androidx.navigation.fragment;

import androidx.lifecycle.Observer;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10772c;

/* loaded from: classes.dex */
public final class FragmentNavigator$sam$androidx_lifecycle_Observer$0 implements Observer, InterfaceC9975q {
    private final /* synthetic */ InterfaceC9540l function;

    public FragmentNavigator$sam$androidx_lifecycle_Observer$0(InterfaceC9540l function) {
        AbstractC9979u.m20294g(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
            return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC9975q
    public final InterfaceC10772c getFunctionDelegate() {
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
