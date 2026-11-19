package androidx.compose.p006ui.focus;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.focus.FocusDirection;
import androidx.compose.p006ui.focus.FocusRequester;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.layout.BeyondBoundsLayout;
import androidx.compose.p006ui.node.DelegatableNodeKt;
import androidx.compose.p006ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u001a5\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\f\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0013H\u0003\u001a\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a\u001a\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0019H\u0003\u001a1\u0010\u001a\u001a\u0004\u0018\u00010\u0013*\b\u0012\u0004\u0012\u00020\u00130\u00192\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a5\u0010\u001e\u001a\u00020\u0004*\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a=\u0010#\u001a\u00020\u0004*\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a=\u0010'\u001a\u00020\u0004*\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010&\u001a\f\u0010)\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a7\u0010*\u001a\u0004\u0018\u00010\u0004*\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040 H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, m5175d2 = {"InvalidFocusDirection", "", "NoActiveChild", "beamBeats", "", "source", "Landroidx/compose/ui/geometry/Rect;", "rect1", "rect2", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "beamBeats-I7lrPNg", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "isBetterCandidate", "proposedCandidate", "currentCandidate", "focusedRect", "isBetterCandidate-I7lrPNg", "activeNode", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "bottomRight", "collectAccessibleChildren", "", "Landroidx/compose/ui/node/DelegatableNode;", "accessibleChildren", "Landroidx/compose/runtime/collection/MutableVector;", "findBestCandidate", "focusRect", "findBestCandidate-4WY_MpI", "(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/focus/FocusTargetModifierNode;", "findChildCorrespondingToFocusEnter", "onFound", "Lkotlin/Function1;", "findChildCorrespondingToFocusEnter--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "generateAndSearchChildren", "focusedItem", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "searchChildren", "searchChildren-4C6V_qg", "topLeft", "twoDimensionalFocusSearch", "twoDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTwoDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,423:1\n1#2:424\n1161#3,2:425\n1161#3,2:429\n1182#3:435\n1161#3,2:436\n1182#3:465\n1161#3,2:466\n359#4:427\n523#4:428\n48#4:445\n460#4,11:480\n460#4,11:499\n87#5:431\n87#5:461\n340#6:432\n206#6,2:433\n208#6,7:438\n215#6,15:446\n346#6:462\n237#6,2:463\n239#6,12:468\n251#6,8:491\n*S KotlinDebug\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n*L\n120#1:425,2\n178#1:429,2\n179#1:435\n179#1:436,2\n214#1:465\n214#1:466,2\n125#1:427\n125#1:428\n179#1:445\n225#1:480,11\n257#1:499,11\n179#1:431\n214#1:461\n179#1:432\n179#1:433,2\n179#1:438,7\n179#1:446,15\n214#1:462\n214#1:463,2\n214#1:468,12\n214#1:491,8\n*E\n"})
/* loaded from: classes.dex */
public final class TwoDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    @ExperimentalComposeUiApi
    private static final FocusTargetModifierNode activeNode(FocusTargetModifierNode focusTargetModifierNode) {
        if (!(focusTargetModifierNode.getFocusState() == FocusStateImpl.ActiveParent)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetModifierNode);
        if (focusTargetModifierNodeFindActiveFocusNode != null) {
            return focusTargetModifierNodeFindActiveFocusNode;
        }
        throw new IllegalStateException(NoActiveChild.toString());
    }

    /* renamed from: beamBeats-I7lrPNg, reason: not valid java name */
    private static final boolean m8904beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i4) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i4, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i4, rect)) {
            return false;
        }
        if (beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i4, rect)) {
            FocusDirection.Companion companion = FocusDirection.INSTANCE;
            if (!FocusDirection.m8871equalsimpl0(i4, companion.m8883getLeftdhqQ8s()) && !FocusDirection.m8871equalsimpl0(i4, companion.m8887getRightdhqQ8s()) && beamBeats_I7lrPNg$majorAxisDistance$15(rect2, i4, rect) >= beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i4, rect)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i4, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!(FocusDirection.m8871equalsimpl0(i4, companion.m8883getLeftdhqQ8s()) ? true : FocusDirection.m8871equalsimpl0(i4, companion.m8887getRightdhqQ8s()))) {
            if (!(FocusDirection.m8871equalsimpl0(i4, companion.m8888getUpdhqQ8s()) ? true : FocusDirection.m8871equalsimpl0(i4, companion.m8879getDowndhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            if (rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight()) {
                return true;
            }
        } else if (rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom()) {
            return true;
        }
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i4, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m8871equalsimpl0(i4, companion.m8883getLeftdhqQ8s())) {
            if (rect2.getLeft() >= rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m8871equalsimpl0(i4, companion.m8887getRightdhqQ8s())) {
            if (rect2.getRight() <= rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m8871equalsimpl0(i4, companion.m8888getUpdhqQ8s())) {
            if (rect2.getTop() >= rect.getBottom()) {
                return true;
            }
        } else {
            if (!FocusDirection.m8871equalsimpl0(i4, companion.m8879getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            if (rect2.getBottom() <= rect.getTop()) {
                return true;
            }
        }
        return false;
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistance$15(Rect rect, int i4, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f4;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m8871equalsimpl0(i4, companion.m8883getLeftdhqQ8s())) {
            if (FocusDirection.m8871equalsimpl0(i4, companion.m8887getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m8871equalsimpl0(i4, companion.m8888getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m8871equalsimpl0(i4, companion.m8879getDowndhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f4 = top - bottom;
            return Math.max(0.0f, f4);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f4 = top2 - bottom2;
        return Math.max(0.0f, f4);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i4, Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f4;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m8871equalsimpl0(i4, companion.m8883getLeftdhqQ8s())) {
            if (FocusDirection.m8871equalsimpl0(i4, companion.m8887getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m8871equalsimpl0(i4, companion.m8888getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else {
                if (!FocusDirection.m8871equalsimpl0(i4, companion.m8879getDowndhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            }
            f4 = bottom - bottom2;
            return Math.max(1.0f, f4);
        }
        top = rect2.getLeft();
        top2 = rect.getLeft();
        f4 = top - top2;
        return Math.max(1.0f, f4);
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba A[SYNTHETIC] */
    @androidx.compose.p006ui.ExperimentalComposeUiApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void collectAccessibleChildren(androidx.compose.p006ui.node.DelegatableNode r9, androidx.compose.runtime.collection.MutableVector<androidx.compose.p006ui.focus.FocusTargetModifierNode> r10) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.p006ui.node.NodeKind.m10773constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r9.getNode()
            boolean r1 = r1.getIsAttached()
            if (r1 == 0) goto Lc5
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r2 = new androidx.compose.ui.Modifier.Node[r2]
            r3 = 0
            r1.<init>(r2, r3)
            androidx.compose.ui.Modifier$Node r2 = r9.getNode()
            androidx.compose.ui.Modifier$Node r2 = r2.getChild()
            if (r2 != 0) goto L2c
            androidx.compose.ui.Modifier$Node r9 = r9.getNode()
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r9)
            goto L2f
        L2c:
            r1.add(r2)
        L2f:
            boolean r9 = r1.isNotEmpty()
            if (r9 == 0) goto Lc4
            int r9 = r1.getSize()
            r2 = 1
            int r9 = r9 - r2
            java.lang.Object r9 = r1.removeAt(r9)
            androidx.compose.ui.Modifier$Node r9 = (androidx.compose.ui.Modifier.Node) r9
            int r4 = r9.getAggregateChildKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto Lbf
            r4 = r9
        L49:
            if (r4 == 0) goto Lbf
            int r5 = r4.getKindSet()
            r5 = r5 & r0
            if (r5 == 0) goto Lba
            boolean r5 = r4 instanceof androidx.compose.p006ui.focus.FocusTargetModifierNode
            if (r5 == 0) goto Lb7
            r5 = r4
            androidx.compose.ui.focus.FocusTargetModifierNode r5 = (androidx.compose.p006ui.focus.FocusTargetModifierNode) r5
            androidx.compose.ui.focus.FocusProperties r6 = r5.fetchFocusProperties$ui_release()
            boolean r6 = r6.getCanFocus()
            if (r6 == 0) goto L68
            r10.add(r5)
        L66:
            r5 = r3
            goto Lb8
        L68:
            androidx.compose.ui.focus.FocusProperties r5 = r5.fetchFocusProperties$ui_release()
            kotlin.jvm.functions.Function1 r5 = r5.getEnter()
            androidx.compose.ui.focus.FocusDirection$Companion r6 = androidx.compose.p006ui.focus.FocusDirection.INSTANCE
            int r6 = r6.m8880getEnterdhqQ8s()
            androidx.compose.ui.focus.FocusDirection r6 = androidx.compose.p006ui.focus.FocusDirection.m8868boximpl(r6)
            java.lang.Object r5 = r5.invoke(r6)
            r6 = r5
            androidx.compose.ui.focus.FocusRequester r6 = (androidx.compose.p006ui.focus.FocusRequester) r6
            androidx.compose.ui.focus.FocusRequester$Companion r7 = androidx.compose.p006ui.focus.FocusRequester.INSTANCE
            androidx.compose.ui.focus.FocusRequester r8 = r7.getDefault()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r8)
            if (r6 != 0) goto L8e
            goto L8f
        L8e:
            r5 = 0
        L8f:
            androidx.compose.ui.focus.FocusRequester r5 = (androidx.compose.p006ui.focus.FocusRequester) r5
            if (r5 == 0) goto Lb7
            androidx.compose.ui.focus.FocusRequester r6 = r7.getCancel()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r6 != 0) goto L66
            androidx.compose.runtime.collection.MutableVector r5 = r5.getFocusRequesterNodes$ui_release()
            int r6 = r5.getSize()
            if (r6 <= 0) goto L66
            java.lang.Object[] r5 = r5.getContent()
            r7 = r3
        Lac:
            r8 = r5[r7]
            androidx.compose.ui.focus.FocusRequesterModifierNode r8 = (androidx.compose.p006ui.focus.FocusRequesterModifierNode) r8
            collectAccessibleChildren(r8, r10)
            int r7 = r7 + r2
            if (r7 < r6) goto Lac
            goto L66
        Lb7:
            r5 = r2
        Lb8:
            if (r5 == 0) goto L2f
        Lba:
            androidx.compose.ui.Modifier$Node r4 = r4.getChild()
            goto L49
        Lbf:
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r9)
            goto L2f
        Lc4:
            return
        Lc5:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Check failed."
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.focus.TwoDimensionalFocusSearchKt.collectAccessibleChildren(androidx.compose.ui.node.DelegatableNode, androidx.compose.runtime.collection.MutableVector):void");
    }

    @ExperimentalComposeUiApi
    /* renamed from: findBestCandidate-4WY_MpI, reason: not valid java name */
    private static final FocusTargetModifierNode m8905findBestCandidate4WY_MpI(MutableVector<FocusTargetModifierNode> mutableVector, Rect rect, int i4) {
        Rect rectTranslate;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m8871equalsimpl0(i4, companion.m8883getLeftdhqQ8s())) {
            rectTranslate = rect.translate(rect.getWidth() + 1, 0.0f);
        } else if (FocusDirection.m8871equalsimpl0(i4, companion.m8887getRightdhqQ8s())) {
            rectTranslate = rect.translate(-(rect.getWidth() + 1), 0.0f);
        } else if (FocusDirection.m8871equalsimpl0(i4, companion.m8888getUpdhqQ8s())) {
            rectTranslate = rect.translate(0.0f, rect.getHeight() + 1);
        } else {
            if (!FocusDirection.m8871equalsimpl0(i4, companion.m8879getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            rectTranslate = rect.translate(0.0f, -(rect.getHeight() + 1));
        }
        int size = mutableVector.getSize();
        FocusTargetModifierNode focusTargetModifierNode = null;
        if (size > 0) {
            FocusTargetModifierNode[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = content[i5];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2)) {
                    Rect rectFocusRect = FocusTraversalKt.focusRect(focusTargetModifierNode2);
                    if (m8908isBetterCandidateI7lrPNg(rectFocusRect, rectTranslate, rect, i4)) {
                        focusTargetModifierNode = focusTargetModifierNode2;
                        rectTranslate = rectFocusRect;
                    }
                }
                i5++;
            } while (i5 < size);
        }
        return focusTargetModifierNode;
    }

    @ExperimentalComposeUiApi
    /* renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m8906findChildCorrespondingToFocusEnterOMvw8(FocusTargetModifierNode findChildCorrespondingToFocusEnter, int i4, Function1<? super FocusTargetModifierNode, Boolean> onFound) {
        Rect rectBottomRight;
        Intrinsics.checkNotNullParameter(findChildCorrespondingToFocusEnter, "$this$findChildCorrespondingToFocusEnter");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusRequester focusRequesterInvoke = findChildCorrespondingToFocusEnter.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m8868boximpl(i4));
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        if (Intrinsics.areEqual(focusRequesterInvoke, companion.getDefault())) {
            focusRequesterInvoke = null;
        }
        FocusRequester focusRequester = focusRequesterInvoke;
        if (focusRequester != null) {
            if (Intrinsics.areEqual(focusRequester, companion.getCancel())) {
                return false;
            }
            return focusRequester.findFocusTarget$ui_release(onFound);
        }
        MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
        collectAccessibleChildren(findChildCorrespondingToFocusEnter, mutableVector);
        if (mutableVector.getSize() <= 1) {
            FocusTargetModifierNode focusTargetModifierNode = (FocusTargetModifierNode) (mutableVector.isEmpty() ? null : mutableVector.getContent()[0]);
            if (focusTargetModifierNode != null) {
                return onFound.invoke(focusTargetModifierNode).booleanValue();
            }
            return false;
        }
        FocusDirection.Companion companion2 = FocusDirection.INSTANCE;
        if (FocusDirection.m8871equalsimpl0(i4, companion2.m8880getEnterdhqQ8s())) {
            i4 = companion2.m8887getRightdhqQ8s();
        }
        if (FocusDirection.m8871equalsimpl0(i4, companion2.m8887getRightdhqQ8s()) ? true : FocusDirection.m8871equalsimpl0(i4, companion2.m8879getDowndhqQ8s())) {
            rectBottomRight = topLeft(FocusTraversalKt.focusRect(findChildCorrespondingToFocusEnter));
        } else {
            if (!(FocusDirection.m8871equalsimpl0(i4, companion2.m8883getLeftdhqQ8s()) ? true : FocusDirection.m8871equalsimpl0(i4, companion2.m8888getUpdhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            rectBottomRight = bottomRight(FocusTraversalKt.focusRect(findChildCorrespondingToFocusEnter));
        }
        FocusTargetModifierNode focusTargetModifierNodeM8905findBestCandidate4WY_MpI = m8905findBestCandidate4WY_MpI(mutableVector, rectBottomRight, i4);
        if (focusTargetModifierNodeM8905findBestCandidate4WY_MpI != null) {
            return onFound.invoke(focusTargetModifierNodeM8905findBestCandidate4WY_MpI).booleanValue();
        }
        return false;
    }

    @ExperimentalComposeUiApi
    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m8907generateAndSearchChildren4C6V_qg(final FocusTargetModifierNode focusTargetModifierNode, final FocusTargetModifierNode focusTargetModifierNode2, final int i4, final Function1<? super FocusTargetModifierNode, Boolean> function1) {
        if (m8909searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i4, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m8867searchBeyondBoundsOMvw8(focusTargetModifierNode, i4, new Function1<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope searchBeyondBounds) {
                Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
                Boolean boolValueOf = Boolean.valueOf(TwoDimensionalFocusSearchKt.m8909searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i4, function1));
                if (boolValueOf.booleanValue() || !searchBeyondBounds.getHasMoreContent()) {
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
    private static final boolean m8908isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i4) {
        if (isBetterCandidate_I7lrPNg$isCandidate(rect, i4, rect3)) {
            return !isBetterCandidate_I7lrPNg$isCandidate(rect2, i4, rect3) || m8904beamBeatsI7lrPNg(rect3, rect, rect2, i4) || (!m8904beamBeatsI7lrPNg(rect3, rect2, rect, i4) && isBetterCandidate_I7lrPNg$weightedDistance(i4, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i4, rect3, rect2));
        }
        return false;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i4, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m8871equalsimpl0(i4, companion.m8883getLeftdhqQ8s())) {
            if ((rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m8871equalsimpl0(i4, companion.m8887getRightdhqQ8s())) {
            if ((rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m8871equalsimpl0(i4, companion.m8888getUpdhqQ8s())) {
            if ((rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop()) {
                return true;
            }
        } else {
            if (!FocusDirection.m8871equalsimpl0(i4, companion.m8879getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            if ((rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom()) {
                return true;
            }
        }
        return false;
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i4, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f4;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (!FocusDirection.m8871equalsimpl0(i4, companion.m8883getLeftdhqQ8s())) {
            if (FocusDirection.m8871equalsimpl0(i4, companion.m8887getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m8871equalsimpl0(i4, companion.m8888getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else {
                if (!FocusDirection.m8871equalsimpl0(i4, companion.m8879getDowndhqQ8s())) {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f4 = top - bottom;
            return Math.max(0.0f, f4);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f4 = top2 - bottom2;
        return Math.max(0.0f, f4);
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i4, Rect rect2) {
        float f4;
        float left;
        float left2;
        float width;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m8871equalsimpl0(i4, companion.m8883getLeftdhqQ8s()) ? true : FocusDirection.m8871equalsimpl0(i4, companion.m8887getRightdhqQ8s())) {
            f4 = 2;
            left = rect2.getTop() + (rect2.getHeight() / f4);
            left2 = rect.getTop();
            width = rect.getHeight();
        } else {
            if (!(FocusDirection.m8871equalsimpl0(i4, companion.m8888getUpdhqQ8s()) ? true : FocusDirection.m8871equalsimpl0(i4, companion.m8879getDowndhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f4 = 2;
            left = rect2.getLeft() + (rect2.getWidth() / f4);
            left2 = rect.getLeft();
            width = rect.getWidth();
        }
        return left - (left2 + (width / f4));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i4, Rect rect, Rect rect2) {
        long jAbs = (long) Math.abs(isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i4, rect));
        long jAbs2 = (long) Math.abs(isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i4, rect));
        return (13 * jAbs * jAbs) + (jAbs2 * jAbs2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalComposeUiApi
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m8909searchChildren4C6V_qg(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i4, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        FocusTargetModifierNode focusTargetModifierNodeM8905findBestCandidate4WY_MpI;
        MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
        int iM10773constructorimpl = NodeKind.m10773constructorimpl(1024);
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetModifierNode.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & iM10773constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & iM10773constructorimpl) == 0) {
                        child2 = child2.getChild();
                    } else if (child2 instanceof FocusTargetModifierNode) {
                        mutableVector.add((FocusTargetModifierNode) child2);
                    }
                }
            }
        }
        while (mutableVector.isNotEmpty() && (focusTargetModifierNodeM8905findBestCandidate4WY_MpI = m8905findBestCandidate4WY_MpI(mutableVector, FocusTraversalKt.focusRect(focusTargetModifierNode2), i4)) != null) {
            if (focusTargetModifierNodeM8905findBestCandidate4WY_MpI.fetchFocusProperties$ui_release().getCanFocus()) {
                return function1.invoke(focusTargetModifierNodeM8905findBestCandidate4WY_MpI).booleanValue();
            }
            FocusRequester focusRequesterInvoke = focusTargetModifierNodeM8905findBestCandidate4WY_MpI.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m8868boximpl(i4));
            FocusRequester.Companion companion = FocusRequester.INSTANCE;
            if (Intrinsics.areEqual(focusRequesterInvoke, companion.getDefault())) {
                focusRequesterInvoke = null;
            }
            FocusRequester focusRequester = focusRequesterInvoke;
            if (focusRequester != null) {
                if (Intrinsics.areEqual(focusRequester, companion.getCancel())) {
                    return false;
                }
                return focusRequester.findFocusTarget$ui_release(function1);
            }
            if (m8907generateAndSearchChildren4C6V_qg(focusTargetModifierNodeM8905findBestCandidate4WY_MpI, focusTargetModifierNode2, i4, function1)) {
                return true;
            }
            mutableVector.remove(focusTargetModifierNodeM8905findBestCandidate4WY_MpI);
        }
        return false;
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    @ExperimentalComposeUiApi
    /* renamed from: twoDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final Boolean m8910twoDimensionalFocusSearchOMvw8(FocusTargetModifierNode twoDimensionalFocusSearch, int i4, Function1<? super FocusTargetModifierNode, Boolean> onFound) {
        Intrinsics.checkNotNullParameter(twoDimensionalFocusSearch, "$this$twoDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusStateImpl focusStateImpl = twoDimensionalFocusSearch.getFocusStateImpl();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i5 = iArr[focusStateImpl.ordinal()];
        if (i5 != 1) {
            if (i5 == 2 || i5 == 3) {
                return Boolean.valueOf(m8906findChildCorrespondingToFocusEnterOMvw8(twoDimensionalFocusSearch, i4, onFound));
            }
            if (i5 == 4) {
                return twoDimensionalFocusSearch.fetchFocusProperties$ui_release().getCanFocus() ? onFound.invoke(twoDimensionalFocusSearch) : Boolean.FALSE;
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(twoDimensionalFocusSearch);
        if (activeChild == null) {
            throw new IllegalStateException(NoActiveChild.toString());
        }
        int i6 = iArr[activeChild.getFocusStateImpl().ordinal()];
        if (i6 != 1) {
            if (i6 == 2 || i6 == 3) {
                return Boolean.valueOf(m8907generateAndSearchChildren4C6V_qg(twoDimensionalFocusSearch, activeChild, i4, onFound));
            }
            if (i6 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException(NoActiveChild.toString());
        }
        Boolean boolM8910twoDimensionalFocusSearchOMvw8 = m8910twoDimensionalFocusSearchOMvw8(activeChild, i4, onFound);
        if (!Intrinsics.areEqual(boolM8910twoDimensionalFocusSearchOMvw8, Boolean.FALSE)) {
            return boolM8910twoDimensionalFocusSearchOMvw8;
        }
        FocusRequester focusRequesterInvoke = activeChild.fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m8868boximpl(i4));
        FocusRequester.Companion companion = FocusRequester.INSTANCE;
        if (Intrinsics.areEqual(focusRequesterInvoke, companion.getDefault())) {
            focusRequesterInvoke = null;
        }
        FocusRequester focusRequester = focusRequesterInvoke;
        if (focusRequester == null) {
            return Boolean.valueOf(m8907generateAndSearchChildren4C6V_qg(twoDimensionalFocusSearch, activeNode(activeChild), i4, onFound));
        }
        if (Intrinsics.areEqual(focusRequester, companion.getCancel())) {
            return null;
        }
        return Boolean.valueOf(focusRequester.findFocusTarget$ui_release(onFound));
    }
}
