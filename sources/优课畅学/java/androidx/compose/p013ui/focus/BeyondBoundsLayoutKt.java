package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.focus.FocusDirection;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.layout.BeyondBoundsLayout;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.NodeChain;
import androidx.compose.p013ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class BeyondBoundsLayoutKt {
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m23907searchBeyondBoundsOMvw8(FocusTargetNode focusTargetNode, int i10, InterfaceC10570l interfaceC10570l) {
        Modifier.Node nodePop;
        BeyondBoundsLayout beyondBoundsLayoutParent;
        int iM25615getBeforehoxUOeE;
        NodeChain nodes$ui_release;
        int iM25908constructorimpl = NodeKind.m25908constructorimpl(1024);
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
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM25908constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM25908constructorimpl) != 0) {
                        nodePop = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((nodePop.getKindSet$ui_release() & iM25908constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM25908constructorimpl) != 0) {
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
        if ((focusTargetNode2 != null && AbstractC9133u.m16128b(focusTargetNode2.getBeyondBoundsLayoutParent(), focusTargetNode.getBeyondBoundsLayoutParent())) || (beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent()) == null) {
            return null;
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23923getUpdhqQ8s())) {
            iM25615getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m25613getAbovehoxUOeE();
        } else if (FocusDirection.m23912equalsimpl0(i10, companion.m23916getDowndhqQ8s())) {
            iM25615getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m25616getBelowhoxUOeE();
        } else if (FocusDirection.m23912equalsimpl0(i10, companion.m23919getLeftdhqQ8s())) {
            iM25615getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m25617getLefthoxUOeE();
        } else if (FocusDirection.m23912equalsimpl0(i10, companion.m23922getRightdhqQ8s())) {
            iM25615getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m25618getRighthoxUOeE();
        } else if (FocusDirection.m23912equalsimpl0(i10, companion.m23920getNextdhqQ8s())) {
            iM25615getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m25614getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m23912equalsimpl0(i10, companion.m23921getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iM25615getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m25615getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent.mo21012layouto7g1Pn8(iM25615getBeforehoxUOeE, interfaceC10570l);
    }
}
