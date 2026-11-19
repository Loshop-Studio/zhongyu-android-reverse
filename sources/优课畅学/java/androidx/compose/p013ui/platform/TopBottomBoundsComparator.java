package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.semantics.SemanticsNode;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes2.dex */
final class TopBottomBoundsComparator implements Comparator<Pair<? extends Rect, ? extends List<SemanticsNode>>> {
    public static final TopBottomBoundsComparator INSTANCE = new TopBottomBoundsComparator();

    private TopBottomBoundsComparator() {
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Pair<? extends Rect, ? extends List<SemanticsNode>> pair, Pair<? extends Rect, ? extends List<SemanticsNode>> pair2) {
        return compare2((Pair<Rect, ? extends List<SemanticsNode>>) pair, (Pair<Rect, ? extends List<SemanticsNode>>) pair2);
    }

    /* renamed from: compare, reason: avoid collision after fix types in other method */
    public int compare2(Pair<Rect, ? extends List<SemanticsNode>> pair, Pair<Rect, ? extends List<SemanticsNode>> pair2) {
        int iCompare = Float.compare(((Rect) pair.m15906e()).getTop(), ((Rect) pair2.m15906e()).getTop());
        return iCompare != 0 ? iCompare : Float.compare(((Rect) pair.m15906e()).getBottom(), ((Rect) pair2.m15906e()).getBottom());
    }
}
