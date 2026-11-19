package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyStaggeredGridSpanProvider {
    public static final int $stable = 8;
    private final IntervalList<LazyStaggeredGridInterval> intervals;

    public LazyStaggeredGridSpanProvider(IntervalList<LazyStaggeredGridInterval> intervalList) {
        this.intervals = intervalList;
    }

    public final IntervalList<LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }

    public final boolean isFullSpan(int i10) {
        if (i10 >= 0 && i10 < this.intervals.getSize()) {
            IntervalList.Interval<LazyStaggeredGridInterval> interval = this.intervals.get(i10);
            InterfaceC10570l span = interval.getValue().getSpan();
            int startIndex = i10 - interval.getStartIndex();
            if (span != null && span.invoke(Integer.valueOf(startIndex)) == StaggeredGridItemSpan.Companion.getFullLine()) {
                return true;
            }
        }
        return false;
    }
}
