package androidx.compose.p014ui.viewinterop;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;

/* loaded from: classes2.dex */
final class FocusGroupPropertiesElement extends ModifierNodeElement<FocusGroupPropertiesNode> {
    public static final FocusGroupPropertiesElement INSTANCE = new FocusGroupPropertiesElement();

    private FocusGroupPropertiesElement() {
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return -1929324230;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("FocusGroupProperties");
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(FocusGroupPropertiesNode focusGroupPropertiesNode) {
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public FocusGroupPropertiesNode create() {
        return new FocusGroupPropertiesNode();
    }
}
