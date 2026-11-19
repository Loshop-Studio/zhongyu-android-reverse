package androidx.compose.p014ui.semantics;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.SemanticsModifierNode;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class CoreSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean isClearingSemantics;
    private boolean mergeDescendants;
    private InterfaceC9540l properties;

    public CoreSemanticsModifierNode(boolean z10, boolean z11, InterfaceC9540l interfaceC9540l) {
        this.mergeDescendants = z10;
        this.isClearingSemantics = z11;
        this.properties = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.properties.invoke(semanticsPropertyReceiver);
    }

    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    public final InterfaceC9540l getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public boolean getShouldClearDescendantSemantics() {
        return this.isClearingSemantics;
    }

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return this.mergeDescendants;
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final void setClearingSemantics(boolean z10) {
        this.isClearingSemantics = z10;
    }

    public final void setMergeDescendants(boolean z10) {
        this.mergeDescendants = z10;
    }

    public final void setProperties(InterfaceC9540l interfaceC9540l) {
        this.properties = interfaceC9540l;
    }
}
