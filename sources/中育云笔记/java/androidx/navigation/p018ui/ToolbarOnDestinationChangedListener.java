package androidx.navigation.p018ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.transition.TransitionManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class ToolbarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    private final WeakReference<Toolbar> toolbarWeakReference;

    /* JADX WARN: Illegal instructions before constructor call */
    public ToolbarOnDestinationChangedListener(Toolbar toolbar, AppBarConfiguration configuration) {
        AbstractC9979u.m20294g(toolbar, "toolbar");
        AbstractC9979u.m20294g(configuration, "configuration");
        Context context = toolbar.getContext();
        AbstractC9979u.m20293f(context, "getContext(...)");
        super(context, configuration);
        this.toolbarWeakReference = new WeakReference<>(toolbar);
    }

    @Override // androidx.navigation.p018ui.AbstractAppBarOnDestinationChangedListener, androidx.navigation.NavController.OnDestinationChangedListener
    public void onDestinationChanged(NavController controller, NavDestination destination, Bundle bundle) {
        AbstractC9979u.m20294g(controller, "controller");
        AbstractC9979u.m20294g(destination, "destination");
        if (this.toolbarWeakReference.get() == null) {
            controller.removeOnDestinationChangedListener(this);
        } else {
            super.onDestinationChanged(controller, destination, bundle);
        }
    }

    @Override // androidx.navigation.p018ui.AbstractAppBarOnDestinationChangedListener
    public void setNavigationIcon(Drawable drawable, @StringRes int i10) {
        Toolbar toolbar = this.toolbarWeakReference.get();
        if (toolbar != null) {
            boolean z10 = drawable == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(i10);
            if (z10) {
                TransitionManager.beginDelayedTransition(toolbar);
            }
        }
    }

    @Override // androidx.navigation.p018ui.AbstractAppBarOnDestinationChangedListener
    public void setTitle(CharSequence charSequence) {
        Toolbar toolbar = this.toolbarWeakReference.get();
        if (toolbar != null) {
            toolbar.setTitle(charSequence);
        }
    }
}
