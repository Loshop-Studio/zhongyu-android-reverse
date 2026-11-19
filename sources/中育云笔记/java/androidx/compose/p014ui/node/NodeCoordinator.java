package androidx.compose.p014ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.MutableRect;
import androidx.compose.p014ui.geometry.MutableRectKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.Matrix;
import androidx.compose.p014ui.graphics.Paint;
import androidx.compose.p014ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.p014ui.input.pointer.PointerType;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.semantics.SemanticsConfiguration;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntOffsetKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10983y0;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public static final int $stable = 0;
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private InterfaceC9544p _drawBlock;
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private Canvas drawBlockCanvas;
    private GraphicsLayer drawBlockParentLayer;
    private GraphicsLayer explicitLayer;
    private boolean forceMeasureWithLookaheadConstraints;
    private boolean forcePlaceWithLookaheadOffset;
    private boolean isClipping;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private InterfaceC9540l layerBlock;
    private LayerPositionalProperties layerPositionalProperties;
    private final LayoutNode layoutNode;
    private MutableObjectIntMap<AlignmentLine> oldAlignmentLines;
    private boolean released;
    private NodeCoordinator wrapped;
    private NodeCoordinator wrappedBy;
    private float zIndex;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC9540l onCommitAffectingLayerParams = new InterfaceC9540l() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NodeCoordinator) obj);
            return C10786q.f26013a;
        }

        public final void invoke(NodeCoordinator nodeCoordinator) {
            if (nodeCoordinator.isValidOwnerScope() && NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null)) {
                LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if (layoutDelegate$ui_release.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                }
                Owner ownerRequireOwner = LayoutNodeKt.requireOwner(layoutNode);
                ownerRequireOwner.getRectManager().onLayoutLayerPositionalPropertiesChanged(layoutNode);
                ownerRequireOwner.requestOnPositionedCallback(layoutNode);
            }
        }
    };
    private static final InterfaceC9540l onCommitAffectingLayer = new InterfaceC9540l() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NodeCoordinator) obj);
            return C10786q.f26013a;
        }

        public final void invoke(NodeCoordinator nodeCoordinator) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();
    private static final float[] tmpMatrix = Matrix.m31108constructorimpl$default(null, 1, null);
    private static final HitTestSource PointerInputSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-qzLsGqo, reason: not valid java name */
        public void mo32500childHitTestqzLsGqo(LayoutNode layoutNode, long j10, HitTestResult hitTestResult, int i10, boolean z10) {
            layoutNode.m32411hitTest6fMxITs$ui_release(j10, hitTestResult, i10, z10);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo32501entityTypeOLwlOKw() {
            return NodeKind.m32510constructorimpl(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            int iM32510constructorimpl = NodeKind.m32510constructorimpl(16);
            MutableVector mutableVector = null;
            while (node != 0) {
                if (node instanceof PointerInputModifierNode) {
                    if (((PointerInputModifierNode) node).interceptOutOfBoundsChildEvents()) {
                        return true;
                    }
                } else if ((node.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release = node.getDelegate$ui_release();
                    int i10 = 0;
                    node = node;
                    while (delegate$ui_release != null) {
                        if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                            i10++;
                            if (i10 == 1) {
                                node = delegate$ui_release;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node != 0) {
                                    mutableVector.add(node);
                                    node = 0;
                                }
                                mutableVector.add(delegate$ui_release);
                            }
                        }
                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                        node = node;
                    }
                    if (i10 == 1) {
                    }
                }
                node = DelegatableNodeKt.pop(mutableVector);
            }
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            return true;
        }
    };
    private static final HitTestSource SemanticsSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-qzLsGqo */
        public void mo32500childHitTestqzLsGqo(LayoutNode layoutNode, long j10, HitTestResult hitTestResult, int i10, boolean z10) {
            layoutNode.m32412hitTestSemantics6fMxITs$ui_release(j10, hitTestResult, i10, z10);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw */
        public int mo32501entityTypeOLwlOKw() {
            return NodeKind.m32510constructorimpl(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
            boolean z10 = false;
            if (semanticsConfiguration != null && semanticsConfiguration.isClearingSemantics()) {
                z10 = true;
            }
            return !z10;
        }
    };
    private Density layerDensity = getLayoutNode().getDensity();
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();
    private float lastLayerAlpha = 0.8f;
    private long position = IntOffset.Companion.m33640getZeronOccac();
    private final InterfaceC9529a invalidateParentLayer = new InterfaceC9529a() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            m32503invoke();
            return C10786q.f26013a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m32503invoke() {
            NodeCoordinator wrappedBy$ui_release = this.this$0.getWrappedBy$ui_release();
            if (wrappedBy$ui_release != null) {
                wrappedBy$ui_release.invalidateLayer();
            }
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }

        private Companion() {
        }
    }

    public interface HitTestSource {
        /* renamed from: childHitTest-qzLsGqo */
        void mo32500childHitTestqzLsGqo(LayoutNode layoutNode, long j10, HitTestResult hitTestResult, int i10, boolean z10);

        /* renamed from: entityType-OLwlOKw */
        int mo32501entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(Modifier.Node node);

        boolean shouldHitTestChildren(LayoutNode layoutNode);
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    private final void ancestorToLocal(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z10) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.ancestorToLocal(nodeCoordinator, mutableRect, z10);
        }
        fromParentRect(mutableRect, z10);
    }

    /* renamed from: ancestorToLocal-S_NoaFU, reason: not valid java name */
    private final long m32473ancestorToLocalS_NoaFU(NodeCoordinator nodeCoordinator, long j10, boolean z10) {
        if (nodeCoordinator == this) {
            return j10;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        return (nodeCoordinator2 == null || AbstractC9979u.m20289b(nodeCoordinator, nodeCoordinator2)) ? m32488fromParentPosition8S9VItk(j10, z10) : m32488fromParentPosition8S9VItk(nodeCoordinator2.m32473ancestorToLocalS_NoaFU(nodeCoordinator, j10, z10), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas, GraphicsLayer graphicsLayer) {
        Modifier.Node nodeM32491headH91voCI = m32491headH91voCI(NodeKind.m32510constructorimpl(4));
        if (nodeM32491headH91voCI == null) {
            performDraw(canvas, graphicsLayer);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m32426draweZhPAX0$ui_release(canvas, IntSizeKt.m33684toSizeozmzZPI(mo32237getSizeYbymL2g()), this, nodeM32491headH91voCI, graphicsLayer);
        }
    }

    /* renamed from: fromParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m32474fromParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return nodeCoordinator.m32488fromParentPosition8S9VItk(j10, z10);
    }

    private final void fromParentRect(MutableRect mutableRect, boolean z10) {
        float fM33629getXimpl = IntOffset.m33629getXimpl(mo32431getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() - fM33629getXimpl);
        mutableRect.setRight(mutableRect.getRight() - fM33629getXimpl);
        float fM33630getYimpl = IntOffset.m33630getYimpl(mo32431getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() - fM33630getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() - fM33630getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.isClipping && z10) {
                mutableRect.intersect(0.0f, 0.0f, (int) (mo32237getSizeYbymL2g() >> 32), (int) (mo32237getSizeYbymL2g() & 4294967295L));
                mutableRect.isEmpty();
            }
        }
    }

    private final InterfaceC9544p getDrawBlock() {
        InterfaceC9544p interfaceC9544p = this._drawBlock;
        if (interfaceC9544p != null) {
            return interfaceC9544p;
        }
        final InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m32502invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m32502invoke() {
                NodeCoordinator nodeCoordinator = this.this$0;
                Canvas canvas = nodeCoordinator.drawBlockCanvas;
                AbstractC9979u.m20291d(canvas);
                nodeCoordinator.drawContainedDrawModifiers(canvas, this.this$0.drawBlockParentLayer);
            }
        };
        InterfaceC9544p interfaceC9544p2 = new InterfaceC9544p() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Canvas) obj, (GraphicsLayer) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(Canvas canvas, GraphicsLayer graphicsLayer) {
                if (!this.this$0.getLayoutNode().isPlaced()) {
                    this.this$0.lastLayerDrawingWasSkipped = true;
                    return;
                }
                this.this$0.drawBlockCanvas = canvas;
                this.this$0.drawBlockParentLayer = graphicsLayer;
                this.this$0.getSnapshotObserver().observeReads$ui_release(this.this$0, NodeCoordinator.onCommitAffectingLayer, interfaceC9529a);
                this.this$0.lastLayerDrawingWasSkipped = false;
            }
        };
        this._drawBlock = interfaceC9544p2;
        return interfaceC9544p2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* renamed from: hasNode-H91voCI, reason: not valid java name */
    private final boolean m32475hasNodeH91voCI(int i10) {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m32519getIncludeSelfInTraversalH91voCI(i10));
        return nodeHeadNode != null && DelegatableNodeKt.m32354has64DMado(nodeHeadNode, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node headNode(boolean z10) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes$ui_release().getHead$ui_release();
        }
        if (!z10) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                return nodeCoordinator.getTail();
            }
            return null;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null || (tail = nodeCoordinator2.getTail()) == null) {
            return null;
        }
        return tail.getChild$ui_release();
    }

    /* renamed from: hit-5ShdDok, reason: not valid java name */
    private final void m32476hit5ShdDok(Modifier.Node node, HitTestSource hitTestSource, long j10, HitTestResult hitTestResult, int i10, boolean z10) {
        if (node == null) {
            mo32400hitTestChildqzLsGqo(hitTestSource, j10, hitTestResult, i10, z10);
            return;
        }
        int i11 = hitTestResult.hitDepth;
        hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.add(node);
        hitTestResult.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(-1.0f, z10, false));
        m32476hit5ShdDok(NodeCoordinatorKt.m32508nextUntilhw7D004(node, hitTestSource.mo32501entityTypeOLwlOKw(), NodeKind.m32510constructorimpl(2)), hitTestSource, j10, hitTestResult, i10, z10);
        hitTestResult.hitDepth = i11;
    }

    /* renamed from: hitNear-Fh5PU_I, reason: not valid java name */
    private final void m32477hitNearFh5PU_I(Modifier.Node node, HitTestSource hitTestSource, long j10, HitTestResult hitTestResult, int i10, boolean z10, float f10) {
        if (node == null) {
            mo32400hitTestChildqzLsGqo(hitTestSource, j10, hitTestResult, i10, z10);
            return;
        }
        int i11 = hitTestResult.hitDepth;
        hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.add(node);
        hitTestResult.distanceFromEdgeAndFlags.add(HitTestResultKt.DistanceAndFlags(f10, z10, false));
        m32480outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m32508nextUntilhw7D004(node, hitTestSource.mo32501entityTypeOLwlOKw(), NodeKind.m32510constructorimpl(2)), hitTestSource, j10, hitTestResult, i10, z10, f10, true);
        hitTestResult.hitDepth = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* renamed from: isInExpandedTouchBounds-ThD-n1k, reason: not valid java name */
    private final boolean m32478isInExpandedTouchBoundsThDn1k(Modifier.Node node, long j10, int i10) {
        if (node == 0) {
            return false;
        }
        PointerType.Companion companion = PointerType.Companion;
        if (!PointerType.m32175equalsimpl0(i10, companion.m32181getStylusT8wyACA()) && !PointerType.m32175equalsimpl0(i10, companion.m32179getEraserT8wyACA())) {
            return false;
        }
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(16);
        MutableVector mutableVector = null;
        while (node != 0) {
            if (node instanceof PointerInputModifierNode) {
                long jMo27932getTouchBoundsExpansionRZrCHBk = ((PointerInputModifierNode) node).mo27932getTouchBoundsExpansionRZrCHBk();
                int i11 = (int) (j10 >> 32);
                if (Float.intBitsToFloat(i11) >= (-TouchBoundsExpansion.m32590computeLeftimpl$ui_release(jMo27932getTouchBoundsExpansionRZrCHBk, getLayoutDirection())) && Float.intBitsToFloat(i11) < getMeasuredWidth() + TouchBoundsExpansion.m32591computeRightimpl$ui_release(jMo27932getTouchBoundsExpansionRZrCHBk, getLayoutDirection())) {
                    int i12 = (int) (j10 & 4294967295L);
                    if (Float.intBitsToFloat(i12) >= (-TouchBoundsExpansion.m32598getTopimpl(jMo27932getTouchBoundsExpansionRZrCHBk)) && Float.intBitsToFloat(i12) < getMeasuredHeight() + TouchBoundsExpansion.m32595getBottomimpl(jMo27932getTouchBoundsExpansionRZrCHBk)) {
                        return true;
                    }
                }
                return false;
            }
            if ((node.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = node.getDelegate$ui_release();
                int i13 = 0;
                node = node;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        i13++;
                        if (i13 == 1) {
                            node = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != 0) {
                                mutableVector.add(node);
                                node = 0;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    node = node;
                }
                if (i13 == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector);
        }
        return false;
    }

    /* renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m32479offsetFromEdgeMKHz9U(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat < 0.0f ? -fIntBitsToFloat : fIntBitsToFloat - getMeasuredWidth());
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j10 & 4294967295L)) < 0.0f ? -r6 : r6 - getMeasuredHeight())) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: outOfBoundsHit-8NAm7pk, reason: not valid java name */
    public final void m32480outOfBoundsHit8NAm7pk(final Modifier.Node node, final HitTestSource hitTestSource, final long j10, final HitTestResult hitTestResult, final int i10, final boolean z10, final float f10, final boolean z11) {
        if (node == null) {
            mo32400hitTestChildqzLsGqo(hitTestSource, j10, hitTestResult, i10, z10);
            return;
        }
        if (m32478isInExpandedTouchBoundsThDn1k(node, j10, i10)) {
            hitTestResult.hitExpandedTouchBounds(node, z10, new InterfaceC9529a() { // from class: androidx.compose.ui.node.NodeCoordinator$outOfBoundsHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m32504invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m32504invoke() {
                    this.this$0.m32480outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m32508nextUntilhw7D004(node, hitTestSource.mo32501entityTypeOLwlOKw(), NodeKind.m32510constructorimpl(2)), hitTestSource, j10, hitTestResult, i10, z10, f10, z11);
                }
            });
        } else if (z11) {
            m32477hitNearFh5PU_I(node, hitTestSource, j10, hitTestResult, i10, z10, f10);
        } else {
            m32482speculativeHitFh5PU_I(node, hitTestSource, j10, hitTestResult, i10, z10, f10);
        }
    }

    /* renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m32481placeSelfMLgxB_4(long j10, float f10, InterfaceC9540l interfaceC9540l, GraphicsLayer graphicsLayer) {
        if (graphicsLayer != null) {
            if (!(interfaceC9540l == null)) {
                InlineClassHelperKt.throwIllegalArgumentException("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != graphicsLayer) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
                this.explicitLayer = graphicsLayer;
            }
            if (this.layer == null) {
                OwnedLayer ownedLayerCreateLayer$default = Owner.createLayer$default(LayoutNodeKt.requireOwner(getLayoutNode()), getDrawBlock(), this.invalidateParentLayer, graphicsLayer, false, 8, null);
                ownedLayerCreateLayer$default.mo32566resizeozmzZPI(m32288getMeasuredSizeYbymL2g());
                ownedLayerCreateLayer$default.mo32565movegyyYBs(j10);
                this.layer = ownedLayerCreateLayer$default;
                getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
            }
            updateLayerBlock$default(this, interfaceC9540l, false, 2, null);
        }
        if (!IntOffset.m33628equalsimpl0(mo32431getPositionnOccac(), j10)) {
            m32496setPositiongyyYBs(j10);
            getLayoutNode().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo32565movegyyYBs(j10);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
            if (owner$ui_release != null) {
                owner$ui_release.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = f10;
        if (isPlacingForAlignment$ui_release()) {
            return;
        }
        captureRulers$ui_release(getMeasureResult$ui_release());
    }

    public static /* synthetic */ void rectInParent$ui_release$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        nodeCoordinator.rectInParent$ui_release(mutableRect, z10, z11);
    }

    /* renamed from: speculativeHit-Fh5PU_I, reason: not valid java name */
    private final void m32482speculativeHitFh5PU_I(final Modifier.Node node, final HitTestSource hitTestSource, final long j10, final HitTestResult hitTestResult, final int i10, final boolean z10, final float f10) {
        if (node == null) {
            mo32400hitTestChildqzLsGqo(hitTestSource, j10, hitTestResult, i10, z10);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            hitTestResult.speculativeHit(node, f10, z10, new InterfaceC9529a() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m32505invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m32505invoke() {
                    this.this$0.m32480outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m32508nextUntilhw7D004(node, hitTestSource.mo32501entityTypeOLwlOKw(), NodeKind.m32510constructorimpl(2)), hitTestSource, j10, hitTestResult, i10, z10, f10, false);
                }
            });
        } else {
            m32480outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m32508nextUntilhw7D004(node, hitTestSource.mo32501entityTypeOLwlOKw(), NodeKind.m32510constructorimpl(2)), hitTestSource, j10, hitTestResult, i10, z10, f10, false);
        }
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (coordinator = lookaheadLayoutCoordinates.getCoordinator()) != null) {
            return coordinator;
        }
        AbstractC9979u.m20292e(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    /* renamed from: toParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m32483toParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return nodeCoordinator.m32497toParentPosition8S9VItk(j10, z10);
    }

    /* renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m32484transformFromAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (AbstractC9979u.m20289b(nodeCoordinator, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        AbstractC9979u.m20291d(nodeCoordinator2);
        nodeCoordinator2.m32484transformFromAncestorEL8BTi8(nodeCoordinator, fArr);
        if (!IntOffset.m33628equalsimpl0(mo32431getPositionnOccac(), IntOffset.Companion.m33640getZeronOccac())) {
            float[] fArr2 = tmpMatrix;
            Matrix.m31117resetimpl(fArr2);
            Matrix.m31130translateimpl$default(fArr2, -IntOffset.m33629getXimpl(mo32431getPositionnOccac()), -IntOffset.m33630getYimpl(mo32431getPositionnOccac()), 0.0f, 4, null);
            Matrix.m31127timesAssign58bKbWc(fArr, fArr2);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo32562inverseTransform58bKbWc(fArr);
        }
    }

    /* renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m32485transformToAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!AbstractC9979u.m20289b(nodeCoordinator2, nodeCoordinator)) {
            OwnedLayer ownedLayer = nodeCoordinator2.layer;
            if (ownedLayer != null) {
                ownedLayer.mo32567transform58bKbWc(fArr);
            }
            if (!IntOffset.m33628equalsimpl0(nodeCoordinator2.mo32431getPositionnOccac(), IntOffset.Companion.m33640getZeronOccac())) {
                float[] fArr2 = tmpMatrix;
                Matrix.m31117resetimpl(fArr2);
                Matrix.m31130translateimpl$default(fArr2, IntOffset.m33629getXimpl(r1), IntOffset.m33630getYimpl(r1), 0.0f, 4, null);
                Matrix.m31127timesAssign58bKbWc(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.wrappedBy;
            AbstractC9979u.m20291d(nodeCoordinator2);
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, InterfaceC9540l interfaceC9540l, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        nodeCoordinator.updateLayerBlock(interfaceC9540l, z10);
    }

    private final boolean updateLayerParameters(boolean z10) {
        Owner owner$ui_release;
        if (this.explicitLayer != null) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null) {
            if (!(this.layerBlock == null)) {
                InlineClassHelperKt.throwIllegalStateException("null layer with a non-null layerBlock");
            }
            return false;
        }
        final InterfaceC9540l interfaceC9540l = this.layerBlock;
        if (interfaceC9540l == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("updateLayerParameters requires a non-null layerBlock");
            throw new KotlinNothingValueException();
        }
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
        reusableGraphicsLayerScope.reset();
        reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
        reusableGraphicsLayerScope.setLayoutDirection$ui_release(getLayoutNode().getLayoutDirection());
        reusableGraphicsLayerScope.m31190setSizeuvyYCjk(IntSizeKt.m33684toSizeozmzZPI(mo32237getSizeYbymL2g()));
        getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new InterfaceC9529a() { // from class: androidx.compose.ui.node.NodeCoordinator.updateLayerParameters.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m32506invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m32506invoke() {
                interfaceC9540l.invoke(NodeCoordinator.graphicsLayerScope);
                NodeCoordinator.graphicsLayerScope.updateOutline$ui_release();
            }
        });
        LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
        if (layerPositionalProperties == null) {
            layerPositionalProperties = new LayerPositionalProperties();
            this.layerPositionalProperties = layerPositionalProperties;
        }
        LayerPositionalProperties layerPositionalProperties2 = tmpLayerPositionalProperties;
        layerPositionalProperties2.copyFrom(layerPositionalProperties);
        layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
        ownedLayer.updateLayerProperties(reusableGraphicsLayerScope);
        boolean z11 = this.isClipping;
        this.isClipping = reusableGraphicsLayerScope.getClip();
        this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
        boolean zHasSameValuesAs = layerPositionalProperties2.hasSameValuesAs(layerPositionalProperties);
        boolean z12 = !zHasSameValuesAs;
        if (z10 && ((!zHasSameValuesAs || z11 != this.isClipping) && (owner$ui_release = getLayoutNode().getOwner$ui_release()) != null)) {
            owner$ui_release.onLayoutChange(getLayoutNode());
        }
        return z12;
    }

    public static /* synthetic */ boolean updateLayerParameters$default(NodeCoordinator nodeCoordinator, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return nodeCoordinator.updateLayerParameters(z10);
    }

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    public final long m32486calculateMinimumTouchTargetPaddingE7KxVPU(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - getMeasuredWidth();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - getMeasuredHeight();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(0.0f, fIntBitsToFloat2 / 2.0f);
        return Size.m30697constructorimpl((Float.floatToRawIntBits(fMax2) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32));
    }

    /* renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    public final float m32487distanceInMinimumTouchTargettz77jQw(long j10, long j11) {
        if (getMeasuredWidth() >= Float.intBitsToFloat((int) (j11 >> 32)) && getMeasuredHeight() >= Float.intBitsToFloat((int) (j11 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM32486calculateMinimumTouchTargetPaddingE7KxVPU = m32486calculateMinimumTouchTargetPaddingE7KxVPU(j11);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM32486calculateMinimumTouchTargetPaddingE7KxVPU >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM32486calculateMinimumTouchTargetPaddingE7KxVPU & 4294967295L));
        long jM32479offsetFromEdgeMKHz9U = m32479offsetFromEdgeMKHz9U(j10);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jM32479offsetFromEdgeMKHz9U >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jM32479offsetFromEdgeMKHz9U & 4294967295L)) <= fIntBitsToFloat2) {
            return Offset.m30636getDistanceSquaredimpl(jM32479offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void draw(Canvas canvas, GraphicsLayer graphicsLayer) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas, graphicsLayer);
            return;
        }
        float fM33629getXimpl = IntOffset.m33629getXimpl(mo32431getPositionnOccac());
        float fM33630getYimpl = IntOffset.m33630getYimpl(mo32431getPositionnOccac());
        canvas.translate(fM33629getXimpl, fM33630getYimpl);
        drawContainedDrawModifiers(canvas, graphicsLayer);
        canvas.translate(-fM33629getXimpl, -fM33630getYimpl);
    }

    public final void drawBorder(Canvas canvas, Paint paint) {
        canvas.drawRect(0.5f, 0.5f, ((int) (m32288getMeasuredSizeYbymL2g() >> 32)) - 0.5f, ((int) (m32288getMeasuredSizeYbymL2g() & 4294967295L)) - 0.5f, paint);
    }

    public abstract void ensureLookaheadDelegateCreated();

    public final NodeCoordinator findCommonAncestor$ui_release(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = nodeCoordinator.getTail();
            Modifier.Node tail2 = getTail();
            int iM32510constructorimpl = NodeKind.m32510constructorimpl(2);
            if (!tail2.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (Modifier.Node parent$ui_release = tail2.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0 && parent$ui_release == tail) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        while (layoutNode.getDepth$ui_release() > layoutNode2.getDepth$ui_release()) {
            layoutNode = layoutNode.getParent$ui_release();
            AbstractC9979u.m20291d(layoutNode);
        }
        while (layoutNode2.getDepth$ui_release() > layoutNode.getDepth$ui_release()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            AbstractC9979u.m20291d(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 != getLayoutNode()) {
            if (layoutNode != nodeCoordinator.getLayoutNode()) {
                return layoutNode.getInnerCoordinator$ui_release();
            }
            return nodeCoordinator;
        }
        return this;
    }

    /* renamed from: fromParentPosition-8S9VItk, reason: not valid java name */
    public long m32488fromParentPosition8S9VItk(long j10, boolean z10) {
        if (z10 || !isPlacedUnderMotionFrameOfReference()) {
            j10 = IntOffsetKt.m33642minusNvtHpc(j10, mo32431getPositionnOccac());
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo32564mapOffset8S9VItk(j10, true) : j10;
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    @Override // androidx.compose.p014ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    public final boolean getForceMeasureWithLookaheadConstraints$ui_release() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    public final boolean getForcePlaceWithLookaheadOffset$ui_release() {
        return this.forcePlaceWithLookaheadOffset;
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return isPlacedUnderMotionFrameOfReference();
    }

    public final boolean getLastLayerDrawingWasSkipped$ui_release() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* renamed from: getLastMeasurementConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m32489getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return m32289getMeasurementConstraintsmsEJaDk();
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    public final InterfaceC9540l getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.p014ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable, androidx.compose.p014ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public abstract LookaheadDelegate getLookaheadDelegate();

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError);
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m32490getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo27100toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo32418getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentCoordinates() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui_release();
        return this.wrappedBy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.p014ui.layout.Measured, androidx.compose.p014ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        if (!getLayoutNode().getNodes$ui_release().m32466hasH91voCI$ui_release(NodeKind.m32510constructorimpl(64))) {
            return null;
        }
        getTail();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (Modifier.Node tail$ui_release = getLayoutNode().getNodes$ui_release().getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if ((NodeKind.m32510constructorimpl(64) & tail$ui_release.getKindSet$ui_release()) != 0) {
                int iM32510constructorimpl = NodeKind.m32510constructorimpl(64);
                MutableVector mutableVector = null;
                DelegatingNode delegatingNodePop = tail$ui_release;
                while (delegatingNodePop != 0) {
                    if (delegatingNodePop instanceof ParentDataModifierNode) {
                        ref$ObjectRef.f23402c = ((ParentDataModifierNode) delegatingNodePop).modifyParentData(getLayoutNode().getDensity(), ref$ObjectRef.f23402c);
                    } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                        int i10 = 0;
                        delegatingNodePop = delegatingNodePop;
                        while (delegate$ui_release != null) {
                            if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    delegatingNodePop = delegate$ui_release;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNodePop != 0) {
                                        mutableVector.add(delegatingNodePop);
                                        delegatingNodePop = 0;
                                    }
                                    mutableVector.add(delegate$ui_release);
                                }
                            }
                            delegate$ui_release = delegate$ui_release.getChild$ui_release();
                            delegatingNodePop = delegatingNodePop;
                        }
                        if (i10 == 1) {
                        }
                    }
                    delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                }
            }
        }
        return ref$ObjectRef.f23402c;
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui_release();
        return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac */
    public long mo32431getPositionnOccac() {
        return this.position;
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            MeasureResult measureResult = nodeCoordinator._measureResult;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
        }
        return linkedHashSet == null ? AbstractC10983y0.m24160f() : linkedHashSet;
    }

    public final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo32237getSizeYbymL2g() {
        return m32288getMeasuredSizeYbymL2g();
    }

    public abstract Modifier.Node getTail();

    public final NodeCoordinator getWrapped$ui_release() {
        return this.wrapped;
    }

    public final NodeCoordinator getWrappedBy$ui_release() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    /* renamed from: head-H91voCI, reason: not valid java name */
    public final Modifier.Node m32491headH91voCI(int i10) {
        boolean zM32519getIncludeSelfInTraversalH91voCI = NodeKindKt.m32519getIncludeSelfInTraversalH91voCI(i10);
        Modifier.Node tail = getTail();
        if (!zM32519getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return null;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM32519getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui_release() & i10) != 0; nodeHeadNode = nodeHeadNode.getChild$ui_release()) {
            if ((nodeHeadNode.getKindSet$ui_release() & i10) != 0) {
                return nodeHeadNode;
            }
            if (nodeHeadNode == tail) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: hitTest-qzLsGqo, reason: not valid java name */
    public final void m32492hitTestqzLsGqo(HitTestSource hitTestSource, long j10, HitTestResult hitTestResult, int i10, boolean z10) {
        boolean z11;
        Modifier.Node nodeM32491headH91voCI = m32491headH91voCI(hitTestSource.mo32501entityTypeOLwlOKw());
        boolean z12 = false;
        if (!m32499withinLayerBoundsk4lQ0M(j10)) {
            if (PointerType.m32175equalsimpl0(i10, PointerType.Companion.m32182getTouchT8wyACA())) {
                float fM32487distanceInMinimumTouchTargettz77jQw = m32487distanceInMinimumTouchTargettz77jQw(j10, m32490getMinimumTouchTargetSizeNHjbRc());
                if ((Float.floatToRawIntBits(fM32487distanceInMinimumTouchTargettz77jQw) & Integer.MAX_VALUE) >= 2139095040 || !hitTestResult.isHitInMinimumTouchTargetBetter(fM32487distanceInMinimumTouchTargettz77jQw, false)) {
                    return;
                }
                m32477hitNearFh5PU_I(nodeM32491headH91voCI, hitTestSource, j10, hitTestResult, i10, false, fM32487distanceInMinimumTouchTargettz77jQw);
                return;
            }
            return;
        }
        if (nodeM32491headH91voCI == null) {
            mo32400hitTestChildqzLsGqo(hitTestSource, j10, hitTestResult, i10, z10);
            return;
        }
        if (m32493isPointerInBoundsk4lQ0M(j10)) {
            m32476hit5ShdDok(nodeM32491headH91voCI, hitTestSource, j10, hitTestResult, i10, z10);
            return;
        }
        float fM32487distanceInMinimumTouchTargettz77jQw2 = !PointerType.m32175equalsimpl0(i10, PointerType.Companion.m32182getTouchT8wyACA()) ? Float.POSITIVE_INFINITY : m32487distanceInMinimumTouchTargettz77jQw(j10, m32490getMinimumTouchTargetSizeNHjbRc());
        if ((Float.floatToRawIntBits(fM32487distanceInMinimumTouchTargettz77jQw2) & Integer.MAX_VALUE) < 2139095040) {
            z11 = z10;
            if (hitTestResult.isHitInMinimumTouchTargetBetter(fM32487distanceInMinimumTouchTargettz77jQw2, z11)) {
                z12 = true;
            }
        } else {
            z11 = z10;
        }
        m32480outOfBoundsHit8NAm7pk(nodeM32491headH91voCI, hitTestSource, j10, hitTestResult, i10, z11, fM32487distanceInMinimumTouchTargettz77jQw2, z12);
    }

    /* renamed from: hitTestChild-qzLsGqo */
    public void mo32400hitTestChildqzLsGqo(HitTestSource hitTestSource, long j10, HitTestResult hitTestResult, int i10, boolean z10) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m32492hitTestqzLsGqo(hitTestSource, m32474fromParentPosition8S9VItk$default(nodeCoordinator, j10, false, 2, null), hitTestResult, i10, z10);
        }
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getTail().isAttached();
    }

    /* renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m32493isPointerInBoundsk4lQ0M(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < ((float) getMeasuredWidth()) && fIntBitsToFloat2 < ((float) getMeasuredHeight());
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.p014ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return (this.layer == null || this.released || !getLayoutNode().isAttached()) ? false : true;
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z10) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        if (!layoutCoordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates " + layoutCoordinates + " is not attached!");
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight((int) (layoutCoordinates.mo32237getSizeYbymL2g() >> 32));
        rectCache.setBottom((int) (layoutCoordinates.mo32237getSizeYbymL2g() & 4294967295L));
        NodeCoordinator nodeCoordinator = coordinator;
        while (nodeCoordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            boolean z11 = z10;
            rectInParent$ui_release$default(nodeCoordinator, rectCache, z11, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            AbstractC9979u.m20291d(nodeCoordinator);
            z10 = z11;
        }
        ancestorToLocal(nodeCoordinatorFindCommonAncestor$ui_release, rectCache, z10);
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo32238localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j10) {
        return mo32239localPositionOfS_NoaFU(layoutCoordinates, j10, true);
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-S_NoaFU */
    public long mo32239localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j10, boolean z10) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            ((LookaheadLayoutCoordinates) layoutCoordinates).getCoordinator().onCoordinatesUsed$ui_release();
            return Offset.m30629constructorimpl(layoutCoordinates.mo32239localPositionOfS_NoaFU(this, Offset.m30629constructorimpl(j10 ^ (-9223372034707292160L)), z10) ^ (-9223372034707292160L));
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui_release) {
            j10 = coordinator.m32497toParentPosition8S9VItk(j10, z10);
            coordinator = coordinator.wrappedBy;
            AbstractC9979u.m20291d(coordinator);
        }
        return m32473ancestorToLocalS_NoaFU(nodeCoordinatorFindCommonAncestor$ui_release, j10, z10);
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo32240localToRootMKHz9U(long j10) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui_release();
        long jM32483toParentPosition8S9VItk$default = j10;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            jM32483toParentPosition8S9VItk$default = m32483toParentPosition8S9VItk$default(nodeCoordinator, jM32483toParentPosition8S9VItk$default, false, 2, null);
        }
        return jM32483toParentPosition8S9VItk$default;
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo32241localToScreenMKHz9U(long j10) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo32184localToScreenMKHz9U(mo32240localToRootMKHz9U(j10));
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo32242localToWindowMKHz9U(long j10) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo32569calculatePositionInWindowMKHz9U(mo32240localToRootMKHz9U(j10));
    }

    public final void onAttach() {
        if (this.layer != null || this.layerBlock == null) {
            return;
        }
        OwnedLayer ownedLayerCreateLayer$default = Owner.createLayer$default(LayoutNodeKt.requireOwner(getLayoutNode()), getDrawBlock(), this.invalidateParentLayer, this.explicitLayer, false, 8, null);
        ownedLayerCreateLayer$default.mo32566resizeozmzZPI(m32288getMeasuredSizeYbymL2g());
        ownedLayerCreateLayer$default.mo32565movegyyYBs(mo32431getPositionnOccac());
        ownedLayerCreateLayer$default.invalidate();
        this.layer = ownedLayerCreateLayer$default;
    }

    public final void onCoordinatesUsed$ui_release() {
        getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
    }

    public final void onDetach() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.destroy();
        }
        this.layer = null;
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onLayoutNodeAttach() {
        updateLayerBlock(this.layerBlock, true);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public void onMeasureResultChanged(int i10, int i11) {
        NodeCoordinator nodeCoordinator;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo32566resizeozmzZPI(IntSize.m33667constructorimpl((i10 << 32) | (i11 & 4294967295L)));
        } else if (getLayoutNode().isPlaced() && (nodeCoordinator = this.wrappedBy) != null) {
            nodeCoordinator.invalidateLayer();
        }
        m32291setMeasuredSizeozmzZPI(IntSize.m33667constructorimpl((i11 & 4294967295L) | (i10 << 32)));
        if (this.layerBlock != null) {
            updateLayerParameters(false);
        }
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(4);
        boolean zM32519getIncludeSelfInTraversalH91voCI = NodeKindKt.m32519getIncludeSelfInTraversalH91voCI(iM32510constructorimpl);
        Modifier.Node tail = getTail();
        if (zM32519getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (Modifier.Node nodeHeadNode = headNode(zM32519getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild$ui_release()) {
                if ((nodeHeadNode.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = nodeHeadNode;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof DrawModifierNode) {
                            ((DrawModifierNode) delegatingNodePop).onMeasureResultChanged();
                        } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                            int i12 = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                    i12++;
                                    if (i12 == 1) {
                                        delegatingNodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                            delegatingNodePop = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i12 == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (nodeHeadNode == tail) {
                    break;
                }
            }
        }
        Owner owner$ui_release = getLayoutNode().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onLayoutChange(getLayoutNode());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public final void onMeasured() {
        Modifier.Node parent$ui_release;
        if (m32475hasNodeH91voCI(NodeKind.m32510constructorimpl(128))) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int iM32510constructorimpl = NodeKind.m32510constructorimpl(128);
                boolean zM32519getIncludeSelfInTraversalH91voCI = NodeKindKt.m32519getIncludeSelfInTraversalH91voCI(iM32510constructorimpl);
                if (!zM32519getIncludeSelfInTraversalH91voCI) {
                    parent$ui_release = getTail().getParent$ui_release();
                    if (parent$ui_release == null) {
                    }
                    C10786q c10786q = C10786q.f26013a;
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                }
                parent$ui_release = getTail();
                for (Modifier.Node nodeHeadNode = headNode(zM32519getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild$ui_release()) {
                    if ((nodeHeadNode.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        MutableVector mutableVector = null;
                        DelegatingNode delegatingNodePop = nodeHeadNode;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof LayoutAwareModifierNode) {
                                ((LayoutAwareModifierNode) delegatingNodePop).mo27087onRemeasuredozmzZPI(m32288getMeasuredSizeYbymL2g());
                            } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                                int i10 = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            delegatingNodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector.add(delegatingNodePop);
                                                delegatingNodePop = 0;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i10 == 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    if (nodeHeadNode == parent$ui_release) {
                        break;
                    }
                }
                C10786q c10786q2 = C10786q.f26013a;
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            } catch (Throwable th) {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void onPlaced() {
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(128);
        boolean zM32519getIncludeSelfInTraversalH91voCI = NodeKindKt.m32519getIncludeSelfInTraversalH91voCI(iM32510constructorimpl);
        Modifier.Node tail = getTail();
        if (!zM32519getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM32519getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild$ui_release()) {
            if ((nodeHeadNode.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                DelegatingNode delegatingNodePop = nodeHeadNode;
                MutableVector mutableVector = null;
                while (delegatingNodePop != 0) {
                    if (delegatingNodePop instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) delegatingNodePop).onPlaced(this);
                    } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                        int i10 = 0;
                        delegatingNodePop = delegatingNodePop;
                        while (delegate$ui_release != null) {
                            if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    delegatingNodePop = delegate$ui_release;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (delegatingNodePop != 0) {
                                        mutableVector.add(delegatingNodePop);
                                        delegatingNodePop = 0;
                                    }
                                    mutableVector.add(delegate$ui_release);
                                }
                            }
                            delegate$ui_release = delegate$ui_release.getChild$ui_release();
                            delegatingNodePop = delegatingNodePop;
                        }
                        if (i10 == 1) {
                        }
                    }
                    delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                }
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        releaseLayer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void onUnplaced() {
        if (m32475hasNodeH91voCI(NodeKind.m32510constructorimpl(1048576))) {
            int iM32510constructorimpl = NodeKind.m32510constructorimpl(1048576);
            boolean zM32519getIncludeSelfInTraversalH91voCI = NodeKindKt.m32519getIncludeSelfInTraversalH91voCI(iM32510constructorimpl);
            Modifier.Node tail = getTail();
            if (!zM32519getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
                return;
            }
            for (Modifier.Node nodeHeadNode = headNode(zM32519getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild$ui_release()) {
                if ((nodeHeadNode.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                    DelegatingNode delegatingNodePop = nodeHeadNode;
                    MutableVector mutableVector = null;
                    while (delegatingNodePop != 0) {
                        if (delegatingNodePop instanceof OnUnplacedModifierNode) {
                            ((OnUnplacedModifierNode) delegatingNodePop).onUnplaced();
                        } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                            int i10 = 0;
                            delegatingNodePop = delegatingNodePop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        delegatingNodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (delegatingNodePop != 0) {
                                            mutableVector.add(delegatingNodePop);
                                            delegatingNodePop = 0;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                delegatingNodePop = delegatingNodePop;
                            }
                            if (i10 == 1) {
                            }
                        }
                        delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (nodeHeadNode == tail) {
                    return;
                }
            }
        }
    }

    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas, graphicsLayer);
        }
    }

    /* renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m32494performingMeasureK40F9xA(long j10, InterfaceC9529a interfaceC9529a) {
        m32292setMeasurementConstraintsBRTryo0(j10);
        return (Placeable) interfaceC9529a.invoke();
    }

    @Override // androidx.compose.p014ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo32230placeAtf8xVGno(long j10, float f10, InterfaceC9540l interfaceC9540l) {
        if (!this.forcePlaceWithLookaheadOffset) {
            m32481placeSelfMLgxB_4(j10, f10, interfaceC9540l, null);
            return;
        }
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        AbstractC9979u.m20291d(lookaheadDelegate);
        m32481placeSelfMLgxB_4(lookaheadDelegate.mo32431getPositionnOccac(), f10, interfaceC9540l, null);
    }

    /* renamed from: placeSelfApparentToRealOffset-MLgxB_4, reason: not valid java name */
    public final void m32495placeSelfApparentToRealOffsetMLgxB_4(long j10, float f10, InterfaceC9540l interfaceC9540l, GraphicsLayer graphicsLayer) {
        m32481placeSelfMLgxB_4(IntOffset.m33633plusqkQi6aY(j10, m32287getApparentToRealOffsetnOccac()), f10, interfaceC9540l, graphicsLayer);
    }

    public final void rectInParent$ui_release(MutableRect mutableRect, boolean z10, boolean z11) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (z11) {
                    long jM32490getMinimumTouchTargetSizeNHjbRc = m32490getMinimumTouchTargetSizeNHjbRc();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jM32490getMinimumTouchTargetSizeNHjbRc >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM32490getMinimumTouchTargetSizeNHjbRc & 4294967295L)) / 2.0f;
                    mutableRect.intersect(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (mo32237getSizeYbymL2g() >> 32)) + fIntBitsToFloat, ((int) (4294967295L & mo32237getSizeYbymL2g())) + fIntBitsToFloat2);
                } else if (z10) {
                    mutableRect.intersect(0.0f, 0.0f, (int) (mo32237getSizeYbymL2g() >> 32), (int) (4294967295L & mo32237getSizeYbymL2g()));
                }
                if (mutableRect.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(mutableRect, false);
        }
        float fM33629getXimpl = IntOffset.m33629getXimpl(mo32431getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() + fM33629getXimpl);
        mutableRect.setRight(mutableRect.getRight() + fM33629getXimpl);
        float fM33630getYimpl = IntOffset.m33630getYimpl(mo32431getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() + fM33630getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() + fM33630getYimpl);
    }

    public final void releaseLayer() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            updateLayerBlock$default(this, null, false, 2, null);
            LayoutNode.requestRelayout$ui_release$default(getLayoutNode(), false, 1, null);
        }
    }

    @Override // androidx.compose.p014ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        GraphicsLayer graphicsLayer = this.explicitLayer;
        if (graphicsLayer != null) {
            mo32290placeAtf8xVGno(mo32431getPositionnOccac(), this.zIndex, graphicsLayer);
        } else {
            mo32230placeAtf8xVGno(mo32431getPositionnOccac(), this.zIndex, this.layerBlock);
        }
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo32243screenToLocalMKHz9U(long j10) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return mo32238localPositionOfR5De75A(LayoutCoordinatesKt.findRootCoordinates(this), LayoutNodeKt.requireOwner(getLayoutNode()).mo32185screenToLocalMKHz9U(j10));
    }

    public final void setForceMeasureWithLookaheadConstraints$ui_release(boolean z10) {
        this.forceMeasureWithLookaheadConstraints = z10;
    }

    public final void setForcePlaceWithLookaheadOffset$ui_release(boolean z10) {
        this.forcePlaceWithLookaheadOffset = z10;
    }

    public abstract void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setMeasureResult$ui_release(androidx.compose.p014ui.layout.MeasureResult r4) {
        /*
            r3 = this;
            androidx.compose.ui.layout.MeasureResult r0 = r3._measureResult
            if (r4 == r0) goto L8c
            r3._measureResult = r4
            if (r0 == 0) goto L1c
            int r1 = r4.getWidth()
            int r2 = r0.getWidth()
            if (r1 != r2) goto L1c
            int r1 = r4.getHeight()
            int r0 = r0.getHeight()
            if (r1 == r0) goto L27
        L1c:
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            r3.onMeasureResultChanged(r0, r1)
        L27:
            androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> r0 = r3.oldAlignmentLines
            if (r0 == 0) goto L34
            kotlin.jvm.internal.AbstractC9979u.m20291d(r0)
            boolean r0 = r0.isNotEmpty()
            if (r0 != 0) goto L3e
        L34:
            java.util.Map r0 = r4.getAlignmentLines()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8c
        L3e:
            androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> r0 = r3.oldAlignmentLines
            java.util.Map r1 = r4.getAlignmentLines()
            boolean r0 = androidx.compose.p014ui.node.NodeCoordinatorKt.access$compareEquals(r0, r1)
            if (r0 != 0) goto L8c
            androidx.compose.ui.node.AlignmentLinesOwner r0 = r3.getAlignmentLinesOwner()
            androidx.compose.ui.node.AlignmentLines r0 = r0.getAlignmentLines()
            r0.onAlignmentsChanged()
            androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> r0 = r3.oldAlignmentLines
            if (r0 != 0) goto L5f
            androidx.collection.MutableObjectIntMap r0 = androidx.collection.ObjectIntMapKt.mutableObjectIntMapOf()
            r3.oldAlignmentLines = r0
        L5f:
            r0.clear()
            java.util.Map r4 = r4.getAlignmentLines()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L6e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.set(r2, r1)
            goto L6e
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.node.NodeCoordinator.setMeasureResult$ui_release(androidx.compose.ui.layout.MeasureResult):void");
    }

    /* renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m32496setPositiongyyYBs(long j10) {
        this.position = j10;
    }

    public final void setWrapped$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui_release(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    public final void setZIndex(float f10) {
        this.zIndex = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m32519getIncludeSelfInTraversalH91voCI(NodeKind.m32510constructorimpl(16)));
        if (nodeHeadNode != null && nodeHeadNode.isAttached()) {
            int iM32510constructorimpl = NodeKind.m32510constructorimpl(16);
            if (!nodeHeadNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
            }
            Modifier.Node node = nodeHeadNode.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = node;
                        MutableVector mutableVector = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof PointerInputModifierNode) {
                                if (((PointerInputModifierNode) delegatingNodePop).sharePointerInputWithSiblings()) {
                                    return true;
                                }
                            } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                                int i10 = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            delegatingNodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector.add(delegatingNodePop);
                                                delegatingNodePop = 0;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i10 == 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    node = node.getChild$ui_release();
                }
            }
        }
        return false;
    }

    /* renamed from: toParentPosition-8S9VItk, reason: not valid java name */
    public long m32497toParentPosition8S9VItk(long j10, boolean z10) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            j10 = ownedLayer.mo32564mapOffset8S9VItk(j10, false);
        }
        return (z10 || !isPlacedUnderMotionFrameOfReference()) ? IntOffsetKt.m33644plusNvtHpc(j10, mo32431getPositionnOccac()) : j10;
    }

    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.Companion.getZero();
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long jM32486calculateMinimumTouchTargetPaddingE7KxVPU = m32486calculateMinimumTouchTargetPaddingE7KxVPU(m32490getMinimumTouchTargetSizeNHjbRc());
        int i10 = (int) (jM32486calculateMinimumTouchTargetPaddingE7KxVPU >> 32);
        rectCache.setLeft(-Float.intBitsToFloat(i10));
        int i11 = (int) (jM32486calculateMinimumTouchTargetPaddingE7KxVPU & 4294967295L);
        rectCache.setTop(-Float.intBitsToFloat(i11));
        rectCache.setRight(getMeasuredWidth() + Float.intBitsToFloat(i10));
        rectCache.setBottom(getMeasuredHeight() + Float.intBitsToFloat(i11));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != layoutCoordinatesFindRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            AbstractC9979u.m20291d(nodeCoordinator);
        }
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo32244transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        Matrix.m31117resetimpl(fArr);
        coordinator.m32485transformToAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, fArr);
        m32484transformFromAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui_release, fArr);
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: transformToScreen-58bKbWc */
    public void mo32245transformToScreen58bKbWc(float[] fArr) {
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        NodeCoordinator coordinator = toCoordinator(LayoutCoordinatesKt.findRootCoordinates(this));
        m32485transformToAncestorEL8BTi8(coordinator, fArr);
        if (ownerRequireOwner instanceof MatrixPositionCalculator) {
            ((MatrixPositionCalculator) ownerRequireOwner).mo32033localToScreen58bKbWc(fArr);
            return;
        }
        long jPositionOnScreen = LayoutCoordinatesKt.positionOnScreen(coordinator);
        if ((9223372034707292159L & jPositionOnScreen) != androidx.compose.p014ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            Matrix.m31129translateimpl(fArr, Float.intBitsToFloat((int) (jPositionOnScreen >> 32)), Float.intBitsToFloat((int) (jPositionOnScreen & 4294967295L)), 0.0f);
        }
    }

    public final void updateLayerBlock(InterfaceC9540l interfaceC9540l, boolean z10) {
        Owner owner$ui_release;
        if (!(interfaceC9540l == null || this.explicitLayer == null)) {
            InlineClassHelperKt.throwIllegalArgumentException("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = getLayoutNode();
        boolean z11 = (!z10 && this.layerBlock == interfaceC9540l && AbstractC9979u.m20289b(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (!layoutNode.isAttached() || interfaceC9540l == null) {
            this.layerBlock = null;
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                if (isAttached() && layoutNode.isPlaced() && (owner$ui_release = layoutNode.getOwner$ui_release()) != null) {
                    owner$ui_release.onLayoutChange(layoutNode);
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        this.layerBlock = interfaceC9540l;
        if (this.layer != null) {
            if (z11 && updateLayerParameters$default(this, false, 1, null)) {
                LayoutNodeKt.requireOwner(layoutNode).getRectManager().onLayoutLayerPositionalPropertiesChanged(layoutNode);
                return;
            }
            return;
        }
        OwnedLayer ownedLayerCreateLayer$default = Owner.createLayer$default(LayoutNodeKt.requireOwner(layoutNode), getDrawBlock(), this.invalidateParentLayer, null, layoutNode.getForceUseOldLayers(), 4, null);
        ownedLayerCreateLayer$default.mo32566resizeozmzZPI(m32288getMeasuredSizeYbymL2g());
        ownedLayerCreateLayer$default.mo32565movegyyYBs(mo32431getPositionnOccac());
        this.layer = ownedLayerCreateLayer$default;
        updateLayerParameters$default(this, false, 1, null);
        layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
        this.invalidateParentLayer.invoke();
    }

    public final void visitNodes(int i10, boolean z10, InterfaceC9540l interfaceC9540l) {
        Modifier.Node tail = getTail();
        if (!z10 && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(z10); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui_release() & i10) != 0; nodeHeadNode = nodeHeadNode.getChild$ui_release()) {
            if ((nodeHeadNode.getKindSet$ui_release() & i10) != 0) {
                interfaceC9540l.invoke(nodeHeadNode);
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    /* renamed from: visitNodes-aLcG6gQ, reason: not valid java name */
    public final /* synthetic */ <T> void m32498visitNodesaLcG6gQ(int i10, InterfaceC9540l interfaceC9540l) {
        boolean zM32519getIncludeSelfInTraversalH91voCI = NodeKindKt.m32519getIncludeSelfInTraversalH91voCI(i10);
        Modifier.Node tail = getTail();
        if (!zM32519getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM32519getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui_release() & i10) != 0; nodeHeadNode = nodeHeadNode.getChild$ui_release()) {
            if ((nodeHeadNode.getKindSet$ui_release() & i10) != 0) {
                for (Modifier.Node nodePop = nodeHeadNode; nodePop != null; nodePop = DelegatableNodeKt.pop(null)) {
                    AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                    interfaceC9540l.invoke(nodePop);
                }
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    @Override // androidx.compose.p014ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo32246windowToLocalMKHz9U(long j10) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo32238localPositionOfR5De75A(layoutCoordinatesFindRootCoordinates, Offset.m30641minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo32568calculateLocalPositionMKHz9U(j10), LayoutCoordinatesKt.positionInRoot(layoutCoordinatesFindRootCoordinates)));
    }

    public final void withPositionTranslation(Canvas canvas, InterfaceC9540l interfaceC9540l) {
        float fM33629getXimpl = IntOffset.m33629getXimpl(mo32431getPositionnOccac());
        float fM33630getYimpl = IntOffset.m33630getYimpl(mo32431getPositionnOccac());
        canvas.translate(fM33629getXimpl, fM33630getYimpl);
        interfaceC9540l.invoke(canvas);
        canvas.translate(-fM33629getXimpl, -fM33630getYimpl);
    }

    /* renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m32499withinLayerBoundsk4lQ0M(long j10) {
        if ((((androidx.compose.p014ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (j10 & androidx.compose.p014ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - androidx.compose.p014ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) != 0) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo32563isInLayerk4lQ0M(j10);
    }

    @Override // androidx.compose.p014ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo32290placeAtf8xVGno(long j10, float f10, GraphicsLayer graphicsLayer) {
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            AbstractC9979u.m20291d(lookaheadDelegate);
            m32481placeSelfMLgxB_4(lookaheadDelegate.mo32431getPositionnOccac(), f10, null, graphicsLayer);
            return;
        }
        m32481placeSelfMLgxB_4(j10, f10, null, graphicsLayer);
    }
}
