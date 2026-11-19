package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.ComposeUiFlags;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.focus.FocusDirection;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.BeyondBoundsLayout;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.NodeChain;
import androidx.compose.p014ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p265nd.C10405j;

/* loaded from: classes2.dex */
public final class OneDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final boolean backwardFocusSearch(FocusTargetNode focusTargetNode, InterfaceC9540l interfaceC9540l) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i10 = iArr[focusState.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return pickChildForBackwardSearch(focusTargetNode, interfaceC9540l);
            }
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!pickChildForBackwardSearch(focusTargetNode, interfaceC9540l)) {
                if (!(focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() ? ((Boolean) interfaceC9540l.invoke(focusTargetNode)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild == null) {
            throw new IllegalStateException(NoActiveChild);
        }
        int i11 = iArr[activeChild.getFocusState().ordinal()];
        if (i11 == 1) {
            return backwardFocusSearch(activeChild, interfaceC9540l) || m30577generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m30523getPreviousdhqQ8s(), interfaceC9540l) || (activeChild.fetchFocusProperties$ui_release().getCanFocus() && ((Boolean) interfaceC9540l.invoke(activeChild)).booleanValue());
        }
        if (i11 == 2 || i11 == 3) {
            return m30577generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m30523getPreviousdhqQ8s(), interfaceC9540l);
        }
        if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(NoActiveChild);
    }

    private static final <T> void forEachItemAfter(MutableVector<T> mutableVector, T t10, InterfaceC9540l interfaceC9540l) {
        boolean z10 = false;
        C10405j c10405jM21768u = AbstractC10410o.m21768u(0, mutableVector.getSize());
        int iM21733b = c10405jM21768u.m21733b();
        int iM21734c = c10405jM21768u.m21734c();
        if (iM21733b > iM21734c) {
            return;
        }
        while (true) {
            if (z10) {
                interfaceC9540l.invoke(mutableVector.content[iM21733b]);
            }
            if (AbstractC9979u.m20289b(mutableVector.content[iM21733b], t10)) {
                z10 = true;
            }
            if (iM21733b == iM21734c) {
                return;
            } else {
                iM21733b++;
            }
        }
    }

    private static final <T> void forEachItemBefore(MutableVector<T> mutableVector, T t10, InterfaceC9540l interfaceC9540l) {
        boolean z10 = false;
        C10405j c10405jM21768u = AbstractC10410o.m21768u(0, mutableVector.getSize());
        int iM21733b = c10405jM21768u.m21733b();
        int iM21734c = c10405jM21768u.m21734c();
        if (iM21733b > iM21734c) {
            return;
        }
        while (true) {
            if (z10) {
                interfaceC9540l.invoke(mutableVector.content[iM21734c]);
            }
            if (AbstractC9979u.m20289b(mutableVector.content[iM21734c], t10)) {
                z10 = true;
            }
            if (iM21734c == iM21733b) {
                return;
            } else {
                iM21734c--;
            }
        }
    }

    private static final boolean forwardFocusSearch(FocusTargetNode focusTargetNode, InterfaceC9540l interfaceC9540l) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i10 == 1) {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild != null) {
                return forwardFocusSearch(activeChild, interfaceC9540l) || m30577generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m30522getNextdhqQ8s(), interfaceC9540l);
            }
            throw new IllegalStateException(NoActiveChild);
        }
        if (i10 == 2 || i10 == 3) {
            return pickChildForForwardSearch(focusTargetNode, interfaceC9540l);
        }
        if (i10 == 4) {
            return focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() ? ((Boolean) interfaceC9540l.invoke(focusTargetNode)).booleanValue() : pickChildForForwardSearch(focusTargetNode, interfaceC9540l);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m30577generateAndSearchChildren4C6V_qg(final FocusTargetNode focusTargetNode, final FocusTargetNode focusTargetNode2, final int i10, final InterfaceC9540l interfaceC9540l) {
        if (m30579searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i10, interfaceC9540l)) {
            return true;
        }
        final FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        final int generation = focusTransactionManagerRequireTransactionManager.getGeneration();
        final FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m30509searchBeyondBoundsOMvw8(focusTargetNode, i10, new InterfaceC9540l() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                if (generation != focusTransactionManagerRequireTransactionManager.getGeneration() || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode())) {
                    return Boolean.TRUE;
                }
                boolean zM30579searchChildren4C6V_qg = OneDimensionalFocusSearchKt.m30579searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i10, interfaceC9540l);
                Boolean boolValueOf = Boolean.valueOf(zM30579searchChildren4C6V_qg);
                if (zM30579searchChildren4C6V_qg || !beyondBoundsScope.getHasMoreContent()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static /* synthetic */ void getInvalidFocusDirection$annotations() {
    }

    private static /* synthetic */ void getNoActiveChild$annotations() {
    }

    private static final boolean isRoot(FocusTargetNode focusTargetNode) {
        Modifier.Node node;
        NodeChain nodes$ui_release;
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            node = null;
            if (layoutNodeRequireLayoutNode == null) {
                break;
            }
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        Modifier.Node nodePop = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                node = nodePop;
                                break loop0;
                            }
                            if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i10 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return node == null;
    }

    /* renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m30578oneDimensionalFocusSearchOMvw8(FocusTargetNode focusTargetNode, int i10, InterfaceC9540l interfaceC9540l) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m30514equalsimpl0(i10, companion.m30522getNextdhqQ8s())) {
            return forwardFocusSearch(focusTargetNode, interfaceC9540l);
        }
        if (FocusDirection.m30514equalsimpl0(i10, companion.m30523getPreviousdhqQ8s())) {
            return backwardFocusSearch(focusTargetNode, interfaceC9540l);
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    private static final boolean pickChildForBackwardSearch(FocusTargetNode focusTargetNode, InterfaceC9540l interfaceC9540l) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop, false);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) nodePop);
                            } else if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i10 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector3.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector3.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui_release();
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        if (size < objArr.length) {
            while (size >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[size];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && backwardFocusSearch(focusTargetNode2, interfaceC9540l)) {
                    return true;
                }
                size--;
            }
        }
        return false;
    }

    private static final boolean pickChildForForwardSearch(FocusTargetNode focusTargetNode, InterfaceC9540l interfaceC9540l) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop, false);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) nodePop);
                            } else if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i10 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector3.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector3.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui_release();
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i11];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && forwardFocusSearch(focusTargetNode2, interfaceC9540l)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m30579searchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, InterfaceC9540l interfaceC9540l) {
        if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop, false);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) nodePop);
                            } else if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector3.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector3.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui_release();
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m30514equalsimpl0(i10, companion.m30522getNextdhqQ8s())) {
            C10405j c10405jM21768u = AbstractC10410o.m21768u(0, mutableVector.getSize());
            int iM21733b = c10405jM21768u.m21733b();
            int iM21734c = c10405jM21768u.m21734c();
            if (iM21733b <= iM21734c) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) mutableVector.content[iM21733b];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && forwardFocusSearch(focusTargetNode3, interfaceC9540l)) {
                            return true;
                        }
                    }
                    if (AbstractC9979u.m20289b(mutableVector.content[iM21733b], focusTargetNode2)) {
                        z10 = true;
                    }
                    if (iM21733b == iM21734c) {
                        break;
                    }
                    iM21733b++;
                }
            }
        } else {
            if (!FocusDirection.m30514equalsimpl0(i10, companion.m30523getPreviousdhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            C10405j c10405jM21768u2 = AbstractC10410o.m21768u(0, mutableVector.getSize());
            int iM21733b2 = c10405jM21768u2.m21733b();
            int iM21734c2 = c10405jM21768u2.m21734c();
            if (iM21733b2 <= iM21734c2) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) mutableVector.content[iM21734c2];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4) && backwardFocusSearch(focusTargetNode4, interfaceC9540l)) {
                            return true;
                        }
                    }
                    if (AbstractC9979u.m20289b(mutableVector.content[iM21734c2], focusTargetNode2)) {
                        z11 = true;
                    }
                    if (iM21734c2 == iM21733b2) {
                        break;
                    }
                    iM21734c2--;
                }
            }
        }
        if (FocusDirection.m30514equalsimpl0(i10, FocusDirection.Companion.m30522getNextdhqQ8s()) || !focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() || isRoot(focusTargetNode)) {
            return false;
        }
        return ((Boolean) interfaceC9540l.invoke(focusTargetNode)).booleanValue();
    }
}
