package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aR\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\nH\u0083\bø\u0001\u0000\u001a\u008c\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#H\u0002\u001aê\u0001\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010\u0003\u001a\u00020\u00042/\u00107\u001a+\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:0\n¢\u0006\u0002\b;\u0012\u0004\u0012\u00020<08H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a$\u0010?\u001a\u00020\u0012*\u00020\u00022\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006A"}, m5175d2 = {"calculateExtraItems", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/ItemIndex;", "Landroidx/compose/ui/unit/Constraints;", "filter", "", "", "calculateItemsOffsets", "", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "lines", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "isVertical", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "measureLazyGrid", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "itemsCount", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "firstVisibleLineScrollOffset", "scrollToBeConsumed", "", "constraints", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "layout", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyGrid-t5wl_D8", "(ILandroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "positionExtraItem", "mainAxisOffset", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 ItemIndex.kt\nandroidx/compose/foundation/lazy/grid/LineIndex\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,435:1\n315#1,3:446\n318#1,14:453\n333#1:468\n315#1,3:469\n318#1,14:476\n333#1:491\n30#2:436\n25#2:441\n27#2:443\n25#2:444\n30#2:445\n33#3,4:437\n38#3:442\n33#3,4:449\n38#3:467\n33#3,4:472\n38#3:490\n33#3,4:495\n38#3:501\n33#3,6:503\n132#3,3:509\n33#3,4:512\n135#3,2:516\n38#3:518\n137#3:519\n33#3,6:520\n33#3,6:526\n33#3,6:532\n36#4,3:492\n39#4,2:499\n41#4:502\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n213#1:446,3\n213#1:453,14\n213#1:468\n221#1:469,3\n221#1:476,14\n221#1:491\n118#1:436\n142#1:441\n163#1:443\n168#1:444\n178#1:445\n141#1:437,4\n141#1:442\n213#1:449,4\n213#1:467\n221#1:472,4\n221#1:490\n294#1:495,4\n294#1:501\n317#1:503,6\n360#1:509,3\n360#1:512,4\n360#1:516,2\n360#1:518\n360#1:519\n403#1:520,6\n409#1:526,6\n414#1:532,6\n294#1:492,3\n294#1:499,2\n294#1:502\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridMeasureKt {
    @ExperimentalFoundationApi
    private static final List<LazyGridMeasuredItem> calculateExtraItems(LazyLayoutPinnedItemList lazyLayoutPinnedItemList, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyGridItemProvider lazyGridItemProvider, Function1<? super ItemIndex, Constraints> function1, Function1<? super Integer, Boolean> function12) {
        int size = lazyLayoutPinnedItemList.size();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList.get(i4);
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyGridItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (function12.invoke(Integer.valueOf(iFindIndexByKey)).booleanValue()) {
                int iM7450constructorimpl = ItemIndex.m7450constructorimpl(iFindIndexByKey);
                LazyGridMeasuredItem lazyGridMeasuredItemM7491getAndMeasureednRnyU$default = LazyMeasuredItemProvider.m7491getAndMeasureednRnyU$default(lazyMeasuredItemProvider, iM7450constructorimpl, 0, function1.invoke(ItemIndex.m7448boximpl(iM7450constructorimpl)).getValue(), 2, null);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyGridMeasuredItemM7491getAndMeasureednRnyU$default);
            }
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyGridPositionedItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i4, int i5, int i6, int i7, int i8, boolean z3, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z4, Density density) {
        int i9 = z3 ? i5 : i4;
        boolean z5 = i6 < Math.min(i9, i7);
        if (z5) {
            if (!(i8 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        int size = list.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += list.get(i10).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z5) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i11 = 0; i11 < size2; i11++) {
                iArr[i11] = list.get(calculateItemsOffsets$reverseAware(i11, z4, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            for (int i12 = 0; i12 < size2; i12++) {
                iArr2[i12] = 0;
            }
            if (z3) {
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                vertical.arrange(density, i9, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                horizontal.arrange(density, i9, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntProgression indices = ArraysKt___ArraysKt.getIndices(iArr2);
            if (z4) {
                indices = RangesKt___RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int mainAxisSize = iArr2[first];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(first, z4, size2));
                    if (z4) {
                        mainAxisSize = (i9 - mainAxisSize) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    arrayList.addAll(lazyGridMeasuredLine.position(mainAxisSize, i4, i5));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size();
            int mainAxisSizeWithSpacings = i8;
            for (int i13 = 0; i13 < size3; i13++) {
                LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(i13);
                mainAxisSizeWithSpacings -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                arrayList.add(positionExtraItem(lazyGridMeasuredItem, mainAxisSizeWithSpacings, i4, i5));
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i8;
            for (int i14 = 0; i14 < size4; i14++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i14);
                arrayList.addAll(lazyGridMeasuredLine2.position(mainAxisSizeWithSpacings2, i4, i5));
                mainAxisSizeWithSpacings2 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i15 = 0; i15 < size5; i15++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i15);
                arrayList.add(positionExtraItem(lazyGridMeasuredItem2, mainAxisSizeWithSpacings2, i4, i5));
                mainAxisSizeWithSpacings2 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i4, boolean z3, int i5) {
        return !z3 ? i4 : (i5 - i4) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d8  */
    /* renamed from: measureLazyGrid-t5wl_D8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m7479measureLazyGridt5wl_D8(int r34, androidx.compose.foundation.lazy.grid.LazyGridItemProvider r35, androidx.compose.foundation.lazy.grid.LazyMeasuredLineProvider r36, androidx.compose.foundation.lazy.grid.LazyMeasuredItemProvider r37, int r38, int r39, int r40, int r41, int r42, int r43, float r44, long r45, boolean r47, androidx.compose.foundation.layout.Arrangement.Vertical r48, androidx.compose.foundation.layout.Arrangement.Horizontal r49, boolean r50, androidx.compose.p006ui.unit.Density r51, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r52, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider r53, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList r54, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>, ? extends androidx.compose.p006ui.layout.MeasureResult> r55) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m7479measureLazyGridt5wl_D8(int, androidx.compose.foundation.lazy.grid.LazyGridItemProvider, androidx.compose.foundation.lazy.grid.LazyMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList, kotlin.jvm.functions.Function3):androidx.compose.foundation.lazy.grid.LazyGridMeasureResult");
    }

    private static final LazyGridPositionedItem positionExtraItem(LazyGridMeasuredItem lazyGridMeasuredItem, int i4, int i5, int i6) {
        return lazyGridMeasuredItem.position(i4, 0, i5, i6, 0, 0);
    }
}
