package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.p014ui.unit.IntOffset;
import java.util.List;
import p325rc.AbstractC10947g0;

/* loaded from: classes.dex */
public final class LazyGridScrollScopeKt {

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridScrollScopeKt$LazyLayoutScrollScope$1 */
    public static final class C15701 implements LazyLayoutScrollScope, ScrollScope {
        private final /* synthetic */ ScrollScope $$delegate_0;
        final /* synthetic */ LazyGridState $state;

        public C15701(ScrollScope scrollScope, LazyGridState lazyGridState) {
            this.$state = lazyGridState;
            this.$$delegate_0 = scrollScope;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int calculateDistanceTo(int i10, int i11) {
            Integer numValueOf;
            LazyGridItemInfo lazyGridItemInfo;
            LazyGridLayoutInfo layoutInfo = this.$state.getLayoutInfo();
            if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                return 0;
            }
            int firstVisibleItemIndex = getFirstVisibleItemIndex();
            if (i10 > getLastVisibleItemIndex() || firstVisibleItemIndex > i10) {
                int slotsPerLine$foundation_release = this.$state.getSlotsPerLine$foundation_release();
                iVisibleLinesAverageMainAxisSize = (LazyGridLayoutInfoKt.visibleLinesAverageMainAxisSize(layoutInfo) * (((i10 - getFirstVisibleItemIndex()) + ((slotsPerLine$foundation_release - 1) * ((i10 < getFirstVisibleItemIndex() ? 1 : 0) != 0 ? -1 : 1))) / slotsPerLine$foundation_release)) - getFirstVisibleItemScrollOffset();
            } else {
                List<LazyGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                int i12 = 0;
                while (true) {
                    numValueOf = null;
                    if (i12 >= size) {
                        lazyGridItemInfo = null;
                        break;
                    }
                    lazyGridItemInfo = visibleItemsInfo.get(i12);
                    if (lazyGridItemInfo.getIndex() == i10) {
                        break;
                    }
                    i12++;
                }
                LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
                if (layoutInfo.getOrientation() == Orientation.Vertical) {
                    if (lazyGridItemInfo2 != null) {
                        numValueOf = Integer.valueOf(IntOffset.m33630getYimpl(lazyGridItemInfo2.mo27597getOffsetnOccac()));
                    }
                } else if (lazyGridItemInfo2 != null) {
                    numValueOf = Integer.valueOf(IntOffset.m33629getXimpl(lazyGridItemInfo2.mo27597getOffsetnOccac()));
                }
                if (numValueOf != null) {
                    iVisibleLinesAverageMainAxisSize = numValueOf.intValue();
                }
            }
            return iVisibleLinesAverageMainAxisSize + i11;
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
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) AbstractC10947g0.m23957z0(this.$state.getLayoutInfo().getVisibleItemsInfo());
            if (lazyGridItemInfo != null) {
                return lazyGridItemInfo.getIndex();
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

    public static final LazyLayoutScrollScope LazyLayoutScrollScope(LazyGridState lazyGridState, ScrollScope scrollScope) {
        return new C15701(scrollScope, lazyGridState);
    }
}
