package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.p014ui.semantics.CollectionInfo;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class LazyLayoutSemanticStateKt {
    public static final LazyLayoutSemanticState LazyLayoutSemanticState(final PagerState pagerState, final boolean z10) {
        return new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.pager.LazyLayoutSemanticStateKt.LazyLayoutSemanticState.1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public CollectionInfo collectionInfo() {
                return z10 ? new CollectionInfo(pagerState.getPageCount(), 1) : new CollectionInfo(1, pagerState.getPageCount());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getContentPadding() {
                return pagerState.getLayoutInfo().getBeforeContentPadding() + pagerState.getLayoutInfo().getAfterContentPadding();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getMaxScrollOffset() {
                return PagerStateKt.calculateNewMaxScrollOffset(pagerState.getLayoutInfo(), pagerState.getPageCount());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getScrollOffset() {
                return PagerScrollPositionKt.currentAbsoluteScrollOffset(pagerState);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getViewport() {
                return (int) (pagerState.getLayoutInfo().getOrientation() == Orientation.Vertical ? pagerState.getLayoutInfo().mo27708getViewportSizeYbymL2g() & 4294967295L : pagerState.getLayoutInfo().mo27708getViewportSizeYbymL2g() >> 32);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public Object scrollToItem(int i10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                Object objScrollToPage$default = PagerState.scrollToPage$default(pagerState, i10, 0.0f, interfaceC11588c, 2, null);
                return objScrollToPage$default == AbstractC11725a.m25952f() ? objScrollToPage$default : C10786q.f26013a;
            }
        };
    }
}
