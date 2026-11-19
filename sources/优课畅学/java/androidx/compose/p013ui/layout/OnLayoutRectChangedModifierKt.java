package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.LayoutNodeKt;
import androidx.compose.runtime.Stable;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class OnLayoutRectChangedModifierKt {
    @Stable
    public static final Modifier onLayoutRectChanged(Modifier modifier, long j10, long j11, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new OnLayoutRectChangedElement(j10, j11, interfaceC10570l));
    }

    public static /* synthetic */ Modifier onLayoutRectChanged$default(Modifier modifier, long j10, long j11, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = 64;
        }
        return onLayoutRectChanged(modifier, j12, j11, interfaceC10570l);
    }

    public static final DelegatableNode.RegistrationHandle registerOnLayoutRectChanged(DelegatableNode delegatableNode, long j10, long j11, InterfaceC10570l interfaceC10570l) {
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().registerOnRectChangedCallback(layoutNodeRequireLayoutNode.getSemanticsId(), j10, j11, delegatableNode, interfaceC10570l);
    }
}
