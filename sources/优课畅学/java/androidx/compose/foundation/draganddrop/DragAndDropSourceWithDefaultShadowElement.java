package androidx.compose.foundation.draganddrop;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class DragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement<DragSourceNodeWithDefaultPainter> {
    private InterfaceC10574p detectDragStart;
    private InterfaceC10570l transferData;

    public DragAndDropSourceWithDefaultShadowElement(InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l) {
        this.detectDragStart = interfaceC10574p;
        this.transferData = interfaceC10570l;
    }

    public static /* synthetic */ DragAndDropSourceWithDefaultShadowElement copy$default(DragAndDropSourceWithDefaultShadowElement dragAndDropSourceWithDefaultShadowElement, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10574p = dragAndDropSourceWithDefaultShadowElement.detectDragStart;
        }
        if ((i10 & 2) != 0) {
            interfaceC10570l = dragAndDropSourceWithDefaultShadowElement.transferData;
        }
        return dragAndDropSourceWithDefaultShadowElement.copy(interfaceC10574p, interfaceC10570l);
    }

    public final InterfaceC10574p component1() {
        return this.detectDragStart;
    }

    public final InterfaceC10570l component2() {
        return this.transferData;
    }

    public final DragAndDropSourceWithDefaultShadowElement copy(InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l) {
        return new DragAndDropSourceWithDefaultShadowElement(interfaceC10574p, interfaceC10570l);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceWithDefaultShadowElement)) {
            return false;
        }
        DragAndDropSourceWithDefaultShadowElement dragAndDropSourceWithDefaultShadowElement = (DragAndDropSourceWithDefaultShadowElement) obj;
        return AbstractC9133u.m16128b(this.detectDragStart, dragAndDropSourceWithDefaultShadowElement.detectDragStart) && AbstractC9133u.m16128b(this.transferData, dragAndDropSourceWithDefaultShadowElement.transferData);
    }

    public final InterfaceC10574p getDetectDragStart() {
        return this.detectDragStart;
    }

    public final InterfaceC10570l getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.detectDragStart.hashCode() * 31) + this.transferData.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSourceWithDefaultPainter");
        inspectorInfo.getProperties().set("detectDragStart", this.detectDragStart);
        inspectorInfo.getProperties().set("transferData", this.transferData);
    }

    public final void setDetectDragStart(InterfaceC10574p interfaceC10574p) {
        this.detectDragStart = interfaceC10574p;
    }

    public final void setTransferData(InterfaceC10570l interfaceC10570l) {
        this.transferData = interfaceC10570l;
    }

    public String toString() {
        return "DragAndDropSourceWithDefaultShadowElement(detectDragStart=" + this.detectDragStart + ", transferData=" + this.transferData + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public DragSourceNodeWithDefaultPainter create() {
        return new DragSourceNodeWithDefaultPainter(this.detectDragStart, this.transferData);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        dragSourceNodeWithDefaultPainter.setDetectDragStart(this.detectDragStart);
        dragSourceNodeWithDefaultPainter.setTransferData(this.transferData);
    }
}
