package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.GlobalPositionAwareModifierNode;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class OnGloballyPositionedNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    private InterfaceC10570l callback;

    public OnGloballyPositionedNode(InterfaceC10570l interfaceC10570l) {
        this.callback = interfaceC10570l;
    }

    public final InterfaceC10570l getCallback() {
        return this.callback;
    }

    @Override // androidx.compose.p013ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }

    public final void setCallback(InterfaceC10570l interfaceC10570l) {
        this.callback = interfaceC10570l;
    }
}
