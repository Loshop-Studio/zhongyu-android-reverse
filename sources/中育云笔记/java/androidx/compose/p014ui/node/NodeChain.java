package androidx.compose.p014ui.node;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.ModifierInfo;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class NodeChain {
    public static final int $stable = 8;
    private MutableVector<Modifier.Element> buffer;
    private Differ cachedDiffer;
    private MutableVector<Modifier.Element> current;
    private Modifier.Node head;
    private final InnerNodeCoordinator innerCoordinator;
    private final LayoutNode layoutNode;
    private Logger logger;
    private NodeCoordinator outerCoordinator;
    private final Modifier.Node tail;

    public final class Differ implements DiffCallback {
        private MutableVector<Modifier.Element> after;
        private MutableVector<Modifier.Element> before;
        private Modifier.Node node;
        private int offset;
        private boolean shouldAttachOnInsert;

        public Differ(Modifier.Node node, int i10, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, boolean z10) {
            this.node = node;
            this.offset = i10;
            this.before = mutableVector;
            this.after = mutableVector2;
            this.shouldAttachOnInsert = z10;
        }

        @Override // androidx.compose.p014ui.node.DiffCallback
        public boolean areItemsTheSame(int i10, int i11) {
            MutableVector<Modifier.Element> mutableVector = this.before;
            int i12 = this.offset;
            return NodeChainKt.actionForModifiers(mutableVector.content[i10 + i12], this.after.content[i12 + i11]) != 0;
        }

        public final MutableVector<Modifier.Element> getAfter() {
            return this.after;
        }

        public final MutableVector<Modifier.Element> getBefore() {
            return this.before;
        }

        public final Modifier.Node getNode() {
            return this.node;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final boolean getShouldAttachOnInsert() {
            return this.shouldAttachOnInsert;
        }

        @Override // androidx.compose.p014ui.node.DiffCallback
        public void insert(int i10) {
            int i11 = this.offset + i10;
            Modifier.Node node = this.node;
            this.node = NodeChain.this.createAndInsertNodeAsChild(this.after.content[i11], node);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                logger.nodeInserted(i11, i11, this.after.content[i11], node, this.node);
            }
            if (!this.shouldAttachOnInsert) {
                this.node.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
            Modifier.Node child$ui_release = this.node.getChild$ui_release();
            AbstractC9979u.m20291d(child$ui_release);
            NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
            AbstractC9979u.m20291d(coordinator$ui_release);
            LayoutModifierNode layoutModifierNodeAsLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(this.node);
            if (layoutModifierNodeAsLayoutModifierNode != null) {
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(NodeChain.this.getLayoutNode(), layoutModifierNodeAsLayoutModifierNode);
                this.node.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                NodeChain.this.propagateCoordinator(this.node, layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrappedBy$ui_release(coordinator$ui_release.getWrappedBy$ui_release());
                layoutModifierNodeCoordinator.setWrapped$ui_release(coordinator$ui_release);
                coordinator$ui_release.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
            } else {
                this.node.updateCoordinator$ui_release(coordinator$ui_release);
            }
            this.node.markAsAttached$ui_release();
            this.node.runAttachLifecycle$ui_release();
            NodeKindKt.autoInvalidateInsertedNode(this.node);
        }

        @Override // androidx.compose.p014ui.node.DiffCallback
        public void remove(int i10, int i11) {
            Modifier.Node child$ui_release = this.node.getChild$ui_release();
            AbstractC9979u.m20291d(child$ui_release);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                MutableVector<Modifier.Element> mutableVector = this.before;
                logger.nodeRemoved(i11, mutableVector.content[this.offset + i11], child$ui_release);
            }
            if ((NodeKind.m32510constructorimpl(2) & child$ui_release.getKindSet$ui_release()) != 0) {
                NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                AbstractC9979u.m20291d(coordinator$ui_release);
                NodeCoordinator wrappedBy$ui_release = coordinator$ui_release.getWrappedBy$ui_release();
                NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
                AbstractC9979u.m20291d(wrapped$ui_release);
                if (wrappedBy$ui_release != null) {
                    wrappedBy$ui_release.setWrapped$ui_release(wrapped$ui_release);
                }
                wrapped$ui_release.setWrappedBy$ui_release(wrappedBy$ui_release);
                NodeChain.this.propagateCoordinator(this.node, wrapped$ui_release);
            }
            this.node = NodeChain.this.detachAndRemoveNode(child$ui_release);
        }

        @Override // androidx.compose.p014ui.node.DiffCallback
        public void same(int i10, int i11) {
            Modifier.Node child$ui_release = this.node.getChild$ui_release();
            AbstractC9979u.m20291d(child$ui_release);
            this.node = child$ui_release;
            MutableVector<Modifier.Element> mutableVector = this.before;
            int i12 = this.offset;
            Modifier.Element element = mutableVector.content[i12 + i10];
            Modifier.Element element2 = this.after.content[i12 + i11];
            if (AbstractC9979u.m20289b(element, element2)) {
                Logger logger = NodeChain.this.logger;
                if (logger != null) {
                    int i13 = this.offset;
                    logger.nodeReused(i13 + i10, i13 + i11, element, element2, this.node);
                    return;
                }
                return;
            }
            NodeChain.this.updateNode(element, element2, this.node);
            Logger logger2 = NodeChain.this.logger;
            if (logger2 != null) {
                int i14 = this.offset;
                logger2.nodeUpdated(i14 + i10, i14 + i11, element, element2, this.node);
            }
        }

        public final void setAfter(MutableVector<Modifier.Element> mutableVector) {
            this.after = mutableVector;
        }

        public final void setBefore(MutableVector<Modifier.Element> mutableVector) {
            this.before = mutableVector;
        }

        public final void setNode(Modifier.Node node) {
            this.node = node;
        }

        public final void setOffset(int i10) {
            this.offset = i10;
        }

        public final void setShouldAttachOnInsert(boolean z10) {
            this.shouldAttachOnInsert = z10;
        }
    }

    public interface Logger {
        void linearDiffAborted(int i10, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeInserted(int i10, int i11, Modifier.Element element, Modifier.Node node, Modifier.Node node2);

        void nodeRemoved(int i10, Modifier.Element element, Modifier.Node node);

        void nodeReused(int i10, int i11, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeUpdated(int i10, int i11, Modifier.Element element, Modifier.Element element2, Modifier.Node node);
    }

    public NodeChain(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        TailModifierNode tail = innerNodeCoordinator.getTail();
        this.tail = tail;
        this.head = tail;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node createAndInsertNodeAsChild(Modifier.Element element, Modifier.Node node) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (backwardsCompatNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return insertChild(backwardsCompatNode, node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.isAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.runDetachLifecycle$ui_release();
            node.markAsDetached$ui_release();
        }
        return removeNode(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet$ui_release();
    }

    private final Differ getDiffer(Modifier.Node node, int i10, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, boolean z10) {
        Differ differ = this.cachedDiffer;
        if (differ == null) {
            Differ differ2 = new Differ(node, i10, mutableVector, mutableVector2, z10);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.setNode(node);
        differ.setOffset(i10);
        differ.setBefore(mutableVector);
        differ.setAfter(mutableVector2);
        differ.setShouldAttachOnInsert(z10);
        return differ;
    }

    private final Modifier.Node insertChild(Modifier.Node node, Modifier.Node node2) {
        Modifier.Node child$ui_release = node2.getChild$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(node);
            node.setChild$ui_release(child$ui_release);
        }
        node2.setChild$ui_release(node);
        node.setParent$ui_release(node2);
        return node;
    }

    private final Modifier.Node padChain() {
        if (!(this.head != NodeChainKt.SentinelHead)) {
            InlineClassHelperKt.throwIllegalStateException("padChain called on already padded chain");
        }
        Modifier.Node node = this.head;
        node.setParent$ui_release(NodeChainKt.SentinelHead);
        NodeChainKt.SentinelHead.setChild$ui_release(node);
        return NodeChainKt.SentinelHead;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void propagateCoordinator(Modifier.Node node, NodeCoordinator nodeCoordinator) {
        for (Modifier.Node parent$ui_release = node.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (parent$ui_release == NodeChainKt.SentinelHead) {
                LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
                nodeCoordinator.setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
                this.outerCoordinator = nodeCoordinator;
                return;
            } else {
                if ((NodeKind.m32510constructorimpl(2) & parent$ui_release.getKindSet$ui_release()) != 0) {
                    return;
                }
                parent$ui_release.updateCoordinator$ui_release(nodeCoordinator);
            }
        }
    }

    private final Modifier.Node removeNode(Modifier.Node node) {
        Modifier.Node child$ui_release = node.getChild$ui_release();
        Modifier.Node parent$ui_release = node.getParent$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            node.setChild$ui_release(null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            node.setParent$ui_release(null);
        }
        AbstractC9979u.m20291d(parent$ui_release);
        return parent$ui_release;
    }

    private final void structuralUpdate(int i10, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, Modifier.Node node, boolean z10) {
        MyersDiffKt.executeDiff(mutableVector.getSize() - i10, mutableVector2.getSize() - i10, getDiffer(node, i10, mutableVector, mutableVector2, z10));
        syncAggregateChildKindSet();
    }

    private final void syncAggregateChildKindSet() {
        int kindSet$ui_release = 0;
        for (Modifier.Node parent$ui_release = this.tail.getParent$ui_release(); parent$ui_release != null && parent$ui_release != NodeChainKt.SentinelHead; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            kindSet$ui_release |= parent$ui_release.getKindSet$ui_release();
            parent$ui_release.setAggregateChildKindSet$ui_release(kindSet$ui_release);
        }
    }

    private final Modifier.Node trimChain(Modifier.Node node) {
        if (!(node == NodeChainKt.SentinelHead)) {
            InlineClassHelperKt.throwIllegalStateException("trimChain called on already trimmed chain");
        }
        Modifier.Node child$ui_release = NodeChainKt.SentinelHead.getChild$ui_release();
        if (child$ui_release == null) {
            child$ui_release = this.tail;
        }
        child$ui_release.setParent$ui_release(null);
        NodeChainKt.SentinelHead.setChild$ui_release(null);
        NodeChainKt.SentinelHead.setAggregateChildKindSet$ui_release(-1);
        NodeChainKt.SentinelHead.updateCoordinator$ui_release(null);
        if (!(child$ui_release != NodeChainKt.SentinelHead)) {
            InlineClassHelperKt.throwIllegalStateException("trimChain did not update the head");
        }
        return child$ui_release;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNode(Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        if ((element instanceof ModifierNodeElement) && (element2 instanceof ModifierNodeElement)) {
            NodeChainKt.updateUnsafe((ModifierNodeElement) element2, node);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        if (!(node instanceof BackwardsCompatNode)) {
            InlineClassHelperKt.throwIllegalStateException("Unknown Modifier.Node type");
            return;
        }
        ((BackwardsCompatNode) node).setElement(element2);
        if (node.isAttached()) {
            NodeKindKt.autoInvalidateUpdatedNode(node);
        } else {
            node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
        }
    }

    /* renamed from: firstFromHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m32465firstFromHeadaLcG6gQ$ui_release(int i10, InterfaceC9540l interfaceC9540l) {
        if ((getAggregateChildKindSet() & i10) != 0) {
            for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & i10) != 0) {
                    for (T t10 = (T) head$ui_release; t10 != null; t10 = (T) DelegatableNodeKt.pop(null)) {
                        AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                        if (((Boolean) interfaceC9540l.invoke(t10)).booleanValue()) {
                            return t10;
                        }
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i10) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    public final Modifier.Node getHead$ui_release() {
        return this.head;
    }

    public final InnerNodeCoordinator getInnerCoordinator$ui_release() {
        return this.innerCoordinator;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final List<ModifierInfo> getModifierInfo() {
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            return AbstractC10978w.m24136n();
        }
        int i10 = 0;
        MutableVector mutableVector2 = new MutableVector(new ModifierInfo[mutableVector.getSize()], 0);
        Modifier.Node head$ui_release = getHead$ui_release();
        while (head$ui_release != null && head$ui_release != getTail$ui_release()) {
            NodeCoordinator coordinator$ui_release = head$ui_release.getCoordinator$ui_release();
            if (coordinator$ui_release == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            OwnedLayer layer = coordinator$ui_release.getLayer();
            OwnedLayer layer2 = this.innerCoordinator.getLayer();
            Modifier.Node child$ui_release = head$ui_release.getChild$ui_release();
            if (child$ui_release != this.tail || head$ui_release.getCoordinator$ui_release() == child$ui_release.getCoordinator$ui_release()) {
                layer2 = null;
            }
            if (layer == null) {
                layer = layer2;
            }
            mutableVector2.add(new ModifierInfo(mutableVector.content[i10], coordinator$ui_release, layer));
            head$ui_release = head$ui_release.getChild$ui_release();
            i10++;
        }
        return mutableVector2.asMutableList();
    }

    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.outerCoordinator;
    }

    public final Modifier.Node getTail$ui_release() {
        return this.tail;
    }

    public final boolean has$ui_release(int i10) {
        return (i10 & getAggregateChildKindSet()) != 0;
    }

    /* renamed from: has-H91voCI$ui_release, reason: not valid java name */
    public final boolean m32466hasH91voCI$ui_release(int i10) {
        return (i10 & getAggregateChildKindSet()) != 0;
    }

    /* renamed from: head-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m32467headH91voCI$ui_release(int i10) {
        if ((getAggregateChildKindSet() & i10) == 0) {
            return null;
        }
        for (Object obj = (T) getHead$ui_release(); obj != null; obj = (T) ((Modifier.Node) obj).getChild$ui_release()) {
            if ((((Modifier.Node) obj).getKindSet$ui_release() & i10) != 0) {
                AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                return (T) obj;
            }
            if ((((Modifier.Node) obj).getAggregateChildKindSet$ui_release() & i10) == 0) {
                return null;
            }
        }
        return null;
    }

    public final void headToTail$ui_release(int i10, InterfaceC9540l interfaceC9540l) {
        if ((getAggregateChildKindSet() & i10) == 0) {
            return;
        }
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            if ((head$ui_release.getKindSet$ui_release() & i10) != 0) {
                interfaceC9540l.invoke(head$ui_release);
            }
            if ((head$ui_release.getAggregateChildKindSet$ui_release() & i10) == 0) {
                return;
            }
        }
    }

    /* renamed from: headToTail-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m32468headToTailaLcG6gQ$ui_release(int i10, InterfaceC9540l interfaceC9540l) {
        if ((getAggregateChildKindSet() & i10) != 0) {
            for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & i10) != 0) {
                    for (Modifier.Node nodePop = head$ui_release; nodePop != null; nodePop = DelegatableNodeKt.pop(null)) {
                        AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                        interfaceC9540l.invoke(nodePop);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i10) == 0) {
                    return;
                }
            }
        }
    }

    public final void headToTailExclusive$ui_release(InterfaceC9540l interfaceC9540l) {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null && head$ui_release != getTail$ui_release(); head$ui_release = head$ui_release.getChild$ui_release()) {
            interfaceC9540l.invoke(head$ui_release);
        }
    }

    public final boolean isUpdating$ui_release() {
        return NodeChainKt.SentinelHead.getChild$ui_release() != null;
    }

    public final void markAsAttached() {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.markAsAttached$ui_release();
        }
    }

    public final void markAsDetached$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.markAsDetached$ui_release();
            }
        }
    }

    public final void resetState$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.reset$ui_release();
            }
        }
        runDetachLifecycle$ui_release();
        markAsDetached$ui_release();
    }

    public final void runAttachLifecycle() {
        NodeCoordinator wrapped$ui_release = this.outerCoordinator;
        InnerNodeCoordinator innerNodeCoordinator = this.innerCoordinator;
        while (wrapped$ui_release != innerNodeCoordinator) {
            wrapped$ui_release.onAttach();
            wrapped$ui_release = wrapped$ui_release.getWrapped$ui_release();
            AbstractC9979u.m20291d(wrapped$ui_release);
        }
        innerNodeCoordinator.onAttach();
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.runAttachLifecycle$ui_release();
            if (head$ui_release.getInsertedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateInsertedNode(head$ui_release);
            }
            if (head$ui_release.getUpdatedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateUpdatedNode(head$ui_release);
            }
            head$ui_release.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            head$ui_release.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    public final void runDetachLifecycle$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.runDetachLifecycle$ui_release();
            }
        }
        NodeCoordinator wrappedBy$ui_release = this.innerCoordinator;
        NodeCoordinator nodeCoordinator = this.outerCoordinator;
        while (wrappedBy$ui_release != nodeCoordinator) {
            wrappedBy$ui_release.onDetach();
            wrappedBy$ui_release = wrappedBy$ui_release.getWrappedBy$ui_release();
            AbstractC9979u.m20291d(wrappedBy$ui_release);
        }
        nodeCoordinator.onDetach();
    }

    public final void syncCoordinators() {
        NodeCoordinator layoutModifierNodeCoordinator;
        NodeCoordinator nodeCoordinator = this.innerCoordinator;
        for (Modifier.Node parent$ui_release = this.tail.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            LayoutModifierNode layoutModifierNodeAsLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(parent$ui_release);
            if (layoutModifierNodeAsLayoutModifierNode != null) {
                if (parent$ui_release.getCoordinator$ui_release() != null) {
                    NodeCoordinator coordinator$ui_release = parent$ui_release.getCoordinator$ui_release();
                    AbstractC9979u.m20292e(coordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) coordinator$ui_release;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.setLayoutModifierNode$ui_release(layoutModifierNodeAsLayoutModifierNode);
                    if (layoutModifierNode != parent$ui_release) {
                        layoutModifierNodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(this.layoutNode, layoutModifierNodeAsLayoutModifierNode);
                    parent$ui_release.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                }
                nodeCoordinator.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrapped$ui_release(nodeCoordinator);
                nodeCoordinator = layoutModifierNodeCoordinator;
            } else {
                parent$ui_release.updateCoordinator$ui_release(nodeCoordinator);
            }
        }
        LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
        nodeCoordinator.setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
        this.outerCoordinator = nodeCoordinator;
    }

    /* renamed from: tail-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m32469tailH91voCI$ui_release(int i10) {
        if ((getAggregateChildKindSet() & i10) == 0) {
            return null;
        }
        for (Object obj = (T) getTail$ui_release(); obj != null; obj = (T) ((Modifier.Node) obj).getParent$ui_release()) {
            if ((((Modifier.Node) obj).getKindSet$ui_release() & i10) != 0) {
                AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                return (T) obj;
            }
        }
        return null;
    }

    public final void tailToHead$ui_release(int i10, InterfaceC9540l interfaceC9540l) {
        if ((getAggregateChildKindSet() & i10) == 0) {
            return;
        }
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if ((tail$ui_release.getKindSet$ui_release() & i10) != 0) {
                interfaceC9540l.invoke(tail$ui_release);
            }
        }
    }

    /* renamed from: tailToHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m32470tailToHeadaLcG6gQ$ui_release(int i10, InterfaceC9540l interfaceC9540l) {
        if ((getAggregateChildKindSet() & i10) != 0) {
            for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((tail$ui_release.getKindSet$ui_release() & i10) != 0) {
                    for (Modifier.Node nodePop = tail$ui_release; nodePop != null; nodePop = DelegatableNodeKt.pop(null)) {
                        AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                        interfaceC9540l.invoke(nodePop);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        if (this.head == this.tail) {
            sb2.append("]");
        } else {
            Modifier.Node head$ui_release = getHead$ui_release();
            while (true) {
                if (head$ui_release == null || head$ui_release == getTail$ui_release()) {
                    break;
                }
                sb2.append(String.valueOf(head$ui_release));
                if (head$ui_release.getChild$ui_release() == this.tail) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateFrom$ui_release(androidx.compose.p014ui.Modifier r18) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.node.NodeChain.updateFrom$ui_release(androidx.compose.ui.Modifier):void");
    }

    public final void useLogger$ui_release(Logger logger) {
        this.logger = logger;
    }

    public final void tailToHead$ui_release(InterfaceC9540l interfaceC9540l) {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            interfaceC9540l.invoke(tail$ui_release);
        }
    }

    public final void headToTail$ui_release(InterfaceC9540l interfaceC9540l) {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            interfaceC9540l.invoke(head$ui_release);
        }
    }
}
