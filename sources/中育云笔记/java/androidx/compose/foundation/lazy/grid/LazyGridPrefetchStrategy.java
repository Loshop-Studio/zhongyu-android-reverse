package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface LazyGridPrefetchStrategy {
    default PrefetchScheduler getPrefetchScheduler() {
        return null;
    }

    void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope, int i10);

    void onScroll(LazyGridPrefetchScope lazyGridPrefetchScope, float f10, LazyGridLayoutInfo lazyGridLayoutInfo);

    void onVisibleItemsUpdated(LazyGridPrefetchScope lazyGridPrefetchScope, LazyGridLayoutInfo lazyGridLayoutInfo);
}
