package androidx.navigation;

import androidx.annotation.IdRes;
import java.util.Map;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8387o;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class NavGraphBuilderKt {
    @InterfaceC8721a
    public static final NavGraph navigation(NavigatorProvider navigatorProvider, @IdRes int i10, @IdRes int i11, InterfaceC10570l interfaceC10570l) {
        return NavGraphBuilderKt__NavGraphBuilder_androidKt.navigation(navigatorProvider, i10, i11, interfaceC10570l);
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, InterfaceC8375c interfaceC8375c, InterfaceC8375c interfaceC8375c2, Map<InterfaceC8387o, NavType<?>> map, InterfaceC10570l interfaceC10570l) {
        return NavGraphBuilderKt__NavGraphBuilderKt.navigation(navigatorProvider, interfaceC8375c, interfaceC8375c2, map, interfaceC10570l);
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, Object obj, InterfaceC8375c interfaceC8375c, Map<InterfaceC8387o, NavType<?>> map, InterfaceC10570l interfaceC10570l) {
        return NavGraphBuilderKt__NavGraphBuilderKt.navigation(navigatorProvider, obj, interfaceC8375c, map, interfaceC10570l);
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, String str, String str2, InterfaceC10570l interfaceC10570l) {
        return NavGraphBuilderKt__NavGraphBuilderKt.navigation(navigatorProvider, str, str2, interfaceC10570l);
    }

    @InterfaceC8721a
    public static final void navigation(NavGraphBuilder navGraphBuilder, @IdRes int i10, @IdRes int i11, InterfaceC10570l interfaceC10570l) {
        NavGraphBuilderKt__NavGraphBuilder_androidKt.navigation(navGraphBuilder, i10, i11, interfaceC10570l);
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, InterfaceC8375c interfaceC8375c, InterfaceC8375c interfaceC8375c2, Map<InterfaceC8387o, NavType<?>> map, InterfaceC10570l interfaceC10570l) {
        NavGraphBuilderKt__NavGraphBuilderKt.navigation(navGraphBuilder, interfaceC8375c, interfaceC8375c2, map, interfaceC10570l);
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, InterfaceC8375c interfaceC8375c, Object obj, Map<InterfaceC8387o, NavType<?>> map, InterfaceC10570l interfaceC10570l) {
        NavGraphBuilderKt__NavGraphBuilderKt.navigation(navGraphBuilder, interfaceC8375c, obj, map, interfaceC10570l);
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder, String str, String str2, InterfaceC10570l interfaceC10570l) {
        NavGraphBuilderKt__NavGraphBuilderKt.navigation(navGraphBuilder, str, str2, interfaceC10570l);
    }
}
