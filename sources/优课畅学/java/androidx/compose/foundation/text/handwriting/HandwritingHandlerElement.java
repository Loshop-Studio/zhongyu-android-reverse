package androidx.compose.foundation.text.handwriting;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;

/* loaded from: classes.dex */
final class HandwritingHandlerElement extends ModifierNodeElement<HandwritingHandlerNode> {
    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj instanceof HandwritingHandlerElement;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return 0;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("handwritingHandler");
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(HandwritingHandlerNode handwritingHandlerNode) {
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public HandwritingHandlerNode create() {
        return new HandwritingHandlerNode();
    }
}
