package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.ComposeUiFlags;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.focus.FocusDirection;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.NodeChain;
import androidx.compose.p014ui.node.NodeCoordinator;
import androidx.compose.p014ui.node.NodeKind;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class FocusTraversalKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final FocusRequester m30563customFocusSearchOMvw8(FocusTargetNode focusTargetNode, int i10, LayoutDirection layoutDirection) {
        FocusRequester end;
        FocusRequester focusRequester;
        FocusRequester start;
        FocusProperties focusPropertiesFetchFocusProperties$ui_release = focusTargetNode.fetchFocusProperties$ui_release();
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m30514equalsimpl0(i10, companion.m30522getNextdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getNext();
        }
        if (FocusDirection.m30514equalsimpl0(i10, companion.m30523getPreviousdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getPrevious();
        }
        if (FocusDirection.m30514equalsimpl0(i10, companion.m30525getUpdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getUp();
        }
        if (FocusDirection.m30514equalsimpl0(i10, companion.m30518getDowndhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getDown();
        }
        if (FocusDirection.m30514equalsimpl0(i10, companion.m30521getLeftdhqQ8s())) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i11 == 1) {
                start = focusPropertiesFetchFocusProperties$ui_release.getStart();
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                start = focusPropertiesFetchFocusProperties$ui_release.getEnd();
            }
            focusRequester = start != FocusRequester.Companion.getDefault() ? start : null;
            return focusRequester == null ? focusPropertiesFetchFocusProperties$ui_release.getLeft() : focusRequester;
        }
        if (FocusDirection.m30514equalsimpl0(i10, companion.m30524getRightdhqQ8s())) {
            int i12 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i12 == 1) {
                end = focusPropertiesFetchFocusProperties$ui_release.getEnd();
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = focusPropertiesFetchFocusProperties$ui_release.getStart();
            }
            focusRequester = end != FocusRequester.Companion.getDefault() ? end : null;
            return focusRequester == null ? focusPropertiesFetchFocusProperties$ui_release.getRight() : focusRequester;
        }
        if (!(FocusDirection.m30514equalsimpl0(i10, companion.m30519getEnterdhqQ8s()) ? true : FocusDirection.m30514equalsimpl0(i10, companion.m30520getExitdhqQ8s()))) {
            throw new IllegalStateException("invalid FocusDirection");
        }
        CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i10, null);
        FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(focusTargetNode);
        int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (FocusDirection.m30514equalsimpl0(i10, companion.m30519getEnterdhqQ8s())) {
            focusPropertiesFetchFocusProperties$ui_release.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
        } else {
            focusPropertiesFetchFocusProperties$ui_release.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
        }
        return cancelIndicatingFocusBoundaryScope.isCanceled() ? FocusRequester.Companion.getCancel() : (generation != (focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0) || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != focusOwner.getActiveFocusTargetNode())) ? FocusRequester.Companion.getRedirect$ui_release() : FocusRequester.Companion.getDefault();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x006f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.p014ui.focus.FocusTargetNode findActiveFocusNode(androidx.compose.p014ui.focus.FocusTargetNode r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.focus.FocusTraversalKt.findActiveFocusNode(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    private static final FocusTargetNode findNonDeactivatedParent(FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui_release;
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        Modifier.Node nodePop = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                if (focusTargetNode2.fetchFocusProperties$ui_release().getCanFocus()) {
                                    return focusTargetNode2;
                                }
                            } else if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
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
        return null;
    }

    public static final Rect focusRect(FocusTargetNode focusTargetNode) {
        Rect rectLocalBoundingBoxOf;
        NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        return (coordinator$ui_release == null || (rectLocalBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(coordinator$ui_release).localBoundingBoxOf(coordinator$ui_release, false)) == null) ? Rect.Companion.getZero() : rectLocalBoundingBoxOf;
    }

    /* renamed from: focusSearch-0X8WOeE, reason: not valid java name */
    public static final Boolean m30564focusSearch0X8WOeE(FocusTargetNode focusTargetNode, int i10, LayoutDirection layoutDirection, Rect rect, InterfaceC9540l interfaceC9540l) {
        int iM30524getRightdhqQ8s;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m30514equalsimpl0(i10, companion.m30522getNextdhqQ8s()) ? true : FocusDirection.m30514equalsimpl0(i10, companion.m30523getPreviousdhqQ8s())) {
            return Boolean.valueOf(OneDimensionalFocusSearchKt.m30578oneDimensionalFocusSearchOMvw8(focusTargetNode, i10, interfaceC9540l));
        }
        if (FocusDirection.m30514equalsimpl0(i10, companion.m30521getLeftdhqQ8s()) ? true : FocusDirection.m30514equalsimpl0(i10, companion.m30524getRightdhqQ8s()) ? true : FocusDirection.m30514equalsimpl0(i10, companion.m30525getUpdhqQ8s()) ? true : FocusDirection.m30514equalsimpl0(i10, companion.m30518getDowndhqQ8s())) {
            return TwoDimensionalFocusSearchKt.m30587twoDimensionalFocusSearchsMXa3k8(focusTargetNode, i10, rect, interfaceC9540l);
        }
        if (!FocusDirection.m30514equalsimpl0(i10, companion.m30519getEnterdhqQ8s())) {
            if (FocusDirection.m30514equalsimpl0(i10, companion.m30520getExitdhqQ8s())) {
                FocusTargetNode focusTargetNodeFindActiveFocusNode = findActiveFocusNode(focusTargetNode);
                FocusTargetNode focusTargetNodeFindNonDeactivatedParent = focusTargetNodeFindActiveFocusNode != null ? findNonDeactivatedParent(focusTargetNodeFindActiveFocusNode) : null;
                return Boolean.valueOf((focusTargetNodeFindNonDeactivatedParent == null || AbstractC9979u.m20289b(focusTargetNodeFindNonDeactivatedParent, focusTargetNode)) ? false : ((Boolean) interfaceC9540l.invoke(focusTargetNodeFindNonDeactivatedParent)).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.m30516toStringimpl(i10))).toString());
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i11 == 1) {
            iM30524getRightdhqQ8s = companion.m30524getRightdhqQ8s();
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iM30524getRightdhqQ8s = companion.m30521getLeftdhqQ8s();
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode2 = findActiveFocusNode(focusTargetNode);
        if (focusTargetNodeFindActiveFocusNode2 != null) {
            return TwoDimensionalFocusSearchKt.m30587twoDimensionalFocusSearchsMXa3k8(focusTargetNodeFindActiveFocusNode2, iM30524getRightdhqQ8s, rect, interfaceC9540l);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0041, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.p014ui.focus.FocusTargetNode getActiveChild(androidx.compose.p014ui.focus.FocusTargetNode r10) {
        /*
            androidx.compose.ui.Modifier$Node r0 = r10.getNode()
            boolean r0 = r0.isAttached()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.p014ui.node.NodeKind.m32510constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r10.getNode()
            boolean r2 = r2.isAttached()
            if (r2 != 0) goto L22
            java.lang.String r2 = "visitChildren called on an unattached node"
            androidx.compose.p014ui.internal.InlineClassHelperKt.throwIllegalStateException(r2)
        L22:
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r3]
            r5 = 0
            r2.<init>(r4, r5)
            androidx.compose.ui.Modifier$Node r4 = r10.getNode()
            androidx.compose.ui.Modifier$Node r4 = r4.getChild$ui_release()
            if (r4 != 0) goto L3e
            androidx.compose.ui.Modifier$Node r10 = r10.getNode()
            androidx.compose.p014ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r10, r5)
            goto L41
        L3e:
            r2.add(r4)
        L41:
            int r10 = r2.getSize()
            if (r10 == 0) goto Ld6
            int r10 = r2.getSize()
            r4 = 1
            int r10 = r10 - r4
            java.lang.Object r10 = r2.removeAt(r10)
            androidx.compose.ui.Modifier$Node r10 = (androidx.compose.ui.Modifier.Node) r10
            int r6 = r10.getAggregateChildKindSet$ui_release()
            r6 = r6 & r0
            if (r6 != 0) goto L5e
            androidx.compose.p014ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r10, r5)
            goto L41
        L5e:
            if (r10 == 0) goto L41
            int r6 = r10.getKindSet$ui_release()
            r6 = r6 & r0
            if (r6 == 0) goto Ld1
            r6 = r1
        L68:
            if (r10 == 0) goto L41
            boolean r7 = r10 instanceof androidx.compose.p014ui.focus.FocusTargetNode
            if (r7 == 0) goto L90
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.p014ui.focus.FocusTargetNode) r10
            androidx.compose.ui.Modifier$Node r7 = r10.getNode()
            boolean r7 = r7.isAttached()
            if (r7 == 0) goto Lcc
            androidx.compose.ui.focus.FocusStateImpl r7 = r10.getFocusState()
            int[] r8 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L8f
            r8 = 2
            if (r7 == r8) goto L8f
            r8 = 3
            if (r7 == r8) goto L8f
            goto Lcc
        L8f:
            return r10
        L90:
            int r7 = r10.getKindSet$ui_release()
            r7 = r7 & r0
            if (r7 == 0) goto Lcc
            boolean r7 = r10 instanceof androidx.compose.p014ui.node.DelegatingNode
            if (r7 == 0) goto Lcc
            r7 = r10
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.p014ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate$ui_release()
            r8 = r5
        La3:
            if (r7 == 0) goto Lc9
            int r9 = r7.getKindSet$ui_release()
            r9 = r9 & r0
            if (r9 == 0) goto Lc4
            int r8 = r8 + 1
            if (r8 != r4) goto Lb2
            r10 = r7
            goto Lc4
        Lb2:
            if (r6 != 0) goto Lbb
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r3]
            r6.<init>(r9, r5)
        Lbb:
            if (r10 == 0) goto Lc1
            r6.add(r10)
            r10 = r1
        Lc1:
            r6.add(r7)
        Lc4:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild$ui_release()
            goto La3
        Lc9:
            if (r8 != r4) goto Lcc
            goto L68
        Lcc:
            androidx.compose.ui.Modifier$Node r10 = androidx.compose.p014ui.node.DelegatableNodeKt.access$pop(r6)
            goto L68
        Ld1:
            androidx.compose.ui.Modifier$Node r10 = r10.getChild$ui_release()
            goto L5e
        Ld6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.focus.FocusTraversalKt.getActiveChild(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean isEligibleForFocusSearch(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator$ui_release;
        LayoutNode layoutNode2;
        NodeCoordinator coordinator$ui_release2 = focusTargetNode.getCoordinator$ui_release();
        return (coordinator$ui_release2 == null || (layoutNode = coordinator$ui_release2.getLayoutNode()) == null || !layoutNode.isPlaced() || (coordinator$ui_release = focusTargetNode.getCoordinator$ui_release()) == null || (layoutNode2 = coordinator$ui_release.getLayoutNode()) == null || !layoutNode2.isAttached()) ? false : true;
    }
}
