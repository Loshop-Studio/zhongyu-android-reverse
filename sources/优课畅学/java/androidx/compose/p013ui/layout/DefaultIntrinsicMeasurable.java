package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DefaultIntrinsicMeasurable implements Measurable {
    public static final int $stable = 8;
    private final IntrinsicMeasurable measurable;
    private final IntrinsicMinMax minMax;
    private final IntrinsicWidthHeight widthHeight;

    public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.measurable = intrinsicMeasurable;
        this.minMax = intrinsicMinMax;
        this.widthHeight = intrinsicWidthHeight;
    }

    public final IntrinsicMeasurable getMeasurable() {
        return this.measurable;
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.measurable.getParentData();
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i10) {
        return this.measurable.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i10) {
        return this.measurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p013ui.layout.Measurable
    /* renamed from: measure-BRTryo0, reason: not valid java name */
    public Placeable mo25627measureBRTryo0(long j10) {
        if (this.widthHeight == IntrinsicWidthHeight.Width) {
            return new FixedSizeIntrinsicsPlaceable(this.minMax == IntrinsicMinMax.Max ? this.measurable.maxIntrinsicWidth(Constraints.m26851getMaxHeightimpl(j10)) : this.measurable.minIntrinsicWidth(Constraints.m26851getMaxHeightimpl(j10)), Constraints.m26847getHasBoundedHeightimpl(j10) ? Constraints.m26851getMaxHeightimpl(j10) : 32767);
        }
        return new FixedSizeIntrinsicsPlaceable(Constraints.m26848getHasBoundedWidthimpl(j10) ? Constraints.m26852getMaxWidthimpl(j10) : 32767, this.minMax == IntrinsicMinMax.Max ? this.measurable.maxIntrinsicHeight(Constraints.m26852getMaxWidthimpl(j10)) : this.measurable.minIntrinsicHeight(Constraints.m26852getMaxWidthimpl(j10)));
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i10) {
        return this.measurable.minIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i10) {
        return this.measurable.minIntrinsicWidth(i10);
    }
}
