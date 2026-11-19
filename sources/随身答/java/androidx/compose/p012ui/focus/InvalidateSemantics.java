package androidx.compose.p012ui.focus;

import androidx.compose.p012ui.node.SemanticsModifierNode;
import androidx.compose.p012ui.node.SemanticsModifierNodeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m13413d2 = {"Landroidx/compose/ui/focus/InvalidateSemantics;", "", "()V", "onDispatchEventsCompleted", "", "focusTargetNode", "Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
