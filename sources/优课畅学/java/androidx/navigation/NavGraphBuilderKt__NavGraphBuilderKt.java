package androidx.navigation;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8387o;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
final /* synthetic */ class NavGraphBuilderKt__NavGraphBuilderKt {
    public static final NavGraph navigation(NavigatorProvider navigatorProvider, String startDestination, String str, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navigatorProvider, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, String startDestination, String str, InterfaceC10570l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        AbstractC9133u.m16133g(navigatorProvider, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, InterfaceC8375c startDestination, InterfaceC8375c interfaceC8375c, Map<InterfaceC8387o, NavType<?>> typeMap, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navigatorProvider, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, interfaceC8375c, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, Object startDestination, InterfaceC8375c interfaceC8375c, Map<InterfaceC8387o, NavType<?>> typeMap, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navigatorProvider, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, interfaceC8375c, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, InterfaceC8375c startDestination, InterfaceC8375c interfaceC8375c, Map typeMap, InterfaceC10570l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC8375c = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = AbstractC9080a.m15943h();
        }
        AbstractC9133u.m16133g(navigatorProvider, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, interfaceC8375c, (Map<InterfaceC8387o, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder, String startDestination, String route, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), startDestination, route);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder navGraphBuilder, InterfaceC8375c startDestination, Map<InterfaceC8387o, NavType<?>> typeMap, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        NavGraphBuilderKt.navigation(navGraphBuilder, AbstractC9137y.m16154b(Object.class), startDestination, typeMap, builder);
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, InterfaceC8375c route, InterfaceC8375c startDestination, Map<InterfaceC8387o, NavType<?>> typeMap, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), startDestination, route, typeMap);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, Object startDestination, InterfaceC8375c interfaceC8375c, Map typeMap, InterfaceC10570l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC8375c = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = AbstractC9080a.m15943h();
        }
        AbstractC9133u.m16133g(navigatorProvider, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, interfaceC8375c, (Map<InterfaceC8387o, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder navGraphBuilder, Object startDestination, Map<InterfaceC8387o, NavType<?>> typeMap, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        NavGraphBuilderKt.navigation(navGraphBuilder, AbstractC9137y.m16154b(Object.class), startDestination, typeMap, builder);
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, InterfaceC8375c route, Object startDestination, Map<InterfaceC8387o, NavType<?>> typeMap, InterfaceC10570l builder) {
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), startDestination, route, typeMap);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, InterfaceC8375c startDestination, Map typeMap, InterfaceC10570l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMap = AbstractC9080a.m15943h();
        }
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        NavGraphBuilderKt.navigation(navGraphBuilder, AbstractC9137y.m16154b(Object.class), startDestination, (Map<InterfaceC8387o, NavType<?>>) typeMap, builder);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, InterfaceC8375c interfaceC8375c, InterfaceC8375c interfaceC8375c2, Map map, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = AbstractC9080a.m15943h();
        }
        NavGraphBuilderKt.navigation(navGraphBuilder, interfaceC8375c, interfaceC8375c2, (Map<InterfaceC8387o, NavType<?>>) map, interfaceC10570l);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, Object startDestination, Map typeMap, InterfaceC10570l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMap = AbstractC9080a.m15943h();
        }
        AbstractC9133u.m16133g(navGraphBuilder, "<this>");
        AbstractC9133u.m16133g(startDestination, "startDestination");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        AbstractC9133u.m16133g(builder, "builder");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        NavGraphBuilderKt.navigation(navGraphBuilder, AbstractC9137y.m16154b(Object.class), startDestination, (Map<InterfaceC8387o, NavType<?>>) typeMap, builder);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, InterfaceC8375c interfaceC8375c, Object obj, Map map, InterfaceC10570l interfaceC10570l, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            map = AbstractC9080a.m15943h();
        }
        NavGraphBuilderKt.navigation(navGraphBuilder, interfaceC8375c, obj, (Map<InterfaceC8387o, NavType<?>>) map, interfaceC10570l);
    }
}
