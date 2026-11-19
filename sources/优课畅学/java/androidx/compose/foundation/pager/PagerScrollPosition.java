package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PagerScrollPosition {
    public static final int $stable = 8;
    private final MutableIntState currentPage$delegate;
    private final MutableFloatState currentPageOffsetFraction$delegate;
    private boolean hadFirstNotEmptyLayout;
    private Object lastKnownCurrentPageKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final PagerState state;

    public PagerScrollPosition(int i10, float f10, PagerState pagerState) {
        this.state = pagerState;
        this.currentPage$delegate = SnapshotIntStateKt.mutableIntStateOf(i10);
        this.currentPageOffsetFraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f10);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i10, 30, 100);
    }

    private final void setCurrentPage(int i10) {
        this.currentPage$delegate.setIntValue(i10);
    }

    private final void setCurrentPageOffsetFraction(float f10) {
        this.currentPageOffsetFraction$delegate.setFloatValue(f10);
    }

    private final void update(int i10, float f10) {
        setCurrentPage(i10);
        this.nearestRangeState.update(i10);
        setCurrentPageOffsetFraction(f10);
    }

    public final void applyScrollDelta(int i10) {
        setCurrentPageOffsetFraction(getCurrentPageOffsetFraction() + (this.state.getPageSizeWithSpacing$foundation_release() == 0 ? 0.0f : i10 / this.state.getPageSizeWithSpacing$foundation_release()));
    }

    public final int getCurrentPage() {
        return this.currentPage$delegate.getIntValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction$delegate.getFloatValue();
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final PagerState getState() {
        return this.state;
    }

    public final int matchPageWithKey(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i10) {
        int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(pagerLazyLayoutItemProvider, this.lastKnownCurrentPageKey, i10);
        if (i10 != iFindIndexByKey) {
            setCurrentPage(iFindIndexByKey);
            this.nearestRangeState.update(i10);
        }
        return iFindIndexByKey;
    }

    public final void requestPositionAndForgetLastKnownKey(int i10, float f10) {
        update(i10, f10);
        this.lastKnownCurrentPageKey = null;
    }

    public final void updateCurrentPageOffsetFraction(float f10) {
        setCurrentPageOffsetFraction(f10);
    }

    public final void updateFromMeasureResult(PagerMeasureResult pagerMeasureResult) {
        MeasuredPage currentPage = pagerMeasureResult.getCurrentPage();
        this.lastKnownCurrentPageKey = currentPage != null ? currentPage.getKey() : null;
        if (this.hadFirstNotEmptyLayout || !pagerMeasureResult.getVisiblePagesInfo().isEmpty()) {
            this.hadFirstNotEmptyLayout = true;
            MeasuredPage currentPage2 = pagerMeasureResult.getCurrentPage();
            update(currentPage2 != null ? currentPage2.getIndex() : 0, pagerMeasureResult.getCurrentPageOffsetFraction());
        }
    }

    public /* synthetic */ PagerScrollPosition(int i10, float f10, PagerState pagerState, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0f : f10, pagerState);
    }
}
