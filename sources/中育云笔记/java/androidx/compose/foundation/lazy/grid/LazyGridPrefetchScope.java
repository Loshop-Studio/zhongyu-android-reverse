package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import java.util.List;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface LazyGridPrefetchScope {
    List<LazyLayoutPrefetchState.PrefetchHandle> scheduleLinePrefetch(int i10);
}
