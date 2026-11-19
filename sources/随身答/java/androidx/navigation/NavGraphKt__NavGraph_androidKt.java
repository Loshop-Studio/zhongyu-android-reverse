package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0086\n\u001a\u0017\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0007"}, m13413d2 = {"get", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/NavGraph;", "id", "", "contains", "", "navigation-common_release"}, m13414k = 5, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m13418xs = "androidx/navigation/NavGraphKt")
/* loaded from: classes3.dex */
final /* synthetic */ class NavGraphKt__NavGraph_androidKt {
    public static final boolean contains(NavGraph navGraph, @IdRes int i9) {
        Intrinsics.checkNotNullParameter(navGraph, "<this>");
        return navGraph.findNode(i9) != null;
    }

    public static final NavDestination get(NavGraph navGraph, @IdRes int i9) {
        Intrinsics.checkNotNullParameter(navGraph, "<this>");
        NavDestination navDestinationFindNode = navGraph.findNode(i9);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + i9 + " was found in " + navGraph);
    }
}
