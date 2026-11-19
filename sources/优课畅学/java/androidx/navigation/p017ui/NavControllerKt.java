package androidx.navigation.p017ui;

import androidx.customview.widget.Openable;
import androidx.navigation.NavController;
import androidx.navigation.p017ui.AppBarConfiguration;
import androidx.navigation.p017ui.AppBarConfigurationKt;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class NavControllerKt {
    public static final boolean navigateUp(NavController navController, Openable openable) {
        AbstractC9133u.m16133g(navController, "<this>");
        return NavigationUI.navigateUp(navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C4262x56421ee5(AppBarConfigurationKt.C42591.INSTANCE)).build());
    }

    public static final boolean navigateUp(NavController navController, AppBarConfiguration appBarConfiguration) {
        AbstractC9133u.m16133g(navController, "<this>");
        AbstractC9133u.m16133g(appBarConfiguration, "appBarConfiguration");
        return NavigationUI.navigateUp(navController, appBarConfiguration);
    }
}
