package androidx.navigation;

import androidx.annotation.IdRes;
import java.util.Map;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class NavGraphBuilderKt {
    @InterfaceC10770a
    public static final NavGraph navigation(NavigatorProvider navigatorProvider, @IdRes int i10, @IdRes int i11, InterfaceC9540l interfaceC9540l) {
        return NavGraphBuilderKt__NavGraphBuilder_androidKt.navigation(navigatorProvider, i10, i11, interfaceC9540l);
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, Object obj, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> map, InterfaceC9540l interfaceC9540l) {
        return NavGraphBuilderKt__NavGraphBuilderKt.navigation(navigatorProvider, obj, interfaceC10469c, map, interfaceC9540l);
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, String str, String str2, InterfaceC9540l interfaceC9540l) {
        return NavGraphBuilderKt__NavGraphBuilderKt.navigation(navigatorProvider, str, str2, interfaceC9540l);
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, InterfaceC10469c interfaceC10469c, InterfaceC10469c interfaceC10469c2, Map<InterfaceC10481o, NavType<?>> map, InterfaceC9540l interfaceC9540l) {
        return NavGraphBuilderKt__NavGraphBuilderKt.navigation(navigatorProvider, interfaceC10469c, interfaceC10469c2, map, interfaceC9540l);
    }

    @InterfaceC10770a
    public static final void navigation(NavGraphBuilder navGraphBuilder, @IdRes int i10, @IdRes int i11, InterfaceC9540l interfaceC9540l) {
        NavGraphBuilderKt__NavGraphBuilder_androidKt.navigation(navGraphBuilder, i10, i11, interfaceC9540l);
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder, String str, String str2, InterfaceC9540l interfaceC9540l) {
        NavGraphBuilderKt__NavGraphBuilderKt.navigation(navGraphBuilder, str, str2, interfaceC9540l);
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, InterfaceC10469c interfaceC10469c, Object obj, Map<InterfaceC10481o, NavType<?>> map, InterfaceC9540l interfaceC9540l) {
        NavGraphBuilderKt__NavGraphBuilderKt.navigation(navGraphBuilder, interfaceC10469c, obj, map, interfaceC9540l);
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, InterfaceC10469c interfaceC10469c, InterfaceC10469c interfaceC10469c2, Map<InterfaceC10481o, NavType<?>> map, InterfaceC9540l interfaceC9540l) {
        NavGraphBuilderKt__NavGraphBuilderKt.navigation(navGraphBuilder, interfaceC10469c, interfaceC10469c2, map, interfaceC9540l);
    }
}
