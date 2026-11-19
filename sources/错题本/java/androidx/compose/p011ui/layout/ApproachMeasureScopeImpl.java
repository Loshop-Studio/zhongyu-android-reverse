package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.LookaheadDelegate;
import androidx.compose.p011ui.node.NodeCoordinator;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.DpRect;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJO\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\n*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n*\u00020\u001cH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u0018*\u00020\u001cH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\u0018*\u00020\"H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001a\u0010!\u001a\u00020\u0018*\u00020\nH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010%J\u0017\u0010*\u001a\u00020'*\u00020&H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\"*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010$J\u0017\u0010,\u001a\u00020\"*\u00020\u001cH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010 J\u0014\u00100\u001a\u00020/*\u00020.H\u0097\u0001¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020&*\u00020'H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b2\u0010)J\u0017\u00106\u001a\u00020\u001c*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u001a\u00106\u001a\u00020\u001c*\u00020\"H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00105J\u001a\u00106\u001a\u00020\u001c*\u00020\nH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0013\u0010:\u001a\u000209*\u000209H\u0016¢\u0006\u0004\b:\u0010;Jg\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0019\u0010=\u001a\u0015\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0002\b\u00132\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0004\b\u0016\u0010>R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010AR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010H\u001a\u00020G8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\"8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\"8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u0014\u0010V\u001a\u00020S8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001a\u0010Z\u001a\u00020W8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bX\u0010YR\u001a\u0010]\u001a\u00020[8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\\\u0010YR\u0018\u0010`\u001a\u000209*\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, m5110d2 = {"Landroidx/compose/ui/layout/ApproachMeasureScopeImpl;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "coordinator", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "approachNode", "<init>", "(Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;Landroidx/compose/ui/layout/ApproachLayoutModifierNode;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lr6/c;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/layout/LayoutCoordinates;", "toLookaheadCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/layout/RulerScope;", "rulers", "(IILjava/util/Map;Lr6/c;Lr6/c;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "getApproachNode", "()Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "setApproachNode", "(Landroidx/compose/ui/layout/ApproachLayoutModifierNode;)V", "", "approachMeasureRequired", "Z", "getApproachMeasureRequired$ui_release", "()Z", "setApproachMeasureRequired$ui_release", "(Z)V", "getDensity", "()F", "density", "getFontScale", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Constraints;", "getLookaheadConstraints-msEJaDk", "()J", "lookaheadConstraints", "Landroidx/compose/ui/unit/IntSize;", "getLookaheadSize-YbymL2g", "lookaheadSize", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadScopeCoordinates", "isLookingAhead", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nApproachMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApproachMeasureScope.kt\nandroidx/compose/ui/layout/ApproachMeasureScopeImpl\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,117:1\n113#2,7:118\n113#2,7:128\n56#2,3:136\n60#2:141\n1#3:125\n30#4:126\n80#5:127\n361#6:135\n362#6,2:139\n365#6:142\n*S KotlinDebug\n*F\n+ 1 ApproachMeasureScope.kt\nandroidx/compose/ui/layout/ApproachMeasureScopeImpl\n*L\n59#1:118,7\n79#1:128,7\n99#1:136,3\n99#1:141\n64#1:126\n64#1:127\n99#1:135\n99#1:139,2\n99#1:142\n*E\n"})
/* loaded from: classes2.dex */
public final class ApproachMeasureScopeImpl implements ApproachMeasureScope, MeasureScope, LookaheadScope {
    public static final int $stable = 0;
    private boolean approachMeasureRequired;

    @NotNull
    private ApproachLayoutModifierNode approachNode;

    @NotNull
    private final LayoutModifierNodeCoordinator coordinator;

    public ApproachMeasureScopeImpl(@NotNull LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, @NotNull ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.coordinator = layoutModifierNodeCoordinator;
        this.approachNode = approachLayoutModifierNode;
    }

    /* renamed from: getApproachMeasureRequired$ui_release, reason: from getter */
    public final boolean getApproachMeasureRequired() {
        return this.approachMeasureRequired;
    }

    @NotNull
    public final ApproachLayoutModifierNode getApproachNode() {
        return this.approachNode;
    }

