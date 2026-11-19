package androidx.navigation;

import android.content.Intent;
import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

@Metadata(m13412d1 = {"androidx/navigation/NavControllerKt__NavControllerKt", "androidx/navigation/NavControllerKt__NavController_androidKt"}, m13414k = 4, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class NavControllerKt {
    public static final NavDeepLinkRequest NavDeepLinkRequest(Intent intent) {
        return NavControllerKt__NavController_androidKt.NavDeepLinkRequest(intent);
    }

    @Deprecated(message = "Use routes to create your NavGraph instead", replaceWith = @ReplaceWith(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final NavGraph createGraph(NavController navController, @IdRes int i9, @IdRes int i10, Function1<? super NavGraphBuilder, Unit> function1) {
        return NavControllerKt__NavController_androidKt.createGraph(navController, i9, i10, function1);
    }

    public static final NavGraph createGraph(NavController navController, Object obj, KClass<?> kClass, Map<KType, NavType<?>> map, Function1<? super NavGraphBuilder, Unit> function1) {
        return NavControllerKt__NavControllerKt.createGraph(navController, obj, kClass, map, function1);
    }

    public static final NavGraph createGraph(NavController navController, String str, String str2, Function1<? super NavGraphBuilder, Unit> function1) {
        return NavControllerKt__NavControllerKt.createGraph(navController, str, str2, function1);
    }

    public static final NavGraph createGraph(NavController navController, KClass<?> kClass, KClass<?> kClass2, Map<KType, NavType<?>> map, Function1<? super NavGraphBuilder, Unit> function1) {
        return NavControllerKt__NavControllerKt.createGraph(navController, kClass, kClass2, map, function1);
    }
}
