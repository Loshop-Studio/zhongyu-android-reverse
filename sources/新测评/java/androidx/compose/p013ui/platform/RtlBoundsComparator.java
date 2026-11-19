package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.semantics.SemanticsNode;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, m13558d2 = {"Landroidx/compose/ui/platform/RtlBoundsComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
final class RtlBoundsComparator implements Comparator<SemanticsNode> {
    public static final RtlBoundsComparator INSTANCE = new RtlBoundsComparator();

    private RtlBoundsComparator() {
    }

    @Override // java.util.Comparator
    public int compare(SemanticsNode a10, SemanticsNode b10) {
        Rect boundsInWindow = a10.getBoundsInWindow();
        Rect boundsInWindow2 = b10.getBoundsInWindow();
        int iCompare = Float.compare(boundsInWindow2.getRight(), boundsInWindow.getRight());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
        return iCompare3 != 0 ? iCompare3 : Float.compare(boundsInWindow2.getLeft(), boundsInWindow.getLeft());
    }
}
