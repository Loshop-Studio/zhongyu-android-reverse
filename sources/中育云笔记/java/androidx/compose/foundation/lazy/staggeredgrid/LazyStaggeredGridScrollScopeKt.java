package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.p014ui.unit.IntOffset;
import java.util.List;
import p325rc.AbstractC10947g0;

/* loaded from: classes.dex */
public final class LazyStaggeredGridScrollScopeKt {

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1 */
    public static final class C16331 implements LazyLayoutScrollScope, ScrollScope {
        private final /* synthetic */ ScrollScope $$delegate_0;
        final /* synthetic */ LazyStaggeredGridState $state;

        public C16331(ScrollScope scrollScope, LazyStaggeredGridState lazyStaggeredGridState) {
            this.$state = lazyStaggeredGridState;
            this.$$delegate_0 = scrollScope;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int calculateDistanceTo(int i10, int i11) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
            int iM33630getYimpl;
            LazyStaggeredGridLayoutInfo layoutInfo = this.$state.getLayoutInfo();
            int i12 = 0;
            if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                return 0;
            }
            List<LazyStaggeredGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            while (true) {
                if (i12 >= size) {
                    lazyStaggeredGridItemInfo = null;
                    break;
                }
                lazyStaggeredGridItemInfo = visibleItemsInfo.get(i12);
                if (lazyStaggeredGridItemInfo.getIndex() == i10) {
                    break;
                }
                i12++;
            }
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo2 = lazyStaggeredGridItemInfo;
            if (lazyStaggeredGridItemInfo2 == null) {
                int iVisibleItemsAverageSize = LazyStaggeredGridMeasureResultKt.visibleItemsAverageSize(layoutInfo);
                int laneCount$foundation_release = this.$state.getLaneCount$foundation_release();
                iM33630getYimpl = (iVisibleItemsAverageSize * ((i10 / laneCount$foundation_release) - (getFirstVisibleItemIndex() / laneCount$foundation_release))) - getFirstVisibleItemScrollOffset();
            } else {
                iM33630getYimpl = layoutInfo.getOrientation() == Orientation.Vertical ? IntOffset.m33630getYimpl(lazyStaggeredGridItemInfo2.mo27666getOffsetnOccac()) : IntOffset.m33629getXimpl(lazyStaggeredGridItemInfo2.mo27666getOffsetnOccac());
            }
            return iM33630getYimpl + i11;
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
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) AbstractC10947g0.m23957z0(this.$state.getLayoutInfo().getVisibleItemsInfo());
            if (lazyStaggeredGridItemInfo != null) {
                return lazyStaggeredGridItemInfo.getIndex();
            }
            return 0;
        }

        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f10) {
            return this.$$delegate_0.scrollBy(f10);
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public void snapToItem(int i10, int i11) {
            this.$state.snapToItemInternal$foundation_release(i10, i11, true);
        }
    }

    public static final LazyLayoutScrollScope LazyLayoutScrollScope(LazyStaggeredGridState lazyStaggeredGridState, ScrollScope scrollScope) {
        return new C16331(scrollScope, lazyStaggeredGridState);
    }
}
