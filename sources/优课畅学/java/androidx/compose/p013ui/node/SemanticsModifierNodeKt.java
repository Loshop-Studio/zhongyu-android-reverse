package androidx.compose.p013ui.node;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import androidx.compose.p013ui.semantics.SemanticsActions;
import androidx.compose.p013ui.semantics.SemanticsConfiguration;
import androidx.compose.p013ui.semantics.SemanticsConfigurationKt;

/* loaded from: classes2.dex */
public final class SemanticsModifierNodeKt {
    public static final boolean getUseMinimumTouchTarget(SemanticsConfiguration semanticsConfiguration) {
        return SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    public static final void invalidateSemantics(SemanticsModifierNode semanticsModifierNode) {
        DelegatableNodeKt.requireLayoutNode(semanticsModifierNode).invalidateSemantics$ui_release();
    }

    public static final Rect touchBoundsInRoot(Modifier.Node node, boolean z10) {
        return !node.getNode().isAttached() ? Rect.Companion.getZero() : !z10 ? LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.m25754requireCoordinator64DMado(node, NodeKind.m25908constructorimpl(8))) : DelegatableNodeKt.m25754requireCoordinator64DMado(node, NodeKind.m25908constructorimpl(8)).touchBoundsInRoot();
    }
}
