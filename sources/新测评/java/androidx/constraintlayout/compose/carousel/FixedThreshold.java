package androidx.constraintlayout.compose.carousel;

import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
@Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0006\u001a\u00020\u0003HÂ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, m13558d2 = {"Landroidx/constraintlayout/compose/carousel/FixedThreshold;", "Landroidx/constraintlayout/compose/carousel/ThresholdConfig;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/Dp;", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "component1", "component1-D9Ej5fM", "()F", "copy", "copy-0680j_4", "(F)Landroidx/constraintlayout/compose/carousel/FixedThreshold;", "equals", "", "other", "", "hashCode", "", "toString", "", "computeThreshold", "", "Landroidx/compose/ui/unit/Density;", "fromValue", "toValue", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FixedThreshold implements ThresholdConfig {
    public static final int $stable = 0;
    private final float offset;

    public /* synthetic */ FixedThreshold(float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    private final float getOffset() {
        return this.offset;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ FixedThreshold m24039copy0680j_4$default(FixedThreshold fixedThreshold, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = fixedThreshold.offset;
        }
        return fixedThreshold.m24040copy0680j_4(f10);
    }

    @Override // androidx.constraintlayout.compose.carousel.ThresholdConfig
    public float computeThreshold(Density density, float f10, float f11) {
        return f10 + (density.mo17332toPx0680j_4(this.offset) * Math.signum(f11 - f10));
    }

    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final FixedThreshold m24040copy0680j_4(float offset) {
        return new FixedThreshold(offset, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FixedThreshold) && C3127Dp.m23566equalsimpl0(this.offset, ((FixedThreshold) other).offset);
    }

    public int hashCode() {
        return C3127Dp.m23567hashCodeimpl(this.offset);
    }

    public String toString() {
        return "FixedThreshold(offset=" + ((Object) C3127Dp.m23572toStringimpl(this.offset)) + ')';
    }

    private FixedThreshold(float f10) {
        this.offset = f10;
    }
}
