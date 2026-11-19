package androidx.compose.p014ui.focus;

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
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class BeyondBoundsLayoutKt {
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m30509searchBeyondBoundsOMvw8(FocusTargetNode focusTargetNode, int i10, InterfaceC9540l interfaceC9540l) {
        Modifier.Node nodePop;
        BeyondBoundsLayout beyondBoundsLayoutParent;
        int iM32217getBeforehoxUOeE;
        NodeChain nodes$ui_release;
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            if (layoutNodeRequireLayoutNode == null) {
                nodePop = null;
                break;
            }
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        nodePop = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
                                if (i11 == 1) {
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
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
        if ((focusTargetNode2 != null && AbstractC9979u.m20289b(focusTargetNode2.getBeyondBoundsLayoutParent(), focusTargetNode.getBeyondBoundsLayoutParent())) || (beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent()) == null) {
            return null;
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m30514equalsimpl0(i10, companion.m30525getUpdhqQ8s())) {
            iM32217getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m32215getAbovehoxUOeE();
        } else if (FocusDirection.m30514equalsimpl0(i10, companion.m30518getDowndhqQ8s())) {
            iM32217getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m32218getBelowhoxUOeE();
        } else if (FocusDirection.m30514equalsimpl0(i10, companion.m30521getLeftdhqQ8s())) {
            iM32217getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m32219getLefthoxUOeE();
        } else if (FocusDirection.m30514equalsimpl0(i10, companion.m30524getRightdhqQ8s())) {
            iM32217getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m32220getRighthoxUOeE();
        } else if (FocusDirection.m30514equalsimpl0(i10, companion.m30522getNextdhqQ8s())) {
            iM32217getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m32216getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m30514equalsimpl0(i10, companion.m30523getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iM32217getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m32217getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent.mo27614layouto7g1Pn8(iM32217getBeforehoxUOeE, interfaceC9540l);
    }
}
