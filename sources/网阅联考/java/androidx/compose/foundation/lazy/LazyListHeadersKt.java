package androidx.compose.foundation.lazy;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000¨\u0006\f"}, m5175d2 = {"findOrComposeLazyListHeader", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "composedVisibleItems", "", "itemProvider", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "headerIndexes", "", "", "beforeContentPadding", "layoutWidth", "layoutHeight", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyListHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,94:1\n1#2:95\n69#3,6:96\n*S KotlinDebug\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n*L\n57#1:96,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListHeadersKt {
    public static final LazyListPositionedItem findOrComposeLazyListHeader(List<LazyListPositionedItem> composedVisibleItems, LazyMeasuredItemProvider itemProvider, List<Integer> headerIndexes, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(composedVisibleItems, "composedVisibleItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        int index = ((LazyListPositionedItem) CollectionsKt___CollectionsKt.first((List) composedVisibleItems)).getIndex();
        int size = headerIndexes.size();
        int iIntValue = -1;
        int iIntValue2 = -1;
        int i7 = 0;
        while (i7 < size && headerIndexes.get(i7).intValue() <= index) {
            iIntValue = headerIndexes.get(i7).intValue();
            i7++;
            iIntValue2 = ((i7 < 0 || i7 > CollectionsKt__CollectionsKt.getLastIndex(headerIndexes)) ? -1 : headerIndexes.get(i7)).intValue();
        }
        int size2 = composedVisibleItems.size();
        int offset = Integer.MIN_VALUE;
        int offset2 = Integer.MIN_VALUE;
        int i8 = -1;
        for (int i9 = 0; i9 < size2; i9++) {
            LazyListPositionedItem lazyListPositionedItem = composedVisibleItems.get(i9);
            if (lazyListPositionedItem.getIndex() == iIntValue) {
                offset = lazyListPositionedItem.getOffset();
                i8 = i9;
            } else if (lazyListPositionedItem.getIndex() == iIntValue2) {
                offset2 = lazyListPositionedItem.getOffset();
            }
        }
        if (iIntValue == -1) {
            return null;
        }
        LazyMeasuredItem lazyMeasuredItemM7435getAndMeasureZjPyQlc = itemProvider.m7435getAndMeasureZjPyQlc(DataIndex.m7404constructorimpl(iIntValue));
        int iMax = offset != Integer.MIN_VALUE ? Math.max(-i4, offset) : -i4;
        if (offset2 != Integer.MIN_VALUE) {
            iMax = Math.min(iMax, offset2 - lazyMeasuredItemM7435getAndMeasureZjPyQlc.getSize());
        }
        LazyListPositionedItem lazyListPositionedItemPosition = lazyMeasuredItemM7435getAndMeasureZjPyQlc.position(iMax, i5, i6);
        if (i8 != -1) {
            composedVisibleItems.set(i8, lazyListPositionedItemPosition);
        } else {
            composedVisibleItems.add(0, lazyListPositionedItemPosition);
        }
        return lazyListPositionedItemPosition;
    }
}
