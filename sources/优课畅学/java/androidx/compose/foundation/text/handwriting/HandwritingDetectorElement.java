package androidx.compose.foundation.text.handwriting;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
final class HandwritingDetectorElement extends ModifierNodeElement<HandwritingDetectorNode> {
    private final InterfaceC10559a callback;

    public HandwritingDetectorElement(InterfaceC10559a interfaceC10559a) {
        this.callback = interfaceC10559a;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        boolean z10 = false;
        boolean z11 = this == obj;
        if ((obj instanceof HandwritingDetectorElement) && this.callback == ((HandwritingDetectorElement) obj).callback) {
            z10 = true;
        }
        return z11 | z10;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return this.callback.hashCode() * 31;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("handwritingDetector");
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public HandwritingDetectorNode create() {
        return new HandwritingDetectorNode(this.callback);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(HandwritingDetectorNode handwritingDetectorNode) {
        handwritingDetectorNode.setCallback(this.callback);
    }
}
