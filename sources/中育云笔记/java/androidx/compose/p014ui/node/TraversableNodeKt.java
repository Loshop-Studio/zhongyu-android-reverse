package androidx.compose.p014ui.node;

import androidx.compose.p014ui.Actual_jvmKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.node.TraversableNode;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class TraversableNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final TraversableNode findNearestAncestor(DelegatableNode delegatableNode, Object obj) {
        NodeChain nodes$ui_release;
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(262144);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                if (AbstractC9979u.m20289b(obj, traversableNode.getTraverseKey())) {
                                    return traversableNode;
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
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [hd.l] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    public static final void traverseAncestors(DelegatableNode delegatableNode, Object obj, InterfaceC9540l interfaceC9540l) {
        NodeChain nodes$ui_release;
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(262144);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                if (!(AbstractC9979u.m20289b(obj, traversableNode.getTraverseKey()) ? ((Boolean) interfaceC9540l.invoke(traversableNode)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0) && (delegatingNodePop instanceof DelegatingNode)) {
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
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0035, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r12v0, types: [hd.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void traverseChildren(androidx.compose.p014ui.node.DelegatableNode r10, java.lang.Object r11, p181hd.InterfaceC9540l r12) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = androidx.compose.p014ui.node.NodeKind.m32510constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r10.getNode()
            boolean r1 = r1.isAttached()
            if (r1 != 0) goto L16
            java.lang.String r1 = "visitChildren called on an unattached node"
            androidx.compose.p014ui.internal.InlineClassHelperKt.throwIllegalStateException(r1)
        L16:
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r10.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui_release()
            if (r3 != 0) goto L32
            androidx.compose.ui.Modifier$Node r10 = r10.getNode()
            androidx.compose.p014ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r10, r4)
            goto L35
        L32:
            r1.add(r3)
        L35:
            int r10 = r1.getSize()
            if (r10 == 0) goto Lce
            int r10 = r1.getSize()
            r3 = 1
            int r10 = r10 - r3
            java.lang.Object r10 = r1.removeAt(r10)
            androidx.compose.ui.Modifier$Node r10 = (androidx.compose.ui.Modifier.Node) r10
            int r5 = r10.getAggregateChildKindSet$ui_release()
            r5 = r5 & r0
            if (r5 != 0) goto L52
            androidx.compose.p014ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r10, r4)
            goto L35
        L52:
            if (r10 == 0) goto L35
            int r5 = r10.getKindSet$ui_release()
            r5 = r5 & r0
            if (r5 == 0) goto Lc9
            r5 = 0
            r6 = r5
        L5d:
            if (r10 == 0) goto L35
            boolean r7 = r10 instanceof androidx.compose.p014ui.node.TraversableNode
            if (r7 == 0) goto L7e
            androidx.compose.ui.node.TraversableNode r10 = (androidx.compose.p014ui.node.TraversableNode) r10
            java.lang.Object r7 = r10.getTraverseKey()
            boolean r7 = kotlin.jvm.internal.AbstractC9979u.m20289b(r11, r7)
            if (r7 == 0) goto L7a
            java.lang.Object r10 = r12.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            goto L7b
        L7a:
            r10 = r3
        L7b:
            if (r10 != 0) goto Lc4
            return
        L7e:
            int r7 = r10.getKindSet$ui_release()
            r7 = r7 & r0
            if (r7 == 0) goto L87
            r7 = r3
            goto L88
        L87:
            r7 = r4
        L88:
            if (r7 == 0) goto Lc4
            boolean r7 = r10 instanceof androidx.compose.p014ui.node.DelegatingNode
            if (r7 == 0) goto Lc4
            r7 = r10
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.p014ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate$ui_release()
            r8 = r4
        L96:
            if (r7 == 0) goto Lc1
            int r9 = r7.getKindSet$ui_release()
            r9 = r9 & r0
            if (r9 == 0) goto La1
            r9 = r3
            goto La2
        La1:
            r9 = r4
        La2:
            if (r9 == 0) goto Lbc
            int r8 = r8 + 1
            if (r8 != r3) goto Laa
            r10 = r7
            goto Lbc
        Laa:
            if (r6 != 0) goto Lb3
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r2]
            r6.<init>(r9, r4)
        Lb3:
            if (r10 == 0) goto Lb9
            r6.add(r10)
            r10 = r5
        Lb9:
            r6.add(r7)
        Lbc:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild$ui_release()
            goto L96
        Lc1:
            if (r8 != r3) goto Lc4
            goto L5d
        Lc4:
            androidx.compose.ui.Modifier$Node r10 = androidx.compose.p014ui.node.DelegatableNodeKt.access$pop(r6)
            goto L5d
        Lc9:
            androidx.compose.ui.Modifier$Node r10 = r10.getChild$ui_release()
            goto L52
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.node.TraversableNodeKt.traverseChildren(androidx.compose.ui.node.DelegatableNode, java.lang.Object, hd.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [hd.l] */
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
    public static final void traverseDescendants(DelegatableNode delegatableNode, Object obj, InterfaceC9540l interfaceC9540l) {
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(262144);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), false);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                for (Modifier.Node child$ui_release2 = node; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = child$ui_release2;
                        MutableVector mutableVector2 = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = AbstractC9979u.m20289b(obj, traversableNode.getTraverseKey()) ? (TraversableNode.Companion.TraverseDescendantsAction) interfaceC9540l.invoke(traversableNode) : TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
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
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector2.add(delegatingNodePop);
                                                delegatingNodePop = 0;
                                            }
                                            mutableVector2.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i10 == 1) {
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
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final <T extends TraversableNode> T findNearestAncestor(T t10) {
        NodeChain nodes$ui_release;
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(262144);
        if (!t10.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = t10.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(t10);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                T t11 = (T) delegatingNodePop;
                                if (AbstractC9979u.m20289b(t10.getTraverseKey(), t11.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t10, t11)) {
                                    return t11;
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
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [hd.l] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    public static final <T extends TraversableNode> void traverseAncestors(T t10, InterfaceC9540l interfaceC9540l) {
        NodeChain nodes$ui_release;
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(262144);
        if (!t10.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = t10.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(t10);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (delegatingNodePop != 0) {
                            boolean zBooleanValue = true;
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                if (AbstractC9979u.m20289b(t10.getTraverseKey(), traversableNode.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t10, traversableNode)) {
                                    zBooleanValue = ((Boolean) interfaceC9540l.invoke(traversableNode)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0) && (delegatingNodePop instanceof DelegatingNode)) {
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
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0035, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [hd.l] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.compose.ui.Modifier$Node] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends androidx.compose.p014ui.node.TraversableNode> void traverseChildren(T r11, p181hd.InterfaceC9540l r12) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = androidx.compose.p014ui.node.NodeKind.m32510constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r11.getNode()
            boolean r1 = r1.isAttached()
            if (r1 != 0) goto L16
            java.lang.String r1 = "visitChildren called on an unattached node"
            androidx.compose.p014ui.internal.InlineClassHelperKt.throwIllegalStateException(r1)
        L16:
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r11.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui_release()
            if (r3 != 0) goto L32
            androidx.compose.ui.Modifier$Node r3 = r11.getNode()
            androidx.compose.p014ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r3, r4)
            goto L35
        L32:
            r1.add(r3)
        L35:
            int r3 = r1.getSize()
            if (r3 == 0) goto Ld9
            int r3 = r1.getSize()
            r5 = 1
            int r3 = r3 - r5
            java.lang.Object r3 = r1.removeAt(r3)
            androidx.compose.ui.Modifier$Node r3 = (androidx.compose.ui.Modifier.Node) r3
            int r6 = r3.getAggregateChildKindSet$ui_release()
            r6 = r6 & r0
            if (r6 != 0) goto L52
            androidx.compose.p014ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r3, r4)
            goto L35
        L52:
            if (r3 == 0) goto L35
            int r6 = r3.getKindSet$ui_release()
            r6 = r6 & r0
            if (r6 == 0) goto Ld3
            r6 = 0
            r7 = r6
        L5d:
            if (r3 == 0) goto L35
            boolean r8 = r3 instanceof androidx.compose.p014ui.node.TraversableNode
            if (r8 == 0) goto L88
            androidx.compose.ui.node.TraversableNode r3 = (androidx.compose.p014ui.node.TraversableNode) r3
            java.lang.Object r8 = r11.getTraverseKey()
            java.lang.Object r9 = r3.getTraverseKey()
            boolean r8 = kotlin.jvm.internal.AbstractC9979u.m20289b(r8, r9)
            if (r8 == 0) goto L84
            boolean r8 = androidx.compose.p014ui.Actual_jvmKt.areObjectsOfSameType(r11, r3)
            if (r8 == 0) goto L84
            java.lang.Object r3 = r12.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L85
        L84:
            r3 = r5
        L85:
            if (r3 != 0) goto Lce
            return
        L88:
            int r8 = r3.getKindSet$ui_release()
            r8 = r8 & r0
            if (r8 == 0) goto L91
            r8 = r5
            goto L92
        L91:
            r8 = r4
        L92:
            if (r8 == 0) goto Lce
            boolean r8 = r3 instanceof androidx.compose.p014ui.node.DelegatingNode
            if (r8 == 0) goto Lce
            r8 = r3
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.p014ui.node.DelegatingNode) r8
            androidx.compose.ui.Modifier$Node r8 = r8.getDelegate$ui_release()
            r9 = r4
        La0:
            if (r8 == 0) goto Lcb
            int r10 = r8.getKindSet$ui_release()
            r10 = r10 & r0
            if (r10 == 0) goto Lab
            r10 = r5
            goto Lac
        Lab:
            r10 = r4
        Lac:
            if (r10 == 0) goto Lc6
            int r9 = r9 + 1
            if (r9 != r5) goto Lb4
            r3 = r8
            goto Lc6
        Lb4:
            if (r7 != 0) goto Lbd
            androidx.compose.runtime.collection.MutableVector r7 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r2]
            r7.<init>(r10, r4)
        Lbd:
            if (r3 == 0) goto Lc3
            r7.add(r3)
            r3 = r6
        Lc3:
            r7.add(r8)
        Lc6:
            androidx.compose.ui.Modifier$Node r8 = r8.getChild$ui_release()
            goto La0
        Lcb:
            if (r9 != r5) goto Lce
            goto L5d
        Lce:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.p014ui.node.DelegatableNodeKt.access$pop(r7)
            goto L5d
        Ld3:
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui_release()
            goto L52
        Ld9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.node.TraversableNodeKt.traverseChildren(androidx.compose.ui.node.TraversableNode, hd.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [hd.l] */
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
    public static final <T extends TraversableNode> void traverseDescendants(T t10, InterfaceC9540l interfaceC9540l) {
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction;
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(262144);
        if (!t10.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = t10.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, t10.getNode(), false);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                for (Modifier.Node child$ui_release2 = node; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = child$ui_release2;
                        MutableVector mutableVector2 = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                if (AbstractC9979u.m20289b(t10.getTraverseKey(), traversableNode.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t10, traversableNode)) {
                                    traverseDescendantsAction = (TraversableNode.Companion.TraverseDescendantsAction) interfaceC9540l.invoke(traversableNode);
                                } else {
                                    traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                }
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
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
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector2.add(delegatingNodePop);
                                                delegatingNodePop = 0;
                                            }
                                            mutableVector2.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i10 == 1) {
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
