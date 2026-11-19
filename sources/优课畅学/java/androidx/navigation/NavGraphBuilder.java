package androidx.navigation;

import androidx.annotation.IdRes;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8387o;
import p123h7.InterfaceC8721a;
import p246s8.AbstractC10067q;
import p300x7.InterfaceC10570l;

@NavDestinationDsl
/* loaded from: classes3.dex */
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {
    private final List<NavDestination> destinations;
    private final NavigatorProvider provider;
    private InterfaceC8375c startDestinationClass;

    @IdRes
    private int startDestinationId;
    private Object startDestinationObject;
    private String startDestinationRoute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    public NavGraphBuilder(NavigatorProvider provider, @IdRes int i10, @IdRes int i11) {
        super(provider.getNavigator(NavGraphNavigator.class), i10);
        AbstractC9133u.m16133g(provider, "provider");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationId = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String build$lambda$1$lambda$0(NavDestination it) {
        AbstractC9133u.m16133g(it, "it");
        String route = it.getRoute();
        AbstractC9133u.m16130d(route);
        return route;
    }

    public final void addDestination(NavDestination destination) {
        AbstractC9133u.m16133g(destination, "destination");
        this.destinations.add(destination);
    }

    public final <D extends NavDestination> void destination(NavDestinationBuilder<? extends D> navDestination) {
        AbstractC9133u.m16133g(navDestination, "navDestination");
        this.destinations.add(navDestination.build());
    }

    public final NavigatorProvider getProvider() {
        return this.provider;
    }

    public final void unaryPlus(NavDestination navDestination) {
        AbstractC9133u.m16133g(navDestination, "<this>");
        addDestination(navDestination);
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public NavGraph build() {
        NavGraph navGraph = (NavGraph) super.build();
        navGraph.addDestinations(this.destinations);
        int i10 = this.startDestinationId;
        if (i10 == 0 && this.startDestinationRoute == null && this.startDestinationClass == null && this.startDestinationObject == null) {
            if (getRoute() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.startDestinationRoute;
        if (str != null) {
            AbstractC9133u.m16130d(str);
            navGraph.setStartDestination(str);
            return navGraph;
        }
        InterfaceC8375c interfaceC8375c = this.startDestinationClass;
        if (interfaceC8375c != null) {
            AbstractC9133u.m16130d(interfaceC8375c);
            navGraph.setStartDestination(AbstractC10067q.m18778b(interfaceC8375c), new InterfaceC10570l() { // from class: androidx.navigation.z
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return NavGraphBuilder.build$lambda$1$lambda$0((NavDestination) obj);
                }
            });
            return navGraph;
        }
        Object obj = this.startDestinationObject;
        if (obj == null) {
            navGraph.setStartDestination(i10);
            return navGraph;
        }
        AbstractC9133u.m16130d(obj);
        navGraph.setStartDestination(obj);
        return navGraph;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider provider, String startDestination, String str) {
        super(provider.getNavigator(NavGraphNavigator.class), str);
        AbstractC9133u.m16133g(provider, "provider");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationRoute = startDestination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider provider, InterfaceC8375c startDestination, InterfaceC8375c interfaceC8375c, Map<InterfaceC8387o, NavType<?>> typeMap) {
        super(provider.getNavigator(NavGraphNavigator.class), interfaceC8375c, typeMap);
        AbstractC9133u.m16133g(provider, "provider");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationClass = startDestination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider provider, Object startDestination, InterfaceC8375c interfaceC8375c, Map<InterfaceC8387o, NavType<?>> typeMap) {
        super(provider.getNavigator(NavGraphNavigator.class), interfaceC8375c, typeMap);
        AbstractC9133u.m16133g(provider, "provider");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationObject = startDestination;
    }
}
