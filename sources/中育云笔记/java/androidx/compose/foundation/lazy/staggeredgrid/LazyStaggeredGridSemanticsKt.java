package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.p014ui.semantics.CollectionInfo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class LazyStaggeredGridSemanticsKt {
    @Composable
    public static final LazyLayoutSemanticState rememberLazyStaggeredGridSemanticState(final LazyStaggeredGridState lazyStaggeredGridState, boolean z10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1629354903, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:31)");
        }
        boolean z11 = ((((i10 & 14) ^ 6) > 4 && composer.changed(lazyStaggeredGridState)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.changed(z10)) || (i10 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z11 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1
                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public CollectionInfo collectionInfo() {
                    return new CollectionInfo(-1, -1);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getContentPadding() {
                    return lazyStaggeredGridState.getLayoutInfo().getBeforeContentPadding() + lazyStaggeredGridState.getLayoutInfo().getAfterContentPadding();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float getMaxScrollOffset() {
                    return LazyLayoutSemanticsKt.estimatedLazyMaxScrollOffset(lazyStaggeredGridState.getFirstVisibleItemIndex(), lazyStaggeredGridState.getFirstVisibleItemScrollOffset(), lazyStaggeredGridState.getCanScrollForward());
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float getScrollOffset() {
                    return LazyLayoutSemanticsKt.estimatedLazyScrollOffset(lazyStaggeredGridState.getFirstVisibleItemIndex(), lazyStaggeredGridState.getFirstVisibleItemScrollOffset());
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public int getViewport() {
                    return (int) (lazyStaggeredGridState.getLayoutInfo().getOrientation() == Orientation.Vertical ? lazyStaggeredGridState.getLayoutInfo().mo27669getViewportSizeYbymL2g() & 4294967295L : lazyStaggeredGridState.getLayoutInfo().mo27669getViewportSizeYbymL2g() >> 32);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public Object scrollToItem(int i11, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    Object objScrollToItem$default = LazyStaggeredGridState.scrollToItem$default(lazyStaggeredGridState, i11, 0, interfaceC11588c, 2, null);
                    return objScrollToItem$default == AbstractC11725a.m25952f() ? objScrollToItem$default : C10786q.f26013a;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        C1634x9388a700 c1634x9388a700 = (C1634x9388a700) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return c1634x9388a700;
    }
}
