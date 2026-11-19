package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.unit.DensityKt;
import androidx.compose.p014ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureResultKt {
    private static final int[] EmptyArray;
    private static final LazyStaggeredGridMeasureResult EmptyLazyStaggeredGridLayoutInfo;

    static {
        int[] iArr = new int[0];
        EmptyArray = iArr;
        EmptyLazyStaggeredGridLayoutInfo = new LazyStaggeredGridMeasureResult(iArr, iArr, 0.0f, new MeasureResult() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1
            private final Map<AlignmentLine, Integer> alignmentLines = AbstractC9925a.m20088h();
            private final int height;
            private final int width;

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.p014ui.layout.MeasureResult
            public void placeChildren() {
            }
        }, 0.0f, false, false, false, new LazyStaggeredGridSlots(iArr, iArr), new LazyStaggeredGridSpanProvider(new MutableIntervalList()), DensityKt.Density$default(1.0f, 0.0f, 2, null), 0, AbstractC10978w.m24136n(), IntSize.Companion.m33677getZeroYbymL2g(), 0, 0, 0, 0, 0, AbstractC10006d.m20744a(EmptyCoroutineContext.f23351c), null);
    }

    public static final LazyStaggeredGridItemInfo findVisibleItem(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, final int i10) {
        if (lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int index = ((LazyStaggeredGridItemInfo) AbstractC10947g0.m23944m0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex();
        if (i10 > ((LazyStaggeredGridItemInfo) AbstractC10947g0.m23956y0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex() || index > i10) {
            return null;
        }
        return (LazyStaggeredGridItemInfo) AbstractC10947g0.m23947p0(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), AbstractC10978w.m24134l(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), 0, 0, new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Integer invoke(LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo) {
                return Integer.valueOf(lazyStaggeredGridItemInfo.getIndex() - i10);
            }
        }, 3, null));
    }

    public static final LazyStaggeredGridMeasureResult getEmptyLazyStaggeredGridLayoutInfo() {
        return EmptyLazyStaggeredGridLayoutInfo;
    }

    public static final int getSingleAxisViewportSize(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        return (int) (lazyStaggeredGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyStaggeredGridLayoutInfo.mo27669getViewportSizeYbymL2g() & 4294967295L : lazyStaggeredGridLayoutInfo.mo27669getViewportSizeYbymL2g() >> 32);
    }

    public static final int visibleItemsAverageSize(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        int size = visibleItemsInfo.size();
        int iMo27667getSizeYbymL2g = 0;
        for (int i10 = 0; i10 < size; i10++) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = visibleItemsInfo.get(i10);
            iMo27667getSizeYbymL2g += (int) (lazyStaggeredGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyStaggeredGridItemInfo.mo27667getSizeYbymL2g() & 4294967295L : lazyStaggeredGridItemInfo.mo27667getSizeYbymL2g() >> 32);
        }
        return (iMo27667getSizeYbymL2g / visibleItemsInfo.size()) + lazyStaggeredGridLayoutInfo.getMainAxisItemSpacing();
    }
}
