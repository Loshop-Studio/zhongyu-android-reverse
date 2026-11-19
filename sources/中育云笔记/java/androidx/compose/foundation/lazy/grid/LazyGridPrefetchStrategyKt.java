package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;

/* loaded from: classes.dex */
public final class LazyGridPrefetchStrategyKt {
    @ExperimentalFoundationApi
    public static final LazyGridPrefetchStrategy LazyGridPrefetchStrategy(int i10) {
        return new DefaultLazyGridPrefetchStrategy(i10);
    }

    public static /* synthetic */ LazyGridPrefetchStrategy LazyGridPrefetchStrategy$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return LazyGridPrefetchStrategy(i10);
    }
}
