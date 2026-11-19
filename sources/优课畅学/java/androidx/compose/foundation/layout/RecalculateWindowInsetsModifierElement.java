package androidx.compose.foundation.layout;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;

/* loaded from: classes.dex */
final class RecalculateWindowInsetsModifierElement extends ModifierNodeElement<RecalculateWindowInsetsModifierNode> {
    public static final RecalculateWindowInsetsModifierElement INSTANCE = new RecalculateWindowInsetsModifierElement();

    private RecalculateWindowInsetsModifierElement() {
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return 0;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("recalculateWindowInsets");
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(RecalculateWindowInsetsModifierNode recalculateWindowInsetsModifierNode) {
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public RecalculateWindowInsetsModifierNode create() {
        return new RecalculateWindowInsetsModifierNode();
    }
}
