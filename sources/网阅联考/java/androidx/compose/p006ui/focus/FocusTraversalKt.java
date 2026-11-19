package androidx.compose.p006ui.focus;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.focus.FocusDirection;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.layout.LayoutCoordinatesKt;
import androidx.compose.p006ui.node.DelegatableNodeKt;
import androidx.compose.p006ui.node.LayoutNode;
import androidx.compose.p006ui.node.NodeChain;
import androidx.compose.p006ui.node.NodeCoordinator;
import androidx.compose.p006ui.node.NodeKind;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\n\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000\u001a\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0002\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0001H\u0001\u001a=\u0010\u0016\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0018H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\" \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00018@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00018@X\u0081\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\u0006\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, m5175d2 = {"activeChild", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "getActiveChild$annotations", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V", "getActiveChild", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;", "isEligibleForFocusSearch", "", "isEligibleForFocusSearch$annotations", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z", "customFocusSearch", "Landroidx/compose/ui/focus/FocusRequester;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "findActiveFocusNode", "findNonDeactivatedParent", "focusRect", "Landroidx/compose/ui/geometry/Rect;", "focusSearch", "onFound", "Lkotlin/Function1;", "focusSearch-sMXa3k8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILandroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)Z", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFocusTraversal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,173:1\n1#2:174\n87#3:175\n87#3:205\n87#3:235\n340#4:176\n206#4,2:177\n208#4,7:182\n215#4,15:190\n340#4:206\n206#4,2:207\n208#4,7:212\n215#4,15:220\n314#4:236\n78#4,17:237\n1182#5:179\n1161#5,2:180\n1182#5:209\n1161#5,2:210\n48#6:189\n48#6:219\n*S KotlinDebug\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n*L\n142#1:175\n156#1:205\n168#1:235\n142#1:176\n142#1:177,2\n142#1:182,7\n142#1:190,15\n156#1:206\n156#1:207,2\n156#1:212,7\n156#1:220,15\n168#1:236\n168#1:237,17\n142#1:179\n142#1:180,2\n156#1:209\n156#1:210,2\n142#1:189\n156#1:219\n*E\n"})
/* loaded from: classes.dex */
public final class FocusTraversalKt {

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    public static final FocusRequester m8897customFocusSearchOMvw8(FocusTargetModifierNode customFocusSearch, int i4, LayoutDirection layoutDirection) {
        FocusRequester end;
        Intrinsics.checkNotNullParameter(customFocusSearch, "$this$customFocusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        FocusProperties focusPropertiesFetchFocusProperties$ui_release = customFocusSearch.fetchFocusProperties$ui_release();
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m8871equalsimpl0(i4, companion.m8884getNextdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getNext();
        }
        if (FocusDirection.m8871equalsimpl0(i4, companion.m8886getPreviousdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getPrevious();
        }
        if (FocusDirection.m8871equalsimpl0(i4, companion.m8888getUpdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getUp();
        }
        if (FocusDirection.m8871equalsimpl0(i4, companion.m8879getDowndhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getDown();
        }
        if (FocusDirection.m8871equalsimpl0(i4, companion.m8883getLeftdhqQ8s())) {
            int i5 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i5 == 1) {
                end = focusPropertiesFetchFocusProperties$ui_release.getStart();
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = focusPropertiesFetchFocusProperties$ui_release.getEnd();
            }
            if (Intrinsics.areEqual(end, FocusRequester.INSTANCE.getDefault())) {
                end = null;
            }
            if (end == null) {
                return focusPropertiesFetchFocusProperties$ui_release.getLeft();
            }
        } else {
            if (!FocusDirection.m8871equalsimpl0(i4, companion.m8887getRightdhqQ8s())) {
                if (FocusDirection.m8871equalsimpl0(i4, companion.m8880getEnterdhqQ8s())) {
                    return focusPropertiesFetchFocusProperties$ui_release.getEnter().invoke(FocusDirection.m8868boximpl(i4));
                }
                if (FocusDirection.m8871equalsimpl0(i4, companion.m8881getExitdhqQ8s())) {
                    return focusPropertiesFetchFocusProperties$ui_release.getExit().invoke(FocusDirection.m8868boximpl(i4));
                }
                throw new IllegalStateException("invalid FocusDirection".toString());
            }
            int i6 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i6 == 1) {
                end = focusPropertiesFetchFocusProperties$ui_release.getEnd();
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = focusPropertiesFetchFocusProperties$ui_release.getStart();
            }
            if (Intrinsics.areEqual(end, FocusRequester.INSTANCE.getDefault())) {
                end = null;
            }
            if (end == null) {
                return focusPropertiesFetchFocusProperties$ui_release.getRight();
            }
        }
        return end;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0054, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.p006ui.focus.FocusTargetModifierNode findActiveFocusNode(androidx.compose.p006ui.focus.FocusTargetModifierNode r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.compose.ui.focus.FocusStateImpl r0 = r6.getFocusStateImpl()
            int[] r1 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L98
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L25
            r1 = 3
            if (r0 == r1) goto L98
            r6 = 4
            if (r0 != r6) goto L1f
            return r3
        L1f:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L25:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.p006ui.node.NodeKind.m10773constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r6.getNode()
            boolean r2 = r2.getIsAttached()
            if (r2 == 0) goto L8c
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r4 = 16
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r4]
            r5 = 0
            r2.<init>(r4, r5)
            androidx.compose.ui.Modifier$Node r4 = r6.getNode()
            androidx.compose.ui.Modifier$Node r4 = r4.getChild()
            if (r4 != 0) goto L51
            androidx.compose.ui.Modifier$Node r6 = r6.getNode()
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r6)
            goto L54
        L51:
            r2.add(r4)
        L54:
            boolean r6 = r2.isNotEmpty()
            if (r6 == 0) goto L8b
            int r6 = r2.getSize()
            int r6 = r6 - r1
            java.lang.Object r6 = r2.removeAt(r6)
            androidx.compose.ui.Modifier$Node r6 = (androidx.compose.ui.Modifier.Node) r6
            int r4 = r6.getAggregateChildKindSet()
            r4 = r4 & r0
            if (r4 != 0) goto L70
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r6)
            goto L54
        L70:
            if (r6 == 0) goto L54
            int r4 = r6.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto L86
            boolean r4 = r6 instanceof androidx.compose.p006ui.focus.FocusTargetModifierNode
            if (r4 == 0) goto L54
            androidx.compose.ui.focus.FocusTargetModifierNode r6 = (androidx.compose.p006ui.focus.FocusTargetModifierNode) r6
            androidx.compose.ui.focus.FocusTargetModifierNode r6 = findActiveFocusNode(r6)
            if (r6 == 0) goto L54
            return r6
        L86:
            androidx.compose.ui.Modifier$Node r6 = r6.getChild()
            goto L70
        L8b:
            return r3
        L8c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L98:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.focus.FocusTraversalKt.findActiveFocusNode(androidx.compose.ui.focus.FocusTargetModifierNode):androidx.compose.ui.focus.FocusTargetModifierNode");
    }

