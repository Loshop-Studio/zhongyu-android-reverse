package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;

/* loaded from: classes.dex */
final /* synthetic */ class NavHostControllerKt__NavHostControllerKt {
    @Composable
    public static final State<NavBackStackEntry> currentBackStackEntryAsState(NavController navController, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-120375203, i10, -1, "androidx.navigation.compose.currentBackStackEntryAsState (NavHostController.kt:41)");
        }
        State<NavBackStackEntry> stateCollectAsState = SnapshotStateKt.collectAsState(navController.getCurrentBackStackEntryFlow(), null, null, composer, 48, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsState;
    }
}
