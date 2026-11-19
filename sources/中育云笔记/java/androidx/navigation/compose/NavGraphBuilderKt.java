package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p014ui.window.DialogProperties;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavType;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10481o;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
public final class NavGraphBuilderKt {
    @InterfaceC10770a
    public static final /* synthetic */ void composable(NavGraphBuilder navGraphBuilder, String str, List list, List list2, final InterfaceC9545q interfaceC9545q) {
        ComposeNavigator.Destination destination = new ComposeNavigator.Destination((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), (InterfaceC9546r) ComposableLambdaKt.composableLambdaInstance(-1516831465, true, new InterfaceC9546r() { // from class: androidx.navigation.compose.NavGraphBuilderKt.composable.1
            @Override // p181hd.InterfaceC9546r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i10) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1516831465, i10, -1, "androidx.navigation.compose.composable.<anonymous> (NavGraphBuilder.kt:55)");
                }
                interfaceC9545q.invoke(navBackStackEntry, composer, Integer.valueOf((i10 >> 3) & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        destination.setRoute(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
            destination.addArgument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            destination.addDeepLink((NavDeepLink) it2.next());
        }
        navGraphBuilder.addDestination(destination);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, InterfaceC9545q interfaceC9545q, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = AbstractC10978w.m24136n();
        }
        if ((i10 & 4) != 0) {
            list2 = AbstractC10978w.m24136n();
        }
        composable(navGraphBuilder, str, list, list2, interfaceC9545q);
    }

    public static final void dialog(NavGraphBuilder navGraphBuilder, String str, List<NamedNavArgument> list, List<NavDeepLink> list2, DialogProperties dialogProperties, InterfaceC9545q interfaceC9545q) {
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder = new DialogNavigatorDestinationBuilder((DialogNavigator) navGraphBuilder.getProvider().getNavigator(DialogNavigator.class), str, dialogProperties, interfaceC9545q);
        for (NamedNavArgument namedNavArgument : list) {
            dialogNavigatorDestinationBuilder.argument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            dialogNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        navGraphBuilder.destination(dialogNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void dialog$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, DialogProperties dialogProperties, InterfaceC9545q interfaceC9545q, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = AbstractC10978w.m24136n();
        }
        List list3 = list;
        if ((i10 & 4) != 0) {
            list2 = AbstractC10978w.m24136n();
        }
        dialog(navGraphBuilder, str, (List<NamedNavArgument>) list3, (List<NavDeepLink>) list2, (i10 & 8) != 0 ? new DialogProperties(false, false, false, 7, (AbstractC9972n) null) : dialogProperties, interfaceC9545q);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = AbstractC10978w.m24136n();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = AbstractC10978w.m24136n();
        }
        navigation(navGraphBuilder, str, str2, (List<NamedNavArgument>) list3, (List<NavDeepLink>) list2, (InterfaceC9540l) null, (InterfaceC9540l) null, (InterfaceC9540l) null, (InterfaceC9540l) null, (InterfaceC9540l) null, interfaceC9540l);
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder, String str, String str2, List<NamedNavArgument> list, List<NavDeepLink> list2, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), str, str2);
        interfaceC9540l6.invoke(navGraphBuilder2);
        NavGraph navGraphBuild = navGraphBuilder2.build();
        for (NamedNavArgument namedNavArgument : list) {
            navGraphBuild.addArgument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            navGraphBuild.addDeepLink((NavDeepLink) it.next());
        }
        if (navGraphBuild instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) navGraphBuild;
            composeNavGraph.setEnterTransition$navigation_compose_release(interfaceC9540l);
            composeNavGraph.setExitTransition$navigation_compose_release(interfaceC9540l2);
            composeNavGraph.setPopEnterTransition$navigation_compose_release(interfaceC9540l3);
            composeNavGraph.setPopExitTransition$navigation_compose_release(interfaceC9540l4);
            composeNavGraph.setSizeTransform$navigation_compose_release(interfaceC9540l5);
        }
        navGraphBuilder.addDestination(navGraphBuild);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9546r interfaceC9546r, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = AbstractC10978w.m24136n();
        }
        List list3 = list;
        if ((i10 & 4) != 0) {
            list2 = AbstractC10978w.m24136n();
        }
        List list4 = list2;
        InterfaceC9540l interfaceC9540l5 = (i10 & 8) != 0 ? null : interfaceC9540l;
        InterfaceC9540l interfaceC9540l6 = (i10 & 16) != 0 ? null : interfaceC9540l2;
        composable(navGraphBuilder, str, list3, list4, interfaceC9540l5, interfaceC9540l6, (i10 & 32) != 0 ? interfaceC9540l5 : interfaceC9540l3, (i10 & 64) != 0 ? interfaceC9540l6 : interfaceC9540l4, interfaceC9546r);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = AbstractC10978w.m24136n();
        }
        List list3 = list;
        List listM24136n = (i10 & 8) != 0 ? AbstractC10978w.m24136n() : list2;
        InterfaceC9540l interfaceC9540l6 = (i10 & 16) != 0 ? null : interfaceC9540l;
        InterfaceC9540l interfaceC9540l7 = (i10 & 32) != 0 ? null : interfaceC9540l2;
        navigation(navGraphBuilder, str, str2, (List<NamedNavArgument>) list3, (List<NavDeepLink>) listM24136n, interfaceC9540l6, interfaceC9540l7, (i10 & 64) != 0 ? interfaceC9540l6 : interfaceC9540l3, (i10 & 128) != 0 ? interfaceC9540l7 : interfaceC9540l4, (InterfaceC9540l) null, interfaceC9540l5);
    }

    public static /* synthetic */ void dialog$default(NavGraphBuilder navGraphBuilder, Map map, List list, DialogProperties dialogProperties, InterfaceC9545q interfaceC9545q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = AbstractC9925a.m20088h();
        }
        Map map2 = map;
        if ((i10 & 2) != 0) {
            list = AbstractC10978w.m24136n();
        }
        List list2 = list;
        DialogProperties dialogProperties2 = (i10 & 4) != 0 ? new DialogProperties(false, false, false, 7, (AbstractC9972n) null) : dialogProperties;
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        dialog(navGraphBuilder, AbstractC9983y.m20315b(Object.class), (Map<InterfaceC10481o, NavType<?>>) map2, (List<NavDeepLink>) list2, dialogProperties2, interfaceC9545q);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9546r interfaceC9546r, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = AbstractC10978w.m24136n();
        }
        List list3 = list;
        if ((i10 & 4) != 0) {
            list2 = AbstractC10978w.m24136n();
        }
        List list4 = list2;
        InterfaceC9540l interfaceC9540l6 = (i10 & 8) != 0 ? null : interfaceC9540l;
        InterfaceC9540l interfaceC9540l7 = (i10 & 16) != 0 ? null : interfaceC9540l2;
        composable(navGraphBuilder, str, (List<NamedNavArgument>) list3, (List<NavDeepLink>) list4, interfaceC9540l6, interfaceC9540l7, (i10 & 32) != 0 ? interfaceC9540l6 : interfaceC9540l3, (i10 & 64) != 0 ? interfaceC9540l7 : interfaceC9540l4, (i10 & 128) != 0 ? null : interfaceC9540l5, interfaceC9546r);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6, int i10, Object obj) {
        InterfaceC9540l interfaceC9540l7;
        NavGraphBuilder navGraphBuilder2;
        String str3;
        String str4;
        InterfaceC9540l interfaceC9540l8;
        List listM24136n = (i10 & 4) != 0 ? AbstractC10978w.m24136n() : list;
        List listM24136n2 = (i10 & 8) != 0 ? AbstractC10978w.m24136n() : list2;
        InterfaceC9540l interfaceC9540l9 = (i10 & 16) != 0 ? null : interfaceC9540l;
        InterfaceC9540l interfaceC9540l10 = (i10 & 32) != 0 ? null : interfaceC9540l2;
        InterfaceC9540l interfaceC9540l11 = (i10 & 64) != 0 ? interfaceC9540l9 : interfaceC9540l3;
        InterfaceC9540l interfaceC9540l12 = (i10 & 128) != 0 ? interfaceC9540l10 : interfaceC9540l4;
        if ((i10 & 256) != 0) {
            interfaceC9540l7 = null;
            str3 = str;
            str4 = str2;
            interfaceC9540l8 = interfaceC9540l6;
            navGraphBuilder2 = navGraphBuilder;
        } else {
            interfaceC9540l7 = interfaceC9540l5;
            navGraphBuilder2 = navGraphBuilder;
            str3 = str;
            str4 = str2;
            interfaceC9540l8 = interfaceC9540l6;
        }
        navigation(navGraphBuilder2, str3, str4, (List<NamedNavArgument>) listM24136n, (List<NavDeepLink>) listM24136n2, interfaceC9540l9, interfaceC9540l10, interfaceC9540l11, interfaceC9540l12, interfaceC9540l7, interfaceC9540l8);
    }

    public static /* synthetic */ void dialog$default(NavGraphBuilder navGraphBuilder, InterfaceC10469c interfaceC10469c, Map map, List list, DialogProperties dialogProperties, InterfaceC9545q interfaceC9545q, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = AbstractC9925a.m20088h();
        }
        Map map2 = map;
        if ((i10 & 4) != 0) {
            list = AbstractC10978w.m24136n();
        }
        dialog(navGraphBuilder, interfaceC10469c, (Map<InterfaceC10481o, NavType<?>>) map2, (List<NavDeepLink>) list, (i10 & 8) != 0 ? new DialogProperties(false, false, false, 7, (AbstractC9972n) null) : dialogProperties, interfaceC9545q);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, Map map, List list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9546r interfaceC9546r, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = AbstractC9925a.m20088h();
        }
        Map map2 = map;
        if ((i10 & 2) != 0) {
            list = AbstractC10978w.m24136n();
        }
        List list2 = list;
        InterfaceC9540l interfaceC9540l6 = (i10 & 4) != 0 ? null : interfaceC9540l;
        InterfaceC9540l interfaceC9540l7 = (i10 & 8) != 0 ? null : interfaceC9540l2;
        InterfaceC9540l interfaceC9540l8 = (i10 & 16) != 0 ? interfaceC9540l6 : interfaceC9540l3;
        InterfaceC9540l interfaceC9540l9 = (i10 & 32) != 0 ? interfaceC9540l7 : interfaceC9540l4;
        InterfaceC9540l interfaceC9540l10 = (i10 & 64) != 0 ? null : interfaceC9540l5;
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        composable(navGraphBuilder, AbstractC9983y.m20315b(Object.class), (Map<InterfaceC10481o, NavType<?>>) map2, (List<NavDeepLink>) list2, interfaceC9540l6, interfaceC9540l7, interfaceC9540l8, interfaceC9540l9, interfaceC9540l10, interfaceC9546r);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, InterfaceC10469c interfaceC10469c, Map map, List list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = AbstractC9925a.m20088h();
        }
        Map map2 = map;
        List listM24136n = (i10 & 4) != 0 ? AbstractC10978w.m24136n() : list;
        InterfaceC9540l interfaceC9540l7 = (i10 & 8) != 0 ? null : interfaceC9540l;
        InterfaceC9540l interfaceC9540l8 = (i10 & 16) != 0 ? null : interfaceC9540l2;
        InterfaceC9540l interfaceC9540l9 = (i10 & 32) != 0 ? interfaceC9540l7 : interfaceC9540l3;
        InterfaceC9540l interfaceC9540l10 = (i10 & 64) != 0 ? interfaceC9540l8 : interfaceC9540l4;
        InterfaceC9540l interfaceC9540l11 = (i10 & 128) != 0 ? null : interfaceC9540l5;
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        navigation(navGraphBuilder, interfaceC10469c, AbstractC9983y.m20315b(Object.class), (Map<InterfaceC10481o, NavType<?>>) map2, (List<NavDeepLink>) listM24136n, interfaceC9540l7, interfaceC9540l8, interfaceC9540l9, interfaceC9540l10, interfaceC9540l11, interfaceC9540l6);
    }

    @InterfaceC10770a
    public static final /* synthetic */ void composable(NavGraphBuilder navGraphBuilder, String str, List list, List list2, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9546r interfaceC9546r) {
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), str, interfaceC9546r);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
            composeNavigatorDestinationBuilder.argument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            composeNavigatorDestinationBuilder.deepLink((NavDeepLink) it2.next());
        }
        composeNavigatorDestinationBuilder.setEnterTransition(interfaceC9540l);
        composeNavigatorDestinationBuilder.setExitTransition(interfaceC9540l2);
        composeNavigatorDestinationBuilder.setPopEnterTransition(interfaceC9540l3);
        composeNavigatorDestinationBuilder.setPopExitTransition(interfaceC9540l4);
        navGraphBuilder.destination(composeNavigatorDestinationBuilder);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void dialog(NavGraphBuilder navGraphBuilder, Map<InterfaceC10481o, NavType<?>> map, List<NavDeepLink> list, DialogProperties dialogProperties, InterfaceC9545q interfaceC9545q) {
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        dialog(navGraphBuilder, AbstractC9983y.m20315b(Object.class), map, list, dialogProperties, interfaceC9545q);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, InterfaceC10469c interfaceC10469c, Map map, List list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9546r interfaceC9546r, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = AbstractC9925a.m20088h();
        }
        Map map2 = map;
        if ((i10 & 4) != 0) {
            list = AbstractC10978w.m24136n();
        }
        List list2 = list;
        InterfaceC9540l interfaceC9540l6 = (i10 & 8) != 0 ? null : interfaceC9540l;
        InterfaceC9540l interfaceC9540l7 = (i10 & 16) != 0 ? null : interfaceC9540l2;
        composable(navGraphBuilder, interfaceC10469c, (Map<InterfaceC10481o, NavType<?>>) map2, (List<NavDeepLink>) list2, interfaceC9540l6, interfaceC9540l7, (i10 & 32) != 0 ? interfaceC9540l6 : interfaceC9540l3, (i10 & 64) != 0 ? interfaceC9540l7 : interfaceC9540l4, (i10 & 128) != 0 ? null : interfaceC9540l5, interfaceC9546r);
    }

    public static final <T> void dialog(NavGraphBuilder navGraphBuilder, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> map, List<NavDeepLink> list, DialogProperties dialogProperties, InterfaceC9545q interfaceC9545q) {
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder = new DialogNavigatorDestinationBuilder((DialogNavigator) navGraphBuilder.getProvider().getNavigator(DialogNavigator.class), interfaceC10469c, map, dialogProperties, interfaceC9545q);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            dialogNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        navGraphBuilder.destination(dialogNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, InterfaceC10469c interfaceC10469c, InterfaceC10469c interfaceC10469c2, Map map, List list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6, int i10, Object obj) {
        InterfaceC9540l interfaceC9540l7;
        NavGraphBuilder navGraphBuilder2;
        InterfaceC10469c interfaceC10469c3;
        InterfaceC10469c interfaceC10469c4;
        InterfaceC9540l interfaceC9540l8;
        Map mapM20088h = (i10 & 4) != 0 ? AbstractC9925a.m20088h() : map;
        List listM24136n = (i10 & 8) != 0 ? AbstractC10978w.m24136n() : list;
        InterfaceC9540l interfaceC9540l9 = (i10 & 16) != 0 ? null : interfaceC9540l;
        InterfaceC9540l interfaceC9540l10 = (i10 & 32) != 0 ? null : interfaceC9540l2;
        InterfaceC9540l interfaceC9540l11 = (i10 & 64) != 0 ? interfaceC9540l9 : interfaceC9540l3;
        InterfaceC9540l interfaceC9540l12 = (i10 & 128) != 0 ? interfaceC9540l10 : interfaceC9540l4;
        if ((i10 & 256) != 0) {
            interfaceC9540l7 = null;
            interfaceC10469c3 = interfaceC10469c;
            interfaceC10469c4 = interfaceC10469c2;
            interfaceC9540l8 = interfaceC9540l6;
            navGraphBuilder2 = navGraphBuilder;
        } else {
            interfaceC9540l7 = interfaceC9540l5;
            navGraphBuilder2 = navGraphBuilder;
            interfaceC10469c3 = interfaceC10469c;
            interfaceC10469c4 = interfaceC10469c2;
            interfaceC9540l8 = interfaceC9540l6;
        }
        navigation(navGraphBuilder2, interfaceC10469c3, interfaceC10469c4, (Map<InterfaceC10481o, NavType<?>>) mapM20088h, (List<NavDeepLink>) listM24136n, interfaceC9540l9, interfaceC9540l10, interfaceC9540l11, interfaceC9540l12, interfaceC9540l7, interfaceC9540l8);
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder navGraphBuilder, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> map, List<NavDeepLink> list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6) {
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        navigation(navGraphBuilder, interfaceC10469c, AbstractC9983y.m20315b(Object.class), map, list, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC9540l4, interfaceC9540l5, interfaceC9540l6);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, Object obj, Map map, List list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            map = AbstractC9925a.m20088h();
        }
        Map map2 = map;
        List listM24136n = (i10 & 4) != 0 ? AbstractC10978w.m24136n() : list;
        InterfaceC9540l interfaceC9540l7 = (i10 & 8) != 0 ? null : interfaceC9540l;
        InterfaceC9540l interfaceC9540l8 = (i10 & 16) != 0 ? null : interfaceC9540l2;
        InterfaceC9540l interfaceC9540l9 = (i10 & 32) != 0 ? interfaceC9540l7 : interfaceC9540l3;
        InterfaceC9540l interfaceC9540l10 = (i10 & 64) != 0 ? interfaceC9540l8 : interfaceC9540l4;
        InterfaceC9540l interfaceC9540l11 = (i10 & 128) != 0 ? null : interfaceC9540l5;
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        navigation(navGraphBuilder, obj, AbstractC9983y.m20315b(Object.class), (Map<InterfaceC10481o, NavType<?>>) map2, (List<NavDeepLink>) listM24136n, interfaceC9540l7, interfaceC9540l8, interfaceC9540l9, interfaceC9540l10, interfaceC9540l11, interfaceC9540l6);
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, InterfaceC10469c interfaceC10469c, InterfaceC10469c interfaceC10469c2, Map<InterfaceC10481o, NavType<?>> map, List<NavDeepLink> list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), interfaceC10469c, interfaceC10469c2, map);
        interfaceC9540l6.invoke(navGraphBuilder2);
        NavGraph navGraphBuild = navGraphBuilder2.build();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            navGraphBuild.addDeepLink((NavDeepLink) it.next());
        }
        if (navGraphBuild instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) navGraphBuild;
            composeNavGraph.setEnterTransition$navigation_compose_release(interfaceC9540l);
            composeNavGraph.setExitTransition$navigation_compose_release(interfaceC9540l2);
            composeNavGraph.setPopEnterTransition$navigation_compose_release(interfaceC9540l3);
            composeNavGraph.setPopExitTransition$navigation_compose_release(interfaceC9540l4);
            composeNavGraph.setSizeTransform$navigation_compose_release(interfaceC9540l5);
        }
        navGraphBuilder.addDestination(navGraphBuild);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, Object obj, InterfaceC10469c interfaceC10469c, Map map, List list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6, int i10, Object obj2) {
        InterfaceC9540l interfaceC9540l7;
        NavGraphBuilder navGraphBuilder2;
        Object obj3;
        InterfaceC10469c interfaceC10469c2;
        InterfaceC9540l interfaceC9540l8;
        Map mapM20088h = (i10 & 4) != 0 ? AbstractC9925a.m20088h() : map;
        List listM24136n = (i10 & 8) != 0 ? AbstractC10978w.m24136n() : list;
        InterfaceC9540l interfaceC9540l9 = (i10 & 16) != 0 ? null : interfaceC9540l;
        InterfaceC9540l interfaceC9540l10 = (i10 & 32) != 0 ? null : interfaceC9540l2;
        InterfaceC9540l interfaceC9540l11 = (i10 & 64) != 0 ? interfaceC9540l9 : interfaceC9540l3;
        InterfaceC9540l interfaceC9540l12 = (i10 & 128) != 0 ? interfaceC9540l10 : interfaceC9540l4;
        if ((i10 & 256) != 0) {
            interfaceC9540l7 = null;
            obj3 = obj;
            interfaceC10469c2 = interfaceC10469c;
            interfaceC9540l8 = interfaceC9540l6;
            navGraphBuilder2 = navGraphBuilder;
        } else {
            interfaceC9540l7 = interfaceC9540l5;
            navGraphBuilder2 = navGraphBuilder;
            obj3 = obj;
            interfaceC10469c2 = interfaceC10469c;
            interfaceC9540l8 = interfaceC9540l6;
        }
        navigation(navGraphBuilder2, obj3, interfaceC10469c2, (Map<InterfaceC10481o, NavType<?>>) mapM20088h, (List<NavDeepLink>) listM24136n, interfaceC9540l9, interfaceC9540l10, interfaceC9540l11, interfaceC9540l12, interfaceC9540l7, interfaceC9540l8);
    }

    public static final void composable(NavGraphBuilder navGraphBuilder, String str, List<NamedNavArgument> list, List<NavDeepLink> list2, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9546r interfaceC9546r) {
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), str, interfaceC9546r);
        for (NamedNavArgument namedNavArgument : list) {
            composeNavigatorDestinationBuilder.argument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            composeNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        composeNavigatorDestinationBuilder.setEnterTransition(interfaceC9540l);
        composeNavigatorDestinationBuilder.setExitTransition(interfaceC9540l2);
        composeNavigatorDestinationBuilder.setPopEnterTransition(interfaceC9540l3);
        composeNavigatorDestinationBuilder.setPopExitTransition(interfaceC9540l4);
        composeNavigatorDestinationBuilder.setSizeTransform(interfaceC9540l5);
        navGraphBuilder.destination(composeNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder navGraphBuilder, Object obj, Map<InterfaceC10481o, NavType<?>> map, List<NavDeepLink> list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6) {
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        navigation(navGraphBuilder, obj, AbstractC9983y.m20315b(Object.class), map, list, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC9540l4, interfaceC9540l5, interfaceC9540l6);
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, Object obj, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> map, List<NavDeepLink> list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9540l interfaceC9540l6) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), obj, interfaceC10469c, map);
        interfaceC9540l6.invoke(navGraphBuilder2);
        NavGraph navGraphBuild = navGraphBuilder2.build();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            navGraphBuild.addDeepLink((NavDeepLink) it.next());
        }
        if (navGraphBuild instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) navGraphBuild;
            composeNavGraph.setEnterTransition$navigation_compose_release(interfaceC9540l);
            composeNavGraph.setExitTransition$navigation_compose_release(interfaceC9540l2);
            composeNavGraph.setPopEnterTransition$navigation_compose_release(interfaceC9540l3);
            composeNavGraph.setPopExitTransition$navigation_compose_release(interfaceC9540l4);
            composeNavGraph.setSizeTransform$navigation_compose_release(interfaceC9540l5);
        }
        navGraphBuilder.addDestination(navGraphBuild);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void composable(NavGraphBuilder navGraphBuilder, Map<InterfaceC10481o, NavType<?>> map, List<NavDeepLink> list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9546r interfaceC9546r) {
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        composable(navGraphBuilder, AbstractC9983y.m20315b(Object.class), map, list, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC9540l4, interfaceC9540l5, interfaceC9546r);
    }

    public static final <T> void composable(NavGraphBuilder navGraphBuilder, InterfaceC10469c interfaceC10469c, Map<InterfaceC10481o, NavType<?>> map, List<NavDeepLink> list, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, InterfaceC9546r interfaceC9546r) {
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), interfaceC10469c, map, interfaceC9546r);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            composeNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        composeNavigatorDestinationBuilder.setEnterTransition(interfaceC9540l);
        composeNavigatorDestinationBuilder.setExitTransition(interfaceC9540l2);
        composeNavigatorDestinationBuilder.setPopEnterTransition(interfaceC9540l3);
        composeNavigatorDestinationBuilder.setPopExitTransition(interfaceC9540l4);
        composeNavigatorDestinationBuilder.setSizeTransform(interfaceC9540l5);
        navGraphBuilder.destination(composeNavigatorDestinationBuilder);
    }
}
