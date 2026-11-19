package androidx.compose.foundation.content;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ReceiveContentElement extends ModifierNodeElement<ReceiveContentNode> {
    public static final int $stable = 0;
    private final ReceiveContentListener receiveContentListener;

    public ReceiveContentElement(ReceiveContentListener receiveContentListener) {
        this.receiveContentListener = receiveContentListener;
    }

    public static /* synthetic */ ReceiveContentElement copy$default(ReceiveContentElement receiveContentElement, ReceiveContentListener receiveContentListener, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            receiveContentListener = receiveContentElement.receiveContentListener;
        }
        return receiveContentElement.copy(receiveContentListener);
    }

    public final ReceiveContentListener component1() {
        return this.receiveContentListener;
    }

    public final ReceiveContentElement copy(ReceiveContentListener receiveContentListener) {
        return new ReceiveContentElement(receiveContentListener);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReceiveContentElement) && AbstractC9133u.m16128b(this.receiveContentListener, ((ReceiveContentElement) obj).receiveContentListener);
    }

    public final ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return this.receiveContentListener.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("receiveContent");
    }

    public String toString() {
        return "ReceiveContentElement(receiveContentListener=" + this.receiveContentListener + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public ReceiveContentNode create() {
        return new ReceiveContentNode(this.receiveContentListener);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(ReceiveContentNode receiveContentNode) {
        receiveContentNode.updateNode(this.receiveContentListener);
    }
}
