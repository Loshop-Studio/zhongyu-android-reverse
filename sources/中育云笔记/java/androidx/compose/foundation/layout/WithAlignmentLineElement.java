package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedNode;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class WithAlignmentLineElement extends ModifierNodeElement<SiblingsAlignedNode.WithAlignmentLineNode> {
    public static final int $stable = 0;
    private final AlignmentLine alignmentLine;

    public WithAlignmentLineElement(AlignmentLine alignmentLine) {
        this.alignmentLine = alignmentLine;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineElement withAlignmentLineElement = obj instanceof WithAlignmentLineElement ? (WithAlignmentLineElement) obj : null;
        if (withAlignmentLineElement == null) {
            return false;
        }
        return AbstractC9979u.m20289b(this.alignmentLine, withAlignmentLineElement.alignmentLine);
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.alignmentLine.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("alignBy");
        inspectorInfo.setValue(this.alignmentLine);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public SiblingsAlignedNode.WithAlignmentLineNode create() {
        return new SiblingsAlignedNode.WithAlignmentLineNode(this.alignmentLine);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(SiblingsAlignedNode.WithAlignmentLineNode withAlignmentLineNode) {
        withAlignmentLineNode.setAlignmentLine(this.alignmentLine);
    }
}
