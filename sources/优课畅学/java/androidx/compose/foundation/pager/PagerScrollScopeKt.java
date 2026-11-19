package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8778f0;
import p322z7.AbstractC10729c;

/* loaded from: classes.dex */
public final class PagerScrollScopeKt {

    /* renamed from: androidx.compose.foundation.pager.PagerScrollScopeKt$LazyLayoutScrollScope$1 */
    public static final class C16181 implements LazyLayoutScrollScope, ScrollScope {
        private final /* synthetic */ ScrollScope $$delegate_0;
        final /* synthetic */ PagerState $state;

        public C16181(ScrollScope scrollScope, PagerState pagerState) {
            this.$state = pagerState;
            this.$$delegate_0 = scrollScope;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int calculateDistanceTo(int i10, int i11) {
            return (int) (AbstractC8323h.m13520o(PagerScrollPositionKt.currentAbsoluteScrollOffset(this.$state) + AbstractC10729c.m20035d((((i10 - this.$state.getCurrentPage()) * this.$state.getPageSizeWithSpacing$foundation_release()) - (this.$state.getCurrentPageOffsetFraction() * this.$state.getPageSizeWithSpacing$foundation_release())) + i11), this.$state.getMinScrollOffset$foundation_release(), this.$state.getMaxScrollOffset$foundation_release()) - PagerScrollPositionKt.currentAbsoluteScrollOffset(this.$state));
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getFirstVisibleItemIndex() {
            return this.$state.getFirstVisiblePage$foundation_release();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getFirstVisibleItemScrollOffset() {
            return this.$state.getFirstVisiblePageOffset$foundation_release();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getItemCount() {
            return this.$state.getPageCount();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getLastVisibleItemIndex() {
            return ((PageInfo) AbstractC8778f0.m14578x0(this.$state.getLayoutInfo().getVisiblePagesInfo())).getIndex();
        }

        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f10) {
            return this.$$delegate_0.scrollBy(f10);
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public void snapToItem(int i10, int i11) {
            this.$state.snapToItem$foundation_release(i10, i11 / this.$state.getPageSizeWithSpacing$foundation_release(), true);
        }
    }

    public static final LazyLayoutScrollScope LazyLayoutScrollScope(PagerState pagerState, ScrollScope scrollScope) {
        return new C16181(scrollScope, pagerState);
    }
}
