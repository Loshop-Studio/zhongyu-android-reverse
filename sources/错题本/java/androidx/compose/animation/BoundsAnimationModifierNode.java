package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.layout.ApproachLayoutModifierNode;
import androidx.compose.p011ui.layout.ApproachMeasureScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LookaheadScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@ExperimentalSharedTransitionApi
@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00126\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u000f*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010%\u001a\u00020\"*\u00020\u001f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/RR\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00105R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, m5110d2 = {"Landroidx/compose/animation/BoundsAnimationModifierNode;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "Landroidx/compose/animation/BoundsTransform;", "boundsTransform", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "animatedSize", "Landroidx/compose/ui/unit/Constraints;", "constraints", "onChooseMeasureConstraints", "", "animateMotionFrameOfReference", "<init>", "(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/animation/BoundsTransform;Lr6/e;Z)V", "lookaheadSize", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "isMeasurementApproachInProgress", "Ld6/s;", "onAttach", "()V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadCoordinates", "isPlacementApproachInProgress", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/LayoutCoordinates;)Z", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/MeasureResult;", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "approachMeasure", "Landroidx/compose/ui/layout/LookaheadScope;", "getLookaheadScope", "()Landroidx/compose/ui/layout/LookaheadScope;", "setLookaheadScope", "(Landroidx/compose/ui/layout/LookaheadScope;)V", "Landroidx/compose/animation/BoundsTransform;", "getBoundsTransform", "()Landroidx/compose/animation/BoundsTransform;", "setBoundsTransform", "(Landroidx/compose/animation/BoundsTransform;)V", "Lr6/e;", "getOnChooseMeasureConstraints", "()Lr6/e;", "setOnChooseMeasureConstraints", "(Lr6/e;)V", "Z", "getAnimateMotionFrameOfReference", "()Z", "setAnimateMotionFrameOfReference", "(Z)V", "directManipulationParentsDirty", "Landroidx/compose/animation/BoundsTransformDeferredAnimation;", "boundsAnimation", "Landroidx/compose/animation/BoundsTransformDeferredAnimation;", "animation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnimateBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsAnimationModifierNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,444:1\n153#2:445\n61#3:446\n54#3:447\n63#3:449\n59#3:450\n85#4:448\n90#4:451\n*S KotlinDebug\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsAnimationModifierNode\n*L\n238#1:445\n254#1:446\n254#1:447\n254#1:449\n254#1:450\n254#1:448\n254#1:451\n*E\n"})
/* loaded from: classes.dex */
public final class BoundsAnimationModifierNode extends Modifier.Node implements ApproachLayoutModifierNode {
    public static final int $stable = 8;
    private boolean animateMotionFrameOfReference;

    @NotNull
    private BoundsTransform boundsTransform;

    @NotNull
    private LookaheadScope lookaheadScope;

    @NotNull
    private InterfaceC6473e onChooseMeasureConstraints;
    private boolean directManipulationParentsDirty = true;

    @NotNull
    private final BoundsTransformDeferredAnimation boundsAnimation = new BoundsTransformDeferredAnimation();

    public BoundsAnimationModifierNode(@NotNull LookaheadScope lookaheadScope, @NotNull BoundsTransform boundsTransform, @NotNull InterfaceC6473e interfaceC6473e, boolean z8) {
        this.lookaheadScope = lookaheadScope;
        this.boundsTransform = boundsTransform;
        this.onChooseMeasureConstraints = interfaceC6473e;
        this.animateMotionFrameOfReference = z8;
    }

