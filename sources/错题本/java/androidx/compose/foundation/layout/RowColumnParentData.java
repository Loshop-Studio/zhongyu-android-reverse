package androidx.compose.foundation.layout;

import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, m5110d2 = {"Landroidx/compose/foundation/layout/RowColumnParentData;", "", "weight", "", "fill", "", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "flowLayoutData", "Landroidx/compose/foundation/layout/FlowLayoutData;", "(FZLandroidx/compose/foundation/layout/CrossAxisAlignment;Landroidx/compose/foundation/layout/FlowLayoutData;)V", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "setCrossAxisAlignment", "(Landroidx/compose/foundation/layout/CrossAxisAlignment;)V", "getFill", "()Z", "setFill", "(Z)V", "getFlowLayoutData", "()Landroidx/compose/foundation/layout/FlowLayoutData;", "setFlowLayoutData", "(Landroidx/compose/foundation/layout/FlowLayoutData;)V", "getWeight", "()F", "setWeight", "(F)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class RowColumnParentData {
    public static final int $stable = 8;

    @Nullable
    private CrossAxisAlignment crossAxisAlignment;
    private boolean fill;

    @Nullable
    private FlowLayoutData flowLayoutData;
    private float weight;

    public RowColumnParentData() {
        this(0.0f, false, null, null, 15, null);
    }

    public static /* synthetic */ RowColumnParentData copy$default(RowColumnParentData rowColumnParentData, float f, boolean z8, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rowColumnParentData.weight;
        }
        if ((i & 2) != 0) {
            z8 = rowColumnParentData.fill;
        }
        if ((i & 4) != 0) {
            crossAxisAlignment = rowColumnParentData.crossAxisAlignment;
        }
        if ((i & 8) != 0) {
            flowLayoutData = rowColumnParentData.flowLayoutData;
        }
        return rowColumnParentData.copy(f, z8, crossAxisAlignment, flowLayoutData);
    }

    /* renamed from: component1, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFill() {
        return this.fill;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final FlowLayoutData getFlowLayoutData() {
        return this.flowLayoutData;
    }

    @NotNull
    public final RowColumnParentData copy(float weight, boolean fill, @Nullable CrossAxisAlignment crossAxisAlignment, @Nullable FlowLayoutData flowLayoutData) {
        return new RowColumnParentData(weight, fill, crossAxisAlignment, flowLayoutData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) other;
        return Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && AbstractC5830k.m5325b(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment) && AbstractC5830k.m5325b(this.flowLayoutData, rowColumnParentData.flowLayoutData);
    }

    @Nullable
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final boolean getFill() {
        return this.fill;
    }

    @Nullable
    public final FlowLayoutData getFlowLayoutData() {
        return this.flowLayoutData;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iM908i = AbstractC0584a.m908i(this.fill, Float.hashCode(this.weight) * 31, 31);
        CrossAxisAlignment crossAxisAlignment = this.crossAxisAlignment;
        int iHashCode = (iM908i + (crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode())) * 31;
        FlowLayoutData flowLayoutData = this.flowLayoutData;
        return iHashCode + (flowLayoutData != null ? flowLayoutData.hashCode() : 0);
    }

    public final void setCrossAxisAlignment(@Nullable CrossAxisAlignment crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public final void setFill(boolean z8) {
        this.fill = z8;
    }

    public final void setFlowLayoutData(@Nullable FlowLayoutData flowLayoutData) {
        this.flowLayoutData = flowLayoutData;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    @NotNull
    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ", flowLayoutData=" + this.flowLayoutData + ')';
    }

    public RowColumnParentData(float f, boolean z8, @Nullable CrossAxisAlignment crossAxisAlignment, @Nullable FlowLayoutData flowLayoutData) {
        this.weight = f;
        this.fill = z8;
        this.crossAxisAlignment = crossAxisAlignment;
        this.flowLayoutData = flowLayoutData;
    }

    public /* synthetic */ RowColumnParentData(float f, boolean z8, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? true : z8, (i & 4) != 0 ? null : crossAxisAlignment, (i & 8) != 0 ? null : flowLayoutData);
    }
}
