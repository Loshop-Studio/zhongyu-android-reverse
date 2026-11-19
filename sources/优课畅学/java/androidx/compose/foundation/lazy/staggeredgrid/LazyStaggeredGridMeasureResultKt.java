package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.unit.DensityKt;
import androidx.compose.p013ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC9080a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC9165e;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureResultKt {
    private static final int[] EmptyArray;
    private static final LazyStaggeredGridMeasureResult EmptyLazyStaggeredGridLayoutInfo;

    static {
        int[] iArr = new int[0];
        EmptyArray = iArr;
        EmptyLazyStaggeredGridLayoutInfo = new LazyStaggeredGridMeasureResult(iArr, iArr, 0.0f, new MeasureResult() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1
            private final Map<AlignmentLine, Integer> alignmentLines = AbstractC9080a.m15943h();
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
        }, 0.0f, false, false, false, new LazyStaggeredGridSlots(iArr, iArr), new LazyStaggeredGridSpanProvider(new MutableIntervalList()), DensityKt.Density$default(1.0f, 0.0f, 2, null), 0, AbstractC8809v.m14771n(), IntSize.Companion.m27075getZeroYbymL2g(), 0, 0, 0, 0, 0, AbstractC9165e.m16552a(EmptyCoroutineContext.f17438a), null);
    }

    public static final LazyStaggeredGridItemInfo findVisibleItem(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, final int i10) {
        if (lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int index = ((LazyStaggeredGridItemInfo) AbstractC8778f0.m14566l0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex();
        if (i10 > ((LazyStaggeredGridItemInfo) AbstractC8778f0.m14578x0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex() || index > i10) {
            return null;
        }
        return (LazyStaggeredGridItemInfo) AbstractC8778f0.m14569o0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), AbstractC8809v.m14769l(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), 0, 0, new InterfaceC10570l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Integer invoke(LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo) {
                return Integer.valueOf(lazyStaggeredGridItemInfo.getIndex() - i10);
            }
        }, 3, null));
    }

    public static final LazyStaggeredGridMeasureResult getEmptyLazyStaggeredGridLayoutInfo() {
        return EmptyLazyStaggeredGridLayoutInfo;
    }

    public static final int getSingleAxisViewportSize(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        return (int) (lazyStaggeredGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyStaggeredGridLayoutInfo.mo21067getViewportSizeYbymL2g() & 4294967295L : lazyStaggeredGridLayoutInfo.mo21067getViewportSizeYbymL2g() >> 32);
    }

    public static final int visibleItemsAverageSize(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        int size = visibleItemsInfo.size();
        int iMo21065getSizeYbymL2g = 0;
        for (int i10 = 0; i10 < size; i10++) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = visibleItemsInfo.get(i10);
            iMo21065getSizeYbymL2g += (int) (lazyStaggeredGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyStaggeredGridItemInfo.mo21065getSizeYbymL2g() & 4294967295L : lazyStaggeredGridItemInfo.mo21065getSizeYbymL2g() >> 32);
        }
        return (iMo21065getSizeYbymL2g / visibleItemsInfo.size()) + lazyStaggeredGridLayoutInfo.getMainAxisItemSpacing();
    }
}
