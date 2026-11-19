package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.ReusableComposition;

/* loaded from: classes2.dex */
public final class SubcompositionKt {
    public static final ReusableComposition createSubcomposition(LayoutNode layoutNode, CompositionContext compositionContext) {
        return CompositionKt.ReusableComposition(Wrapper_androidKt.createApplier(layoutNode), compositionContext);
    }
}
