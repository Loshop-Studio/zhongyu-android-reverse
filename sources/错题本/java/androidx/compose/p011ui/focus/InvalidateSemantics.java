package androidx.compose.p011ui.focus;

import androidx.compose.p011ui.node.SemanticsModifierNode;
import androidx.compose.p011ui.node.SemanticsModifierNodeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m5110d2 = {"Landroidx/compose/ui/focus/InvalidateSemantics;", "", "<init>", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "focusTargetNode", "Ld6/s;", "onDispatchEventsCompleted", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class InvalidateSemantics {

    @NotNull
    public static final InvalidateSemantics INSTANCE = new InvalidateSemantics();

    private InvalidateSemantics() {
    }

    public final void onDispatchEventsCompleted(@NotNull FocusTargetNode focusTargetNode) {
        Object node = focusTargetNode.getNode();
        SemanticsModifierNode semanticsModifierNode = node instanceof SemanticsModifierNode ? (SemanticsModifierNode) node : null;
        if (semanticsModifierNode != null) {
            SemanticsModifierNodeKt.invalidateSemantics(semanticsModifierNode);
        }
    }
}
