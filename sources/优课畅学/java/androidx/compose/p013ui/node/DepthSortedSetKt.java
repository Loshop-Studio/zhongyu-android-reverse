package androidx.compose.p013ui.node;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class DepthSortedSetKt {
    private static final Comparator<LayoutNode> DepthComparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSetKt$DepthComparator$1
        @Override // java.util.Comparator
        public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
            int iM16135i = AbstractC9133u.m16135i(layoutNode.getDepth$ui_release(), layoutNode2.getDepth$ui_release());
            return iM16135i != 0 ? iM16135i : AbstractC9133u.m16135i(layoutNode.hashCode(), layoutNode2.hashCode());
        }
    };
}
