package androidx.compose.animation;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.ApproachLayoutModifierNode;
import androidx.compose.p013ui.layout.ApproachMeasureScope;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LookaheadScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@ExperimentalSharedTransitionApi
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BoundsAnimationModifierNode extends Modifier.Node implements ApproachLayoutModifierNode {
    public static final int $stable = 8;
    private boolean animateMotionFrameOfReference;
    private BoundsTransform boundsTransform;
    private LookaheadScope lookaheadScope;
    private InterfaceC10574p onChooseMeasureConstraints;
    private boolean directManipulationParentsDirty = true;
    private final BoundsTransformDeferredAnimation boundsAnimation = new BoundsTransformDeferredAnimation();

    public BoundsAnimationModifierNode(LookaheadScope lookaheadScope, BoundsTransform boundsTransform, InterfaceC10574p interfaceC10574p, boolean z10) {
        this.lookaheadScope = lookaheadScope;
        this.boundsTransform = boundsTransform;
        this.onChooseMeasureConstraints = interfaceC10574p;
        this.animateMotionFrameOfReference = z10;
    }

    @Override // androidx.compose.p013ui.layout.ApproachLayoutModifierNode
    /* renamed from: approachMeasure-3p2s80s, reason: not valid java name */
    public MeasureResult mo20172approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10) {
        long jM27082toSizeozmzZPI = this.boundsAnimation.m20175getCurrentSizeNHjbRc() == InlineClassHelperKt.UnspecifiedPackedFloats ? IntSizeKt.m27082toSizeozmzZPI(approachMeasureScope.mo25604getLookaheadSizeYbymL2g()) : this.boundsAnimation.m20175getCurrentSizeNHjbRc();
        Rect value = this.boundsAnimation.getValue();
        if (value != null) {
            jM27082toSizeozmzZPI = value.m24068getSizeNHjbRc();
        }
        long jM27078roundToIntSizeuvyYCjk = IntSizeKt.m27078roundToIntSizeuvyYCjk(jM27082toSizeozmzZPI);
        long jM26858unboximpl = ((Constraints) this.onChooseMeasureConstraints.invoke(IntSize.m27062boximpl(jM27078roundToIntSizeuvyYCjk), Constraints.m26839boximpl(j10))).m26858unboximpl();
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(jM26858unboximpl);
        long jM26866constrain4WqzIAM = ConstraintsKt.m26866constrain4WqzIAM(jM26858unboximpl, jM27078roundToIntSizeuvyYCjk);
        return MeasureScope.layout$default(approachMeasureScope, (int) (jM26866constrain4WqzIAM >> 32), (int) (jM26866constrain4WqzIAM & 4294967295L), null, new InterfaceC10570l() { // from class: androidx.compose.animation.BoundsAnimationModifierNode$approachMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                long jM24070getTopLeftF1C5BW0;
                Rect value2 = this.this$0.boundsAnimation.getValue();
                LookaheadScope lookaheadScope = this.this$0.getLookaheadScope();
                BoundsAnimationModifierNode boundsAnimationModifierNode = this.this$0;
                LayoutCoordinates coordinates = placementScope.getCoordinates();
                Offset offsetM24024boximpl = coordinates != null ? Offset.m24024boximpl(lookaheadScope.getLookaheadScopeCoordinates(placementScope).mo25637localPositionOfS_NoaFU(coordinates, Offset.Companion.m24051getZeroF1C5BW0(), boundsAnimationModifierNode.getAnimateMotionFrameOfReference())) : null;
                if (value2 != null) {
                    this.this$0.boundsAnimation.m20177updateCurrentBoundstz77jQw(value2.m24070getTopLeftF1C5BW0(), value2.m24068getSizeNHjbRc());
                    jM24070getTopLeftF1C5BW0 = value2.m24070getTopLeftF1C5BW0();
                } else {
                    Rect currentBounds = this.this$0.boundsAnimation.getCurrentBounds();
                    jM24070getTopLeftF1C5BW0 = currentBounds != null ? currentBounds.m24070getTopLeftF1C5BW0() : Offset.Companion.m24051getZeroF1C5BW0();
                }
                long jM24039minusMKHz9U = offsetM24024boximpl != null ? Offset.m24039minusMKHz9U(jM24070getTopLeftF1C5BW0, offsetM24024boximpl.m24045unboximpl()) : Offset.Companion.m24051getZeroF1C5BW0();
                Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo0, Math.round(Float.intBitsToFloat((int) (jM24039minusMKHz9U >> 32))), Math.round(Float.intBitsToFloat((int) (jM24039minusMKHz9U & 4294967295L))), 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final boolean getAnimateMotionFrameOfReference() {
        return this.animateMotionFrameOfReference;
    }

    public final BoundsTransform getBoundsTransform() {
        return this.boundsTransform;
    }

    public final LookaheadScope getLookaheadScope() {
        return this.lookaheadScope;
    }

    public final InterfaceC10574p getOnChooseMeasureConstraints() {
        return this.onChooseMeasureConstraints;
    }

    @Override // androidx.compose.p013ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI, reason: not valid java name */
    public boolean mo20173isMeasurementApproachInProgressozmzZPI(long j10) {
        this.boundsAnimation.m20178updateTargetSizeuvyYCjk(IntSizeKt.m27082toSizeozmzZPI(j10));
        return !this.boundsAnimation.isIdle();
    }

    @Override // androidx.compose.p013ui.layout.ApproachLayoutModifierNode
    public boolean isPlacementApproachInProgress(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        this.boundsAnimation.updateTargetOffsetAndAnimate(this.lookaheadScope, placementScope, getCoroutineScope(), this.directManipulationParentsDirty, this.animateMotionFrameOfReference, this.boundsTransform);
        this.directManipulationParentsDirty = this.animateMotionFrameOfReference;
        return !this.boundsAnimation.isIdle();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.directManipulationParentsDirty = true;
    }

    public final void setAnimateMotionFrameOfReference(boolean z10) {
        this.animateMotionFrameOfReference = z10;
    }

    public final void setBoundsTransform(BoundsTransform boundsTransform) {
        this.boundsTransform = boundsTransform;
    }

    public final void setLookaheadScope(LookaheadScope lookaheadScope) {
        this.lookaheadScope = lookaheadScope;
    }

    public final void setOnChooseMeasureConstraints(InterfaceC10574p interfaceC10574p) {
        this.onChooseMeasureConstraints = interfaceC10574p;
    }
}
