package androidx.compose.foundation;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class FocusedBoundsObserverElement extends ModifierNodeElement<FocusedBoundsObserverNode> {
    private final InterfaceC9540l onPositioned;

    public FocusedBoundsObserverElement(InterfaceC9540l interfaceC9540l) {
        this.onPositioned = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        FocusedBoundsObserverElement focusedBoundsObserverElement = obj instanceof FocusedBoundsObserverElement ? (FocusedBoundsObserverElement) obj : null;
        return focusedBoundsObserverElement != null && this.onPositioned == focusedBoundsObserverElement.onPositioned;
    }

    public final InterfaceC9540l getOnPositioned() {
        return this.onPositioned;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onPositioned.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusedBoundsChanged");
        inspectorInfo.getProperties().set("onPositioned", this.onPositioned);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public FocusedBoundsObserverNode create() {
        return new FocusedBoundsObserverNode(this.onPositioned);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(FocusedBoundsObserverNode focusedBoundsObserverNode) {
        focusedBoundsObserverNode.setOnPositioned(this.onPositioned);
    }
}
