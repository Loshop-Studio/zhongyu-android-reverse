package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10968r;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyStaggeredGridScrollPosition {
    public static final int $stable = 8;
    private final InterfaceC9544p fillIndices;
    private boolean hadFirstNotEmptyLayout;
    private final MutableIntState index$delegate;
    private int[] indices;
    private Object lastKnownFirstItemKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableIntState scrollOffset$delegate;
    private int[] scrollOffsets;

    public LazyStaggeredGridScrollPosition(int[] iArr, int[] iArr2, InterfaceC9544p interfaceC9544p) {
        this.fillIndices = interfaceC9544p;
        this.indices = iArr;
        this.index$delegate = SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleIndex(iArr));
        this.scrollOffsets = iArr2;
        this.scrollOffset$delegate = SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleScrollOffset(iArr, iArr2));
        Integer numM24060S0 = AbstractC10968r.m24060S0(iArr);
        this.nearestRangeState = new LazyLayoutNearestRangeState(numM24060S0 != null ? numM24060S0.intValue() : 0, 90, 200);
    }

    private final int calculateFirstVisibleIndex(int[] iArr) {
        int i10 = Integer.MAX_VALUE;
        for (int i11 : iArr) {
            if (i11 <= 0) {
                return 0;
            }
            if (i10 > i11) {
                i10 = i11;
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return 0;
        }
        return i10;
    }

    private final int calculateFirstVisibleScrollOffset(int[] iArr, int[] iArr2) {
        int iCalculateFirstVisibleIndex = calculateFirstVisibleIndex(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < length; i10++) {
            if (iArr[i10] == iCalculateFirstVisibleIndex) {
                iMin = Math.min(iMin, iArr2[i10]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    private final void setIndex(int i10) {
        this.index$delegate.setIntValue(i10);
    }

    private final void setScrollOffset(int i10) {
        this.scrollOffset$delegate.setIntValue(i10);
    }

    private final void update(int[] iArr, int[] iArr2) {
        this.indices = iArr;
        setIndex(calculateFirstVisibleIndex(iArr));
        this.scrollOffsets = iArr2;
        setScrollOffset(calculateFirstVisibleScrollOffset(iArr, iArr2));
    }

    public final int getIndex() {
        return this.index$delegate.getIntValue();
    }

    public final int[] getIndices() {
        return this.indices;
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset$delegate.getIntValue();
    }

    public final int[] getScrollOffsets() {
        return this.scrollOffsets;
    }

    public final void requestPositionAndForgetLastKnownKey(int i10, int i11) {
        int[] iArr = (int[]) this.fillIndices.invoke(Integer.valueOf(i10), Integer.valueOf(this.indices.length));
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr2[i12] = i11;
        }
        update(iArr, iArr2);
        this.nearestRangeState.update(i10);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateFromMeasureResult(LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem;
        int iCalculateFirstVisibleIndex = calculateFirstVisibleIndex(lazyStaggeredGridMeasureResult.getFirstVisibleItemIndices());
        List<LazyStaggeredGridMeasuredItem> visibleItemsInfo = lazyStaggeredGridMeasureResult.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                lazyStaggeredGridMeasuredItem = null;
                break;
            }
            lazyStaggeredGridMeasuredItem = visibleItemsInfo.get(i10);
            if (lazyStaggeredGridMeasuredItem.getIndex() == iCalculateFirstVisibleIndex) {
                break;
            } else {
                i10++;
            }
        }
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = lazyStaggeredGridMeasuredItem;
        this.lastKnownFirstItemKey = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getKey() : null;
        this.nearestRangeState.update(iCalculateFirstVisibleIndex);
        if (this.hadFirstNotEmptyLayout || lazyStaggeredGridMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                update(lazyStaggeredGridMeasureResult.getFirstVisibleItemIndices(), lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets());
                C10786q c10786q = C10786q.f26013a;
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            }
        }
    }

    public final void updateScrollOffset(int[] iArr) {
        this.scrollOffsets = iArr;
        setScrollOffset(calculateFirstVisibleScrollOffset(this.indices, iArr));
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved(LazyLayoutItemProvider lazyLayoutItemProvider, int[] iArr) {
        Object obj = this.lastKnownFirstItemKey;
        Integer numM24043B0 = AbstractC10968r.m24043B0(iArr, 0);
        int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, obj, numM24043B0 != null ? numM24043B0.intValue() : 0);
        if (AbstractC10968r.m24086k0(iArr, iFindIndexByKey)) {
            return iArr;
        }
        this.nearestRangeState.update(iFindIndexByKey);
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            int[] iArr2 = (int[]) this.fillIndices.invoke(Integer.valueOf(iFindIndexByKey), Integer.valueOf(iArr.length));
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            this.indices = iArr2;
            setIndex(calculateFirstVisibleIndex(iArr2));
            return iArr2;
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
