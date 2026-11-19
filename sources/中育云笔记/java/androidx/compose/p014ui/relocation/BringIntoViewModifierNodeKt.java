package androidx.compose.p014ui.relocation;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.NodeChain;
import androidx.compose.p014ui.node.NodeKind;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.runtime.collection.MutableVector;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class BringIntoViewModifierNodeKt {
    public static final Object bringIntoView(DelegatableNode delegatableNode, final InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object obj;
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            return C10786q.f26013a;
        }
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(524288);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        loop0: while (true) {
            obj = null;
            if (layoutNodeRequireLayoutNode == null) {
                break;
            }
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        Modifier.Node nodePop = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof BringIntoViewModifierNode) {
                                obj = nodePop;
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
                                                AbstractC11826a.m26206a(mutableVector.add(nodePop));
                                                nodePop = null;
                                            }
                                            AbstractC11826a.m26206a(mutableVector.add(delegate$ui_release));
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
        BringIntoViewModifierNode bringIntoViewModifierNode = (BringIntoViewModifierNode) obj;
        if (bringIntoViewModifierNode == null) {
            return C10786q.f26013a;
        }
        final LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(delegatableNode);
        Object objBringIntoView = bringIntoViewModifierNode.bringIntoView(layoutCoordinatesRequireLayoutCoordinates, new InterfaceC9529a() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt.bringIntoView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Rect invoke() {
                Rect rect;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                if (interfaceC9529a2 != null && (rect = (Rect) interfaceC9529a2.invoke()) != null) {
                    return rect;
                }
                LayoutCoordinates layoutCoordinates = layoutCoordinatesRequireLayoutCoordinates;
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return SizeKt.m30727toRectuvyYCjk(IntSizeKt.m33684toSizeozmzZPI(layoutCoordinates.mo32237getSizeYbymL2g()));
                }
                return null;
            }
        }, interfaceC11588c);
        return objBringIntoView == AbstractC11725a.m25952f() ? objBringIntoView : C10786q.f26013a;
    }

    public static /* synthetic */ Object bringIntoView$default(DelegatableNode delegatableNode, InterfaceC9529a interfaceC9529a, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9529a = null;
        }
        return bringIntoView(delegatableNode, interfaceC9529a, interfaceC11588c);
    }
}
