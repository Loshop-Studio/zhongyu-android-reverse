package androidx.navigation;

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

@Metadata(m13412d1 = {"androidx/navigation/NavHostKt__NavHostKt", "androidx/navigation/NavHostKt__NavHost_androidKt"}, m13414k = 4, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class NavHostKt {
    @Deprecated(message = "Use routes to create your NavGraph instead", replaceWith = @ReplaceWith(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final NavGraph createGraph(NavHost navHost, @IdRes int i9, @IdRes int i10, Function1<? super NavGraphBuilder, Unit> function1) {
        return NavHostKt__NavHost_androidKt.createGraph(navHost, i9, i10, function1);
    }

    public static final NavGraph createGraph(NavHost navHost, Object obj, KClass<?> kClass, Map<KType, NavType<?>> map, Function1<? super NavGraphBuilder, Unit> function1) {
        return NavHostKt__NavHostKt.createGraph(navHost, obj, kClass, map, function1);
    }

    public static final NavGraph createGraph(NavHost navHost, String str, String str2, Function1<? super NavGraphBuilder, Unit> function1) {
        return NavHostKt__NavHostKt.createGraph(navHost, str, str2, function1);
    }

    public static final NavGraph createGraph(NavHost navHost, KClass<?> kClass, KClass<?> kClass2, Map<KType, NavType<?>> map, Function1<? super NavGraphBuilder, Unit> function1) {
        return NavHostKt__NavHostKt.createGraph(navHost, kClass, kClass2, map, function1);
    }
}
