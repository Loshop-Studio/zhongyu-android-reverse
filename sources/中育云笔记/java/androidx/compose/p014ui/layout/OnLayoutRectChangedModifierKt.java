package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.LayoutNodeKt;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class OnLayoutRectChangedModifierKt {
    @Stable
    public static final Modifier onLayoutRectChanged(Modifier modifier, long j10, long j11, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new OnLayoutRectChangedElement(j10, j11, interfaceC9540l));
    }

    public static /* synthetic */ Modifier onLayoutRectChanged$default(Modifier modifier, long j10, long j11, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = 64;
        }
        return onLayoutRectChanged(modifier, j12, j11, interfaceC9540l);
    }

    public static final DelegatableNode.RegistrationHandle registerOnLayoutRectChanged(DelegatableNode delegatableNode, long j10, long j11, InterfaceC9540l interfaceC9540l) {
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().registerOnRectChangedCallback(layoutNodeRequireLayoutNode.getSemanticsId(), j10, j11, delegatableNode, interfaceC9540l);
    }
}
