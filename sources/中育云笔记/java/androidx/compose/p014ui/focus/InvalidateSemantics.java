package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.node.SemanticsModifierNode;
import androidx.compose.p014ui.node.SemanticsModifierNodeKt;

/* loaded from: classes2.dex */
final class InvalidateSemantics {
    public static final InvalidateSemantics INSTANCE = new InvalidateSemantics();

    private InvalidateSemantics() {
    }

    public final void onDispatchEventsCompleted(FocusTargetNode focusTargetNode) {
        Object node = focusTargetNode.getNode();
        SemanticsModifierNode semanticsModifierNode = node instanceof SemanticsModifierNode ? (SemanticsModifierNode) node : null;
        if (semanticsModifierNode != null) {
            SemanticsModifierNodeKt.invalidateSemantics(semanticsModifierNode);
        }
    }
}
