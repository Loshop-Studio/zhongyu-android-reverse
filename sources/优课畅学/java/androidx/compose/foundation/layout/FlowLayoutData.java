package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FlowLayoutData {
    public static final int $stable = 8;
    private float fillCrossAxisFraction;

    public FlowLayoutData(float f10) {
        this.fillCrossAxisFraction = f10;
    }

    public static /* synthetic */ FlowLayoutData copy$default(FlowLayoutData flowLayoutData, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = flowLayoutData.fillCrossAxisFraction;
        }
        return flowLayoutData.copy(f10);
    }

    public final float component1() {
        return this.fillCrossAxisFraction;
    }

    public final FlowLayoutData copy(float f10) {
        return new FlowLayoutData(f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlowLayoutData) && Float.compare(this.fillCrossAxisFraction, ((FlowLayoutData) obj).fillCrossAxisFraction) == 0;
    }

    public final float getFillCrossAxisFraction() {
        return this.fillCrossAxisFraction;
    }

    public int hashCode() {
        return Float.hashCode(this.fillCrossAxisFraction);
    }

    public final void setFillCrossAxisFraction(float f10) {
        this.fillCrossAxisFraction = f10;
    }

    public String toString() {
        return "FlowLayoutData(fillCrossAxisFraction=" + this.fillCrossAxisFraction + ')';
    }
}
