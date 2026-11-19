package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.ComposeUiFlags;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.focus.FocusDirection;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.layout.BeyondBoundsLayout;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class TwoDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";
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

    private static final FocusTargetNode activeNode(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("Searching for active node in inactive hierarchy");
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            return focusTargetNodeFindActiveFocusNode;
        }
        throw new IllegalStateException(NoActiveChild);
    }

    /* renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m23979beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i10) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i10, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i10, rect)) {
            return false;
        }
        if (!beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i10, rect)) {
            return true;
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        return FocusDirection.m23912equalsimpl0(i10, companion.m23919getLeftdhqQ8s()) || FocusDirection.m23912equalsimpl0(i10, companion.m23922getRightdhqQ8s()) || beamBeats_I7lrPNg$majorAxisDistance$6(rect2, i10, rect) < beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i10, rect);
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i10, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23919getLeftdhqQ8s()) ? true : FocusDirection.m23912equalsimpl0(i10, companion.m23922getRightdhqQ8s())) {
            return rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom();
        }
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23923getUpdhqQ8s()) ? true : FocusDirection.m23912equalsimpl0(i10, companion.m23916getDowndhqQ8s())) {
            return rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight();
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i10, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23919getLeftdhqQ8s())) {
            return rect2.getLeft() >= rect.getRight();
        }
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23922getRightdhqQ8s())) {
            return rect2.getRight() <= rect.getLeft();
        }
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23923getUpdhqQ8s())) {
            return rect2.getTop() >= rect.getBottom();
        }
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23916getDowndhqQ8s())) {
            return rect2.getBottom() <= rect.getTop();
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float beamBeats_I7lrPNg$majorAxisDistance$6(androidx.compose.p013ui.geometry.Rect r2, int r3, androidx.compose.p013ui.geometry.Rect r4) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.p013ui.focus.FocusDirection.Companion
            int r1 = r0.m23919getLeftdhqQ8s()
            boolean r1 = androidx.compose.p013ui.focus.FocusDirection.m23912equalsimpl0(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.getLeft()
            float r2 = r2.getRight()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.m23922getRightdhqQ8s()
            boolean r1 = androidx.compose.p013ui.focus.FocusDirection.m23912equalsimpl0(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.getLeft()
            float r3 = r4.getRight()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.m23923getUpdhqQ8s()
            boolean r1 = androidx.compose.p013ui.focus.FocusDirection.m23912equalsimpl0(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.getTop()
            float r2 = r2.getBottom()
            goto L14
        L3e:
            int r0 = r0.m23916getDowndhqQ8s()
            boolean r3 = androidx.compose.p013ui.focus.FocusDirection.m23912equalsimpl0(r3, r0)
            if (r3 == 0) goto L58
            float r2 = r2.getTop()
            float r3 = r4.getBottom()
            goto L28
        L51:
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L57
            return r2
        L57:
            return r3
        L58:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.focus.TwoDimensionalFocusSearchKt.beamBeats_I7lrPNg$majorAxisDistance$6(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(androidx.compose.p013ui.geometry.Rect r2, int r3, androidx.compose.p013ui.geometry.Rect r4) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.p013ui.focus.FocusDirection.Companion
            int r1 = r0.m23919getLeftdhqQ8s()
            boolean r1 = androidx.compose.p013ui.focus.FocusDirection.m23912equalsimpl0(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.getLeft()
            float r2 = r2.getLeft()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.m23922getRightdhqQ8s()
            boolean r1 = androidx.compose.p013ui.focus.FocusDirection.m23912equalsimpl0(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.getRight()
            float r3 = r4.getRight()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.m23923getUpdhqQ8s()
            boolean r1 = androidx.compose.p013ui.focus.FocusDirection.m23912equalsimpl0(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.getTop()
            float r2 = r2.getTop()
            goto L14
        L3e:
            int r0 = r0.m23916getDowndhqQ8s()
            boolean r3 = androidx.compose.p013ui.focus.FocusDirection.m23912equalsimpl0(r3, r0)
            if (r3 == 0) goto L59
            float r2 = r2.getBottom()
            float r3 = r4.getBottom()
            goto L28
        L51:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L58
            return r2
        L58:
            return r3
        L59:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.focus.TwoDimensionalFocusSearchKt.beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):float");
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    private static final void collectAccessibleChildren(DelegatableNode delegatableNode, MutableVector<FocusTargetNode> mutableVector) {
        int iM25908constructorimpl = NodeKind.m25908constructorimpl(1024);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, delegatableNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui_release() & iM25908constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop, false);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui_release() & iM25908constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) nodePop;
                                if (focusTargetNode.isAttached() && !DelegatableNodeKt.requireLayoutNode(focusTargetNode).isDeactivated()) {
                                    if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                                        mutableVector.add(focusTargetNode);
                                    } else {
                                        collectAccessibleChildren(focusTargetNode, mutableVector);
                                    }
                                }
                            } else if ((nodePop.getKindSet$ui_release() & iM25908constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i10 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM25908constructorimpl) != 0) {
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
    }

    /* renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final FocusTargetNode m23980findBestCandidate4WY_MpI(MutableVector<FocusTargetNode> mutableVector, Rect rect, int i10) {
        Rect rectTranslate;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23919getLeftdhqQ8s())) {
            rectTranslate = rect.translate((rect.getRight() - rect.getLeft()) + 1, 0.0f);
        } else if (FocusDirection.m23912equalsimpl0(i10, companion.m23922getRightdhqQ8s())) {
            rectTranslate = rect.translate(-((rect.getRight() - rect.getLeft()) + 1), 0.0f);
        } else if (FocusDirection.m23912equalsimpl0(i10, companion.m23923getUpdhqQ8s())) {
            rectTranslate = rect.translate(0.0f, (rect.getBottom() - rect.getTop()) + 1);
        } else {
            if (!FocusDirection.m23912equalsimpl0(i10, companion.m23916getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            rectTranslate = rect.translate(0.0f, -((rect.getBottom() - rect.getTop()) + 1));
        }
        FocusTargetNode[] focusTargetNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        FocusTargetNode focusTargetNode = null;
        for (int i11 = 0; i11 < size; i11++) {
            FocusTargetNode focusTargetNode2 = focusTargetNodeArr[i11];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                Rect rectFocusRect = FocusTraversalKt.focusRect(focusTargetNode2);
                if (m23983isBetterCandidateI7lrPNg(rectFocusRect, rectTranslate, rect, i10)) {
                    focusTargetNode = focusTargetNode2;
                    rectTranslate = rectFocusRect;
                }
            }
        }
        return focusTargetNode;
    }

    /* renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m23981findChildCorrespondingToFocusEnterOMvw8(FocusTargetNode focusTargetNode, int i10, InterfaceC10570l interfaceC10570l) {
        Rect rectBottomRight;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        collectAccessibleChildren(focusTargetNode, mutableVector);
        if (mutableVector.getSize() <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (mutableVector.getSize() == 0 ? null : mutableVector.content[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) interfaceC10570l.invoke(focusTargetNode2)).booleanValue();
            }
            return false;
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23917getEnterdhqQ8s())) {
            i10 = companion.m23922getRightdhqQ8s();
        }
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23922getRightdhqQ8s()) ? true : FocusDirection.m23912equalsimpl0(i10, companion.m23916getDowndhqQ8s())) {
            rectBottomRight = topLeft(FocusTraversalKt.focusRect(focusTargetNode));
        } else {
            if (!(FocusDirection.m23912equalsimpl0(i10, companion.m23919getLeftdhqQ8s()) ? true : FocusDirection.m23912equalsimpl0(i10, companion.m23923getUpdhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            rectBottomRight = bottomRight(FocusTraversalKt.focusRect(focusTargetNode));
        }
        FocusTargetNode focusTargetNodeM23980findBestCandidate4WY_MpI = m23980findBestCandidate4WY_MpI(mutableVector, rectBottomRight, i10);
        if (focusTargetNodeM23980findBestCandidate4WY_MpI != null) {
            return ((Boolean) interfaceC10570l.invoke(focusTargetNodeM23980findBestCandidate4WY_MpI)).booleanValue();
        }
        return false;
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m23982generateAndSearchChildren4C6V_qg(final FocusTargetNode focusTargetNode, final Rect rect, final int i10, final InterfaceC10570l interfaceC10570l) {
        if (m23984searchChildren4C6V_qg(focusTargetNode, rect, i10, interfaceC10570l)) {
            return true;
        }
        final FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        final int generation = focusTransactionManagerRequireTransactionManager.getGeneration();
        final FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m23907searchBeyondBoundsOMvw8(focusTargetNode, i10, new InterfaceC10570l() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                if (generation != focusTransactionManagerRequireTransactionManager.getGeneration() || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode())) {
                    return Boolean.TRUE;
                }
                boolean zM23984searchChildren4C6V_qg = TwoDimensionalFocusSearchKt.m23984searchChildren4C6V_qg(focusTargetNode, rect, i10, interfaceC10570l);
                Boolean boolValueOf = Boolean.valueOf(zM23984searchChildren4C6V_qg);
                if (zM23984searchChildren4C6V_qg || !beyondBoundsScope.getHasMoreContent()) {
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

    /* renamed from: isBetterCandidate-I7lrPNg, reason: not valid java name */
    public static final boolean m23983isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i10) {
        if (!isBetterCandidate_I7lrPNg$isCandidate(rect, i10, rect3)) {
            return false;
        }
        if (isBetterCandidate_I7lrPNg$isCandidate(rect2, i10, rect3) && !m23979beamBeatsI7lrPNg(rect3, rect, rect2, i10)) {
            return !m23979beamBeatsI7lrPNg(rect3, rect2, rect, i10) && isBetterCandidate_I7lrPNg$weightedDistance(i10, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i10, rect3, rect2);
        }
        return true;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i10, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23919getLeftdhqQ8s())) {
            return (rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft();
        }
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23922getRightdhqQ8s())) {
            return (rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight();
        }
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23923getUpdhqQ8s())) {
            return (rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop();
        }
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23916getDowndhqQ8s())) {
            return (rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom();
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(androidx.compose.p013ui.geometry.Rect r2, int r3, androidx.compose.p013ui.geometry.Rect r4) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.p013ui.focus.FocusDirection.Companion
            int r1 = r0.m23919getLeftdhqQ8s()
            boolean r1 = androidx.compose.p013ui.focus.FocusDirection.m23912equalsimpl0(r3, r1)
            if (r1 == 0) goto L16
            float r3 = r4.getLeft()
            float r2 = r2.getRight()
        L14:
            float r3 = r3 - r2
            goto L51
        L16:
            int r1 = r0.m23922getRightdhqQ8s()
            boolean r1 = androidx.compose.p013ui.focus.FocusDirection.m23912equalsimpl0(r3, r1)
            if (r1 == 0) goto L2b
            float r2 = r2.getLeft()
            float r3 = r4.getRight()
        L28:
            float r3 = r2 - r3
            goto L51
        L2b:
            int r1 = r0.m23923getUpdhqQ8s()
            boolean r1 = androidx.compose.p013ui.focus.FocusDirection.m23912equalsimpl0(r3, r1)
            if (r1 == 0) goto L3e
            float r3 = r4.getTop()
            float r2 = r2.getBottom()
            goto L14
        L3e:
            int r0 = r0.m23916getDowndhqQ8s()
            boolean r3 = androidx.compose.p013ui.focus.FocusDirection.m23912equalsimpl0(r3, r0)
            if (r3 == 0) goto L58
            float r2 = r2.getTop()
            float r3 = r4.getBottom()
            goto L28
        L51:
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L57
            return r2
        L57:
            return r3
        L58:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.focus.TwoDimensionalFocusSearchKt.isBetterCandidate_I7lrPNg$majorAxisDistance(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):float");
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i10, Rect rect2) {
        float f10;
        float f11;
        float left;
        float right;
        float left2;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m23912equalsimpl0(i10, companion.m23919getLeftdhqQ8s()) ? true : FocusDirection.m23912equalsimpl0(i10, companion.m23922getRightdhqQ8s())) {
            float top2 = rect2.getTop();
            float bottom = rect2.getBottom() - rect2.getTop();
            f10 = 2;
            f11 = top2 + (bottom / f10);
            left = rect.getTop();
            right = rect.getBottom();
            left2 = rect.getTop();
        } else {
            if (!(FocusDirection.m23912equalsimpl0(i10, companion.m23923getUpdhqQ8s()) ? true : FocusDirection.m23912equalsimpl0(i10, companion.m23916getDowndhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            float left3 = rect2.getLeft();
            float right2 = rect2.getRight() - rect2.getLeft();
            f10 = 2;
            f11 = left3 + (right2 / f10);
            left = rect.getLeft();
            right = rect.getRight();
            left2 = rect.getLeft();
        }
        return f11 - (left + ((right - left2) / f10));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i10, Rect rect, Rect rect2) {
        long jIsBetterCandidate_I7lrPNg$majorAxisDistance = (long) isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i10, rect);
        long jIsBetterCandidate_I7lrPNg$minorAxisDistance = (long) isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i10, rect);
        return (13 * jIsBetterCandidate_I7lrPNg$majorAxisDistance * jIsBetterCandidate_I7lrPNg$majorAxisDistance) + (jIsBetterCandidate_I7lrPNg$minorAxisDistance * jIsBetterCandidate_I7lrPNg$minorAxisDistance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m23984searchChildren4C6V_qg(FocusTargetNode focusTargetNode, Rect rect, int i10, InterfaceC10570l interfaceC10570l) {
        FocusTargetNode focusTargetNodeM23980findBestCandidate4WY_MpI;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int iM25908constructorimpl = NodeKind.m25908constructorimpl(1024);
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
            if ((nodePop.getAggregateChildKindSet$ui_release() & iM25908constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop, false);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui_release() & iM25908constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                if (focusTargetNode2.isAttached()) {
                                    mutableVector.add(focusTargetNode2);
                                }
                            } else if ((nodePop.getKindSet$ui_release() & iM25908constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM25908constructorimpl) != 0) {
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
        while (mutableVector.getSize() != 0 && (focusTargetNodeM23980findBestCandidate4WY_MpI = m23980findBestCandidate4WY_MpI(mutableVector, rect, i10)) != null) {
            if (focusTargetNodeM23980findBestCandidate4WY_MpI.fetchFocusProperties$ui_release().getCanFocus()) {
                return ((Boolean) interfaceC10570l.invoke(focusTargetNodeM23980findBestCandidate4WY_MpI)).booleanValue();
            }
            if (m23982generateAndSearchChildren4C6V_qg(focusTargetNodeM23980findBestCandidate4WY_MpI, rect, i10, interfaceC10570l)) {
                return true;
            }
            mutableVector.remove(focusTargetNodeM23980findBestCandidate4WY_MpI);
        }
        return false;
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    /* renamed from: twoDimensionalFocusSearch-sMXa3k8, reason: not valid java name */
    public static final Boolean m23985twoDimensionalFocusSearchsMXa3k8(FocusTargetNode focusTargetNode, int i10, Rect rect, InterfaceC10570l interfaceC10570l) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i11 = iArr[focusState.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return Boolean.valueOf(m23981findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i10, interfaceC10570l));
            }
            if (i11 == 4) {
                return focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() ? (Boolean) interfaceC10570l.invoke(focusTargetNode) : rect == null ? Boolean.valueOf(m23981findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, i10, interfaceC10570l)) : Boolean.valueOf(m23984searchChildren4C6V_qg(focusTargetNode, rect, i10, interfaceC10570l));
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild == null) {
            throw new IllegalStateException(NoActiveChild);
        }
        int i12 = iArr[activeChild.getFocusState().ordinal()];
        if (i12 == 1) {
            Boolean boolM23985twoDimensionalFocusSearchsMXa3k8 = m23985twoDimensionalFocusSearchsMXa3k8(activeChild, i10, rect, interfaceC10570l);
            if (!AbstractC9133u.m16128b(boolM23985twoDimensionalFocusSearchsMXa3k8, Boolean.FALSE)) {
                return boolM23985twoDimensionalFocusSearchsMXa3k8;
            }
            if (rect == null) {
                rect = FocusTraversalKt.focusRect(activeNode(activeChild));
            }
            return Boolean.valueOf(m23982generateAndSearchChildren4C6V_qg(focusTargetNode, rect, i10, interfaceC10570l));
        }
        if (i12 == 2 || i12 == 3) {
            if (rect == null) {
                rect = FocusTraversalKt.focusRect(activeChild);
            }
            return Boolean.valueOf(m23982generateAndSearchChildren4C6V_qg(focusTargetNode, rect, i10, interfaceC10570l));
        }
        if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(NoActiveChild);
    }
}
