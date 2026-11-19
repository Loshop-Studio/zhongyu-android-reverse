package androidx.navigation.p018ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.p018ui.AppBarConfiguration;
import androidx.navigation.p018ui.AppBarConfigurationKt;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class ActivityKt {
    public static final void setupActionBarWithNavController(AppCompatActivity appCompatActivity, NavController navController, DrawerLayout drawerLayout) {
        AbstractC9979u.m20294g(appCompatActivity, "<this>");
        AbstractC9979u.m20294g(navController, "navController");
        NavigationUI.setupActionBarWithNavController(appCompatActivity, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(drawerLayout).setFallbackOnNavigateUpListener(new C4190x56421ee5(AppBarConfigurationKt.C41871.INSTANCE)).build());
    }

    public static /* synthetic */ void setupActionBarWithNavController$default(AppCompatActivity appCompatActivity, NavController navController, AppBarConfiguration appBarConfiguration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(null).setFallbackOnNavigateUpListener(new C4190x56421ee5(AppBarConfigurationKt.C41871.INSTANCE)).build();
        }
        setupActionBarWithNavController(appCompatActivity, navController, appBarConfiguration);
    }

    public static final void setupActionBarWithNavController(AppCompatActivity appCompatActivity, NavController navController, AppBarConfiguration configuration) {
        AbstractC9979u.m20294g(appCompatActivity, "<this>");
        AbstractC9979u.m20294g(navController, "navController");
        AbstractC9979u.m20294g(configuration, "configuration");
        NavigationUI.setupActionBarWithNavController(appCompatActivity, navController, configuration);
    }
}
