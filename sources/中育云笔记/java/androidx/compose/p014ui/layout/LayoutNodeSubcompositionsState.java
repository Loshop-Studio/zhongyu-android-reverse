package androidx.compose.p014ui.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.SubcomposeLayoutState;
import androidx.compose.p014ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.LayoutNodeKt;
import androidx.compose.p014ui.node.LookaheadDelegate;
import androidx.compose.p014ui.node.LookaheadPassDelegate;
import androidx.compose.p014ui.node.MeasurePassDelegate;
import androidx.compose.p014ui.node.NodeChain;
import androidx.compose.p014ui.node.TraversableNodeKt;
import androidx.compose.p014ui.platform.SubcompositionKt;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.DpRect;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.core.view.ViewCompat;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {
    public static final int $stable = 8;
    private CompositionContext compositionContext;
    private int currentApproachIndex;
    private int currentIndex;
    private int precomposedCount;
    private int reusableCount;
    private final LayoutNode root;
    private SubcomposeSlotReusePolicy slotReusePolicy;
    private final MutableScatterMap<LayoutNode, NodeState> nodeToNodeState = ScatterMapKt.mutableScatterMapOf();
    private final MutableScatterMap<Object, LayoutNode> slotIdToNode = ScatterMapKt.mutableScatterMapOf();
    private final Scope scope = new Scope();
    private final ApproachMeasureScopeImpl approachMeasureScope = new ApproachMeasureScopeImpl();
    private final MutableScatterMap<Object, LayoutNode> precomposeMap = ScatterMapKt.mutableScatterMapOf();
    private final SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, null);
    private final MutableScatterMap<Object, SubcomposeLayoutState.PrecomposedSlotHandle> approachPrecomposeSlotHandleMap = ScatterMapKt.mutableScatterMapOf();
    private final MutableVector<Object> approachComposedSlotIds = new MutableVector<>(new Object[16], 0);
    private final String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public final class ApproachMeasureScopeImpl implements SubcomposeMeasureScope, MeasureScope {
        private final /* synthetic */ Scope $$delegate_0;

        public ApproachMeasureScopeImpl() {
            this.$$delegate_0 = LayoutNodeSubcompositionsState.this.scope;
        }

        @Override // androidx.compose.p014ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.p014ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.p014ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.$$delegate_0.getLayoutDirection();
        }

        @Override // androidx.compose.p014ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return this.$$delegate_0.isLookingAhead();
        }

        @Override // androidx.compose.p014ui.layout.MeasureScope
        public MeasureResult layout(int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC9540l interfaceC9540l) {
            return this.$$delegate_0.layout(i10, i11, map, interfaceC9540l);
        }

        @Override // androidx.compose.p014ui.unit.Density
        @Stable
        /* renamed from: roundToPx--R2X_6o */
        public int mo27092roundToPxR2X_6o(long j10) {
            return this.$$delegate_0.mo27092roundToPxR2X_6o(j10);
        }

        @Override // androidx.compose.p014ui.unit.Density
        @Stable
        /* renamed from: roundToPx-0680j_4 */
        public int mo27093roundToPx0680j_4(float f10) {
            return this.$$delegate_0.mo27093roundToPx0680j_4(f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.p014ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object obj, InterfaceC9544p interfaceC9544p) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.slotIdToNode.get(obj);
            return (layoutNode == null || LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().indexOf(layoutNode) >= LayoutNodeSubcompositionsState.this.currentIndex) ? LayoutNodeSubcompositionsState.this.approachSubcompose(obj, interfaceC9544p) : layoutNode.getChildMeasurables$ui_release();
        }

        @Override // androidx.compose.p014ui.unit.FontScaling
        @Stable
        /* renamed from: toDp-GaN1DYA */
        public float mo27094toDpGaN1DYA(long j10) {
            return this.$$delegate_0.mo27094toDpGaN1DYA(j10);
        }

        @Override // androidx.compose.p014ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo27095toDpu2uoSUM(float f10) {
            return this.$$delegate_0.mo27095toDpu2uoSUM(f10);
        }

        @Override // androidx.compose.p014ui.unit.Density
        @Stable
        /* renamed from: toDpSize-k-rfVVM */
        public long mo27097toDpSizekrfVVM(long j10) {
            return this.$$delegate_0.mo27097toDpSizekrfVVM(j10);
        }

        @Override // androidx.compose.p014ui.unit.Density
        @Stable
        /* renamed from: toPx--R2X_6o */
        public float mo27098toPxR2X_6o(long j10) {
            return this.$$delegate_0.mo27098toPxR2X_6o(j10);
        }

        @Override // androidx.compose.p014ui.unit.Density
        @Stable
        /* renamed from: toPx-0680j_4 */
        public float mo27099toPx0680j_4(float f10) {
            return this.$$delegate_0.mo27099toPx0680j_4(f10);
        }

        @Override // androidx.compose.p014ui.unit.Density
        @Stable
        public Rect toRect(DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.p014ui.unit.Density
        @Stable
        /* renamed from: toSize-XkaWNTQ */
        public long mo27100toSizeXkaWNTQ(long j10) {
            return this.$$delegate_0.mo27100toSizeXkaWNTQ(j10);
        }

        @Override // androidx.compose.p014ui.unit.FontScaling
        @Stable
        /* renamed from: toSp-0xMU5do */
        public long mo27101toSp0xMU5do(float f10) {
            return this.$$delegate_0.mo27101toSp0xMU5do(f10);
        }

        @Override // androidx.compose.p014ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo27102toSpkPz2Gy4(float f10) {
            return this.$$delegate_0.mo27102toSpkPz2Gy4(f10);
        }

        @Override // androidx.compose.p014ui.layout.MeasureScope
        public MeasureResult layout(int i10, int i11, Map<AlignmentLine, Integer> map, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
            return this.$$delegate_0.layout(i10, i11, map, interfaceC9540l, interfaceC9540l2);
        }

        @Override // androidx.compose.p014ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo27096toDpu2uoSUM(int i10) {
            return this.$$delegate_0.mo27096toDpu2uoSUM(i10);
        }

        @Override // androidx.compose.p014ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo27103toSpkPz2Gy4(int i10) {
            return this.$$delegate_0.mo27103toSpkPz2Gy4(i10);
        }
    }

    public final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        public Scope() {
        }

        @Override // androidx.compose.p014ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.p014ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.p014ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @Override // androidx.compose.p014ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadLayingOut || LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring;
        }

        @Override // androidx.compose.p014ui.layout.MeasureScope
        public MeasureResult layout(final int i10, final int i11, final Map<AlignmentLine, Integer> map, final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2) {
            if (!((i10 & ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & i11) == 0)) {
                InlineClassHelperKt.throwIllegalStateException("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope$layout$1
                @Override // androidx.compose.p014ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return map;
                }

                @Override // androidx.compose.p014ui.layout.MeasureResult
                public int getHeight() {
                    return i11;
                }

                @Override // androidx.compose.p014ui.layout.MeasureResult
                public InterfaceC9540l getRulers() {
                    return interfaceC9540l;
                }

                @Override // androidx.compose.p014ui.layout.MeasureResult
                public int getWidth() {
                    return i10;
                }

                @Override // androidx.compose.p014ui.layout.MeasureResult
                public void placeChildren() {
                    LookaheadDelegate lookaheadDelegate;
                    if (!this.isLookingAhead() || (lookaheadDelegate = layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getLookaheadDelegate()) == null) {
                        interfaceC9540l2.invoke(layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getPlacementScope());
                    } else {
                        interfaceC9540l2.invoke(lookaheadDelegate.getPlacementScope());
                    }
                }
            };
        }

        public void setDensity(float f10) {
            this.density = f10;
        }

        public void setFontScale(float f10) {
            this.fontScale = f10;
        }

        public void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        @Override // androidx.compose.p014ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object obj, InterfaceC9544p interfaceC9544p) {
            return LayoutNodeSubcompositionsState.this.subcompose(obj, interfaceC9544p);
        }
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.root = layoutNode;
        this.slotReusePolicy = subcomposeSlotReusePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Measurable> approachSubcompose(Object obj, InterfaceC9544p interfaceC9544p) {
        if (!(this.approachComposedSlotIds.getSize() >= this.currentApproachIndex)) {
            InlineClassHelperKt.throwIllegalArgumentException("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int size = this.approachComposedSlotIds.getSize();
        int i10 = this.currentApproachIndex;
        if (size == i10) {
            this.approachComposedSlotIds.add(obj);
        } else {
            this.approachComposedSlotIds.set(i10, obj);
        }
        this.currentApproachIndex++;
        if (!this.precomposeMap.contains(obj)) {
            this.approachPrecomposeSlotHandleMap.set(obj, precompose(obj, interfaceC9544p));
            if (this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                this.root.requestLookaheadRelayout$ui_release(true);
            } else {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(this.root, true, false, false, 6, null);
            }
        }
        LayoutNode layoutNode = this.precomposeMap.get(obj);
        if (layoutNode != null) {
            List<MeasurePassDelegate> childDelegates$ui_release = layoutNode.getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
            int size2 = childDelegates$ui_release.size();
            for (int i11 = 0; i11 < size2; i11++) {
                childDelegates$ui_release.get(i11).markDetachedFromParentLookaheadPass$ui_release();
            }
            if (childDelegates$ui_release != null) {
                return childDelegates$ui_release;
            }
        }
        return AbstractC10978w.m24136n();
    }

    private final MeasureResult createMeasureResult(final MeasureResult measureResult, final InterfaceC9529a interfaceC9529a) {
        return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createMeasureResult.1
            @Override // androidx.compose.p014ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return measureResult.getAlignmentLines();
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public int getHeight() {
                return measureResult.getHeight();
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public InterfaceC9540l getRulers() {
                return measureResult.getRulers();
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public int getWidth() {
                return measureResult.getWidth();
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public void placeChildren() {
                interfaceC9529a.invoke();
            }
        };
    }

    private final LayoutNode createNodeAt(int i10) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.insertAt$ui_release(i10, layoutNode);
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void disposeCurrentNodes() {
        /*
            r15 = this;
            androidx.compose.ui.node.LayoutNode r0 = r15.root
            r1 = 1
            androidx.compose.p014ui.node.LayoutNode.access$setIgnoreRemeasureRequests$p(r0, r1)
            androidx.collection.MutableScatterMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState> r1 = r15.nodeToNodeState
            java.lang.Object[] r2 = r1.values
            long[] r1 = r1.metadata
            int r3 = r1.length
            int r3 = r3 + (-2)
            r4 = 0
            if (r3 < 0) goto L53
            r5 = r4
        L13:
            r6 = r1[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L4e
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2d:
            if (r10 >= r8) goto L4c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L48
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState r11 = (androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState) r11
            androidx.compose.runtime.ReusableComposition r11 = r11.getComposition()
            if (r11 == 0) goto L48
            r11.dispose()
        L48:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2d
        L4c:
            if (r8 != r9) goto L53
        L4e:
            if (r5 == r3) goto L53
            int r5 = r5 + 1
            goto L13
        L53:
            androidx.compose.ui.node.LayoutNode r1 = r15.root
            r1.removeAll$ui_release()
            androidx.compose.p014ui.node.LayoutNode.access$setIgnoreRemeasureRequests$p(r0, r4)
            androidx.collection.MutableScatterMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState> r0 = r15.nodeToNodeState
            r0.clear()
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> r0 = r15.slotIdToNode
            r0.clear()
            r15.precomposedCount = r4
            r15.reusableCount = r4
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> r0 = r15.precomposeMap
            r0.clear()
            r15.makeSureStateIsConsistent()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.layout.LayoutNodeSubcompositionsState.disposeCurrentNodes():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeUnusedSlotsInApproach() {
        MutableScatterMap<Object, SubcomposeLayoutState.PrecomposedSlotHandle> mutableScatterMap = this.approachPrecomposeSlotHandleMap;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = mutableScatterMap.keys[i13];
                        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) mutableScatterMap.values[i13];
                        int iIndexOf = this.approachComposedSlotIds.indexOf(obj);
                        if (iIndexOf < 0 || iIndexOf >= this.currentApproachIndex) {
                            precomposedSlotHandle.dispose();
                            mutableScatterMap.removeValueAt(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final Object getSlotIdAtIndex(List<LayoutNode> list, int i10) {
        NodeState nodeState = this.nodeToNodeState.get(list.get(i10));
        AbstractC9979u.m20291d(nodeState);
        return nodeState.getSlotId();
    }

    private final void ignoreRemeasureRequests(InterfaceC9529a interfaceC9529a) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        interfaceC9529a.invoke();
        layoutNode.ignoreRemeasureRequests = false;
    }

    private final void markActiveNodesAsReused(boolean z10) {
        this.precomposedCount = 0;
        this.precomposeMap.clear();
        List<LayoutNode> foldedChildren$ui_release = this.root.getFoldedChildren$ui_release();
        int size = foldedChildren$ui_release.size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    LayoutNode layoutNode = foldedChildren$ui_release.get(i10);
                    NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                    if (nodeState != null && nodeState.getActive()) {
                        resetLayoutState(layoutNode);
                        if (z10) {
                            ReusableComposition composition = nodeState.getComposition();
                            if (composition != null) {
                                composition.deactivate();
                            }
                            nodeState.setActiveState(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null));
                        } else {
                            nodeState.setActive(false);
                        }
                        nodeState.setSlotId(SubcomposeLayoutKt.ReusedSlotId);
                    }
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            C10786q c10786q = C10786q.f26013a;
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            this.slotIdToNode.clear();
        }
        makeSureStateIsConsistent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void move(int i10, int i11, int i12) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.move$ui_release(i10, i11, i12);
        layoutNode.ignoreRemeasureRequests = false;
    }

    public static /* synthetic */ void move$default(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 1;
        }
        layoutNodeSubcompositionsState.move(i10, i11, i12);
    }

    private final void resetLayoutState(LayoutNode layoutNode) {
        MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
        measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
        LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private final ReusableComposition subcomposeInto(ReusableComposition reusableComposition, LayoutNode layoutNode, boolean z10, CompositionContext compositionContext, InterfaceC9544p interfaceC9544p) {
        if (reusableComposition == null || reusableComposition.isDisposed()) {
            reusableComposition = SubcompositionKt.createSubcomposition(layoutNode, compositionContext);
        }
        if (z10) {
            reusableComposition.setContentWithReuse(interfaceC9544p);
            return reusableComposition;
        }
        reusableComposition.setContent(interfaceC9544p);
        return reusableComposition;
    }

    private final LayoutNode takeNodeFromReusables(Object obj) {
        int i10;
        if (this.reusableCount == 0) {
            return null;
        }
        List<LayoutNode> foldedChildren$ui_release = this.root.getFoldedChildren$ui_release();
        int size = foldedChildren$ui_release.size() - this.precomposedCount;
        int i11 = size - this.reusableCount;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            if (i13 < i11) {
                i10 = -1;
                break;
            }
            if (AbstractC9979u.m20289b(getSlotIdAtIndex(foldedChildren$ui_release, i13), obj)) {
                i10 = i13;
                break;
            }
            i13--;
        }
        if (i10 == -1) {
            while (i12 >= i11) {
                NodeState nodeState = this.nodeToNodeState.get(foldedChildren$ui_release.get(i12));
                AbstractC9979u.m20291d(nodeState);
                NodeState nodeState2 = nodeState;
                if (nodeState2.getSlotId() == SubcomposeLayoutKt.ReusedSlotId || this.slotReusePolicy.areCompatible(obj, nodeState2.getSlotId())) {
                    nodeState2.setSlotId(obj);
                    i13 = i12;
                    i10 = i13;
                    break;
                }
                i12--;
            }
            i13 = i12;
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            move(i13, i11, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = foldedChildren$ui_release.get(i11);
        NodeState nodeState3 = this.nodeToNodeState.get(layoutNode);
        AbstractC9979u.m20291d(nodeState3);
        NodeState nodeState4 = nodeState3;
        nodeState4.setActiveState(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null));
        nodeState4.setForceReuse(true);
        nodeState4.setForceRecompose(true);
        return layoutNode;
    }

    public final MeasurePolicy createMeasurePolicy(final InterfaceC9544p interfaceC9544p) {
        return new LayoutNode.NoIntrinsicsMeasurePolicy(this.NoIntrinsicsMessage) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createMeasurePolicy.1
            @Override // androidx.compose.p014ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
                LayoutNodeSubcompositionsState.this.scope.setLayoutDirection(measureScope.getLayoutDirection());
                LayoutNodeSubcompositionsState.this.scope.setDensity(measureScope.getDensity());
                LayoutNodeSubcompositionsState.this.scope.setFontScale(measureScope.getFontScale());
                if (measureScope.isLookingAhead() || LayoutNodeSubcompositionsState.this.root.getLookaheadRoot$ui_release() == null) {
                    LayoutNodeSubcompositionsState.this.currentIndex = 0;
                    final MeasureResult measureResult = (MeasureResult) interfaceC9544p.invoke(LayoutNodeSubcompositionsState.this.scope, Constraints.m33441boximpl(j10));
                    final int i10 = LayoutNodeSubcompositionsState.this.currentIndex;
                    final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2
                        @Override // androidx.compose.p014ui.layout.MeasureResult
                        public Map<AlignmentLine, Integer> getAlignmentLines() {
                            return measureResult.getAlignmentLines();
                        }

                        @Override // androidx.compose.p014ui.layout.MeasureResult
                        public int getHeight() {
                            return measureResult.getHeight();
                        }

                        @Override // androidx.compose.p014ui.layout.MeasureResult
                        public InterfaceC9540l getRulers() {
                            return measureResult.getRulers();
                        }

                        @Override // androidx.compose.p014ui.layout.MeasureResult
                        public int getWidth() {
                            return measureResult.getWidth();
                        }

                        @Override // androidx.compose.p014ui.layout.MeasureResult
                        public void placeChildren() {
                            layoutNodeSubcompositionsState.currentIndex = i10;
                            measureResult.placeChildren();
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                            layoutNodeSubcompositionsState2.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState2.currentIndex);
                        }
                    };
                }
                LayoutNodeSubcompositionsState.this.currentApproachIndex = 0;
                final MeasureResult measureResult2 = (MeasureResult) interfaceC9544p.invoke(LayoutNodeSubcompositionsState.this.approachMeasureScope, Constraints.m33441boximpl(j10));
                final int i11 = LayoutNodeSubcompositionsState.this.currentApproachIndex;
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                    @Override // androidx.compose.p014ui.layout.MeasureResult
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return measureResult2.getAlignmentLines();
                    }

                    @Override // androidx.compose.p014ui.layout.MeasureResult
                    public int getHeight() {
                        return measureResult2.getHeight();
                    }

                    @Override // androidx.compose.p014ui.layout.MeasureResult
                    public InterfaceC9540l getRulers() {
                        return measureResult2.getRulers();
                    }

                    @Override // androidx.compose.p014ui.layout.MeasureResult
                    public int getWidth() {
                        return measureResult2.getWidth();
                    }

                    @Override // androidx.compose.p014ui.layout.MeasureResult
                    public void placeChildren() {
                        layoutNodeSubcompositionsState2.currentApproachIndex = i11;
                        measureResult2.placeChildren();
                        layoutNodeSubcompositionsState2.disposeUnusedSlotsInApproach();
                    }
                };
            }
        };
    }

    public final void disposeOrReuseStartingFromIndex(int i10) {
        boolean z10 = false;
        this.reusableCount = 0;
        List<LayoutNode> foldedChildren$ui_release = this.root.getFoldedChildren$ui_release();
        int size = (foldedChildren$ui_release.size() - this.precomposedCount) - 1;
        if (i10 <= size) {
            this.reusableSlotIdsSet.clear();
            if (i10 <= size) {
                int i11 = i10;
                while (true) {
                    this.reusableSlotIdsSet.add(getSlotIdAtIndex(foldedChildren$ui_release, i11));
                    if (i11 == size) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            boolean z11 = false;
            while (size >= i10) {
                try {
                    LayoutNode layoutNode = foldedChildren$ui_release.get(size);
                    NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                    AbstractC9979u.m20291d(nodeState);
                    NodeState nodeState2 = nodeState;
                    Object slotId = nodeState2.getSlotId();
                    if (this.reusableSlotIdsSet.contains(slotId)) {
                        this.reusableCount++;
                        if (nodeState2.getActive()) {
                            resetLayoutState(layoutNode);
                            nodeState2.setActive(false);
                            z11 = true;
                        }
                    } else {
                        LayoutNode layoutNode2 = this.root;
                        layoutNode2.ignoreRemeasureRequests = true;
                        this.nodeToNodeState.remove(layoutNode);
                        ReusableComposition composition = nodeState2.getComposition();
                        if (composition != null) {
                            composition.dispose();
                        }
                        this.root.removeAt$ui_release(size, 1);
                        layoutNode2.ignoreRemeasureRequests = false;
                    }
                    this.slotIdToNode.remove(slotId);
                    size--;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            C10786q c10786q = C10786q.f26013a;
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            z10 = z11;
        }
        if (z10) {
            Snapshot.Companion.sendApplyNotifications();
        }
        makeSureStateIsConsistent();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void forceRecomposeChildren() {
        /*
            r14 = this;
            androidx.compose.ui.node.LayoutNode r0 = r14.root
            java.util.List r0 = r0.getFoldedChildren$ui_release()
            int r0 = r0.size()
            int r1 = r14.reusableCount
            if (r1 == r0) goto L68
            androidx.collection.MutableScatterMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState> r0 = r14.nodeToNodeState
            java.lang.Object[] r1 = r0.values
            long[] r0 = r0.metadata
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L56
            r3 = 0
            r4 = r3
        L1b:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L35:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.layout.LayoutNodeSubcompositionsState$NodeState r10 = (androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState) r10
            r11 = 1
            r10.setForceRecompose(r11)
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r2) goto L56
            int r4 = r4 + 1
            goto L1b
        L56:
            androidx.compose.ui.node.LayoutNode r0 = r14.root
            boolean r0 = r0.getMeasurePending$ui_release()
            if (r0 != 0) goto L68
            androidx.compose.ui.node.LayoutNode r1 = r14.root
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            androidx.compose.p014ui.node.LayoutNode.requestRemeasure$ui_release$default(r1, r2, r3, r4, r5, r6)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.layout.LayoutNodeSubcompositionsState.forceRecomposeChildren():void");
    }

    public final CompositionContext getCompositionContext() {
        return this.compositionContext;
    }

    public final SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    public final void makeSureStateIsConsistent() {
        int size = this.root.getFoldedChildren$ui_release().size();
        if (!(this.nodeToNodeState.getSize() == size)) {
            InlineClassHelperKt.throwIllegalArgumentException("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.getSize() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if (!((size - this.reusableCount) - this.precomposedCount >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Incorrect state. Total children " + size + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount);
        }
        if (this.precomposeMap.getSize() == this.precomposedCount) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.getSize());
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        markActiveNodesAsReused(true);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        disposeCurrentNodes();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        markActiveNodesAsReused(false);
    }

    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(final Object obj, InterfaceC9544p interfaceC9544p) {
        if (!this.root.isAttached()) {
            return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.precompose.1
                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
                public void dispose() {
                }
            };
        }
        makeSureStateIsConsistent();
        if (!this.slotIdToNode.containsKey(obj)) {
            this.approachPrecomposeSlotHandleMap.remove(obj);
            MutableScatterMap<Object, LayoutNode> mutableScatterMap = this.precomposeMap;
            LayoutNode layoutNodeTakeNodeFromReusables = mutableScatterMap.get(obj);
            if (layoutNodeTakeNodeFromReusables == null) {
                layoutNodeTakeNodeFromReusables = takeNodeFromReusables(obj);
                if (layoutNodeTakeNodeFromReusables != null) {
                    move(this.root.getFoldedChildren$ui_release().indexOf(layoutNodeTakeNodeFromReusables), this.root.getFoldedChildren$ui_release().size(), 1);
                    this.precomposedCount++;
                } else {
                    layoutNodeTakeNodeFromReusables = createNodeAt(this.root.getFoldedChildren$ui_release().size());
                    this.precomposedCount++;
                }
                mutableScatterMap.set(obj, layoutNodeTakeNodeFromReusables);
            }
            subcompose(layoutNodeTakeNodeFromReusables, obj, interfaceC9544p);
        }
        return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.precompose.2
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                LayoutNodeSubcompositionsState.this.makeSureStateIsConsistent();
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.remove(obj);
                if (layoutNode != null) {
                    if (!(LayoutNodeSubcompositionsState.this.precomposedCount > 0)) {
                        InlineClassHelperKt.throwIllegalStateException("No pre-composed items to dispose");
                    }
                    int iIndexOf = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().indexOf(layoutNode);
                    if (!(iIndexOf >= LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size() - LayoutNodeSubcompositionsState.this.precomposedCount)) {
                        InlineClassHelperKt.throwIllegalStateException("Item is not in pre-composed item range");
                    }
                    LayoutNodeSubcompositionsState.this.reusableCount++;
                    LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    layoutNodeSubcompositionsState.precomposedCount--;
                    int size = (LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size() - LayoutNodeSubcompositionsState.this.precomposedCount) - LayoutNodeSubcompositionsState.this.reusableCount;
                    LayoutNodeSubcompositionsState.this.move(iIndexOf, size, 1);
                    LayoutNodeSubcompositionsState.this.disposeOrReuseStartingFromIndex(size);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int getPlaceablesCount() {
                List<LayoutNode> children$ui_release;
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
                if (layoutNode == null || (children$ui_release = layoutNode.getChildren$ui_release()) == null) {
                    return 0;
                }
                return children$ui_release.size();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: premeasure-0kLqBqw, reason: not valid java name */
            public void mo32255premeasure0kLqBqw(int i10, long j10) {
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
                if (layoutNode == null || !layoutNode.isAttached()) {
                    return;
                }
                int size = layoutNode.getChildren$ui_release().size();
                if (i10 < 0 || i10 >= size) {
                    InlineClassHelperKt.throwIndexOutOfBoundsException("Index (" + i10 + ") is out of bound of [0, " + size + ')');
                }
                if (layoutNode.isPlaced()) {
                    InlineClassHelperKt.throwIllegalArgumentException("Pre-measure called on node that is not placed");
                }
                LayoutNode layoutNode2 = LayoutNodeSubcompositionsState.this.root;
                layoutNode2.ignoreRemeasureRequests = true;
                LayoutNodeKt.requireOwner(layoutNode).mo32571measureAndLayout0kLqBqw(layoutNode.getChildren$ui_release().get(i10), j10);
                layoutNode2.ignoreRemeasureRequests = false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void traverseDescendants(Object obj2, InterfaceC9540l interfaceC9540l) {
                NodeChain nodes$ui_release;
                Modifier.Node head$ui_release;
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.get(obj);
                if (layoutNode == null || (nodes$ui_release = layoutNode.getNodes$ui_release()) == null || (head$ui_release = nodes$ui_release.getHead$ui_release()) == null) {
                    return;
                }
                TraversableNodeKt.traverseDescendants(head$ui_release, obj2, interfaceC9540l);
            }
        };
    }

    public final void setCompositionContext(CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    public final void setSlotReusePolicy(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        if (this.slotReusePolicy != subcomposeSlotReusePolicy) {
            this.slotReusePolicy = subcomposeSlotReusePolicy;
            markActiveNodesAsReused(false);
            LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, false, 7, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.p014ui.layout.Measurable> subcompose(java.lang.Object r13, p181hd.InterfaceC9544p r14) {
        /*
            r12 = this;
            r12.makeSureStateIsConsistent()
            androidx.compose.ui.node.LayoutNode r0 = r12.root
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r0.getLayoutState$ui_release()
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L1e
            androidx.compose.ui.node.LayoutNode$LayoutState r4 = androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut
            if (r0 == r4) goto L1e
            androidx.compose.ui.node.LayoutNode$LayoutState r4 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring
            if (r0 == r4) goto L1e
            androidx.compose.ui.node.LayoutNode$LayoutState r4 = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut
            if (r0 != r4) goto L1c
            goto L1e
        L1c:
            r4 = r2
            goto L1f
        L1e:
            r4 = r3
        L1f:
            if (r4 != 0) goto L27
            java.lang.String r4 = "subcompose can only be used inside the measure or layout blocks"
            androidx.compose.p014ui.internal.InlineClassHelperKt.throwIllegalStateException(r4)
        L27:
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> r4 = r12.slotIdToNode
            java.lang.Object r5 = r4.get(r13)
            if (r5 != 0) goto L5d
            androidx.collection.MutableScatterMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> r5 = r12.precomposeMap
            java.lang.Object r5 = r5.remove(r13)
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.p014ui.node.LayoutNode) r5
            if (r5 == 0) goto L4e
            int r6 = r12.precomposedCount
            if (r6 <= 0) goto L3f
            r6 = r3
            goto L40
        L3f:
            r6 = r2
        L40:
            if (r6 != 0) goto L47
            java.lang.String r6 = "Check failed."
            androidx.compose.p014ui.internal.InlineClassHelperKt.throwIllegalStateException(r6)
        L47:
            int r6 = r12.precomposedCount
            int r6 = r6 + (-1)
            r12.precomposedCount = r6
            goto L5a
        L4e:
            androidx.compose.ui.node.LayoutNode r5 = r12.takeNodeFromReusables(r13)
            if (r5 != 0) goto L5a
            int r5 = r12.currentIndex
            androidx.compose.ui.node.LayoutNode r5 = r12.createNodeAt(r5)
        L5a:
            r4.set(r13, r5)
        L5d:
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.p014ui.node.LayoutNode) r5
            androidx.compose.ui.node.LayoutNode r4 = r12.root
            java.util.List r4 = r4.getFoldedChildren$ui_release()
            int r6 = r12.currentIndex
            java.lang.Object r4 = p325rc.AbstractC10947g0.m23947p0(r4, r6)
            if (r4 == r5) goto La3
            androidx.compose.ui.node.LayoutNode r4 = r12.root
            java.util.List r4 = r4.getFoldedChildren$ui_release()
            int r7 = r4.indexOf(r5)
            int r4 = r12.currentIndex
            if (r7 < r4) goto L7c
            r2 = r3
        L7c:
            if (r2 != 0) goto L97
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Key \""
            r2.append(r4)
            r2.append(r13)
            java.lang.String r4 = "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            androidx.compose.p014ui.internal.InlineClassHelperKt.throwIllegalArgumentException(r2)
        L97:
            int r8 = r12.currentIndex
            if (r8 == r7) goto La3
            r10 = 4
            r11 = 0
            r9 = 0
            r6 = r12
            move$default(r6, r7, r8, r9, r10, r11)
            goto La4
        La3:
            r6 = r12
        La4:
            int r2 = r6.currentIndex
            int r2 = r2 + r3
            r6.currentIndex = r2
            r12.subcompose(r5, r13, r14)
            if (r0 == r1) goto Lb8
            androidx.compose.ui.node.LayoutNode$LayoutState r13 = androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut
            if (r0 != r13) goto Lb3
            goto Lb8
        Lb3:
            java.util.List r13 = r5.getChildLookaheadMeasurables$ui_release()
            return r13
        Lb8:
            java.util.List r13 = r5.getChildMeasurables$ui_release()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.layout.LayoutNodeSubcompositionsState.subcompose(java.lang.Object, hd.p):java.util.List");
    }

    public static final class NodeState {
        private MutableState<Boolean> activeState;
        private ReusableComposition composition;
        private InterfaceC9544p content;
        private boolean forceRecompose;
        private boolean forceReuse;
        private Object slotId;

        public NodeState(Object obj, InterfaceC9544p interfaceC9544p, ReusableComposition reusableComposition) {
            this.slotId = obj;
            this.content = interfaceC9544p;
            this.composition = reusableComposition;
            this.activeState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        }

        public final boolean getActive() {
            return this.activeState.getValue().booleanValue();
        }

        public final MutableState<Boolean> getActiveState() {
            return this.activeState;
        }

        public final ReusableComposition getComposition() {
            return this.composition;
        }

        public final InterfaceC9544p getContent() {
            return this.content;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        public final Object getSlotId() {
            return this.slotId;
        }

        public final void setActive(boolean z10) {
            this.activeState.setValue(Boolean.valueOf(z10));
        }

        public final void setActiveState(MutableState<Boolean> mutableState) {
            this.activeState = mutableState;
        }

        public final void setComposition(ReusableComposition reusableComposition) {
            this.composition = reusableComposition;
        }

        public final void setContent(InterfaceC9544p interfaceC9544p) {
            this.content = interfaceC9544p;
        }

        public final void setForceRecompose(boolean z10) {
            this.forceRecompose = z10;
        }

        public final void setForceReuse(boolean z10) {
            this.forceReuse = z10;
        }

        public final void setSlotId(Object obj) {
            this.slotId = obj;
        }

        public /* synthetic */ NodeState(Object obj, InterfaceC9544p interfaceC9544p, ReusableComposition reusableComposition, int i10, AbstractC9972n abstractC9972n) {
            this(obj, interfaceC9544p, (i10 & 4) != 0 ? null : reusableComposition);
        }
    }

    private final void subcompose(LayoutNode layoutNode, Object obj, InterfaceC9544p interfaceC9544p) {
        MutableScatterMap<LayoutNode, NodeState> mutableScatterMap = this.nodeToNodeState;
        NodeState nodeState = mutableScatterMap.get(layoutNode);
        if (nodeState == null) {
            NodeState nodeState2 = new NodeState(obj, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m32221getLambda1$ui_release(), null, 4, null);
            mutableScatterMap.set(layoutNode, nodeState2);
            nodeState = nodeState2;
        }
        NodeState nodeState3 = nodeState;
        ReusableComposition composition = nodeState3.getComposition();
        boolean hasInvalidations = composition != null ? composition.getHasInvalidations() : true;
        if (nodeState3.getContent() != interfaceC9544p || hasInvalidations || nodeState3.getForceRecompose()) {
            nodeState3.setContent(interfaceC9544p);
            subcompose(layoutNode, nodeState3);
            nodeState3.setForceRecompose(false);
        }
    }

    private final void subcompose(LayoutNode layoutNode, final NodeState nodeState) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            LayoutNode layoutNode2 = this.root;
            layoutNode2.ignoreRemeasureRequests = true;
            final InterfaceC9544p content = nodeState.getContent();
            ReusableComposition composition = nodeState.getComposition();
            CompositionContext compositionContext = this.compositionContext;
            if (compositionContext != null) {
                nodeState.setComposition(subcomposeInto(composition, layoutNode, nodeState.getForceReuse(), compositionContext, ComposableLambdaKt.composableLambdaInstance(-1750409193, true, new InterfaceC9544p() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // p181hd.InterfaceC9544p
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return C10786q.f26013a;
                    }

                    @Composable
                    public final void invoke(Composer composer, int i10) {
                        if (!composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1750409193, i10, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:522)");
                        }
                        boolean active = nodeState.getActive();
                        InterfaceC9544p interfaceC9544p = content;
                        composer.startReusableGroup(ComposerKt.reuseKey, Boolean.valueOf(active));
                        boolean zChanged = composer.changed(active);
                        if (active) {
                            interfaceC9544p.invoke(composer, 0);
                        } else {
                            composer.deactivateToEndGroup(zChanged);
                        }
                        composer.endReusableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                })));
                nodeState.setForceReuse(false);
                layoutNode2.ignoreRemeasureRequests = false;
                C10786q c10786q = C10786q.f26013a;
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                return;
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("parent composition reference not set");
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
