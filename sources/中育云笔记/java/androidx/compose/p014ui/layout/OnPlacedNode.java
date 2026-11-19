package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.LayoutAwareModifierNode;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class OnPlacedNode extends Modifier.Node implements LayoutAwareModifierNode {
    private InterfaceC9540l callback;

    public OnPlacedNode(InterfaceC9540l interfaceC9540l) {
        this.callback = interfaceC9540l;
    }

    public final InterfaceC9540l getCallback() {
        return this.callback;
    }

    @Override // androidx.compose.p014ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }

    public final void setCallback(InterfaceC9540l interfaceC9540l) {
        this.callback = interfaceC9540l;
    }
}
