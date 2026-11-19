package androidx.compose.p013ui.input.key;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class KeyInputElement extends ModifierNodeElement<KeyInputNode> {
    private final InterfaceC10570l onKeyEvent;
    private final InterfaceC10570l onPreKeyEvent;

    public KeyInputElement(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        this.onKeyEvent = interfaceC10570l;
        this.onPreKeyEvent = interfaceC10570l2;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.onKeyEvent == keyInputElement.onKeyEvent && this.onPreKeyEvent == keyInputElement.onPreKeyEvent;
    }

    public final InterfaceC10570l getOnKeyEvent() {
        return this.onKeyEvent;
    }

    public final InterfaceC10570l getOnPreKeyEvent() {
        return this.onPreKeyEvent;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        InterfaceC10570l interfaceC10570l = this.onKeyEvent;
        int iHashCode = (interfaceC10570l != null ? interfaceC10570l.hashCode() : 0) * 31;
        InterfaceC10570l interfaceC10570l2 = this.onPreKeyEvent;
        return iHashCode + (interfaceC10570l2 != null ? interfaceC10570l2.hashCode() : 0);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        InterfaceC10570l interfaceC10570l = this.onKeyEvent;
        if (interfaceC10570l != null) {
            inspectorInfo.setName("onKeyEvent");
            inspectorInfo.getProperties().set("onKeyEvent", interfaceC10570l);
        }
        InterfaceC10570l interfaceC10570l2 = this.onPreKeyEvent;
        if (interfaceC10570l2 != null) {
            inspectorInfo.setName("onPreviewKeyEvent");
            inspectorInfo.getProperties().set("onPreviewKeyEvent", interfaceC10570l2);
        }
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public KeyInputNode create() {
        return new KeyInputNode(this.onKeyEvent, this.onPreKeyEvent);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(KeyInputNode keyInputNode) {
        keyInputNode.setOnEvent(this.onKeyEvent);
        keyInputNode.setOnPreEvent(this.onPreKeyEvent);
    }
}
