package androidx.compose.p014ui.input.key;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class KeyInputElement extends ModifierNodeElement<KeyInputNode> {
    private final InterfaceC9540l onKeyEvent;
    private final InterfaceC9540l onPreKeyEvent;

    public KeyInputElement(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        this.onKeyEvent = interfaceC9540l;
        this.onPreKeyEvent = interfaceC9540l2;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
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

    public final InterfaceC9540l getOnKeyEvent() {
        return this.onKeyEvent;
    }

    public final InterfaceC9540l getOnPreKeyEvent() {
        return this.onPreKeyEvent;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        InterfaceC9540l interfaceC9540l = this.onKeyEvent;
        int iHashCode = (interfaceC9540l != null ? interfaceC9540l.hashCode() : 0) * 31;
        InterfaceC9540l interfaceC9540l2 = this.onPreKeyEvent;
        return iHashCode + (interfaceC9540l2 != null ? interfaceC9540l2.hashCode() : 0);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        InterfaceC9540l interfaceC9540l = this.onKeyEvent;
        if (interfaceC9540l != null) {
            inspectorInfo.setName("onKeyEvent");
            inspectorInfo.getProperties().set("onKeyEvent", interfaceC9540l);
        }
        InterfaceC9540l interfaceC9540l2 = this.onPreKeyEvent;
        if (interfaceC9540l2 != null) {
            inspectorInfo.setName("onPreviewKeyEvent");
            inspectorInfo.getProperties().set("onPreviewKeyEvent", interfaceC9540l2);
        }
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public KeyInputNode create() {
        return new KeyInputNode(this.onKeyEvent, this.onPreKeyEvent);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(KeyInputNode keyInputNode) {
        keyInputNode.setOnEvent(this.onKeyEvent);
        keyInputNode.setOnPreEvent(this.onPreKeyEvent);
    }
}
