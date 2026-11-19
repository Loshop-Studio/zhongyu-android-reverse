package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p006ui.unit.Constraints;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0018ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, m5175d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "", "isVertical", "", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "measureScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "resolvedSlotSums", "", "crossAxisSpacing", "", "measuredItemFactory", "Landroidx/compose/foundation/lazy/staggeredgrid/MeasuredItemFactory;", "(ZLandroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;[IILandroidx/compose/foundation/lazy/staggeredgrid/MeasuredItemFactory;)V", "childConstraints", "Landroidx/compose/ui/unit/Constraints;", "slot", "span", "childConstraints-JhjzzOo", "(II)J", "getAndMeasure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "index", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "getAndMeasure-jy6DScQ", "(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1097:1\n878#2:1098\n880#2:1100\n879#2:1101\n878#2:1103\n880#2:1105\n879#2:1106\n878#2:1108\n55#3:1099\n62#3:1102\n55#3:1104\n62#3:1107\n55#3:1109\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n*L\n993#1:1098\n993#1:1100\n993#1:1101\n994#1:1103\n994#1:1105\n994#1:1106\n994#1:1108\n993#1:1099\n993#1:1102\n994#1:1104\n994#1:1107\n994#1:1109\n*E\n"})
/* loaded from: classes.dex */
final class LazyStaggeredGridMeasureProvider {
    private final int crossAxisSpacing;
    private final boolean isVertical;
    private final LazyLayoutItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;
    private final MeasuredItemFactory measuredItemFactory;
    private final int[] resolvedSlotSums;

    public LazyStaggeredGridMeasureProvider(boolean z3, LazyLayoutItemProvider itemProvider, LazyLayoutMeasureScope measureScope, int[] resolvedSlotSums, int i4, MeasuredItemFactory measuredItemFactory) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        Intrinsics.checkNotNullParameter(resolvedSlotSums, "resolvedSlotSums");
        Intrinsics.checkNotNullParameter(measuredItemFactory, "measuredItemFactory");
        this.isVertical = z3;
        this.itemProvider = itemProvider;
        this.measureScope = measureScope;
        this.resolvedSlotSums = resolvedSlotSums;
        this.crossAxisSpacing = i4;
        this.measuredItemFactory = measuredItemFactory;
    }

    /* renamed from: childConstraints-JhjzzOo, reason: not valid java name */
    private final long m7539childConstraintsJhjzzOo(int slot, int span) {
        int i4 = (this.resolvedSlotSums[(slot + span) - 1] - (slot == 0 ? 0 : this.resolvedSlotSums[slot - 1])) + (this.crossAxisSpacing * (span - 1));
        return this.isVertical ? Constraints.INSTANCE.m11503fixedWidthOenEA2s(i4) : Constraints.INSTANCE.m11502fixedHeightOenEA2s(i4);
    }

    /* renamed from: getAndMeasure-jy6DScQ, reason: not valid java name */
    public final LazyStaggeredGridMeasuredItem m7540getAndMeasurejy6DScQ(int index, long span) {
        int i4 = (int) (span >> 32);
        int i5 = ((int) (span & 4294967295L)) - i4;
        return this.measuredItemFactory.createItem(index, i4, i5, this.itemProvider.getKey(index), this.measureScope.mo7517measure0kLqBqw(index, m7539childConstraintsJhjzzOo(i4, i5)));
    }
}
