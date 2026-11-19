package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

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
    public final long m27606childConstraintsJhjzzOo$foundation_release(int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = this.slots.getSizes()[i10];
        } else {
            int i13 = (i11 + i10) - 1;
            i12 = (this.slots.getPositions()[i13] + this.slots.getSizes()[i13]) - this.slots.getPositions()[i10];
        }
        int iM21752e = AbstractC10410o.m21752e(i12, 0);
        return this.isVertical ? Constraints.Companion.m33466fixedWidthOenEA2s(iM21752e) : Constraints.Companion.m33465fixedHeightOenEA2s(iM21752e);
    }

    public abstract LazyGridMeasuredLine createLine(int i10, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list, int i11);

    public final LazyGridMeasuredLine getAndMeasure(int i10) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(i10);
        int size = lineConfiguration.getSpans().size();
        int i11 = (size == 0 || lineConfiguration.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            int iM27583getCurrentLineSpanimpl = GridItemSpan.m27583getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i13).m27586unboximpl());
            LazyGridMeasuredItem lazyGridMeasuredItemM27605getAndMeasurem8Kt_7k = this.measuredItemProvider.m27605getAndMeasurem8Kt_7k(lineConfiguration.getFirstItemIndex() + i13, m27606childConstraintsJhjzzOo$foundation_release(i12, iM27583getCurrentLineSpanimpl), i12, iM27583getCurrentLineSpanimpl, i11);
            i12 += iM27583getCurrentLineSpanimpl;
            C10786q c10786q = C10786q.f26013a;
            lazyGridMeasuredItemArr[i13] = lazyGridMeasuredItemM27605getAndMeasurem8Kt_7k;
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
