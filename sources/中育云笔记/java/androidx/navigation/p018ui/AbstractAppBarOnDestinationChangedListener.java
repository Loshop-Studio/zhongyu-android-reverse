package androidx.navigation.p018ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.StringRes;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.customview.widget.Openable;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.AbstractC10776g;

/* loaded from: classes3.dex */
public abstract class AbstractAppBarOnDestinationChangedListener implements NavController.OnDestinationChangedListener {
    private ValueAnimator animator;
    private DrawerArrowDrawable arrowDrawable;
    private final AppBarConfiguration configuration;
    private final Context context;
    private final WeakReference<Openable> openableLayoutWeakReference;

    public AbstractAppBarOnDestinationChangedListener(Context context, AppBarConfiguration configuration) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(configuration, "configuration");
        this.context = context;
        this.configuration = configuration;
        Openable openableLayout = configuration.getOpenableLayout();
        this.openableLayoutWeakReference = openableLayout != null ? new WeakReference<>(openableLayout) : null;
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    private final void setActionBarUpIndicator(boolean z10) {
        Pair pairM22975a;
        DrawerArrowDrawable drawerArrowDrawable = this.arrowDrawable;
        if (drawerArrowDrawable == null || (pairM22975a = AbstractC10776g.m22975a(drawerArrowDrawable, Boolean.TRUE)) == null) {
            DrawerArrowDrawable drawerArrowDrawable2 = new DrawerArrowDrawable(this.context);
            this.arrowDrawable = drawerArrowDrawable2;
            pairM22975a = AbstractC10776g.m22975a(drawerArrowDrawable2, Boolean.FALSE);
        }
        DrawerArrowDrawable drawerArrowDrawable3 = (DrawerArrowDrawable) pairM22975a.m20048a();
        boolean zBooleanValue = ((Boolean) pairM22975a.m20049c()).booleanValue();
        setNavigationIcon(drawerArrowDrawable3, z10 ? C4195R.string.nav_app_bar_open_drawer_description : C4195R.string.nav_app_bar_navigate_up_description);
        float f10 = z10 ? 0.0f : 1.0f;
        if (!zBooleanValue) {
            drawerArrowDrawable3.setProgress(f10);
            return;
        }
        float progress = drawerArrowDrawable3.getProgress();
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(drawerArrowDrawable3, "progress", progress, f10);
        this.animator = objectAnimatorOfFloat;
        AbstractC9979u.m20292e(objectAnimatorOfFloat, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        objectAnimatorOfFloat.start();
    }

    @Override // androidx.navigation.NavController.OnDestinationChangedListener
    public void onDestinationChanged(NavController controller, NavDestination destination, Bundle bundle) {
        AbstractC9979u.m20294g(controller, "controller");
        AbstractC9979u.m20294g(destination, "destination");
        if (destination instanceof FloatingWindow) {
            return;
        }
        WeakReference<Openable> weakReference = this.openableLayoutWeakReference;
        Openable openable = weakReference != null ? weakReference.get() : null;
        if (this.openableLayoutWeakReference != null && openable == null) {
            controller.removeOnDestinationChangedListener(this);
            return;
        }
        String strFillInLabel = destination.fillInLabel(this.context, bundle);
        if (strFillInLabel != null) {
            setTitle(strFillInLabel);
        }
        boolean zIsTopLevelDestination = this.configuration.isTopLevelDestination(destination);
        boolean z10 = false;
        if (openable == null && zIsTopLevelDestination) {
            setNavigationIcon(null, 0);
            return;
        }
        if (openable != null && zIsTopLevelDestination) {
            z10 = true;
        }
        setActionBarUpIndicator(z10);
    }

    public abstract void setNavigationIcon(Drawable drawable, @StringRes int i10);

    public abstract void setTitle(CharSequence charSequence);
}
