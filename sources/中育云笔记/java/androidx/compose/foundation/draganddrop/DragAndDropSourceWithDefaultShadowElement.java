package androidx.compose.foundation.draganddrop;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes.dex */
final class DragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement<DragSourceNodeWithDefaultPainter> {
    private InterfaceC9544p detectDragStart;
    private InterfaceC9540l transferData;

    public DragAndDropSourceWithDefaultShadowElement(InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l) {
        this.detectDragStart = interfaceC9544p;
        this.transferData = interfaceC9540l;
    }

    public static /* synthetic */ DragAndDropSourceWithDefaultShadowElement copy$default(DragAndDropSourceWithDefaultShadowElement dragAndDropSourceWithDefaultShadowElement, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9544p = dragAndDropSourceWithDefaultShadowElement.detectDragStart;
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l = dragAndDropSourceWithDefaultShadowElement.transferData;
        }
        return dragAndDropSourceWithDefaultShadowElement.copy(interfaceC9544p, interfaceC9540l);
    }

    public final InterfaceC9544p component1() {
        return this.detectDragStart;
    }

    public final InterfaceC9540l component2() {
        return this.transferData;
    }

    public final DragAndDropSourceWithDefaultShadowElement copy(InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l) {
        return new DragAndDropSourceWithDefaultShadowElement(interfaceC9544p, interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceWithDefaultShadowElement)) {
            return false;
        }
        DragAndDropSourceWithDefaultShadowElement dragAndDropSourceWithDefaultShadowElement = (DragAndDropSourceWithDefaultShadowElement) obj;
        return AbstractC9979u.m20289b(this.detectDragStart, dragAndDropSourceWithDefaultShadowElement.detectDragStart) && AbstractC9979u.m20289b(this.transferData, dragAndDropSourceWithDefaultShadowElement.transferData);
    }

    public final InterfaceC9544p getDetectDragStart() {
        return this.detectDragStart;
    }

    public final InterfaceC9540l getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.detectDragStart.hashCode() * 31) + this.transferData.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSourceWithDefaultPainter");
        inspectorInfo.getProperties().set("detectDragStart", this.detectDragStart);
        inspectorInfo.getProperties().set("transferData", this.transferData);
    }

    public final void setDetectDragStart(InterfaceC9544p interfaceC9544p) {
        this.detectDragStart = interfaceC9544p;
    }

    public final void setTransferData(InterfaceC9540l interfaceC9540l) {
        this.transferData = interfaceC9540l;
    }

    public String toString() {
        return "DragAndDropSourceWithDefaultShadowElement(detectDragStart=" + this.detectDragStart + ", transferData=" + this.transferData + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public DragSourceNodeWithDefaultPainter create() {
        return new DragSourceNodeWithDefaultPainter(this.detectDragStart, this.transferData);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        dragSourceNodeWithDefaultPainter.setDetectDragStart(this.detectDragStart);
        dragSourceNodeWithDefaultPainter.setTransferData(this.transferData);
    }
}
