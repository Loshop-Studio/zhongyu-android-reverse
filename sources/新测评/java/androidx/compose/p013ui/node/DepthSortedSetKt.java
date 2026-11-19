package androidx.compose.p013ui.node;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\"\u001e\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004"}, m13558d2 = {"DepthComparator", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class DepthSortedSetKt {
    private static final Comparator<LayoutNode> DepthComparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSetKt$DepthComparator$1
        @Override // java.util.Comparator
        public int compare(LayoutNode a10, LayoutNode b10) {
            int iCompare = Intrinsics.compare(a10.getDepth(), b10.getDepth());
            return iCompare != 0 ? iCompare : Intrinsics.compare(a10.hashCode(), b10.hashCode());
        }
    };
}
