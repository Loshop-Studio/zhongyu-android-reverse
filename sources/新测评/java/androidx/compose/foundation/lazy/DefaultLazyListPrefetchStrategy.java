package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(m13557d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u001c\u0010\u000e\u001a\u00020\u000b*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0014\u0010\u0014\u001a\u00020\u000b*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m13558d2 = {"Landroidx/compose/foundation/lazy/DefaultLazyListPrefetchStrategy;", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "nestedPrefetchItemCount", "", "(I)V", "currentPrefetchHandle", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "indexToPrefetch", "wasScrollingForward", "", "onNestedPrefetch", "", "Landroidx/compose/foundation/lazy/layout/NestedPrefetchScope;", "firstVisibleItemIndex", "onScroll", "Landroidx/compose/foundation/lazy/LazyListPrefetchScope;", "delta", "", "layoutInfo", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "onVisibleItemsUpdated", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLazyListPrefetchStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListPrefetchStrategy.kt\nandroidx/compose/foundation/lazy/DefaultLazyListPrefetchStrategy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
/* loaded from: classes.dex */
final class DefaultLazyListPrefetchStrategy implements LazyListPrefetchStrategy {
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private int indexToPrefetch;
    private final int nestedPrefetchItemCount;
    private boolean wasScrollingForward;

    public DefaultLazyListPrefetchStrategy() {
        this(0, 1, null);
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope, int i10) {
        int i11 = this.nestedPrefetchItemCount;
        for (int i12 = 0; i12 < i11; i12++) {
            nestedPrefetchScope.schedulePrefetch(i10 + i12);
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onScroll(LazyListPrefetchScope lazyListPrefetchScope, float f10, LazyListLayoutInfo lazyListLayoutInfo) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        boolean z9 = f10 < 0.0f;
        int index = z9 ? ((LazyListItemInfo) CollectionsKt.last((List) lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() + 1 : ((LazyListItemInfo) CollectionsKt.first((List) lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() - 1;
        if (index < 0 || index >= lazyListLayoutInfo.getTotalItemsCount()) {
            return;
        }
        if (index != this.indexToPrefetch) {
            if (this.wasScrollingForward != z9 && (prefetchHandle3 = this.currentPrefetchHandle) != null) {
                prefetchHandle3.cancel();
            }
            this.wasScrollingForward = z9;
            this.indexToPrefetch = index;
            this.currentPrefetchHandle = lazyListPrefetchScope.schedulePrefetch(index);
        }
        if (!z9) {
            if (lazyListLayoutInfo.getViewportStartOffset() - ((LazyListItemInfo) CollectionsKt.first((List) lazyListLayoutInfo.getVisibleItemsInfo())).getOffset() >= f10 || (prefetchHandle = this.currentPrefetchHandle) == null) {
                return;
            }
            prefetchHandle.markAsUrgent();
            return;
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.last((List) lazyListLayoutInfo.getVisibleItemsInfo());
        if (((lazyListItemInfo.getOffset() + lazyListItemInfo.getSize()) + lazyListLayoutInfo.getMainAxisItemSpacing()) - lazyListLayoutInfo.getViewportEndOffset() >= (-f10) || (prefetchHandle2 = this.currentPrefetchHandle) == null) {
            return;
        }
        prefetchHandle2.markAsUrgent();
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public void onVisibleItemsUpdated(LazyListPrefetchScope lazyListPrefetchScope, LazyListLayoutInfo lazyListLayoutInfo) {
        if (this.indexToPrefetch == -1 || lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != (this.wasScrollingForward ? ((LazyListItemInfo) CollectionsKt.last((List) lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() + 1 : ((LazyListItemInfo) CollectionsKt.first((List) lazyListLayoutInfo.getVisibleItemsInfo())).getIndex() - 1)) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    public DefaultLazyListPrefetchStrategy(int i10) {
        this.nestedPrefetchItemCount = i10;
        this.indexToPrefetch = -1;
    }

    public /* synthetic */ DefaultLazyListPrefetchStrategy(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 2 : i10);
    }
}
