package androidx.compose.p014ui.semantics;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.SemanticsModifierNode;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class EmptySemanticsModifier extends Modifier.Node implements SemanticsModifierNode {
    public static final int $stable = 0;

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }
}
