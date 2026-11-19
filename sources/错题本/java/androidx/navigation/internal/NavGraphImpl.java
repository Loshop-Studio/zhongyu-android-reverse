package androidx.navigation.internal;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.C2826a;
import androidx.navigation.C2861i;
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
import kotlin.Metadata;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p084i7.InterfaceC5686b;
import p152r6.InterfaceC6471c;
import p204y1.AbstractC6768a;
import p207y6.InterfaceC6779c;
import p214z6.AbstractC6833k;
import p214z6.C6823a;

@Metadata(m5109d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u0004\u0018\u00010\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010$\u001a\u00020\u001c2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0 H\u0000¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020\u001c2\u0012\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0%\"\u00020\u000bH\u0000¢\u0006\u0004\b\"\u0010&J\u0019\u0010+\u001a\u0004\u0018\u00010\u000b2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*J7\u0010/\u001a\u0004\u0018\u00010\u000b2\u0006\u0010(\u001a\u00020'2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b-\u0010.J\u001b\u0010+\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b)\u00100J\u001d\u0010+\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u000301H\u0000¢\u0006\u0004\b)\u00102J!\u0010+\u001a\u0004\u0018\u00010\u000b\"\u0004\b\u0000\u001032\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b)\u00104J!\u0010+\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00105\u001a\u00020\bH\u0001¢\u0006\u0004\b)\u00106J\u0015\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000b07H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010=\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u0002H\u0000¢\u0006\u0004\b<\u0010\u0005J\u0017\u0010?\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b>\u0010\u001eJ\u000f\u0010B\u001a\u00020\u001cH\u0000¢\u0006\u0004\b@\u0010AJ\u0017\u0010F\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u0006H\u0000¢\u0006\u0004\bD\u0010EJ\u0017\u0010J\u001a\u00020\u001c2\u0006\u0010G\u001a\u00020'H\u0000¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u001c2\u0006\u0010K\u001a\u00020\u0006H\u0000¢\u0006\u0004\bH\u0010LJ'\u0010J\u001a\u00020\u001c\"\b\b\u0000\u00103*\u00020\u00012\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0000¢\u0006\u0004\bH\u0010MJ!\u0010J\u001a\u00020\u001c\"\b\b\u0000\u00103*\u00020\u00012\u0006\u0010K\u001a\u00028\u0000H\u0000¢\u0006\u0004\bH\u0010NJ7\u0010J\u001a\u00020\u001c\"\u0004\b\u0000\u001032\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000O2\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060QH\u0000¢\u0006\u0004\bH\u0010SR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010T\u001a\u0004\bU\u0010VR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0W8AX\u0080\u0004¢\u0006\f\n\u0004\b!\u0010X\u001a\u0004\bY\u0010ZR\"\u0010G\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010IR$\u0010_\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010LR.\u0010d\u001a\u0004\u0018\u00010\u00062\b\u0010K\u001a\u0004\u0018\u00010\u00068\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010`\u001a\u0004\be\u0010b\"\u0004\bf\u0010LR$\u0010i\u001a\u00020'2\u0006\u0010G\u001a\u00020'8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bg\u0010]\"\u0004\bh\u0010IR\u0014\u0010k\u001a\u00020\u00068AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bj\u0010b¨\u0006l"}, m5110d2 = {"Landroidx/navigation/internal/NavGraphImpl;", "", "Landroidx/navigation/NavGraph;", "graph", "<init>", "(Landroidx/navigation/NavGraph;)V", "", "route", "", "searchChildren", "searchParent", "Landroidx/navigation/NavDestination;", "lastVisited", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRouteComprehensive$navigation_common_release", "(Ljava/lang/String;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRouteComprehensive", "bestMatch", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "matchDeepLinkComprehensive$navigation_common_release", "(Landroidx/navigation/NavDestination$DeepLinkMatch;Landroidx/navigation/NavDeepLinkRequest;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLinkComprehensive", "superBestMatch", "matchDeepLink$navigation_common_release", "(Landroidx/navigation/NavDestination$DeepLinkMatch;Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "node", "Ld6/s;", "addDestination$navigation_common_release", "(Landroidx/navigation/NavDestination;)V", "addDestination", "", "nodes", "addDestinations$navigation_common_release", "(Ljava/util/Collection;)V", "addDestinations", "", "([Landroidx/navigation/NavDestination;)V", "", "resId", "findNode$navigation_common_release", "(I)Landroidx/navigation/NavDestination;", "findNode", "matchingDest", "findNodeComprehensive$navigation_common_release", "(ILandroidx/navigation/NavDestination;ZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "findNodeComprehensive", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "Ly6/c;", "(Ly6/c;)Landroidx/navigation/NavDestination;", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/Object;)Landroidx/navigation/NavDestination;", "searchParents", "(Ljava/lang/String;Z)Landroidx/navigation/NavDestination;", "", "iterator$navigation_common_release", "()Ljava/util/Iterator;", "iterator", "other", "addAll$navigation_common_release", "addAll", "remove$navigation_common_release", "remove", "clear$navigation_common_release", "()V", "clear", "superName", "getDisplayName$navigation_common_release", "(Ljava/lang/String;)Ljava/lang/String;", "getDisplayName", "startDestId", "setStartDestination$navigation_common_release", "(I)V", "setStartDestination", "startDestRoute", "(Ljava/lang/String;)V", "(Ly6/c;)V", "(Ljava/lang/Object;)V", "Li7/b;", "serializer", "Lkotlin/Function1;", "parseRoute", "(Li7/b;Lr6/c;)V", "Landroidx/navigation/NavGraph;", "getGraph", "()Landroidx/navigation/NavGraph;", "Landroidx/collection/SparseArrayCompat;", "Landroidx/collection/SparseArrayCompat;", "getNodes$navigation_common_release", "()Landroidx/collection/SparseArrayCompat;", "I", "getStartDestId$navigation_common_release", "()I", "setStartDestId$navigation_common_release", "startDestIdName", "Ljava/lang/String;", "getStartDestIdName$navigation_common_release", "()Ljava/lang/String;", "setStartDestIdName$navigation_common_release", "startDestinationRoute", "getStartDestinationRoute$navigation_common_release", "setStartDestinationRoute$navigation_common_release", "getStartDestinationId$navigation_common_release", "setStartDestinationId$navigation_common_release", "startDestinationId", "getStartDestDisplayName$navigation_common_release", "startDestDisplayName", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavGraphImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphImpl.kt\nandroidx/navigation/internal/NavGraphImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,372:1\n1611#2,9:373\n1863#2:382\n1864#2:384\n1620#2:385\n1611#2,9:386\n1863#2:395\n1864#2:397\n1620#2:398\n1246#2,4:404\n1#3:383\n1#3:396\n1#3:399\n183#4,2:400\n462#5:402\n412#5:403\n*S KotlinDebug\n*F\n+ 1 NavGraphImpl.kt\nandroidx/navigation/internal/NavGraphImpl\n*L\n55#1:373,9\n55#1:382\n55#1:384\n55#1:385\n94#1:386,9\n94#1:395\n94#1:397\n94#1:398\n322#1:404,4\n55#1:383\n94#1:396\n221#1:400,2\n322#1:402\n322#1:403\n*E\n"})
/* loaded from: classes2.dex */
public final class NavGraphImpl {

    @NotNull
    private final NavGraph graph;

    @NotNull
    private final SparseArrayCompat<NavDestination> nodes;
    private int startDestId;

    @Nullable
    private String startDestIdName;

    @Nullable
    private String startDestinationRoute;

    public NavGraphImpl(@NotNull NavGraph graph) {
        AbstractC5830k.m5330g(graph, "graph");
        this.graph = graph;
        this.nodes = new SparseArrayCompat<>(0, 1, null);
    }

    public static /* synthetic */ NavDestination findNodeComprehensive$navigation_common_release$default(NavGraphImpl navGraphImpl, int i, NavDestination navDestination, boolean z8, NavDestination navDestination2, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            navDestination2 = null;
        }
        return navGraphImpl.findNodeComprehensive$navigation_common_release(i, navDestination, z8, navDestination2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setStartDestination$lambda$12(NavDestination startDestination) {
        AbstractC5830k.m5330g(startDestination, "startDestination");
        String route = startDestination.getRoute();
        AbstractC5830k.m5327d(route);
        return route;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setStartDestination$lambda$14(Object obj, NavDestination startDestination) {
        AbstractC5830k.m5330g(startDestination, "startDestination");
        Map<String, NavArgument> arguments = startDestination.getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5785e0.m5149C(arguments.size()));
        Iterator<T> it = arguments.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
        }
        return RouteSerializerKt.generateRouteWithArgs(obj, linkedHashMap);
    }

    public final void addAll$navigation_common_release(@NotNull NavGraph other) {
        AbstractC5830k.m5330g(other, "other");
        Iterator<NavDestination> it = other.iterator();
        while (it.hasNext()) {
            NavDestination next = it.next();
            it.remove();
            addDestination$navigation_common_release(next);
        }
    }

    public final void addDestination$navigation_common_release(@NotNull NavDestination node) {
        AbstractC5830k.m5330g(node, "node");
        int id = node.getId();
        String route = node.getRoute();
        if (id == 0 && route == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (this.graph.getRoute() != null && AbstractC5830k.m5325b(route, this.graph.getRoute())) {
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

    public final void addDestinations$navigation_common_release(@NotNull Collection<? extends NavDestination> nodes) {
        AbstractC5830k.m5330g(nodes, "nodes");
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

    @Nullable
    public final NavDestination findNode$navigation_common_release(int resId) {
        return findNodeComprehensive$navigation_common_release$default(this, resId, this.graph, false, null, 8, null);
    }

    @Nullable
    public final NavDestination findNodeComprehensive$navigation_common_release(int resId, @Nullable NavDestination lastVisited, boolean searchChildren, @Nullable NavDestination matchingDest) {
        NavDestination navDestination = this.nodes.get(resId);
        if (matchingDest != null) {
            if (AbstractC5830k.m5325b(navDestination, matchingDest) && AbstractC5830k.m5325b(navDestination.getParent(), matchingDest.getParent())) {
                return navDestination;
            }
            navDestination = null;
        } else if (navDestination != null) {
            return navDestination;
        }
        if (searchChildren) {
            Iterator it = ((C6823a) AbstractC6833k.m6493t(SparseArrayKt.valueIterator(this.nodes))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    navDestination = null;
                    break;
                }
                NavDestination navDestination2 = (NavDestination) it.next();
                NavDestination navDestinationFindNodeComprehensive = (!(navDestination2 instanceof NavGraph) || AbstractC5830k.m5325b(navDestination2, lastVisited)) ? null : ((NavGraph) navDestination2).findNodeComprehensive(resId, this.graph, true, matchingDest);
                if (navDestinationFindNodeComprehensive != null) {
                    navDestination = navDestinationFindNodeComprehensive;
                    break;
                }
            }
        }
        if (navDestination != null) {
            return navDestination;
        }
        if (this.graph.getParent() == null || AbstractC5830k.m5325b(this.graph.getParent(), lastVisited)) {
            return null;
        }
        NavGraph parent = this.graph.getParent();
        AbstractC5830k.m5327d(parent);
        return parent.findNodeComprehensive(resId, this.graph, searchChildren, matchingDest);
    }

    @NotNull
    public final String getDisplayName$navigation_common_release(@NotNull String superName) {
        AbstractC5830k.m5330g(superName, "superName");
        return this.graph.getId() != 0 ? superName : "the root navigation";
    }

    @NotNull
    public final NavGraph getGraph() {
        return this.graph;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final SparseArrayCompat<NavDestination> getNodes$navigation_common_release() {
        return this.nodes;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final String getStartDestDisplayName$navigation_common_release() {
        if (this.startDestIdName == null) {
            String strValueOf = this.startDestinationRoute;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.startDestId);
            }
            this.startDestIdName = strValueOf;
        }
        String str = this.startDestIdName;
        AbstractC5830k.m5327d(str);
        return str;
    }

    /* renamed from: getStartDestId$navigation_common_release, reason: from getter */
    public final int getStartDestId() {
        return this.startDestId;
    }

    @Nullable
    /* renamed from: getStartDestIdName$navigation_common_release, reason: from getter */
    public final String getStartDestIdName() {
        return this.startDestIdName;
    }

    public final int getStartDestinationId$navigation_common_release() {
        return this.startDestId;
    }

    @Nullable
    /* renamed from: getStartDestinationRoute$navigation_common_release, reason: from getter */
    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    @NotNull
    public final Iterator<NavDestination> iterator$navigation_common_release() {
        return new NavGraphImpl$iterator$1(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination.DeepLinkMatch matchDeepLink$navigation_common_release(@Nullable NavDestination.DeepLinkMatch superBestMatch, @NotNull NavDeepLinkRequest navDeepLinkRequest) {
        AbstractC5830k.m5330g(navDeepLinkRequest, "navDeepLinkRequest");
        return matchDeepLinkComprehensive$navigation_common_release(superBestMatch, navDeepLinkRequest, true, false, this.graph);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination.DeepLinkMatch matchDeepLinkComprehensive$navigation_common_release(@Nullable NavDestination.DeepLinkMatch bestMatch, @NotNull NavDeepLinkRequest navDeepLinkRequest, boolean searchChildren, boolean searchParent, @NotNull NavDestination lastVisited) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        AbstractC5830k.m5330g(navDeepLinkRequest, "navDeepLinkRequest");
        AbstractC5830k.m5330g(lastVisited, "lastVisited");
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = null;
        if (searchChildren) {
            NavGraph navGraph = this.graph;
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination : navGraph) {
                NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLink = !AbstractC5830k.m5325b(navDestination, lastVisited) ? navDestination.matchDeepLink(navDeepLinkRequest) : null;
                if (deepLinkMatchMatchDeepLink != null) {
                    arrayList.add(deepLinkMatchMatchDeepLink);
                }
            }
            deepLinkMatch = (NavDestination.DeepLinkMatch) AbstractC5805t.m5237q0(arrayList);
        } else {
            deepLinkMatch = null;
        }
        NavGraph parent = this.graph.getParent();
        if (parent != null && searchParent && !parent.equals(lastVisited)) {
            deepLinkMatchMatchDeepLinkComprehensive = parent.matchDeepLinkComprehensive(navDeepLinkRequest, searchChildren, true, this.graph);
        }
        return (NavDestination.DeepLinkMatch) AbstractC5805t.m5237q0(AbstractC5802q.m5190Q(new NavDestination.DeepLinkMatch[]{bestMatch, deepLinkMatch, deepLinkMatchMatchDeepLinkComprehensive}));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination.DeepLinkMatch matchRouteComprehensive$navigation_common_release(@NotNull String route, boolean searchChildren, boolean searchParent, @NotNull NavDestination lastVisited) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(lastVisited, "lastVisited");
        NavDestination.DeepLinkMatch deepLinkMatchMatchRoute = this.graph.matchRoute(route);
        NavDestination.DeepLinkMatch deepLinkMatchMatchRouteComprehensive = null;
        if (searchChildren) {
            NavGraph navGraph = this.graph;
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination : navGraph) {
                NavDestination.DeepLinkMatch deepLinkMatchMatchRouteComprehensive2 = AbstractC5830k.m5325b(navDestination, lastVisited) ? null : navDestination instanceof NavGraph ? ((NavGraph) navDestination).matchRouteComprehensive(route, true, false, this.graph) : navDestination.matchRoute(route);
                if (deepLinkMatchMatchRouteComprehensive2 != null) {
                    arrayList.add(deepLinkMatchMatchRouteComprehensive2);
                }
            }
            deepLinkMatch = (NavDestination.DeepLinkMatch) AbstractC5805t.m5237q0(arrayList);
        } else {
            deepLinkMatch = null;
        }
        NavGraph parent = this.graph.getParent();
        if (parent != null && searchParent && !parent.equals(lastVisited)) {
            deepLinkMatchMatchRouteComprehensive = parent.matchRouteComprehensive(route, searchChildren, true, this.graph);
        }
        return (NavDestination.DeepLinkMatch) AbstractC5805t.m5237q0(AbstractC5802q.m5190Q(new NavDestination.DeepLinkMatch[]{deepLinkMatchMatchRoute, deepLinkMatch, deepLinkMatchMatchRouteComprehensive}));
    }

    public final void remove$navigation_common_release(@NotNull NavDestination node) {
        AbstractC5830k.m5330g(node, "node");
        int iIndexOfKey = this.nodes.indexOfKey(node.getId());
        if (iIndexOfKey >= 0) {
            this.nodes.valueAt(iIndexOfKey).setParent(null);
            this.nodes.removeAt(iIndexOfKey);
        }
    }

    public final void setStartDestId$navigation_common_release(int i) {
        this.startDestId = i;
    }

    public final void setStartDestIdName$navigation_common_release(@Nullable String str) {
        this.startDestIdName = str;
    }

    public final void setStartDestination$navigation_common_release(int startDestId) {
        setStartDestinationId$navigation_common_release(startDestId);
    }

    public final void setStartDestinationId$navigation_common_release(int i) {
        if (i == this.graph.getId()) {
            StringBuilder sbM94s = AbstractC0037f.m94s(i, "Start destination ", " cannot use the same id as the graph ");
            sbM94s.append(this.graph);
            throw new IllegalArgumentException(sbM94s.toString().toString());
        }
        if (this.startDestinationRoute != null) {
            setStartDestinationRoute$navigation_common_release(null);
        }
        this.startDestId = i;
        this.startDestIdName = null;
    }

    public final void setStartDestinationRoute$navigation_common_release(@Nullable String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (str.equals(this.graph.getRoute())) {
                StringBuilder sbM100y = AbstractC0037f.m100y("Start destination ", str, " cannot use the same route as the graph ");
                sbM100y.append(this.graph);
                throw new IllegalArgumentException(sbM100y.toString().toString());
            }
            if (AbstractC5855p.m5382P(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = NavDestination.INSTANCE.createRoute(str).hashCode();
        }
        this.startDestId = iHashCode;
        this.startDestinationRoute = str;
    }

    @Nullable
    public final NavDestination findNode$navigation_common_release(@Nullable String route) {
        if (route == null || AbstractC5855p.m5382P(route)) {
            return null;
        }
        return findNode$navigation_common_release(route, true);
    }

    public final void setStartDestination$navigation_common_release(@NotNull String startDestRoute) {
        AbstractC5830k.m5330g(startDestRoute, "startDestRoute");
        setStartDestinationRoute$navigation_common_release(startDestRoute);
    }

    public final void addDestinations$navigation_common_release(@NotNull NavDestination... nodes) {
        AbstractC5830k.m5330g(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            addDestination$navigation_common_release(navDestination);
        }
    }

    @Nullable
    public final NavDestination findNode$navigation_common_release(@NotNull InterfaceC6779c route) {
        AbstractC5830k.m5330g(route, "route");
        return findNode$navigation_common_release(RouteSerializerKt.generateHashCode(AbstractC6768a.m6453r(route)));
    }

    public final <T> void setStartDestination$navigation_common_release(@NotNull InterfaceC6779c startDestRoute) {
        AbstractC5830k.m5330g(startDestRoute, "startDestRoute");
        setStartDestination$navigation_common_release(AbstractC6768a.m6453r(startDestRoute), new C2826a(23));
    }

    @Nullable
    public final <T> NavDestination findNode$navigation_common_release(@Nullable T route) {
        if (route != null) {
            return findNode$navigation_common_release(RouteSerializerKt.generateHashCode(AbstractC6768a.m6453r(AbstractC5832m.m5340a(route.getClass()))));
        }
        return null;
    }

    public final <T> void setStartDestination$navigation_common_release(@NotNull T startDestRoute) {
        AbstractC5830k.m5330g(startDestRoute, "startDestRoute");
        setStartDestination$navigation_common_release(AbstractC6768a.m6453r(AbstractC5832m.m5340a(startDestRoute.getClass())), new C2861i(startDestRoute, 1));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findNode$navigation_common_release(@NotNull String route, boolean searchParents) {
        Object next;
        AbstractC5830k.m5330g(route, "route");
        Iterator it = ((C6823a) AbstractC6833k.m6493t(SparseArrayKt.valueIterator(this.nodes))).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            NavDestination navDestination = (NavDestination) next;
            if (AbstractC5862w.m5415v(navDestination.getRoute(), route, false) || navDestination.matchRoute(route) != null) {
                break;
            }
        }
        NavDestination navDestination2 = (NavDestination) next;
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!searchParents || this.graph.getParent() == null) {
            return null;
        }
        NavGraph parent = this.graph.getParent();
        AbstractC5830k.m5327d(parent);
        return parent.findNode(route);
    }

    public final <T> void setStartDestination$navigation_common_release(@NotNull InterfaceC5686b serializer, @NotNull InterfaceC6471c parseRoute) {
        AbstractC5830k.m5330g(serializer, "serializer");
        AbstractC5830k.m5330g(parseRoute, "parseRoute");
        int iGenerateHashCode = RouteSerializerKt.generateHashCode(serializer);
        NavDestination navDestinationFindNode$navigation_common_release = findNode$navigation_common_release(iGenerateHashCode);
        if (navDestinationFindNode$navigation_common_release != null) {
            setStartDestinationRoute$navigation_common_release((String) parseRoute.invoke(navDestinationFindNode$navigation_common_release));
            this.startDestId = iGenerateHashCode;
        } else {
            throw new IllegalStateException(("Cannot find startDestination " + serializer.getDescriptor().mo5105h() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
        }
    }
}
