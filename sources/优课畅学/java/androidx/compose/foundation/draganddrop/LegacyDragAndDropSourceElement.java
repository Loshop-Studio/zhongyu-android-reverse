package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class LegacyDragAndDropSourceElement extends ModifierNodeElement<LegacyDragAndDropSourceNode> {
    private final InterfaceC10574p dragAndDropSourceHandler;
    private final InterfaceC10570l drawDragDecoration;

    public LegacyDragAndDropSourceElement(InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p) {
        this.drawDragDecoration = interfaceC10570l;
        this.dragAndDropSourceHandler = interfaceC10574p;
    }

    public static /* synthetic */ LegacyDragAndDropSourceElement copy$default(LegacyDragAndDropSourceElement legacyDragAndDropSourceElement, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = legacyDragAndDropSourceElement.drawDragDecoration;
        }
        if ((i10 & 2) != 0) {
            interfaceC10574p = legacyDragAndDropSourceElement.dragAndDropSourceHandler;
        }
        return legacyDragAndDropSourceElement.copy(interfaceC10570l, interfaceC10574p);
    }

    public final InterfaceC10570l component1() {
        return this.drawDragDecoration;
    }

    public final InterfaceC10574p component2() {
        return this.dragAndDropSourceHandler;
    }

    public final LegacyDragAndDropSourceElement copy(InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p) {
        return new LegacyDragAndDropSourceElement(interfaceC10570l, interfaceC10574p);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyDragAndDropSourceElement)) {
            return false;
        }
        LegacyDragAndDropSourceElement legacyDragAndDropSourceElement = (LegacyDragAndDropSourceElement) obj;
        return AbstractC9133u.m16128b(this.drawDragDecoration, legacyDragAndDropSourceElement.drawDragDecoration) && AbstractC9133u.m16128b(this.dragAndDropSourceHandler, legacyDragAndDropSourceElement.dragAndDropSourceHandler);
    }

    public final InterfaceC10574p getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public final InterfaceC10570l getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.drawDragDecoration.hashCode() * 31) + this.dragAndDropSourceHandler.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSource");
        inspectorInfo.getProperties().set("drawDragDecoration", this.drawDragDecoration);
        inspectorInfo.getProperties().set("dragAndDropSourceHandler", this.dragAndDropSourceHandler);
    }

    public String toString() {
        return "LegacyDragAndDropSourceElement(drawDragDecoration=" + this.drawDragDecoration + ", dragAndDropSourceHandler=" + this.dragAndDropSourceHandler + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public LegacyDragAndDropSourceNode create() {
        return new LegacyDragAndDropSourceNode(this.drawDragDecoration, this.dragAndDropSourceHandler);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(LegacyDragAndDropSourceNode legacyDragAndDropSourceNode) {
        legacyDragAndDropSourceNode.setDrawDragDecoration(this.drawDragDecoration);
        legacyDragAndDropSourceNode.setDragAndDropSourceHandler(this.dragAndDropSourceHandler);
    }
}
