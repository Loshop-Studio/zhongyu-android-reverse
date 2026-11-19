package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.ParentDataModifierNode;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class HorizontalAlignNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 8;
    private Alignment.Horizontal horizontal;

    public HorizontalAlignNode(Alignment.Horizontal horizontal) {
        this.horizontal = horizontal;
    }

    public final Alignment.Horizontal getHorizontal() {
        return this.horizontal;
    }

    public final void setHorizontal(Alignment.Horizontal horizontal) {
        this.horizontal = horizontal;
    }

    @Override // androidx.compose.p014ui.node.ParentDataModifierNode
    public RowColumnParentData modifyParentData(Density density, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.horizontal$foundation_layout_release(this.horizontal));
        return rowColumnParentData;
    }
}
