package androidx.navigation;

import p280od.InterfaceC10469c;

/* loaded from: classes.dex */
public final class NavigatorProviderKt {
    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, String str) {
        return (T) NavigatorProviderKt__NavigatorProviderKt.get(navigatorProvider, str);
    }

    public static final void plusAssign(NavigatorProvider navigatorProvider, Navigator<? extends NavDestination> navigator) {
        NavigatorProviderKt__NavigatorProviderKt.plusAssign(navigatorProvider, navigator);
    }

    public static final Navigator<? extends NavDestination> set(NavigatorProvider navigatorProvider, String str, Navigator<? extends NavDestination> navigator) {
        return NavigatorProviderKt__NavigatorProviderKt.set(navigatorProvider, str, navigator);
    }

    public static final <T extends Navigator<? extends NavDestination>> T get(NavigatorProvider navigatorProvider, InterfaceC10469c interfaceC10469c) {
        return (T) NavigatorProviderKt__NavigatorProvider_androidKt.get(navigatorProvider, interfaceC10469c);
    }
}
