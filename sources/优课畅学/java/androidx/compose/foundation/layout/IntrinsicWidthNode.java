package androidx.compose.foundation.layout;

import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.unit.Constraints;

/* loaded from: classes.dex */
final class IntrinsicWidthNode extends IntrinsicSizeModifier {
    private boolean enforceIncoming;
    private IntrinsicSize width;

    public IntrinsicWidthNode(IntrinsicSize intrinsicSize, boolean z10) {
        this.width = intrinsicSize;
        this.enforceIncoming = z10;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* renamed from: calculateContentConstraints-l58MMJ0 */
    public long mo20809calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j10) {
        int iMinIntrinsicWidth = this.width == IntrinsicSize.Min ? measurable.minIntrinsicWidth(Constraints.m26851getMaxHeightimpl(j10)) : measurable.maxIntrinsicWidth(Constraints.m26851getMaxHeightimpl(j10));
        if (iMinIntrinsicWidth < 0) {
            iMinIntrinsicWidth = 0;
        }
        return Constraints.Companion.m26864fixedWidthOenEA2s(iMinIntrinsicWidth);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public final IntrinsicSize getWidth() {
        return this.width;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return this.width == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicWidth(i10) : intrinsicMeasurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return this.width == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicWidth(i10) : intrinsicMeasurable.maxIntrinsicWidth(i10);
    }

    public void setEnforceIncoming(boolean z10) {
        this.enforceIncoming = z10;
    }

    public final void setWidth(IntrinsicSize intrinsicSize) {
        this.width = intrinsicSize;
    }
}
