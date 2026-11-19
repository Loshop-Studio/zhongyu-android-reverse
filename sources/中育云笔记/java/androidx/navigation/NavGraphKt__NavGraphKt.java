package androidx.navigation;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p280od.InterfaceC10469c;

/* loaded from: classes.dex */
final /* synthetic */ class NavGraphKt__NavGraphKt {
    public static final boolean contains(NavGraph navGraph, String route) {
        AbstractC9979u.m20294g(navGraph, "<this>");
        AbstractC9979u.m20294g(route, "route");
        return navGraph.findNode(route) != null;
    }

    public static final NavDestination get(NavGraph navGraph, String route) {
        AbstractC9979u.m20294g(navGraph, "<this>");
        AbstractC9979u.m20294g(route, "route");
        NavDestination navDestinationFindNode = navGraph.findNode(route);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + navGraph);
    }

    public static final void minusAssign(NavGraph navGraph, NavDestination node) {
        AbstractC9979u.m20294g(navGraph, "<this>");
        AbstractC9979u.m20294g(node, "node");
        navGraph.remove(node);
    }

    public static final void plusAssign(NavGraph navGraph, NavDestination node) {
        AbstractC9979u.m20294g(navGraph, "<this>");
        AbstractC9979u.m20294g(node, "node");
        navGraph.addDestination(node);
    }

    public static final <T> boolean contains(NavGraph navGraph, T route) {
        AbstractC9979u.m20294g(navGraph, "<this>");
        AbstractC9979u.m20294g(route, "route");
        return navGraph.findNode((NavGraph) route) != null;
    }

    public static final void plusAssign(NavGraph navGraph, NavGraph other) {
        AbstractC9979u.m20294g(navGraph, "<this>");
        AbstractC9979u.m20294g(other, "other");
        navGraph.addAll(other);
    }

    public static final /* synthetic */ <T> boolean contains(NavGraph navGraph, InterfaceC10469c route) {
        AbstractC9979u.m20294g(navGraph, "<this>");
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return navGraph.findNode(AbstractC9983y.m20315b(Object.class)) != null;
    }

    public static final <T> NavDestination get(NavGraph navGraph, T route) {
        AbstractC9979u.m20294g(navGraph, "<this>");
        AbstractC9979u.m20294g(route, "route");
        NavDestination navDestinationFindNode = navGraph.findNode((NavGraph) route);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + navGraph);
    }

    public static final /* synthetic */ <T> NavDestination get(NavGraph navGraph, InterfaceC10469c route) {
        AbstractC9979u.m20294g(navGraph, "<this>");
        AbstractC9979u.m20294g(route, "route");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        NavDestination navDestinationFindNode = navGraph.findNode(AbstractC9983y.m20315b(Object.class));
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + navGraph);
    }
}
