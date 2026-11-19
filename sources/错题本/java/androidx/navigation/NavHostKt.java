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

@Metadata(m5109d1 = {"androidx/navigation/NavHostKt__NavHostKt", "androidx/navigation/NavHostKt__NavHost_androidKt"}, m5111k = 4, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NavHostKt {
    @Deprecated(message = "Use routes to create your NavGraph instead", replaceWith = @ReplaceWith(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @NotNull
    public static final NavGraph createGraph(@NotNull NavHost navHost, @IdRes int i, @IdRes int i8, @NotNull InterfaceC6471c interfaceC6471c) {
        return NavHostKt__NavHost_androidKt.createGraph(navHost, i, i8, interfaceC6471c);
    }

    @NotNull
    public static final NavGraph createGraph(@NotNull NavHost navHost, @NotNull Object obj, @Nullable InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> map, @NotNull InterfaceC6471c interfaceC6471c) {
        return NavHostKt__NavHostKt.createGraph(navHost, obj, interfaceC6779c, map, interfaceC6471c);
    }

    @NotNull
    public static final NavGraph createGraph(@NotNull NavHost navHost, @NotNull String str, @Nullable String str2, @NotNull InterfaceC6471c interfaceC6471c) {
        return NavHostKt__NavHostKt.createGraph(navHost, str, str2, interfaceC6471c);
    }

    @NotNull
    public static final NavGraph createGraph(@NotNull NavHost navHost, @NotNull InterfaceC6779c interfaceC6779c, @Nullable InterfaceC6779c interfaceC6779c2, @NotNull Map<InterfaceC6793q, NavType<?>> map, @NotNull InterfaceC6471c interfaceC6471c) {
        return NavHostKt__NavHostKt.createGraph(navHost, interfaceC6779c, interfaceC6779c2, map, interfaceC6471c);
    }
}
