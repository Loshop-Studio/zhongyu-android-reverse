package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyListScrollPosition {
    public static final int $stable = 8;
    private boolean hadFirstNotEmptyLayout;
    private final MutableIntState index$delegate;
    private Object lastKnownFirstItemKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableIntState scrollOffset$delegate;

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyListScrollPosition() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    private final void setScrollOffset(int i10) {
        this.scrollOffset$delegate.setIntValue(i10);
    }

    private final void update(int i10, int i11) {
        if (!(((float) i10) >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Index should be non-negative (" + i10 + ')');
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

    public final void setIndex(int i10) {
        this.index$delegate.setIntValue(i10);
    }

    public final void updateFromMeasureResult(LazyListMeasureResult lazyListMeasureResult) {
        LazyListMeasuredItem firstVisibleItem = lazyListMeasureResult.getFirstVisibleItem();
        this.lastKnownFirstItemKey = firstVisibleItem != null ? firstVisibleItem.getKey() : null;
        if (this.hadFirstNotEmptyLayout || lazyListMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleItemScrollOffset = lazyListMeasureResult.getFirstVisibleItemScrollOffset();
            if (!(((float) firstVisibleItemScrollOffset) >= 0.0f)) {
                InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative");
            }
            LazyListMeasuredItem firstVisibleItem2 = lazyListMeasureResult.getFirstVisibleItem();
            update(firstVisibleItem2 != null ? firstVisibleItem2.getIndex() : 0, firstVisibleItemScrollOffset);
        }
    }

    public final void updateScrollOffset(int i10) {
        if (!(((float) i10) >= 0.0f)) {
            InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative");
        }
        setScrollOffset(i10);
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved(LazyListItemProvider lazyListItemProvider, int i10) {
        int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, this.lastKnownFirstItemKey, i10);
        if (i10 != iFindIndexByKey) {
            setIndex(iFindIndexByKey);
            this.nearestRangeState.update(i10);
        }
        return iFindIndexByKey;
    }

    public LazyListScrollPosition(int i10, int i11) {
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(i10);
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(i11);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i10, 30, 100);
    }

    public /* synthetic */ LazyListScrollPosition(int i10, int i11, int i12, AbstractC9972n abstractC9972n) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
