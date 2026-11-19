package androidx.compose.p006ui.focus;

import androidx.compose.p006ui.node.LayoutNode;
import androidx.compose.p006ui.node.NodeCoordinator;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\r"}, m5175d2 = {"Landroidx/compose/ui/focus/FocusableChildrenComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Lkotlin/Comparator;", "()V", "compare", "", "focusTarget1", "focusTarget2", "pathFromRoot", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,274:1\n48#2:275\n523#2:276\n523#2:277\n1182#3:278\n1161#3,2:279\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n*L\n253#1:275\n257#1:276\n258#1:277\n265#1:278\n265#1:279,2\n*E\n"})
/* loaded from: classes.dex */
final class FocusableChildrenComparator implements Comparator<FocusTargetModifierNode> {
    public static final FocusableChildrenComparator INSTANCE = new FocusableChildrenComparator();

    private FocusableChildrenComparator() {
    }

    private final MutableVector<LayoutNode> pathFromRoot(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = new MutableVector<>(new LayoutNode[16], 0);
        while (layoutNode != null) {
            mutableVector.add(0, layoutNode);
            layoutNode = layoutNode.getParent$ui_release();
        }
        return mutableVector;
    }

    @Override // java.util.Comparator
    public int compare(FocusTargetModifierNode focusTarget1, FocusTargetModifierNode focusTarget2) {
        if (focusTarget1 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (focusTarget2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        int i4 = 0;
        if (!FocusTraversalKt.isEligibleForFocusSearch(focusTarget1) || !FocusTraversalKt.isEligibleForFocusSearch(focusTarget2)) {
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTarget1)) {
                return -1;
            }
            return FocusTraversalKt.isEligibleForFocusSearch(focusTarget2) ? 1 : 0;
        }
        NodeCoordinator coordinator = focusTarget1.getCoordinator();
        LayoutNode layoutNode = coordinator != null ? coordinator.getLayoutNode() : null;
        if (layoutNode == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        NodeCoordinator coordinator2 = focusTarget2.getCoordinator();
        LayoutNode layoutNode2 = coordinator2 != null ? coordinator2.getLayoutNode() : null;
        if (layoutNode2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        if (Intrinsics.areEqual(layoutNode, layoutNode2)) {
            return 0;
        }
        MutableVector<LayoutNode> mutableVectorPathFromRoot = pathFromRoot(layoutNode);
        MutableVector<LayoutNode> mutableVectorPathFromRoot2 = pathFromRoot(layoutNode2);
        int iMin = Math.min(mutableVectorPathFromRoot.getSize() - 1, mutableVectorPathFromRoot2.getSize() - 1);
        if (iMin >= 0) {
            while (Intrinsics.areEqual(mutableVectorPathFromRoot.getContent()[i4], mutableVectorPathFromRoot2.getContent()[i4])) {
                if (i4 != iMin) {
                    i4++;
                }
            }
            return Intrinsics.compare(mutableVectorPathFromRoot.getContent()[i4].getPlaceOrder(), mutableVectorPathFromRoot2.getContent()[i4].getPlaceOrder());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
    }
}
