package androidx.compose.animation;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.layout.ApproachLayoutModifierNode;
import androidx.compose.p014ui.layout.ApproachMeasureScope;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LookaheadScope;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

@ExperimentalSharedTransitionApi
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BoundsAnimationModifierNode extends Modifier.Node implements ApproachLayoutModifierNode {
    public static final int $stable = 8;
    private boolean animateMotionFrameOfReference;
    private BoundsTransform boundsTransform;
    private LookaheadScope lookaheadScope;
    private InterfaceC9544p onChooseMeasureConstraints;
    private boolean directManipulationParentsDirty = true;
    private final BoundsTransformDeferredAnimation boundsAnimation = new BoundsTransformDeferredAnimation();

    public BoundsAnimationModifierNode(LookaheadScope lookaheadScope, BoundsTransform boundsTransform, InterfaceC9544p interfaceC9544p, boolean z10) {
        this.lookaheadScope = lookaheadScope;
        this.boundsTransform = boundsTransform;
        this.onChooseMeasureConstraints = interfaceC9544p;
        this.animateMotionFrameOfReference = z10;
    }

    @Override // androidx.compose.p014ui.layout.ApproachLayoutModifierNode
    /* renamed from: approachMeasure-3p2s80s, reason: not valid java name */
    public MeasureResult mo26774approachMeasure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j10) {
        long jM33684toSizeozmzZPI = this.boundsAnimation.m26777getCurrentSizeNHjbRc() == InlineClassHelperKt.UnspecifiedPackedFloats ? IntSizeKt.m33684toSizeozmzZPI(approachMeasureScope.mo32206getLookaheadSizeYbymL2g()) : this.boundsAnimation.m26777getCurrentSizeNHjbRc();
        Rect value = this.boundsAnimation.getValue();
        if (value != null) {
            jM33684toSizeozmzZPI = value.m30670getSizeNHjbRc();
        }
        long jM33680roundToIntSizeuvyYCjk = IntSizeKt.m33680roundToIntSizeuvyYCjk(jM33684toSizeozmzZPI);
        long jM33460unboximpl = ((Constraints) this.onChooseMeasureConstraints.invoke(IntSize.m33664boximpl(jM33680roundToIntSizeuvyYCjk), Constraints.m33441boximpl(j10))).m33460unboximpl();
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(jM33460unboximpl);
        long jM33468constrain4WqzIAM = ConstraintsKt.m33468constrain4WqzIAM(jM33460unboximpl, jM33680roundToIntSizeuvyYCjk);
        return MeasureScope.layout$default(approachMeasureScope, (int) (jM33468constrain4WqzIAM >> 32), (int) (jM33468constrain4WqzIAM & 4294967295L), null, new InterfaceC9540l() { // from class: androidx.compose.animation.BoundsAnimationModifierNode$approachMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                long jM30672getTopLeftF1C5BW0;
                Rect value2 = this.this$0.boundsAnimation.getValue();
                LookaheadScope lookaheadScope = this.this$0.getLookaheadScope();
                BoundsAnimationModifierNode boundsAnimationModifierNode = this.this$0;
                LayoutCoordinates coordinates = placementScope.getCoordinates();
                Offset offsetM30626boximpl = coordinates != null ? Offset.m30626boximpl(lookaheadScope.getLookaheadScopeCoordinates(placementScope).mo32239localPositionOfS_NoaFU(coordinates, Offset.Companion.m30653getZeroF1C5BW0(), boundsAnimationModifierNode.getAnimateMotionFrameOfReference())) : null;
                if (value2 != null) {
                    this.this$0.boundsAnimation.m26779updateCurrentBoundstz77jQw(value2.m30672getTopLeftF1C5BW0(), value2.m30670getSizeNHjbRc());
                    jM30672getTopLeftF1C5BW0 = value2.m30672getTopLeftF1C5BW0();
                } else {
                    Rect currentBounds = this.this$0.boundsAnimation.getCurrentBounds();
                    jM30672getTopLeftF1C5BW0 = currentBounds != null ? currentBounds.m30672getTopLeftF1C5BW0() : Offset.Companion.m30653getZeroF1C5BW0();
                }
                long jM30641minusMKHz9U = offsetM30626boximpl != null ? Offset.m30641minusMKHz9U(jM30672getTopLeftF1C5BW0, offsetM30626boximpl.m30647unboximpl()) : Offset.Companion.m30653getZeroF1C5BW0();
                Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, Math.round(Float.intBitsToFloat((int) (jM30641minusMKHz9U >> 32))), Math.round(Float.intBitsToFloat((int) (jM30641minusMKHz9U & 4294967295L))), 0.0f, 4, null);
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

    public final InterfaceC9544p getOnChooseMeasureConstraints() {
        return this.onChooseMeasureConstraints;
    }

    @Override // androidx.compose.p014ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI, reason: not valid java name */
    public boolean mo26775isMeasurementApproachInProgressozmzZPI(long j10) {
        this.boundsAnimation.m26780updateTargetSizeuvyYCjk(IntSizeKt.m33684toSizeozmzZPI(j10));
        return !this.boundsAnimation.isIdle();
    }

    @Override // androidx.compose.p014ui.layout.ApproachLayoutModifierNode
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

    public final void setOnChooseMeasureConstraints(InterfaceC9544p interfaceC9544p) {
        this.onChooseMeasureConstraints = interfaceC9544p;
    }
}
