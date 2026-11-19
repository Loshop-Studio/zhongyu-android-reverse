package androidx.navigation.p017ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class ActionBarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    private final AppCompatActivity activity;

    /* JADX WARN: Illegal instructions before constructor call */
    public ActionBarOnDestinationChangedListener(AppCompatActivity activity, AppBarConfiguration configuration) {
        AbstractC9133u.m16133g(activity, "activity");
        AbstractC9133u.m16133g(configuration, "configuration");
        ActionBarDrawerToggle.Delegate drawerToggleDelegate = activity.getDrawerToggleDelegate();
        if (drawerToggleDelegate != null) {
            Context actionBarThemedContext = drawerToggleDelegate.getActionBarThemedContext();
            AbstractC9133u.m16132f(actionBarThemedContext, "getActionBarThemedContext(...)");
            super(actionBarThemedContext, configuration);
            this.activity = activity;
            return;
        }
        throw new IllegalStateException(("Activity " + activity + " does not have a DrawerToggleDelegate set").toString());
    }

    @Override // androidx.navigation.p017ui.AbstractAppBarOnDestinationChangedListener
    public void setNavigationIcon(Drawable drawable, @StringRes int i10) {
        ActionBar supportActionBar = this.activity.getSupportActionBar();
        if (supportActionBar == null) {
            throw new IllegalStateException(("Activity " + this.activity + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        supportActionBar.setDisplayHomeAsUpEnabled(drawable != null);
        ActionBarDrawerToggle.Delegate drawerToggleDelegate = this.activity.getDrawerToggleDelegate();
        if (drawerToggleDelegate != null) {
            drawerToggleDelegate.setActionBarUpIndicator(drawable, i10);
            return;
        }
        throw new IllegalStateException(("Activity " + this.activity + " does not have a DrawerToggleDelegate set").toString());
    }

    @Override // androidx.navigation.p017ui.AbstractAppBarOnDestinationChangedListener
    public void setTitle(CharSequence charSequence) {
        ActionBar supportActionBar = this.activity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle(charSequence);
            return;
        }
        throw new IllegalStateException(("Activity " + this.activity + " does not have an ActionBar set via setSupportActionBar()").toString());
    }
}
