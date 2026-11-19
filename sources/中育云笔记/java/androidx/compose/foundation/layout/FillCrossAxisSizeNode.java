package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.ParentDataModifierNode;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FillCrossAxisSizeNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 8;
    private float fraction;

    public FillCrossAxisSizeNode(float f10) {
        this.fraction = f10;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final void setFraction(float f10) {
        this.fraction = f10;
    }

    @Override // androidx.compose.p014ui.node.ParentDataModifierNode
    public RowColumnParentData modifyParentData(Density density, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        FlowLayoutData flowLayoutData = rowColumnParentData.getFlowLayoutData();
        if (flowLayoutData == null) {
            flowLayoutData = new FlowLayoutData(this.fraction);
        }
        rowColumnParentData.setFlowLayoutData(flowLayoutData);
        FlowLayoutData flowLayoutData2 = rowColumnParentData.getFlowLayoutData();
        AbstractC9979u.m20291d(flowLayoutData2);
        flowLayoutData2.setFillCrossAxisFraction(this.fraction);
        return rowColumnParentData;
    }
}
