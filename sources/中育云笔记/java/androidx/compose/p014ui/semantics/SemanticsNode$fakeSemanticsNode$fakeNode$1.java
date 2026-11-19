package androidx.compose.p014ui.semantics;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.SemanticsModifierNode;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class SemanticsNode$fakeSemanticsNode$fakeNode$1 extends Modifier.Node implements SemanticsModifierNode {
    final /* synthetic */ InterfaceC9540l $properties;

    public SemanticsNode$fakeSemanticsNode$fakeNode$1(InterfaceC9540l interfaceC9540l) {
        this.$properties = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.$properties.invoke(semanticsPropertyReceiver);
    }
}
