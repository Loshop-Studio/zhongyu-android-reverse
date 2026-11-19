package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class OnGloballyPositionedElement extends ModifierNodeElement<OnGloballyPositionedNode> {
    private final InterfaceC9540l onGloballyPositioned;

    public OnGloballyPositionedElement(InterfaceC9540l interfaceC9540l) {
        this.onGloballyPositioned = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnGloballyPositionedElement) && this.onGloballyPositioned == ((OnGloballyPositionedElement) obj).onGloballyPositioned;
    }

    public final InterfaceC9540l getOnGloballyPositioned() {
        return this.onGloballyPositioned;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onGloballyPositioned.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onGloballyPositioned");
        inspectorInfo.getProperties().set("onGloballyPositioned", this.onGloballyPositioned);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public OnGloballyPositionedNode create() {
        return new OnGloballyPositionedNode(this.onGloballyPositioned);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(OnGloballyPositionedNode onGloballyPositionedNode) {
        onGloballyPositionedNode.setCallback(this.onGloballyPositioned);
    }
}
