package androidx.navigation;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u001aD\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001ak\u0010\n\u001a\u00020\t*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\f2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\u001d\b\u0002\u0010\u0011\u001a\u0017\u0012\u0004\u0012\u00020\u000e\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000f¢\u0006\u0002\b\u00100\r2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0012\u001ag\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00132\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\u001d\b\u0002\u0010\u0011\u001a\u0017\u0012\u0004\u0012\u00020\u000e\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000f¢\u0006\u0002\b\u00100\r2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0014\u001a@\u0010\n\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0015\u001ai\u0010\n\u001a\u00020\u0006\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u0013*\u00020\u00052\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\f2\u001d\b\u0002\u0010\u0011\u001a\u0017\u0012\u0004\u0012\u00020\u000e\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000f¢\u0006\u0002\b\u00100\r2\u0019\b\b\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0017\u001am\u0010\n\u001a\u00020\u0006\"\b\b\u0000\u0010\u0016*\u00020\u0013*\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\f2\u001d\b\u0002\u0010\u0011\u001a\u0017\u0012\u0004\u0012\u00020\u000e\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000f¢\u0006\u0002\b\u00100\r2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u0018\u001ae\u0010\n\u001a\u00020\u0006\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u0013*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00132\u001d\b\u0002\u0010\u0011\u001a\u0017\u0012\u0004\u0012\u00020\u000e\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000f¢\u0006\u0002\b\u00100\r2\u0019\b\b\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0019\u001ai\u0010\n\u001a\u00020\u0006\"\b\b\u0000\u0010\u0016*\u00020\u0013*\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0002\u001a\u00020\u00132\u001d\b\u0002\u0010\u0011\u001a\u0017\u0012\u0004\u0012\u00020\u000e\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000f¢\u0006\u0002\b\u00100\r2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, m5110d2 = {"Landroidx/navigation/NavigatorProvider;", "", "startDestination", "route", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builder", "Landroidx/navigation/NavGraph;", "navigation", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;Lr6/c;)Landroidx/navigation/NavGraph;", "Ly6/c;", "", "Ly6/q;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Landroidx/navigation/NavigatorProvider;Ly6/c;Ly6/c;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavGraph;", "", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/Object;Ly6/c;Ljava/util/Map;Lr6/c;)Landroidx/navigation/NavGraph;", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Lr6/c;)V", ExifInterface.GPS_DIRECTION_TRUE, "(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Lr6/c;)V", "(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ly6/c;Ljava/util/Map;Lr6/c;)V", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ljava/util/Map;Lr6/c;)V", "(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/lang/Object;Ljava/util/Map;Lr6/c;)V", "navigation-common_release"}, m5111k = 5, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/navigation/NavGraphBuilderKt")
/* loaded from: classes2.dex */
final /* synthetic */ class NavGraphBuilderKt__NavGraphBuilderKt {
    @NotNull
    public static final NavGraph navigation(@NotNull NavigatorProvider navigatorProvider, @NotNull String startDestination, @Nullable String str, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(navigatorProvider, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, String startDestination, String str, InterfaceC6471c builder, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        AbstractC5830k.m5330g(navigatorProvider, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @NotNull
    public static final NavGraph navigation(@NotNull NavigatorProvider navigatorProvider, @NotNull InterfaceC6779c startDestination, @Nullable InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> typeMap, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(navigatorProvider, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, interfaceC6779c, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @NotNull
    public static final NavGraph navigation(@NotNull NavigatorProvider navigatorProvider, @NotNull Object startDestination, @Nullable InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> typeMap, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(navigatorProvider, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, interfaceC6779c, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, InterfaceC6779c startDestination, InterfaceC6779c interfaceC6779c, Map typeMap, InterfaceC6471c builder, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6779c = null;
        }
        if ((i & 4) != 0) {
            typeMap = AbstractC5785e0.m5147A();
        }
        AbstractC5830k.m5330g(navigatorProvider, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, interfaceC6779c, (Map<InterfaceC6793q, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final void navigation(@NotNull NavGraphBuilder navGraphBuilder, @NotNull String startDestination, @NotNull String route, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(navGraphBuilder, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), startDestination, route);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static final <T> void navigation(@NotNull NavGraphBuilder navGraphBuilder, @NotNull InterfaceC6779c route, @NotNull InterfaceC6779c startDestination, @NotNull Map<InterfaceC6793q, NavType<?>> typeMap, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(navGraphBuilder, "<this>");
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), startDestination, route, typeMap);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static final <T> void navigation(@NotNull NavGraphBuilder navGraphBuilder, @NotNull InterfaceC6779c route, @NotNull Object startDestination, @NotNull Map<InterfaceC6793q, NavType<?>> typeMap, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(navGraphBuilder, "<this>");
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), startDestination, route, typeMap);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, Object startDestination, InterfaceC6779c interfaceC6779c, Map typeMap, InterfaceC6471c builder, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6779c = null;
        }
        if ((i & 4) != 0) {
            typeMap = AbstractC5785e0.m5147A();
        }
        AbstractC5830k.m5330g(navigatorProvider, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, interfaceC6779c, (Map<InterfaceC6793q, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, Object startDestination, Map<InterfaceC6793q, NavType<?>> typeMap, InterfaceC6471c builder) {
        AbstractC5830k.m5330g(navGraphBuilder, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        AbstractC5830k.m5338o();
        throw null;
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, InterfaceC6779c startDestination, Map<InterfaceC6793q, NavType<?>> typeMap, InterfaceC6471c builder) {
        AbstractC5830k.m5330g(navGraphBuilder, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        AbstractC5830k.m5338o();
        throw null;
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder, InterfaceC6779c startDestination, Map typeMap, InterfaceC6471c builder, int i, Object obj) {
        if ((i & 2) != 0) {
            typeMap = AbstractC5785e0.m5147A();
        }
        AbstractC5830k.m5330g(navGraphBuilder, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        AbstractC5830k.m5338o();
        throw null;
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, InterfaceC6779c interfaceC6779c, InterfaceC6779c interfaceC6779c2, Map map, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 4) != 0) {
            map = AbstractC5785e0.m5147A();
        }
        NavGraphBuilderKt.navigation(navGraphBuilder, interfaceC6779c, interfaceC6779c2, (Map<InterfaceC6793q, NavType<?>>) map, interfaceC6471c);
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder, Object startDestination, Map typeMap, InterfaceC6471c builder, int i, Object obj) {
        if ((i & 2) != 0) {
            typeMap = AbstractC5785e0.m5147A();
        }
        AbstractC5830k.m5330g(navGraphBuilder, "<this>");
        AbstractC5830k.m5330g(startDestination, "startDestination");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        AbstractC5830k.m5330g(builder, "builder");
        AbstractC5830k.m5338o();
        throw null;
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, InterfaceC6779c interfaceC6779c, Object obj, Map map, InterfaceC6471c interfaceC6471c, int i, Object obj2) {
        if ((i & 4) != 0) {
            map = AbstractC5785e0.m5147A();
        }
        NavGraphBuilderKt.navigation(navGraphBuilder, interfaceC6779c, obj, (Map<InterfaceC6793q, NavType<?>>) map, interfaceC6471c);
    }
}
