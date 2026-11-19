package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollScope;

/* loaded from: classes.dex */
public interface LazyLayoutScrollScope extends ScrollScope {
    static /* synthetic */ int calculateDistanceTo$default(LazyLayoutScrollScope lazyLayoutScrollScope, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateDistanceTo");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return lazyLayoutScrollScope.calculateDistanceTo(i10, i11);
    }

    static /* synthetic */ void snapToItem$default(LazyLayoutScrollScope lazyLayoutScrollScope, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapToItem");
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        lazyLayoutScrollScope.snapToItem(i10, i11);
    }

    int calculateDistanceTo(int i10, int i11);

    int getFirstVisibleItemIndex();

    int getFirstVisibleItemScrollOffset();

    int getItemCount();

    int getLastVisibleItemIndex();

    void snapToItem(int i10, int i11);
}
