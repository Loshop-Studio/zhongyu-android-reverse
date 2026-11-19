package androidx.compose.foundation;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;

/* loaded from: classes.dex */
final class FocusGroupElement extends ModifierNodeElement<FocusGroupNode> {
    public static final FocusGroupElement INSTANCE = new FocusGroupElement();

    private FocusGroupElement() {
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return -1063782265;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusGroup");
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(FocusGroupNode focusGroupNode) {
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public FocusGroupNode create() {
        return new FocusGroupNode();
    }
}
