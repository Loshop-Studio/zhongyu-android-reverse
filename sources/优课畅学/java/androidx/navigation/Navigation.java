package androidx.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.core.app.ActivityCompat;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC9133u;
import p101f8.AbstractC8476n;
import p101f8.AbstractC8479q;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class Navigation {
    public static final Navigation INSTANCE = new Navigation();

    private Navigation() {
    }

    public static final View.OnClickListener createNavigateOnClickListener(@IdRes int i10) {
        return createNavigateOnClickListener$default(i10, null, 2, null);
    }

    public static /* synthetic */ View.OnClickListener createNavigateOnClickListener$default(int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return createNavigateOnClickListener(i10, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createNavigateOnClickListener$lambda$0(int i10, Bundle bundle, View view) {
        AbstractC9133u.m16130d(view);
        findNavController(view).navigate(i10, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createNavigateOnClickListener$lambda$1(NavDirections navDirections, View view) {
        AbstractC9133u.m16130d(view);
        findNavController(view).navigate(navDirections);
    }

    public static final NavController findNavController(Activity activity, @IdRes int i10) {
        AbstractC9133u.m16133g(activity, "activity");
        View viewRequireViewById = ActivityCompat.requireViewById(activity, i10);
        AbstractC9133u.m16132f(viewRequireViewById, "requireViewById(...)");
        NavController navControllerFindViewNavController = INSTANCE.findViewNavController(viewRequireViewById);
        if (navControllerFindViewNavController != null) {
            return navControllerFindViewNavController;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i10);
    }

    private final NavController findViewNavController(View view) {
        return (NavController) AbstractC8479q.m13853v(AbstractC8479q.m13840C(AbstractC8476n.m13833h(view, new InterfaceC10570l() { // from class: androidx.navigation.g0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return Navigation.findViewNavController$lambda$2((View) obj);
            }
        }), new InterfaceC10570l() { // from class: androidx.navigation.h0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return Navigation.findViewNavController$lambda$3((View) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findViewNavController$lambda$2(View it) {
        AbstractC9133u.m16133g(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavController findViewNavController$lambda$3(View it) {
        AbstractC9133u.m16133g(it, "it");
        return INSTANCE.getViewNavController(it);
    }

    private final NavController getViewNavController(View view) {
        Object tag = view.getTag(C4181R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    public static final void setViewNavController(View view, NavController navController) {
        AbstractC9133u.m16133g(view, "view");
        view.setTag(C4181R.id.nav_controller_view_tag, navController);
    }

    public static final View.OnClickListener createNavigateOnClickListener(@IdRes final int i10, final Bundle bundle) {
        return new View.OnClickListener() { // from class: androidx.navigation.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.createNavigateOnClickListener$lambda$0(i10, bundle, view);
            }
        };
    }

    public static final View.OnClickListener createNavigateOnClickListener(final NavDirections directions) {
        AbstractC9133u.m16133g(directions, "directions");
        return new View.OnClickListener() { // from class: androidx.navigation.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.createNavigateOnClickListener$lambda$1(directions, view);
            }
        };
    }

    public static final NavController findNavController(View view) {
        AbstractC9133u.m16133g(view, "view");
        NavController navControllerFindViewNavController = INSTANCE.findViewNavController(view);
        if (navControllerFindViewNavController != null) {
            return navControllerFindViewNavController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
