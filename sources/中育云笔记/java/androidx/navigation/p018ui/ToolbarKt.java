package androidx.navigation.p018ui;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.p018ui.AppBarConfiguration;
import androidx.navigation.p018ui.AppBarConfigurationKt;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class ToolbarKt {
    public static final void setupWithNavController(Toolbar toolbar, NavController navController, DrawerLayout drawerLayout) {
        AbstractC9979u.m20294g(toolbar, "<this>");
        AbstractC9979u.m20294g(navController, "navController");
        NavigationUI.setupWithNavController(toolbar, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(drawerLayout).setFallbackOnNavigateUpListener(new C4190x56421ee5(AppBarConfigurationKt.C41871.INSTANCE)).build());
    }

    public static /* synthetic */ void setupWithNavController$default(Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(null).setFallbackOnNavigateUpListener(new C4190x56421ee5(AppBarConfigurationKt.C41871.INSTANCE)).build();
        }
        setupWithNavController(toolbar, navController, appBarConfiguration);
    }

    public static final void setupWithNavController(Toolbar toolbar, NavController navController, AppBarConfiguration configuration) {
        AbstractC9979u.m20294g(toolbar, "<this>");
        AbstractC9979u.m20294g(navController, "navController");
        AbstractC9979u.m20294g(configuration, "configuration");
        NavigationUI.setupWithNavController(toolbar, navController, configuration);
    }
}
