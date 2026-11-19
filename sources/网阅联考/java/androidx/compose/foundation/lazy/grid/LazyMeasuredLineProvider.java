package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.p006ui.unit.Constraints;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010%R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, m5175d2 = {"Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;", "", "isVertical", "", "slotSizesSums", "", "", "crossAxisSpacing", "gridItemsCount", "spaceBetweenLines", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "measuredLineFactory", "Landroidx/compose/foundation/lazy/grid/MeasuredLineFactory;", "(ZLjava/util/List;IIILandroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Landroidx/compose/foundation/lazy/grid/MeasuredLineFactory;)V", "keyToIndexMap", "", "getKeyToIndexMap", "()Ljava/util/Map;", "childConstraints", "Landroidx/compose/ui/unit/Constraints;", "startSlot", "span", "childConstraints-JhjzzOo$foundation_release", "(II)J", "getAndMeasure", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "lineIndex", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "getAndMeasure-bKFJvoY", "(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "itemConstraints", "itemIndex", "Landroidx/compose/foundation/lazy/grid/ItemIndex;", "itemConstraints-HZ0wssc", "(I)J", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyMeasuredLineProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMeasuredLineProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
/* loaded from: classes.dex */
public final class LazyMeasuredLineProvider {
    private final int crossAxisSpacing;
    private final int gridItemsCount;
    private final boolean isVertical;
    private final LazyMeasuredItemProvider measuredItemProvider;
    private final MeasuredLineFactory measuredLineFactory;
    private final List<Integer> slotSizesSums;
    private final int spaceBetweenLines;
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyMeasuredLineProvider(boolean z3, List<Integer> slotSizesSums, int i4, int i5, int i6, LazyMeasuredItemProvider measuredItemProvider, LazyGridSpanLayoutProvider spanLayoutProvider, MeasuredLineFactory measuredLineFactory) {
        Intrinsics.checkNotNullParameter(slotSizesSums, "slotSizesSums");
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        Intrinsics.checkNotNullParameter(measuredLineFactory, "measuredLineFactory");
        this.isVertical = z3;
        this.slotSizesSums = slotSizesSums;
        this.crossAxisSpacing = i4;
        this.gridItemsCount = i5;
        this.spaceBetweenLines = i6;
        this.measuredItemProvider = measuredItemProvider;
        this.spanLayoutProvider = spanLayoutProvider;
        this.measuredLineFactory = measuredLineFactory;
    }

    /* renamed from: childConstraints-JhjzzOo$foundation_release, reason: not valid java name */
    public final long m7493childConstraintsJhjzzOo$foundation_release(int startSlot, int span) {
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast((this.slotSizesSums.get((startSlot + span) - 1).intValue() - (startSlot == 0 ? 0 : this.slotSizesSums.get(startSlot - 1).intValue())) + (this.crossAxisSpacing * (span - 1)), 0);
        return this.isVertical ? Constraints.INSTANCE.m11503fixedWidthOenEA2s(iCoerceAtLeast) : Constraints.INSTANCE.m11502fixedHeightOenEA2s(iCoerceAtLeast);
    }

    /* renamed from: getAndMeasure-bKFJvoY, reason: not valid java name */
    public final LazyGridMeasuredLine m7494getAndMeasurebKFJvoY(int lineIndex) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(lineIndex);
        int size = lineConfiguration.getSpans().size();
        int i4 = (size == 0 || lineConfiguration.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            int iM7444getCurrentLineSpanimpl = GridItemSpan.m7444getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i6).getPackedValue());
            LazyGridMeasuredItem lazyGridMeasuredItemM7492getAndMeasureednRnyU = this.measuredItemProvider.m7492getAndMeasureednRnyU(ItemIndex.m7450constructorimpl(lineConfiguration.getFirstItemIndex() + i6), i4, m7493childConstraintsJhjzzOo$foundation_release(i5, iM7444getCurrentLineSpanimpl));
            i5 += iM7444getCurrentLineSpanimpl;
            Unit unit = Unit.INSTANCE;
            lazyGridMeasuredItemArr[i6] = lazyGridMeasuredItemM7492getAndMeasureednRnyU;
        }
        return this.measuredLineFactory.mo7478createLineH9FfpSk(lineIndex, lazyGridMeasuredItemArr, lineConfiguration.getSpans(), i4);
    }

    public final Map<Object, Integer> getKeyToIndexMap() {
        return this.measuredItemProvider.getKeyToIndexMap();
    }

    /* renamed from: itemConstraints-HZ0wssc, reason: not valid java name */
    public final long m7495itemConstraintsHZ0wssc(int itemIndex) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.spanLayoutProvider;
        return m7493childConstraintsJhjzzOo$foundation_release(0, lazyGridSpanLayoutProvider.spanOf(itemIndex, lazyGridSpanLayoutProvider.getSlotsPerLine()));
    }
}
