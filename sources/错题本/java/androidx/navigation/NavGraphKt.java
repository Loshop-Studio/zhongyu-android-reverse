package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"androidx/navigation/NavGraphKt__NavGraphKt", "androidx/navigation/NavGraphKt__NavGraph_androidKt"}, m5111k = 4, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NavGraphKt {
    public static final boolean contains(@NotNull NavGraph navGraph, @IdRes int i) {
        return NavGraphKt__NavGraph_androidKt.contains(navGraph, i);
    }

    @NotNull
    public static final NavDestination get(@NotNull NavGraph navGraph, @IdRes int i) {
        return NavGraphKt__NavGraph_androidKt.get(navGraph, i);
    }

    public static final void minusAssign(@NotNull NavGraph navGraph, @NotNull NavDestination navDestination) {
        NavGraphKt__NavGraphKt.minusAssign(navGraph, navDestination);
    }

    public static final void plusAssign(@NotNull NavGraph navGraph, @NotNull NavDestination navDestination) {
        NavGraphKt__NavGraphKt.plusAssign(navGraph, navDestination);
    }

    public static final <T> boolean contains(@NotNull NavGraph navGraph, @NotNull T t8) {
        return NavGraphKt__NavGraphKt.contains(navGraph, t8);
    }

    @NotNull
    public static final <T> NavDestination get(@NotNull NavGraph navGraph, @NotNull T t8) {
        return NavGraphKt__NavGraphKt.get(navGraph, t8);
    }

    public static final void plusAssign(@NotNull NavGraph navGraph, @NotNull NavGraph navGraph2) {
        NavGraphKt__NavGraphKt.plusAssign(navGraph, navGraph2);
    }

    public static final boolean contains(@NotNull NavGraph navGraph, @NotNull String str) {
        return NavGraphKt__NavGraphKt.contains(navGraph, str);
    }

    @NotNull
    public static final NavDestination get(@NotNull NavGraph navGraph, @NotNull String str) {
        return NavGraphKt__NavGraphKt.get(navGraph, str);
    }
}
