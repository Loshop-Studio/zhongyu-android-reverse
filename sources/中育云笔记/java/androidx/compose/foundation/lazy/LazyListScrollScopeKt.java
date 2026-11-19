package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import java.util.List;
import p325rc.AbstractC10947g0;

/* loaded from: classes.dex */
public final class LazyListScrollScopeKt {

    /* renamed from: androidx.compose.foundation.lazy.LazyListScrollScopeKt$LazyLayoutScrollScope$1 */
    public static final class C15281 implements LazyLayoutScrollScope, ScrollScope {
        private final /* synthetic */ ScrollScope $$delegate_0;
        final /* synthetic */ LazyListState $state;

        public C15281(ScrollScope scrollScope, LazyListState lazyListState) {
            this.$state = lazyListState;
            this.$$delegate_0 = scrollScope;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int calculateDistanceTo(int i10, int i11) {
            LazyListItemInfo lazyListItemInfo;
            LazyListLayoutInfo layoutInfo = this.$state.getLayoutInfo();
            int iVisibleItemsAverageSize = 0;
            if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                return 0;
            }
            int firstVisibleItemIndex = getFirstVisibleItemIndex();
            if (i10 > getLastVisibleItemIndex() || firstVisibleItemIndex > i10) {
                iVisibleItemsAverageSize = (LazyListLayoutInfoKt.visibleItemsAverageSize(layoutInfo) * (i10 - getFirstVisibleItemIndex())) - getFirstVisibleItemScrollOffset();
            } else {
                List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        lazyListItemInfo = null;
                        break;
                    }
                    lazyListItemInfo = visibleItemsInfo.get(i12);
                    if (lazyListItemInfo.getIndex() == i10) {
                        break;
                    }
                    i12++;
                }
                LazyListItemInfo lazyListItemInfo2 = lazyListItemInfo;
                if (lazyListItemInfo2 != null) {
                    iVisibleItemsAverageSize = lazyListItemInfo2.getOffset();
                }
            }
            return iVisibleItemsAverageSize + i11;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getFirstVisibleItemIndex() {
            return this.$state.getFirstVisibleItemIndex();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getFirstVisibleItemScrollOffset() {
            return this.$state.getFirstVisibleItemScrollOffset();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getItemCount() {
            return this.$state.getLayoutInfo().getTotalItemsCount();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getLastVisibleItemIndex() {
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) AbstractC10947g0.m23957z0(this.$state.getLayoutInfo().getVisibleItemsInfo());
            if (lazyListItemInfo != null) {
                return lazyListItemInfo.getIndex();
            }
            return 0;
        }

        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f10) {
            return this.$$delegate_0.scrollBy(f10);
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public void snapToItem(int i10, int i11) {
            this.$state.snapToItemIndexInternal$foundation_release(i10, i11, true);
        }
    }

    public static final LazyLayoutScrollScope LazyLayoutScrollScope(LazyListState lazyListState, ScrollScope scrollScope) {
        return new C15281(scrollScope, lazyListState);
    }
}
