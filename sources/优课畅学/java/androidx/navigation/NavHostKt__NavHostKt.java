package androidx.navigation;

import java.util.Map;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8387o;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
final /* synthetic */ class NavHostKt__NavHostKt {
    public static final NavGraph createGraph(NavHost navHost, String startDestination, String str, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navHost, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, String startDestination, String str, InterfaceC10570l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        AbstractC9133u.m16133g(navHost, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph createGraph(NavHost navHost, InterfaceC8375c startDestination, InterfaceC8375c interfaceC8375c, Map<InterfaceC8387o, NavType<?>> typeMap, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navHost, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, interfaceC8375c, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, InterfaceC8375c startDestination, InterfaceC8375c interfaceC8375c, Map typeMap, InterfaceC10570l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC8375c = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = AbstractC9080a.m15943h();
        }
        AbstractC9133u.m16133g(navHost, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, interfaceC8375c, (Map<InterfaceC8387o, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph createGraph(NavHost navHost, Object startDestination, InterfaceC8375c interfaceC8375c, Map<InterfaceC8387o, NavType<?>> typeMap, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navHost, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, interfaceC8375c, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, Object startDestination, InterfaceC8375c interfaceC8375c, Map typeMap, InterfaceC10570l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC8375c = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = AbstractC9080a.m15943h();
        }
        AbstractC9133u.m16133g(navHost, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, interfaceC8375c, (Map<InterfaceC8387o, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
