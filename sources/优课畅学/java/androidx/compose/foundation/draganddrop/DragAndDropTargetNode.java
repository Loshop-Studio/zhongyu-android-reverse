package androidx.compose.foundation.draganddrop;

import androidx.compose.p013ui.draganddrop.DragAndDropEvent;
import androidx.compose.p013ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p013ui.draganddrop.DragAndDropTarget;
import androidx.compose.p013ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.p013ui.node.DelegatingNode;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class DragAndDropTargetNode extends DelegatingNode {
    private DragAndDropTargetModifierNode dragAndDropNode;
    private InterfaceC10570l shouldStartDragAndDrop;
    private DragAndDropTarget target;

    public DragAndDropTargetNode(InterfaceC10570l interfaceC10570l, DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = interfaceC10570l;
        this.target = dragAndDropTarget;
    }

    private final void createAndAttachDragAndDropModifierNode() {
        this.dragAndDropNode = (DragAndDropTargetModifierNode) delegate(DragAndDropNodeKt.DragAndDropTargetModifierNode(new InterfaceC10570l() { // from class: androidx.compose.foundation.draganddrop.DragAndDropTargetNode.createAndAttachDragAndDropModifierNode.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(DragAndDropEvent dragAndDropEvent) {
                return (Boolean) DragAndDropTargetNode.this.shouldStartDragAndDrop.invoke(dragAndDropEvent);
            }
        }, this.target));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        createAndAttachDragAndDropModifierNode();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.dragAndDropNode;
        AbstractC9133u.m16130d(dragAndDropTargetModifierNode);
        undelegate(dragAndDropTargetModifierNode);
    }

    public final void update(InterfaceC10570l interfaceC10570l, DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = interfaceC10570l;
        if (AbstractC9133u.m16128b(dragAndDropTarget, this.target)) {
            return;
        }
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.dragAndDropNode;
        if (dragAndDropTargetModifierNode != null) {
            undelegate(dragAndDropTargetModifierNode);
        }
        this.target = dragAndDropTarget;
        createAndAttachDragAndDropModifierNode();
    }
}
