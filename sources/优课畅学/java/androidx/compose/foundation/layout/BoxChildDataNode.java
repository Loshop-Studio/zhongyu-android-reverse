package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ParentDataModifierNode;
import androidx.compose.p013ui.unit.Density;

/* loaded from: classes.dex */
final class BoxChildDataNode extends Modifier.Node implements ParentDataModifierNode {
    private Alignment alignment;
    private boolean matchParentSize;

    public BoxChildDataNode(Alignment alignment, boolean z10) {
        this.alignment = alignment;
        this.matchParentSize = z10;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    @Override // androidx.compose.p013ui.node.ParentDataModifierNode
    public BoxChildDataNode modifyParentData(Density density, Object obj) {
        return this;
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setMatchParentSize(boolean z10) {
        this.matchParentSize = z10;
    }
}
