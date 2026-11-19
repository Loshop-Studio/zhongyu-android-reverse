package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;
import p325rc.AbstractC10947g0;

@Stable
/* loaded from: classes.dex */
final class DefaultLazyListPrefetchStrategy implements LazyListPrefetchStrategy {
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private int indexToPrefetch;
    private final int nestedPrefetchItemCount;
    private boolean wasScrollingForward;

    public DefaultLazyListPrefetchStrategy() {
        this(0, 1, null);
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope, int i10) {
        int i11 = this.nestedPrefetchItemCount;
        for (int i12 = 0; i12 < i11; i12++) {
            nestedPrefetchScope.schedulePrefetch(i10 + i12);
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onScroll(LazyListPrefetchScope lazyListPrefetchScope, float f10, LazyListLayoutInfo lazyListLayoutInfo) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        boolean z10 = f10 < 0.0f;
        int index = z10 ? ((LazyListItemInfo) AbstractC10947g0.m23956y0(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() + 1 : ((LazyListItemInfo) AbstractC10947g0.m23944m0(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() - 1;
        if (index < 0 || index >= lazyListLayoutInfo.getTotalItemsCount()) {
            return;
        }
        if (index != this.indexToPrefetch) {
            if (this.wasScrollingForward != z10 && (prefetchHandle3 = this.currentPrefetchHandle) != null) {
                prefetchHandle3.cancel();
            }
            this.wasScrollingForward = z10;
            this.indexToPrefetch = index;
            this.currentPrefetchHandle = lazyListPrefetchScope.schedulePrefetch(index);
        }
        if (!z10) {
            if (lazyListLayoutInfo.getViewportStartOffset() - ((LazyListItemInfo) AbstractC10947g0.m23944m0(lazyListLayoutInfo.getVisibleItemsInfo())).getOffset() >= f10 || (prefetchHandle = this.currentPrefetchHandle) == null) {
                return;
            }
            prefetchHandle.markAsUrgent();
            return;
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) AbstractC10947g0.m23956y0(lazyListLayoutInfo.getVisibleItemsInfo());
        if (((lazyListItemInfo.getOffset() + lazyListItemInfo.getSize()) + lazyListLayoutInfo.getMainAxisItemSpacing()) - lazyListLayoutInfo.getViewportEndOffset() >= (-f10) || (prefetchHandle2 = this.currentPrefetchHandle) == null) {
            return;
        }
        prefetchHandle2.markAsUrgent();
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onVisibleItemsUpdated(LazyListPrefetchScope lazyListPrefetchScope, LazyListLayoutInfo lazyListLayoutInfo) {
        if (this.indexToPrefetch == -1 || lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != (this.wasScrollingForward ? ((LazyListItemInfo) AbstractC10947g0.m23956y0(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() + 1 : ((LazyListItemInfo) AbstractC10947g0.m23944m0(lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() - 1)) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    public DefaultLazyListPrefetchStrategy(int i10) {
        this.nestedPrefetchItemCount = i10;
        this.indexToPrefetch = -1;
    }

    public /* synthetic */ DefaultLazyListPrefetchStrategy(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 2 : i10);
    }
}
