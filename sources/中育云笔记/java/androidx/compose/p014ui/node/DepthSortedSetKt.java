package androidx.compose.p014ui.node;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class DepthSortedSetKt {
    private static final Comparator<LayoutNode> DepthComparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSetKt$DepthComparator$1
        @Override // java.util.Comparator
        public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
            int iM20296i = AbstractC9979u.m20296i(layoutNode.getDepth$ui_release(), layoutNode2.getDepth$ui_release());
            return iM20296i != 0 ? iM20296i : AbstractC9979u.m20296i(layoutNode.hashCode(), layoutNode2.hashCode());
        }
    };
}
