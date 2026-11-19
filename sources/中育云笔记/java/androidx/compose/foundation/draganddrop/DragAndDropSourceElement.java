package androidx.compose.foundation.draganddrop;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes.dex */
final class DragAndDropSourceElement extends ModifierNodeElement<DragAndDropSourceNode> {
    private final InterfaceC9544p detectDragStart;
    private final InterfaceC9540l drawDragDecoration;
    private final InterfaceC9540l transferData;

    public DragAndDropSourceElement(InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l2) {
        this.drawDragDecoration = interfaceC9540l;
        this.detectDragStart = interfaceC9544p;
        this.transferData = interfaceC9540l2;
    }

    public static /* synthetic */ DragAndDropSourceElement copy$default(DragAndDropSourceElement dragAndDropSourceElement, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = dragAndDropSourceElement.drawDragDecoration;
        }
        if ((i10 & 2) != 0) {
            interfaceC9544p = dragAndDropSourceElement.detectDragStart;
        }
        if ((i10 & 4) != 0) {
            interfaceC9540l2 = dragAndDropSourceElement.transferData;
        }
        return dragAndDropSourceElement.copy(interfaceC9540l, interfaceC9544p, interfaceC9540l2);
    }

    public final InterfaceC9540l component1() {
        return this.drawDragDecoration;
    }

    public final InterfaceC9544p component2() {
        return this.detectDragStart;
    }

    public final InterfaceC9540l component3() {
        return this.transferData;
    }

    public final DragAndDropSourceElement copy(InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l2) {
        return new DragAndDropSourceElement(interfaceC9540l, interfaceC9544p, interfaceC9540l2);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceElement)) {
            return false;
        }
        DragAndDropSourceElement dragAndDropSourceElement = (DragAndDropSourceElement) obj;
        return AbstractC9979u.m20289b(this.drawDragDecoration, dragAndDropSourceElement.drawDragDecoration) && AbstractC9979u.m20289b(this.detectDragStart, dragAndDropSourceElement.detectDragStart) && AbstractC9979u.m20289b(this.transferData, dragAndDropSourceElement.transferData);
    }

    public final InterfaceC9544p getDetectDragStart() {
        return this.detectDragStart;
    }

    public final InterfaceC9540l getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    public final InterfaceC9540l getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.drawDragDecoration.hashCode() * 31) + this.detectDragStart.hashCode()) * 31) + this.transferData.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSource");
        inspectorInfo.getProperties().set("drawDragDecoration", this.drawDragDecoration);
        inspectorInfo.getProperties().set("detectDragStart", this.detectDragStart);
        inspectorInfo.getProperties().set("transferData", this.transferData);
    }

    public String toString() {
        return "DragAndDropSourceElement(drawDragDecoration=" + this.drawDragDecoration + ", detectDragStart=" + this.detectDragStart + ", transferData=" + this.transferData + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public DragAndDropSourceNode create() {
        return new DragAndDropSourceNode(this.drawDragDecoration, this.detectDragStart, this.transferData);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(DragAndDropSourceNode dragAndDropSourceNode) {
        dragAndDropSourceNode.setDrawDragDecoration(this.drawDragDecoration);
        dragAndDropSourceNode.setDetectDragStart(this.detectDragStart);
        dragAndDropSourceNode.setTransferData(this.transferData);
    }
}
