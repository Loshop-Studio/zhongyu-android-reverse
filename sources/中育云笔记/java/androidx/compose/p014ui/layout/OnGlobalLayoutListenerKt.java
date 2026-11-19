package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.LayoutNodeKt;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class OnGlobalLayoutListenerKt {
    public static final DelegatableNode.RegistrationHandle registerOnGlobalLayoutListener(DelegatableNode delegatableNode, long j10, long j11, InterfaceC9540l interfaceC9540l) {
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().registerOnGlobalLayoutCallback(layoutNodeRequireLayoutNode.getSemanticsId(), j10, j11, delegatableNode.getNode(), interfaceC9540l);
    }
}
