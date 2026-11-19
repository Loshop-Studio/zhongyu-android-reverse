package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class VerticalAlignElement extends ModifierNodeElement<VerticalAlignNode> {
    public static final int $stable = 0;
    private final Alignment.Vertical alignment;

    public VerticalAlignElement(Alignment.Vertical vertical) {
        this.alignment = vertical;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return AbstractC9133u.m16128b(this.alignment, verticalAlignElement.alignment);
    }

    public final Alignment.Vertical getAlignment() {
        return this.alignment;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return this.alignment.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("align");
        inspectorInfo.setValue(this.alignment);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public VerticalAlignNode create() {
        return new VerticalAlignNode(this.alignment);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(VerticalAlignNode verticalAlignNode) {
        verticalAlignNode.setVertical(this.alignment);
    }
}
