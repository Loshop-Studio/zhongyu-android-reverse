package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface LazyLayoutItemProvider {
    @Composable
    void Item(int i10, Object obj, Composer composer, int i11);

    default Object getContentType(int i10) {
        return null;
    }

    default int getIndex(Object obj) {
        return -1;
    }

    int getItemCount();

    default Object getKey(int i10) {
        return Lazy_androidKt.getDefaultLazyLayoutKey(i10);
    }
}
