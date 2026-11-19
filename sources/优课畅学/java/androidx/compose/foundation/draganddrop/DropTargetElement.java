package androidx.compose.foundation.draganddrop;

import androidx.compose.p013ui.draganddrop.DragAndDropTarget;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class DropTargetElement extends ModifierNodeElement<DragAndDropTargetNode> {
    private final InterfaceC10570l shouldStartDragAndDrop;
    private final DragAndDropTarget target;

    public DropTargetElement(InterfaceC10570l interfaceC10570l, DragAndDropTarget dragAndDropTarget) {
        this.shouldStartDragAndDrop = interfaceC10570l;
        this.target = dragAndDropTarget;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropTargetElement)) {
            return false;
        }
        DropTargetElement dropTargetElement = (DropTargetElement) obj;
        return AbstractC9133u.m16128b(this.target, dropTargetElement.target) && this.shouldStartDragAndDrop == dropTargetElement.shouldStartDragAndDrop;
    }

    public final InterfaceC10570l getShouldStartDragAndDrop() {
        return this.shouldStartDragAndDrop;
    }

    public final DragAndDropTarget getTarget() {
        return this.target;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.target.hashCode() * 31) + this.shouldStartDragAndDrop.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dropTarget");
        inspectorInfo.getProperties().set(TypedValues.AttributesType.S_TARGET, this.target);
        inspectorInfo.getProperties().set("shouldStartDragAndDrop", this.shouldStartDragAndDrop);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public DragAndDropTargetNode create() {
        return new DragAndDropTargetNode(this.shouldStartDragAndDrop, this.target);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(DragAndDropTargetNode dragAndDropTargetNode) {
        dragAndDropTargetNode.update(this.shouldStartDragAndDrop, this.target);
    }
}
