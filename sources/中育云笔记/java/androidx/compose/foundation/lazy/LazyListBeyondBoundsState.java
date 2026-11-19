package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10947g0;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LazyListBeyondBoundsState implements LazyLayoutBeyondBoundsState {
    public static final int $stable = 0;
    private final int beyondBoundsItemCount;
    private final LazyListState state;

    public LazyListBeyondBoundsState(LazyListState lazyListState, int i10) {
        this.state = lazyListState;
        this.beyondBoundsItemCount = i10;
    }

    public final int getBeyondBoundsItemCount() {
        return this.beyondBoundsItemCount;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getFirstPlacedIndex() {
        return Math.max(0, this.state.getFirstVisibleItemIndex() - this.beyondBoundsItemCount);
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
        return Math.min(getItemCount() - 1, ((LazyListItemInfo) AbstractC10947g0.m23956y0(this.state.getLayoutInfo().getVisibleItemsInfo())).getIndex() + this.beyondBoundsItemCount);
    }

    public final LazyListState getState() {
        return this.state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int itemsPerViewport() {
        if (this.state.getLayoutInfo().getVisibleItemsInfo().isEmpty()) {
            return 0;
        }
        int singleAxisViewportSize = LazyListSnapLayoutInfoProviderKt.getSingleAxisViewportSize(this.state.getLayoutInfo());
        int iVisibleItemsAverageSize = LazyListLayoutInfoKt.visibleItemsAverageSize(this.state.getLayoutInfo());
        if (iVisibleItemsAverageSize == 0) {
            return 1;
        }
        return AbstractC10410o.m21752e(singleAxisViewportSize / iVisibleItemsAverageSize, 1);
    }
}
