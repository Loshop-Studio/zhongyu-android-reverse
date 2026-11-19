package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.GlobalPositionAwareModifierNode;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class OnGloballyPositionedNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    private InterfaceC9540l callback;

    public OnGloballyPositionedNode(InterfaceC9540l interfaceC9540l) {
        this.callback = interfaceC9540l;
    }

    public final InterfaceC9540l getCallback() {
        return this.callback;
    }

    @Override // androidx.compose.p014ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }

    public final void setCallback(InterfaceC9540l interfaceC9540l) {
        this.callback = interfaceC9540l;
    }
}
