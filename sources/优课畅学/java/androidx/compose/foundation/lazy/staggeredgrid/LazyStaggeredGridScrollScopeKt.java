package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.p013ui.unit.IntOffset;
import java.util.List;
import p134i7.AbstractC8778f0;

/* loaded from: classes.dex */
public final class LazyStaggeredGridScrollScopeKt {

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1 */
    public static final class C16031 implements LazyLayoutScrollScope, ScrollScope {
        private final /* synthetic */ ScrollScope $$delegate_0;
        final /* synthetic */ LazyStaggeredGridState $state;

        public C16031(ScrollScope scrollScope, LazyStaggeredGridState lazyStaggeredGridState) {
            this.$state = lazyStaggeredGridState;
            this.$$delegate_0 = scrollScope;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int calculateDistanceTo(int i10, int i11) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
            int iM27028getYimpl;
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
                iM27028getYimpl = (iVisibleItemsAverageSize * ((i10 / laneCount$foundation_release) - (getFirstVisibleItemIndex() / laneCount$foundation_release))) - getFirstVisibleItemScrollOffset();
            } else {
                iM27028getYimpl = layoutInfo.getOrientation() == Orientation.Vertical ? IntOffset.m27028getYimpl(lazyStaggeredGridItemInfo2.mo21064getOffsetnOccac()) : IntOffset.m27027getXimpl(lazyStaggeredGridItemInfo2.mo21064getOffsetnOccac());
            }
            return iM27028getYimpl + i11;
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
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) AbstractC8778f0.m14579y0(this.$state.getLayoutInfo().getVisibleItemsInfo());
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
        return new C16031(scrollScope, lazyStaggeredGridState);
    }
}
