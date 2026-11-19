package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavDestination;
import androidx.navigation.common.C2829R;
import androidx.navigation.internal.NavContext;
import androidx.navigation.internal.NavGraphImpl;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p084i7.InterfaceC5686b;
import p152r6.InterfaceC6471c;
import p160s6.InterfaceC6560a;
import p207y6.InterfaceC6779c;
import p214z6.AbstractC6833k;
import p214z6.C6823a;
import p214z6.InterfaceC6830h;

@Metadata(m5109d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000 h2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001hB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u000b2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 ¢\u0006\u0004\b\"\u0010#J!\u0010\"\u001a\u00020\u000b2\u0012\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010$\"\u00020\u0001¢\u0006\u0004\b\"\u0010%J\u0019\u0010(\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J9\u0010+\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010'\u001a\u00020&2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b+\u0010,J\u0019\u0010(\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b(\u0010-J\u001a\u0010(\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010.\u0018\u0001H\u0086\b¢\u0006\u0004\b(\u0010/J\u001b\u0010(\u001a\u0004\u0018\u00010\u00012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u000300¢\u0006\u0004\b(\u00101J\u001f\u0010(\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010.2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b(\u00102J!\u0010(\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u0010H\u0007¢\u0006\u0004\b(\u00104J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u000105H\u0086\u0002¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u0000¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b;\u0010\u001fJ\r\u0010<\u001a\u00020\u000b¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020&H\u0007¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020&¢\u0006\u0004\bA\u0010BJ\u0015\u0010A\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u000e¢\u0006\u0004\bA\u0010DJ\u001c\u0010A\u001a\u00020\u000b\"\n\b\u0000\u0010.\u0018\u0001*\u00020EH\u0086\b¢\u0006\u0004\bA\u0010=J%\u0010A\u001a\u00020\u000b\"\b\b\u0000\u0010.*\u00020E2\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u000000¢\u0006\u0004\bA\u0010FJ\u001f\u0010A\u001a\u00020\u000b\"\b\b\u0000\u0010.*\u00020E2\u0006\u0010C\u001a\u00028\u0000¢\u0006\u0004\bA\u0010GJ7\u0010A\u001a\u00020\u000b\"\u0004\b\u0000\u0010.2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000H2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0JH\u0007¢\u0006\u0004\bA\u0010LJ\u000f\u0010M\u001a\u00020\u000eH\u0016¢\u0006\u0004\bM\u0010NJ\u001a\u0010O\u001a\u00020\u00102\b\u00108\u001a\u0004\u0018\u00010EH\u0096\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020&H\u0016¢\u0006\u0004\bQ\u0010?R\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010U8GX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bV\u0010W*\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010NR+\u0010`\u001a\u00020&2\u0006\u0010\\\u001a\u00020&8G@BX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b]\u0010?\"\u0004\b^\u0010B*\u0004\b_\u0010YR/\u0010d\u001a\u0004\u0018\u00010\u000e2\b\u0010\\\u001a\u0004\u0018\u00010\u000e8F@BX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\ba\u0010N\"\u0004\bb\u0010D*\u0004\bc\u0010YR\u001b\u0010g\u001a\u00020\u000e8GX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\be\u0010N*\u0004\bf\u0010Y¨\u0006i"}, m5110d2 = {"Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Ld6/s;", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "route", "", "searchChildren", "searchParent", "lastVisited", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRouteComprehensive", "(Ljava/lang/String;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "matchDeepLinkComprehensive", "(Landroidx/navigation/NavDeepLinkRequest;ZZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "node", "addDestination", "(Landroidx/navigation/NavDestination;)V", "", "nodes", "addDestinations", "(Ljava/util/Collection;)V", "", "([Landroidx/navigation/NavDestination;)V", "", "resId", "findNode", "(I)Landroidx/navigation/NavDestination;", "matchingDest", "findNodeComprehensive", "(ILandroidx/navigation/NavDestination;ZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", ExifInterface.GPS_DIRECTION_TRUE, "()Landroidx/navigation/NavDestination;", "Ly6/c;", "(Ly6/c;)Landroidx/navigation/NavDestination;", "(Ljava/lang/Object;)Landroidx/navigation/NavDestination;", "searchParents", "(Ljava/lang/String;Z)Landroidx/navigation/NavDestination;", "", "iterator", "()Ljava/util/Iterator;", "other", "addAll", "(Landroidx/navigation/NavGraph;)V", "remove", "clear", "()V", "getStartDestination", "()I", "startDestId", "setStartDestination", "(I)V", "startDestRoute", "(Ljava/lang/String;)V", "", "(Ly6/c;)V", "(Ljava/lang/Object;)V", "Li7/b;", "serializer", "Lkotlin/Function1;", "parseRoute", "(Li7/b;Lr6/c;)V", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/navigation/internal/NavGraphImpl;", "impl", "Landroidx/navigation/internal/NavGraphImpl;", "Landroidx/collection/SparseArrayCompat;", "getNodes", "()Landroidx/collection/SparseArrayCompat;", "getNodes$delegate", "(Landroidx/navigation/NavGraph;)Ljava/lang/Object;", "getDisplayName", "displayName", "<set-?>", "getStartDestinationId", "setStartDestinationId", "getStartDestinationId$delegate", "startDestinationId", "getStartDestinationRoute", "setStartDestinationRoute", "getStartDestinationRoute$delegate", "startDestinationRoute", "getStartDestDisplayName", "getStartDestDisplayName$delegate", "startDestDisplayName", "Companion", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavGraph.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.android.kt\nandroidx/navigation/NavGraph\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 SparseArray.kt\nandroidx/collection/SparseArrayKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,304:1\n233#2,3:305\n22#3:308\n62#3,4:311\n1228#4,2:309\n*S KotlinDebug\n*F\n+ 1 NavGraph.android.kt\nandroidx/navigation/NavGraph\n*L\n49#1:305,3\n263#1:308\n270#1:311,4\n265#1:309,2\n*E\n"})
/* loaded from: classes2.dex */
public class NavGraph extends NavDestination implements Iterable<NavDestination>, InterfaceC6560a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final NavGraphImpl impl;

    @Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"Landroidx/navigation/NavGraph$Companion;", "", "<init>", "()V", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "findStartDestination", "(Landroidx/navigation/NavGraph;)Landroidx/navigation/NavDestination;", "Lz6/h;", "childHierarchy", "(Landroidx/navigation/NavGraph;)Lz6/h;", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NavDestination childHierarchy$lambda$0(NavDestination it) {
            AbstractC5830k.m5330g(it, "it");
            if (!(it instanceof NavGraph)) {
                return null;
            }
            NavGraph navGraph = (NavGraph) it;
            return navGraph.findNode(navGraph.getStartDestinationId());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final InterfaceC6830h childHierarchy(@NotNull NavGraph navGraph) {
            AbstractC5830k.m5330g(navGraph, "<this>");
            return AbstractC6833k.m6495v(navGraph, new C2826a(8));
        }

        @JvmStatic
        @NotNull
        public final NavDestination findStartDestination(@NotNull NavGraph navGraph) {
            AbstractC5830k.m5330g(navGraph, "<this>");
            return (NavDestination) AbstractC6833k.m6497x(childHierarchy(navGraph));
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(@NotNull Navigator<? extends NavGraph> navGraphNavigator) {
        super(navGraphNavigator);
        AbstractC5830k.m5330g(navGraphNavigator, "navGraphNavigator");
        this.impl = new NavGraphImpl(this);
    }

    public static /* synthetic */ NavDestination findNodeComprehensive$default(NavGraph navGraph, int i, NavDestination navDestination, boolean z8, NavDestination navDestination2, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
        }
        if ((i8 & 8) != 0) {
            navDestination2 = null;
        }
        return navGraph.findNodeComprehensive(i, navDestination, z8, navDestination2);
    }

    @JvmStatic
    @NotNull
    public static final NavDestination findStartDestination(@NotNull NavGraph navGraph) {
        return INSTANCE.findStartDestination(navGraph);
    }

    private static Object getNodes$delegate(NavGraph navGraph) {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(navGraph.impl, NavGraphImpl.class, "nodes", "getNodes$navigation_common_release()Landroidx/collection/SparseArrayCompat;", 0);
        AbstractC5832m.f9223a.getClass();
        return propertyReference0Impl;
    }

    private static Object getStartDestDisplayName$delegate(NavGraph navGraph) {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(navGraph.impl, NavGraphImpl.class, "startDestDisplayName", "getStartDestDisplayName$navigation_common_release()Ljava/lang/String;", 0);
        AbstractC5832m.f9223a.getClass();
        return propertyReference0Impl;
    }

    private static Object getStartDestinationId$delegate(NavGraph navGraph) {
        MutablePropertyReference0Impl mutablePropertyReference0Impl = new MutablePropertyReference0Impl(navGraph.impl, NavGraphImpl.class, "startDestinationId", "getStartDestinationId$navigation_common_release()I", 0);
        AbstractC5832m.f9223a.getClass();
        return mutablePropertyReference0Impl;
    }

    private static Object getStartDestinationRoute$delegate(NavGraph navGraph) {
        MutablePropertyReference0Impl mutablePropertyReference0Impl = new MutablePropertyReference0Impl(navGraph.impl, NavGraphImpl.class, "startDestinationRoute", "getStartDestinationRoute$navigation_common_release()Ljava/lang/String;", 0);
        AbstractC5832m.f9223a.getClass();
        return mutablePropertyReference0Impl;
    }

    private final void setStartDestinationId(int i) {
        this.impl.setStartDestinationId$navigation_common_release(i);
    }

    private final void setStartDestinationRoute(String str) {
        this.impl.setStartDestinationRoute$navigation_common_release(str);
    }

    public final void addAll(@NotNull NavGraph other) {
        AbstractC5830k.m5330g(other, "other");
        this.impl.addAll$navigation_common_release(other);
    }

    public final void addDestination(@NotNull NavDestination node) {
        AbstractC5830k.m5330g(node, "node");
        this.impl.addDestination$navigation_common_release(node);
    }

    public final void addDestinations(@NotNull Collection<? extends NavDestination> nodes) {
        AbstractC5830k.m5330g(nodes, "nodes");
        this.impl.addDestinations$navigation_common_release(nodes);
    }

    public final void clear() {
        this.impl.clear$navigation_common_release();
    }

    @Override // androidx.navigation.NavDestination
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof NavGraph) || !super.equals(other)) {
            return false;
        }
        NavGraph navGraph = (NavGraph) other;
        if (getNodes().size() != navGraph.getNodes().size() || getStartDestinationId() != navGraph.getStartDestinationId()) {
            return false;
        }
        Iterator it = ((C6823a) AbstractC6833k.m6493t(SparseArrayKt.valueIterator(getNodes()))).iterator();
        while (it.hasNext()) {
            NavDestination navDestination = (NavDestination) it.next();
            if (!navDestination.equals(navGraph.getNodes().get(navDestination.getId()))) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final NavDestination findNode(@IdRes int resId) {
        return this.impl.findNode$navigation_common_release(resId);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findNodeComprehensive(@IdRes int resId, @Nullable NavDestination lastVisited, boolean searchChildren, @Nullable NavDestination matchingDest) {
        return this.impl.findNodeComprehensive$navigation_common_release(resId, lastVisited, searchChildren, matchingDest);
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public String getDisplayName() {
        return this.impl.getDisplayName$navigation_common_release(super.getDisplayName());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final SparseArrayCompat<NavDestination> getNodes() {
        return this.impl.getNodes$navigation_common_release();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final String getStartDestDisplayName() {
        return this.impl.getStartDestDisplayName$navigation_common_release();
    }

    @Deprecated(message = "Use getStartDestinationId instead.", replaceWith = @ReplaceWith(expression = "startDestinationId", imports = {}))
    @IdRes
    public final int getStartDestination() {
        return this.impl.getStartDestinationId$navigation_common_release();
    }

    @IdRes
    public final int getStartDestinationId() {
        return this.impl.getStartDestinationId$navigation_common_release();
    }

    @Nullable
    public final String getStartDestinationRoute() {
        return this.impl.getStartDestinationRoute();
    }

    @Override // androidx.navigation.NavDestination
    public int hashCode() {
        int startDestinationId = getStartDestinationId();
        SparseArrayCompat<NavDestination> nodes = getNodes();
        int size = nodes.size();
        for (int i = 0; i < size; i++) {
            startDestinationId = AbstractC1923c.m1038b(startDestinationId, 31, nodes.keyAt(i), 31) + nodes.valueAt(i).hashCode();
        }
        return startDestinationId;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<NavDestination> iterator() {
        return this.impl.iterator$navigation_common_release();
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public NavDestination.DeepLinkMatch matchDeepLink(@NotNull NavDeepLinkRequest navDeepLinkRequest) {
        AbstractC5830k.m5330g(navDeepLinkRequest, "navDeepLinkRequest");
        return this.impl.matchDeepLink$navigation_common_release(super.matchDeepLink(navDeepLinkRequest), navDeepLinkRequest);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination.DeepLinkMatch matchDeepLinkComprehensive(@NotNull NavDeepLinkRequest navDeepLinkRequest, boolean searchChildren, boolean searchParent, @NotNull NavDestination lastVisited) {
        AbstractC5830k.m5330g(navDeepLinkRequest, "navDeepLinkRequest");
        AbstractC5830k.m5330g(lastVisited, "lastVisited");
        return this.impl.matchDeepLinkComprehensive$navigation_common_release(super.matchDeepLink(navDeepLinkRequest), navDeepLinkRequest, searchChildren, searchParent, lastVisited);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination.DeepLinkMatch matchRouteComprehensive(@NotNull String route, boolean searchChildren, boolean searchParent, @NotNull NavDestination lastVisited) {
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(lastVisited, "lastVisited");
        return this.impl.matchRouteComprehensive$navigation_common_release(route, searchChildren, searchParent, lastVisited);
    }

    @Override // androidx.navigation.NavDestination
    public void onInflate(@NotNull Context context, @NotNull AttributeSet attrs) {
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(attrs, "attrs");
        super.onInflate(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, C2829R.styleable.NavGraphNavigator);
        AbstractC5830k.m5329f(typedArrayObtainAttributes, "obtainAttributes(...)");
        setStartDestinationId(typedArrayObtainAttributes.getResourceId(C2829R.styleable.NavGraphNavigator_startDestination, 0));
        this.impl.setStartDestIdName$navigation_common_release(NavDestination.INSTANCE.getDisplayName(new NavContext(context), this.impl.getStartDestId()));
        typedArrayObtainAttributes.recycle();
    }

    public final void remove(@NotNull NavDestination node) {
        AbstractC5830k.m5330g(node, "node");
        this.impl.remove$navigation_common_release(node);
    }

    public final void setStartDestination(int startDestId) {
        this.impl.setStartDestination$navigation_common_release(startDestId);
    }

    @Override // androidx.navigation.NavDestination
    @NotNull
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
        } else if (this.impl.getStartDestIdName() != null) {
            sb.append(this.impl.getStartDestIdName());
        } else {
            sb.append("0x" + Integer.toHexString(this.impl.getStartDestId()));
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    public final void addDestinations(@NotNull NavDestination... nodes) {
        AbstractC5830k.m5330g(nodes, "nodes");
        this.impl.addDestinations$navigation_common_release((NavDestination[]) Arrays.copyOf(nodes, nodes.length));
    }

    @Nullable
    public final NavDestination findNode(@Nullable String route) {
        return this.impl.findNode$navigation_common_release(route);
    }

    public final void setStartDestination(@NotNull String startDestRoute) {
        AbstractC5830k.m5330g(startDestRoute, "startDestRoute");
        this.impl.setStartDestination$navigation_common_release(startDestRoute);
    }

    @Nullable
    public final NavDestination findNode(@NotNull InterfaceC6779c route) {
        AbstractC5830k.m5330g(route, "route");
        return this.impl.findNode$navigation_common_release(route);
    }

    public final <T> void setStartDestination() {
        AbstractC5830k.m5338o();
        throw null;
    }

    @Nullable
    public final <T> NavDestination findNode(@Nullable T route) {
        return this.impl.findNode$navigation_common_release((NavGraphImpl) route);
    }

    public final /* synthetic */ void setStartDestination(InterfaceC6779c startDestRoute) {
        AbstractC5830k.m5330g(startDestRoute, "startDestRoute");
        this.impl.setStartDestination$navigation_common_release(startDestRoute);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findNode(@NotNull String route, boolean searchParents) {
        AbstractC5830k.m5330g(route, "route");
        return this.impl.findNode$navigation_common_release(route, searchParents);
    }

    public final /* synthetic */ void setStartDestination(Object startDestRoute) {
        AbstractC5830k.m5330g(startDestRoute, "startDestRoute");
        this.impl.setStartDestination$navigation_common_release((NavGraphImpl) startDestRoute);
    }

    public final <T> NavDestination findNode() {
        AbstractC5830k.m5338o();
        throw null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T> void setStartDestination(@NotNull InterfaceC5686b serializer, @NotNull InterfaceC6471c parseRoute) {
        AbstractC5830k.m5330g(serializer, "serializer");
        AbstractC5830k.m5330g(parseRoute, "parseRoute");
        this.impl.setStartDestination$navigation_common_release(serializer, parseRoute);
    }
}
