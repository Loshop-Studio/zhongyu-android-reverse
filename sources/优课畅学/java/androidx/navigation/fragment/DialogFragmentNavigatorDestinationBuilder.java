package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.NavType;
import androidx.navigation.fragment.DialogFragmentNavigator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8387o;
import p123h7.InterfaceC8721a;
import p289w7.AbstractC10360a;

@NavDestinationDsl
/* loaded from: classes3.dex */
public final class DialogFragmentNavigatorDestinationBuilder extends NavDestinationBuilder<DialogFragmentNavigator.Destination> {
    private InterfaceC8375c fragmentClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator navigator, @IdRes int i10, InterfaceC8375c fragmentClass) {
        super(navigator, i10);
        AbstractC9133u.m16133g(navigator, "navigator");
        AbstractC9133u.m16133g(fragmentClass, "fragmentClass");
        this.fragmentClass = fragmentClass;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public DialogFragmentNavigator.Destination build() {
        DialogFragmentNavigator.Destination destination = (DialogFragmentNavigator.Destination) super.build();
        String name = AbstractC10360a.m19298a(this.fragmentClass).getName();
        AbstractC9133u.m16132f(name, "getName(...)");
        destination.setClassName(name);
        return destination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator navigator, String route, InterfaceC8375c fragmentClass) {
        super(navigator, route);
        AbstractC9133u.m16133g(navigator, "navigator");
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(fragmentClass, "fragmentClass");
        this.fragmentClass = fragmentClass;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator navigator, InterfaceC8375c route, Map<InterfaceC8387o, NavType<?>> typeMap, InterfaceC8375c fragmentClass) {
        super(navigator, route, typeMap);
        AbstractC9133u.m16133g(navigator, "navigator");
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(fragmentClass, "fragmentClass");
        this.fragmentClass = fragmentClass;
    }
}
