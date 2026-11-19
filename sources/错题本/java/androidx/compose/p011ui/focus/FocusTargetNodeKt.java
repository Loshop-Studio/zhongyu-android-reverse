package androidx.compose.p011ui.focus;

import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.NodeCoordinator;
import androidx.compose.p011ui.node.Owner;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003¨\u0006\t"}, m5110d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusTransactionManager;", "requireTransactionManager", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;", "Ld6/s;", "invalidateFocusTarget", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "getFocusTransactionManager", "focusTransactionManager", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FocusTargetNodeKt {
    @Nullable
    public static final FocusTransactionManager getFocusTransactionManager(@NotNull FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        Owner owner;
        FocusOwner focusOwner;
        NodeCoordinator coordinator = focusTargetNode.getNode().getCoordinator();
        if (coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null || (focusOwner = owner.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.getFocusTransactionManager();
    }

    public static final void invalidateFocusTarget(@NotNull FocusTargetNode focusTargetNode) {
        DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().scheduleInvalidation(focusTargetNode);
    }

    @NotNull
    public static final FocusTransactionManager requireTransactionManager(@NotNull FocusTargetNode focusTargetNode) {
        return DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getFocusTransactionManager();
    }
}
