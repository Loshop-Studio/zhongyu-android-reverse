package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.common.C4188R;
import androidx.navigation.internal.NavContext;
import androidx.navigation.internal.NavGraphImpl;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p089e8.InterfaceC8375c;
import p101f8.AbstractC8476n;
import p101f8.AbstractC8479q;
import p101f8.InterfaceC8469g;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p246s8.InterfaceC10052b;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10668a;

/* loaded from: classes3.dex */
public class NavGraph extends NavDestination implements Iterable<NavDestination>, InterfaceC10668a {
    public static final Companion Companion = new Companion(null);
    private final NavGraphImpl impl;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NavDestination childHierarchy$lambda$0(NavDestination it) {
            AbstractC9133u.m16133g(it, "it");
            if (!(it instanceof NavGraph)) {
                return null;
            }
            NavGraph navGraph = (NavGraph) it;
            return navGraph.findNode(navGraph.getStartDestinationId());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final InterfaceC8469g childHierarchy(NavGraph navGraph) {
            AbstractC9133u.m16133g(navGraph, "<this>");
            return AbstractC8476n.m13833h(navGraph, new InterfaceC10570l() { // from class: androidx.navigation.y
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj) {
                    return NavGraph.Companion.childHierarchy$lambda$0((NavDestination) obj);
                }
            });
        }

        public final NavDestination findStartDestination(NavGraph navGraph) {
            AbstractC9133u.m16133g(navGraph, "<this>");
            return (NavDestination) AbstractC8479q.m13838A(childHierarchy(navGraph));
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(Navigator<? extends NavGraph> navGraphNavigator) {
        super(navGraphNavigator);
        AbstractC9133u.m16133g(navGraphNavigator, "navGraphNavigator");
        this.impl = new NavGraphImpl(this);
    }

    public static /* synthetic */ NavDestination findNodeComprehensive$default(NavGraph navGraph, int i10, NavDestination navDestination, boolean z10, NavDestination navDestination2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
        }
        if ((i11 & 8) != 0) {
            navDestination2 = null;
        }
        return navGraph.findNodeComprehensive(i10, navDestination, z10, navDestination2);
    }

    public static final NavDestination findStartDestination(NavGraph navGraph) {
        return Companion.findStartDestination(navGraph);
    }

    private final void setStartDestinationId(int i10) {
        this.impl.setStartDestinationId$navigation_common_release(i10);
    }

    private final void setStartDestinationRoute(String str) {
        this.impl.setStartDestinationRoute$navigation_common_release(str);
    }

    public final void addAll(NavGraph other) {
        AbstractC9133u.m16133g(other, "other");
        this.impl.addAll$navigation_common_release(other);
    }

    public final void addDestination(NavDestination node) {
        AbstractC9133u.m16133g(node, "node");
        this.impl.addDestination$navigation_common_release(node);
    }

    public final void addDestinations(Collection<? extends NavDestination> nodes) {
        AbstractC9133u.m16133g(nodes, "nodes");
        this.impl.addDestinations$navigation_common_release(nodes);
    }

    public final void clear() {
        this.impl.clear$navigation_common_release();
    }

