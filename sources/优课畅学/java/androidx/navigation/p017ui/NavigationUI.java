package androidx.navigation.p017ui;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.widget.Openable;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptions;
import androidx.navigation.internal.NavContext;
import androidx.navigation.p017ui.AppBarConfiguration;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class NavigationUI {
    public static final NavigationUI INSTANCE = new NavigationUI();
    private static final String TAG = "NavigationUI";

    private NavigationUI() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final BottomSheetBehavior<?> findBottomSheetBehavior(View view) {
        AbstractC9133u.m16133g(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            return null;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return findBottomSheetBehavior((View) parent);
        }
        return null;
    }

    public static final boolean matchDestination$navigation_ui_release(NavDestination navDestination, @IdRes int i10) {
        AbstractC9133u.m16133g(navDestination, "<this>");
        Iterator it = NavDestination.Companion.getHierarchy(navDestination).iterator();
        while (it.hasNext()) {
            if (((NavDestination) it.next()).getId() == i10) {
                return true;
            }
        }
        return false;
    }

    public static final boolean navigateUp(NavController navController, Openable openable) {
        AbstractC9133u.m16133g(navController, "navController");
        return navigateUp(navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static final boolean onNavDestinationSelected(MenuItem item, NavController navController) {
        AbstractC9133u.m16133g(item, "item");
        AbstractC9133u.m16133g(navController, "navController");
        NavOptions.Builder restoreState = new NavOptions.Builder().setLaunchSingleTop(true).setRestoreState(true);
        NavDestination currentDestination = navController.getCurrentDestination();
        AbstractC9133u.m16130d(currentDestination);
        NavGraph parent = currentDestination.getParent();
        AbstractC9133u.m16130d(parent);
        if (parent.findNode(item.getItemId()) instanceof ActivityNavigator.Destination) {
            restoreState.setEnterAnim(C4267R.anim.nav_default_enter_anim).setExitAnim(C4267R.anim.nav_default_exit_anim).setPopEnterAnim(C4267R.anim.nav_default_pop_enter_anim).setPopExitAnim(C4267R.anim.nav_default_pop_exit_anim);
        } else {
            restoreState.setEnterAnim(C4267R.animator.nav_default_enter_anim).setExitAnim(C4267R.animator.nav_default_exit_anim).setPopEnterAnim(C4267R.animator.nav_default_pop_enter_anim).setPopExitAnim(C4267R.animator.nav_default_pop_exit_anim);
        }
        if ((item.getOrder() & ProfileVerifier.CompilationStatus.f1860xf2722a21) == 0) {
            restoreState.setPopUpTo(NavGraph.Companion.findStartDestination(navController.getGraph()).getId(), false, true);
        }
        try {
            navController.navigate(item.getItemId(), (Bundle) null, restoreState.build());
            NavDestination currentDestination2 = navController.getCurrentDestination();
            if (currentDestination2 != null) {
                return matchDestination$navigation_ui_release(currentDestination2, item.getItemId());
            }
            return false;
        } catch (IllegalArgumentException e10) {
            Log.i(TAG, "Ignoring onNavDestinationSelected for MenuItem " + NavDestination.Companion.getDisplayName(new NavContext(navController.getContext()), item.getItemId()) + " as it cannot be found from the current destination " + navController.getCurrentDestination(), e10);
            return false;
        }
    }

    public static final void setupActionBarWithNavController(AppCompatActivity activity, NavController navController) {
        AbstractC9133u.m16133g(activity, "activity");
        AbstractC9133u.m16133g(navController, "navController");
        setupActionBarWithNavController$default(activity, navController, null, 4, null);
    }

    public static /* synthetic */ void setupActionBarWithNavController$default(AppCompatActivity appCompatActivity, NavController navController, AppBarConfiguration appBarConfiguration, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupActionBarWithNavController(appCompatActivity, navController, appBarConfiguration);
    }

    public static final void setupWithNavController(Toolbar toolbar, NavController navController) {
        AbstractC9133u.m16133g(toolbar, "toolbar");
        AbstractC9133u.m16133g(navController, "navController");
        setupWithNavController$default(toolbar, navController, null, 4, null);
    }

    public static /* synthetic */ void setupWithNavController$default(Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupWithNavController(toolbar, navController, appBarConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupWithNavController$lambda$3(NavController navController, NavigationView navigationView, MenuItem item) {
        AbstractC9133u.m16133g(item, "item");
        boolean zOnNavDestinationSelected = onNavDestinationSelected(item, navController);
        if (zOnNavDestinationSelected) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof Openable) {
                ((Openable) parent).close();
                return zOnNavDestinationSelected;
            }
            BottomSheetBehavior<?> bottomSheetBehaviorFindBottomSheetBehavior = findBottomSheetBehavior(navigationView);
            if (bottomSheetBehaviorFindBottomSheetBehavior != null) {
                bottomSheetBehaviorFindBottomSheetBehavior.setState(5);
            }
        }
        return zOnNavDestinationSelected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupWithNavController$lambda$5(NavController navController, boolean z10, NavigationView navigationView, MenuItem item) {
        AbstractC9133u.m16133g(item, "item");
        boolean zOnNavDestinationSelected = onNavDestinationSelected(item, navController, z10);
        if (zOnNavDestinationSelected) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof Openable) {
                ((Openable) parent).close();
                return zOnNavDestinationSelected;
            }
            BottomSheetBehavior<?> bottomSheetBehaviorFindBottomSheetBehavior = findBottomSheetBehavior(navigationView);
            if (bottomSheetBehaviorFindBottomSheetBehavior != null) {
                bottomSheetBehaviorFindBottomSheetBehavior.setState(5);
            }
        }
        return zOnNavDestinationSelected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupWithNavController$lambda$6(NavController navController, MenuItem item) {
        AbstractC9133u.m16133g(item, "item");
        return onNavDestinationSelected(item, navController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupWithNavController$lambda$8(NavController navController, boolean z10, MenuItem item) {
        AbstractC9133u.m16133g(item, "item");
        return onNavDestinationSelected(item, navController, z10);
    }

    public static final void setupActionBarWithNavController(AppCompatActivity activity, NavController navController, Openable openable) {
        AbstractC9133u.m16133g(activity, "activity");
        AbstractC9133u.m16133g(navController, "navController");
        setupActionBarWithNavController(activity, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController) {
        AbstractC9133u.m16133g(collapsingToolbarLayout, "collapsingToolbarLayout");
        AbstractC9133u.m16133g(toolbar, "toolbar");
        AbstractC9133u.m16133g(navController, "navController");
        setupWithNavController$default(collapsingToolbarLayout, toolbar, navController, null, 8, null);
    }

    public static final void setupWithNavController(Toolbar toolbar, NavController navController, Openable openable) {
        AbstractC9133u.m16133g(toolbar, "toolbar");
        AbstractC9133u.m16133g(navController, "navController");
        setupWithNavController(toolbar, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static /* synthetic */ void setupWithNavController$default(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupWithNavController(collapsingToolbarLayout, toolbar, navController, appBarConfiguration);
    }

    public static final boolean navigateUp(NavController navController, AppBarConfiguration configuration) {
        AbstractC9133u.m16133g(navController, "navController");
        AbstractC9133u.m16133g(configuration, "configuration");
        Openable openableLayout = configuration.getOpenableLayout();
        NavDestination currentDestination = navController.getCurrentDestination();
        if (openableLayout != null && currentDestination != null && configuration.isTopLevelDestination(currentDestination)) {
            openableLayout.open();
            return true;
        }
        if (navController.navigateUp()) {
            return true;
        }
        AppBarConfiguration.OnNavigateUpListener fallbackOnNavigateUpListener = configuration.getFallbackOnNavigateUpListener();
        if (fallbackOnNavigateUpListener != null) {
            return fallbackOnNavigateUpListener.onNavigateUp();
        }
        return false;
    }

    public static final void setupActionBarWithNavController(AppCompatActivity activity, NavController navController, AppBarConfiguration configuration) {
        AbstractC9133u.m16133g(activity, "activity");
        AbstractC9133u.m16133g(navController, "navController");
        AbstractC9133u.m16133g(configuration, "configuration");
        navController.addOnDestinationChangedListener(new ActionBarOnDestinationChangedListener(activity, configuration));
    }

    public static final void setupWithNavController(Toolbar toolbar, final NavController navController, final AppBarConfiguration configuration) {
        AbstractC9133u.m16133g(toolbar, "toolbar");
        AbstractC9133u.m16133g(navController, "navController");
        AbstractC9133u.m16133g(configuration, "configuration");
        navController.addOnDestinationChangedListener(new ToolbarOnDestinationChangedListener(toolbar, configuration));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.navigation.ui.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NavigationUI.navigateUp(navController, configuration);
            }
        });
    }

    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, Openable openable) {
        AbstractC9133u.m16133g(collapsingToolbarLayout, "collapsingToolbarLayout");
        AbstractC9133u.m16133g(toolbar, "toolbar");
        AbstractC9133u.m16133g(navController, "navController");
        setupWithNavController(collapsingToolbarLayout, toolbar, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, final NavController navController, final AppBarConfiguration configuration) {
        AbstractC9133u.m16133g(collapsingToolbarLayout, "collapsingToolbarLayout");
        AbstractC9133u.m16133g(toolbar, "toolbar");
        AbstractC9133u.m16133g(navController, "navController");
        AbstractC9133u.m16133g(configuration, "configuration");
        navController.addOnDestinationChangedListener(new CollapsingToolbarOnDestinationChangedListener(collapsingToolbarLayout, toolbar, configuration));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.navigation.ui.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NavigationUI.navigateUp(navController, configuration);
            }
        });
    }

    public static final void setupWithNavController(final NavigationView navigationView, final NavController navController) {
        AbstractC9133u.m16133g(navigationView, "navigationView");
        AbstractC9133u.m16133g(navController, "navController");
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() { // from class: androidx.navigation.ui.f
            @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return NavigationUI.setupWithNavController$lambda$3(navController, navigationView, menuItem);
            }
        });
        final WeakReference weakReference = new WeakReference(navigationView);
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.4
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public void onDestinationChanged(NavController controller, NavDestination destination, Bundle bundle) {
                AbstractC9133u.m16133g(controller, "controller");
                AbstractC9133u.m16133g(destination, "destination");
                NavigationView navigationView2 = weakReference.get();
                if (navigationView2 == null) {
                    navController.removeOnDestinationChangedListener(this);
                    return;
                }
                if (destination instanceof FloatingWindow) {
                    return;
                }
                Menu menu = navigationView2.getMenu();
                AbstractC9133u.m16132f(menu, "getMenu(...)");
                int size = menu.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MenuItem item = menu.getItem(i10);
                    item.setChecked(NavigationUI.matchDestination$navigation_ui_release(destination, item.getItemId()));
                }
            }
        });
    }

    @NavigationUiSaveStateControl
    public static final void setupWithNavController(final NavigationView navigationView, final NavController navController, final boolean z10) {
        AbstractC9133u.m16133g(navigationView, "navigationView");
        AbstractC9133u.m16133g(navController, "navController");
        if (!z10) {
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() { // from class: androidx.navigation.ui.c
                @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
                public final boolean onNavigationItemSelected(MenuItem menuItem) {
                    return NavigationUI.setupWithNavController$lambda$5(navController, z10, navigationView, menuItem);
                }
            });
            final WeakReference weakReference = new WeakReference(navigationView);
            navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.7
                @Override // androidx.navigation.NavController.OnDestinationChangedListener
                public void onDestinationChanged(NavController controller, NavDestination destination, Bundle bundle) {
                    AbstractC9133u.m16133g(controller, "controller");
                    AbstractC9133u.m16133g(destination, "destination");
                    NavigationView navigationView2 = weakReference.get();
                    if (navigationView2 == null) {
                        navController.removeOnDestinationChangedListener(this);
                        return;
                    }
                    if (destination instanceof FloatingWindow) {
                        return;
                    }
                    Menu menu = navigationView2.getMenu();
                    AbstractC9133u.m16132f(menu, "getMenu(...)");
                    int size = menu.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        MenuItem item = menu.getItem(i10);
                        item.setChecked(NavigationUI.matchDestination$navigation_ui_release(destination, item.getItemId()));
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
    }

    @NavigationUiSaveStateControl
    public static final boolean onNavDestinationSelected(MenuItem item, NavController navController, boolean z10) {
        AbstractC9133u.m16133g(item, "item");
        AbstractC9133u.m16133g(navController, "navController");
        if (!z10) {
            NavOptions.Builder launchSingleTop = new NavOptions.Builder().setLaunchSingleTop(true);
            NavDestination currentDestination = navController.getCurrentDestination();
            AbstractC9133u.m16130d(currentDestination);
            NavGraph parent = currentDestination.getParent();
            AbstractC9133u.m16130d(parent);
            if (parent.findNode(item.getItemId()) instanceof ActivityNavigator.Destination) {
                launchSingleTop.setEnterAnim(C4267R.anim.nav_default_enter_anim).setExitAnim(C4267R.anim.nav_default_exit_anim).setPopEnterAnim(C4267R.anim.nav_default_pop_enter_anim).setPopExitAnim(C4267R.anim.nav_default_pop_exit_anim);
            } else {
                launchSingleTop.setEnterAnim(C4267R.animator.nav_default_enter_anim).setExitAnim(C4267R.animator.nav_default_exit_anim).setPopEnterAnim(C4267R.animator.nav_default_pop_enter_anim).setPopExitAnim(C4267R.animator.nav_default_pop_exit_anim);
            }
            if ((item.getOrder() & ProfileVerifier.CompilationStatus.f1860xf2722a21) == 0) {
                NavOptions.Builder.setPopUpTo$default(launchSingleTop, NavGraph.Companion.findStartDestination(navController.getGraph()).getId(), false, false, 4, (Object) null);
            }
            try {
                navController.navigate(item.getItemId(), (Bundle) null, launchSingleTop.build());
                NavDestination currentDestination2 = navController.getCurrentDestination();
                if (currentDestination2 != null) {
                    return matchDestination$navigation_ui_release(currentDestination2, item.getItemId());
                }
                return false;
            } catch (IllegalArgumentException e10) {
                Log.i(TAG, "Ignoring onNavDestinationSelected for MenuItem " + NavDestination.Companion.getDisplayName(new NavContext(navController.getContext()), item.getItemId()) + " as it cannot be found from the current destination " + navController.getCurrentDestination(), e10);
                return false;
            }
        }
        throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
    }

    public static final void setupWithNavController(NavigationBarView navigationBarView, final NavController navController) {
        AbstractC9133u.m16133g(navigationBarView, "navigationBarView");
        AbstractC9133u.m16133g(navController, "navController");
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { // from class: androidx.navigation.ui.e
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return NavigationUI.setupWithNavController$lambda$6(navController, menuItem);
            }
        });
        final WeakReference weakReference = new WeakReference(navigationBarView);
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.9
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public void onDestinationChanged(NavController controller, NavDestination destination, Bundle bundle) {
                AbstractC9133u.m16133g(controller, "controller");
                AbstractC9133u.m16133g(destination, "destination");
                NavigationBarView navigationBarView2 = weakReference.get();
                if (navigationBarView2 == null) {
                    navController.removeOnDestinationChangedListener(this);
                    return;
                }
                if (destination instanceof FloatingWindow) {
                    return;
                }
                Menu menu = navigationBarView2.getMenu();
                AbstractC9133u.m16132f(menu, "getMenu(...)");
                int size = menu.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MenuItem item = menu.getItem(i10);
                    if (NavigationUI.matchDestination$navigation_ui_release(destination, item.getItemId())) {
                        item.setChecked(true);
                    }
                }
            }
        });
    }

    @NavigationUiSaveStateControl
    public static final void setupWithNavController(NavigationBarView navigationBarView, final NavController navController, final boolean z10) {
        AbstractC9133u.m16133g(navigationBarView, "navigationBarView");
        AbstractC9133u.m16133g(navController, "navController");
        if (!z10) {
            navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { // from class: androidx.navigation.ui.a
                @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
                public final boolean onNavigationItemSelected(MenuItem menuItem) {
                    return NavigationUI.setupWithNavController$lambda$8(navController, z10, menuItem);
                }
            });
            final WeakReference weakReference = new WeakReference(navigationBarView);
            navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.12
                @Override // androidx.navigation.NavController.OnDestinationChangedListener
                public void onDestinationChanged(NavController controller, NavDestination destination, Bundle bundle) {
                    AbstractC9133u.m16133g(controller, "controller");
                    AbstractC9133u.m16133g(destination, "destination");
                    NavigationBarView navigationBarView2 = weakReference.get();
                    if (navigationBarView2 == null) {
                        navController.removeOnDestinationChangedListener(this);
                        return;
                    }
                    if (destination instanceof FloatingWindow) {
                        return;
                    }
                    Menu menu = navigationBarView2.getMenu();
                    AbstractC9133u.m16132f(menu, "getMenu(...)");
                    int size = menu.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        MenuItem item = menu.getItem(i10);
                        if (NavigationUI.matchDestination$navigation_ui_release(destination, item.getItemId())) {
                            item.setChecked(true);
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
    }
}
