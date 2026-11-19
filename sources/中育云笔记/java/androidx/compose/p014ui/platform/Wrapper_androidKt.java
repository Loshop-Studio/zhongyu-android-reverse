package androidx.compose.p014ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p014ui.C2638R;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.UiApplier;
import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

/* loaded from: classes2.dex */
public final class Wrapper_androidKt {
    private static final ViewGroup.LayoutParams DefaultLayoutParams = new ViewGroup.LayoutParams(-2, -2);

    public static final AbstractApplier<LayoutNode> createApplier(LayoutNode layoutNode) {
        return new UiApplier(layoutNode);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private static final Composition doSetContent(AndroidComposeView androidComposeView, CompositionContext compositionContext, InterfaceC9544p interfaceC9544p) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() && androidComposeView.getTag(C2638R.id.inspection_slot_table_set) == null) {
            androidComposeView.setTag(C2638R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
        }
        Object tag = androidComposeView.getView().getTag(C2638R.id.wrapped_composition_tag);
        WrappedComposition wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, CompositionKt.Composition(new UiApplier(androidComposeView.getRoot()), compositionContext));
            androidComposeView.getView().setTag(C2638R.id.wrapped_composition_tag, wrappedComposition);
        }
        wrappedComposition.setContent(interfaceC9544p);
        if (!AbstractC9979u.m20289b(androidComposeView.getCoroutineContext(), compositionContext.getEffectCoroutineContext())) {
            androidComposeView.setCoroutineContext(compositionContext.getEffectCoroutineContext());
        }
        return wrappedComposition;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final Composition setContent(AbstractComposeView abstractComposeView, CompositionContext compositionContext, InterfaceC9544p interfaceC9544p) {
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
        return doSetContent(androidComposeView, compositionContext, interfaceC9544p);
    }
}
