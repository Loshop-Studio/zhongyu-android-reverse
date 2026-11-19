package androidx.navigation;

import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;

/* loaded from: classes.dex */
final /* synthetic */ class NavHostKt__NavHostKt {
    public static final NavGraph createGraph(NavHost navHost, String startDestination, String str, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navHost, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, String startDestination, String str, InterfaceC9540l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        AbstractC9979u.m20294g(navHost, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph createGraph(NavHost navHost, InterfaceC10469c startDestination, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> typeMap, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navHost, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, interfaceC10469c, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, InterfaceC10469c startDestination, InterfaceC10469c interfaceC10469c, Map typeMap, InterfaceC9540l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC10469c = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = AbstractC9925a.m20088h();
        }
        AbstractC9979u.m20294g(navHost, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, interfaceC10469c, (Map<InterfaceC10481o, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph createGraph(NavHost navHost, Object startDestination, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> typeMap, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navHost, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, interfaceC10469c, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, Object startDestination, InterfaceC10469c interfaceC10469c, Map typeMap, InterfaceC9540l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC10469c = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = AbstractC9925a.m20088h();
        }
        AbstractC9979u.m20294g(navHost, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, interfaceC10469c, (Map<InterfaceC10481o, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
