package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"androidx/navigation/compose/NavHostControllerKt__NavHostControllerKt", "androidx/navigation/compose/NavHostControllerKt__NavHostController_androidKt"}, m5111k = 4, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NavHostControllerKt {
    @Composable
    @NotNull
    public static final State<NavBackStackEntry> currentBackStackEntryAsState(@NotNull NavController navController, @Nullable Composer composer, int i) {
        return NavHostControllerKt__NavHostControllerKt.currentBackStackEntryAsState(navController, composer, i);
    }

    @Composable
    @NotNull
    public static final NavHostController rememberNavController(@NotNull Navigator<? extends NavDestination>[] navigatorArr, @Nullable Composer composer, int i) {
        return NavHostControllerKt__NavHostController_androidKt.rememberNavController(navigatorArr, composer, i);
    }
}
