package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8778f0;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PagerBeyondBoundsState implements LazyLayoutBeyondBoundsState {
    public static final int $stable = 0;
    private final int beyondViewportPageCount;
    private final PagerState state;

    public PagerBeyondBoundsState(PagerState pagerState, int i10) {
        this.state = pagerState;
        this.beyondViewportPageCount = i10;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getFirstPlacedIndex() {
        return Math.max(0, this.state.getFirstVisiblePage$foundation_release() - this.beyondViewportPageCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public boolean getHasVisibleItems() {
        return !this.state.getLayoutInfo().getVisiblePagesInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getItemCount() {
        return this.state.getPageCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getLastPlacedIndex() {
        return Math.min(getItemCount() - 1, ((PageInfo) AbstractC8778f0.m14578x0(this.state.getLayoutInfo().getVisiblePagesInfo())).getIndex() + this.beyondViewportPageCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int itemsPerViewport() {
        if (this.state.getLayoutInfo().getVisiblePagesInfo().size() == 0) {
            return 0;
        }
        int mainAxisViewportSize = PagerLayoutInfoKt.getMainAxisViewportSize(this.state.getLayoutInfo());
        int pageSize = this.state.getLayoutInfo().getPageSize() + this.state.getLayoutInfo().getPageSpacing();
        if (pageSize == 0) {
            return 1;
        }
        return AbstractC8323h.m13510e(mainAxisViewportSize / pageSize, 1);
    }
}
