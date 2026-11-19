package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.Metadata;

@Metadata(m7879d1 = {"androidx/navigation/NavGraphKt__NavGraphKt", "androidx/navigation/NavGraphKt__NavGraph_androidKt"}, m7881k = 4, m7882mv = {2, 0, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class NavGraphKt {
    public static final boolean contains(NavGraph navGraph, @IdRes int i6) {
        return NavGraphKt__NavGraph_androidKt.contains(navGraph, i6);
    }

    public static final NavDestination get(NavGraph navGraph, @IdRes int i6) {
        return NavGraphKt__NavGraph_androidKt.get(navGraph, i6);
    }

    public static final void minusAssign(NavGraph navGraph, NavDestination navDestination) {
        NavGraphKt__NavGraphKt.minusAssign(navGraph, navDestination);
    }

    public static final void plusAssign(NavGraph navGraph, NavDestination navDestination) {
        NavGraphKt__NavGraphKt.plusAssign(navGraph, navDestination);
    }

    public static final <T> boolean contains(NavGraph navGraph, T t6) {
        return NavGraphKt__NavGraphKt.contains(navGraph, t6);
    }

    public static final <T> NavDestination get(NavGraph navGraph, T t6) {
        return NavGraphKt__NavGraphKt.get(navGraph, t6);
    }

    public static final void plusAssign(NavGraph navGraph, NavGraph navGraph2) {
        NavGraphKt__NavGraphKt.plusAssign(navGraph, navGraph2);
    }

    public static final boolean contains(NavGraph navGraph, String str) {
        return NavGraphKt__NavGraphKt.contains(navGraph, str);
    }

    public static final NavDestination get(NavGraph navGraph, String str) {
        return NavGraphKt__NavGraphKt.get(navGraph, str);
    }
}
