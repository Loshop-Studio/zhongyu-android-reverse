package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.LayoutAwareModifierNode;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class OnPlacedNode extends Modifier.Node implements LayoutAwareModifierNode {
    private InterfaceC10570l callback;

    public OnPlacedNode(InterfaceC10570l interfaceC10570l) {
        this.callback = interfaceC10570l;
    }

    public final InterfaceC10570l getCallback() {
        return this.callback;
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }

    public final void setCallback(InterfaceC10570l interfaceC10570l) {
        this.callback = interfaceC10570l;
    }
}
