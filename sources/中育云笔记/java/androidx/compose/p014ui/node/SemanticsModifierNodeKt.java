package androidx.compose.p014ui.node;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.semantics.SemanticsActions;
import androidx.compose.p014ui.semantics.SemanticsConfiguration;
import androidx.compose.p014ui.semantics.SemanticsConfigurationKt;

/* loaded from: classes2.dex */
public final class SemanticsModifierNodeKt {
    public static final boolean getUseMinimumTouchTarget(SemanticsConfiguration semanticsConfiguration) {
        return SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    public static final void invalidateSemantics(SemanticsModifierNode semanticsModifierNode) {
        DelegatableNodeKt.requireLayoutNode(semanticsModifierNode).invalidateSemantics$ui_release();
    }

    public static final Rect touchBoundsInRoot(Modifier.Node node, boolean z10) {
        return !node.getNode().isAttached() ? Rect.Companion.getZero() : !z10 ? LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.m32356requireCoordinator64DMado(node, NodeKind.m32510constructorimpl(8))) : DelegatableNodeKt.m32356requireCoordinator64DMado(node, NodeKind.m32510constructorimpl(8)).touchBoundsInRoot();
    }
}
