package androidx.compose.p009ui.focus;

import androidx.compose.p009ui.node.DelegatableNodeKt;
import androidx.compose.p009ui.node.LayoutNode;
import androidx.compose.p009ui.node.NodeCoordinator;
import androidx.compose.p009ui.node.Owner;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m7880d2 = {"focusTransactionManager", "Landroidx/compose/ui/focus/FocusTransactionManager;", "Landroidx/compose/ui/focus/FocusTargetNode;", "getFocusTransactionManager", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;", "invalidateFocusTarget", "", "requireTransactionManager", "ui_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class FocusTargetNodeKt {
    public static final FocusTransactionManager getFocusTransactionManager(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        Owner owner;
        FocusOwner focusOwner;
        NodeCoordinator coordinator = focusTargetNode.getNode().getCoordinator();
        if (coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null || (focusOwner = owner.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.getFocusTransactionManager();
    }

    public static final void invalidateFocusTarget(FocusTargetNode focusTargetNode) {
        DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().scheduleInvalidation(focusTargetNode);
    }

    public static final FocusTransactionManager requireTransactionManager(FocusTargetNode focusTargetNode) {
        return DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getFocusTransactionManager();
    }
}
