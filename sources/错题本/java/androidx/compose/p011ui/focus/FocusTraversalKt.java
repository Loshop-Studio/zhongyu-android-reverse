package androidx.compose.p011ui.focus;

import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusDirection;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.layout.LayoutCoordinatesKt;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.NodeChain;
import androidx.compose.p011ui.node.NodeCoordinator;
import androidx.compose.p011ui.node.NodeKind;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u001a&\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aF\u0010\u0010\u001a\u0004\u0018\u00010\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0014\"\u0018\u0010\u0016\u001a\u00020\f*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, m5110d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "focusSearch-0X8WOeE", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/geometry/Rect;Lr6/c;)Ljava/lang/Boolean;", "focusSearch", "focusRect", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/geometry/Rect;", "findActiveFocusNode", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "findNonDeactivatedParent", "isEligibleForFocusSearch", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "getActiveChild", "activeChild", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFocusTraversal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,206:1\n1#2:207\n119#3:208\n119#3:285\n119#3:362\n283#4,5:209\n148#4:214\n149#4:220\n150#4,3:224\n153#4:228\n154#4,9:230\n437#4,6:239\n447#4,2:246\n449#4,17:251\n466#4,8:271\n163#4,6:279\n283#4,5:286\n148#4:291\n149#4:297\n150#4,3:301\n153#4:305\n154#4,9:307\n437#4,6:316\n447#4,2:323\n449#4,17:328\n466#4,8:348\n163#4,6:356\n247#4,5:363\n90#4:368\n91#4,8:374\n437#4,6:382\n447#4,2:389\n449#4,8:394\n457#4,9:405\n466#4,8:417\n100#4,7:425\n56#5,5:215\n56#5,5:292\n56#5,5:369\n1101#6:221\n1083#6,2:222\n1101#6:298\n1083#6,2:299\n1101#6:402\n1083#6,2:403\n519#7:227\n44#7:229\n519#7:304\n44#7:306\n246#8:245\n246#8:322\n246#8:388\n240#9,3:248\n243#9,3:268\n240#9,3:325\n243#9,3:345\n240#9,3:391\n243#9,3:414\n*S KotlinDebug\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n*L\n168#1:208\n189#1:285\n203#1:362\n168#1:209,5\n168#1:214\n168#1:220\n168#1:224,3\n168#1:228\n168#1:230,9\n168#1:239,6\n168#1:246,2\n168#1:251,17\n168#1:271,8\n168#1:279,6\n189#1:286,5\n189#1:291\n189#1:297\n189#1:301,3\n189#1:305\n189#1:307,9\n189#1:316,6\n189#1:323,2\n189#1:328,17\n189#1:348,8\n189#1:356,6\n203#1:363,5\n203#1:368\n203#1:374,8\n203#1:382,6\n203#1:389,2\n203#1:394,8\n203#1:405,9\n203#1:417,8\n203#1:425,7\n168#1:215,5\n189#1:292,5\n203#1:369,5\n168#1:221\n168#1:222,2\n189#1:298\n189#1:299,2\n203#1:402\n203#1:403,2\n168#1:227\n168#1:229\n189#1:304\n189#1:306\n168#1:245\n189#1:322\n203#1:388\n168#1:248,3\n168#1:268,3\n189#1:325,3\n189#1:345,3\n203#1:391,3\n203#1:414,3\n*E\n"})
/* loaded from: classes.dex */
public final class FocusTraversalKt {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    @NotNull
    /* renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final FocusRequester m10367customFocusSearchOMvw8(@NotNull FocusTargetNode focusTargetNode, int i, @NotNull LayoutDirection layoutDirection) {
        FocusRequester end;
        FocusRequester focusRequester;
        FocusRequester start;
        FocusProperties focusPropertiesFetchFocusProperties$ui_release = focusTargetNode.fetchFocusProperties$ui_release();
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m10318equalsimpl0(i, companion.m10326getNextdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getNext();
        }
        if (FocusDirection.m10318equalsimpl0(i, companion.m10327getPreviousdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getPrevious();
        }
        if (FocusDirection.m10318equalsimpl0(i, companion.m10329getUpdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getUp();
        }
        if (FocusDirection.m10318equalsimpl0(i, companion.m10322getDowndhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getDown();
        }
        if (FocusDirection.m10318equalsimpl0(i, companion.m10325getLeftdhqQ8s())) {
            int i8 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i8 == 1) {
                start = focusPropertiesFetchFocusProperties$ui_release.getStart();
            } else {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                start = focusPropertiesFetchFocusProperties$ui_release.getEnd();
            }
            focusRequester = start != FocusRequester.INSTANCE.getDefault() ? start : null;
            return focusRequester == null ? focusPropertiesFetchFocusProperties$ui_release.getLeft() : focusRequester;
        }
        if (FocusDirection.m10318equalsimpl0(i, companion.m10328getRightdhqQ8s())) {
            int i9 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i9 == 1) {
                end = focusPropertiesFetchFocusProperties$ui_release.getEnd();
            } else {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = focusPropertiesFetchFocusProperties$ui_release.getStart();
            }
            focusRequester = end != FocusRequester.INSTANCE.getDefault() ? end : null;
            return focusRequester == null ? focusPropertiesFetchFocusProperties$ui_release.getRight() : focusRequester;
        }
        if (!(FocusDirection.m10318equalsimpl0(i, companion.m10323getEnterdhqQ8s()) ? true : FocusDirection.m10318equalsimpl0(i, companion.m10324getExitdhqQ8s()))) {
            throw new IllegalStateException("invalid FocusDirection");
        }
        CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i, null);
        FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(focusTargetNode);
        int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (FocusDirection.m10318equalsimpl0(i, companion.m10323getEnterdhqQ8s())) {
            focusPropertiesFetchFocusProperties$ui_release.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
        } else {
            focusPropertiesFetchFocusProperties$ui_release.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
        }
        return cancelIndicatingFocusBoundaryScope.getIsCanceled() ? FocusRequester.INSTANCE.getCancel() : (generation != (focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0) || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != focusOwner.getActiveFocusTargetNode())) ? FocusRequester.INSTANCE.getRedirect$ui_release() : FocusRequester.INSTANCE.getDefault();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x006f, code lost:
    
        continue;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.p011ui.focus.FocusTargetNode findActiveFocusNode(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.focus.FocusTargetNode r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.focus.FocusTraversalKt.findActiveFocusNode(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    private static final FocusTargetNode findNonDeactivatedParent(FocusTargetNode focusTargetNode) {
        NodeChain nodes;
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((AbstractC1923c.m1039c(layoutNodeRequireLayoutNode) & iM12314constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM12314constructorimpl) != 0) {
                        Modifier.Node nodePop = parent;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                if (focusTargetNode2.fetchFocusProperties$ui_release().getCanFocus()) {
                                    return focusTargetNode2;
                                }
                            } else if ((nodePop.getKindSet() & iM12314constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                if (i == 1) {
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
        return null;
    }

    @NotNull
    public static final Rect focusRect(@NotNull FocusTargetNode focusTargetNode) {
        Rect rectLocalBoundingBoxOf;
        NodeCoordinator coordinator = focusTargetNode.getCoordinator();
        return (coordinator == null || (rectLocalBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(coordinator).localBoundingBoxOf(coordinator, false)) == null) ? Rect.INSTANCE.getZero() : rectLocalBoundingBoxOf;
    }

    @Nullable
    /* renamed from: focusSearch-0X8WOeE, reason: not valid java name */
    public static final Boolean m10368focusSearch0X8WOeE(@NotNull FocusTargetNode focusTargetNode, int i, @NotNull LayoutDirection layoutDirection, @Nullable Rect rect, @NotNull InterfaceC6471c interfaceC6471c) {
        int iM10328getRightdhqQ8s;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m10318equalsimpl0(i, companion.m10326getNextdhqQ8s()) ? true : FocusDirection.m10318equalsimpl0(i, companion.m10327getPreviousdhqQ8s())) {
            return Boolean.valueOf(OneDimensionalFocusSearchKt.m10382oneDimensionalFocusSearchOMvw8(focusTargetNode, i, interfaceC6471c));
        }
        if (FocusDirection.m10318equalsimpl0(i, companion.m10325getLeftdhqQ8s()) ? true : FocusDirection.m10318equalsimpl0(i, companion.m10328getRightdhqQ8s()) ? true : FocusDirection.m10318equalsimpl0(i, companion.m10329getUpdhqQ8s()) ? true : FocusDirection.m10318equalsimpl0(i, companion.m10322getDowndhqQ8s())) {
            return TwoDimensionalFocusSearchKt.m10391twoDimensionalFocusSearchsMXa3k8(focusTargetNode, i, rect, interfaceC6471c);
        }
        if (!FocusDirection.m10318equalsimpl0(i, companion.m10323getEnterdhqQ8s())) {
            if (FocusDirection.m10318equalsimpl0(i, companion.m10324getExitdhqQ8s())) {
                FocusTargetNode focusTargetNodeFindActiveFocusNode = findActiveFocusNode(focusTargetNode);
                FocusTargetNode focusTargetNodeFindNonDeactivatedParent = focusTargetNodeFindActiveFocusNode != null ? findNonDeactivatedParent(focusTargetNodeFindActiveFocusNode) : null;
                return Boolean.valueOf((focusTargetNodeFindNonDeactivatedParent == null || focusTargetNodeFindNonDeactivatedParent.equals(focusTargetNode)) ? false : ((Boolean) interfaceC6471c.invoke(focusTargetNodeFindNonDeactivatedParent)).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.m10320toStringimpl(i))).toString());
        }
        int i8 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i8 == 1) {
            iM10328getRightdhqQ8s = companion.m10328getRightdhqQ8s();
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iM10328getRightdhqQ8s = companion.m10325getLeftdhqQ8s();
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode2 = findActiveFocusNode(focusTargetNode);
        if (focusTargetNodeFindActiveFocusNode2 != null) {
            return TwoDimensionalFocusSearchKt.m10391twoDimensionalFocusSearchsMXa3k8(focusTargetNodeFindActiveFocusNode2, iM10328getRightdhqQ8s, rect, interfaceC6471c);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0041, code lost:
    
        continue;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.p011ui.focus.FocusTargetNode getActiveChild(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.focus.FocusTargetNode r10) {
        /*
            androidx.compose.ui.Modifier$Node r0 = r10.getNode()
            boolean r0 = r0.getIsAttached()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.p011ui.node.NodeKind.m12314constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r10.getNode()
            boolean r2 = r2.getIsAttached()
            if (r2 != 0) goto L22
            java.lang.String r2 = "visitChildren called on an unattached node"
            androidx.compose.p011ui.internal.InlineClassHelperKt.throwIllegalStateException(r2)
        L22:
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r3]
            r5 = 0
            r2.<init>(r4, r5)
            androidx.compose.ui.Modifier$Node r4 = r10.getNode()
            androidx.compose.ui.Modifier$Node r4 = r4.getChild()
            if (r4 != 0) goto L3e
            androidx.compose.ui.Modifier$Node r10 = r10.getNode()
            androidx.compose.p011ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r10, r5)
            goto L41
        L3e:
            r2.add(r4)
        L41:
            int r10 = r2.getSize()
            if (r10 == 0) goto Ld1
            r10 = 1
            java.lang.Object r4 = androidx.compose.material3.AbstractC1923c.m1046j(r2, r10)
            androidx.compose.ui.Modifier$Node r4 = (androidx.compose.ui.Modifier.Node) r4
            int r6 = r4.getAggregateChildKindSet()
            r6 = r6 & r0
            if (r6 != 0) goto L59
            androidx.compose.p011ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r4, r5)
            goto L41
        L59:
            if (r4 == 0) goto L41
            int r6 = r4.getKindSet()
            r6 = r6 & r0
            if (r6 == 0) goto Lcc
            r6 = r1
        L63:
            if (r4 == 0) goto L41
            boolean r7 = r4 instanceof androidx.compose.p011ui.focus.FocusTargetNode
            if (r7 == 0) goto L8b
            androidx.compose.ui.focus.FocusTargetNode r4 = (androidx.compose.p011ui.focus.FocusTargetNode) r4
            androidx.compose.ui.Modifier$Node r7 = r4.getNode()
            boolean r7 = r7.getIsAttached()
            if (r7 == 0) goto Lc7
            androidx.compose.ui.focus.FocusStateImpl r7 = r4.getFocusState()
            int[] r8 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r10) goto L8a
            r8 = 2
            if (r7 == r8) goto L8a
            r8 = 3
            if (r7 == r8) goto L8a
            goto Lc7
        L8a:
            return r4
        L8b:
            int r7 = r4.getKindSet()
            r7 = r7 & r0
            if (r7 == 0) goto Lc7
            boolean r7 = r4 instanceof androidx.compose.p011ui.node.DelegatingNode
            if (r7 == 0) goto Lc7
            r7 = r4
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.p011ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate()
            r8 = r5
        L9e:
            if (r7 == 0) goto Lc4
            int r9 = r7.getKindSet()
            r9 = r9 & r0
            if (r9 == 0) goto Lbf
            int r8 = r8 + 1
            if (r8 != r10) goto Lad
            r4 = r7
            goto Lbf
        Lad:
            if (r6 != 0) goto Lb6
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r3]
            r6.<init>(r9, r5)
        Lb6:
            if (r4 == 0) goto Lbc
            r6.add(r4)
            r4 = r1
        Lbc:
            r6.add(r7)
        Lbf:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild()
            goto L9e
        Lc4:
            if (r8 != r10) goto Lc7
            goto L63
        Lc7:
            androidx.compose.ui.Modifier$Node r4 = androidx.compose.p011ui.node.DelegatableNodeKt.access$pop(r6)
            goto L63
        Lcc:
            androidx.compose.ui.Modifier$Node r4 = r4.getChild()
            goto L59
        Ld1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.focus.FocusTraversalKt.getActiveChild(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean isEligibleForFocusSearch(@NotNull FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator;
        LayoutNode layoutNode2;
        NodeCoordinator coordinator2 = focusTargetNode.getCoordinator();
        return (coordinator2 == null || (layoutNode = coordinator2.getLayoutNode()) == null || !layoutNode.isPlaced() || (coordinator = focusTargetNode.getCoordinator()) == null || (layoutNode2 = coordinator.getLayoutNode()) == null || !layoutNode2.isAttached()) ? false : true;
    }
}
