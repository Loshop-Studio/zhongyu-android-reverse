package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10947g0;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LazyStaggeredGridBeyondBoundsState implements LazyLayoutBeyondBoundsState {
    public static final int $stable = 0;
    private final LazyStaggeredGridState state;

    public LazyStaggeredGridBeyondBoundsState(LazyStaggeredGridState lazyStaggeredGridState) {
        this.state = lazyStaggeredGridState;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getFirstPlacedIndex() {
        return this.state.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public boolean getHasVisibleItems() {
        return !this.state.getLayoutInfo().getVisibleItemsInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getLastPlacedIndex() {
        return ((LazyStaggeredGridItemInfo) AbstractC10947g0.m23956y0(this.state.getLayoutInfo().getVisibleItemsInfo())).getIndex();
    }

    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int itemsPerViewport() {
        if (this.state.getLayoutInfo().getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        int singleAxisViewportSize = LazyStaggeredGridMeasureResultKt.getSingleAxisViewportSize(this.state.getLayoutInfo());
        int iVisibleItemsAverageSize = LazyStaggeredGridMeasureResultKt.visibleItemsAverageSize(this.state.getLayoutInfo());
        if (iVisibleItemsAverageSize == 0) {
            return 1;
        }
        return AbstractC10410o.m21752e(singleAxisViewportSize / iVisibleItemsAverageSize, 1);
    }
}
