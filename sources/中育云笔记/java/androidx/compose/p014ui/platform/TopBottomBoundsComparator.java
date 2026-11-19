package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.semantics.SemanticsNode;
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
        int iCompare = Float.compare(((Rect) pair.m20051f()).getTop(), ((Rect) pair2.m20051f()).getTop());
        return iCompare != 0 ? iCompare : Float.compare(((Rect) pair.m20051f()).getBottom(), ((Rect) pair2.m20051f()).getBottom());
    }
}
