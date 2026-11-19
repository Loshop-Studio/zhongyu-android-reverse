package androidx.compose.foundation.draganddrop;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class DragAndDropSourceElement extends ModifierNodeElement<DragAndDropSourceNode> {
    private final InterfaceC10574p detectDragStart;
    private final InterfaceC10570l drawDragDecoration;
    private final InterfaceC10570l transferData;

    public DragAndDropSourceElement(InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l2) {
        this.drawDragDecoration = interfaceC10570l;
        this.detectDragStart = interfaceC10574p;
        this.transferData = interfaceC10570l2;
    }

    public static /* synthetic */ DragAndDropSourceElement copy$default(DragAndDropSourceElement dragAndDropSourceElement, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = dragAndDropSourceElement.drawDragDecoration;
        }
        if ((i10 & 2) != 0) {
            interfaceC10574p = dragAndDropSourceElement.detectDragStart;
        }
        if ((i10 & 4) != 0) {
            interfaceC10570l2 = dragAndDropSourceElement.transferData;
        }
        return dragAndDropSourceElement.copy(interfaceC10570l, interfaceC10574p, interfaceC10570l2);
    }

    public final InterfaceC10570l component1() {
        return this.drawDragDecoration;
    }

    public final InterfaceC10574p component2() {
        return this.detectDragStart;
    }

    public final InterfaceC10570l component3() {
        return this.transferData;
    }

    public final DragAndDropSourceElement copy(InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l2) {
        return new DragAndDropSourceElement(interfaceC10570l, interfaceC10574p, interfaceC10570l2);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceElement)) {
            return false;
        }
        DragAndDropSourceElement dragAndDropSourceElement = (DragAndDropSourceElement) obj;
        return AbstractC9133u.m16128b(this.drawDragDecoration, dragAndDropSourceElement.drawDragDecoration) && AbstractC9133u.m16128b(this.detectDragStart, dragAndDropSourceElement.detectDragStart) && AbstractC9133u.m16128b(this.transferData, dragAndDropSourceElement.transferData);
    }

    public final InterfaceC10574p getDetectDragStart() {
        return this.detectDragStart;
    }

    public final InterfaceC10570l getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    public final InterfaceC10570l getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.drawDragDecoration.hashCode() * 31) + this.detectDragStart.hashCode()) * 31) + this.transferData.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSource");
        inspectorInfo.getProperties().set("drawDragDecoration", this.drawDragDecoration);
        inspectorInfo.getProperties().set("detectDragStart", this.detectDragStart);
        inspectorInfo.getProperties().set("transferData", this.transferData);
    }

    public String toString() {
        return "DragAndDropSourceElement(drawDragDecoration=" + this.drawDragDecoration + ", detectDragStart=" + this.detectDragStart + ", transferData=" + this.transferData + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public DragAndDropSourceNode create() {
        return new DragAndDropSourceNode(this.drawDragDecoration, this.detectDragStart, this.transferData);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(DragAndDropSourceNode dragAndDropSourceNode) {
        dragAndDropSourceNode.setDrawDragDecoration(this.drawDragDecoration);
        dragAndDropSourceNode.setDetectDragStart(this.detectDragStart);
        dragAndDropSourceNode.setTransferData(this.transferData);
    }
}
