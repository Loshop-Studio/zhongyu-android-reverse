package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class OnSizeChangedModifier extends ModifierNodeElement<OnSizeChangedNode> {
    private final InterfaceC9540l onSizeChanged;

    public OnSizeChangedModifier(InterfaceC9540l interfaceC9540l) {
        this.onSizeChanged = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnSizeChangedModifier) && this.onSizeChanged == ((OnSizeChangedModifier) obj).onSizeChanged;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onSizeChanged.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onSizeChanged");
        inspectorInfo.getProperties().set("onSizeChanged", this.onSizeChanged);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public OnSizeChangedNode create() {
        return new OnSizeChangedNode(this.onSizeChanged);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(OnSizeChangedNode onSizeChangedNode) {
        onSizeChangedNode.update(this.onSizeChanged);
    }
}
