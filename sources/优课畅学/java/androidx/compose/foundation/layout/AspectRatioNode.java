package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.IntSize;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public AspectRatioNode(float f10, boolean z10) {
        this.aspectRatio = f10;
        this.matchHeightConstraintsFirst = z10;
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m20755findSizeToXhtMw(long j10) {
        if (this.matchHeightConstraintsFirst) {
            long jM20756tryMaxHeightJN0ABg = m20756tryMaxHeightJN0ABg(j10, true);
            IntSize.Companion companion = IntSize.Companion;
            if (!IntSize.m27068equalsimpl0(jM20756tryMaxHeightJN0ABg, companion.m27075getZeroYbymL2g())) {
                return jM20756tryMaxHeightJN0ABg;
            }
            long jM20757tryMaxWidthJN0ABg = m20757tryMaxWidthJN0ABg(j10, true);
            if (!IntSize.m27068equalsimpl0(jM20757tryMaxWidthJN0ABg, companion.m27075getZeroYbymL2g())) {
                return jM20757tryMaxWidthJN0ABg;
            }
            long jM20758tryMinHeightJN0ABg = m20758tryMinHeightJN0ABg(j10, true);
            if (!IntSize.m27068equalsimpl0(jM20758tryMinHeightJN0ABg, companion.m27075getZeroYbymL2g())) {
                return jM20758tryMinHeightJN0ABg;
            }
            long jM20759tryMinWidthJN0ABg = m20759tryMinWidthJN0ABg(j10, true);
            if (!IntSize.m27068equalsimpl0(jM20759tryMinWidthJN0ABg, companion.m27075getZeroYbymL2g())) {
                return jM20759tryMinWidthJN0ABg;
            }
            long jM20756tryMaxHeightJN0ABg2 = m20756tryMaxHeightJN0ABg(j10, false);
            if (!IntSize.m27068equalsimpl0(jM20756tryMaxHeightJN0ABg2, companion.m27075getZeroYbymL2g())) {
                return jM20756tryMaxHeightJN0ABg2;
            }
            long jM20757tryMaxWidthJN0ABg2 = m20757tryMaxWidthJN0ABg(j10, false);
            if (!IntSize.m27068equalsimpl0(jM20757tryMaxWidthJN0ABg2, companion.m27075getZeroYbymL2g())) {
                return jM20757tryMaxWidthJN0ABg2;
            }
            long jM20758tryMinHeightJN0ABg2 = m20758tryMinHeightJN0ABg(j10, false);
            if (!IntSize.m27068equalsimpl0(jM20758tryMinHeightJN0ABg2, companion.m27075getZeroYbymL2g())) {
                return jM20758tryMinHeightJN0ABg2;
            }
            long jM20759tryMinWidthJN0ABg2 = m20759tryMinWidthJN0ABg(j10, false);
            if (!IntSize.m27068equalsimpl0(jM20759tryMinWidthJN0ABg2, companion.m27075getZeroYbymL2g())) {
                return jM20759tryMinWidthJN0ABg2;
            }
        } else {
            long jM20757tryMaxWidthJN0ABg3 = m20757tryMaxWidthJN0ABg(j10, true);
            IntSize.Companion companion2 = IntSize.Companion;
            if (!IntSize.m27068equalsimpl0(jM20757tryMaxWidthJN0ABg3, companion2.m27075getZeroYbymL2g())) {
                return jM20757tryMaxWidthJN0ABg3;
            }
            long jM20756tryMaxHeightJN0ABg3 = m20756tryMaxHeightJN0ABg(j10, true);
            if (!IntSize.m27068equalsimpl0(jM20756tryMaxHeightJN0ABg3, companion2.m27075getZeroYbymL2g())) {
                return jM20756tryMaxHeightJN0ABg3;
            }
            long jM20759tryMinWidthJN0ABg3 = m20759tryMinWidthJN0ABg(j10, true);
            if (!IntSize.m27068equalsimpl0(jM20759tryMinWidthJN0ABg3, companion2.m27075getZeroYbymL2g())) {
                return jM20759tryMinWidthJN0ABg3;
            }
            long jM20758tryMinHeightJN0ABg3 = m20758tryMinHeightJN0ABg(j10, true);
            if (!IntSize.m27068equalsimpl0(jM20758tryMinHeightJN0ABg3, companion2.m27075getZeroYbymL2g())) {
                return jM20758tryMinHeightJN0ABg3;
            }
            long jM20757tryMaxWidthJN0ABg4 = m20757tryMaxWidthJN0ABg(j10, false);
            if (!IntSize.m27068equalsimpl0(jM20757tryMaxWidthJN0ABg4, companion2.m27075getZeroYbymL2g())) {
                return jM20757tryMaxWidthJN0ABg4;
            }
            long jM20756tryMaxHeightJN0ABg4 = m20756tryMaxHeightJN0ABg(j10, false);
            if (!IntSize.m27068equalsimpl0(jM20756tryMaxHeightJN0ABg4, companion2.m27075getZeroYbymL2g())) {
                return jM20756tryMaxHeightJN0ABg4;
            }
            long jM20759tryMinWidthJN0ABg4 = m20759tryMinWidthJN0ABg(j10, false);
            if (!IntSize.m27068equalsimpl0(jM20759tryMinWidthJN0ABg4, companion2.m27075getZeroYbymL2g())) {
                return jM20759tryMinWidthJN0ABg4;
            }
            long jM20758tryMinHeightJN0ABg4 = m20758tryMinHeightJN0ABg(j10, false);
            if (!IntSize.m27068equalsimpl0(jM20758tryMinHeightJN0ABg4, companion2.m27075getZeroYbymL2g())) {
                return jM20758tryMinHeightJN0ABg4;
            }
        }
        return IntSize.Companion.m27075getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m20756tryMaxHeightJN0ABg(long j10, boolean z10) {
        int iRound;
        int iM26851getMaxHeightimpl = Constraints.m26851getMaxHeightimpl(j10);
        return (iM26851getMaxHeightimpl == Integer.MAX_VALUE || (iRound = Math.round(((float) iM26851getMaxHeightimpl) * this.aspectRatio)) <= 0 || (z10 && !AspectRatioKt.m20754isSatisfiedByNN6EwU(j10, iRound, iM26851getMaxHeightimpl))) ? IntSize.Companion.m27075getZeroYbymL2g() : IntSize.m27065constructorimpl((iRound << 32) | (iM26851getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m20757tryMaxWidthJN0ABg(long j10, boolean z10) {
        int iRound;
        int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
        return (iM26852getMaxWidthimpl == Integer.MAX_VALUE || (iRound = Math.round(((float) iM26852getMaxWidthimpl) / this.aspectRatio)) <= 0 || (z10 && !AspectRatioKt.m20754isSatisfiedByNN6EwU(j10, iM26852getMaxWidthimpl, iRound))) ? IntSize.Companion.m27075getZeroYbymL2g() : IntSize.m27065constructorimpl((iM26852getMaxWidthimpl << 32) | (iRound & 4294967295L));
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m20758tryMinHeightJN0ABg(long j10, boolean z10) {
        int iM26853getMinHeightimpl = Constraints.m26853getMinHeightimpl(j10);
        int iRound = Math.round(iM26853getMinHeightimpl * this.aspectRatio);
        return (iRound <= 0 || (z10 && !AspectRatioKt.m20754isSatisfiedByNN6EwU(j10, iRound, iM26853getMinHeightimpl))) ? IntSize.Companion.m27075getZeroYbymL2g() : IntSize.m27065constructorimpl((iRound << 32) | (iM26853getMinHeightimpl & 4294967295L));
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m20759tryMinWidthJN0ABg(long j10, boolean z10) {
        int iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(j10);
        int iRound = Math.round(iM26854getMinWidthimpl / this.aspectRatio);
        return (iRound <= 0 || (z10 && !AspectRatioKt.m20754isSatisfiedByNN6EwU(j10, iM26854getMinWidthimpl, iRound))) ? IntSize.Companion.m27075getZeroYbymL2g() : IntSize.m27065constructorimpl((iM26854getMinWidthimpl << 32) | (iRound & 4294967295L));
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.aspectRatio) : intrinsicMeasurable.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.aspectRatio) : intrinsicMeasurable.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        long jM20755findSizeToXhtMw = m20755findSizeToXhtMw(j10);
        if (!IntSize.m27068equalsimpl0(jM20755findSizeToXhtMw, IntSize.Companion.m27075getZeroYbymL2g())) {
            j10 = Constraints.Companion.m26862fixedJhjzzOo((int) (jM20755findSizeToXhtMw >> 32), (int) (jM20755findSizeToXhtMw & 4294967295L));
        }
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo0.getWidth(), placeableMo25627measureBRTryo0.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo25627measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.aspectRatio) : intrinsicMeasurable.minIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
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
