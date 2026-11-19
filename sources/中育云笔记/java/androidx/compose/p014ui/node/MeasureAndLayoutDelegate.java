package androidx.compose.p014ui.node;

import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.Owner;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class MeasureAndLayoutDelegate {
    public static final int $stable = 8;
    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringFullMeasureLayoutPass;
    private boolean duringMeasureLayout;
    private long measureIteration;
    private final MutableVector<Owner.OnLayoutCompletedListener> onLayoutCompletedListeners;
    private final OnPositionedDispatcher onPositionedDispatcher;
    private final MutableVector<PostponedRequest> postponedMeasureRequests;
    private final DepthSortedSetsForDifferentPasses relayoutNodes;
    private final LayoutNode root;
    private Constraints rootConstraints;

    @StabilityInferred(parameters = 0)
    public static final class PostponedRequest {
        public static final int $stable = 8;
        private final boolean isForced;
        private final boolean isLookahead;
        private final LayoutNode node;

        public PostponedRequest(LayoutNode layoutNode, boolean z10, boolean z11) {
            this.node = layoutNode;
            this.isLookahead = z10;
            this.isForced = z11;
        }

        public final LayoutNode getNode() {
            return this.node;
        }

        public final boolean isForced() {
            return this.isForced;
        }

        public final boolean isLookahead() {
            return this.isLookahead;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MeasureAndLayoutDelegate(LayoutNode layoutNode) {
        this.root = layoutNode;
        Owner.Companion companion = Owner.Companion;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new DepthSortedSetsForDifferentPasses(companion.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.onLayoutCompletedListeners = new MutableVector<>(new Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        MutableVector<PostponedRequest> mutableVector = new MutableVector<>(new PostponedRequest[16], 0);
        this.postponedMeasureRequests = mutableVector;
        this.consistencyChecker = companion.getEnableExtraAssertions() ? new LayoutTreeConsistencyChecker(layoutNode, depthSortedSetsForDifferentPasses, mutableVector.asMutableList()) : null;
    }

    private final void callOnLayoutCompletedListeners() {
        MutableVector<Owner.OnLayoutCompletedListener> mutableVector = this.onLayoutCompletedListeners;
        Owner.OnLayoutCompletedListener[] onLayoutCompletedListenerArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            onLayoutCompletedListenerArr[i10].onLayoutComplete();
        }
        this.onLayoutCompletedListeners.clear();
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z10);
    }

    /* renamed from: doLookaheadRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m32448doLookaheadRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        if (layoutNode.getLookaheadRoot$ui_release() == null) {
            return false;
        }
        boolean zM32413lookaheadRemeasure_Sx5XlM$ui_release = constraints != null ? layoutNode.m32413lookaheadRemeasure_Sx5XlM$ui_release(constraints) : LayoutNode.m32406lookaheadRemeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (zM32413lookaheadRemeasure_Sx5XlM$ui_release && parent$ui_release != null) {
            if (parent$ui_release.getLookaheadRoot$ui_release() == null) {
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, false, false, 3, null);
                return zM32413lookaheadRemeasure_Sx5XlM$ui_release;
            }
            if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release, false, false, false, 3, null);
                return zM32413lookaheadRemeasure_Sx5XlM$ui_release;
            }
            if (layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
            }
        }
        return zM32413lookaheadRemeasure_Sx5XlM$ui_release;
    }

    /* renamed from: doRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m32449doRemeasuresdFAvZA(LayoutNode layoutNode, Constraints constraints) {
        boolean zM32414remeasure_Sx5XlM$ui_release = constraints != null ? layoutNode.m32414remeasure_Sx5XlM$ui_release(constraints) : LayoutNode.m32407remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (zM32414remeasure_Sx5XlM$ui_release && parent$ui_release != null) {
            if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, false, false, 3, null);
                return zM32414remeasure_Sx5XlM$ui_release;
            }
            if (layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InLayoutBlock) {
                LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
            }
        }
        return zM32414remeasure_Sx5XlM$ui_release;
    }

    private final void drainPostponedMeasureRequests() {
        if (this.postponedMeasureRequests.getSize() != 0) {
            MutableVector<PostponedRequest> mutableVector = this.postponedMeasureRequests;
            PostponedRequest[] postponedRequestArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                PostponedRequest postponedRequest = postponedRequestArr[i10];
                if (postponedRequest.getNode().isAttached()) {
                    if (postponedRequest.isLookahead()) {
                        LayoutNode.requestLookaheadRemeasure$ui_release$default(postponedRequest.getNode(), postponedRequest.isForced(), false, false, 2, null);
                    } else {
                        LayoutNode.requestRemeasure$ui_release$default(postponedRequest.getNode(), postponedRequest.isForced(), false, false, 2, null);
                    }
                }
            }
            this.postponedMeasureRequests.clear();
        }
    }

    private final void ensureSubtreeLookaheadReplaced(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = layoutNodeArr[i10];
            if (AbstractC9979u.m20289b(layoutNode2.isPlacedInLookahead(), Boolean.TRUE) && !layoutNode2.isDeactivated()) {
                if (this.relayoutNodes.contains(layoutNode2, true)) {
                    layoutNode2.lookaheadReplace$ui_release();
                }
                ensureSubtreeLookaheadReplaced(layoutNode2);
            }
        }
    }

    private final void forceMeasureTheSubtreeInternal(LayoutNode layoutNode, boolean z10) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = layoutNodeArr[i10];
            if ((!z10 && getMeasureAffectsParent(layoutNode2)) || (z10 && getMeasureAffectsParentLookahead(layoutNode2))) {
                if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2) && !z10) {
                    if (layoutNode2.getLookaheadMeasurePending$ui_release() && this.relayoutNodes.contains(layoutNode2, true)) {
                        remeasureAndRelayoutIfNeeded(layoutNode2, true, false);
                    } else {
                        forceMeasureTheSubtree(layoutNode2, true);
                    }
                }
                onlyRemeasureIfPending(layoutNode2, z10);
                if (!measurePending(layoutNode2, z10)) {
                    forceMeasureTheSubtreeInternal(layoutNode2, z10);
                }
            }
        }
        onlyRemeasureIfPending(layoutNode, z10);
    }

    private final boolean getCanAffectParentInLookahead(LayoutNode layoutNode) {
        return layoutNode.getLookaheadMeasurePending$ui_release() && getMeasureAffectsParentLookahead(layoutNode);
    }

    private final boolean getCanAffectPlacedParent(LayoutNode layoutNode) {
        return layoutNode.getMeasurePending$ui_release() && getMeasureAffectsPlacedParent(layoutNode);
    }

    private final boolean getMeasureAffectsParent(LayoutNode layoutNode) {
        return layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release();
    }

    private final boolean getMeasureAffectsParentLookahead(LayoutNode layoutNode) {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release;
        AlignmentLines alignmentLines;
        return layoutNode.getMeasuredByParentInLookahead$ui_release() == LayoutNode.UsageByParent.InMeasureBlock || !((lookaheadAlignmentLinesOwner$ui_release = layoutNode.getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release()) == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release());
    }

    private final boolean getMeasureAffectsPlacedParent(LayoutNode layoutNode) {
        do {
            if (!getMeasureAffectsParent(layoutNode)) {
                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) != LayoutNode.LayoutState.Measuring) {
                    return false;
                }
            }
            layoutNode = layoutNode.getParent$ui_release();
            if (layoutNode == null) {
                return false;
            }
        } while (!layoutNode.isPlaced());
        return true;
    }

    public static /* synthetic */ boolean measureAndLayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9529a = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(interfaceC9529a);
    }

    private final boolean measurePending(LayoutNode layoutNode, boolean z10) {
        return z10 ? layoutNode.getLookaheadMeasurePending$ui_release() : layoutNode.getMeasurePending$ui_release();
    }

    private final void onlyRemeasureIfPending(LayoutNode layoutNode, boolean z10) {
        if (measurePending(layoutNode, z10)) {
            remeasureAndRelayoutIfNeeded(layoutNode, z10, false);
        }
    }

    private final void performMeasureAndLayout(boolean z10, InterfaceC9529a interfaceC9529a) {
        if (!this.root.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = z10;
            try {
                interfaceC9529a.invoke();
                AbstractC9977s.m20286b(1);
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                AbstractC9977s.m20285a(1);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th) {
                AbstractC9977s.m20286b(1);
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                AbstractC9977s.m20285a(1);
                throw th;
            }
        }
    }

    private final boolean remeasureAndRelayoutIfNeeded(LayoutNode layoutNode, boolean z10, boolean z11) {
        Constraints constraints;
        boolean zM32448doLookaheadRemeasuresdFAvZA;
        LayoutNode parent$ui_release;
        if (layoutNode.isDeactivated()) {
            return false;
        }
        if (!layoutNode.isPlaced() && !layoutNode.isPlacedByParent() && !getCanAffectPlacedParent(layoutNode) && !AbstractC9979u.m20289b(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && !getCanAffectParentInLookahead(layoutNode) && !layoutNode.getAlignmentLinesRequired$ui_release()) {
            return false;
        }
        if (layoutNode == this.root) {
            constraints = this.rootConstraints;
            AbstractC9979u.m20291d(constraints);
        } else {
            constraints = null;
        }
        if (z10) {
            zM32448doLookaheadRemeasuresdFAvZA = layoutNode.getLookaheadMeasurePending$ui_release() ? m32448doLookaheadRemeasuresdFAvZA(layoutNode, constraints) : false;
            if (z11 && ((zM32448doLookaheadRemeasuresdFAvZA || layoutNode.getLookaheadLayoutPending$ui_release()) && AbstractC9979u.m20289b(layoutNode.isPlacedInLookahead(), Boolean.TRUE))) {
                layoutNode.lookaheadReplace$ui_release();
            }
        } else {
            boolean zM32449doRemeasuresdFAvZA = layoutNode.getMeasurePending$ui_release() ? m32449doRemeasuresdFAvZA(layoutNode, constraints) : false;
            if (z11 && layoutNode.getLayoutPending$ui_release() && (layoutNode == this.root || ((parent$ui_release = layoutNode.getParent$ui_release()) != null && parent$ui_release.isPlaced() && layoutNode.isPlacedByParent()))) {
                if (layoutNode == this.root) {
                    layoutNode.place$ui_release(0, 0);
                } else {
                    layoutNode.replace$ui_release();
                }
                this.onPositionedDispatcher.onNodePositioned(layoutNode);
                LayoutNodeKt.requireOwner(layoutNode).getRectManager().invalidateCallbacksFor(layoutNode);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            }
            zM32448doLookaheadRemeasuresdFAvZA = zM32449doRemeasuresdFAvZA;
        }
        drainPostponedMeasureRequests();
        return zM32448doLookaheadRemeasuresdFAvZA;
    }

    public static /* synthetic */ boolean remeasureAndRelayoutIfNeeded$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return measureAndLayoutDelegate.remeasureAndRelayoutIfNeeded(layoutNode, z10, z11);
    }

    private final void remeasureLookaheadRootsInSubtree(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = layoutNodeArr[i10];
            if (getMeasureAffectsParent(layoutNode2)) {
                if (LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2)) {
                    remeasureOnly(layoutNode2, true);
                } else {
                    remeasureLookaheadRootsInSubtree(layoutNode2);
                }
            }
        }
    }

    private final void remeasureOnly(LayoutNode layoutNode, boolean z10) {
        Constraints constraints;
        if (layoutNode.isDeactivated()) {
            return;
        }
        if (layoutNode == this.root) {
            constraints = this.rootConstraints;
            AbstractC9979u.m20291d(constraints);
        } else {
            constraints = null;
        }
        if (z10) {
            m32448doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
        } else {
            m32449doRemeasuresdFAvZA(layoutNode, constraints);
        }
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z10);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z10);
    }

    public static /* synthetic */ boolean requestRelayout$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z10);
    }

    public static /* synthetic */ boolean requestRemeasure$default(MeasureAndLayoutDelegate measureAndLayoutDelegate, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z10);
    }

    public final void dispatchOnPositionedCallbacks(boolean z10) {
        if (z10) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        this.onPositionedDispatcher.dispatch();
    }

    public final void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z10) {
        if (!this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (measurePending(layoutNode, z10)) {
            InlineClassHelperKt.throwIllegalArgumentException("node not yet measured");
        }
        forceMeasureTheSubtreeInternal(layoutNode, z10);
    }

    public final boolean getDuringMeasureLayout$ui_release() {
        return this.duringMeasureLayout;
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.relayoutNodes.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.onPositionedDispatcher.isNotEmpty();
    }

    public final long getMeasureIteration() {
        if (!this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("measureIteration should be only used during the measure/layout pass");
        }
        return this.measureIteration;
    }

    public final boolean measureAndLayout(InterfaceC9529a interfaceC9529a) throws Throwable {
        MeasureAndLayoutDelegate measureAndLayoutDelegate;
        Throwable th;
        boolean z10;
        LayoutNode layoutNodePop;
        if (!this.root.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        boolean z11 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = true;
            try {
                if (this.relayoutNodes.isNotEmpty()) {
                    DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
                    z10 = false;
                    while (depthSortedSetsForDifferentPasses.isNotEmpty()) {
                        boolean zIsEmpty = depthSortedSetsForDifferentPasses.lookaheadSet.isEmpty();
                        boolean z12 = !zIsEmpty;
                        if (zIsEmpty) {
                            layoutNodePop = depthSortedSetsForDifferentPasses.set.pop();
                        } else {
                            try {
                                layoutNodePop = depthSortedSetsForDifferentPasses.lookaheadSet.pop();
                            } catch (Throwable th2) {
                                th = th2;
                                measureAndLayoutDelegate = this;
                                measureAndLayoutDelegate.duringMeasureLayout = false;
                                measureAndLayoutDelegate.duringFullMeasureLayoutPass = false;
                                throw th;
                            }
                        }
                        LayoutNode layoutNode = layoutNodePop;
                        measureAndLayoutDelegate = this;
                        try {
                            boolean zRemeasureAndRelayoutIfNeeded$default = remeasureAndRelayoutIfNeeded$default(measureAndLayoutDelegate, layoutNode, z12, false, 4, null);
                            if (layoutNode == this.root && zRemeasureAndRelayoutIfNeeded$default) {
                                z10 = true;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            measureAndLayoutDelegate.duringMeasureLayout = false;
                            measureAndLayoutDelegate.duringFullMeasureLayoutPass = false;
                            throw th;
                        }
                    }
                    measureAndLayoutDelegate = this;
                    if (interfaceC9529a != null) {
                        interfaceC9529a.invoke();
                    }
                } else {
                    measureAndLayoutDelegate = this;
                    z10 = false;
                }
                measureAndLayoutDelegate.duringMeasureLayout = false;
                measureAndLayoutDelegate.duringFullMeasureLayoutPass = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = measureAndLayoutDelegate.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
                z11 = z10;
            } catch (Throwable th4) {
                th = th4;
                measureAndLayoutDelegate = this;
            }
        }
        callOnLayoutCompletedListeners();
        return z11;
    }

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public final void m32450measureAndLayout0kLqBqw(LayoutNode layoutNode, long j10) {
        if (layoutNode.isDeactivated()) {
            return;
        }
        if (AbstractC9979u.m20289b(layoutNode, this.root)) {
            InlineClassHelperKt.throwIllegalArgumentException("measureAndLayout called on root");
        }
        if (!this.root.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.isPlaced()) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = false;
            try {
                this.relayoutNodes.remove(layoutNode);
                if (m32448doLookaheadRemeasuresdFAvZA(layoutNode, Constraints.m33441boximpl(j10)) || layoutNode.getLookaheadLayoutPending$ui_release()) {
                    if (AbstractC9979u.m20289b(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
                        layoutNode.lookaheadReplace$ui_release();
                    }
                }
                ensureSubtreeLookaheadReplaced(layoutNode);
                m32449doRemeasuresdFAvZA(layoutNode, Constraints.m33441boximpl(j10));
                if (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced()) {
                    layoutNode.replace$ui_release();
                    this.onPositionedDispatcher.onNodePositioned(layoutNode);
                }
                drainPostponedMeasureRequests();
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (Throwable th) {
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                throw th;
            }
        }
        callOnLayoutCompletedListeners();
    }

    public final void measureOnly() {
        if (this.relayoutNodes.isNotEmpty()) {
            if (!this.root.isAttached()) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
            }
            if (!this.root.isPlaced()) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
            }
            if (this.duringMeasureLayout) {
                InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
            }
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                this.duringFullMeasureLayoutPass = false;
                try {
                    if (!this.relayoutNodes.isEmpty(true)) {
                        if (this.root.getLookaheadRoot$ui_release() != null) {
                            remeasureOnly(this.root, true);
                        } else {
                            remeasureLookaheadRootsInSubtree(this.root);
                        }
                    }
                    remeasureOnly(this.root, false);
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                } catch (Throwable th) {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    throw th;
                }
            }
        }
    }

    public final void onNodeDetached(LayoutNode layoutNode) {
        this.relayoutNodes.remove(layoutNode);
        this.onPositionedDispatcher.remove(layoutNode);
    }

    public final void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.onLayoutCompletedListeners.add(onLayoutCompletedListener);
    }

    public final boolean requestLookaheadRelayout(LayoutNode layoutNode, boolean z10) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getLookaheadLayoutPending$ui_release()) && !z10) {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
                return false;
            }
            layoutNode.markLookaheadLayoutPending$ui_release();
            layoutNode.markLayoutPending$ui_release();
            if (layoutNode.isDeactivated()) {
                return false;
            }
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (AbstractC9979u.m20289b(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && ((parent$ui_release == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getLookaheadLayoutPending$ui_release()))) {
                this.relayoutNodes.add(layoutNode, true);
            } else if (layoutNode.isPlaced() && ((parent$ui_release == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()))) {
                this.relayoutNodes.add(layoutNode, false);
            }
            return !this.duringFullMeasureLayoutPass;
        }
        LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
        if (layoutTreeConsistencyChecker2 != null) {
            layoutTreeConsistencyChecker2.assertConsistent();
        }
        return false;
    }

    public final boolean requestLookaheadRemeasure(LayoutNode layoutNode, boolean z10) {
        LayoutNode parent$ui_release;
        LayoutNode parent$ui_release2;
        if (!(layoutNode.getLookaheadRoot$ui_release() != null)) {
            InlineClassHelperKt.throwIllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3 && i10 != 4) {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (layoutNode.getLookaheadMeasurePending$ui_release() && !z10) {
                    return false;
                }
                layoutNode.markLookaheadMeasurePending$ui_release();
                layoutNode.markMeasurePending$ui_release();
                if (layoutNode.isDeactivated()) {
                    return false;
                }
                if ((AbstractC9979u.m20289b(layoutNode.isPlacedInLookahead(), Boolean.TRUE) || getCanAffectParentInLookahead(layoutNode)) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLookaheadMeasurePending$ui_release())) {
                    this.relayoutNodes.add(layoutNode, true);
                } else if ((layoutNode.isPlaced() || getCanAffectPlacedParent(layoutNode)) && ((parent$ui_release2 = layoutNode.getParent$ui_release()) == null || !parent$ui_release2.getMeasurePending$ui_release())) {
                    this.relayoutNodes.add(layoutNode, false);
                }
                return !this.duringFullMeasureLayoutPass;
            }
            this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, true, z10));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        return false;
    }

    public final void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.onPositionedDispatcher.onNodePositioned(layoutNode);
    }

    public final boolean requestRelayout(LayoutNode layoutNode, boolean z10) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
            return false;
        }
        if (i10 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        boolean z11 = parent$ui_release == null || parent$ui_release.isPlaced();
        if (!z10 && (layoutNode.getMeasurePending$ui_release() || (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced() == z11 && layoutNode.isPlaced() == layoutNode.isPlacedByParent()))) {
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
            if (layoutTreeConsistencyChecker2 != null) {
                layoutTreeConsistencyChecker2.assertConsistent();
            }
            return false;
        }
        layoutNode.markLayoutPending$ui_release();
        if (!layoutNode.isDeactivated() && layoutNode.isPlacedByParent() && z11) {
            if ((parent$ui_release == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release())) {
                this.relayoutNodes.add(layoutNode, false);
            }
            if (!this.duringFullMeasureLayoutPass) {
                return true;
            }
        }
        return false;
    }

    public final boolean requestRemeasure(LayoutNode layoutNode, boolean z10) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (layoutNode.getMeasurePending$ui_release() && !z10) {
                    return false;
                }
                layoutNode.markMeasurePending$ui_release();
                if (layoutNode.isDeactivated()) {
                    return false;
                }
                if (!layoutNode.isPlaced() && !getCanAffectPlacedParent(layoutNode)) {
                    return false;
                }
                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                if (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()) {
                    this.relayoutNodes.add(layoutNode, false);
                }
                return !this.duringFullMeasureLayoutPass;
            }
            this.postponedMeasureRequests.add(new PostponedRequest(layoutNode, false, z10));
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        return false;
    }

    public final void setDuringMeasureLayout$ui_release(boolean z10) {
        this.duringMeasureLayout = z10;
    }

    /* renamed from: updateRootConstraints-BRTryo0, reason: not valid java name */
    public final void m32451updateRootConstraintsBRTryo0(long j10) {
        Constraints constraints = this.rootConstraints;
        if (constraints == null ? false : Constraints.m33447equalsimpl0(constraints.m33460unboximpl(), j10)) {
            return;
        }
        if (this.duringMeasureLayout) {
            InlineClassHelperKt.throwIllegalArgumentException("updateRootConstraints called while measuring");
        }
        this.rootConstraints = Constraints.m33441boximpl(j10);
        if (this.root.getLookaheadRoot$ui_release() != null) {
            this.root.markLookaheadMeasurePending$ui_release();
        }
        this.root.markMeasurePending$ui_release();
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
        LayoutNode layoutNode = this.root;
        depthSortedSetsForDifferentPasses.add(layoutNode, layoutNode.getLookaheadRoot$ui_release() != null);
    }
}
