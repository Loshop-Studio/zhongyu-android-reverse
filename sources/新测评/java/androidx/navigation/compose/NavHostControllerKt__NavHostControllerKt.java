package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m13558d2 = {"currentBackStackEntryAsState", "Landroidx/compose/runtime/State;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/navigation/NavController;", "(Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "navigation-compose_release"}, m13559k = 5, m13560mv = {2, 0, 0}, m13562xi = 48, m13563xs = "androidx/navigation/compose/NavHostControllerKt")
/* loaded from: classes3.dex */
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
