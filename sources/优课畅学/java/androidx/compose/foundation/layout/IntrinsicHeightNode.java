package androidx.compose.foundation.layout;

import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.unit.Constraints;

/* loaded from: classes.dex */
final class IntrinsicHeightNode extends IntrinsicSizeModifier {
    private boolean enforceIncoming;
    private IntrinsicSize height;

    public IntrinsicHeightNode(IntrinsicSize intrinsicSize, boolean z10) {
        this.height = intrinsicSize;
        this.enforceIncoming = z10;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* renamed from: calculateContentConstraints-l58MMJ0, reason: not valid java name */
    public long mo20809calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j10) {
        int iMinIntrinsicHeight = this.height == IntrinsicSize.Min ? measurable.minIntrinsicHeight(Constraints.m26852getMaxWidthimpl(j10)) : measurable.maxIntrinsicHeight(Constraints.m26852getMaxWidthimpl(j10));
        if (iMinIntrinsicHeight < 0) {
            iMinIntrinsicHeight = 0;
        }
        return Constraints.Companion.m26863fixedHeightOenEA2s(iMinIntrinsicHeight);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public final IntrinsicSize getHeight() {
        return this.height;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return this.height == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicHeight(i10) : intrinsicMeasurable.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return this.height == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicHeight(i10) : intrinsicMeasurable.maxIntrinsicHeight(i10);
    }

    public void setEnforceIncoming(boolean z10) {
        this.enforceIncoming = z10;
    }

    public final void setHeight(IntrinsicSize intrinsicSize) {
        this.height = intrinsicSize;
    }
}
