package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final /* synthetic */ class NavGraphKt__NavGraph_androidKt {
    public static final boolean contains(NavGraph navGraph, @IdRes int i10) {
        AbstractC9979u.m20294g(navGraph, "<this>");
        return navGraph.findNode(i10) != null;
    }

    public static final NavDestination get(NavGraph navGraph, @IdRes int i10) {
        AbstractC9979u.m20294g(navGraph, "<this>");
        NavDestination navDestinationFindNode = navGraph.findNode(i10);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + i10 + " was found in " + navGraph);
    }
}
