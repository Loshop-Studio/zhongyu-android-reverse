package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p325rc.AbstractC10947g0;

@Stable
/* loaded from: classes.dex */
final class DefaultLazyGridPrefetchStrategy implements LazyGridPrefetchStrategy {
    private final MutableVector<LazyLayoutPrefetchState.PrefetchHandle> currentLinePrefetchHandles;
    private int lineToPrefetch;
    private final int nestedPrefetchItemCount;
    private boolean wasScrollingForward;

    public DefaultLazyGridPrefetchStrategy() {
        this(0, 1, null);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope, int i10) {
        int i11 = this.nestedPrefetchItemCount;
        for (int i12 = 0; i12 < i11; i12++) {
            nestedPrefetchScope.schedulePrefetch(i10 + i12);
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onScroll(LazyGridPrefetchScope lazyGridPrefetchScope, float f10, LazyGridLayoutInfo lazyGridLayoutInfo) {
        int row;
        int index;
        if (lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        int i10 = 0;
        boolean z10 = f10 < 0.0f;
        if (z10) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) AbstractC10947g0.m23956y0(lazyGridLayoutInfo.getVisibleItemsInfo());
            row = (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
            index = ((LazyGridItemInfo) AbstractC10947g0.m23956y0(lazyGridLayoutInfo.getVisibleItemsInfo())).getIndex() + 1;
        } else {
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) AbstractC10947g0.m23944m0(lazyGridLayoutInfo.getVisibleItemsInfo());
            row = (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
            index = ((LazyGridItemInfo) AbstractC10947g0.m23944m0(lazyGridLayoutInfo.getVisibleItemsInfo())).getIndex() - 1;
        }
        if (index < 0 || index >= lazyGridLayoutInfo.getTotalItemsCount()) {
            return;
        }
        if (row != this.lineToPrefetch && row >= 0) {
            if (this.wasScrollingForward != z10) {
                MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.currentLinePrefetchHandles;
                LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i11 = 0; i11 < size; i11++) {
                    prefetchHandleArr[i11].cancel();
                }
            }
            this.wasScrollingForward = z10;
            this.lineToPrefetch = row;
            this.currentLinePrefetchHandles.clear();
            MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector2 = this.currentLinePrefetchHandles;
            mutableVector2.addAll(mutableVector2.getSize(), (List<? extends LazyLayoutPrefetchState.PrefetchHandle>) lazyGridPrefetchScope.scheduleLinePrefetch(row));
        }
        if (!z10) {
            if (lazyGridLayoutInfo.getViewportStartOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis((LazyGridItemInfo) AbstractC10947g0.m23944m0(lazyGridLayoutInfo.getVisibleItemsInfo()), lazyGridLayoutInfo.getOrientation()) < f10) {
                MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector3 = this.currentLinePrefetchHandles;
                LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr2 = mutableVector3.content;
                int size2 = mutableVector3.getSize();
                while (i10 < size2) {
                    prefetchHandleArr2[i10].markAsUrgent();
                    i10++;
                }
                return;
            }
            return;
        }
        LazyGridItemInfo lazyGridItemInfo3 = (LazyGridItemInfo) AbstractC10947g0.m23956y0(lazyGridLayoutInfo.getVisibleItemsInfo());
        if (((LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo3, lazyGridLayoutInfo.getOrientation()) + LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo3, lazyGridLayoutInfo.getOrientation())) + lazyGridLayoutInfo.getMainAxisItemSpacing()) - lazyGridLayoutInfo.getViewportEndOffset() < (-f10)) {
            MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector4 = this.currentLinePrefetchHandles;
            LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr3 = mutableVector4.content;
            int size3 = mutableVector4.getSize();
            while (i10 < size3) {
                prefetchHandleArr3[i10].markAsUrgent();
                i10++;
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public void onVisibleItemsUpdated(LazyGridPrefetchScope lazyGridPrefetchScope, LazyGridLayoutInfo lazyGridLayoutInfo) {
        int row;
        if (this.lineToPrefetch == -1 || lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        if (this.wasScrollingForward) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) AbstractC10947g0.m23956y0(lazyGridLayoutInfo.getVisibleItemsInfo());
            row = (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn()) + 1;
        } else {
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) AbstractC10947g0.m23944m0(lazyGridLayoutInfo.getVisibleItemsInfo());
            row = (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridItemInfo2.getRow() : lazyGridItemInfo2.getColumn()) - 1;
        }
        if (this.lineToPrefetch != row) {
            this.lineToPrefetch = -1;
            MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.currentLinePrefetchHandles;
            LazyLayoutPrefetchState.PrefetchHandle[] prefetchHandleArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                prefetchHandleArr[i10].cancel();
            }
            this.currentLinePrefetchHandles.clear();
        }
    }

    public DefaultLazyGridPrefetchStrategy(int i10) {
        this.nestedPrefetchItemCount = i10;
        this.lineToPrefetch = -1;
        this.currentLinePrefetchHandles = new MutableVector<>(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);
    }

    public /* synthetic */ DefaultLazyGridPrefetchStrategy(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 2 : i10);
    }
}
