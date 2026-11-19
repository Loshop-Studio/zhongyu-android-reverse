package androidx.compose.p011ui.node;

import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.Actual_jvmKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.node.TraversableNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0007\u001a/\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\u000b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\r\u001a/\u0010\u000f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a/\u0010\u0011\u001a\u00020\u000b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\b¢\u0006\u0004\b\u0011\u0010\r\u001a/\u0010\u0011\u001a\u00020\u000b\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\b¢\u0006\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, m5110d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "", "key", "Landroidx/compose/ui/node/TraversableNode;", "findNearestAncestor", "(Landroidx/compose/ui/node/DelegatableNode;Ljava/lang/Object;)Landroidx/compose/ui/node/TraversableNode;", ExifInterface.GPS_DIRECTION_TRUE, "(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode;", "Lkotlin/Function1;", "", "block", "Ld6/s;", "traverseAncestors", "(Landroidx/compose/ui/node/DelegatableNode;Ljava/lang/Object;Lr6/c;)V", "(Landroidx/compose/ui/node/TraversableNode;Lr6/c;)V", "traverseChildren", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "traverseDescendants", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTraversableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,217:1\n147#2:218\n147#2:288\n147#2:358\n147#2:428\n147#2:498\n147#2:575\n147#2:652\n147#2:730\n247#3,5:219\n90#3:224\n91#3,8:230\n437#3,6:238\n447#3,2:245\n449#3,8:250\n457#3,9:261\n466#3,8:273\n100#3,7:281\n247#3,5:289\n90#3:294\n91#3,8:300\n437#3,6:308\n447#3,2:315\n449#3,8:320\n457#3,9:331\n466#3,8:343\n100#3,7:351\n247#3,5:359\n90#3:364\n91#3,8:370\n437#3,6:378\n447#3,2:385\n449#3,8:390\n457#3,9:401\n466#3,8:413\n100#3,7:421\n247#3,5:429\n90#3:434\n91#3,8:440\n437#3,6:448\n447#3,2:455\n449#3,8:460\n457#3,9:471\n466#3,8:483\n100#3,7:491\n283#3,5:499\n148#3:504\n149#3:510\n150#3,3:514\n153#3:518\n154#3,9:520\n437#3,6:529\n447#3,2:536\n449#3,17:541\n466#3,8:561\n163#3,6:569\n283#3,5:576\n148#3:581\n149#3:587\n150#3,3:591\n153#3:595\n154#3,9:597\n437#3,6:606\n447#3,2:613\n449#3,17:618\n466#3,8:638\n163#3,6:646\n298#3,6:653\n179#3:659\n180#3:665\n181#3,3:669\n184#3,6:673\n304#3:679\n437#3,6:680\n447#3,2:687\n449#3,17:692\n466#3,8:712\n305#3:720\n190#3,8:721\n306#3:729\n298#3,6:731\n179#3:737\n180#3:743\n181#3,3:747\n184#3,6:751\n304#3:757\n437#3,6:758\n447#3,2:765\n449#3,17:770\n466#3,8:790\n305#3:798\n190#3,8:799\n306#3:807\n56#4,5:225\n56#4,5:295\n56#4,5:365\n56#4,5:435\n56#4,5:505\n56#4,5:582\n56#4,5:660\n56#4,5:738\n246#5:244\n246#5:314\n246#5:384\n246#5:454\n246#5:535\n246#5:612\n246#5:686\n246#5:764\n240#6,3:247\n243#6,3:270\n240#6,3:317\n243#6,3:340\n240#6,3:387\n243#6,3:410\n240#6,3:457\n243#6,3:480\n240#6,3:538\n243#6,3:558\n240#6,3:615\n243#6,3:635\n240#6,3:689\n243#6,3:709\n240#6,3:767\n243#6,3:787\n1101#7:258\n1083#7,2:259\n1101#7:328\n1083#7,2:329\n1101#7:398\n1083#7,2:399\n1101#7:468\n1083#7,2:469\n1101#7:511\n1083#7,2:512\n1101#7:588\n1083#7,2:589\n1101#7:666\n1083#7,2:667\n1101#7:744\n1083#7,2:745\n519#8:517\n44#8:519\n519#8:594\n44#8:596\n519#8:672\n519#8:750\n*S KotlinDebug\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n*L\n54#1:218\n64#1:288\n82#1:358\n102#1:428\n125#1:498\n147#1:575\n174#1:652\n202#1:730\n54#1:219,5\n54#1:224\n54#1:230,8\n54#1:238,6\n54#1:245,2\n54#1:250,8\n54#1:261,9\n54#1:273,8\n54#1:281,7\n64#1:289,5\n64#1:294\n64#1:300,8\n64#1:308,6\n64#1:315,2\n64#1:320,8\n64#1:331,9\n64#1:343,8\n64#1:351,7\n82#1:359,5\n82#1:364\n82#1:370,8\n82#1:378,6\n82#1:385,2\n82#1:390,8\n82#1:401,9\n82#1:413,8\n82#1:421,7\n102#1:429,5\n102#1:434\n102#1:440,8\n102#1:448,6\n102#1:455,2\n102#1:460,8\n102#1:471,9\n102#1:483,8\n102#1:491,7\n125#1:499,5\n125#1:504\n125#1:510\n125#1:514,3\n125#1:518\n125#1:520,9\n125#1:529,6\n125#1:536,2\n125#1:541,17\n125#1:561,8\n125#1:569,6\n147#1:576,5\n147#1:581\n147#1:587\n147#1:591,3\n147#1:595\n147#1:597,9\n147#1:606,6\n147#1:613,2\n147#1:618,17\n147#1:638,8\n147#1:646,6\n174#1:653,6\n174#1:659\n174#1:665\n174#1:669,3\n174#1:673,6\n174#1:679\n174#1:680,6\n174#1:687,2\n174#1:692,17\n174#1:712,8\n174#1:720\n174#1:721,8\n174#1:729\n202#1:731,6\n202#1:737\n202#1:743\n202#1:747,3\n202#1:751,6\n202#1:757\n202#1:758,6\n202#1:765,2\n202#1:770,17\n202#1:790,8\n202#1:798\n202#1:799,8\n202#1:807\n54#1:225,5\n64#1:295,5\n82#1:365,5\n102#1:435,5\n125#1:505,5\n147#1:582,5\n174#1:660,5\n202#1:738,5\n54#1:244\n64#1:314\n82#1:384\n102#1:454\n125#1:535\n147#1:612\n174#1:686\n202#1:764\n54#1:247,3\n54#1:270,3\n64#1:317,3\n64#1:340,3\n82#1:387,3\n82#1:410,3\n102#1:457,3\n102#1:480,3\n125#1:538,3\n125#1:558,3\n147#1:615,3\n147#1:635,3\n174#1:689,3\n174#1:709,3\n202#1:767,3\n202#1:787,3\n54#1:258\n54#1:259,2\n64#1:328\n64#1:329,2\n82#1:398\n82#1:399,2\n102#1:468\n102#1:469,2\n125#1:511\n125#1:512,2\n147#1:588\n147#1:589,2\n174#1:666\n174#1:667,2\n202#1:744\n202#1:745,2\n125#1:517\n125#1:519\n147#1:594\n147#1:596\n174#1:672\n202#1:750\n*E\n"})
/* loaded from: classes2.dex */
public final class TraversableNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    @Nullable
    public static final TraversableNode findNearestAncestor(@NotNull DelegatableNode delegatableNode, @Nullable Object obj) {
        NodeChain nodes;
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(262144);
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((AbstractC1923c.m1039c(layoutNodeRequireLayoutNode) & iM12314constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM12314constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = parent;
                        MutableVector mutableVector = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                if (AbstractC5830k.m5325b(obj, traversableNode.getTraverseKey())) {
                                    return traversableNode;
                                }
                            } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate = delegatingNodePop.getDelegate();
                                int i = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNodePop = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector.add(delegatingNodePop);
                                                delegatingNodePop = 0;
                                            }
                                            mutableVector.add(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [r6.c] */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final void traverseAncestors(@NotNull DelegatableNode delegatableNode, @Nullable Object obj, @NotNull InterfaceC6471c interfaceC6471c) {
        NodeChain nodes;
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(262144);
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((AbstractC1923c.m1039c(layoutNodeRequireLayoutNode) & iM12314constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM12314constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = parent;
                        MutableVector mutableVector = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                if (!(AbstractC5830k.m5325b(obj, traversableNode.getTraverseKey()) ? ((Boolean) interfaceC6471c.invoke(traversableNode)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0) && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                                    int i = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                delegatingNodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0035, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [r6.c] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier$Node] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void traverseChildren(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.node.DelegatableNode r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r12) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = androidx.compose.p011ui.node.NodeKind.m12314constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r10.getNode()
            boolean r1 = r1.getIsAttached()
            if (r1 != 0) goto L16
            java.lang.String r1 = "visitChildren called on an unattached node"
            androidx.compose.p011ui.internal.InlineClassHelperKt.throwIllegalStateException(r1)
        L16:
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r10.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild()
            if (r3 != 0) goto L32
            androidx.compose.ui.Modifier$Node r10 = r10.getNode()
            androidx.compose.p011ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r10, r4)
            goto L35
        L32:
            r1.add(r3)
        L35:
            int r10 = r1.getSize()
            if (r10 == 0) goto Lc9
            r10 = 1
            java.lang.Object r3 = androidx.compose.material3.AbstractC1923c.m1046j(r1, r10)
            androidx.compose.ui.Modifier$Node r3 = (androidx.compose.ui.Modifier.Node) r3
            int r5 = r3.getAggregateChildKindSet()
            r5 = r5 & r0
            if (r5 != 0) goto L4d
            androidx.compose.p011ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r3, r4)
            goto L35
        L4d:
            if (r3 == 0) goto L35
            int r5 = r3.getKindSet()
            r5 = r5 & r0
            if (r5 == 0) goto Lc4
            r5 = 0
            r6 = r5
        L58:
            if (r3 == 0) goto L35
            boolean r7 = r3 instanceof androidx.compose.p011ui.node.TraversableNode
            if (r7 == 0) goto L79
            androidx.compose.ui.node.TraversableNode r3 = (androidx.compose.p011ui.node.TraversableNode) r3
            java.lang.Object r7 = r3.getTraverseKey()
            boolean r7 = kotlin.jvm.internal.AbstractC5830k.m5325b(r11, r7)
            if (r7 == 0) goto L75
            java.lang.Object r3 = r12.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L76
        L75:
            r3 = r10
        L76:
            if (r3 != 0) goto Lbf
            return
        L79:
            int r7 = r3.getKindSet()
            r7 = r7 & r0
            if (r7 == 0) goto L82
            r7 = r10
            goto L83
        L82:
            r7 = r4
        L83:
            if (r7 == 0) goto Lbf
            boolean r7 = r3 instanceof androidx.compose.p011ui.node.DelegatingNode
            if (r7 == 0) goto Lbf
            r7 = r3
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.p011ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate()
            r8 = r4
        L91:
            if (r7 == 0) goto Lbc
            int r9 = r7.getKindSet()
            r9 = r9 & r0
            if (r9 == 0) goto L9c
            r9 = r10
            goto L9d
        L9c:
            r9 = r4
        L9d:
            if (r9 == 0) goto Lb7
            int r8 = r8 + 1
            if (r8 != r10) goto La5
            r3 = r7
            goto Lb7
        La5:
            if (r6 != 0) goto Lae
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r2]
            r6.<init>(r9, r4)
        Lae:
            if (r3 == 0) goto Lb4
            r6.add(r3)
            r3 = r5
        Lb4:
            r6.add(r7)
        Lb7:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild()
            goto L91
        Lbc:
            if (r8 != r10) goto Lbf
            goto L58
        Lbf:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.p011ui.node.DelegatableNodeKt.access$pop(r6)
            goto L58
        Lc4:
            androidx.compose.ui.Modifier$Node r3 = r3.getChild()
            goto L4d
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.node.TraversableNodeKt.traverseChildren(androidx.compose.ui.node.DelegatableNode, java.lang.Object, r6.c):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [r6.c] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    public static final void traverseDescendants(@NotNull DelegatableNode delegatableNode, @Nullable Object obj, @NotNull InterfaceC6471c interfaceC6471c) {
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(262144);
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) AbstractC1923c.m1046j(mutableVector, 1);
            if ((node.getAggregateChildKindSet() & iM12314constructorimpl) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iM12314constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = child2;
                        MutableVector mutableVector2 = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = AbstractC5830k.m5325b(obj, traversableNode.getTraverseKey()) ? (TraversableNode.Companion.TraverseDescendantsAction) interfaceC6471c.invoke(traversableNode) : TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate = delegatingNodePop.getDelegate();
                                int i = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNodePop = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector2.add(delegatingNodePop);
                                                delegatingNodePop = 0;
                                            }
                                            mutableVector2.add(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    @Nullable
    public static final <T extends TraversableNode> T findNearestAncestor(@NotNull T t8) {
        NodeChain nodes;
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(262144);
        if (!t8.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = t8.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(t8);
        while (layoutNodeRequireLayoutNode != null) {
            if ((AbstractC1923c.m1039c(layoutNodeRequireLayoutNode) & iM12314constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM12314constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = parent;
                        MutableVector mutableVector = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                T t9 = (T) delegatingNodePop;
                                if (AbstractC5830k.m5325b(t8.getTraverseKey(), t9.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t8, t9)) {
                                    return t9;
                                }
                            } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate = delegatingNodePop.getDelegate();
                                int i = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNodePop = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector.add(delegatingNodePop);
                                                delegatingNodePop = 0;
                                            }
                                            mutableVector.add(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [r6.c] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final <T extends TraversableNode> void traverseAncestors(@NotNull T t8, @NotNull InterfaceC6471c interfaceC6471c) {
        NodeChain nodes;
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(262144);
        if (!t8.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = t8.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(t8);
        while (layoutNodeRequireLayoutNode != null) {
            if ((AbstractC1923c.m1039c(layoutNodeRequireLayoutNode) & iM12314constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM12314constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = parent;
                        MutableVector mutableVector = null;
                        while (delegatingNodePop != 0) {
                            boolean zBooleanValue = true;
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                if (AbstractC5830k.m5325b(t8.getTraverseKey(), traversableNode.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t8, traversableNode)) {
                                    zBooleanValue = ((Boolean) interfaceC6471c.invoke(traversableNode)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0) && (delegatingNodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = delegatingNodePop.getDelegate();
                                    int i = 0;
                                    delegatingNodePop = delegatingNodePop;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                delegatingNodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNodePop != 0) {
                                                    mutableVector.add(delegatingNodePop);
                                                    delegatingNodePop = 0;
                                                }
                                                mutableVector.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNodePop = delegatingNodePop;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0035, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [r6.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.Modifier$Node] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends androidx.compose.p011ui.node.TraversableNode> void traverseChildren(@org.jetbrains.annotations.NotNull T r11, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r12) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = androidx.compose.p011ui.node.NodeKind.m12314constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r11.getNode()
            boolean r1 = r1.getIsAttached()
            if (r1 != 0) goto L16
            java.lang.String r1 = "visitChildren called on an unattached node"
            androidx.compose.p011ui.internal.InlineClassHelperKt.throwIllegalStateException(r1)
        L16:
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r11.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild()
            if (r3 != 0) goto L32
            androidx.compose.ui.Modifier$Node r3 = r11.getNode()
            androidx.compose.p011ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r3, r4)
            goto L35
        L32:
            r1.add(r3)
        L35:
            int r3 = r1.getSize()
            if (r3 == 0) goto Ld4
            r3 = 1
            java.lang.Object r5 = androidx.compose.material3.AbstractC1923c.m1046j(r1, r3)
            androidx.compose.ui.Modifier$Node r5 = (androidx.compose.ui.Modifier.Node) r5
            int r6 = r5.getAggregateChildKindSet()
            r6 = r6 & r0
            if (r6 != 0) goto L4d
            androidx.compose.p011ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r5, r4)
            goto L35
        L4d:
            if (r5 == 0) goto L35
            int r6 = r5.getKindSet()
            r6 = r6 & r0
            if (r6 == 0) goto Lce
            r6 = 0
            r7 = r6
        L58:
            if (r5 == 0) goto L35
            boolean r8 = r5 instanceof androidx.compose.p011ui.node.TraversableNode
            if (r8 == 0) goto L83
            androidx.compose.ui.node.TraversableNode r5 = (androidx.compose.p011ui.node.TraversableNode) r5
            java.lang.Object r8 = r11.getTraverseKey()
            java.lang.Object r9 = r5.getTraverseKey()
            boolean r8 = kotlin.jvm.internal.AbstractC5830k.m5325b(r8, r9)
            if (r8 == 0) goto L7f
            boolean r8 = androidx.compose.p011ui.Actual_jvmKt.areObjectsOfSameType(r11, r5)
            if (r8 == 0) goto L7f
            java.lang.Object r5 = r12.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L80
        L7f:
            r5 = r3
        L80:
            if (r5 != 0) goto Lc9
            return
        L83:
            int r8 = r5.getKindSet()
            r8 = r8 & r0
            if (r8 == 0) goto L8c
            r8 = r3
            goto L8d
        L8c:
            r8 = r4
        L8d:
            if (r8 == 0) goto Lc9
            boolean r8 = r5 instanceof androidx.compose.p011ui.node.DelegatingNode
            if (r8 == 0) goto Lc9
            r8 = r5
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.p011ui.node.DelegatingNode) r8
            androidx.compose.ui.Modifier$Node r8 = r8.getDelegate()
            r9 = r4
        L9b:
            if (r8 == 0) goto Lc6
            int r10 = r8.getKindSet()
            r10 = r10 & r0
            if (r10 == 0) goto La6
            r10 = r3
            goto La7
        La6:
            r10 = r4
        La7:
            if (r10 == 0) goto Lc1
            int r9 = r9 + 1
            if (r9 != r3) goto Laf
            r5 = r8
            goto Lc1
        Laf:
            if (r7 != 0) goto Lb8
            androidx.compose.runtime.collection.MutableVector r7 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r2]
            r7.<init>(r10, r4)
        Lb8:
            if (r5 == 0) goto Lbe
            r7.add(r5)
            r5 = r6
        Lbe:
            r7.add(r8)
        Lc1:
            androidx.compose.ui.Modifier$Node r8 = r8.getChild()
            goto L9b
        Lc6:
            if (r9 != r3) goto Lc9
            goto L58
        Lc9:
            androidx.compose.ui.Modifier$Node r5 = androidx.compose.p011ui.node.DelegatableNodeKt.access$pop(r7)
            goto L58
        Lce:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild()
            goto L4d
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.node.TraversableNodeKt.traverseChildren(androidx.compose.ui.node.TraversableNode, r6.c):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [r6.c] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public static final <T extends TraversableNode> void traverseDescendants(@NotNull T t8, @NotNull InterfaceC6471c interfaceC6471c) {
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction;
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(262144);
        if (!t8.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = t8.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, t8.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) AbstractC1923c.m1046j(mutableVector, 1);
            if ((node.getAggregateChildKindSet() & iM12314constructorimpl) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iM12314constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = child2;
                        MutableVector mutableVector2 = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                if (AbstractC5830k.m5325b(t8.getTraverseKey(), traversableNode.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t8, traversableNode)) {
                                    traverseDescendantsAction = (TraversableNode.Companion.TraverseDescendantsAction) interfaceC6471c.invoke(traversableNode);
                                } else {
                                    traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                }
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((delegatingNodePop.getKindSet() & iM12314constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate = delegatingNodePop.getDelegate();
                                int i = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNodePop = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector2.add(delegatingNodePop);
                                                delegatingNodePop = 0;
                                            }
                                            mutableVector2.add(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
        }
    }
}
