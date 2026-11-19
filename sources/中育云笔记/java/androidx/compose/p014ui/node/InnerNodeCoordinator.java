package androidx.compose.p014ui.node;

import androidx.compose.p014ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Paint;
import androidx.compose.p014ui.graphics.PaintingStyle;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Paint innerBoundsPaint;
    private LookaheadDelegate lookaheadDelegate;
    private final TailModifierNode tail;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.innerBoundsPaint;
        }

        private Companion() {
        }
    }

    public final class LookaheadDelegateImpl extends LookaheadDelegate {
        public LookaheadDelegateImpl() {
            super(InnerNodeCoordinator.this);
        }

        @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            getCachedAlignmentLinesMap().set(alignmentLine, iIntValue);
            return iIntValue;
        }

        @Override // androidx.compose.p014ui.node.LookaheadDelegate, androidx.compose.p014ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i10) {
            return getLayoutNode().maxLookaheadIntrinsicHeight(i10);
        }

        @Override // androidx.compose.p014ui.node.LookaheadDelegate, androidx.compose.p014ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i10) {
            return getLayoutNode().maxLookaheadIntrinsicWidth(i10);
        }

        @Override // androidx.compose.p014ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo32229measureBRTryo0(long j10) {
            m32292setMeasurementConstraintsBRTryo0(j10);
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNodeArr[i10].getLookaheadPassDelegate$ui_release();
                AbstractC9979u.m20291d(lookaheadPassDelegate$ui_release);
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
            }
            set_measureResult(getLayoutNode().getMeasurePolicy().mo26741measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), j10));
            return this;
        }

        @Override // androidx.compose.p014ui.node.LookaheadDelegate, androidx.compose.p014ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i10) {
            return getLayoutNode().minLookaheadIntrinsicHeight(i10);
        }

        @Override // androidx.compose.p014ui.node.LookaheadDelegate, androidx.compose.p014ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i10) {
            return getLayoutNode().minLookaheadIntrinsicWidth(i10);
        }

        @Override // androidx.compose.p014ui.node.LookaheadDelegate
        public void placeChildren() {
            LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLookaheadPassDelegate$ui_release();
            AbstractC9979u.m20291d(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.onNodePlaced$ui_release();
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo30757setColor8_81llA(Color.Companion.m30912getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo30761setStylek9PVt8s(PaintingStyle.Companion.m31146getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }

    public InnerNodeCoordinator(LayoutNode layoutNode) {
        super(layoutNode);
        this.tail = new TailModifierNode();
        getTail().updateCoordinator$ui_release(this);
        this.lookaheadDelegate = layoutNode.getLookaheadRoot$ui_release() != null ? new LookaheadDelegateImpl() : null;
    }

    private final void onAfterPlaceAt() {
        if (isShallowPlacing$ui_release()) {
            return;
        }
        getLayoutNode().getMeasurePassDelegate$ui_release().onNodePlaced$ui_release();
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.calculateAlignmentLine(alignmentLine);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.p014ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new LookaheadDelegateImpl());
        }
    }

    @Override // androidx.compose.p014ui.node.NodeCoordinator
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.p014ui.node.NodeCoordinator
    /* renamed from: hitTestChild-qzLsGqo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo32400hitTestChildqzLsGqo(androidx.compose.ui.node.NodeCoordinator.HitTestSource r11, long r12, androidx.compose.p014ui.node.HitTestResult r14, int r15, boolean r16) {
        /*
            r10 = this;
            androidx.compose.ui.node.LayoutNode r0 = r10.getLayoutNode()
            boolean r0 = r11.shouldHitTestChildren(r0)
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L39
            boolean r0 = r10.m32499withinLayerBoundsk4lQ0M(r12)
            if (r0 == 0) goto L17
            r6 = r15
            r5 = r16
        L15:
            r0 = r4
            goto L3d
        L17:
            androidx.compose.ui.input.pointer.PointerType$Companion r0 = androidx.compose.p014ui.input.pointer.PointerType.Companion
            int r0 = r0.m32182getTouchT8wyACA()
            r6 = r15
            boolean r0 = androidx.compose.p014ui.input.pointer.PointerType.m32175equalsimpl0(r15, r0)
            if (r0 == 0) goto L3a
            long r7 = r10.m32490getMinimumTouchTargetSizeNHjbRc()
            float r0 = r10.m32487distanceInMinimumTouchTargettz77jQw(r12, r7)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r7 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r7
            r7 = 2139095040(0x7f800000, float:Infinity)
            if (r0 >= r7) goto L3a
            goto L15
        L39:
            r6 = r15
        L3a:
            r0 = r5
            r5 = r16
        L3d:
            if (r0 == 0) goto L87
            int r7 = androidx.compose.p014ui.node.HitTestResult.access$getHitDepth$p(r14)
            androidx.compose.ui.node.LayoutNode r0 = r10.getLayoutNode()
            androidx.compose.runtime.collection.MutableVector r0 = r0.getZSortedChildren()
            T[] r8 = r0.content
            int r0 = r0.getSize()
            int r0 = r0 - r4
            r9 = r0
        L53:
            if (r9 < 0) goto L84
            r0 = r8[r9]
            androidx.compose.ui.node.LayoutNode r0 = (androidx.compose.p014ui.node.LayoutNode) r0
            boolean r4 = r0.isPlaced()
            if (r4 == 0) goto L7e
            r1 = r6
            r6 = r5
            r5 = r1
            r2 = r12
            r4 = r14
            r1 = r0
            r0 = r11
            r0.mo32500childHitTestqzLsGqo(r1, r2, r4, r5, r6)
            boolean r0 = r14.hasHit()
            if (r0 != 0) goto L70
            goto L7f
        L70:
            androidx.compose.ui.node.NodeCoordinator r0 = r1.getOuterCoordinator$ui_release()
            boolean r0 = r0.shouldSharePointerInputWithSiblings()
            if (r0 == 0) goto L84
            r14.acceptHits()
            goto L7f
        L7e:
            r6 = r5
        L7f:
            int r9 = r9 + (-1)
            r5 = r6
            r6 = r15
            goto L53
        L84:
            androidx.compose.p014ui.node.HitTestResult.access$setHitDepth$p(r14, r7)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.node.InnerNodeCoordinator.mo32400hitTestChildqzLsGqo(androidx.compose.ui.node.NodeCoordinator$HitTestSource, long, androidx.compose.ui.node.HitTestResult, int, boolean):void");
    }

    @Override // androidx.compose.p014ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i10) {
        return getLayoutNode().maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p014ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i10) {
        return getLayoutNode().maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p014ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public Placeable mo32229measureBRTryo0(long j10) {
        if (getForceMeasureWithLookaheadConstraints$ui_release()) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            AbstractC9979u.m20291d(lookaheadDelegate);
            j10 = lookaheadDelegate.m32435getConstraintsmsEJaDk$ui_release();
        }
        m32292setMeasurementConstraintsBRTryo0(j10);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            layoutNodeArr[i10].getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
        }
        setMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().mo26741measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), j10));
        onMeasured();
        return this;
    }

    @Override // androidx.compose.p014ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i10) {
        return getLayoutNode().minIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p014ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i10) {
        return getLayoutNode().minIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p014ui.node.NodeCoordinator
    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
        LayoutNode[] layoutNodeArr = zSortedChildren.content;
        int size = zSortedChildren.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            if (layoutNode.isPlaced()) {
                layoutNode.draw$ui_release(canvas, graphicsLayer);
            }
        }
        if (ownerRequireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, innerBoundsPaint);
        }
    }

    @Override // androidx.compose.p014ui.node.NodeCoordinator, androidx.compose.p014ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo32290placeAtf8xVGno(long j10, float f10, GraphicsLayer graphicsLayer) {
        super.mo32290placeAtf8xVGno(j10, f10, graphicsLayer);
        onAfterPlaceAt();
    }

    @Override // androidx.compose.p014ui.node.NodeCoordinator
    public void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @Override // androidx.compose.p014ui.node.NodeCoordinator
    public TailModifierNode getTail() {
        return this.tail;
    }

    @Override // androidx.compose.p014ui.node.NodeCoordinator, androidx.compose.p014ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo32230placeAtf8xVGno(long j10, float f10, InterfaceC9540l interfaceC9540l) {
        super.mo32230placeAtf8xVGno(j10, f10, interfaceC9540l);
        onAfterPlaceAt();
    }
}
