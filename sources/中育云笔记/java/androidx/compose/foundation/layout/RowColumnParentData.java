package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RowColumnParentData {
    public static final int $stable = 8;
    private CrossAxisAlignment crossAxisAlignment;
    private boolean fill;
    private FlowLayoutData flowLayoutData;
    private float weight;

    public RowColumnParentData() {
        this(0.0f, false, null, null, 15, null);
    }

    public static /* synthetic */ RowColumnParentData copy$default(RowColumnParentData rowColumnParentData, float f10, boolean z10, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = rowColumnParentData.weight;
        }
        if ((i10 & 2) != 0) {
            z10 = rowColumnParentData.fill;
        }
        if ((i10 & 4) != 0) {
            crossAxisAlignment = rowColumnParentData.crossAxisAlignment;
        }
        if ((i10 & 8) != 0) {
            flowLayoutData = rowColumnParentData.flowLayoutData;
        }
        return rowColumnParentData.copy(f10, z10, crossAxisAlignment, flowLayoutData);
    }

    public final float component1() {
        return this.weight;
    }

    public final boolean component2() {
        return this.fill;
    }

    public final CrossAxisAlignment component3() {
        return this.crossAxisAlignment;
    }

    public final FlowLayoutData component4() {
        return this.flowLayoutData;
    }

    public final RowColumnParentData copy(float f10, boolean z10, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData) {
        return new RowColumnParentData(f10, z10, crossAxisAlignment, flowLayoutData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) obj;
        return Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && AbstractC9979u.m20289b(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment) && AbstractC9979u.m20289b(this.flowLayoutData, rowColumnParentData.flowLayoutData);
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final FlowLayoutData getFlowLayoutData() {
        return this.flowLayoutData;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.weight) * 31) + Boolean.hashCode(this.fill)) * 31;
        CrossAxisAlignment crossAxisAlignment = this.crossAxisAlignment;
        int iHashCode2 = (iHashCode + (crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode())) * 31;
        FlowLayoutData flowLayoutData = this.flowLayoutData;
        return iHashCode2 + (flowLayoutData != null ? flowLayoutData.hashCode() : 0);
    }

    public final void setCrossAxisAlignment(CrossAxisAlignment crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public final void setFill(boolean z10) {
        this.fill = z10;
    }

    public final void setFlowLayoutData(FlowLayoutData flowLayoutData) {
        this.flowLayoutData = flowLayoutData;
    }

    public final void setWeight(float f10) {
        this.weight = f10;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ", flowLayoutData=" + this.flowLayoutData + ')';
    }

    public RowColumnParentData(float f10, boolean z10, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData) {
        this.weight = f10;
        this.fill = z10;
        this.crossAxisAlignment = crossAxisAlignment;
        this.flowLayoutData = flowLayoutData;
    }

    public /* synthetic */ RowColumnParentData(float f10, boolean z10, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : crossAxisAlignment, (i10 & 8) != 0 ? null : flowLayoutData);
    }
}
