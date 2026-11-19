package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class LegacyDragAndDropSourceElement extends ModifierNodeElement<LegacyDragAndDropSourceNode> {
    private final InterfaceC9544p dragAndDropSourceHandler;
    private final InterfaceC9540l drawDragDecoration;

    public LegacyDragAndDropSourceElement(InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p) {
        this.drawDragDecoration = interfaceC9540l;
        this.dragAndDropSourceHandler = interfaceC9544p;
    }

    public static /* synthetic */ LegacyDragAndDropSourceElement copy$default(LegacyDragAndDropSourceElement legacyDragAndDropSourceElement, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = legacyDragAndDropSourceElement.drawDragDecoration;
        }
        if ((i10 & 2) != 0) {
            interfaceC9544p = legacyDragAndDropSourceElement.dragAndDropSourceHandler;
        }
        return legacyDragAndDropSourceElement.copy(interfaceC9540l, interfaceC9544p);
    }

    public final InterfaceC9540l component1() {
        return this.drawDragDecoration;
    }

    public final InterfaceC9544p component2() {
        return this.dragAndDropSourceHandler;
    }

    public final LegacyDragAndDropSourceElement copy(InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p) {
        return new LegacyDragAndDropSourceElement(interfaceC9540l, interfaceC9544p);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyDragAndDropSourceElement)) {
            return false;
        }
        LegacyDragAndDropSourceElement legacyDragAndDropSourceElement = (LegacyDragAndDropSourceElement) obj;
        return AbstractC9979u.m20289b(this.drawDragDecoration, legacyDragAndDropSourceElement.drawDragDecoration) && AbstractC9979u.m20289b(this.dragAndDropSourceHandler, legacyDragAndDropSourceElement.dragAndDropSourceHandler);
    }

    public final InterfaceC9544p getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public final InterfaceC9540l getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.drawDragDecoration.hashCode() * 31) + this.dragAndDropSourceHandler.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSource");
        inspectorInfo.getProperties().set("drawDragDecoration", this.drawDragDecoration);
        inspectorInfo.getProperties().set("dragAndDropSourceHandler", this.dragAndDropSourceHandler);
    }

    public String toString() {
        return "LegacyDragAndDropSourceElement(drawDragDecoration=" + this.drawDragDecoration + ", dragAndDropSourceHandler=" + this.dragAndDropSourceHandler + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public LegacyDragAndDropSourceNode create() {
        return new LegacyDragAndDropSourceNode(this.drawDragDecoration, this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(LegacyDragAndDropSourceNode legacyDragAndDropSourceNode) {
        legacyDragAndDropSourceNode.setDrawDragDecoration(this.drawDragDecoration);
        legacyDragAndDropSourceNode.setDragAndDropSourceHandler(this.dragAndDropSourceHandler);
    }
}
