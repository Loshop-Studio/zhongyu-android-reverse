package androidx.compose.foundation.draganddrop;

import androidx.compose.p014ui.draganddrop.DragAndDropEvent;
import androidx.compose.p014ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.p014ui.draganddrop.DragAndDropTarget;
import androidx.compose.p014ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.p014ui.node.DelegatingNode;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class DragAndDropTargetNode extends DelegatingNode {
    private DragAndDropTargetModifierNode dragAndDropNode;
    private InterfaceC9540l shouldStartDragAndDrop;
    private DragAndDropTarget target;

    public DragAndDropTargetNode(InterfaceC9540l interfaceC9540l, DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = interfaceC9540l;
        this.target = dragAndDropTarget;
    }

    private final void createAndAttachDragAndDropModifierNode() {
        this.dragAndDropNode = (DragAndDropTargetModifierNode) delegate(DragAndDropNodeKt.DragAndDropTargetModifierNode(new InterfaceC9540l() { // from class: androidx.compose.foundation.draganddrop.DragAndDropTargetNode.createAndAttachDragAndDropModifierNode.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
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
        AbstractC9979u.m20291d(dragAndDropTargetModifierNode);
        undelegate(dragAndDropTargetModifierNode);
    }

    public final void update(InterfaceC9540l interfaceC9540l, DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = interfaceC9540l;
        if (AbstractC9979u.m20289b(dragAndDropTarget, this.target)) {
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
