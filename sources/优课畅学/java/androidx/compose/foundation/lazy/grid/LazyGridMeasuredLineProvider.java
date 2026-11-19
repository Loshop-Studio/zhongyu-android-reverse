package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import p077d8.AbstractC8323h;
import p123h7.C8736p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class LazyGridMeasuredLineProvider {
    public static final int $stable = 8;
    private final int gridItemsCount;
    private final boolean isVertical;
    private final LazyGridMeasuredItemProvider measuredItemProvider;
    private final LazyGridSlots slots;
    private final int spaceBetweenLines;
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyGridMeasuredLineProvider(boolean z10, LazyGridSlots lazyGridSlots, int i10, int i11, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        this.isVertical = z10;
        this.slots = lazyGridSlots;
        this.gridItemsCount = i10;
        this.spaceBetweenLines = i11;
        this.measuredItemProvider = lazyGridMeasuredItemProvider;
        this.spanLayoutProvider = lazyGridSpanLayoutProvider;
    }

    /* renamed from: childConstraints-JhjzzOo$foundation_release, reason: not valid java name */
    public final long m21004childConstraintsJhjzzOo$foundation_release(int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = this.slots.getSizes()[i10];
        } else {
            int i13 = (i11 + i10) - 1;
            i12 = (this.slots.getPositions()[i13] + this.slots.getSizes()[i13]) - this.slots.getPositions()[i10];
        }
        int iM13510e = AbstractC8323h.m13510e(i12, 0);
        return this.isVertical ? Constraints.Companion.m26864fixedWidthOenEA2s(iM13510e) : Constraints.Companion.m26863fixedHeightOenEA2s(iM13510e);
    }

    public abstract LazyGridMeasuredLine createLine(int i10, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list, int i11);

    public final LazyGridMeasuredLine getAndMeasure(int i10) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(i10);
        int size = lineConfiguration.getSpans().size();
        int i11 = (size == 0 || lineConfiguration.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            int iM20981getCurrentLineSpanimpl = GridItemSpan.m20981getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i13).m20984unboximpl());
            LazyGridMeasuredItem lazyGridMeasuredItemM21003getAndMeasurem8Kt_7k = this.measuredItemProvider.m21003getAndMeasurem8Kt_7k(lineConfiguration.getFirstItemIndex() + i13, m21004childConstraintsJhjzzOo$foundation_release(i12, iM20981getCurrentLineSpanimpl), i12, iM20981getCurrentLineSpanimpl, i11);
            i12 += iM20981getCurrentLineSpanimpl;
            C8736p c8736p = C8736p.f16368a;
            lazyGridMeasuredItemArr[i13] = lazyGridMeasuredItemM21003getAndMeasurem8Kt_7k;
        }
        return createLine(i10, lazyGridMeasuredItemArr, lineConfiguration.getSpans(), i11);
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.measuredItemProvider.getKeyIndexMap();
    }

    public final int spanOf(int i10) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.spanLayoutProvider;
        return lazyGridSpanLayoutProvider.spanOf(i10, lazyGridSpanLayoutProvider.getSlotsPerLine());
    }
}
