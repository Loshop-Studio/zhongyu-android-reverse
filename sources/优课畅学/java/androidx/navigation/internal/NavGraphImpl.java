package androidx.navigation.internal;

import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavArgument;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p101f8.AbstractC8476n;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8798p0;
import p134i7.AbstractC8809v;
import p246s8.AbstractC10067q;
import p246s8.InterfaceC10052b;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class NavGraphImpl {
    private final NavGraph graph;
    private final SparseArrayCompat<NavDestination> nodes;
    private int startDestId;
    private String startDestIdName;
    private String startDestinationRoute;

    public NavGraphImpl(NavGraph graph) {
        AbstractC9133u.m16133g(graph, "graph");
        this.graph = graph;
        this.nodes = new SparseArrayCompat<>(0, 1, null);
    }

    public static /* synthetic */ NavDestination findNodeComprehensive$navigation_common_release$default(NavGraphImpl navGraphImpl, int i10, NavDestination navDestination, boolean z10, NavDestination navDestination2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            navDestination2 = null;
        }
        return navGraphImpl.findNodeComprehensive$navigation_common_release(i10, navDestination, z10, navDestination2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setStartDestination$lambda$12(NavDestination startDestination) {
        AbstractC9133u.m16133g(startDestination, "startDestination");
        String route = startDestination.getRoute();
        AbstractC9133u.m16130d(route);
        return route;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setStartDestination$lambda$14(Object obj, NavDestination startDestination) {
        AbstractC9133u.m16133g(startDestination, "startDestination");
        Map<String, NavArgument> arguments = startDestination.getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8798p0.m14663e(arguments.size()));
        Iterator<T> it = arguments.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
        }
        return RouteSerializerKt.generateRouteWithArgs(obj, linkedHashMap);
    }

    public final void addAll$navigation_common_release(NavGraph other) {
        AbstractC9133u.m16133g(other, "other");
        Iterator<NavDestination> it = other.iterator();
        while (it.hasNext()) {
            NavDestination next = it.next();
            it.remove();
            addDestination$navigation_common_release(next);
        }
    }

    public final void addDestination$navigation_common_release(NavDestination node) {
        AbstractC9133u.m16133g(node, "node");
        int id = node.getId();
        String route = node.getRoute();
        if (id == 0 && route == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (this.graph.getRoute() != null && AbstractC9133u.m16128b(route, this.graph.getRoute())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this.graph).toString());
        }
        if (id == this.graph.getId()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this.graph).toString());
        }
        NavDestination navDestination = this.nodes.get(id);
        if (navDestination == node) {
            return;
        }
        if (node.getParent() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (navDestination != null) {
            navDestination.setParent(null);
        }
        node.setParent(this.graph);
        this.nodes.put(node.getId(), node);
    }

    public final void addDestinations$navigation_common_release(Collection<? extends NavDestination> nodes) {
        AbstractC9133u.m16133g(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            if (navDestination != null) {
                addDestination$navigation_common_release(navDestination);
            }
        }
    }

    public final void clear$navigation_common_release() {
        Iterator<NavDestination> itIterator$navigation_common_release = iterator$navigation_common_release();
        while (itIterator$navigation_common_release.hasNext()) {
            itIterator$navigation_common_release.next();
            itIterator$navigation_common_release.remove();
        }
    }

    public final NavDestination findNode$navigation_common_release(int i10) {
        return findNodeComprehensive$navigation_common_release$default(this, i10, this.graph, false, null, 8, null);
    }

    public final NavDestination findNodeComprehensive$navigation_common_release(int i10, NavDestination navDestination, boolean z10, NavDestination navDestination2) {
        NavDestination navDestination3 = this.nodes.get(i10);
        if (navDestination2 != null) {
            if (AbstractC9133u.m16128b(navDestination3, navDestination2) && AbstractC9133u.m16128b(navDestination3.getParent(), navDestination2.getParent())) {
                return navDestination3;
            }
            navDestination3 = null;
        } else if (navDestination3 != null) {
            return navDestination3;
        }
        if (z10) {
            Iterator it = AbstractC8476n.m13830e(SparseArrayKt.valueIterator(this.nodes)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    navDestination3 = null;
                    break;
                }
                NavDestination navDestination4 = (NavDestination) it.next();
                NavDestination navDestinationFindNodeComprehensive = (!(navDestination4 instanceof NavGraph) || AbstractC9133u.m16128b(navDestination4, navDestination)) ? null : ((NavGraph) navDestination4).findNodeComprehensive(i10, this.graph, true, navDestination2);
                if (navDestinationFindNodeComprehensive != null) {
                    navDestination3 = navDestinationFindNodeComprehensive;
                    break;
                }
            }
        }
        if (navDestination3 != null) {
            return navDestination3;
        }
        if (this.graph.getParent() == null || AbstractC9133u.m16128b(this.graph.getParent(), navDestination)) {
            return null;
        }
        NavGraph parent = this.graph.getParent();
        AbstractC9133u.m16130d(parent);
        return parent.findNodeComprehensive(i10, this.graph, z10, navDestination2);
    }

    public final String getDisplayName$navigation_common_release(String superName) {
        AbstractC9133u.m16133g(superName, "superName");
        return this.graph.getId() != 0 ? superName : "the root navigation";
    }

    public final NavGraph getGraph() {
        return this.graph;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final SparseArrayCompat<NavDestination> getNodes$navigation_common_release() {
        return this.nodes;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String getStartDestDisplayName$navigation_common_release() {
        if (this.startDestIdName == null) {
            String strValueOf = this.startDestinationRoute;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.startDestId);
            }
            this.startDestIdName = strValueOf;
        }
        String str = this.startDestIdName;
        AbstractC9133u.m16130d(str);
        return str;
    }

    public final int getStartDestId$navigation_common_release() {
        return this.startDestId;
    }

    public final String getStartDestIdName$navigation_common_release() {
        return this.startDestIdName;
    }

    public final int getStartDestinationId$navigation_common_release() {
        return this.startDestId;
    }

    public final String getStartDestinationRoute$navigation_common_release() {
        return this.startDestinationRoute;
    }

    public final Iterator<NavDestination> iterator$navigation_common_release() {
        return new NavGraphImpl$iterator$1(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination.DeepLinkMatch matchDeepLink$navigation_common_release(NavDestination.DeepLinkMatch deepLinkMatch, NavDeepLinkRequest navDeepLinkRequest) {
        AbstractC9133u.m16133g(navDeepLinkRequest, "navDeepLinkRequest");
        return matchDeepLinkComprehensive$navigation_common_release(deepLinkMatch, navDeepLinkRequest, true, false, this.graph);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination.DeepLinkMatch matchDeepLinkComprehensive$navigation_common_release(NavDestination.DeepLinkMatch deepLinkMatch, NavDeepLinkRequest navDeepLinkRequest, boolean z10, boolean z11, NavDestination lastVisited) {
        NavDestination.DeepLinkMatch deepLinkMatch2;
        AbstractC9133u.m16133g(navDeepLinkRequest, "navDeepLinkRequest");
        AbstractC9133u.m16133g(lastVisited, "lastVisited");
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = null;
        if (z10) {
            NavGraph navGraph = this.graph;
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination : navGraph) {
                NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink = !AbstractC9133u.m16128b(navDestination, lastVisited) ? navDestination.matchDeepLink(navDeepLinkRequest) : null;
                if (deepLinkMatchMatchDeepLink != null) {
                    arrayList.add(deepLinkMatchMatchDeepLink);
                }
            }
            deepLinkMatch2 = (NavDestination.DeepLinkMatch) AbstractC8778f0.m14580z0(arrayList);
        } else {
            deepLinkMatch2 = null;
        }
        NavGraph parent = this.graph.getParent();
        if (parent != null && z11 && !AbstractC9133u.m16128b(parent, lastVisited)) {
            deepLinkMatchMatchDeepLinkComprehensive = parent.matchDeepLinkComprehensive(navDeepLinkRequest, z10, true, this.graph);
        }
        return (NavDestination.DeepLinkMatch) AbstractC8778f0.m14580z0(AbstractC8809v.m14775r(deepLinkMatch, deepLinkMatch2, deepLinkMatchMatchDeepLinkComprehensive));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination.DeepLinkMatch matchRouteComprehensive$navigation_common_release(String route, boolean z10, boolean z11, NavDestination lastVisited) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(lastVisited, "lastVisited");
        NavDestination.DeepLinkMatch deepLinkMatchMatchRoute = this.graph.matchRoute(route);
        NavDestination.DeepLinkMatch deepLinkMatchMatchRouteComprehensive = null;
        if (z10) {
            NavGraph navGraph = this.graph;
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination : navGraph) {
                NavDestination.DeepLinkMatch deepLinkMatchMatchRouteComprehensive2 = AbstractC9133u.m16128b(navDestination, lastVisited) ? null : navDestination instanceof NavGraph ? ((NavGraph) navDestination).matchRouteComprehensive(route, true, false, this.graph) : navDestination.matchRoute(route);
                if (deepLinkMatchMatchRouteComprehensive2 != null) {
                    arrayList.add(deepLinkMatchMatchRouteComprehensive2);
                }
            }
            deepLinkMatch = (NavDestination.DeepLinkMatch) AbstractC8778f0.m14580z0(arrayList);
        } else {
            deepLinkMatch = null;
        }
        NavGraph parent = this.graph.getParent();
        if (parent != null && z11 && !AbstractC9133u.m16128b(parent, lastVisited)) {
            deepLinkMatchMatchRouteComprehensive = parent.matchRouteComprehensive(route, z10, true, this.graph);
        }
        return (NavDestination.DeepLinkMatch) AbstractC8778f0.m14580z0(AbstractC8809v.m14775r(deepLinkMatchMatchRoute, deepLinkMatch, deepLinkMatchMatchRouteComprehensive));
    }

    public final void remove$navigation_common_release(NavDestination node) {
        AbstractC9133u.m16133g(node, "node");
        int iIndexOfKey = this.nodes.indexOfKey(node.getId());
        if (iIndexOfKey >= 0) {
            this.nodes.valueAt(iIndexOfKey).setParent(null);
            this.nodes.removeAt(iIndexOfKey);
        }
    }

    public final void setStartDestId$navigation_common_release(int i10) {
        this.startDestId = i10;
    }

    public final void setStartDestIdName$navigation_common_release(String str) {
        this.startDestIdName = str;
    }

    public final void setStartDestination$navigation_common_release(int i10) {
        setStartDestinationId$navigation_common_release(i10);
    }

    public final void setStartDestinationId$navigation_common_release(int i10) {
        if (i10 != this.graph.getId()) {
            if (this.startDestinationRoute != null) {
                setStartDestinationRoute$navigation_common_release(null);
            }
            this.startDestId = i10;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i10 + " cannot use the same id as the graph " + this.graph).toString());
    }

    public final void setStartDestinationRoute$navigation_common_release(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (AbstractC9133u.m16128b(str, this.graph.getRoute())) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this.graph).toString());
            }
            if (AbstractC8661c0.m13993h0(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = NavDestination.Companion.createRoute(str).hashCode();
        }
        this.startDestId = iHashCode;
        this.startDestinationRoute = str;
    }

    public final NavDestination findNode$navigation_common_release(String str) {
        if (str == null || AbstractC8661c0.m13993h0(str)) {
            return null;
        }
        return findNode$navigation_common_release(str, true);
    }

    public final void setStartDestination$navigation_common_release(String startDestRoute) {
        AbstractC9133u.m16133g(startDestRoute, "startDestRoute");
        setStartDestinationRoute$navigation_common_release(startDestRoute);
    }

    public final void addDestinations$navigation_common_release(NavDestination... nodes) {
        AbstractC9133u.m16133g(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            addDestination$navigation_common_release(navDestination);
        }
    }

    public final NavDestination findNode$navigation_common_release(InterfaceC8375c route) {
        AbstractC9133u.m16133g(route, "route");
        return findNode$navigation_common_release(RouteSerializerKt.generateHashCode(AbstractC10067q.m18778b(route)));
    }

    public final <T> void setStartDestination$navigation_common_release(InterfaceC8375c startDestRoute) {
        AbstractC9133u.m16133g(startDestRoute, "startDestRoute");
        setStartDestination$navigation_common_release(AbstractC10067q.m18778b(startDestRoute), new InterfaceC10570l() { // from class: androidx.navigation.internal.x
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return NavGraphImpl.setStartDestination$lambda$12((NavDestination) obj);
            }
        });
    }

    public final <T> NavDestination findNode$navigation_common_release(T t10) {
        if (t10 != null) {
            return findNode$navigation_common_release(RouteSerializerKt.generateHashCode(AbstractC10067q.m18778b(AbstractC9137y.m16154b(t10.getClass()))));
        }
        return null;
    }

    public final <T> void setStartDestination$navigation_common_release(final T startDestRoute) {
        AbstractC9133u.m16133g(startDestRoute, "startDestRoute");
        setStartDestination$navigation_common_release(AbstractC10067q.m18778b(AbstractC9137y.m16154b(startDestRoute.getClass())), new InterfaceC10570l() { // from class: androidx.navigation.internal.w
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return NavGraphImpl.setStartDestination$lambda$14(startDestRoute, (NavDestination) obj);
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findNode$navigation_common_release(String route, boolean z10) {
        Object next;
        AbstractC9133u.m16133g(route, "route");
        Iterator it = AbstractC8476n.m13830e(SparseArrayKt.valueIterator(this.nodes)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            NavDestination navDestination = (NavDestination) next;
            if (AbstractC8687z.m14094B(navDestination.getRoute(), route, false, 2, null) || navDestination.matchRoute(route) != null) {
                break;
            }
        }
        NavDestination navDestination2 = (NavDestination) next;
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!z10 || this.graph.getParent() == null) {
            return null;
        }
        NavGraph parent = this.graph.getParent();
        AbstractC9133u.m16130d(parent);
        return parent.findNode(route);
    }

    public final <T> void setStartDestination$navigation_common_release(InterfaceC10052b serializer, InterfaceC10570l parseRoute) {
        AbstractC9133u.m16133g(serializer, "serializer");
        AbstractC9133u.m16133g(parseRoute, "parseRoute");
        int iGenerateHashCode = RouteSerializerKt.generateHashCode(serializer);
        NavDestination navDestinationFindNode$navigation_common_release = findNode$navigation_common_release(iGenerateHashCode);
        if (navDestinationFindNode$navigation_common_release != null) {
            setStartDestinationRoute$navigation_common_release((String) parseRoute.invoke(navDestinationFindNode$navigation_common_release));
            this.startDestId = iGenerateHashCode;
        } else {
            throw new IllegalStateException(("Cannot find startDestination " + serializer.getDescriptor().mo19089f() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
        }
    }
}
