package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.IntSize;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public AspectRatioNode(float f10, boolean z10) {
        this.aspectRatio = f10;
        this.matchHeightConstraintsFirst = z10;
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m27357findSizeToXhtMw(long j10) {
        if (this.matchHeightConstraintsFirst) {
            long jM27358tryMaxHeightJN0ABg = m27358tryMaxHeightJN0ABg(j10, true);
            IntSize.Companion companion = IntSize.Companion;
            if (!IntSize.m33670equalsimpl0(jM27358tryMaxHeightJN0ABg, companion.m33677getZeroYbymL2g())) {
                return jM27358tryMaxHeightJN0ABg;
            }
            long jM27359tryMaxWidthJN0ABg = m27359tryMaxWidthJN0ABg(j10, true);
            if (!IntSize.m33670equalsimpl0(jM27359tryMaxWidthJN0ABg, companion.m33677getZeroYbymL2g())) {
                return jM27359tryMaxWidthJN0ABg;
            }
            long jM27360tryMinHeightJN0ABg = m27360tryMinHeightJN0ABg(j10, true);
            if (!IntSize.m33670equalsimpl0(jM27360tryMinHeightJN0ABg, companion.m33677getZeroYbymL2g())) {
                return jM27360tryMinHeightJN0ABg;
            }
            long jM27361tryMinWidthJN0ABg = m27361tryMinWidthJN0ABg(j10, true);
            if (!IntSize.m33670equalsimpl0(jM27361tryMinWidthJN0ABg, companion.m33677getZeroYbymL2g())) {
                return jM27361tryMinWidthJN0ABg;
            }
            long jM27358tryMaxHeightJN0ABg2 = m27358tryMaxHeightJN0ABg(j10, false);
            if (!IntSize.m33670equalsimpl0(jM27358tryMaxHeightJN0ABg2, companion.m33677getZeroYbymL2g())) {
                return jM27358tryMaxHeightJN0ABg2;
            }
            long jM27359tryMaxWidthJN0ABg2 = m27359tryMaxWidthJN0ABg(j10, false);
            if (!IntSize.m33670equalsimpl0(jM27359tryMaxWidthJN0ABg2, companion.m33677getZeroYbymL2g())) {
                return jM27359tryMaxWidthJN0ABg2;
            }
            long jM27360tryMinHeightJN0ABg2 = m27360tryMinHeightJN0ABg(j10, false);
            if (!IntSize.m33670equalsimpl0(jM27360tryMinHeightJN0ABg2, companion.m33677getZeroYbymL2g())) {
                return jM27360tryMinHeightJN0ABg2;
            }
            long jM27361tryMinWidthJN0ABg2 = m27361tryMinWidthJN0ABg(j10, false);
            if (!IntSize.m33670equalsimpl0(jM27361tryMinWidthJN0ABg2, companion.m33677getZeroYbymL2g())) {
                return jM27361tryMinWidthJN0ABg2;
            }
        } else {
            long jM27359tryMaxWidthJN0ABg3 = m27359tryMaxWidthJN0ABg(j10, true);
            IntSize.Companion companion2 = IntSize.Companion;
            if (!IntSize.m33670equalsimpl0(jM27359tryMaxWidthJN0ABg3, companion2.m33677getZeroYbymL2g())) {
                return jM27359tryMaxWidthJN0ABg3;
            }
            long jM27358tryMaxHeightJN0ABg3 = m27358tryMaxHeightJN0ABg(j10, true);
            if (!IntSize.m33670equalsimpl0(jM27358tryMaxHeightJN0ABg3, companion2.m33677getZeroYbymL2g())) {
                return jM27358tryMaxHeightJN0ABg3;
            }
            long jM27361tryMinWidthJN0ABg3 = m27361tryMinWidthJN0ABg(j10, true);
            if (!IntSize.m33670equalsimpl0(jM27361tryMinWidthJN0ABg3, companion2.m33677getZeroYbymL2g())) {
                return jM27361tryMinWidthJN0ABg3;
            }
            long jM27360tryMinHeightJN0ABg3 = m27360tryMinHeightJN0ABg(j10, true);
            if (!IntSize.m33670equalsimpl0(jM27360tryMinHeightJN0ABg3, companion2.m33677getZeroYbymL2g())) {
                return jM27360tryMinHeightJN0ABg3;
            }
            long jM27359tryMaxWidthJN0ABg4 = m27359tryMaxWidthJN0ABg(j10, false);
            if (!IntSize.m33670equalsimpl0(jM27359tryMaxWidthJN0ABg4, companion2.m33677getZeroYbymL2g())) {
                return jM27359tryMaxWidthJN0ABg4;
            }
            long jM27358tryMaxHeightJN0ABg4 = m27358tryMaxHeightJN0ABg(j10, false);
            if (!IntSize.m33670equalsimpl0(jM27358tryMaxHeightJN0ABg4, companion2.m33677getZeroYbymL2g())) {
                return jM27358tryMaxHeightJN0ABg4;
            }
            long jM27361tryMinWidthJN0ABg4 = m27361tryMinWidthJN0ABg(j10, false);
            if (!IntSize.m33670equalsimpl0(jM27361tryMinWidthJN0ABg4, companion2.m33677getZeroYbymL2g())) {
                return jM27361tryMinWidthJN0ABg4;
            }
            long jM27360tryMinHeightJN0ABg4 = m27360tryMinHeightJN0ABg(j10, false);
            if (!IntSize.m33670equalsimpl0(jM27360tryMinHeightJN0ABg4, companion2.m33677getZeroYbymL2g())) {
                return jM27360tryMinHeightJN0ABg4;
            }
        }
        return IntSize.Companion.m33677getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m27358tryMaxHeightJN0ABg(long j10, boolean z10) {
        int iRound;
        int iM33453getMaxHeightimpl = Constraints.m33453getMaxHeightimpl(j10);
        return (iM33453getMaxHeightimpl == Integer.MAX_VALUE || (iRound = Math.round(((float) iM33453getMaxHeightimpl) * this.aspectRatio)) <= 0 || (z10 && !AspectRatioKt.m27356isSatisfiedByNN6EwU(j10, iRound, iM33453getMaxHeightimpl))) ? IntSize.Companion.m33677getZeroYbymL2g() : IntSize.m33667constructorimpl((iRound << 32) | (iM33453getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m27359tryMaxWidthJN0ABg(long j10, boolean z10) {
        int iRound;
        int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
        return (iM33454getMaxWidthimpl == Integer.MAX_VALUE || (iRound = Math.round(((float) iM33454getMaxWidthimpl) / this.aspectRatio)) <= 0 || (z10 && !AspectRatioKt.m27356isSatisfiedByNN6EwU(j10, iM33454getMaxWidthimpl, iRound))) ? IntSize.Companion.m33677getZeroYbymL2g() : IntSize.m33667constructorimpl((iM33454getMaxWidthimpl << 32) | (iRound & 4294967295L));
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m27360tryMinHeightJN0ABg(long j10, boolean z10) {
        int iM33455getMinHeightimpl = Constraints.m33455getMinHeightimpl(j10);
        int iRound = Math.round(iM33455getMinHeightimpl * this.aspectRatio);
        return (iRound <= 0 || (z10 && !AspectRatioKt.m27356isSatisfiedByNN6EwU(j10, iRound, iM33455getMinHeightimpl))) ? IntSize.Companion.m33677getZeroYbymL2g() : IntSize.m33667constructorimpl((iRound << 32) | (iM33455getMinHeightimpl & 4294967295L));
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m27361tryMinWidthJN0ABg(long j10, boolean z10) {
        int iM33456getMinWidthimpl = Constraints.m33456getMinWidthimpl(j10);
        int iRound = Math.round(iM33456getMinWidthimpl / this.aspectRatio);
        return (iRound <= 0 || (z10 && !AspectRatioKt.m27356isSatisfiedByNN6EwU(j10, iM33456getMinWidthimpl, iRound))) ? IntSize.Companion.m33677getZeroYbymL2g() : IntSize.m33667constructorimpl((iM33456getMinWidthimpl << 32) | (iRound & 4294967295L));
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.aspectRatio) : intrinsicMeasurable.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.aspectRatio) : intrinsicMeasurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        long jM27357findSizeToXhtMw = m27357findSizeToXhtMw(j10);
        if (!IntSize.m33670equalsimpl0(jM27357findSizeToXhtMw, IntSize.Companion.m33677getZeroYbymL2g())) {
            j10 = Constraints.Companion.m33464fixedJhjzzOo((int) (jM27357findSizeToXhtMw >> 32), (int) (jM27357findSizeToXhtMw & 4294967295L));
        }
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.aspectRatio) : intrinsicMeasurable.minIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.aspectRatio) : intrinsicMeasurable.minIntrinsicWidth(i10);
    }

    public final void setAspectRatio(float f10) {
        this.aspectRatio = f10;
    }

    public final void setMatchHeightConstraintsFirst(boolean z10) {
        this.matchHeightConstraintsFirst = z10;
    }
}
