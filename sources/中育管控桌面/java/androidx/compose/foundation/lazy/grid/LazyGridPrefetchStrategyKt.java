package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, m7880d2 = {"LazyGridPrefetchStrategy", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "nestedPrefetchItemCount", "", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class LazyGridPrefetchStrategyKt {
    @ExperimentalFoundationApi
    public static final LazyGridPrefetchStrategy LazyGridPrefetchStrategy(int i6) {
        return new DefaultLazyGridPrefetchStrategy(i6);
    }

    public static /* synthetic */ LazyGridPrefetchStrategy LazyGridPrefetchStrategy$default(int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i6 = 2;
        }
        return LazyGridPrefetchStrategy(i6);
    }
}
