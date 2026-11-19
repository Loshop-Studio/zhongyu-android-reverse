package androidx.compose.p014ui.node;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.GraphicsContext;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.semantics.SemanticsInfo;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class DelegatableNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node, boolean z10) {
        MutableVector<LayoutNode> children = getChildren(requireLayoutNode(node), z10);
        int size = children.getSize() - 1;
        LayoutNode[] layoutNodeArr = children.content;
        if (size < layoutNodeArr.length) {
            while (size >= 0) {
                mutableVector.add(layoutNodeArr[size].getNodes$ui_release().getHead$ui_release());
                size--;
            }
        }
    }

    /* renamed from: ancestors-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> List<T> m32352ancestors64DMado(DelegatableNode delegatableNode, int i10) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i10) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & i10) != 0) {
                        for (Modifier.Node nodePop = parent$ui_release; nodePop != null; nodePop = pop(null)) {
                            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(nodePop);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutModifierNode asLayoutModifierNode(Modifier.Node node) {
        if ((NodeKind.m32510constructorimpl(2) & node.getKindSet$ui_release()) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release();
                while (delegate$ui_release != 0) {
                    if (delegate$ui_release instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) delegate$ui_release;
                    }
                    delegate$ui_release = (!(delegate$ui_release instanceof DelegatingNode) || (NodeKind.m32510constructorimpl(2) & delegate$ui_release.getKindSet$ui_release()) == 0) ? delegate$ui_release.getChild$ui_release() : ((DelegatingNode) delegate$ui_release).getDelegate$ui_release();
                }
            }
        }
        return null;
    }

    /* renamed from: dispatchForKind-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m32353dispatchForKind6rFNWt0(Modifier.Node node, int i10, InterfaceC9540l interfaceC9540l) {
        while (node != null) {
            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
            interfaceC9540l.invoke(node);
            node = pop(null);
        }
    }

    private static final MutableVector<LayoutNode> getChildren(LayoutNode layoutNode, boolean z10) {
        return z10 ? layoutNode.getZSortedChildren() : layoutNode.get_children$ui_release();
    }

    /* renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m32354has64DMado(DelegatableNode delegatableNode, int i10) {
        return (delegatableNode.getNode().getAggregateChildKindSet$ui_release() & i10) != 0;
    }

    public static final void invalidateSubtree(DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().isAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    public static final boolean isDelegationRoot(DelegatableNode delegatableNode) {
        return delegatableNode.getNode() == delegatableNode;
    }

    public static final Modifier.Node nearestAncestor(DelegatableNode delegatableNode, int i10) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("nearestAncestor called on an unattached node");
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i10) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & i10) != 0) {
                        return parent$ui_release;
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return null;
    }

    /* renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m32355nearestAncestor64DMado(DelegatableNode delegatableNode, int i10) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Object parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i10) != 0) {
                while (parent$ui_release != null) {
                    if ((((Modifier.Node) parent$ui_release).getKindSet$ui_release() & i10) != 0) {
                        AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                        return (T) parent$ui_release;
                    }
                    parent$ui_release = (T) ((Modifier.Node) parent$ui_release).getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? (T) null : (T) nodes$ui_release.getTail$ui_release();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node pop(MutableVector<Modifier.Node> mutableVector) {
        if (mutableVector == null || mutableVector.getSize() == 0) {
            return null;
        }
        return mutableVector.removeAt(mutableVector.getSize() - 1);
    }

    public static final void requestAutofill(DelegatableNode delegatableNode) {
        requireLayoutNode(delegatableNode).requestAutofill$ui_release();
    }

    /* renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m32356requireCoordinator64DMado(DelegatableNode delegatableNode, int i10) {
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        AbstractC9979u.m20291d(coordinator$ui_release);
        if (coordinator$ui_release.getTail() != delegatableNode || !NodeKindKt.m32519getIncludeSelfInTraversalH91voCI(i10)) {
            return coordinator$ui_release;
        }
        NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
        AbstractC9979u.m20291d(wrapped$ui_release);
        return wrapped$ui_release;
    }

    public static final Density requireDensity(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getDensity();
    }

    public static final GraphicsContext requireGraphicsContext(DelegatableNode delegatableNode) {
        return requireOwner(delegatableNode).getGraphicsContext();
    }

    public static final LayoutCoordinates requireLayoutCoordinates(DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        LayoutCoordinates coordinates = m32356requireCoordinator64DMado(delegatableNode, NodeKind.m32510constructorimpl(2)).getCoordinates();
        if (!coordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates is not attached.");
        }
        return coordinates;
    }

    public static final LayoutDirection requireLayoutDirection(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    public static final LayoutNode requireLayoutNode(DelegatableNode delegatableNode) {
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return coordinator$ui_release.getLayoutNode();
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new KotlinNothingValueException();
    }

    public static final Owner requireOwner(DelegatableNode delegatableNode) {
        Owner owner$ui_release = requireLayoutNode(delegatableNode).getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("This node does not have an owner.");
        throw new KotlinNothingValueException();
    }

    public static final SemanticsInfo requireSemanticsInfo(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode);
    }

    public static final void visitAncestors(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z10 ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i10) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & i10) != 0) {
                        interfaceC9540l.invoke(node);
                    }
                    node = node.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    public static /* synthetic */ void visitAncestors$default(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        NodeChain nodes$ui_release;
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z10 ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i10) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & i10) != 0) {
                        interfaceC9540l.invoke(node);
                    }
                    node = node.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* renamed from: visitAncestors-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m32357visitAncestorsYYKmho(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z10 ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i10) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & i10) != 0) {
                        for (Modifier.Node nodePop = node; nodePop != null; nodePop = pop(null)) {
                            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                            interfaceC9540l.invoke(nodePop);
                        }
                    }
                    node = node.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* renamed from: visitAncestors-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m32358visitAncestorsYYKmho$default(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        NodeChain nodes$ui_release;
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z10 ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i10) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & i10) != 0) {
                        for (Modifier.Node nodePop = node; nodePop != null; nodePop = pop(null)) {
                            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                            interfaceC9540l.invoke(nodePop);
                        }
                    }
                    node = node.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    public static final void visitChildren(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z10);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node child$ui_release2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child$ui_release2.getAggregateChildKindSet$ui_release() & i10) == 0) {
                addLayoutNodeChildren(mutableVector, child$ui_release2, z10);
            } else {
                while (true) {
                    if (child$ui_release2 == null) {
                        break;
                    }
                    if ((child$ui_release2.getKindSet$ui_release() & i10) != 0) {
                        interfaceC9540l.invoke(child$ui_release2);
                        break;
                    }
                    child$ui_release2 = child$ui_release2.getChild$ui_release();
                }
            }
        }
    }

    /* renamed from: visitChildren-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m32359visitChildrenYYKmho(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z10);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui_release() & i10) == 0) {
                addLayoutNodeChildren(mutableVector, nodePop, z10);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui_release() & i10) != 0) {
                        while (nodePop != null) {
                            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                            interfaceC9540l.invoke(nodePop);
                            nodePop = pop(null);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui_release();
                    }
                }
            }
        }
    }

    /* renamed from: visitChildren-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m32360visitChildrenYYKmho$default(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z10);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui_release() & i10) == 0) {
                addLayoutNodeChildren(mutableVector, nodePop, z10);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui_release() & i10) != 0) {
                        while (nodePop != null) {
                            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                            interfaceC9540l.invoke(nodePop);
                            nodePop = pop(null);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui_release();
                    }
                }
            }
        }
    }

    public static final void visitLocalAncestors(DelegatableNode delegatableNode, int i10, InterfaceC9540l interfaceC9540l) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if ((parent$ui_release.getKindSet$ui_release() & i10) != 0) {
                interfaceC9540l.invoke(parent$ui_release);
            }
        }
    }

    /* renamed from: visitLocalAncestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m32361visitLocalAncestors6rFNWt0(DelegatableNode delegatableNode, int i10, InterfaceC9540l interfaceC9540l) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if ((parent$ui_release.getKindSet$ui_release() & i10) != 0) {
                for (Modifier.Node nodePop = parent$ui_release; nodePop != null; nodePop = pop(null)) {
                    AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                    interfaceC9540l.invoke(nodePop);
                }
            }
        }
    }

    public static final void visitLocalDescendants(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i10) == 0) {
            return;
        }
        if (!z10) {
            node = node.getChild$ui_release();
        }
        while (node != null) {
            if ((node.getKindSet$ui_release() & i10) != 0) {
                interfaceC9540l.invoke(node);
            }
            node = node.getChild$ui_release();
        }
    }

    public static /* synthetic */ void visitLocalDescendants$default(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i10) == 0) {
            return;
        }
        if (!z10) {
            node = node.getChild$ui_release();
        }
        while (node != null) {
            if ((node.getKindSet$ui_release() & i10) != 0) {
                interfaceC9540l.invoke(node);
            }
            node = node.getChild$ui_release();
        }
    }

    /* renamed from: visitLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m32362visitLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i10, InterfaceC9540l interfaceC9540l) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i10) != 0) {
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & i10) != 0) {
                    for (Modifier.Node nodePop = child$ui_release; nodePop != null; nodePop = pop(null)) {
                        AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                        interfaceC9540l.invoke(nodePop);
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndAncestors-5BbP62I, reason: not valid java name */
    public static final /* synthetic */ <T> void m32363visitSelfAndAncestors5BbP62I(DelegatableNode delegatableNode, int i10, int i11, InterfaceC9540l interfaceC9540l) {
        NodeChain nodes$ui_release;
        Modifier.Node node = delegatableNode.getNode();
        int i12 = i10 | i11;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = delegatableNode.getNode();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i12) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i12) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & i11) != 0) {
                            return;
                        }
                        if ((node2.getKindSet$ui_release() & i10) != 0) {
                            for (Modifier.Node nodePop = node2; nodePop != null; nodePop = pop(null)) {
                                AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                                interfaceC9540l.invoke(nodePop);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* renamed from: visitSelfAndChildren-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m32364visitSelfAndChildrenYYKmho(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l) {
        for (Object node = delegatableNode.getNode(); node != null; node = pop(null)) {
            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
            interfaceC9540l.invoke(node);
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z10);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui_release() & i10) == 0) {
                addLayoutNodeChildren(mutableVector, nodePop, z10);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui_release() & i10) != 0) {
                        while (nodePop != null) {
                            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                            interfaceC9540l.invoke(nodePop);
                            nodePop = pop(null);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui_release();
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndChildren-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m32365visitSelfAndChildrenYYKmho$default(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        for (Object node = delegatableNode.getNode(); node != null; node = pop(null)) {
            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
            interfaceC9540l.invoke(node);
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z10);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui_release() & i10) == 0) {
                addLayoutNodeChildren(mutableVector, nodePop, z10);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui_release() & i10) != 0) {
                        while (nodePop != null) {
                            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                            interfaceC9540l.invoke(nodePop);
                            nodePop = pop(null);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui_release();
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m32366visitSelfAndLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i10, InterfaceC9540l interfaceC9540l) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i10) != 0) {
            while (node != null) {
                if ((node.getKindSet$ui_release() & i10) != 0) {
                    for (Modifier.Node nodePop = node; nodePop != null; nodePop = pop(null)) {
                        AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                        interfaceC9540l.invoke(nodePop);
                    }
                }
                node = node.getChild$ui_release();
            }
        }
    }

    /* renamed from: visitSubtree-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m32367visitSubtreeYYKmho(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z10);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & i10) != 0) {
                for (Modifier.Node child$ui_release2 = node; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & i10) != 0) {
                        for (Modifier.Node nodePop = child$ui_release2; nodePop != null; nodePop = pop(null)) {
                            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                            interfaceC9540l.invoke(nodePop);
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z10);
        }
    }

    /* renamed from: visitSubtree-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m32368visitSubtreeYYKmho$default(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z10);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & i10) != 0) {
                for (Modifier.Node child$ui_release2 = node; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & i10) != 0) {
                        for (Modifier.Node nodePop = child$ui_release2; nodePop != null; nodePop = pop(null)) {
                            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                            interfaceC9540l.invoke(nodePop);
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z10);
        }
    }

    public static final void visitSubtreeIf(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z10);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & i10) != 0) {
                for (Modifier.Node child$ui_release2 = node; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & i10) == 0 || ((Boolean) interfaceC9540l.invoke(child$ui_release2)).booleanValue()) {
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z10);
        }
    }

    /* renamed from: visitSubtreeIf-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m32369visitSubtreeIfYYKmho(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z10);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & i10) != 0) {
                for (Modifier.Node child$ui_release2 = node; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & i10) != 0) {
                        for (Modifier.Node nodePop = child$ui_release2; nodePop != null; nodePop = pop(null)) {
                            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (!((Boolean) interfaceC9540l.invoke(nodePop)).booleanValue()) {
                                break;
                            }
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z10);
        }
    }

    /* renamed from: visitSubtreeIf-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m32370visitSubtreeIfYYKmho$default(DelegatableNode delegatableNode, int i10, boolean z10, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z10);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & i10) != 0) {
                for (Modifier.Node child$ui_release2 = node; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & i10) != 0) {
                        for (Modifier.Node nodePop = child$ui_release2; nodePop != null; nodePop = pop(null)) {
                            AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (!((Boolean) interfaceC9540l.invoke(nodePop)).booleanValue()) {
                                break;
                            }
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z10);
        }
    }

    public static final void visitLocalDescendants(DelegatableNode delegatableNode, int i10, InterfaceC9540l interfaceC9540l) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i10) != 0) {
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & i10) != 0) {
                    interfaceC9540l.invoke(child$ui_release);
                }
            }
        }
    }
}
