package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.LookaheadDelegate;
import androidx.compose.p014ui.node.NodeCoordinator;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.DpRect;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ApproachMeasureScopeImpl implements ApproachMeasureScope, MeasureScope, LookaheadScope {
    public static final int $stable = 0;
    private boolean approachMeasureRequired;
    private ApproachLayoutModifierNode approachNode;
    private final LayoutModifierNodeCoordinator coordinator;

    public ApproachMeasureScopeImpl(LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.coordinator = layoutModifierNodeCoordinator;
        this.approachNode = approachLayoutModifierNode;
    }

    public final boolean getApproachMeasureRequired$ui_release() {
        return this.approachMeasureRequired;
    }

    public final ApproachLayoutModifierNode getApproachNode() {
        return this.approachNode;
    }

    public final LayoutModifierNodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.p014ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.p014ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.p014ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadConstraints-msEJaDk */
    public long mo32205getLookaheadConstraintsmsEJaDk() {
        Constraints constraintsM32402getLookaheadConstraintsDWUhwKw$ui_release = this.coordinator.m32402getLookaheadConstraintsDWUhwKw$ui_release();
        if (constraintsM32402getLookaheadConstraintsDWUhwKw$ui_release != null) {
            return constraintsM32402getLookaheadConstraintsDWUhwKw$ui_release.m33460unboximpl();
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Error: Lookahead constraints requested before lookahead measure.");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.p014ui.layout.LookaheadScope
    public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope) {
        NodeCoordinator innerCoordinator$ui_release;
        LayoutNode lookaheadRoot$ui_release = this.coordinator.getLayoutNode().getLookaheadRoot$ui_release();
        if (lookaheadRoot$ui_release == null) {
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            throw new KotlinNothingValueException();
        }
        if (!lookaheadRoot$ui_release.isVirtualLookaheadRoot$ui_release()) {
            return lookaheadRoot$ui_release.getOuterCoordinator$ui_release();
        }
        LayoutNode parent$ui_release = lookaheadRoot$ui_release.getParent$ui_release();
        return (parent$ui_release == null || (innerCoordinator$ui_release = parent$ui_release.getInnerCoordinator$ui_release()) == null) ? lookaheadRoot$ui_release.getChildren$ui_release().get(0).getOuterCoordinator$ui_release() : innerCoordinator$ui_release;
    }

    @Override // androidx.compose.p014ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadSize-YbymL2g */
    public long mo32206getLookaheadSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.coordinator.getLookaheadDelegate();
        AbstractC9979u.m20291d(lookaheadDelegate);
        MeasureResult measureResult$ui_release = lookaheadDelegate.getMeasureResult$ui_release();
        return IntSize.m33667constructorimpl((measureResult$ui_release.getWidth() << 32) | (measureResult$ui_release.getHeight() & 4294967295L));
    }

    @Override // androidx.compose.p014ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    @Override // androidx.compose.p014ui.layout.MeasureScope
    public MeasureResult layout(int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC9540l interfaceC9540l) {
        return this.coordinator.layout(i10, i11, map, interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo27092roundToPxR2X_6o(long j10) {
        return this.coordinator.mo27092roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo27093roundToPx0680j_4(float f10) {
        return this.coordinator.mo27093roundToPx0680j_4(f10);
    }

    public final void setApproachMeasureRequired$ui_release(boolean z10) {
        this.approachMeasureRequired = z10;
    }

    public final void setApproachNode(ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.approachNode = approachLayoutModifierNode;
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo27094toDpGaN1DYA(long j10) {
        return this.coordinator.mo27094toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo27095toDpu2uoSUM(float f10) {
        return this.coordinator.mo27095toDpu2uoSUM(f10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo27097toDpSizekrfVVM(long j10) {
        return this.coordinator.mo27097toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.p014ui.layout.LookaheadScope
    public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            return layoutCoordinates;
        }
        if (layoutCoordinates instanceof NodeCoordinator) {
            LookaheadDelegate lookaheadDelegate = ((NodeCoordinator) layoutCoordinates).getLookaheadDelegate();
            return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) ? layoutCoordinates : lookaheadLayoutCoordinates;
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported LayoutCoordinates");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo27098toPxR2X_6o(long j10) {
        return this.coordinator.mo27098toPxR2X_6o(j10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo27099toPx0680j_4(float f10) {
        return this.coordinator.mo27099toPx0680j_4(f10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        return this.coordinator.toRect(dpRect);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo27100toSizeXkaWNTQ(long j10) {
        return this.coordinator.mo27100toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo27101toSp0xMU5do(float f10) {
        return this.coordinator.mo27101toSp0xMU5do(f10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo27102toSpkPz2Gy4(float f10) {
        return this.coordinator.mo27102toSpkPz2Gy4(f10);
    }

    @Override // androidx.compose.p014ui.layout.MeasureScope
    public MeasureResult layout(int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        if (!((i10 & ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & i11) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(i10, i11, map, interfaceC9540l, interfaceC9540l2, this) { // from class: androidx.compose.ui.layout.ApproachMeasureScopeImpl.layout.1
            final /* synthetic */ InterfaceC9540l $placementBlock;
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final InterfaceC9540l rulers;
            final /* synthetic */ ApproachMeasureScopeImpl this$0;
            private final int width;

            {
                this.$placementBlock = interfaceC9540l2;
                this.this$0 = this;
                this.width = i10;
                this.height = i11;
                this.alignmentLines = map;
                this.rulers = interfaceC9540l;
            }

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public InterfaceC9540l getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public void placeChildren() {
                this.$placementBlock.invoke(this.this$0.getCoordinator().getPlacementScope());
            }
        };
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo27096toDpu2uoSUM(int i10) {
        return this.coordinator.mo27096toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo27103toSpkPz2Gy4(int i10) {
        return this.coordinator.mo27103toSpkPz2Gy4(i10);
    }
}
