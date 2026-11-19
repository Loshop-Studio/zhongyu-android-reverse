package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p325rc.AbstractC10968r;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyGridScrollPosition {
    public static final int $stable = 8;
    private boolean hadFirstNotEmptyLayout;
    private final MutableIntState index$delegate;
    private Object lastKnownFirstItemKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableIntState scrollOffset$delegate;

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyGridScrollPosition() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    private final void setIndex(int i10) {
        this.index$delegate.setIntValue(i10);
    }

    private final void setScrollOffset(int i10) {
        this.scrollOffset$delegate.setIntValue(i10);
    }

    private final void update(int i10, int i11) {
        if (!(((float) i10) >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Index should be non-negative");
        }
        setIndex(i10);
        this.nearestRangeState.update(i10);
        setScrollOffset(i11);
    }

    public final int getIndex() {
        return this.index$delegate.getIntValue();
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    public final void requestPositionAndForgetLastKnownKey(int i10, int i11) {
        update(i10, i11);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateFromMeasureResult(LazyGridMeasureResult lazyGridMeasureResult) {
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        LazyGridMeasuredItem[] items2;
        LazyGridMeasuredItem lazyGridMeasuredItem2;
        LazyGridMeasuredLine firstVisibleLine = lazyGridMeasureResult.getFirstVisibleLine();
        this.lastKnownFirstItemKey = (firstVisibleLine == null || (items2 = firstVisibleLine.getItems()) == null || (lazyGridMeasuredItem2 = (LazyGridMeasuredItem) AbstractC10968r.m24106u0(items2)) == null) ? null : lazyGridMeasuredItem2.getKey();
        if (this.hadFirstNotEmptyLayout || lazyGridMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleLineScrollOffset = lazyGridMeasureResult.getFirstVisibleLineScrollOffset();
            int index = 0;
            if (!(((float) firstVisibleLineScrollOffset) >= 0.0f)) {
                InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative (" + firstVisibleLineScrollOffset + ')');
            }
            LazyGridMeasuredLine firstVisibleLine2 = lazyGridMeasureResult.getFirstVisibleLine();
            if (firstVisibleLine2 != null && (items = firstVisibleLine2.getItems()) != null && (lazyGridMeasuredItem = (LazyGridMeasuredItem) AbstractC10968r.m24106u0(items)) != null) {
                index = lazyGridMeasuredItem.getIndex();
            }
            update(index, firstVisibleLineScrollOffset);
        }
    }

    public final void updateScrollOffset(int i10) {
        if (!(((float) i10) >= 0.0f)) {
            InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative");
        }
        setScrollOffset(i10);
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved(LazyGridItemProvider lazyGridItemProvider, int i10) {
        int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyGridItemProvider, this.lastKnownFirstItemKey, i10);
        if (i10 != iFindIndexByKey) {
            setIndex(iFindIndexByKey);
            this.nearestRangeState.update(i10);
        }
        return iFindIndexByKey;
    }

    public LazyGridScrollPosition(int i10, int i11) {
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(i10);
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(i11);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i10, 90, 200);
    }

    public /* synthetic */ LazyGridScrollPosition(int i10, int i11, int i12, AbstractC9972n abstractC9972n) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
