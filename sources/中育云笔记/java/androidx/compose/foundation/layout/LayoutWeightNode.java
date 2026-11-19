package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.ParentDataModifierNode;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LayoutWeightNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 8;
    private boolean fill;
    private float weight;

    public LayoutWeightNode(float f10, boolean z10) {
        this.weight = f10;
        this.fill = z10;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final void setFill(boolean z10) {
        this.fill = z10;
    }

    public final void setWeight(float f10) {
        this.weight = f10;
    }

    @Override // androidx.compose.p014ui.node.ParentDataModifierNode
    public RowColumnParentData modifyParentData(Density density, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        rowColumnParentData.setWeight(this.weight);
        rowColumnParentData.setFill(this.fill);
        return rowColumnParentData;
    }
}
