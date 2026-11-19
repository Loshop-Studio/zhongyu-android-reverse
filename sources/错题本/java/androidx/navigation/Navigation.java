package androidx.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p125n7.C6237l;
import p214z6.AbstractC6833k;
import p214z6.C6827e;
import p214z6.C6828f;
import p214z6.C6837o;

@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\rJ+\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u000e\u001a\u00020\u00062\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0013\u0010\u0017J!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\r¨\u0006\u001e"}, m5110d2 = {"Landroidx/navigation/Navigation;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "viewId", "Landroidx/navigation/NavController;", "findNavController", "(Landroid/app/Activity;I)Landroidx/navigation/NavController;", "Landroid/view/View;", "view", "(Landroid/view/View;)Landroidx/navigation/NavController;", "resId", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "args", "Landroid/view/View$OnClickListener;", "createNavigateOnClickListener", "(ILandroid/os/Bundle;)Landroid/view/View$OnClickListener;", "Landroidx/navigation/NavDirections;", "directions", "(Landroidx/navigation/NavDirections;)Landroid/view/View$OnClickListener;", "controller", "Ld6/s;", "setViewNavController", "(Landroid/view/View;Landroidx/navigation/NavController;)V", "findViewNavController", "getViewNavController", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class Navigation {

    @NotNull
    public static final Navigation INSTANCE = new Navigation();

    private Navigation() {
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final View.OnClickListener createNavigateOnClickListener(@IdRes int i) {
        return createNavigateOnClickListener$default(i, null, 2, null);
    }

    public static /* synthetic */ View.OnClickListener createNavigateOnClickListener$default(int i, Bundle bundle, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            bundle = null;
        }
        return createNavigateOnClickListener(i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createNavigateOnClickListener$lambda$0(int i, Bundle bundle, View view) {
        AbstractC5830k.m5327d(view);
        findNavController(view).navigate(i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createNavigateOnClickListener$lambda$1(NavDirections navDirections, View view) {
        AbstractC5830k.m5327d(view);
        findNavController(view).navigate(navDirections);
    }

    @JvmStatic
    @NotNull
    public static final NavController findNavController(@NotNull Activity activity, @IdRes int viewId) {
        AbstractC5830k.m5330g(activity, "activity");
        View viewRequireViewById = ActivityCompat.requireViewById(activity, viewId);
        AbstractC5830k.m5329f(viewRequireViewById, "requireViewById(...)");
        NavController navControllerFindViewNavController = INSTANCE.findViewNavController(viewRequireViewById);
        if (navControllerFindViewNavController != null) {
            return navControllerFindViewNavController;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + viewId);
    }

    private final NavController findViewNavController(View view) {
        C6827e c6827e = new C6827e(new C6828f(new C6837o(AbstractC6833k.m6495v(view, new C2826a(13)), new C2826a(14), 1), false, new C6237l(29)));
        return (NavController) (!c6827e.hasNext() ? null : c6827e.next());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findViewNavController$lambda$2(View it) {
        AbstractC5830k.m5330g(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavController findViewNavController$lambda$3(View it) {
        AbstractC5830k.m5330g(it, "it");
        return INSTANCE.getViewNavController(it);
    }

    private final NavController getViewNavController(View view) {
        Object tag = view.getTag(C2825R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    @JvmStatic
    public static final void setViewNavController(@NotNull View view, @Nullable NavController controller) {
        AbstractC5830k.m5330g(view, "view");
        view.setTag(C2825R.id.nav_controller_view_tag, controller);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final View.OnClickListener createNavigateOnClickListener(@IdRes int resId, @Nullable Bundle args) {
        return new ViewOnClickListenerC2870k(resId, args);
    }

    @JvmStatic
    @NotNull
    public static final View.OnClickListener createNavigateOnClickListener(@NotNull NavDirections directions) {
        AbstractC5830k.m5330g(directions, "directions");
        return new ViewOnClickListenerC2869j(directions, 0);
    }

    @JvmStatic
    @NotNull
    public static final NavController findNavController(@NotNull View view) {
        AbstractC5830k.m5330g(view, "view");
        NavController navControllerFindViewNavController = INSTANCE.findViewNavController(view);
        if (navControllerFindViewNavController != null) {
            return navControllerFindViewNavController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
