package androidx.navigation.p018ui;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.p018ui.AppBarConfiguration;
import androidx.navigation.p018ui.AppBarConfigurationKt;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class CollapsingToolbarLayoutKt {
    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, DrawerLayout drawerLayout) {
        AbstractC9979u.m20294g(collapsingToolbarLayout, "<this>");
        AbstractC9979u.m20294g(toolbar, "toolbar");
        AbstractC9979u.m20294g(navController, "navController");
        NavigationUI.setupWithNavController(collapsingToolbarLayout, toolbar, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(drawerLayout).setFallbackOnNavigateUpListener(new C4190x56421ee5(AppBarConfigurationKt.C41871.INSTANCE)).build());
    }

    public static /* synthetic */ void setupWithNavController$default(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(null).setFallbackOnNavigateUpListener(new C4190x56421ee5(AppBarConfigurationKt.C41871.INSTANCE)).build();
        }
        setupWithNavController(collapsingToolbarLayout, toolbar, navController, appBarConfiguration);
    }

    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, AppBarConfiguration configuration) {
        AbstractC9979u.m20294g(collapsingToolbarLayout, "<this>");
        AbstractC9979u.m20294g(toolbar, "toolbar");
        AbstractC9979u.m20294g(navController, "navController");
        AbstractC9979u.m20294g(configuration, "configuration");
        NavigationUI.setupWithNavController(collapsingToolbarLayout, toolbar, navController, configuration);
    }
}