    @Override // androidx.navigation.NavDestination
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof NavGraph) && super.equals(obj)) {
            NavGraph navGraph = (NavGraph) obj;
            if (getNodes().size() == navGraph.getNodes().size() && getStartDestinationId() == navGraph.getStartDestinationId()) {
                for (NavDestination navDestination : AbstractC8476n.m13830e(SparseArrayKt.valueIterator(getNodes()))) {
                    if (!AbstractC9133u.m16128b(navDestination, navGraph.getNodes().get(navDestination.getId()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final NavDestination findNode(@IdRes int i10) {
        return this.impl.findNode$navigation_common_release(i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findNodeComprehensive(@IdRes int i10, NavDestination navDestination, boolean z10, NavDestination navDestination2) {
        return this.impl.findNodeComprehensive$navigation_common_release(i10, navDestination, z10, navDestination2);
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String getDisplayName() {
        return this.impl.getDisplayName$navigation_common_release(super.getDisplayName());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final SparseArrayCompat<NavDestination> getNodes() {
        return this.impl.getNodes$navigation_common_release();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String getStartDestDisplayName() {
        return this.impl.getStartDestDisplayName$navigation_common_release();
    }

    @InterfaceC8721a
    @IdRes
    public final int getStartDestination() {
        return this.impl.getStartDestinationId$navigation_common_release();
    }

    @IdRes
    public final int getStartDestinationId() {
        return this.impl.getStartDestinationId$navigation_common_release();
    }

    public final String getStartDestinationRoute() {
        return this.impl.getStartDestinationRoute$navigation_common_release();
    }

    @Override // androidx.navigation.NavDestination
    public int hashCode() {
        int startDestinationId = getStartDestinationId();
        SparseArrayCompat<NavDestination> nodes = getNodes();
        int size = nodes.size();
        for (int i10 = 0; i10 < size; i10++) {
            startDestinationId = (((startDestinationId * 31) + nodes.keyAt(i10)) * 31) + nodes.valueAt(i10).hashCode();
        }
        return startDestinationId;
    }

    @Override // java.lang.Iterable
    public final Iterator<NavDestination> iterator() {
        return this.impl.iterator$navigation_common_release();
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDestination.DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        AbstractC9133u.m16133g(navDeepLinkRequest, "navDeepLinkRequest");
        return this.impl.matchDeepLink$navigation_common_release(super.matchDeepLink(navDeepLinkRequest), navDeepLinkRequest);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination.DeepLinkMatch matchDeepLinkComprehensive(NavDeepLinkRequest navDeepLinkRequest, boolean z10, boolean z11, NavDestination lastVisited) {
        AbstractC9133u.m16133g(navDeepLinkRequest, "navDeepLinkRequest");
        AbstractC9133u.m16133g(lastVisited, "lastVisited");
        return this.impl.matchDeepLinkComprehensive$navigation_common_release(super.matchDeepLink(navDeepLinkRequest), navDeepLinkRequest, z10, z11, lastVisited);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination.DeepLinkMatch matchRouteComprehensive(String route, boolean z10, boolean z11, NavDestination lastVisited) {
        AbstractC9133u.m16133g(route, "route");
        AbstractC9133u.m16133g(lastVisited, "lastVisited");
        return this.impl.matchRouteComprehensive$navigation_common_release(route, z10, z11, lastVisited);
    }

    @Override // androidx.navigation.NavDestination
    public void onInflate(Context context, AttributeSet attrs) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(attrs, "attrs");
        super.onInflate(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, C4188R.styleable.NavGraphNavigator);
        AbstractC9133u.m16132f(typedArrayObtainAttributes, "obtainAttributes(...)");
        setStartDestinationId(typedArrayObtainAttributes.getResourceId(C4188R.styleable.NavGraphNavigator_startDestination, 0));
        this.impl.setStartDestIdName$navigation_common_release(NavDestination.Companion.getDisplayName(new NavContext(context), this.impl.getStartDestId$navigation_common_release()));
        C8736p c8736p = C8736p.f16368a;
        typedArrayObtainAttributes.recycle();
    }

    public final void remove(NavDestination node) {
        AbstractC9133u.m16133g(node, "node");
        this.impl.remove$navigation_common_release(node);
    }

    public final void setStartDestination(int i10) {
        this.impl.setStartDestination$navigation_common_release(i10);
    }

    @Override // androidx.navigation.NavDestination
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavDestination navDestinationFindNode = findNode(getStartDestinationRoute());
        if (navDestinationFindNode == null) {
            navDestinationFindNode = findNode(getStartDestinationId());
        }
        sb.append(" startDestination=");
        if (navDestinationFindNode != null) {
            sb.append("{");
            sb.append(navDestinationFindNode.toString());
            sb.append("}");
        } else if (getStartDestinationRoute() != null) {
            sb.append(getStartDestinationRoute());
        } else if (this.impl.getStartDestIdName$navigation_common_release() != null) {
            sb.append(this.impl.getStartDestIdName$navigation_common_release());
        } else {
            sb.append("0x" + Integer.toHexString(this.impl.getStartDestId$navigation_common_release()));
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    public final void addDestinations(NavDestination... nodes) {
        AbstractC9133u.m16133g(nodes, "nodes");
        this.impl.addDestinations$navigation_common_release((NavDestination[]) Arrays.copyOf(nodes, nodes.length));
    }

    public final NavDestination findNode(String str) {
        return this.impl.findNode$navigation_common_release(str);
    }

    public final void setStartDestination(String startDestRoute) {
        AbstractC9133u.m16133g(startDestRoute, "startDestRoute");
        this.impl.setStartDestination$navigation_common_release(startDestRoute);
    }

    public final /* synthetic */ <T> NavDestination findNode() {
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return findNode(AbstractC9137y.m16154b(Object.class));
    }

    public final /* synthetic */ <T> void setStartDestination() {
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        setStartDestination(AbstractC9137y.m16154b(Object.class));
    }

    public final NavDestination findNode(InterfaceC8375c route) {
        AbstractC9133u.m16133g(route, "route");
        return this.impl.findNode$navigation_common_release(route);
    }

    public final /* synthetic */ void setStartDestination(InterfaceC8375c startDestRoute) {
        AbstractC9133u.m16133g(startDestRoute, "startDestRoute");
        this.impl.setStartDestination$navigation_common_release(startDestRoute);
    }

    public final <T> NavDestination findNode(T t10) {
        return this.impl.findNode$navigation_common_release((NavGraphImpl) t10);
    }

    public final /* synthetic */ void setStartDestination(Object startDestRoute) {
        AbstractC9133u.m16133g(startDestRoute, "startDestRoute");
        this.impl.setStartDestination$navigation_common_release((NavGraphImpl) startDestRoute);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findNode(String route, boolean z10) {
        AbstractC9133u.m16133g(route, "route");
        return this.impl.findNode$navigation_common_release(route, z10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T> void setStartDestination(InterfaceC10052b serializer, InterfaceC10570l parseRoute) {
        AbstractC9133u.m16133g(serializer, "serializer");
        AbstractC9133u.m16133g(parseRoute, "parseRoute");
        this.impl.setStartDestination$navigation_common_release(serializer, parseRoute);
    }
}
