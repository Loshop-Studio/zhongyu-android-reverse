package androidx.compose.p013ui.node;

import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class MeasurePassDelegate extends Placeable implements Measurable, AlignmentLinesOwner, MotionReferencePlacementDelegate {
    public static final int $stable = 8;
    private final MutableVector<MeasurePassDelegate> _childDelegates;
    private final AlignmentLines alignmentLines;
    private boolean childDelegatesDirty;
    private boolean duringAlignmentLinesQuery;
    private boolean isPlaced;
    private boolean isPlacedByParent;
    private boolean isPlacedUnderMotionFrameOfReference;
    private GraphicsLayer lastExplicitLayer;
    private InterfaceC10570l lastLayerBlock;
    private long lastPosition;
    private float lastZIndex;
    private boolean layingOutChildren;
    private final InterfaceC10559a layoutChildrenBlock;
    private final LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
    private boolean layoutPending;
    private boolean layoutPendingForAlignment;
    private boolean measurePending;
    private boolean measuredOnce;
    private boolean needsCoordinatesUpdate;
    private boolean onNodePlacedCalled;
    private Object parentData;
    private boolean parentDataDirty;
    private final InterfaceC10559a performMeasureBlock;
    private long performMeasureConstraints;
    private final InterfaceC10559a placeOuterCoordinatorBlock;
    private GraphicsLayer placeOuterCoordinatorLayer;
    private InterfaceC10570l placeOuterCoordinatorLayerBlock;
    private long placeOuterCoordinatorPosition;
    private float placeOuterCoordinatorZIndex;
    private boolean placedOnce;
    private boolean relayoutWithoutParentInProgress;
    private float zIndex;
    private int previousPlaceOrder = Integer.MAX_VALUE;
    private int placeOrder = Integer.MAX_VALUE;
    private LayoutNode.UsageByParent measuredByParent = LayoutNode.UsageByParent.NotUsed;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public MeasurePassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.layoutNodeLayoutDelegate = layoutNodeLayoutDelegate;
        IntOffset.Companion companion = IntOffset.Companion;
        this.lastPosition = companion.m27038getZeronOccac();
        this.parentDataDirty = true;
        this.alignmentLines = new LayoutNodeAlignmentLines(this);
        this._childDelegates = new MutableVector<>(new MeasurePassDelegate[16], 0);
        this.childDelegatesDirty = true;
        this.performMeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.performMeasureBlock = new InterfaceC10559a() { // from class: androidx.compose.ui.node.MeasurePassDelegate$performMeasureBlock$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m25858invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m25858invoke() {
                this.this$0.getOuterCoordinator().mo25627measureBRTryo0(this.this$0.performMeasureConstraints);
            }
        };
        this.layoutChildrenBlock = new InterfaceC10559a() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m25857invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m25857invoke() {
                this.this$0.clearPlaceOrder();
                this.this$0.forEachChildAlignmentLinesOwner(new InterfaceC10570l() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.1
                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((AlignmentLinesOwner) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
                        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
                    }
                });
                this.this$0.getInnerCoordinator().getMeasureResult$ui_release().placeChildren();
                this.this$0.checkChildrenPlaceOrderForUpdates();
                this.this$0.forEachChildAlignmentLinesOwner(new InterfaceC10570l() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.2
                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((AlignmentLinesOwner) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
                        alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout$ui_release());
                    }
                });
            }
        };
        this.placeOuterCoordinatorPosition = companion.m27038getZeronOccac();
        this.placeOuterCoordinatorBlock = new InterfaceC10559a() { // from class: androidx.compose.ui.node.MeasurePassDelegate$placeOuterCoordinatorBlock$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m25859invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m25859invoke() {
                Placeable.PlacementScope placementScope;
                NodeCoordinator wrappedBy$ui_release = this.this$0.getOuterCoordinator().getWrappedBy$ui_release();
                if (wrappedBy$ui_release == null || (placementScope = wrappedBy$ui_release.getPlacementScope()) == null) {
                    placementScope = LayoutNodeKt.requireOwner(this.this$0.getLayoutNode()).getPlacementScope();
                }
                Placeable.PlacementScope placementScope2 = placementScope;
                MeasurePassDelegate measurePassDelegate = this.this$0;
                InterfaceC10570l interfaceC10570l = measurePassDelegate.placeOuterCoordinatorLayerBlock;
                GraphicsLayer graphicsLayer = measurePassDelegate.placeOuterCoordinatorLayer;
                if (graphicsLayer != null) {
                    placementScope2.m25706placeWithLayeraW9wM(measurePassDelegate.getOuterCoordinator(), measurePassDelegate.placeOuterCoordinatorPosition, graphicsLayer, measurePassDelegate.placeOuterCoordinatorZIndex);
                } else if (interfaceC10570l == null) {
                    placementScope2.m25697place70tqf50(measurePassDelegate.getOuterCoordinator(), measurePassDelegate.placeOuterCoordinatorPosition, measurePassDelegate.placeOuterCoordinatorZIndex);
                } else {
                    placementScope2.m25705placeWithLayeraW9wM(measurePassDelegate.getOuterCoordinator(), measurePassDelegate.placeOuterCoordinatorPosition, measurePassDelegate.placeOuterCoordinatorZIndex, interfaceC10570l);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkChildrenPlaceOrderForUpdates() {
        LayoutNode layoutNode = getLayoutNode();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = layoutNodeArr[i10];
            if (layoutNode2.getMeasurePassDelegate$ui_release().previousPlaceOrder != layoutNode2.getPlaceOrder$ui_release()) {
                layoutNode.onZSortedChildrenInvalidated$ui_release();
                layoutNode.invalidateLayer$ui_release();
                if (layoutNode2.getPlaceOrder$ui_release() == Integer.MAX_VALUE) {
                    if (layoutNode2.getLayoutDelegate$ui_release().getDetachedFromParentLookaheadPlacement$ui_release()) {
                        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode2.getLookaheadPassDelegate$ui_release();
                        AbstractC9133u.m16130d(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.markNodeAndSubtreeAsNotPlaced$ui_release(false);
                    }
                    layoutNode2.getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPlaceOrder() {
        this.layoutNodeLayoutDelegate.setNextChildPlaceOrder$ui_release(0);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            MeasurePassDelegate measurePassDelegate$ui_release = layoutNodeArr[i10].getMeasurePassDelegate$ui_release();
            measurePassDelegate$ui_release.previousPlaceOrder = measurePassDelegate$ui_release.placeOrder;
            measurePassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
            measurePassDelegate$ui_release.isPlacedByParent = false;
            if (measurePassDelegate$ui_release.measuredByParent == LayoutNode.UsageByParent.InLayoutBlock) {
                measurePassDelegate$ui_release.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            }
        }
    }

    private final void forEachChildDelegate(InterfaceC10570l interfaceC10570l) {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC10570l.invoke(layoutNodeArr[i10].getMeasurePassDelegate$ui_release());
        }
    }

    private final LookaheadPassDelegate getLookaheadPassDelegate() {
        return this.layoutNodeLayoutDelegate.getLookaheadPassDelegate$ui_release();
    }

    private final void markNodeAndSubtreeAsPlaced() {
        boolean zIsPlaced = isPlaced();
        setPlaced$ui_release(true);
        LayoutNode layoutNode = getLayoutNode();
        if (!zIsPlaced) {
            layoutNode.getInnerCoordinator$ui_release().onPlaced();
            if (layoutNode.getMeasurePending$ui_release()) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode, true, false, false, 6, null);
            } else if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, false, 6, null);
            }
        }
        NodeCoordinator wrapped$ui_release = layoutNode.getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); !AbstractC9133u.m16128b(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped$ui_release()) {
                outerCoordinator$ui_release.invalidateLayer();
            }
        }
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = layoutNodeArr[i10];
            if (layoutNode2.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                layoutNode2.getMeasurePassDelegate$ui_release().markNodeAndSubtreeAsPlaced();
                layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode2);
            }
        }
    }

    private final void markSubtreeAsNotPlaced() {
        if (isPlaced()) {
            setPlaced$ui_release(false);
            LayoutNode layoutNode = getLayoutNode();
            NodeCoordinator wrapped$ui_release = layoutNode.getInnerCoordinator$ui_release().getWrapped$ui_release();
            for (NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); !AbstractC9133u.m16128b(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                outerCoordinator$ui_release.onUnplaced();
                outerCoordinator$ui_release.releaseLayer();
            }
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                layoutNodeArr[i10].getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
            }
        }
    }

    private final void onBeforeLayoutChildren() {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            if (layoutNode.getMeasurePending$ui_release() && layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.m25805remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null)) {
                LayoutNode.requestRemeasure$ui_release$default(getLayoutNode(), false, false, false, 7, null);
            }
        }
    }

    private final void onIntrinsicsQueried() {
        LayoutNode.requestRemeasure$ui_release$default(getLayoutNode(), false, false, false, 7, null);
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        if (parent$ui_release == null || getLayoutNode().getIntrinsicsUsageByParent$ui_release() != LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        LayoutNode layoutNode = getLayoutNode();
        int i10 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
        layoutNode.setIntrinsicsUsageByParent$ui_release(i10 != 1 ? i10 != 2 ? parent$ui_release.getIntrinsicsUsageByParent$ui_release() : LayoutNode.UsageByParent.InLayoutBlock : LayoutNode.UsageByParent.InMeasureBlock);
    }

    /* renamed from: placeOuterCoordinator-MLgxB_4, reason: not valid java name */
    private final void m25851placeOuterCoordinatorMLgxB_4(long j10, float f10, InterfaceC10570l interfaceC10570l, GraphicsLayer graphicsLayer) {
        if (getLayoutNode().isDeactivated()) {
            InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
        }
        setLayoutState(LayoutNode.LayoutState.LayingOut);
        boolean z10 = !this.placedOnce;
        this.lastPosition = j10;
        this.lastZIndex = f10;
        this.lastLayerBlock = interfaceC10570l;
        this.lastExplicitLayer = graphicsLayer;
        this.placedOnce = true;
        this.onNodePlacedCalled = false;
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        ownerRequireOwner.getRectManager().m26151onLayoutPositionChanged70tqf50(getLayoutNode(), j10, z10);
        if (this.layoutPending || !isPlaced()) {
            getAlignmentLines().setUsedByModifierLayout$ui_release(false);
            this.layoutNodeLayoutDelegate.setCoordinatesAccessedDuringModifierPlacement(false);
            this.placeOuterCoordinatorLayerBlock = interfaceC10570l;
            this.placeOuterCoordinatorPosition = j10;
            this.placeOuterCoordinatorZIndex = f10;
            this.placeOuterCoordinatorLayer = graphicsLayer;
            ownerRequireOwner.getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(getLayoutNode(), false, this.placeOuterCoordinatorBlock);
        } else {
            getOuterCoordinator().m25893placeSelfApparentToRealOffsetMLgxB_4(j10, f10, interfaceC10570l, graphicsLayer);
            onNodePlaced$ui_release();
        }
        setLayoutState(LayoutNode.LayoutState.Idle);
    }

    /* renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m25852placeSelfMLgxB_4(long j10, float f10, InterfaceC10570l interfaceC10570l, GraphicsLayer graphicsLayer) {
        Placeable.PlacementScope placementScope;
        this.isPlacedByParent = true;
        if (!IntOffset.m27026equalsimpl0(j10, this.lastPosition) || this.needsCoordinatesUpdate) {
            if (this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement() || this.needsCoordinatesUpdate) {
                this.layoutPending = true;
                this.needsCoordinatesUpdate = false;
            }
            notifyChildrenUsingCoordinatesWhilePlacing();
        }
        LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        if (lookaheadPassDelegate != null && lookaheadPassDelegate.getNeedsToBePlacedInApproach()) {
            NodeCoordinator wrappedBy$ui_release = getOuterCoordinator().getWrappedBy$ui_release();
            if (wrappedBy$ui_release == null || (placementScope = wrappedBy$ui_release.getPlacementScope()) == null) {
                placementScope = LayoutNodeKt.requireOwner(getLayoutNode()).getPlacementScope();
            }
            Placeable.PlacementScope placementScope2 = placementScope;
            LookaheadPassDelegate lookaheadPassDelegate2 = getLookaheadPassDelegate();
            AbstractC9133u.m16130d(lookaheadPassDelegate2);
            LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
            if (parent$ui_release != null) {
                parent$ui_release.getLayoutDelegate$ui_release().setNextChildLookaheadPlaceOrder$ui_release(0);
            }
            lookaheadPassDelegate2.setPlaceOrder$ui_release(Integer.MAX_VALUE);
            Placeable.PlacementScope.place$default(placementScope2, lookaheadPassDelegate2, IntOffset.m27027getXimpl(j10), IntOffset.m27028getYimpl(j10), 0.0f, 4, null);
        }
        LookaheadPassDelegate lookaheadPassDelegate3 = getLookaheadPassDelegate();
        if ((lookaheadPassDelegate3 == null || lookaheadPassDelegate3.getPlacedOnce$ui_release()) ? false : true) {
            InlineClassHelperKt.throwIllegalStateException("Error: Placement happened before lookahead.");
        }
        m25851placeOuterCoordinatorMLgxB_4(j10, f10, interfaceC10570l, graphicsLayer);
    }

    private final void trackMeasurementByParent(LayoutNode layoutNode) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (parent$ui_release == null) {
            this.measuredByParent = LayoutNode.UsageByParent.NotUsed;
            return;
        }
        if (!(this.measuredByParent == LayoutNode.UsageByParent.NotUsed || layoutNode.getCanMultiMeasure$ui_release())) {
            InlineClassHelperKt.throwIllegalStateException(LayoutNodeLayoutDelegateKt.MeasuredTwiceErrorMessage);
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
        if (i10 == 1) {
            usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
            }
            usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
        }
        this.measuredByParent = usageByParent;
    }

    @Override // androidx.compose.p013ui.node.AlignmentLinesOwner
    public Map<AlignmentLine, Integer> calculateAlignmentLines() {
        if (!this.duringAlignmentLinesQuery) {
            if (getLayoutState() == LayoutNode.LayoutState.Measuring) {
                getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                if (getAlignmentLines().getDirty$ui_release()) {
                    markLayoutPending();
                }
            } else {
                getAlignmentLines().setUsedByModifierLayout$ui_release(true);
            }
        }
        getInnerCoordinator().setPlacingForAlignment$ui_release(true);
        layoutChildren();
        getInnerCoordinator().setPlacingForAlignment$ui_release(false);
        return getAlignmentLines().getLastCalculation();
    }

    @Override // androidx.compose.p013ui.node.AlignmentLinesOwner
    public void forEachChildAlignmentLinesOwner(InterfaceC10570l interfaceC10570l) {
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC10570l.invoke(layoutNodeArr[i10].getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release());
        }
    }

    @Override // androidx.compose.p013ui.layout.Measured
    public int get(AlignmentLine alignmentLine) {
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.Measuring) {
            getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
        } else {
            LayoutNode parent$ui_release2 = getLayoutNode().getParent$ui_release();
            if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LayingOut) {
                getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        int i10 = getOuterCoordinator().get(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return i10;
    }

    @Override // androidx.compose.p013ui.node.AlignmentLinesOwner
    public AlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    public final List<MeasurePassDelegate> getChildDelegates$ui_release() {
        getLayoutNode().updateChildrenIfDirty$ui_release();
        if (!this.childDelegatesDirty) {
            return this._childDelegates.asMutableList();
        }
        LayoutNode layoutNode = getLayoutNode();
        MutableVector<MeasurePassDelegate> mutableVector = this._childDelegates;
        MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = layoutNodeArr[i10];
            if (mutableVector.getSize() <= i10) {
                mutableVector.add(layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
            } else {
                mutableVector.set(i10, layoutNode2.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release());
            }
        }
        mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
        this.childDelegatesDirty = false;
        return this._childDelegates.asMutableList();
    }

    public final boolean getChildDelegatesDirty$ui_release() {
        return this.childDelegatesDirty;
    }

    public final boolean getDuringAlignmentLinesQuery$ui_release() {
        return this.duringAlignmentLinesQuery;
    }

    @Override // androidx.compose.p013ui.node.AlignmentLinesOwner
    public NodeCoordinator getInnerCoordinator() {
        return getLayoutNode().getInnerCoordinator$ui_release();
    }

    /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final Constraints m25853getLastConstraintsDWUhwKw() {
        if (this.measuredOnce) {
            return Constraints.m26839boximpl(m25687getMeasurementConstraintsmsEJaDk());
        }
        return null;
    }

    /* renamed from: getLastPosition-nOcc-ac$ui_release, reason: not valid java name */
    public final long m25854getLastPositionnOccac$ui_release() {
        return this.lastPosition;
    }

    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNodeLayoutDelegate.getLayoutNode$ui_release();
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutPending;
    }

    public final LayoutNode.LayoutState getLayoutState() {
        return this.layoutNodeLayoutDelegate.getLayoutState$ui_release();
    }

    public final boolean getMeasurePending$ui_release() {
        return this.measurePending;
    }

    public final LayoutNode.UsageByParent getMeasuredByParent$ui_release() {
        return this.measuredByParent;
    }

    @Override // androidx.compose.p013ui.layout.Placeable, androidx.compose.p013ui.layout.Measured
    public int getMeasuredHeight() {
        return getOuterCoordinator().getMeasuredHeight();
    }

    @Override // androidx.compose.p013ui.layout.Placeable, androidx.compose.p013ui.layout.Measured
    public int getMeasuredWidth() {
        return getOuterCoordinator().getMeasuredWidth();
    }

    public final NodeCoordinator getOuterCoordinator() {
        return this.layoutNodeLayoutDelegate.getOuterCoordinator();
    }

    @Override // androidx.compose.p013ui.node.AlignmentLinesOwner
    public AlignmentLinesOwner getParentAlignmentLinesOwner() {
        LayoutNodeLayoutDelegate layoutDelegate$ui_release;
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        if (parent$ui_release == null || (layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release()) == null) {
            return null;
        }
        return layoutDelegate$ui_release.getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.p013ui.layout.Measured, androidx.compose.p013ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.parentData;
    }

    public final InterfaceC10559a getPerformMeasureBlock$ui_release() {
        return this.performMeasureBlock;
    }

    public final int getPlaceOrder$ui_release() {
        return this.placeOrder;
    }

    public final int getPreviousPlaceOrder$ui_release() {
        return this.previousPlaceOrder;
    }

    public final float getZIndex$ui_release() {
        return this.zIndex;
    }

    public final void invalidateIntrinsicsParent(boolean z10) {
        LayoutNode layoutNode;
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = getLayoutNode().getIntrinsicsUsageByParent$ui_release();
        if (parent$ui_release == null || intrinsicsUsageByParent$ui_release == LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        do {
            layoutNode = parent$ui_release;
            if (layoutNode.getIntrinsicsUsageByParent$ui_release() != intrinsicsUsageByParent$ui_release) {
                break;
            } else {
                parent$ui_release = layoutNode.getParent$ui_release();
            }
        } while (parent$ui_release != null);
        int i10 = WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent$ui_release.ordinal()];
        if (i10 == 1) {
            LayoutNode.requestRemeasure$ui_release$default(layoutNode, z10, false, false, 6, null);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            layoutNode.requestRelayout$ui_release(z10);
        }
    }

    public final void invalidateParentData() {
        this.parentDataDirty = true;
    }

    @Override // androidx.compose.p013ui.node.AlignmentLinesOwner
    public boolean isPlaced() {
        return this.isPlaced;
    }

    public final boolean isPlacedByParent() {
        return this.isPlacedByParent;
    }

    @Override // androidx.compose.p013ui.node.MotionReferencePlacementDelegate
    public boolean isPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    @Override // androidx.compose.p013ui.node.AlignmentLinesOwner
    public void layoutChildren() {
        this.layingOutChildren = true;
        getAlignmentLines().recalculateQueryOwner();
        if (this.layoutPending) {
            onBeforeLayoutChildren();
        }
        if (this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !getInnerCoordinator().isPlacingForAlignment$ui_release() && this.layoutPending)) {
            this.layoutPending = false;
            LayoutNode.LayoutState layoutState = getLayoutState();
            setLayoutState(LayoutNode.LayoutState.LayingOut);
            this.layoutNodeLayoutDelegate.setCoordinatesAccessedDuringPlacement(false);
            LayoutNode layoutNode = getLayoutNode();
            LayoutNodeKt.requireOwner(layoutNode).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(layoutNode, false, this.layoutChildrenBlock);
            setLayoutState(layoutState);
            if (getInnerCoordinator().isPlacingForAlignment$ui_release() && this.layoutNodeLayoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                requestLayout();
            }
            this.layoutPendingForAlignment = false;
        }
        if (getAlignmentLines().getUsedDuringParentLayout$ui_release()) {
            getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
        }
        if (getAlignmentLines().getDirty$ui_release() && getAlignmentLines().getRequired$ui_release()) {
            getAlignmentLines().recalculate();
        }
        this.layingOutChildren = false;
    }

    public final void markDetachedFromParentLookaheadPass$ui_release() {
        this.layoutNodeLayoutDelegate.setDetachedFromParentLookaheadPass$ui_release(true);
    }

    public final void markLayoutPending() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void markMeasurePending$ui_release() {
        this.measurePending = true;
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i10) {
        if (!LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            onIntrinsicsQueried();
            return getOuterCoordinator().maxIntrinsicHeight(i10);
        }
        LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        AbstractC9133u.m16130d(lookaheadPassDelegate);
        return lookaheadPassDelegate.maxIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i10) {
        if (!LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            onIntrinsicsQueried();
            return getOuterCoordinator().maxIntrinsicWidth(i10);
        }
        LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        AbstractC9133u.m16130d(lookaheadPassDelegate);
        return lookaheadPassDelegate.maxIntrinsicWidth(i10);
    }

    @Override // androidx.compose.p013ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public Placeable mo25627measureBRTryo0(long j10) {
        LayoutNode.UsageByParent intrinsicsUsageByParent$ui_release = getLayoutNode().getIntrinsicsUsageByParent$ui_release();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
        if (intrinsicsUsageByParent$ui_release == usageByParent) {
            getLayoutNode().clearSubtreeIntrinsicsUsage$ui_release();
        }
        if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
            AbstractC9133u.m16130d(lookaheadPassDelegate);
            lookaheadPassDelegate.setMeasuredByParent$ui_release(usageByParent);
            lookaheadPassDelegate.mo25627measureBRTryo0(j10);
        }
        trackMeasurementByParent(getLayoutNode());
        m25856remeasureBRTryo0(j10);
        return this;
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i10) {
        if (!LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            onIntrinsicsQueried();
            return getOuterCoordinator().minIntrinsicHeight(i10);
        }
        LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        AbstractC9133u.m16130d(lookaheadPassDelegate);
        return lookaheadPassDelegate.minIntrinsicHeight(i10);
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i10) {
        if (!LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            onIntrinsicsQueried();
            return getOuterCoordinator().minIntrinsicWidth(i10);
        }
        LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        AbstractC9133u.m16130d(lookaheadPassDelegate);
        return lookaheadPassDelegate.minIntrinsicWidth(i10);
    }

    public final void notifyChildrenUsingCoordinatesWhilePlacing() {
        if (this.layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                LayoutNode layoutNode = layoutNodeArr[i10];
                LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if ((layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate$ui_release.getLayoutPending$ui_release()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
            }
        }
    }

    public final void onNodeDetached() {
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        setPlaced$ui_release(false);
    }

    public final void onNodePlaced$ui_release() {
        this.onNodePlacedCalled = true;
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        float zIndex = getInnerCoordinator().getZIndex();
        LayoutNode layoutNode = getLayoutNode();
        NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
        for (NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); outerCoordinator$ui_release != innerCoordinator$ui_release; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            AbstractC9133u.m16131e(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            zIndex += ((LayoutModifierNodeCoordinator) outerCoordinator$ui_release).getZIndex();
        }
        if (zIndex != this.zIndex) {
            this.zIndex = zIndex;
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated$ui_release();
            }
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
        }
        if (isPlaced()) {
            getLayoutNode().getInnerCoordinator$ui_release().onPlaced();
        } else {
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
            markNodeAndSubtreeAsPlaced();
            if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
            }
        }
        if (parent$ui_release == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && parent$ui_release.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
            if (!(this.placeOrder == Integer.MAX_VALUE)) {
                InlineClassHelperKt.throwIllegalStateException("Place was called on a node which was placed already");
            }
            this.placeOrder = parent$ui_release.getLayoutDelegate$ui_release().getNextChildPlaceOrder$ui_release();
            LayoutNodeLayoutDelegate layoutDelegate$ui_release = parent$ui_release.getLayoutDelegate$ui_release();
            layoutDelegate$ui_release.setNextChildPlaceOrder$ui_release(layoutDelegate$ui_release.getNextChildPlaceOrder$ui_release() + 1);
        }
        layoutChildren();
    }

    /* renamed from: performMeasure-BRTryo0$ui_release, reason: not valid java name */
    public final void m25855performMeasureBRTryo0$ui_release(long j10) {
        LayoutNode.LayoutState layoutState = getLayoutState();
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Idle;
        if (!(layoutState == layoutState2)) {
            InlineClassHelperKt.throwIllegalStateException("layout state is not idle before measure starts");
        }
        this.performMeasureConstraints = j10;
        LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
        setLayoutState(layoutState3);
        this.measurePending = false;
        LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(getLayoutNode(), false, this.performMeasureBlock);
        if (getLayoutState() == layoutState3) {
            markLayoutPending();
            setLayoutState(layoutState2);
        }
    }

    @Override // androidx.compose.p013ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo25628placeAtf8xVGno(long j10, float f10, InterfaceC10570l interfaceC10570l) {
        m25852placeSelfMLgxB_4(j10, f10, interfaceC10570l, null);
    }

    /* renamed from: remeasure-BRTryo0, reason: not valid java name */
    public final boolean m25856remeasureBRTryo0(long j10) {
        if (getLayoutNode().isDeactivated()) {
            InlineClassHelperKt.throwIllegalArgumentException("measure is called on a deactivated node");
        }
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        LayoutNode parent$ui_release = getLayoutNode().getParent$ui_release();
        boolean z10 = true;
        getLayoutNode().setCanMultiMeasure$ui_release(getLayoutNode().getCanMultiMeasure$ui_release() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure$ui_release()));
        if (!getLayoutNode().getMeasurePending$ui_release() && Constraints.m26845equalsimpl0(m25687getMeasurementConstraintsmsEJaDk(), j10)) {
            Owner.forceMeasureTheSubtree$default(ownerRequireOwner, getLayoutNode(), false, 2, null);
            getLayoutNode().resetSubtreeIntrinsicsUsage$ui_release();
            return false;
        }
        getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
        forEachChildAlignmentLinesOwner(new InterfaceC10570l() { // from class: androidx.compose.ui.node.MeasurePassDelegate$remeasure$2
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AlignmentLinesOwner) obj);
                return C8736p.f16368a;
            }

            public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
                alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
            }
        });
        this.measuredOnce = true;
        long jMo25635getSizeYbymL2g = getOuterCoordinator().mo25635getSizeYbymL2g();
        m25690setMeasurementConstraintsBRTryo0(j10);
        m25855performMeasureBRTryo0$ui_release(j10);
        if (IntSize.m27068equalsimpl0(getOuterCoordinator().mo25635getSizeYbymL2g(), jMo25635getSizeYbymL2g) && getOuterCoordinator().getWidth() == getWidth() && getOuterCoordinator().getHeight() == getHeight()) {
            z10 = false;
        }
        m25689setMeasuredSizeozmzZPI(IntSize.m27065constructorimpl((getOuterCoordinator().getHeight() & 4294967295L) | (getOuterCoordinator().getWidth() << 32)));
        return z10;
    }

    public final void replace() {
        MeasurePassDelegate measurePassDelegate;
        LayoutNode parent$ui_release;
        try {
            this.relayoutWithoutParentInProgress = true;
            if (!this.placedOnce) {
                InlineClassHelperKt.throwIllegalStateException("replace called on unplaced item");
            }
            boolean zIsPlaced = isPlaced();
            measurePassDelegate = this;
            try {
                measurePassDelegate.m25851placeOuterCoordinatorMLgxB_4(this.lastPosition, this.lastZIndex, this.lastLayerBlock, this.lastExplicitLayer);
                if (zIsPlaced && !measurePassDelegate.onNodePlacedCalled && (parent$ui_release = getLayoutNode().getParent$ui_release()) != null) {
                    LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
                measurePassDelegate.relayoutWithoutParentInProgress = false;
            } catch (Throwable th) {
                th = th;
                measurePassDelegate.relayoutWithoutParentInProgress = false;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            measurePassDelegate = this;
        }
    }

    @Override // androidx.compose.p013ui.node.AlignmentLinesOwner
    public void requestLayout() {
        LayoutNode.requestRelayout$ui_release$default(getLayoutNode(), false, 1, null);
    }

    @Override // androidx.compose.p013ui.node.AlignmentLinesOwner
    public void requestMeasure() {
        LayoutNode.requestRemeasure$ui_release$default(getLayoutNode(), false, false, false, 7, null);
    }

    public final void setChildDelegatesDirty$ui_release(boolean z10) {
        this.childDelegatesDirty = z10;
    }

    public final void setDuringAlignmentLinesQuery$ui_release(boolean z10) {
        this.duringAlignmentLinesQuery = z10;
    }

    public final void setLayoutState(LayoutNode.LayoutState layoutState) {
        this.layoutNodeLayoutDelegate.setLayoutState$ui_release(layoutState);
    }

    public final void setMeasuredByParent$ui_release(LayoutNode.UsageByParent usageByParent) {
        this.measuredByParent = usageByParent;
    }

    public void setPlaced$ui_release(boolean z10) {
        this.isPlaced = z10;
    }

    public final void setPlacedByParent$ui_release(boolean z10) {
        this.isPlacedByParent = z10;
    }

    public void setPlacedUnderMotionFrameOfReference(boolean z10) {
        this.isPlacedUnderMotionFrameOfReference = z10;
    }

    public final boolean updateParentData() {
        if ((getParentData() == null && getOuterCoordinator().getParentData() == null) || !this.parentDataDirty) {
            return false;
        }
        this.parentDataDirty = false;
        this.parentData = getOuterCoordinator().getParentData();
        return true;
    }

    @Override // androidx.compose.p013ui.node.MotionReferencePlacementDelegate
    public void updatePlacedUnderMotionFrameOfReference(boolean z10) {
        if (z10 != getOuterCoordinator().isPlacedUnderMotionFrameOfReference()) {
            getOuterCoordinator().setPlacedUnderMotionFrameOfReference(z10);
            this.needsCoordinatesUpdate = true;
        }
        setPlacedUnderMotionFrameOfReference(z10);
    }

    @Override // androidx.compose.p013ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo25688placeAtf8xVGno(long j10, float f10, GraphicsLayer graphicsLayer) {
        m25852placeSelfMLgxB_4(j10, f10, null, graphicsLayer);
    }
}
