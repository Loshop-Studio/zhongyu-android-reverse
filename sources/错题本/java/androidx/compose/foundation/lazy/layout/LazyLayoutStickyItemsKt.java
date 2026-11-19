package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001e\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0082\b¢\u0006\u0004\b\u0004\u0010\u0005\u001ao\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\b\b\u0000\u0010\u0007*\u00020\u0006*\u0004\u0018\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u001c\u001a\u00020\r*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m5110d2 = {"Lkotlin/Function0;", "", "generateMsg", "Ld6/s;", "debugLog", "(Lr6/a;)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "", "positionedItems", "Landroidx/collection/IntList;", "stickyItems", "", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "Lkotlin/Function1;", "getAndMeasure", "", "applyStickyItems", "(Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Ljava/util/List;Landroidx/collection/IntList;IIIILr6/c;)Ljava/util/List;", "", "Debug", "Z", "getMainAxisOffset", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "mainAxisOffset", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyLayoutStickyItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/IntList\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n1#2:221\n366#3:222\n237#3,4:233\n242#3:244\n230#4,3:223\n34#4,6:226\n233#4:232\n350#5,7:237\n*S KotlinDebug\n*F\n+ 1 LazyLayoutStickyItems.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt\n*L\n178#1:222\n191#1:233,4\n191#1:244\n188#1:223,3\n188#1:226,6\n188#1:232\n192#1:237,7\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutStickyItemsKt {
    private static final boolean Debug = false;

    @NotNull
    public static final <T extends LazyLayoutMeasuredItem> List<T> applyStickyItems(@Nullable StickyItemsPlacement stickyItemsPlacement, @NotNull List<T> list, @NotNull IntList intList, int i, int i8, int i9, int i10, @NotNull InterfaceC6471c interfaceC6471c) {
        StickyItemsPlacement stickyItemsPlacement2 = stickyItemsPlacement;
        if (stickyItemsPlacement2 == null || list.isEmpty() || intList._size == 0) {
            return EmptyList.INSTANCE;
        }
        IntList stickingIndices = stickyItemsPlacement2.getStickingIndices(((LazyLayoutMeasuredItem) AbstractC5805t.m5228h0(list)).getIndex(), ((LazyLayoutMeasuredItem) AbstractC5805t.m5235o0(list)).getIndex(), intList);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            T t8 = list.get(i11);
            if (intList.contains(t8.getIndex())) {
                arrayList2.add(t8);
            }
        }
        int[] iArr = stickingIndices.content;
        int i12 = stickingIndices._size;
        int i13 = 0;
        while (i13 < i12) {
            int i14 = iArr[i13];
            Iterator<T> it = list.iterator();
            int i15 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i15 = -1;
                    break;
                }
                if (it.next().getIndex() == i14) {
                    break;
                }
                i15++;
            }
            T tRemove = i15 == -1 ? (LazyLayoutMeasuredItem) interfaceC6471c.invoke(Integer.valueOf(i14)) : list.remove(i15);
            ArrayList arrayList3 = arrayList2;
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem = tRemove;
            int iCalculateStickingItemOffset = stickyItemsPlacement2.calculateStickingItemOffset(arrayList3, i14, tRemove.getMainAxisSizeWithSpacings(), i15 == -1 ? Integer.MIN_VALUE : getMainAxisOffset(tRemove), i, i8, i9, i10);
            lazyLayoutMeasuredItem.setNonScrollableItem(true);
            lazyLayoutMeasuredItem.position(iCalculateStickingItemOffset, 0, i9, i10);
            arrayList.add(lazyLayoutMeasuredItem);
            i13++;
            stickyItemsPlacement2 = stickyItemsPlacement;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo7376getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo7376getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m13434getYimpl(jMo7376getOffsetBjo55l4) : IntOffset.m13433getXimpl(jMo7376getOffsetBjo55l4);
    }

    private static final void debugLog(InterfaceC6469a interfaceC6469a) {
    }
}
