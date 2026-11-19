package androidx.compose.foundation.lazy.grid;

import androidx.collection.IntList;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class LazyGridItemProviderImpl implements LazyGridItemProvider {
    private final LazyGridIntervalContent intervalContent;
    private final LazyLayoutKeyIndexMap keyIndexMap;
    private final LazyGridState state;

    public LazyGridItemProviderImpl(LazyGridState lazyGridState, LazyGridIntervalContent lazyGridIntervalContent, LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.state = lazyGridState;
        this.intervalContent = lazyGridIntervalContent;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(final int i10, Object obj, Composer composer, int i11) {
        composer.startReplaceGroup(1493551140);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1493551140, i11, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:81)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i10, this.state.getPinnedItems$foundation_release(), ComposableLambdaKt.rememberComposableLambda(726189336, true, new InterfaceC9544p() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((Composer) obj2, ((Number) obj3).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(Composer composer2, int i12) {
                if (!composer2.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(726189336, i12, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:83)");
                }
                LazyGridIntervalContent lazyGridIntervalContent = LazyGridItemProviderImpl.this.intervalContent;
                int i13 = i10;
                IntervalList.Interval<LazyGridInterval> interval = lazyGridIntervalContent.getIntervals().get(i13);
                interval.getValue().getItem().invoke(LazyGridItemScopeImpl.INSTANCE, Integer.valueOf(i13 - interval.getStartIndex()), composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazyGridItemProviderImpl) {
            return AbstractC9979u.m20289b(this.intervalContent, ((LazyGridItemProviderImpl) obj).intervalContent);
        }
        return false;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int i10) {
        return this.intervalContent.getContentType(i10);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public IntList getHeaderIndexes() {
        return this.intervalContent.getHeaderIndexes();
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

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.keyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.intervalContent.getSpanLayoutProvider$foundation_release();
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
