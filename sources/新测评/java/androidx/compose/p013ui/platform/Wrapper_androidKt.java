package androidx.compose.p013ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p013ui.C2579R;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.UiApplier;
import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0002¢\u0006\u0002\u0010\u0010\u001a,\u0010\u0011\u001a\u00020\u0007*\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH\u0000¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m13558d2 = {"DefaultLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "createApplier", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/node/LayoutNode;", "container", "doSetContent", "Landroidx/compose/runtime/Composition;", "owner", "Landroidx/compose/ui/platform/AndroidComposeView;", "parent", "Landroidx/compose/runtime/CompositionContext;", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "setContent", "Landroidx/compose/ui/platform/AbstractComposeView;", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class Wrapper_androidKt {
    private static final ViewGroup.LayoutParams DefaultLayoutParams = new ViewGroup.LayoutParams(-2, -2);

    public static final AbstractApplier<LayoutNode> createApplier(LayoutNode layoutNode) {
        return new UiApplier(layoutNode);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private static final Composition doSetContent(AndroidComposeView androidComposeView, CompositionContext compositionContext, Function2<? super Composer, ? super Integer, Unit> function2) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            int i10 = C2579R.id.inspection_slot_table_set;
            if (androidComposeView.getTag(i10) == null) {
                androidComposeView.setTag(i10, Collections.newSetFromMap(new WeakHashMap()));
            }
        }
        View view = androidComposeView.getView();
        int i11 = C2579R.id.wrapped_composition_tag;
        Object tag = view.getTag(i11);
        WrappedComposition wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, CompositionKt.Composition(new UiApplier(androidComposeView.getRoot()), compositionContext));
            androidComposeView.getView().setTag(i11, wrappedComposition);
        }
        wrappedComposition.setContent(function2);
        if (!Intrinsics.areEqual(androidComposeView.getCoroutineContext(), compositionContext.getEffectCoroutineContext())) {
            androidComposeView.setCoroutineContext(compositionContext.getEffectCoroutineContext());
        }
        return wrappedComposition;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final Composition setContent(AbstractComposeView abstractComposeView, CompositionContext compositionContext, Function2<? super Composer, ? super Integer, Unit> function2) {
        GlobalSnapshotManager.INSTANCE.ensureStarted();
        AndroidComposeView androidComposeView = null;
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), compositionContext.getEffectCoroutineContext());
            abstractComposeView.addView(androidComposeView.getView(), DefaultLayoutParams);
        }
        return doSetContent(androidComposeView, compositionContext, function2);
    }
}
