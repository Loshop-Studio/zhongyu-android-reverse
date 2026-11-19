package androidx.compose.p006ui.node;

import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0007H\u0002¨\u0006\b"}, m5175d2 = {"updateChildMeasurables", "", "Landroidx/compose/ui/node/LayoutNode;", "destination", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/layout/Measurable;", "transform", "Lkotlin/Function1;", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1237:1\n165#2:1238\n476#3,11:1239\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n*L\n1161#1:1238\n1161#1:1239,11\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegateKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateChildMeasurables(LayoutNode layoutNode, MutableVector<Measurable> mutableVector, Function1<? super LayoutNode, ? extends Measurable> function1) {
        MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector2.getContent();
            int i4 = 0;
            do {
                LayoutNode layoutNode2 = content[i4];
                if (mutableVector.getSize() <= i4) {
                    mutableVector.add(function1.invoke(layoutNode2));
                } else {
                    mutableVector.set(i4, function1.invoke(layoutNode2));
                }
                i4++;
            } while (i4 < size);
        }
        mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
    }
}
