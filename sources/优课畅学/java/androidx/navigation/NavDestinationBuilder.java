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
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8387o;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p246s8.AbstractC10067q;
import p246s8.InterfaceC10052b;
import p300x7.InterfaceC10570l;

@NavDestinationDsl
/* loaded from: classes3.dex */
public class NavDestinationBuilder<D extends NavDestination> {
    private Map<Integer, NavAction> actions;
    private Map<String, NavArgument> arguments;
    private List<NavDeepLink> deepLinks;

    /* renamed from: id */
    private final int f1735id;
    private CharSequence label;
    private final Navigator<? extends D> navigator;
    private final String route;
    private Map<InterfaceC8387o, ? extends NavType<?>> typeMap;

    public NavDestinationBuilder(Navigator<? extends D> navigator, @IdRes int i10, String str) {
        AbstractC9133u.m16133g(navigator, "navigator");
        this.navigator = navigator;
        this.f1735id = i10;
        this.route = str;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    @InterfaceC8721a
    public final void action(int i10, InterfaceC10570l actionBuilder) {
        AbstractC9133u.m16133g(actionBuilder, "actionBuilder");
        Map<Integer, NavAction> map = this.actions;
        Integer numValueOf = Integer.valueOf(i10);
        NavActionBuilder navActionBuilder = new NavActionBuilder();
        actionBuilder.invoke(navActionBuilder);
        map.put(numValueOf, navActionBuilder.build$navigation_common_release());
    }

    public final void argument(String name, InterfaceC10570l argumentBuilder) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(argumentBuilder, "argumentBuilder");
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
        int i10 = this.f1735id;
        if (i10 != -1) {
            d10.setId(i10);
        }
        return d10;
    }

    public final void deepLink(String uriPattern) {
        AbstractC9133u.m16133g(uriPattern, "uriPattern");
        this.deepLinks.add(new NavDeepLink(uriPattern));
    }

    public final /* synthetic */ <T> void deepLinkSafeArgs(String basePath) {
        AbstractC9133u.m16133g(basePath, "basePath");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        deepLink(AbstractC9137y.m16154b(Object.class), basePath, new InterfaceC10570l() { // from class: androidx.navigation.NavDestinationBuilder.deepLink.1
            public final void invoke(NavDeepLinkDslBuilder deepLink) {
                AbstractC9133u.m16133g(deepLink, "$this$deepLink");
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((NavDeepLinkDslBuilder) obj);
                return C8736p.f16368a;
            }
        });
    }

    public final int getId() {
        return this.f1735id;
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
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(argument, "argument");
        this.arguments.put(name, argument);
    }

    public final void deepLink(InterfaceC10570l navDeepLink) {
        AbstractC9133u.m16133g(navDeepLink, "navDeepLink");
        List<NavDeepLink> list = this.deepLinks;
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        navDeepLink.invoke(navDeepLinkDslBuilder);
        list.add(navDeepLinkDslBuilder.build$navigation_common_release());
    }

    public final /* synthetic */ <T> void deepLink(String basePath, InterfaceC10570l navDeepLink) {
        AbstractC9133u.m16133g(basePath, "basePath");
        AbstractC9133u.m16133g(navDeepLink, "navDeepLink");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        deepLink(AbstractC9137y.m16154b(Object.class), basePath, navDeepLink);
    }

    public final <T> void deepLink(InterfaceC8375c route, String basePath, InterfaceC10570l navDeepLink) {
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(basePath, "basePath");
        AbstractC9133u.m16133g(navDeepLink, "navDeepLink");
        if (this.typeMap != null) {
            InterfaceC10052b interfaceC10052bM18778b = AbstractC10067q.m18778b(route);
            Map<InterfaceC8387o, ? extends NavType<?>> map = this.typeMap;
            Map<InterfaceC8387o, ? extends NavType<?>> map2 = null;
            if (map == null) {
                AbstractC9133u.m16151y("typeMap");
                map = null;
            }
            for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(interfaceC10052bM18778b, map)) {
                NavArgument navArgument = this.arguments.get(namedNavArgument.getName());
                if (navArgument == null || !AbstractC9133u.m16128b(navArgument.getType(), namedNavArgument.getArgument().getType())) {
                    throw new IllegalArgumentException(("Cannot add deeplink from KClass [" + route + "]. DeepLink contains unknown argument [" + namedNavArgument.getName() + "]. Ensure deeplink arguments matches the destination's route from KClass").toString());
                }
            }
            Map<InterfaceC8387o, ? extends NavType<?>> map3 = this.typeMap;
            if (map3 == null) {
                AbstractC9133u.m16151y("typeMap");
            } else {
                map2 = map3;
            }
            deepLink(NavDeepLinkDslBuilderKt.navDeepLink(route, basePath, map2, navDeepLink));
            return;
        }
        throw new IllegalStateException(("Cannot add deeplink from KClass [" + route + "]. Use the NavDestinationBuilder constructor that takes a KClass with the same arguments.").toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    public NavDestinationBuilder(Navigator<? extends D> navigator, @IdRes int i10) {
        this(navigator, i10, (String) null);
        AbstractC9133u.m16133g(navigator, "navigator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator<? extends D> navigator, String str) {
        this(navigator, -1, str);
        AbstractC9133u.m16133g(navigator, "navigator");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavDestinationBuilder(Navigator<? extends D> navigator, InterfaceC8375c interfaceC8375c, Map<InterfaceC8387o, NavType<?>> typeMap) {
        InterfaceC10052b interfaceC10052bM18778b;
        InterfaceC10052b interfaceC10052bM18778b2;
        AbstractC9133u.m16133g(navigator, "navigator");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        int iGenerateHashCode = (interfaceC8375c == null || (interfaceC10052bM18778b2 = AbstractC10067q.m18778b(interfaceC8375c)) == null) ? -1 : RouteSerializerKt.generateHashCode(interfaceC10052bM18778b2);
        String strGenerateRoutePattern$default = null;
        if (interfaceC8375c != null && (interfaceC10052bM18778b = AbstractC10067q.m18778b(interfaceC8375c)) != null) {
            strGenerateRoutePattern$default = RouteSerializerKt.generateRoutePattern$default(interfaceC10052bM18778b, typeMap, null, 2, null);
        }
        this(navigator, iGenerateHashCode, strGenerateRoutePattern$default);
        if (interfaceC8375c != null) {
            for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(AbstractC10067q.m18778b(interfaceC8375c), typeMap)) {
                this.arguments.put(namedNavArgument.getName(), namedNavArgument.getArgument());
            }
        }
        this.typeMap = typeMap;
    }

    public final void deepLink(NavDeepLink navDeepLink) {
        AbstractC9133u.m16133g(navDeepLink, "navDeepLink");
        this.deepLinks.add(navDeepLink);
    }
}
