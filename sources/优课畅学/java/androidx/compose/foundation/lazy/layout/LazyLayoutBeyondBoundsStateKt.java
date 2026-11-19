package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import java.util.ArrayList;
import java.util.List;
import p077d8.C8321f;
import p134i7.AbstractC8809v;

/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsStateKt {
    public static final List<Integer> calculateLazyLayoutPinnedIndices(LazyLayoutItemProvider lazyLayoutItemProvider, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo) {
        if (!lazyLayoutBeyondBoundsInfo.hasIntervals() && lazyLayoutPinnedItemList.isEmpty()) {
            return AbstractC8809v.m14771n();
        }
        ArrayList arrayList = new ArrayList();
        C8321f c8321f = lazyLayoutBeyondBoundsInfo.hasIntervals() ? new C8321f(lazyLayoutBeyondBoundsInfo.getStart(), Math.min(lazyLayoutBeyondBoundsInfo.getEnd(), lazyLayoutItemProvider.getItemCount() - 1)) : C8321f.f15784e.m13505a();
        int size = lazyLayoutPinnedItemList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList.get(i10);
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            int iM13496b = c8321f.m13496b();
            if ((iFindIndexByKey > c8321f.m13497c() || iM13496b > iFindIndexByKey) && iFindIndexByKey >= 0 && iFindIndexByKey < lazyLayoutItemProvider.getItemCount()) {
                arrayList.add(Integer.valueOf(iFindIndexByKey));
            }
        }
        int iM13496b2 = c8321f.m13496b();
        int iM13497c = c8321f.m13497c();
        if (iM13496b2 <= iM13497c) {
            while (true) {
                arrayList.add(Integer.valueOf(iM13496b2));
                if (iM13496b2 == iM13497c) {
                    break;
                }
                iM13496b2++;
            }
        }
        return arrayList;
    }
}
