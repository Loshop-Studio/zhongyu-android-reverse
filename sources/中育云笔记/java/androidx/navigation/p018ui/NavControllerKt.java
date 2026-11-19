package androidx.navigation.p018ui;

import androidx.customview.widget.Openable;
import androidx.navigation.NavController;
import androidx.navigation.p018ui.AppBarConfiguration;
import androidx.navigation.p018ui.AppBarConfigurationKt;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class NavControllerKt {
    public static final boolean navigateUp(NavController navController, Openable openable) {
        AbstractC9979u.m20294g(navController, "<this>");
        return NavigationUI.navigateUp(navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new C4190x56421ee5(AppBarConfigurationKt.C41871.INSTANCE)).build());
    }

    public static final boolean navigateUp(NavController navController, AppBarConfiguration appBarConfiguration) {
        AbstractC9979u.m20294g(navController, "<this>");
        AbstractC9979u.m20294g(appBarConfiguration, "appBarConfiguration");
        return NavigationUI.navigateUp(navController, appBarConfiguration);
    }
}
