package androidx.compose.foundation.draganddrop;

import androidx.compose.p014ui.draganddrop.DragAndDropTarget;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class DropTargetElement extends ModifierNodeElement<DragAndDropTargetNode> {
    private final InterfaceC9540l shouldStartDragAndDrop;
    private final DragAndDropTarget target;

    public DropTargetElement(InterfaceC9540l interfaceC9540l, DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = interfaceC9540l;
        this.target = dragAndDropTarget;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropTargetElement)) {
            return false;
        }
        DropTargetElement dropTargetElement = (DropTargetElement) obj;
        return AbstractC9979u.m20289b(this.target, dropTargetElement.target) && this.shouldStartDragAndDrop == dropTargetElement.shouldStartDragAndDrop;
    }

    public final InterfaceC9540l getShouldStartDragAndDrop() {
        return this.shouldStartDragAndDrop;
    }

    public final DragAndDropTarget getTarget() {
        return this.target;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.target.hashCode() * 31) + this.shouldStartDragAndDrop.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dropTarget");
        inspectorInfo.getProperties().set("target", this.target);
        inspectorInfo.getProperties().set("shouldStartDragAndDrop", this.shouldStartDragAndDrop);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public DragAndDropTargetNode create() {
        return new DragAndDropTargetNode(this.shouldStartDragAndDrop, this.target);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(DragAndDropTargetNode dragAndDropTargetNode) {
        dragAndDropTargetNode.update(this.shouldStartDragAndDrop, this.target);
    }
}
