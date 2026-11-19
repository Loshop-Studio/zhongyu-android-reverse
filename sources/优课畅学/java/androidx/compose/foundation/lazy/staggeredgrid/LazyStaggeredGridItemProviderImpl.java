package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class LazyStaggeredGridItemProviderImpl implements LazyStaggeredGridItemProvider {
    private final LazyStaggeredGridIntervalContent intervalContent;
    private final LazyLayoutKeyIndexMap keyIndexMap;
    private final LazyStaggeredGridState state;

    public LazyStaggeredGridItemProviderImpl(LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridIntervalContent lazyStaggeredGridIntervalContent, LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.state = lazyStaggeredGridState;
        this.intervalContent = lazyStaggeredGridIntervalContent;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(final int i10, Object obj, Composer composer, int i11) {
        composer.startReplaceGroup(89098518);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(89098518, i11, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item (LazyStaggeredGridItemProvider.kt:77)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i10, this.state.getPinnedItems$foundation_release(), ComposableLambdaKt.rememberComposableLambda(608834466, true, new InterfaceC10574p() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((Composer) obj2, ((Number) obj3).intValue());
                return C8736p.f16368a;
            }

            @Composable
            public final void invoke(Composer composer2, int i12) {
                if (!composer2.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(608834466, i12, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item.<anonymous> (LazyStaggeredGridItemProvider.kt:79)");
                }
                LazyStaggeredGridIntervalContent lazyStaggeredGridIntervalContent = LazyStaggeredGridItemProviderImpl.this.intervalContent;
                int i13 = i10;
                IntervalList.Interval<LazyStaggeredGridInterval> interval = lazyStaggeredGridIntervalContent.getIntervals().get(i13);
                interval.getValue().getItem().invoke(LazyStaggeredGridItemScopeImpl.INSTANCE, Integer.valueOf(i13 - interval.getStartIndex()), composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazyStaggeredGridItemProviderImpl) {
            return AbstractC9133u.m16128b(this.intervalContent, ((LazyStaggeredGridItemProviderImpl) obj).intervalContent);
        }
        return false;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int i10) {
        return this.intervalContent.getContentType(i10);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(Object obj) {
        return getKeyIndexMap().getIndex(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervalContent.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int i10) {
        Object key = getKeyIndexMap().getKey(i10);
        return key == null ? this.intervalContent.getKey(i10) : key;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
    public LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.keyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
    public LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.intervalContent.getSpanProvider();
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
