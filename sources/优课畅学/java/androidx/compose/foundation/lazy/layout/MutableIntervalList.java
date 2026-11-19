package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MutableIntervalList<T> implements IntervalList<T> {
    public static final int $stable = 8;
    private final MutableVector<IntervalList.Interval<T>> intervals = new MutableVector<>(new IntervalList.Interval[16], 0);
    private IntervalList.Interval<? extends T> lastInterval;
    private int size;

    private final void checkIndexBounds(int i10) {
        if (i10 < 0 || i10 >= getSize()) {
            InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + i10 + ", size " + getSize());
        }
    }

    private final boolean contains(IntervalList.Interval<? extends T> interval, int i10) {
        return i10 < interval.getStartIndex() + interval.getSize() && interval.getStartIndex() <= i10;
    }

    private final IntervalList.Interval<T> getIntervalForIndex(int i10) {
        IntervalList.Interval<? extends T> interval = this.lastInterval;
        if (interval != null && contains(interval, i10)) {
            return interval;
        }
        MutableVector<IntervalList.Interval<T>> mutableVector = this.intervals;
        IntervalList.Interval interval2 = (IntervalList.Interval<? extends T>) mutableVector.content[IntervalListKt.binarySearch(mutableVector, i10)];
        this.lastInterval = interval2;
        return interval2;
    }

    public final void addInterval(int i10, T t10) {
        if (!(i10 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("size should be >=0");
        }
        if (i10 == 0) {
            return;
        }
        IntervalList.Interval<T> interval = new IntervalList.Interval<>(getSize(), i10, t10);
        this.size = getSize() + i10;
        this.intervals.add(interval);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public void forEach(int i10, int i11, InterfaceC10570l interfaceC10570l) {
        if (i10 < 0 || i10 >= getSize()) {
            InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + i10 + ", size " + getSize());
        }
        if (i11 < 0 || i11 >= getSize()) {
            InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + i11 + ", size " + getSize());
        }
        if (!(i11 >= i10)) {
            InlineClassHelperKt.throwIllegalArgumentException("toIndex (" + i11 + ") should be not smaller than fromIndex (" + i10 + ')');
        }
        int iBinarySearch = IntervalListKt.binarySearch(this.intervals, i10);
        int startIndex = this.intervals.content[iBinarySearch].getStartIndex();
        while (startIndex <= i11) {
            IntervalList.Interval<T> interval = this.intervals.content[iBinarySearch];
            interfaceC10570l.invoke(interval);
            startIndex += interval.getSize();
            iBinarySearch++;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public IntervalList.Interval<T> get(int i10) {
        if (i10 < 0 || i10 >= getSize()) {
            InlineClassHelperKt.throwIndexOutOfBoundsException("Index " + i10 + ", size " + getSize());
        }
        return getIntervalForIndex(i10);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.size;
    }
}
