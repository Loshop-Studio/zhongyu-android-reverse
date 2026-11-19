package androidx.navigation;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9540l;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;

/* loaded from: classes.dex */
final /* synthetic */ class NavGraphBuilderKt__NavGraphBuilderKt {
    public static final NavGraph navigation(NavigatorProvider navigatorProvider, String startDestination, String str, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navigatorProvider, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, String startDestination, String str, InterfaceC9540l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        AbstractC9979u.m20294g(navigatorProvider, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, InterfaceC10469c startDestination, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> typeMap, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navigatorProvider, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, interfaceC10469c, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph navigation(NavigatorProvider navigatorProvider, Object startDestination, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> typeMap, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navigatorProvider, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, interfaceC10469c, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, InterfaceC10469c startDestination, InterfaceC10469c interfaceC10469c, Map typeMap, InterfaceC9540l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC10469c = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = AbstractC9925a.m20088h();
        }
        AbstractC9979u.m20294g(navigatorProvider, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, interfaceC10469c, (Map<InterfaceC10481o, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder, String startDestination, String route, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), startDestination, route);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder navGraphBuilder, InterfaceC10469c startDestination, Map<InterfaceC10481o, NavType<?>> typeMap, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        NavGraphBuilderKt.navigation(navGraphBuilder, AbstractC9983y.m20315b(Object.class), startDestination, typeMap, builder);
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, InterfaceC10469c route, InterfaceC10469c startDestination, Map<InterfaceC10481o, NavType<?>> typeMap, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), startDestination, route, typeMap);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, Object startDestination, InterfaceC10469c interfaceC10469c, Map typeMap, InterfaceC9540l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC10469c = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = AbstractC9925a.m20088h();
        }
        AbstractC9979u.m20294g(navigatorProvider, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, interfaceC10469c, (Map<InterfaceC10481o, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder navGraphBuilder, Object startDestination, Map<InterfaceC10481o, NavType<?>> typeMap, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        NavGraphBuilderKt.navigation(navGraphBuilder, AbstractC9983y.m20315b(Object.class), startDestination, typeMap, builder);
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, InterfaceC10469c route, Object startDestination, Map<InterfaceC10481o, NavType<?>> typeMap, InterfaceC9540l builder) {
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), startDestination, route, typeMap);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, InterfaceC10469c startDestination, Map typeMap, InterfaceC9540l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMap = AbstractC9925a.m20088h();
        }
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        NavGraphBuilderKt.navigation(navGraphBuilder, AbstractC9983y.m20315b(Object.class), startDestination, (Map<InterfaceC10481o, NavType<?>>) typeMap, builder);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, InterfaceC10469c interfaceC10469c, InterfaceC10469c interfaceC10469c2, Map map, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = AbstractC9925a.m20088h();
        }
        NavGraphBuilderKt.navigation(navGraphBuilder, interfaceC10469c, interfaceC10469c2, (Map<InterfaceC10481o, NavType<?>>) map, interfaceC9540l);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, Object startDestination, Map typeMap, InterfaceC9540l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMap = AbstractC9925a.m20088h();
        }
        AbstractC9979u.m20294g(navGraphBuilder, "<this>");
        AbstractC9979u.m20294g(startDestination, "startDestination");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        AbstractC9979u.m20294g(builder, "builder");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        NavGraphBuilderKt.navigation(navGraphBuilder, AbstractC9983y.m20315b(Object.class), startDestination, (Map<InterfaceC10481o, NavType<?>>) typeMap, builder);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, InterfaceC10469c interfaceC10469c, Object obj, Map map, InterfaceC9540l interfaceC9540l, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            map = AbstractC9925a.m20088h();
        }
        NavGraphBuilderKt.navigation(navGraphBuilder, interfaceC10469c, obj, (Map<InterfaceC10481o, NavType<?>>) map, interfaceC9540l);
    }
}
