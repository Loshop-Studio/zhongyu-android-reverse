package androidx.compose.p006ui.focus;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.focus.FocusDirection;
import androidx.compose.p006ui.layout.BeyondBoundsLayout;
import androidx.compose.p006ui.node.DelegatableNodeKt;
import androidx.compose.p006ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Metadata(m5174d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a \u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003\u001aE\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\f\u001a\u0002H\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\t0\u0007H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\u000e\u001aE\u0010\u000f\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\f\u001a\u0002H\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\t0\u0007H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\u000e\u001a \u0010\u0010\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003\u001a=\u0010\u0011\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0004*\u00020\u0005H\u0002\u001a5\u0010\u0018\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a \u0010\u001b\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003\u001a \u0010\u001c\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003\u001a=\u0010\u001d\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0007H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, m5175d2 = {"InvalidFocusDirection", "", "NoActiveChild", "backwardFocusSearch", "", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "onFound", "Lkotlin/Function1;", "forEachItemAfter", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/collection/MutableVector;", "item", "action", "(Landroidx/compose/runtime/collection/MutableVector;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "forEachItemBefore", "forwardFocusSearch", "generateAndSearchChildren", "focusedItem", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "isRoot", "oneDimensionalFocusSearch", "oneDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkotlin/jvm/functions/Function1;)Z", "pickChildForBackwardSearch", "pickChildForForwardSearch", "searchChildren", "searchChildren-4C6V_qg", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,274:1\n188#1,3:307\n191#1,2:311\n194#1,5:314\n203#1,3:319\n206#1,2:323\n209#1,5:326\n1161#2,2:275\n1182#2:281\n1161#2,2:282\n1161#2,2:331\n1182#2:337\n1161#2,2:338\n1161#2,2:374\n1182#2:380\n1161#2,2:381\n87#3:277\n87#3:333\n87#3:376\n87#3:417\n340#4:278\n206#4,2:279\n208#4,7:284\n215#4,15:292\n340#4:334\n206#4,2:335\n208#4,7:340\n215#4,15:348\n340#4:377\n206#4,2:378\n208#4,7:383\n215#4,15:391\n324#4:418\n48#5:291\n53#5:310\n523#5:313\n53#5:322\n523#5:325\n48#5:347\n204#5,11:363\n48#5:390\n492#5,11:406\n53#5:419\n523#5:420\n523#5:421\n53#5:422\n523#5:423\n523#5:424\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n*L\n137#1:307,3\n137#1:311,2\n137#1:314,5\n140#1:319,3\n140#1:323,2\n140#1:326,5\n132#1:275,2\n133#1:281\n133#1:282,2\n159#1:331,2\n160#1:337\n160#1:338,2\n170#1:374,2\n171#1:380\n171#1:381,2\n133#1:277\n160#1:333\n171#1:376\n183#1:417\n133#1:278\n133#1:279,2\n133#1:284,7\n133#1:292,15\n160#1:334\n160#1:335,2\n160#1:340,7\n160#1:348,15\n171#1:377\n171#1:378,2\n171#1:383,7\n171#1:391,15\n183#1:418\n133#1:291\n137#1:310\n137#1:313\n140#1:322\n140#1:325\n160#1:347\n163#1:363,11\n171#1:390\n174#1:406,11\n190#1:419\n192#1:420\n194#1:421\n205#1:422\n207#1:423\n209#1:424\n*E\n"})
/* loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";
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
    private static final boolean backwardFocusSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        FocusStateImpl focusStateImpl = focusTargetModifierNode.getFocusStateImpl();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i4 = iArr[focusStateImpl.ordinal()];
        if (i4 == 1) {
            FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
            if (activeChild == null) {
                throw new IllegalStateException(NoActiveChild.toString());
            }
            int i5 = iArr[activeChild.getFocusStateImpl().ordinal()];
            if (i5 != 1) {
                if (i5 == 2 || i5 == 3) {
                    return m8900generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, FocusDirection.INSTANCE.m8886getPreviousdhqQ8s(), function1);
                }
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(NoActiveChild.toString());
            }
            if (!backwardFocusSearch(activeChild, function1) && !m8900generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, FocusDirection.INSTANCE.m8886getPreviousdhqQ8s(), function1) && (!focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus() || !function1.invoke(activeChild).booleanValue())) {
                return false;
            }
        } else {
            if (i4 == 2 || i4 == 3) {
                return pickChildForBackwardSearch(focusTargetModifierNode, function1);
            }
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!pickChildForBackwardSearch(focusTargetModifierNode, function1)) {
                if (!(focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus() ? function1.invoke(focusTargetModifierNode).booleanValue() : false)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final <T> void forEachItemAfter(MutableVector<T> mutableVector, T t3, Function1<? super T, Unit> function1) {
        boolean z3 = false;
        IntRange intRange = new IntRange(0, mutableVector.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            if (z3) {
                function1.invoke(mutableVector.getContent()[first]);
            }
            if (Intrinsics.areEqual(mutableVector.getContent()[first], t3)) {
                z3 = true;
            }
            if (first == last) {
                return;
            } else {
                first++;
            }
        }
    }

    private static final <T> void forEachItemBefore(MutableVector<T> mutableVector, T t3, Function1<? super T, Unit> function1) {
        boolean z3 = false;
        IntRange intRange = new IntRange(0, mutableVector.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            if (z3) {
                function1.invoke(mutableVector.getContent()[last]);
            }
            if (Intrinsics.areEqual(mutableVector.getContent()[last], t3)) {
                z3 = true;
            }
            if (last == first) {
                return;
            } else {
                last--;
            }
        }
    }

    @ExperimentalComposeUiApi
    private static final boolean forwardFocusSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        int i4 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i4 == 1) {
            FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
            if (activeChild != null) {
                return forwardFocusSearch(activeChild, function1) || m8900generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, FocusDirection.INSTANCE.m8884getNextdhqQ8s(), function1);
            }
            throw new IllegalStateException(NoActiveChild.toString());
        }
        if (i4 == 2 || i4 == 3) {
            return pickChildForForwardSearch(focusTargetModifierNode, function1);
        }
        if (i4 == 4) {
            return focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus() ? function1.invoke(focusTargetModifierNode).booleanValue() : pickChildForForwardSearch(focusTargetModifierNode, function1);
        }
        throw new NoWhenBranchMatchedException();
    }

    @ExperimentalComposeUiApi
    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m8900generateAndSearchChildren4C6V_qg(final FocusTargetModifierNode focusTargetModifierNode, final FocusTargetModifierNode focusTargetModifierNode2, final int i4, final Function1<? super FocusTargetModifierNode, Boolean> function1) {
        if (m8902searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i4, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m8867searchBeyondBoundsOMvw8(focusTargetModifierNode, i4, new Function1<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope searchBeyondBounds) {
                Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
                Boolean boolValueOf = Boolean.valueOf(OneDimensionalFocusSearchKt.m8902searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i4, function1));
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

    private static final boolean isRoot(FocusTargetModifierNode focusTargetModifierNode) {
        Modifier.Node nodeNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode, NodeKind.m10773constructorimpl(1024));
        if (!(nodeNearestAncestor instanceof FocusTargetModifierNode)) {
            nodeNearestAncestor = null;
        }
        return ((FocusTargetModifierNode) nodeNearestAncestor) == null;
    }

    @ExperimentalComposeUiApi
    /* renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m8901oneDimensionalFocusSearchOMvw8(FocusTargetModifierNode oneDimensionalFocusSearch, int i4, Function1<? super FocusTargetModifierNode, Boolean> onFound) {
        Intrinsics.checkNotNullParameter(oneDimensionalFocusSearch, "$this$oneDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m8871equalsimpl0(i4, companion.m8884getNextdhqQ8s())) {
            return forwardFocusSearch(oneDimensionalFocusSearch, onFound);
        }
        if (FocusDirection.m8871equalsimpl0(i4, companion.m8886getPreviousdhqQ8s())) {
            return backwardFocusSearch(oneDimensionalFocusSearch, onFound);
        }
        throw new IllegalStateException(InvalidFocusDirection.toString());
    }

    @ExperimentalComposeUiApi
    private static final boolean pickChildForBackwardSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
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
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize();
        if (size > 0) {
            int i4 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) content[i4];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2) && backwardFocusSearch(focusTargetModifierNode2, function1)) {
                    return true;
                }
                i4--;
            } while (i4 >= 0);
        }
        return false;
    }

    @ExperimentalComposeUiApi
    private static final boolean pickChildForForwardSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
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
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        Object[] content = mutableVector.getContent();
        int i4 = 0;
        do {
            FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) content[i4];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2) && forwardFocusSearch(focusTargetModifierNode2, function1)) {
                return true;
            }
            i4++;
        } while (i4 < size);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalComposeUiApi
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m8902searchChildren4C6V_qg(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i4, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        if (!(focusTargetModifierNode.getFocusStateImpl() == FocusStateImpl.ActiveParent)) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
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
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m8871equalsimpl0(i4, companion.m8884getNextdhqQ8s())) {
            IntRange intRange = new IntRange(0, mutableVector.getSize() - 1);
            int first = intRange.getFirst();
            int last = intRange.getLast();
            if (first <= last) {
                boolean z3 = false;
                while (true) {
                    if (z3) {
                        FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) mutableVector.getContent()[first];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode3) && forwardFocusSearch(focusTargetModifierNode3, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.areEqual(mutableVector.getContent()[first], focusTargetModifierNode2)) {
                        z3 = true;
                    }
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
        } else {
            if (!FocusDirection.m8871equalsimpl0(i4, companion.m8886getPreviousdhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            IntRange intRange2 = new IntRange(0, mutableVector.getSize() - 1);
            int first2 = intRange2.getFirst();
            int last2 = intRange2.getLast();
            if (first2 <= last2) {
                boolean z4 = false;
                while (true) {
                    if (z4) {
                        FocusTargetModifierNode focusTargetModifierNode4 = (FocusTargetModifierNode) mutableVector.getContent()[last2];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode4) && backwardFocusSearch(focusTargetModifierNode4, function1)) {
                            return true;
                        }
                    }
                    if (Intrinsics.areEqual(mutableVector.getContent()[last2], focusTargetModifierNode2)) {
                        z4 = true;
                    }
                    if (last2 == first2) {
                        break;
                    }
                    last2--;
                }
            }
        }
        if (FocusDirection.m8871equalsimpl0(i4, FocusDirection.INSTANCE.m8884getNextdhqQ8s()) || !focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus() || isRoot(focusTargetModifierNode)) {
            return false;
        }
        return function1.invoke(focusTargetModifierNode).booleanValue();
    }
}
