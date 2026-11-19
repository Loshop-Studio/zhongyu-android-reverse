package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;

/* loaded from: classes.dex */
public final class NavHostControllerKt {
    @Composable
    public static final State<NavBackStackEntry> currentBackStackEntryAsState(NavController navController, Composer composer, int i10) {
        return NavHostControllerKt__NavHostControllerKt.currentBackStackEntryAsState(navController, composer, i10);
    }

    @Composable
    public static final NavHostController rememberNavController(Navigator<? extends NavDestination>[] navigatorArr, Composer composer, int i10) {
        return NavHostControllerKt__NavHostController_androidKt.rememberNavController(navigatorArr, composer, i10);
    }
}