    @NotNull
    public final LayoutModifierNodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.p011ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.p011ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.p011ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadConstraints-msEJaDk */
    public long mo12009getLookaheadConstraintsmsEJaDk() {
        Constraints lookaheadConstraints = this.coordinator.getLookaheadConstraints();
        if (lookaheadConstraints != null) {
            return lookaheadConstraints.getValue();
        }
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Error: Lookahead constraints requested before lookahead measure.");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.p011ui.layout.LookaheadScope
    @NotNull
    public LayoutCoordinates getLookaheadScopeCoordinates(@NotNull Placeable.PlacementScope placementScope) {
        NodeCoordinator innerCoordinator$ui_release;
        LayoutNode lookaheadRoot = this.coordinator.getLayoutNode().getLookaheadRoot();
        if (lookaheadRoot == null) {
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            throw new KotlinNothingValueException();
        }
        if (!lookaheadRoot.getIsVirtualLookaheadRoot()) {
            return lookaheadRoot.getOuterCoordinator$ui_release();
        }
        LayoutNode parent$ui_release = lookaheadRoot.getParent$ui_release();
        return (parent$ui_release == null || (innerCoordinator$ui_release = parent$ui_release.getInnerCoordinator$ui_release()) == null) ? lookaheadRoot.getChildren$ui_release().get(0).getOuterCoordinator$ui_release() : innerCoordinator$ui_release;
    }

    @Override // androidx.compose.p011ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadSize-YbymL2g */
    public long mo12010getLookaheadSizeYbymL2g() {
        LookaheadDelegate lookaheadDelegate = this.coordinator.getLookaheadDelegate();
        AbstractC5830k.m5327d(lookaheadDelegate);
        MeasureResult measureResult$ui_release = lookaheadDelegate.getMeasureResult$ui_release();
        return IntSize.m13471constructorimpl((measureResult$ui_release.getWidth() << 32) | (measureResult$ui_release.getHeight() & 4294967295L));
    }

    @Override // androidx.compose.p011ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    @Override // androidx.compose.p011ui.layout.MeasureScope
    @NotNull
    public MeasureResult layout(int width, int height, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull InterfaceC6471c placementBlock) {
        return this.coordinator.layout(width, height, alignmentLines, placementBlock);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo6896roundToPxR2X_6o(long j7) {
        return this.coordinator.mo6896roundToPxR2X_6o(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo6897roundToPx0680j_4(float f) {
        return this.coordinator.mo6897roundToPx0680j_4(f);
    }

    public final void setApproachMeasureRequired$ui_release(boolean z8) {
        this.approachMeasureRequired = z8;
    }

    public final void setApproachNode(@NotNull ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.approachNode = approachLayoutModifierNode;
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo6898toDpGaN1DYA(long j7) {
        return this.coordinator.mo6898toDpGaN1DYA(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo6899toDpu2uoSUM(float f) {
        return this.coordinator.mo6899toDpu2uoSUM(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo6901toDpSizekrfVVM(long j7) {
        return this.coordinator.mo6901toDpSizekrfVVM(j7);
    }

    @Override // androidx.compose.p011ui.layout.LookaheadScope
    @NotNull
    public LayoutCoordinates toLookaheadCoordinates(@NotNull LayoutCoordinates layoutCoordinates) {
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

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo6902toPxR2X_6o(long j7) {
        return this.coordinator.mo6902toPxR2X_6o(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo6903toPx0680j_4(float f) {
        return this.coordinator.mo6903toPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        return this.coordinator.toRect(dpRect);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo6904toSizeXkaWNTQ(long j7) {
        return this.coordinator.mo6904toSizeXkaWNTQ(j7);
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo6905toSp0xMU5do(float f) {
        return this.coordinator.mo6905toSp0xMU5do(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo6906toSpkPz2Gy4(float f) {
        return this.coordinator.mo6906toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.p011ui.layout.MeasureScope
    @NotNull
    public MeasureResult layout(int width, int height, @NotNull Map<AlignmentLine, Integer> alignmentLines, @Nullable InterfaceC6471c rulers, @NotNull InterfaceC6471c placementBlock) {
        if (!((width & ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & height) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(width, height, alignmentLines, rulers, placementBlock, this) { // from class: androidx.compose.ui.layout.ApproachMeasureScopeImpl.layout.1
            final /* synthetic */ InterfaceC6471c $placementBlock;
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final InterfaceC6471c rulers;
            final /* synthetic */ ApproachMeasureScopeImpl this$0;
            private final int width;

            {
                this.$placementBlock = placementBlock;
                this.this$0 = this;
                this.width = width;
                this.height = height;
                this.alignmentLines = alignmentLines;
                this.rulers = rulers;
            }

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public InterfaceC6471c getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public void placeChildren() {
                this.$placementBlock.invoke(this.this$0.getCoordinator().getPlacementScope());
            }
        };
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo6900toDpu2uoSUM(int i) {
        return this.coordinator.mo6900toDpu2uoSUM(i);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo6907toSpkPz2Gy4(int i) {
        return this.coordinator.mo6907toSpkPz2Gy4(i);
    }
}
