package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0086\n\u001a\u0017\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0007"}, m13558d2 = {"get", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/NavGraph;", "id", "", "contains", "", "navigation-common_release"}, m13559k = 5, m13560mv = {2, 0, 0}, m13562xi = 48, m13563xs = "androidx/navigation/NavGraphKt")
/* loaded from: classes3.dex */
final /* synthetic */ class NavGraphKt__NavGraph_androidKt {
    public static final boolean contains(NavGraph navGraph, @IdRes int i10) {
        Intrinsics.checkNotNullParameter(navGraph, "<this>");
        return navGraph.findNode(i10) != null;
    }

    public static final NavDestination get(NavGraph navGraph, @IdRes int i10) {
        Intrinsics.checkNotNullParameter(navGraph, "<this>");
        NavDestination navDestinationFindNode = navGraph.findNode(i10);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + i10 + " was found in " + navGraph);
    }
}
