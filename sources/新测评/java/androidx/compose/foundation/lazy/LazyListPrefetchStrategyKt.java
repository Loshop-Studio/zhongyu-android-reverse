package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, m13558d2 = {"LazyListPrefetchStrategy", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "nestedPrefetchItemCount", "", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
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
