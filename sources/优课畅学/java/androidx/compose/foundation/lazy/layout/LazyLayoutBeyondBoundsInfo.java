package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsInfo {
    public static final int $stable = MutableVector.$stable;
    private final MutableVector<Interval> beyondBoundsItems = new MutableVector<>(new Interval[16], 0);

    @StabilityInferred(parameters = 1)
    public static final class Interval {
        public static final int $stable = 0;
        private final int end;
        private final int start;

        public Interval(int i10, int i11) {
            this.start = i10;
            this.end = i11;
            if (!(i10 >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("negative start index");
            }
            if (i11 >= i10) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("end index greater than start");
        }

        public static /* synthetic */ Interval copy$default(Interval interval, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = interval.start;
            }
            if ((i12 & 2) != 0) {
                i11 = interval.end;
            }
            return interval.copy(i10, i11);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final Interval copy(int i10, int i11) {
            return new Interval(i10, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.start == interval.start && this.end == interval.end;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end);
        }

        public String toString() {
            return "Interval(start=" + this.start + ", end=" + this.end + ')';
        }
    }

    public final Interval addInterval(int i10, int i11) {
        Interval interval = new Interval(i10, i11);
        this.beyondBoundsItems.add(interval);
        return interval;
    }

    public final int getEnd() {
        int end = this.beyondBoundsItems.first().getEnd();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        Interval[] intervalArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Interval interval = intervalArr[i10];
            if (interval.getEnd() > end) {
                end = interval.getEnd();
            }
        }
        return end;
    }

    public final int getStart() {
        int start = this.beyondBoundsItems.first().getStart();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        Interval[] intervalArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Interval interval = intervalArr[i10];
            if (interval.getStart() < start) {
                start = interval.getStart();
            }
        }
        if (!(start >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative minIndex");
        }
        return start;
    }

    public final boolean hasIntervals() {
        return this.beyondBoundsItems.getSize() != 0;
    }

    public final void removeInterval(Interval interval) {
        this.beyondBoundsItems.remove(interval);
    }
}
