package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@Metadata(m5109d1 = {"androidx/navigation/NavGraphBuilderKt__NavGraphBuilderKt", "androidx/navigation/NavGraphBuilderKt__NavGraphBuilder_androidKt"}, m5111k = 4, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NavGraphBuilderKt {
    @Deprecated(message = "Use routes to build your NavGraph instead", replaceWith = @ReplaceWith(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @NotNull
    public static final NavGraph navigation(@NotNull NavigatorProvider navigatorProvider, @IdRes int i, @IdRes int i8, @NotNull InterfaceC6471c interfaceC6471c) {
        return NavGraphBuilderKt__NavGraphBuilder_androidKt.navigation(navigatorProvider, i, i8, interfaceC6471c);
    }

    @NotNull
    public static final NavGraph navigation(@NotNull NavigatorProvider navigatorProvider, @NotNull Object obj, @Nullable InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> map, @NotNull InterfaceC6471c interfaceC6471c) {
        return NavGraphBuilderKt__NavGraphBuilderKt.navigation(navigatorProvider, obj, interfaceC6779c, map, interfaceC6471c);
    }

    @NotNull
    public static final NavGraph navigation(@NotNull NavigatorProvider navigatorProvider, @NotNull String str, @Nullable String str2, @NotNull InterfaceC6471c interfaceC6471c) {
        return NavGraphBuilderKt__NavGraphBuilderKt.navigation(navigatorProvider, str, str2, interfaceC6471c);
    }

    @NotNull
    public static final NavGraph navigation(@NotNull NavigatorProvider navigatorProvider, @NotNull InterfaceC6779c interfaceC6779c, @Nullable InterfaceC6779c interfaceC6779c2, @NotNull Map<InterfaceC6793q, NavType<?>> map, @NotNull InterfaceC6471c interfaceC6471c) {
        return NavGraphBuilderKt__NavGraphBuilderKt.navigation(navigatorProvider, interfaceC6779c, interfaceC6779c2, map, interfaceC6471c);
    }

    @Deprecated(message = "Use routes to build your nested NavGraph instead", replaceWith = @ReplaceWith(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void navigation(@NotNull NavGraphBuilder navGraphBuilder, @IdRes int i, @IdRes int i8, @NotNull InterfaceC6471c interfaceC6471c) {
        NavGraphBuilderKt__NavGraphBuilder_androidKt.navigation(navGraphBuilder, i, i8, interfaceC6471c);
    }

    public static final void navigation(@NotNull NavGraphBuilder navGraphBuilder, @NotNull String str, @NotNull String str2, @NotNull InterfaceC6471c interfaceC6471c) {
        NavGraphBuilderKt__NavGraphBuilderKt.navigation(navGraphBuilder, str, str2, interfaceC6471c);
    }

    public static final <T> void navigation(@NotNull NavGraphBuilder navGraphBuilder, @NotNull InterfaceC6779c interfaceC6779c, @NotNull Object obj, @NotNull Map<InterfaceC6793q, NavType<?>> map, @NotNull InterfaceC6471c interfaceC6471c) {
        NavGraphBuilderKt__NavGraphBuilderKt.navigation(navGraphBuilder, interfaceC6779c, obj, map, interfaceC6471c);
    }

    public static final <T> void navigation(@NotNull NavGraphBuilder navGraphBuilder, @NotNull InterfaceC6779c interfaceC6779c, @NotNull InterfaceC6779c interfaceC6779c2, @NotNull Map<InterfaceC6793q, NavType<?>> map, @NotNull InterfaceC6471c interfaceC6471c) {
        NavGraphBuilderKt__NavGraphBuilderKt.navigation(navGraphBuilder, interfaceC6779c, interfaceC6779c2, map, interfaceC6471c);
    }
}
