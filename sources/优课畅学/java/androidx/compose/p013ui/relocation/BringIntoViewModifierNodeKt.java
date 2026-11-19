package androidx.compose.p013ui.relocation;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.SizeKt;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.NodeChain;
import androidx.compose.p013ui.node.NodeKind;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.runtime.collection.MutableVector;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class BringIntoViewModifierNodeKt {
    public static final Object bringIntoView(DelegatableNode delegatableNode, final InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object obj;
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            return C8736p.f16368a;
        }
        int iM25908constructorimpl = NodeKind.m25908constructorimpl(524288);
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
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM25908constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM25908constructorimpl) != 0) {
                        Modifier.Node nodePop = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof BringIntoViewModifierNode) {
                                obj = nodePop;
                                break loop0;
                            }
                            if ((nodePop.getKindSet$ui_release() & iM25908constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i10 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM25908constructorimpl) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                AbstractC9536a.m17796a(mutableVector.add(nodePop));
                                                nodePop = null;
                                            }
                                            AbstractC9536a.m17796a(mutableVector.add(delegate$ui_release));
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
            return C8736p.f16368a;
        }
        final LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(delegatableNode);
        Object objBringIntoView = bringIntoViewModifierNode.bringIntoView(layoutCoordinatesRequireLayoutCoordinates, new InterfaceC10559a() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt.bringIntoView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Rect invoke() {
                Rect rect;
                InterfaceC10559a interfaceC10559a2 = interfaceC10559a;
                if (interfaceC10559a2 != null && (rect = (Rect) interfaceC10559a2.invoke()) != null) {
                    return rect;
                }
                LayoutCoordinates layoutCoordinates = layoutCoordinatesRequireLayoutCoordinates;
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return SizeKt.m24125toRectuvyYCjk(IntSizeKt.m27082toSizeozmzZPI(layoutCoordinates.mo25635getSizeYbymL2g()));
                }
                return null;
            }
        }, interfaceC9324c);
        return objBringIntoView == AbstractC9434a.m17291f() ? objBringIntoView : C8736p.f16368a;
    }

    public static /* synthetic */ Object bringIntoView$default(DelegatableNode delegatableNode, InterfaceC10559a interfaceC10559a, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10559a = null;
        }
        return bringIntoView(delegatableNode, interfaceC10559a, interfaceC9324c);
    }
}
