package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.LookaheadDelegate;
import androidx.compose.p013ui.node.NodeCoordinator;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

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

    @Override // androidx.compose.p013ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.p013ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadConstraints-msEJaDk */
    public long mo25603getLookaheadConstraintsmsEJaDk() {
        Constraints constraintsM25800getLookaheadConstraintsDWUhwKw$ui_release = this.coordinator.m25800getLookaheadConstraintsDWUhwKw$ui_release();
        if (constraintsM25800getLookaheadConstraintsDWUhwKw$ui_release != null) {
            return constraintsM25800getLookaheadConstraintsDWUhwKw$ui_release.m26858unboximpl();
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Error: Lookahead constraints requested before lookahead measure.");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.p013ui.layout.LookaheadScope
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

    @Override // androidx.compose.p013ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadSize-YbymL2g */
    public long mo25604getLookaheadSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.coordinator.getLookaheadDelegate();
        AbstractC9133u.m16130d(lookaheadDelegate);
        MeasureResult measureResult$ui_release = lookaheadDelegate.getMeasureResult$ui_release();
        return IntSize.m27065constructorimpl((measureResult$ui_release.getWidth() << 32) | (measureResult$ui_release.getHeight() & 4294967295L));
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    @Override // androidx.compose.p013ui.layout.MeasureScope
    public MeasureResult layout(int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC10570l interfaceC10570l) {
        return this.coordinator.layout(i10, i11, map, interfaceC10570l);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo20490roundToPxR2X_6o(long j10) {
        return this.coordinator.mo20490roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo20491roundToPx0680j_4(float f10) {
        return this.coordinator.mo20491roundToPx0680j_4(f10);
    }

    public final void setApproachMeasureRequired$ui_release(boolean z10) {
        this.approachMeasureRequired = z10;
    }

    public final void setApproachNode(ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.approachNode = approachLayoutModifierNode;
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo20492toDpGaN1DYA(long j10) {
        return this.coordinator.mo20492toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo20493toDpu2uoSUM(float f10) {
        return this.coordinator.mo20493toDpu2uoSUM(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo20495toDpSizekrfVVM(long j10) {
        return this.coordinator.mo20495toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.p013ui.layout.LookaheadScope
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

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo20496toPxR2X_6o(long j10) {
        return this.coordinator.mo20496toPxR2X_6o(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo20497toPx0680j_4(float f10) {
        return this.coordinator.mo20497toPx0680j_4(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        return this.coordinator.toRect(dpRect);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo20498toSizeXkaWNTQ(long j10) {
        return this.coordinator.mo20498toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo20499toSp0xMU5do(float f10) {
        return this.coordinator.mo20499toSp0xMU5do(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo20500toSpkPz2Gy4(float f10) {
        return this.coordinator.mo20500toSpkPz2Gy4(f10);
    }

    @Override // androidx.compose.p013ui.layout.MeasureScope
    public MeasureResult layout(int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        if (!((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(i10, i11, map, interfaceC10570l, interfaceC10570l2, this) { // from class: androidx.compose.ui.layout.ApproachMeasureScopeImpl.layout.1
            final /* synthetic */ InterfaceC10570l $placementBlock;
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final InterfaceC10570l rulers;
            final /* synthetic */ ApproachMeasureScopeImpl this$0;
            private final int width;

            {
                this.$placementBlock = interfaceC10570l2;
                this.this$0 = this;
                this.width = i10;
                this.height = i11;
                this.alignmentLines = map;
                this.rulers = interfaceC10570l;
            }

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public InterfaceC10570l getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public void placeChildren() {
                this.$placementBlock.invoke(this.this$0.getCoordinator().getPlacementScope());
            }
        };
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo20494toDpu2uoSUM(int i10) {
        return this.coordinator.mo20494toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo20501toSpkPz2Gy4(int i10) {
        return this.coordinator.mo20501toSpkPz2Gy4(i10);
    }
}
