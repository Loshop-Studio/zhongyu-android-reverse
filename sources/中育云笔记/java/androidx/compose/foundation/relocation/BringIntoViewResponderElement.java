package androidx.compose.foundation.relocation;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final class BringIntoViewResponderElement extends ModifierNodeElement<BringIntoViewResponderNode> {
    private final BringIntoViewResponder responder;

    public BringIntoViewResponderElement(BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BringIntoViewResponderElement) && AbstractC9979u.m20289b(this.responder, ((BringIntoViewResponderElement) obj).responder);
        }
        return true;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.responder.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("bringIntoViewResponder");
        inspectorInfo.getProperties().set("responder", this.responder);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public BringIntoViewResponderNode create() {
        return new BringIntoViewResponderNode(this.responder);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(BringIntoViewResponderNode bringIntoViewResponderNode) {
        bringIntoViewResponderNode.setResponder(this.responder);
    }
}
