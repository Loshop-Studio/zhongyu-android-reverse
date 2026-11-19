package androidx.compose.p014ui.node;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Paint;
import androidx.compose.p014ui.graphics.PaintingStyle;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.ApproachLayoutModifierNode;
import androidx.compose.p014ui.layout.ApproachMeasureScopeImpl;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Paint modifierBoundsPaint;
    private ApproachMeasureScopeImpl approachMeasureScope;
    private LayoutModifierNode layoutModifierNode;
    private Constraints lookaheadConstraints;
    private LookaheadDelegate lookaheadDelegate;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Paint getModifierBoundsPaint() {
            return LayoutModifierNodeCoordinator.modifierBoundsPaint;
        }

        private Companion() {
        }
    }

    public final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        public LookaheadDelegateForLayoutModifierNode() {
            super(LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            int iCalculateAlignmentAndPlaceChildAsNeeded = LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            getCachedAlignmentLinesMap().set(alignmentLine, iCalculateAlignmentAndPlaceChildAsNeeded);
            return iCalculateAlignmentAndPlaceChildAsNeeded;
        }

        @Override // androidx.compose.p014ui.node.LookaheadDelegate, androidx.compose.p014ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i10) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            AbstractC9979u.m20291d(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicHeight(this, lookaheadDelegate, i10);
        }

        @Override // androidx.compose.p014ui.node.LookaheadDelegate, androidx.compose.p014ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i10) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            AbstractC9979u.m20291d(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicWidth(this, lookaheadDelegate, i10);
        }

        @Override // androidx.compose.p014ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo32229measureBRTryo0(long j10) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            m32292setMeasurementConstraintsBRTryo0(j10);
            layoutModifierNodeCoordinator.m32403setLookaheadConstraints_Sx5XlM$ui_release(Constraints.m33441boximpl(j10));
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            AbstractC9979u.m20291d(lookaheadDelegate);
            set_measureResult(layoutModifierNode.mo26769measure3p2s80s(this, lookaheadDelegate, j10));
            return this;
        }

        @Override // androidx.compose.p014ui.node.LookaheadDelegate, androidx.compose.p014ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i10) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            AbstractC9979u.m20291d(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicHeight(this, lookaheadDelegate, i10);
        }

        @Override // androidx.compose.p014ui.node.LookaheadDelegate, androidx.compose.p014ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i10) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            AbstractC9979u.m20291d(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicWidth(this, lookaheadDelegate, i10);
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo30757setColor8_81llA(Color.Companion.m30905getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo30761setStylek9PVt8s(PaintingStyle.Companion.m31146getStrokeTiuSbCo());
        modifierBoundsPaint = Paint;
    }

    public LayoutModifierNodeCoordinator(LayoutNode layoutNode, LayoutModifierNode layoutModifierNode) {
        super(layoutNode);
        this.layoutModifierNode = layoutModifierNode;
        ApproachMeasureScopeImpl approachMeasureScopeImpl = null;
        this.lookaheadDelegate = layoutNode.getLookaheadRoot$ui_release() != null ? new LookaheadDelegateForLayoutModifierNode() : null;
        if ((layoutModifierNode.getNode().getKindSet$ui_release() & NodeKind.m32510constructorimpl(512)) != 0) {
            AbstractC9979u.m20292e(layoutModifierNode, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, (ApproachLayoutModifierNode) layoutModifierNode);
        }
        this.approachMeasureScope = approachMeasureScopeImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onAfterPlaceAt() {
        /*
            r7 = this;
            boolean r0 = r7.isShallowPlacing$ui_release()
            if (r0 == 0) goto L7
            return
        L7:
            r7.onPlaced()
            androidx.compose.ui.layout.ApproachMeasureScopeImpl r0 = r7.approachMeasureScope
            r1 = 0
            if (r0 == 0) goto L73
            androidx.compose.ui.layout.ApproachLayoutModifierNode r2 = r0.getApproachNode()
            androidx.compose.ui.layout.Placeable$PlacementScope r3 = r7.getPlacementScope()
            androidx.compose.ui.node.LookaheadDelegate r4 = r7.getLookaheadDelegate()
            kotlin.jvm.internal.AbstractC9979u.m20291d(r4)
            androidx.compose.ui.layout.LookaheadLayoutCoordinates r4 = r4.getLookaheadLayoutCoordinates()
            boolean r2 = r2.isPlacementApproachInProgress(r3, r4)
            if (r2 != 0) goto L6b
            boolean r0 = r0.getApproachMeasureRequired$ui_release()
            if (r0 != 0) goto L6b
            long r2 = r7.mo32237getSizeYbymL2g()
            androidx.compose.ui.node.LookaheadDelegate r0 = r7.getLookaheadDelegate()
            r4 = 0
            if (r0 == 0) goto L42
            long r5 = r0.m32436getSizeYbymL2g$ui_release()
            androidx.compose.ui.unit.IntSize r0 = androidx.compose.p014ui.unit.IntSize.m33664boximpl(r5)
            goto L43
        L42:
            r0 = r4
        L43:
            boolean r0 = androidx.compose.p014ui.unit.IntSize.m33669equalsimpl(r2, r0)
            if (r0 == 0) goto L6b
            androidx.compose.ui.node.NodeCoordinator r0 = r7.getWrappedNonNull()
            long r2 = r0.mo32237getSizeYbymL2g()
            androidx.compose.ui.node.NodeCoordinator r0 = r7.getWrappedNonNull()
            androidx.compose.ui.node.LookaheadDelegate r0 = r0.getLookaheadDelegate()
            if (r0 == 0) goto L63
            long r4 = r0.m32436getSizeYbymL2g$ui_release()
            androidx.compose.ui.unit.IntSize r4 = androidx.compose.p014ui.unit.IntSize.m33664boximpl(r4)
        L63:
            boolean r0 = androidx.compose.p014ui.unit.IntSize.m33669equalsimpl(r2, r4)
            if (r0 == 0) goto L6b
            r0 = 1
            goto L6c
        L6b:
            r0 = r1
        L6c:
            androidx.compose.ui.node.NodeCoordinator r2 = r7.getWrappedNonNull()
            r2.setForcePlaceWithLookaheadOffset$ui_release(r0)
        L73:
            androidx.compose.ui.layout.MeasureResult r0 = r7.getMeasureResult$ui_release()
            r0.placeChildren()
            androidx.compose.ui.node.NodeCoordinator r0 = r7.getWrappedNonNull()
            r0.setForcePlaceWithLookaheadOffset$ui_release(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.node.LayoutModifierNodeCoordinator.onAfterPlaceAt():void");
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        return lookaheadDelegate != null ? lookaheadDelegate.getCachedAlignmentLine$ui_release(alignmentLine) : LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
    }

    @Override // androidx.compose.p014ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateForLayoutModifierNode());
        }
    }

    public final LayoutModifierNode getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    /* renamed from: getLookaheadConstraints-DWUhwKw$ui_release, reason: not valid java name */
    public final Constraints m32402getLookaheadConstraintsDWUhwKw$ui_release() {
        return this.lookaheadConstraints;
    }

    @Override // androidx.compose.p014ui.node.NodeCoordinator
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.p014ui.node.NodeCoordinator
    public Modifier.Node getTail() {
        return this.layoutModifierNode.getNode();
    }

    public final NodeCoordinator getWrappedNonNull() {
        NodeCoordinator wrapped$ui_release = getWrapped$ui_release();
        AbstractC9979u.m20291d(wrapped$ui_release);
        return wrapped$ui_release;
    }

    @Override // androidx.compose.p014ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i10) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().maxApproachIntrinsicHeight(approachMeasureScopeImpl, getWrappedNonNull(), i10) : this.layoutModifierNode.maxIntrinsicHeight(this, getWrappedNonNull(), i10);
    }

    @Override // androidx.compose.p014ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i10) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().maxApproachIntrinsicWidth(approachMeasureScopeImpl, getWrappedNonNull(), i10) : this.layoutModifierNode.maxIntrinsicWidth(this, getWrappedNonNull(), i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    @Override // androidx.compose.p014ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.p014ui.layout.Placeable mo32229measureBRTryo0(long r7) {
        /*
            r6 = this;
            boolean r0 = r6.getForceMeasureWithLookaheadConstraints$ui_release()
            if (r0 == 0) goto L17
            androidx.compose.ui.unit.Constraints r7 = r6.lookaheadConstraints
            if (r7 == 0) goto Lf
            long r7 = r7.m33460unboximpl()
            goto L17
        Lf:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Lookahead constraints cannot be null in approach pass."
            r7.<init>(r8)
            throw r7
        L17:
            androidx.compose.p014ui.node.NodeCoordinator.m32472access$setMeasurementConstraintsBRTryo0(r6, r7)
            androidx.compose.ui.layout.ApproachMeasureScopeImpl r0 = access$getApproachMeasureScope$p(r6)
            if (r0 == 0) goto Lb2
            androidx.compose.ui.layout.ApproachLayoutModifierNode r1 = r0.getApproachNode()
            long r2 = r0.mo32206getLookaheadSizeYbymL2g()
            boolean r2 = r1.mo26775isMeasurementApproachInProgressozmzZPI(r2)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L3d
            androidx.compose.ui.unit.Constraints r2 = r6.m32402getLookaheadConstraintsDWUhwKw$ui_release()
            boolean r2 = androidx.compose.p014ui.unit.Constraints.m33446equalsimpl(r7, r2)
            if (r2 != 0) goto L3b
            goto L3d
        L3b:
            r2 = r4
            goto L3e
        L3d:
            r2 = r3
        L3e:
            r0.setApproachMeasureRequired$ui_release(r2)
            boolean r2 = r0.getApproachMeasureRequired$ui_release()
            if (r2 != 0) goto L4e
            androidx.compose.ui.node.NodeCoordinator r2 = r6.getWrappedNonNull()
            r2.setForceMeasureWithLookaheadConstraints$ui_release(r3)
        L4e:
            androidx.compose.ui.node.NodeCoordinator r2 = r6.getWrappedNonNull()
            androidx.compose.ui.layout.MeasureResult r7 = r1.mo26774approachMeasure3p2s80s(r0, r2, r7)
            androidx.compose.ui.node.NodeCoordinator r8 = r6.getWrappedNonNull()
            r8.setForceMeasureWithLookaheadConstraints$ui_release(r4)
            int r8 = r7.getWidth()
            androidx.compose.ui.node.LookaheadDelegate r1 = r6.getLookaheadDelegate()
            kotlin.jvm.internal.AbstractC9979u.m20291d(r1)
            int r1 = r1.getWidth()
            if (r8 != r1) goto L80
            int r8 = r7.getHeight()
            androidx.compose.ui.node.LookaheadDelegate r1 = r6.getLookaheadDelegate()
            kotlin.jvm.internal.AbstractC9979u.m20291d(r1)
            int r1 = r1.getHeight()
            if (r8 != r1) goto L80
            goto L81
        L80:
            r3 = r4
        L81:
            boolean r8 = r0.getApproachMeasureRequired$ui_release()
            if (r8 != 0) goto Lbe
            androidx.compose.ui.node.NodeCoordinator r8 = r6.getWrappedNonNull()
            long r0 = r8.mo32237getSizeYbymL2g()
            androidx.compose.ui.node.NodeCoordinator r8 = r6.getWrappedNonNull()
            androidx.compose.ui.node.LookaheadDelegate r8 = r8.getLookaheadDelegate()
            if (r8 == 0) goto La2
            long r4 = r8.m32436getSizeYbymL2g$ui_release()
            androidx.compose.ui.unit.IntSize r8 = androidx.compose.p014ui.unit.IntSize.m33664boximpl(r4)
            goto La3
        La2:
            r8 = 0
        La3:
            boolean r8 = androidx.compose.p014ui.unit.IntSize.m33669equalsimpl(r0, r8)
            if (r8 == 0) goto Lbe
            if (r3 != 0) goto Lbe
            androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1 r8 = new androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1
            r8.<init>(r6)
            r7 = r8
            goto Lbe
        Lb2:
            androidx.compose.ui.node.LayoutModifierNode r0 = r6.getLayoutModifierNode()
            androidx.compose.ui.node.NodeCoordinator r1 = r6.getWrappedNonNull()
            androidx.compose.ui.layout.MeasureResult r7 = r0.mo26769measure3p2s80s(r6, r1, r7)
        Lbe:
            r6.setMeasureResult$ui_release(r7)
            r6.onMeasured()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.node.LayoutModifierNodeCoordinator.mo32229measureBRTryo0(long):androidx.compose.ui.layout.Placeable");
    }

    @Override // androidx.compose.p014ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i10) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().minApproachIntrinsicHeight(approachMeasureScopeImpl, getWrappedNonNull(), i10) : this.layoutModifierNode.minIntrinsicHeight(this, getWrappedNonNull(), i10);
    }

    @Override // androidx.compose.p014ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i10) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().minApproachIntrinsicWidth(approachMeasureScopeImpl, getWrappedNonNull(), i10) : this.layoutModifierNode.minIntrinsicWidth(this, getWrappedNonNull(), i10);
    }

    @Override // androidx.compose.p014ui.node.NodeCoordinator
    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        getWrappedNonNull().draw(canvas, graphicsLayer);
        if (LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds()) {
            drawBorder(canvas, modifierBoundsPaint);
        }
    }

    @Override // androidx.compose.p014ui.node.NodeCoordinator, androidx.compose.p014ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo32290placeAtf8xVGno(long j10, float f10, GraphicsLayer graphicsLayer) {
        super.mo32290placeAtf8xVGno(j10, f10, graphicsLayer);
        onAfterPlaceAt();
    }

    public final void setLayoutModifierNode$ui_release(LayoutModifierNode layoutModifierNode) {
        if (!AbstractC9979u.m20289b(layoutModifierNode, this.layoutModifierNode)) {
            Modifier.Node node = layoutModifierNode.getNode();
            if ((node.getKindSet$ui_release() & NodeKind.m32510constructorimpl(512)) != 0) {
                AbstractC9979u.m20292e(layoutModifierNode, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                ApproachLayoutModifierNode approachLayoutModifierNode = (ApproachLayoutModifierNode) layoutModifierNode;
                ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
                if (approachMeasureScopeImpl != null) {
                    approachMeasureScopeImpl.setApproachNode(approachLayoutModifierNode);
                } else {
                    approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, approachLayoutModifierNode);
                }
                this.approachMeasureScope = approachMeasureScopeImpl;
            } else {
                this.approachMeasureScope = null;
            }
        }
        this.layoutModifierNode = layoutModifierNode;
    }

    /* renamed from: setLookaheadConstraints-_Sx5XlM$ui_release, reason: not valid java name */
    public final void m32403setLookaheadConstraints_Sx5XlM$ui_release(Constraints constraints) {
        this.lookaheadConstraints = constraints;
    }

    @Override // androidx.compose.p014ui.node.NodeCoordinator
    public void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @Override // androidx.compose.p014ui.node.NodeCoordinator, androidx.compose.p014ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo32230placeAtf8xVGno(long j10, float f10, InterfaceC9540l interfaceC9540l) {
        super.mo32230placeAtf8xVGno(j10, f10, interfaceC9540l);
        onAfterPlaceAt();
    }
}
