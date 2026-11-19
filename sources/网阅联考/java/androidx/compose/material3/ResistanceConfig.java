package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt___RangesKt;

@Immutable
@Metadata(m5174d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0014"}, m5175d2 = {"Landroidx/compose/material3/ResistanceConfig;", "", "basis", "", "factorAtMin", "factorAtMax", "(FFF)V", "getBasis", "()F", "getFactorAtMax", "getFactorAtMin", "computeResistance", "overflow", "equals", "", "other", "hashCode", "", "toString", "", "material3_release"}, m5176k = 1, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ResistanceConfig {
    private final float basis;
    private final float factorAtMax;
    private final float factorAtMin;

    public ResistanceConfig(float f4, float f5, float f6) {
        this.basis = f4;
        this.factorAtMin = f5;
        this.factorAtMax = f6;
    }

    public final float computeResistance(float overflow) {
        float f4 = overflow < 0.0f ? this.factorAtMin : this.factorAtMax;
        if (f4 == 0.0f) {
            return 0.0f;
        }
        return (this.basis / f4) * ((float) Math.sin((RangesKt___RangesKt.coerceIn(overflow / this.basis, -1.0f, 1.0f) * 3.1415927f) / 2));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResistanceConfig)) {
            return false;
        }
        ResistanceConfig resistanceConfig = (ResistanceConfig) other;
        if (!(this.basis == resistanceConfig.basis)) {
            return false;
        }
        if (this.factorAtMin == resistanceConfig.factorAtMin) {
            return (this.factorAtMax > resistanceConfig.factorAtMax ? 1 : (this.factorAtMax == resistanceConfig.factorAtMax ? 0 : -1)) == 0;
        }
        return false;
    }

    public final float getBasis() {
        return this.basis;
    }

    public final float getFactorAtMax() {
        return this.factorAtMax;
    }

    public final float getFactorAtMin() {
        return this.factorAtMin;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.basis) * 31) + Float.floatToIntBits(this.factorAtMin)) * 31) + Float.floatToIntBits(this.factorAtMax);
    }

    public String toString() {
        return "ResistanceConfig(basis=" + this.basis + ", factorAtMin=" + this.factorAtMin + ", factorAtMax=" + this.factorAtMax + ')';
    }

    public /* synthetic */ ResistanceConfig(float f4, float f5, float f6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f4, (i4 & 2) != 0 ? 10.0f : f5, (i4 & 4) != 0 ? 10.0f : f6);
    }
}
