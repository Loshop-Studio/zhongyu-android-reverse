package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavDestination;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p049ce.AbstractC5447q;
import p049ce.InterfaceC5432b;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

@NavDestinationDsl
/* loaded from: classes.dex */
public class NavDestinationBuilder<D extends NavDestination> {
    private Map<Integer, NavAction> actions;
    private Map<String, NavArgument> arguments;
    private List<NavDeepLink> deepLinks;

    /* renamed from: id */
    private final int f1634id;
    private CharSequence label;
    private final Navigator<? extends D> navigator;
    private final String route;
    private Map<InterfaceC10481o, ? extends NavType<?>> typeMap;

    public NavDestinationBuilder(Navigator<? extends D> navigator, @IdRes int i10, String str) {
        AbstractC9979u.m20294g(navigator, "navigator");
        this.navigator = navigator;
        this.f1634id = i10;
        this.route = str;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    @InterfaceC10770a
    public final void action(int i10, InterfaceC9540l actionBuilder) {
        AbstractC9979u.m20294g(actionBuilder, "actionBuilder");
        Map<Integer, NavAction> map = this.actions;
        Integer numValueOf = Integer.valueOf(i10);
        NavActionBuilder navActionBuilder = new NavActionBuilder();
        actionBuilder.invoke(navActionBuilder);
        map.put(numValueOf, navActionBuilder.build$navigation_common_release());
    }

    public final void argument(String name, InterfaceC9540l argumentBuilder) {
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(argumentBuilder, "argumentBuilder");
        Map<String, NavArgument> map = this.arguments;
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        argumentBuilder.invoke(navArgumentBuilder);
        map.put(name, navArgumentBuilder.build());
    }

    public D build() {
        D d10 = (D) instantiateDestination();
        d10.setLabel(this.label);
        for (Map.Entry<String, NavArgument> entry : this.arguments.entrySet()) {
            d10.addArgument(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.deepLinks.iterator();
        while (it.hasNext()) {
            d10.addDeepLink((NavDeepLink) it.next());
        }
        for (Map.Entry<Integer, NavAction> entry2 : this.actions.entrySet()) {
            d10.putAction(entry2.getKey().intValue(), entry2.getValue());
        }
        String str = this.route;
        if (str != null) {
            d10.setRoute(str);
        }
        int i10 = this.f1634id;
        if (i10 != -1) {
            d10.setId(i10);
        }
        return d10;
    }

    public final void deepLink(String uriPattern) {
        AbstractC9979u.m20294g(uriPattern, "uriPattern");
        this.deepLinks.add(new NavDeepLink(uriPattern));
    }

    public final /* synthetic */ <T> void deepLinkSafeArgs(String basePath) {
        AbstractC9979u.m20294g(basePath, "basePath");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        deepLink(AbstractC9983y.m20315b(Object.class), basePath, new InterfaceC9540l() { // from class: androidx.navigation.NavDestinationBuilder.deepLink.1
            public final void invoke(NavDeepLinkDslBuilder deepLink) {
                AbstractC9979u.m20294g(deepLink, "$this$deepLink");
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((NavDeepLinkDslBuilder) obj);
                return C10786q.f26013a;
            }
        });
    }

    public final int getId() {
        return this.f1634id;
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    public final Navigator<? extends D> getNavigator() {
        return this.navigator;
    }

    public final String getRoute() {
        return this.route;
    }

    public D instantiateDestination() {
        return (D) this.navigator.createDestination();
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void argument(String name, NavArgument argument) {
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(argument, "argument");
        this.arguments.put(name, argument);
    }

    public final void deepLink(InterfaceC9540l navDeepLink) {
        AbstractC9979u.m20294g(navDeepLink, "navDeepLink");
        List<NavDeepLink> list = this.deepLinks;
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        navDeepLink.invoke(navDeepLinkDslBuilder);
        list.add(navDeepLinkDslBuilder.build$navigation_common_release());
    }

    public final /* synthetic */ <T> void deepLink(String basePath, InterfaceC9540l navDeepLink) {
        AbstractC9979u.m20294g(basePath, "basePath");
        AbstractC9979u.m20294g(navDeepLink, "navDeepLink");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        deepLink(AbstractC9983y.m20315b(Object.class), basePath, navDeepLink);
    }

    public final <T> void deepLink(InterfaceC10469c route, String basePath, InterfaceC9540l navDeepLink) {
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(basePath, "basePath");
        AbstractC9979u.m20294g(navDeepLink, "navDeepLink");
        if (this.typeMap != null) {
            InterfaceC5432b interfaceC5432bM2953c = AbstractC5447q.m2953c(route);
            Map<InterfaceC10481o, ? extends NavType<?>> map = this.typeMap;
            Map<InterfaceC10481o, ? extends NavType<?>> map2 = null;
            if (map == null) {
                AbstractC9979u.m20312y("typeMap");
                map = null;
            }
            for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(interfaceC5432bM2953c, map)) {
                NavArgument navArgument = this.arguments.get(namedNavArgument.getName());
                if (navArgument == null || !AbstractC9979u.m20289b(navArgument.getType(), namedNavArgument.getArgument().getType())) {
                    throw new IllegalArgumentException(("Cannot add deeplink from KClass [" + route + "]. DeepLink contains unknown argument [" + namedNavArgument.getName() + "]. Ensure deeplink arguments matches the destination's route from KClass").toString());
                }
            }
            Map<InterfaceC10481o, ? extends NavType<?>> map3 = this.typeMap;
            if (map3 == null) {
                AbstractC9979u.m20312y("typeMap");
            } else {
                map2 = map3;
            }
            deepLink(NavDeepLinkDslBuilderKt.navDeepLink(route, basePath, map2, navDeepLink));
            return;
        }
        throw new IllegalStateException(("Cannot add deeplink from KClass [" + route + "]. Use the NavDestinationBuilder constructor that takes a KClass with the same arguments.").toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC10770a
    public NavDestinationBuilder(Navigator<? extends D> navigator, @IdRes int i10) {
        this(navigator, i10, (String) null);
        AbstractC9979u.m20294g(navigator, "navigator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator<? extends D> navigator, String str) {
        this(navigator, -1, str);
        AbstractC9979u.m20294g(navigator, "navigator");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavDestinationBuilder(Navigator<? extends D> navigator, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> typeMap) {
        InterfaceC5432b interfaceC5432bM2953c;
        InterfaceC5432b interfaceC5432bM2953c2;
        AbstractC9979u.m20294g(navigator, "navigator");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        int iGenerateHashCode = (interfaceC10469c == null || (interfaceC5432bM2953c2 = AbstractC5447q.m2953c(interfaceC10469c)) == null) ? -1 : RouteSerializerKt.generateHashCode(interfaceC5432bM2953c2);
        String strGenerateRoutePattern$default = null;
        if (interfaceC10469c != null && (interfaceC5432bM2953c = AbstractC5447q.m2953c(interfaceC10469c)) != null) {
            strGenerateRoutePattern$default = RouteSerializerKt.generateRoutePattern$default(interfaceC5432bM2953c, typeMap, null, 2, null);
        }
        this(navigator, iGenerateHashCode, strGenerateRoutePattern$default);
        if (interfaceC10469c != null) {
            for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(AbstractC5447q.m2953c(interfaceC10469c), typeMap)) {
                this.arguments.put(namedNavArgument.getName(), namedNavArgument.getArgument());
            }
        }
        this.typeMap = typeMap;
    }

    public final void deepLink(NavDeepLink navDeepLink) {
        AbstractC9979u.m20294g(navDeepLink, "navDeepLink");
        this.deepLinks.add(navDeepLink);
    }
}
