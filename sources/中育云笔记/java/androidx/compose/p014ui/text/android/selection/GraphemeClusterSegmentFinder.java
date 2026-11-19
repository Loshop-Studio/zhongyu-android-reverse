package androidx.compose.p014ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class GraphemeClusterSegmentFinder implements SegmentFinder {
    public static final int $stable = 0;

    public abstract int next(int i10);

    @Override // androidx.compose.p014ui.text.android.selection.SegmentFinder
    public int nextEndBoundary(int i10) {
        return next(i10);
    }

    @Override // androidx.compose.p014ui.text.android.selection.SegmentFinder
    public int nextStartBoundary(int i10) {
        int next = next(i10);
        if (next == -1 || next(next) == -1) {
            return -1;
        }
        return next;
    }

    public abstract int previous(int i10);

    @Override // androidx.compose.p014ui.text.android.selection.SegmentFinder
    public int previousEndBoundary(int i10) {
        int iPrevious = previous(i10);
        if (iPrevious == -1 || previous(iPrevious) == -1) {
            return -1;
        }
        return iPrevious;
    }

    @Override // androidx.compose.p014ui.text.android.selection.SegmentFinder
    public int previousStartBoundary(int i10) {
        return previous(i10);
    }
}
