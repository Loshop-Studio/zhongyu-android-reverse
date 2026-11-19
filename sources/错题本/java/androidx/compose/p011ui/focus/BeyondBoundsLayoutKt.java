package androidx.compose.p011ui.focus;

import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusDirection;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.layout.BeyondBoundsLayout;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.NodeChain;
import androidx.compose.p011ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0002\b\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "block", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILr6/c;)Ljava/lang/Object;", "searchBeyondBounds", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBeyondBoundsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,59:1\n119#2:60\n277#3:61\n247#3,5:62\n90#3:67\n91#3,8:73\n437#3,5:81\n278#3:86\n442#3:87\n447#3,2:89\n449#3,8:94\n457#3,9:105\n466#3,8:117\n100#3,7:125\n280#3:132\n56#4,5:68\n246#5:88\n240#6,3:91\n243#6,3:114\n1101#7:102\n1083#7,2:103\n*S KotlinDebug\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n*L\n39#1:60\n39#1:61\n39#1:62,5\n39#1:67\n39#1:73,8\n39#1:81,5\n39#1:86\n39#1:87\n39#1:89,2\n39#1:94,8\n39#1:105,9\n39#1:117,8\n39#1:125,7\n39#1:132\n39#1:68,5\n39#1:88\n39#1:91,3\n39#1:114,3\n39#1:102\n39#1:103,2\n*E\n"})
/* loaded from: classes.dex */
public final class BeyondBoundsLayoutKt {
    @Nullable
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m10313searchBeyondBoundsOMvw8(@NotNull FocusTargetNode focusTargetNode, int i, @NotNull InterfaceC6471c interfaceC6471c) {
        Modifier.Node nodePop;
        BeyondBoundsLayout beyondBoundsLayoutParent;
        int iM12021getBeforehoxUOeE;
        NodeChain nodes;
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            if (layoutNodeRequireLayoutNode == null) {
                nodePop = null;
                break;
            }
            if ((AbstractC1923c.m1039c(layoutNodeRequireLayoutNode) & iM12314constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM12314constructorimpl) != 0) {
                        nodePop = parent;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((nodePop.getKindSet() & iM12314constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i8 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            nodePop = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
        if ((focusTargetNode2 != null && AbstractC5830k.m5325b(focusTargetNode2.getBeyondBoundsLayoutParent(), focusTargetNode.getBeyondBoundsLayoutParent())) || (beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent()) == null) {
            return null;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m10318equalsimpl0(i, companion.m10329getUpdhqQ8s())) {
            iM12021getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m12019getAbovehoxUOeE();
        } else if (FocusDirection.m10318equalsimpl0(i, companion.m10322getDowndhqQ8s())) {
            iM12021getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m12022getBelowhoxUOeE();
        } else if (FocusDirection.m10318equalsimpl0(i, companion.m10325getLeftdhqQ8s())) {
            iM12021getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m12023getLefthoxUOeE();
        } else if (FocusDirection.m10318equalsimpl0(i, companion.m10328getRightdhqQ8s())) {
            iM12021getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m12024getRighthoxUOeE();
        } else if (FocusDirection.m10318equalsimpl0(i, companion.m10326getNextdhqQ8s())) {
            iM12021getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m12020getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m10318equalsimpl0(i, companion.m10327getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iM12021getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m12021getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent.mo7418layouto7g1Pn8(iM12021getBeforehoxUOeE, interfaceC6471c);
    }
}
