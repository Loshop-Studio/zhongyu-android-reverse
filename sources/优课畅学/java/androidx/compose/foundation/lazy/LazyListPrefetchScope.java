package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface LazyListPrefetchScope {
    LazyLayoutPrefetchState.PrefetchHandle schedulePrefetch(int i10);
}
