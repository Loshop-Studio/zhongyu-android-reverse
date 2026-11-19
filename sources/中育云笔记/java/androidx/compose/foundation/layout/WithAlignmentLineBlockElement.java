package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedNode;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class WithAlignmentLineBlockElement extends ModifierNodeElement<SiblingsAlignedNode.WithAlignmentLineBlockNode> {
    public static final int $stable = 0;
    private final InterfaceC9540l block;

    public WithAlignmentLineBlockElement(InterfaceC9540l interfaceC9540l) {
        this.block = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineBlockElement withAlignmentLineBlockElement = obj instanceof WithAlignmentLineBlockElement ? (WithAlignmentLineBlockElement) obj : null;
        return withAlignmentLineBlockElement != null && this.block == withAlignmentLineBlockElement.block;
    }

    public final InterfaceC9540l getBlock() {
        return this.block;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("alignBy");
        inspectorInfo.setValue(this.block);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public SiblingsAlignedNode.WithAlignmentLineBlockNode create() {
        return new SiblingsAlignedNode.WithAlignmentLineBlockNode(this.block);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(SiblingsAlignedNode.WithAlignmentLineBlockNode withAlignmentLineBlockNode) {
        withAlignmentLineBlockNode.setBlock(this.block);
    }
}
