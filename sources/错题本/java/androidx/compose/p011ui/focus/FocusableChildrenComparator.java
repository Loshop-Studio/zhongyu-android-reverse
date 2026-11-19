package androidx.compose.p011ui.focus;

import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\r"}, m5110d2 = {"Landroidx/compose/ui/focus/FocusableChildrenComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "pathFromRoot", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,280:1\n44#2:281\n472#2:282\n472#2:283\n1101#3:284\n1083#3,2:285\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n*L\n259#1:281\n263#1:282\n264#1:283\n271#1:284\n271#1:285,2\n*E\n"})
/* loaded from: classes.dex */
final class FocusableChildrenComparator implements Comparator<FocusTargetNode> {

    @NotNull
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
    public int compare(@NotNull FocusTargetNode a9, @NotNull FocusTargetNode b6) {
        int i = 0;
        if (!FocusTraversalKt.isEligibleForFocusSearch(a9) || !FocusTraversalKt.isEligibleForFocusSearch(b6)) {
            if (FocusTraversalKt.isEligibleForFocusSearch(a9)) {
                return -1;
            }
            return FocusTraversalKt.isEligibleForFocusSearch(b6) ? 1 : 0;
        }
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(a9);
        LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(b6);
        if (AbstractC5830k.m5325b(layoutNodeRequireLayoutNode, layoutNodeRequireLayoutNode2)) {
            return 0;
        }
        MutableVector<LayoutNode> mutableVectorPathFromRoot = pathFromRoot(layoutNodeRequireLayoutNode);
        MutableVector<LayoutNode> mutableVectorPathFromRoot2 = pathFromRoot(layoutNodeRequireLayoutNode2);
        int iMin = Math.min(mutableVectorPathFromRoot.getSize() - 1, mutableVectorPathFromRoot2.getSize() - 1);
        if (iMin >= 0) {
            while (AbstractC5830k.m5325b(mutableVectorPathFromRoot.content[i], mutableVectorPathFromRoot2.content[i])) {
                if (i != iMin) {
                    i++;
                }
            }
            return AbstractC5830k.m5332i(mutableVectorPathFromRoot.content[i].getPlaceOrder$ui_release(), mutableVectorPathFromRoot2.content[i].getPlaceOrder$ui_release());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
