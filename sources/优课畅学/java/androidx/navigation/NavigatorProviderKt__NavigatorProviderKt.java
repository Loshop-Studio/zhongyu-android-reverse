package androidx.navigation;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
final /* synthetic */ class NavigatorProviderKt__NavigatorProviderKt {
    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, String name) {
        AbstractC9133u.m16133g(navigatorProvider, "<this>");
        AbstractC9133u.m16133g(name, "name");
        return (T) navigatorProvider.getNavigator(name);
    }

    public static final void plusAssign(NavigatorProvider navigatorProvider, Navigator<? extends NavDestination> navigator) {
        AbstractC9133u.m16133g(navigatorProvider, "<this>");
        AbstractC9133u.m16133g(navigator, "navigator");
        navigatorProvider.addNavigator(navigator);
    }

    public static final Navigator<? extends NavDestination> set(NavigatorProvider navigatorProvider, String name, Navigator<? extends NavDestination> navigator) {
        AbstractC9133u.m16133g(navigatorProvider, "<this>");
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(navigator, "navigator");
        return navigatorProvider.addNavigator(name, navigator);
    }
}
