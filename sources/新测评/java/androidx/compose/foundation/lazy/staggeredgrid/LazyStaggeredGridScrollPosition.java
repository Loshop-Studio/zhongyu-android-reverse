package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00126\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\fJ\u0010\u0010%\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0018\u0010&\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0002J\u0016\u0010(\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007J\u0018\u0010*\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0002J\u000e\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020)2\u0006\u0010#\u001a\u00020\u0003J\u0016\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u0002012\u0006\u0010\u0017\u001a\u00020\u0003R>\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR+\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\u001e\u0010#\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019¨\u00062"}, m13558d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "", "initialIndices", "", "initialOffsets", "fillIndices", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "targetIndex", "laneCount", "([I[ILkotlin/jvm/functions/Function2;)V", "hadFirstNotEmptyLayout", "", "<set-?>", "index", "getIndex", "()I", "setIndex", "(I)V", "index$delegate", "Landroidx/compose/runtime/MutableIntState;", "indices", "getIndices", "()[I", "lastKnownFirstItemKey", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "scrollOffset", "getScrollOffset", "setScrollOffset", "scrollOffset$delegate", "scrollOffsets", "getScrollOffsets", "calculateFirstVisibleIndex", "calculateFirstVisibleScrollOffset", "offsets", "requestPositionAndForgetLastKnownKey", "", "update", "updateFromMeasureResult", "measureResult", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "updateScrollOffset", "updateScrollPositionIfTheFirstItemWasMoved", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,170:1\n78#2:171\n107#2,2:172\n78#2:174\n107#2,2:175\n13330#3,2:177\n117#4,2:179\n34#4,6:181\n119#4:187\n602#5,8:188\n602#5,8:196\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n*L\n37#1:171\n37#1:172,2\n44#1:174\n44#1:175,2\n49#1:177,2\n86#1:179,2\n86#1:181,6\n86#1:187\n93#1:188,8\n145#1:196,8\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridScrollPosition {
    public static final int $stable = 8;
    private final Function2<Integer, Integer, int[]> fillIndices;
    private boolean hadFirstNotEmptyLayout;

    /* renamed from: index$delegate, reason: from kotlin metadata */
    private final MutableIntState index;
    private int[] indices;
    private Object lastKnownFirstItemKey;
    private final LazyLayoutNearestRangeState nearestRangeState;

    /* renamed from: scrollOffset$delegate, reason: from kotlin metadata */
    private final MutableIntState scrollOffset;
    private int[] scrollOffsets;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridScrollPosition(int[] iArr, int[] iArr2, Function2<? super Integer, ? super Integer, int[]> function2) {
        this.fillIndices = function2;
        this.indices = iArr;
        this.index = SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleIndex(iArr));
        this.scrollOffsets = iArr2;
        this.scrollOffset = SnapshotIntStateKt.mutableIntStateOf(calculateFirstVisibleScrollOffset(iArr, iArr2));
        Integer numMinOrNull = ArraysKt.minOrNull(iArr);
        this.nearestRangeState = new LazyLayoutNearestRangeState(numMinOrNull != null ? numMinOrNull.intValue() : 0, 90, 200);
    }

    private final int calculateFirstVisibleIndex(int[] indices) {
        int i10 = Integer.MAX_VALUE;
        for (int i11 : indices) {
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

    private final int calculateFirstVisibleScrollOffset(int[] indices, int[] offsets) {
        int iCalculateFirstVisibleIndex = calculateFirstVisibleIndex(indices);
        int length = offsets.length;
        int iMin = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < length; i10++) {
            if (indices[i10] == iCalculateFirstVisibleIndex) {
                iMin = Math.min(iMin, offsets[i10]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    private final void setIndex(int i10) {
        this.index.setIntValue(i10);
    }

    private final void setScrollOffset(int i10) {
        this.scrollOffset.setIntValue(i10);
    }

    private final void update(int[] indices, int[] offsets) {
        this.indices = indices;
        setIndex(calculateFirstVisibleIndex(indices));
        this.scrollOffsets = offsets;
        setScrollOffset(calculateFirstVisibleScrollOffset(indices, offsets));
    }

    public final int getIndex() {
        return this.index.getIntValue();
    }

    public final int[] getIndices() {
        return this.indices;
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset.getIntValue();
    }

    public final int[] getScrollOffsets() {
        return this.scrollOffsets;
    }

    public final void requestPositionAndForgetLastKnownKey(int index, int scrollOffset) {
        int[] iArrInvoke = this.fillIndices.invoke(Integer.valueOf(index), Integer.valueOf(this.indices.length));
        int length = iArrInvoke.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = scrollOffset;
        }
        update(iArrInvoke, iArr);
        this.nearestRangeState.update(index);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateFromMeasureResult(LazyStaggeredGridMeasureResult measureResult) {
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem;
        int iCalculateFirstVisibleIndex = calculateFirstVisibleIndex(measureResult.getFirstVisibleItemIndices());
        List<LazyStaggeredGridMeasuredItem> visibleItemsInfo = measureResult.getVisibleItemsInfo();
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
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            Snapshot.Companion companion = Snapshot.INSTANCE;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                update(measureResult.getFirstVisibleItemIndices(), measureResult.getFirstVisibleItemScrollOffsets());
                Unit unit = Unit.INSTANCE;
            } finally {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            }
        }
    }

    public final void updateScrollOffset(int[] scrollOffsets) {
        this.scrollOffsets = scrollOffsets;
        setScrollOffset(calculateFirstVisibleScrollOffset(this.indices, scrollOffsets));
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved(LazyLayoutItemProvider itemProvider, int[] indices) {
        Object obj = this.lastKnownFirstItemKey;
        Integer orNull = ArraysKt.getOrNull(indices, 0);
        int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, obj, orNull != null ? orNull.intValue() : 0);
        if (ArraysKt.contains(indices, iFindIndexByKey)) {
            return indices;
        }
        this.nearestRangeState.update(iFindIndexByKey);
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            int[] iArrInvoke = this.fillIndices.invoke(Integer.valueOf(iFindIndexByKey), Integer.valueOf(indices.length));
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            this.indices = iArrInvoke;
            setIndex(calculateFirstVisibleIndex(iArrInvoke));
            return iArrInvoke;
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
