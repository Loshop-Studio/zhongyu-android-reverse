package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.compose.p014ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
public final class LazyLayoutStickyItemsKt {
    private static final boolean Debug = false;

    public static final <T extends LazyLayoutMeasuredItem> List<T> applyStickyItems(StickyItemsPlacement stickyItemsPlacement, List<T> list, IntList intList, int i10, int i11, int i12, int i13, InterfaceC9540l interfaceC9540l) {
        StickyItemsPlacement stickyItemsPlacement2 = stickyItemsPlacement;
        if (stickyItemsPlacement2 == null || list.isEmpty() || intList._size == 0) {
            return AbstractC10978w.m24136n();
        }
        IntList stickingIndices = stickyItemsPlacement2.getStickingIndices(((LazyLayoutMeasuredItem) AbstractC10947g0.m23944m0(list)).getIndex(), ((LazyLayoutMeasuredItem) AbstractC10947g0.m23956y0(list)).getIndex(), intList);
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
            T tRemove = i18 == -1 ? (LazyLayoutMeasuredItem) interfaceC9540l.invoke(Integer.valueOf(i17)) : list.remove(i18);
            ArrayList arrayList3 = arrayList2;
            LazyLayoutMeasuredItem lazyLayoutMeasuredItem = tRemove;
            int iCalculateStickingItemOffset = stickyItemsPlacement2.calculateStickingItemOffset(arrayList3, i17, tRemove.getMainAxisSizeWithSpacings(), i18 == -1 ? Integer.MIN_VALUE : getMainAxisOffset(tRemove), i10, i11, i12, i13);
            lazyLayoutMeasuredItem.setNonScrollableItem(true);
            lazyLayoutMeasuredItem.position(iCalculateStickingItemOffset, 0, i12, i13);
            arrayList.add(lazyLayoutMeasuredItem);
            i16++;
            stickyItemsPlacement2 = stickyItemsPlacement;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo27572getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo27572getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.isVertical() ? IntOffset.m33630getYimpl(jMo27572getOffsetBjo55l4) : IntOffset.m33629getXimpl(jMo27572getOffsetBjo55l4);
    }

    private static final void debugLog(InterfaceC9529a interfaceC9529a) {
    }
}
