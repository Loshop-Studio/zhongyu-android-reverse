package androidx.navigation;

import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final /* synthetic */ class NavigatorProviderKt__NavigatorProviderKt {
    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, String name) {
        AbstractC9979u.m20294g(navigatorProvider, "<this>");
        AbstractC9979u.m20294g(name, "name");
        return (T) navigatorProvider.getNavigator(name);
    }

    public static final void plusAssign(NavigatorProvider navigatorProvider, Navigator<? extends NavDestination> navigator) {
        AbstractC9979u.m20294g(navigatorProvider, "<this>");
        AbstractC9979u.m20294g(navigator, "navigator");
        navigatorProvider.addNavigator(navigator);
    }

    public static final Navigator<? extends NavDestination> set(NavigatorProvider navigatorProvider, String name, Navigator<? extends NavDestination> navigator) {
        AbstractC9979u.m20294g(navigatorProvider, "<this>");
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(navigator, "navigator");
        return navigatorProvider.addNavigator(name, navigator);
    }
}
