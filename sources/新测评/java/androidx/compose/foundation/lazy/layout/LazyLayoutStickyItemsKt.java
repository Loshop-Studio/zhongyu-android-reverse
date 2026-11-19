package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b\u001ah\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\b\b\u0000\u0010\u000e*\u00020\u0004*\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u000e0\u0019H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, m13558d2 = {"Debug", "", "mainAxisOffset", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "getMainAxisOffset", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "applyStickyItems", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "positionedItems", "", "stickyItems", "Landroidx/collection/IntList;", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "getAndMeasure", "Lkotlin/Function1;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutStickyItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/IntList\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n1#2:221\n366#3:222\n237#3,4:233\n242#3:244\n230#4,3:223\n34#4,6:226\n233#4:232\n350#5,7:237\n*S KotlinDebug\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt\n*L\n178#1:222\n191#1:233,4\n191#1:244\n188#1:223,3\n188#1:226,6\n188#1:232\n192#1:237,7\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutStickyItemsKt {
    private static final boolean Debug = false;

    public static final <T extends LazyLayoutMeasuredItem> List<T> applyStickyItems(StickyItemsPlacement stickyItemsPlacement, List<T> list, IntList intList, int i10, int i11, int i12, int i13, Function1<? super Integer, ? extends T> function1) {
        StickyItemsPlacement stickyItemsPlacement2 = stickyItemsPlacement;
        if (stickyItemsPlacement2 == null || list.isEmpty() || intList._size == 0) {
            return CollectionsKt.emptyList();
        }
        IntList stickingIndices = stickyItemsPlacement2.getStickingIndices(((LazyLayoutMeasuredItem) CollectionsKt.first((List) list)).getIndex(), ((LazyLayoutMeasuredItem) CollectionsKt.last((List) list)).getIndex(), intList);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            T t10 = list.get(i14);
            if (intList.contains(t10.getIndex())) {
                arrayList2.add(t10);
            }
        }
        int[] iArr = stickingIndices.content;
        int i15 = stickingIndices._size;
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr[i16];
            Iterator<T> it = list.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (it.next().getIndex() == i17) {
                    break;
                }
                i18++;
            }
            T tInvoke = i18 == -1 ? function1.invoke(Integer.valueOf(i17)) : list.remove(i18);
            ArrayList arrayList3 = arrayList2;
            T t11 = tInvoke;
            int iCalculateStickingItemOffset = stickyItemsPlacement2.calculateStickingItemOffset(arrayList3, i17, tInvoke.getMainAxisSizeWithSpacings(), i18 == -1 ? Integer.MIN_VALUE : getMainAxisOffset(tInvoke), i10, i11, i12, i13);
            t11.setNonScrollableItem(true);
            t11.position(iCalculateStickingItemOffset, 0, i12, i13);
            arrayList.add(t11);
            i16++;
            stickyItemsPlacement2 = stickyItemsPlacement;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }

    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo17795getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo17795getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m23690getYimpl(jMo17795getOffsetBjo55l4) : IntOffset.m23689getXimpl(jMo17795getOffsetBjo55l4);
    }
}
