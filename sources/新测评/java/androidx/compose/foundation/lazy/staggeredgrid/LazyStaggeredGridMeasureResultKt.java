package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.unit.DensityKt;
import androidx.compose.p013ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(m13557d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\b2\u0006\u0010\r\u001a\u00020\u0007H\u0000\u001a\f\u0010\u000e\u001a\u00020\u0007*\u00020\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m13558d2 = {"EmptyArray", "", "EmptyLazyStaggeredGridLayoutInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "getEmptyLazyStaggeredGridLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;)I", "findVisibleItem", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "itemIndex", "visibleItemsAverageSize", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResultKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,297:1\n133#2,3:298\n34#2,4:301\n39#2:309\n136#2:310\n59#3:305\n54#3:307\n59#3:311\n54#3:313\n90#4:306\n85#4:308\n90#4:312\n85#4:314\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResultKt\n*L\n280#1:298,3\n280#1:301,4\n280#1:309\n280#1:310\n282#1:305\n284#1:307\n293#1:311\n295#1:313\n282#1:306\n284#1:308\n293#1:312\n295#1:314\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureResultKt {
    private static final int[] EmptyArray;
    private static final LazyStaggeredGridMeasureResult EmptyLazyStaggeredGridLayoutInfo;

    static {
        int[] iArr = new int[0];
        EmptyArray = iArr;
        EmptyLazyStaggeredGridLayoutInfo = new LazyStaggeredGridMeasureResult(iArr, iArr, 0.0f, new MeasureResult() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1
            private final Map<AlignmentLine, Integer> alignmentLines = MapsKt.emptyMap();
            private final int height;
            private final int width;

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public void placeChildren() {
            }
        }, 0.0f, false, false, false, new LazyStaggeredGridSlots(iArr, iArr), new LazyStaggeredGridSpanProvider(new MutableIntervalList()), DensityKt.Density$default(1.0f, 0.0f, 2, null), 0, CollectionsKt.emptyList(), IntSize.INSTANCE.m23737getZeroYbymL2g(), 0, 0, 0, 0, 0, CoroutineScopeKt.CoroutineScope(EmptyCoroutineContext.INSTANCE), null);
    }

    public static final LazyStaggeredGridItemInfo findVisibleItem(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, final int i10) {
        if (lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int index = ((LazyStaggeredGridItemInfo) CollectionsKt.first((List) lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex();
        if (i10 > ((LazyStaggeredGridItemInfo) CollectionsKt.last((List) lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex() || index > i10) {
            return null;
        }
        return (LazyStaggeredGridItemInfo) CollectionsKt.getOrNull(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), CollectionsKt.binarySearch$default(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), 0, 0, new Function1<LazyStaggeredGridItemInfo, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo) {
                return Integer.valueOf(lazyStaggeredGridItemInfo.getIndex() - i10);
            }
        }, 3, (Object) null));
    }

    public static final LazyStaggeredGridMeasureResult getEmptyLazyStaggeredGridLayoutInfo() {
        return EmptyLazyStaggeredGridLayoutInfo;
    }

    public static final int getSingleAxisViewportSize(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        return (int) (lazyStaggeredGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyStaggeredGridLayoutInfo.getViewportSize() & 4294967295L : lazyStaggeredGridLayoutInfo.getViewportSize() >> 32);
    }

    public static final int visibleItemsAverageSize(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        int size = visibleItemsInfo.size();
        int size2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = visibleItemsInfo.get(i10);
            size2 += (int) (lazyStaggeredGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyStaggeredGridItemInfo.getSize() & 4294967295L : lazyStaggeredGridItemInfo.getSize() >> 32);
        }
        return (size2 / visibleItemsInfo.size()) + lazyStaggeredGridLayoutInfo.getMainAxisItemSpacing();
    }
}
