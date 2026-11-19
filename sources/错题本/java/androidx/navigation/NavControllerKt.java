package androidx.navigation;

import android.content.Intent;
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

@Metadata(m5109d1 = {"androidx/navigation/NavControllerKt__NavControllerKt", "androidx/navigation/NavControllerKt__NavController_androidKt"}, m5111k = 4, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NavControllerKt {
    @NotNull
    public static final NavDeepLinkRequest NavDeepLinkRequest(@NotNull Intent intent) {
        return NavControllerKt__NavController_androidKt.NavDeepLinkRequest(intent);
    }

    @Deprecated(message = "Use routes to create your NavGraph instead", replaceWith = @ReplaceWith(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @NotNull
    public static final NavGraph createGraph(@NotNull NavController navController, @IdRes int i, @IdRes int i8, @NotNull InterfaceC6471c interfaceC6471c) {
        return NavControllerKt__NavController_androidKt.createGraph(navController, i, i8, interfaceC6471c);
    }

    @NotNull
    public static final NavGraph createGraph(@NotNull NavController navController, @NotNull Object obj, @Nullable InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> map, @NotNull InterfaceC6471c interfaceC6471c) {
        return NavControllerKt__NavControllerKt.createGraph(navController, obj, interfaceC6779c, map, interfaceC6471c);
    }

    @NotNull
    public static final NavGraph createGraph(@NotNull NavController navController, @NotNull String str, @Nullable String str2, @NotNull InterfaceC6471c interfaceC6471c) {
        return NavControllerKt__NavControllerKt.createGraph(navController, str, str2, interfaceC6471c);
    }

    @NotNull
    public static final NavGraph createGraph(@NotNull NavController navController, @NotNull InterfaceC6779c interfaceC6779c, @Nullable InterfaceC6779c interfaceC6779c2, @NotNull Map<InterfaceC6793q, NavType<?>> map, @NotNull InterfaceC6471c interfaceC6471c) {
        return NavControllerKt__NavControllerKt.createGraph(navController, interfaceC6779c, interfaceC6779c2, map, interfaceC6471c);
    }
}