    @Override // androidx.compose.p011ui.layout.ApproachLayoutModifierNode
    @NotNull
    /* renamed from: approachMeasure-3p2s80s, reason: not valid java name */
    public MeasureResult mo6578approachMeasure3p2s80s(@NotNull ApproachMeasureScope approachMeasureScope, @NotNull Measurable measurable, long j7) {
        long jM13488toSizeozmzZPI = this.boundsAnimation.getCurrentSize() == InlineClassHelperKt.UnspecifiedPackedFloats ? IntSizeKt.m13488toSizeozmzZPI(approachMeasureScope.mo12010getLookaheadSizeYbymL2g()) : this.boundsAnimation.getCurrentSize();
        Rect value = this.boundsAnimation.getValue();
        if (value != null) {
            jM13488toSizeozmzZPI = value.m10474getSizeNHjbRc();
        }
        long jM13484roundToIntSizeuvyYCjk = IntSizeKt.m13484roundToIntSizeuvyYCjk(jM13488toSizeozmzZPI);
        long value2 = ((Constraints) this.onChooseMeasureConstraints.invoke(IntSize.m13468boximpl(jM13484roundToIntSizeuvyYCjk), Constraints.m13245boximpl(j7))).getValue();
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(value2);
        long jM13272constrain4WqzIAM = ConstraintsKt.m13272constrain4WqzIAM(value2, jM13484roundToIntSizeuvyYCjk);
        return MeasureScope.layout$default(approachMeasureScope, (int) (jM13272constrain4WqzIAM >> 32), (int) (jM13272constrain4WqzIAM & 4294967295L), null, new InterfaceC6471c() { // from class: androidx.compose.animation.BoundsAnimationModifierNode$approachMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                long jM10476getTopLeftF1C5BW0;
                Rect value3 = this.this$0.boundsAnimation.getValue();
                LookaheadScope lookaheadScope = this.this$0.getLookaheadScope();
                BoundsAnimationModifierNode boundsAnimationModifierNode = this.this$0;
                LayoutCoordinates coordinates = placementScope.getCoordinates();
                Offset offsetM10430boximpl = coordinates != null ? Offset.m10430boximpl(lookaheadScope.getLookaheadScopeCoordinates(placementScope).mo12043localPositionOfS_NoaFU(coordinates, Offset.INSTANCE.m10457getZeroF1C5BW0(), boundsAnimationModifierNode.getAnimateMotionFrameOfReference())) : null;
                if (value3 != null) {
                    this.this$0.boundsAnimation.m6583updateCurrentBoundstz77jQw(value3.m10476getTopLeftF1C5BW0(), value3.m10474getSizeNHjbRc());
                    jM10476getTopLeftF1C5BW0 = value3.m10476getTopLeftF1C5BW0();
                } else {
                    Rect currentBounds = this.this$0.boundsAnimation.getCurrentBounds();
                    jM10476getTopLeftF1C5BW0 = currentBounds != null ? currentBounds.m10476getTopLeftF1C5BW0() : Offset.INSTANCE.m10457getZeroF1C5BW0();
                }
                long jM10445minusMKHz9U = offsetM10430boximpl != null ? Offset.m10445minusMKHz9U(jM10476getTopLeftF1C5BW0, offsetM10430boximpl.m10451unboximpl()) : Offset.INSTANCE.m10457getZeroF1C5BW0();
                Placeable.PlacementScope.place$default(placementScope, placeableMo12033measureBRTryo0, Math.round(Float.intBitsToFloat((int) (jM10445minusMKHz9U >> 32))), Math.round(Float.intBitsToFloat((int) (jM10445minusMKHz9U & 4294967295L))), 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final boolean getAnimateMotionFrameOfReference() {
        return this.animateMotionFrameOfReference;
    }

    @NotNull
    public final BoundsTransform getBoundsTransform() {
        return this.boundsTransform;
    }

    @NotNull
    public final LookaheadScope getLookaheadScope() {
        return this.lookaheadScope;
    }

    @NotNull
    public final InterfaceC6473e getOnChooseMeasureConstraints() {
        return this.onChooseMeasureConstraints;
    }

    @Override // androidx.compose.p011ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI, reason: not valid java name */
    public boolean mo6579isMeasurementApproachInProgressozmzZPI(long lookaheadSize) {
        this.boundsAnimation.m6584updateTargetSizeuvyYCjk(IntSizeKt.m13488toSizeozmzZPI(lookaheadSize));
        return !this.boundsAnimation.isIdle();
    }

    @Override // androidx.compose.p011ui.layout.ApproachLayoutModifierNode
    public boolean isPlacementApproachInProgress(@NotNull Placeable.PlacementScope placementScope, @NotNull LayoutCoordinates layoutCoordinates) {
        this.boundsAnimation.updateTargetOffsetAndAnimate(this.lookaheadScope, placementScope, getCoroutineScope(), this.directManipulationParentsDirty, this.animateMotionFrameOfReference, this.boundsTransform);
        this.directManipulationParentsDirty = this.animateMotionFrameOfReference;
        return !this.boundsAnimation.isIdle();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.directManipulationParentsDirty = true;
    }

    public final void setAnimateMotionFrameOfReference(boolean z8) {
        this.animateMotionFrameOfReference = z8;
    }

    public final void setBoundsTransform(@NotNull BoundsTransform boundsTransform) {
        this.boundsTransform = boundsTransform;
    }

    public final void setLookaheadScope(@NotNull LookaheadScope lookaheadScope) {
        this.lookaheadScope = lookaheadScope;
    }

    public final void setOnChooseMeasureConstraints(@NotNull InterfaceC6473e interfaceC6473e) {
        this.onChooseMeasureConstraints = interfaceC6473e;
    }
}
