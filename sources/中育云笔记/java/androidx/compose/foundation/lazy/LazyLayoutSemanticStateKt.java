package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.p014ui.semantics.CollectionInfo;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class LazyLayoutSemanticStateKt {
    public static final LazyLayoutSemanticState LazyLayoutSemanticState(final LazyListState lazyListState, final boolean z10) {
        return new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt.LazyLayoutSemanticState.1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public CollectionInfo collectionInfo() {
                return z10 ? new CollectionInfo(-1, 1) : new CollectionInfo(1, -1);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getContentPadding() {
                return lazyListState.getLayoutInfo().getBeforeContentPadding() + lazyListState.getLayoutInfo().getAfterContentPadding();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getMaxScrollOffset() {
                return LazyLayoutSemanticsKt.estimatedLazyMaxScrollOffset(lazyListState.getFirstVisibleItemIndex(), lazyListState.getFirstVisibleItemScrollOffset(), lazyListState.getCanScrollForward());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getScrollOffset() {
                return LazyLayoutSemanticsKt.estimatedLazyScrollOffset(lazyListState.getFirstVisibleItemIndex(), lazyListState.getFirstVisibleItemScrollOffset());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public int getViewport() {
                return (int) (lazyListState.getLayoutInfo().getOrientation() == Orientation.Vertical ? lazyListState.getLayoutInfo().mo27565getViewportSizeYbymL2g() & 4294967295L : lazyListState.getLayoutInfo().mo27565getViewportSizeYbymL2g() >> 32);
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public Object scrollToItem(int i10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                Object objScrollToItem$default = LazyListState.scrollToItem$default(lazyListState, i10, 0, interfaceC11588c, 2, null);
                return objScrollToItem$default == AbstractC11725a.m25952f() ? objScrollToItem$default : C10786q.f26013a;
            }
        };
    }
}
