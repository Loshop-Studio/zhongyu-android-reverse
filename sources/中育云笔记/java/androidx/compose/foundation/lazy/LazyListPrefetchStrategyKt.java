package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;

/* loaded from: classes.dex */
public final class LazyListPrefetchStrategyKt {
    @ExperimentalFoundationApi
    public static final LazyListPrefetchStrategy LazyListPrefetchStrategy(int i10) {
        return new DefaultLazyListPrefetchStrategy(i10);
    }

    public static /* synthetic */ LazyListPrefetchStrategy LazyListPrefetchStrategy$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        return LazyListPrefetchStrategy(i10);
    }
}
