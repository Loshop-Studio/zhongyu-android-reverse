package androidx.compose.foundation;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class FocusedBoundsObserverElement extends ModifierNodeElement<FocusedBoundsObserverNode> {
    private final InterfaceC10570l onPositioned;

    public FocusedBoundsObserverElement(InterfaceC10570l interfaceC10570l) {
        this.onPositioned = interfaceC10570l;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        FocusedBoundsObserverElement focusedBoundsObserverElement = obj instanceof FocusedBoundsObserverElement ? (FocusedBoundsObserverElement) obj : null;
        return focusedBoundsObserverElement != null && this.onPositioned == focusedBoundsObserverElement.onPositioned;
    }

    public final InterfaceC10570l getOnPositioned() {
        return this.onPositioned;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onPositioned.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusedBoundsChanged");
        inspectorInfo.getProperties().set("onPositioned", this.onPositioned);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public FocusedBoundsObserverNode create() {
        return new FocusedBoundsObserverNode(this.onPositioned);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(FocusedBoundsObserverNode focusedBoundsObserverNode) {
        focusedBoundsObserverNode.setOnPositioned(this.onPositioned);
    }
}
