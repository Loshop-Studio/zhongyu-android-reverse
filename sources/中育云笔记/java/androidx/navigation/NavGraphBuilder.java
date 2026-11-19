package androidx.navigation;

import androidx.annotation.IdRes;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.AbstractC5447q;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;
import p309qc.InterfaceC10770a;

@NavDestinationDsl
/* loaded from: classes.dex */
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {
    private final List<NavDestination> destinations;
    private final NavigatorProvider provider;
    private InterfaceC10469c startDestinationClass;

    @IdRes
    private int startDestinationId;
    private Object startDestinationObject;
    private String startDestinationRoute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC10770a
    public NavGraphBuilder(NavigatorProvider provider, @IdRes int i10, @IdRes int i11) {
        super(provider.getNavigator(NavGraphNavigator.class), i10);
        AbstractC9979u.m20294g(provider, "provider");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationId = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String build$lambda$1$lambda$0(NavDestination it) {
        AbstractC9979u.m20294g(it, "it");
        String route = it.getRoute();
        AbstractC9979u.m20291d(route);
        return route;
    }

    public final void addDestination(NavDestination destination) {
        AbstractC9979u.m20294g(destination, "destination");
        this.destinations.add(destination);
    }

    public final <D extends NavDestination> void destination(NavDestinationBuilder<? extends D> navDestination) {
        AbstractC9979u.m20294g(navDestination, "navDestination");
        this.destinations.add(navDestination.build());
    }

    public final NavigatorProvider getProvider() {
        return this.provider;
    }

    public final void unaryPlus(NavDestination navDestination) {
        AbstractC9979u.m20294g(navDestination, "<this>");
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
            AbstractC9979u.m20291d(str);
            navGraph.setStartDestination(str);
            return navGraph;
        }
        InterfaceC10469c interfaceC10469c = this.startDestinationClass;
        if (interfaceC10469c != null) {
            AbstractC9979u.m20291d(interfaceC10469c);
            navGraph.setStartDestination(AbstractC5447q.m2953c(interfaceC10469c), new InterfaceC9540l() { // from class: androidx.navigation.z
                @Override // p181hd.InterfaceC9540l
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
        AbstractC9979u.m20291d(obj);
        navGraph.setStartDestination(obj);
        return navGraph;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider provider, String startDestination, String str) {
        super(provider.getNavigator(NavGraphNavigator.class), str);
        AbstractC9979u.m20294g(provider, "provider");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationRoute = startDestination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider provider, InterfaceC10469c startDestination, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> typeMap) {
        super(provider.getNavigator(NavGraphNavigator.class), interfaceC10469c, typeMap);
        AbstractC9979u.m20294g(provider, "provider");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationClass = startDestination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider provider, Object startDestination, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> typeMap) {
        super(provider.getNavigator(NavGraphNavigator.class), interfaceC10469c, typeMap);
        AbstractC9979u.m20294g(provider, "provider");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationObject = startDestination;
    }
}
