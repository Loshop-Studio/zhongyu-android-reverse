package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.NavType;
import androidx.navigation.fragment.DialogFragmentNavigator;
import gd.AbstractC9293a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;
import p309qc.InterfaceC10770a;

@NavDestinationDsl
/* loaded from: classes.dex */
public final class DialogFragmentNavigatorDestinationBuilder extends NavDestinationBuilder<DialogFragmentNavigator.Destination> {
    private InterfaceC10469c fragmentClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC10770a
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator navigator, @IdRes int i10, InterfaceC10469c fragmentClass) {
        super(navigator, i10);
        AbstractC9979u.m20294g(navigator, "navigator");
        AbstractC9979u.m20294g(fragmentClass, "fragmentClass");
        this.fragmentClass = fragmentClass;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public DialogFragmentNavigator.Destination build() {
        DialogFragmentNavigator.Destination destination = (DialogFragmentNavigator.Destination) super.build();
        String name = AbstractC9293a.m18324a(this.fragmentClass).getName();
        AbstractC9979u.m20293f(name, "getName(...)");
        destination.setClassName(name);
        return destination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator navigator, String route, InterfaceC10469c fragmentClass) {
        super(navigator, route);
        AbstractC9979u.m20294g(navigator, "navigator");
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(fragmentClass, "fragmentClass");
        this.fragmentClass = fragmentClass;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator navigator, InterfaceC10469c route, Map<InterfaceC10481o, NavType<?>> typeMap, InterfaceC10469c fragmentClass) {
        super(navigator, route, typeMap);
        AbstractC9979u.m20294g(navigator, "navigator");
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(fragmentClass, "fragmentClass");
        this.fragmentClass = fragmentClass;
    }
}
