package androidx.navigation;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;

/* loaded from: classes3.dex */
final /* synthetic */ class NavGraphKt__NavGraphKt {
    public static final boolean contains(NavGraph navGraph, String route) {
        AbstractC9133u.m16133g(navGraph, "<this>");
        AbstractC9133u.m16133g(route, "route");
        return navGraph.findNode(route) != null;
    }

    public static final NavDestination get(NavGraph navGraph, String route) {
        AbstractC9133u.m16133g(navGraph, "<this>");
        AbstractC9133u.m16133g(route, "route");
        NavDestination navDestinationFindNode = navGraph.findNode(route);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + navGraph);
    }

    public static final void minusAssign(NavGraph navGraph, NavDestination node) {
        AbstractC9133u.m16133g(navGraph, "<this>");
        AbstractC9133u.m16133g(node, "node");
        navGraph.remove(node);
    }

    public static final void plusAssign(NavGraph navGraph, NavDestination node) {
        AbstractC9133u.m16133g(navGraph, "<this>");
        AbstractC9133u.m16133g(node, "node");
        navGraph.addDestination(node);
    }

    public static final <T> boolean contains(NavGraph navGraph, T route) {
        AbstractC9133u.m16133g(navGraph, "<this>");
        AbstractC9133u.m16133g(route, "route");
        return navGraph.findNode((NavGraph) route) != null;
    }

    public static final void plusAssign(NavGraph navGraph, NavGraph other) {
        AbstractC9133u.m16133g(navGraph, "<this>");
        AbstractC9133u.m16133g(other, "other");
        navGraph.addAll(other);
    }

    public static final /* synthetic */ <T> boolean contains(NavGraph navGraph, InterfaceC8375c route) {
        AbstractC9133u.m16133g(navGraph, "<this>");
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return navGraph.findNode(AbstractC9137y.m16154b(Object.class)) != null;
    }

    public static final <T> NavDestination get(NavGraph navGraph, T route) {
        AbstractC9133u.m16133g(navGraph, "<this>");
        AbstractC9133u.m16133g(route, "route");
        NavDestination navDestinationFindNode = navGraph.findNode((NavGraph) route);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + navGraph);
    }

    public static final /* synthetic */ <T> NavDestination get(NavGraph navGraph, InterfaceC8375c route) {
        AbstractC9133u.m16133g(navGraph, "<this>");
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        NavDestination navDestinationFindNode = navGraph.findNode(AbstractC9137y.m16154b(Object.class));
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + navGraph);
    }
}
