package android.view.compose;

import android.R;
import android.view.C6892ViewTreeLifecycleOwner;
import android.view.C6893ViewTreeViewModelStoreOwner;
import android.view.C6895ViewTreeSavedStateRegistryOwner;
import android.view.ComponentActivity;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.CompositionContext;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m5110d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lr6/e;)V", "setOwners", "(Landroidx/activity/ComponentActivity;)V", "Landroid/view/ViewGroup$LayoutParams;", "DefaultActivityContentLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "activity-compose_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ComponentActivityKt {

    @NotNull
    private static final ViewGroup.LayoutParams DefaultActivityContentLayoutParams = new ViewGroup.LayoutParams(-2, -2);

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void setContent(@NotNull ComponentActivity componentActivity, @Nullable CompositionContext compositionContext, @NotNull InterfaceC6473e interfaceC6473e) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(compositionContext);
            composeView.setContent(interfaceC6473e);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(compositionContext);
        composeView2.setContent(interfaceC6473e);
        setOwners(componentActivity);
        componentActivity.setContentView(composeView2, DefaultActivityContentLayoutParams);
    }

    public static /* synthetic */ void setContent$default(ComponentActivity componentActivity, CompositionContext compositionContext, InterfaceC6473e interfaceC6473e, int i, Object obj) {
        if ((i & 1) != 0) {
            compositionContext = null;
        }
        setContent(componentActivity, compositionContext, interfaceC6473e);
    }

    private static final void setOwners(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        if (C6892ViewTreeLifecycleOwner.get(decorView) == null) {
            C6892ViewTreeLifecycleOwner.set(decorView, componentActivity);
        }
        if (C6893ViewTreeViewModelStoreOwner.get(decorView) == null) {
            C6893ViewTreeViewModelStoreOwner.set(decorView, componentActivity);
        }
        if (C6895ViewTreeSavedStateRegistryOwner.get(decorView) == null) {
            C6895ViewTreeSavedStateRegistryOwner.set(decorView, componentActivity);
        }
    }
}