    private static final FocusTargetModifierNode findNonDeactivatedParent(FocusTargetModifierNode focusTargetModifierNode) {
        NodeChain nodes;
        int iM10773constructorimpl = NodeKind.m10773constructorimpl(1024);
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node parent = focusTargetModifierNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetModifierNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM10773constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM10773constructorimpl) != 0 && (parent instanceof FocusTargetModifierNode)) {
                        FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) parent;
                        if (focusTargetModifierNode2.fetchFocusProperties$ui_release().getCanFocus()) {
                            return focusTargetModifierNode2;
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

    @ExperimentalComposeUiApi
    public static final Rect focusRect(FocusTargetModifierNode focusTargetModifierNode) {
        Rect rectLocalBoundingBoxOf;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        NodeCoordinator coordinator = focusTargetModifierNode.getCoordinator();
        return (coordinator == null || (rectLocalBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(coordinator).localBoundingBoxOf(coordinator, false)) == null) ? Rect.INSTANCE.getZero() : rectLocalBoundingBoxOf;
    }

    /* renamed from: focusSearch-sMXa3k8, reason: not valid java name */
    public static final boolean m8898focusSearchsMXa3k8(FocusTargetModifierNode focusSearch, int i4, LayoutDirection layoutDirection, Function1<? super FocusTargetModifierNode, Boolean> onFound) {
        int iM8887getRightdhqQ8s;
        Boolean boolM8910twoDimensionalFocusSearchOMvw8;
        Intrinsics.checkNotNullParameter(focusSearch, "$this$focusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m8871equalsimpl0(i4, companion.m8884getNextdhqQ8s()) ? true : FocusDirection.m8871equalsimpl0(i4, companion.m8886getPreviousdhqQ8s())) {
            return OneDimensionalFocusSearchKt.m8901oneDimensionalFocusSearchOMvw8(focusSearch, i4, onFound);
        }
        if (FocusDirection.m8871equalsimpl0(i4, companion.m8883getLeftdhqQ8s()) ? true : FocusDirection.m8871equalsimpl0(i4, companion.m8887getRightdhqQ8s()) ? true : FocusDirection.m8871equalsimpl0(i4, companion.m8888getUpdhqQ8s()) ? true : FocusDirection.m8871equalsimpl0(i4, companion.m8879getDowndhqQ8s())) {
            Boolean boolM8910twoDimensionalFocusSearchOMvw82 = TwoDimensionalFocusSearchKt.m8910twoDimensionalFocusSearchOMvw8(focusSearch, i4, onFound);
            if (boolM8910twoDimensionalFocusSearchOMvw82 != null) {
                return boolM8910twoDimensionalFocusSearchOMvw82.booleanValue();
            }
        } else if (FocusDirection.m8871equalsimpl0(i4, companion.m8880getEnterdhqQ8s())) {
            int i5 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i5 == 1) {
                iM8887getRightdhqQ8s = companion.m8887getRightdhqQ8s();
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iM8887getRightdhqQ8s = companion.m8883getLeftdhqQ8s();
            }
            FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = findActiveFocusNode(focusSearch);
            if (focusTargetModifierNodeFindActiveFocusNode != null && (boolM8910twoDimensionalFocusSearchOMvw8 = TwoDimensionalFocusSearchKt.m8910twoDimensionalFocusSearchOMvw8(focusTargetModifierNodeFindActiveFocusNode, iM8887getRightdhqQ8s, onFound)) != null) {
                return boolM8910twoDimensionalFocusSearchOMvw8.booleanValue();
            }
        } else {
            if (!FocusDirection.m8871equalsimpl0(i4, companion.m8881getExitdhqQ8s())) {
                throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.m8873toStringimpl(i4))).toString());
            }
            FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode2 = findActiveFocusNode(focusSearch);
            FocusTargetModifierNode focusTargetModifierNodeFindNonDeactivatedParent = focusTargetModifierNodeFindActiveFocusNode2 != null ? findNonDeactivatedParent(focusTargetModifierNodeFindActiveFocusNode2) : null;
            if (focusTargetModifierNodeFindNonDeactivatedParent != null && !Intrinsics.areEqual(focusTargetModifierNodeFindNonDeactivatedParent, focusSearch)) {
                return onFound.invoke(focusTargetModifierNodeFindNonDeactivatedParent).booleanValue();
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0040, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.p006ui.focus.FocusTargetModifierNode getActiveChild(androidx.compose.p006ui.focus.FocusTargetModifierNode r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.compose.ui.Modifier$Node r0 = r6.getNode()
            boolean r0 = r0.getIsAttached()
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.p006ui.node.NodeKind.m10773constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r6.getNode()
            boolean r2 = r2.getIsAttached()
            if (r2 == 0) goto L88
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r3]
            r4 = 0
            r2.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r6.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild()
            if (r3 != 0) goto L3d
            androidx.compose.ui.Modifier$Node r6 = r6.getNode()
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r6)
            goto L40
        L3d:
            r2.add(r3)
        L40:
            boolean r6 = r2.isNotEmpty()
            if (r6 == 0) goto L87
            int r6 = r2.getSize()
            r3 = 1
            int r6 = r6 - r3
            java.lang.Object r6 = r2.removeAt(r6)
            androidx.compose.ui.Modifier$Node r6 = (androidx.compose.ui.Modifier.Node) r6
            int r4 = r6.getAggregateChildKindSet()
            r4 = r4 & r0
            if (r4 != 0) goto L5d
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r6)
            goto L40
        L5d:
            if (r6 == 0) goto L40
            int r4 = r6.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto L82
            boolean r4 = r6 instanceof androidx.compose.p006ui.focus.FocusTargetModifierNode
            if (r4 == 0) goto L40
            androidx.compose.ui.focus.FocusTargetModifierNode r6 = (androidx.compose.p006ui.focus.FocusTargetModifierNode) r6
            androidx.compose.ui.focus.FocusStateImpl r4 = r6.getFocusStateImpl()
            int[] r5 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1
            int r4 = r4.ordinal()
            r4 = r5[r4]
            if (r4 == r3) goto L81
            r3 = 2
            if (r4 == r3) goto L81
            r3 = 3
            if (r4 == r3) goto L81
            goto L40
        L81:
            return r6
        L82:
            androidx.compose.ui.Modifier$Node r6 = r6.getChild()
            goto L5d
        L87:
            return r1
        L88:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.focus.FocusTraversalKt.getActiveChild(androidx.compose.ui.focus.FocusTargetModifierNode):androidx.compose.ui.focus.FocusTargetModifierNode");
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getActiveChild$annotations(FocusTargetModifierNode focusTargetModifierNode) {
    }

    public static final boolean isEligibleForFocusSearch(FocusTargetModifierNode focusTargetModifierNode) {
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        NodeCoordinator coordinator = focusTargetModifierNode.getCoordinator();
        if ((coordinator == null || (layoutNode2 = coordinator.getLayoutNode()) == null || !layoutNode2.getIsPlaced()) ? false : true) {
            NodeCoordinator coordinator2 = focusTargetModifierNode.getCoordinator();
            if ((coordinator2 == null || (layoutNode = coordinator2.getLayoutNode()) == null || !layoutNode.isAttached()) ? false : true) {
                return true;
            }
        }
        return false;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void isEligibleForFocusSearch$annotations(FocusTargetModifierNode focusTargetModifierNode) {
    }
}
