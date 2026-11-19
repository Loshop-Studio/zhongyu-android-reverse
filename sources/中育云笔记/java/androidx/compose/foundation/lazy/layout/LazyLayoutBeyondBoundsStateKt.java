package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import java.util.ArrayList;
import java.util.List;
import p265nd.C10405j;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsStateKt {
    public static final List<Integer> calculateLazyLayoutPinnedIndices(LazyLayoutItemProvider lazyLayoutItemProvider, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo) {
        if (!lazyLayoutBeyondBoundsInfo.hasIntervals() && lazyLayoutPinnedItemList.isEmpty()) {
            return AbstractC10978w.m24136n();
        }
        ArrayList arrayList = new ArrayList();
        C10405j c10405j = lazyLayoutBeyondBoundsInfo.hasIntervals() ? new C10405j(lazyLayoutBeyondBoundsInfo.getStart(), Math.min(lazyLayoutBeyondBoundsInfo.getEnd(), lazyLayoutItemProvider.getItemCount() - 1)) : C10405j.f24760g.m21742a();
        int size = lazyLayoutPinnedItemList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList.get(i10);
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            int iM21733b = c10405j.m21733b();
            if ((iFindIndexByKey > c10405j.m21734c() || iM21733b > iFindIndexByKey) && iFindIndexByKey >= 0 && iFindIndexByKey < lazyLayoutItemProvider.getItemCount()) {
                arrayList.add(Integer.valueOf(iFindIndexByKey));
            }
        }
        int iM21733b2 = c10405j.m21733b();
        int iM21734c = c10405j.m21734c();
        if (iM21733b2 <= iM21734c) {
            while (true) {
                arrayList.add(Integer.valueOf(iM21733b2));
                if (iM21733b2 == iM21734c) {
                    break;
                }
                iM21733b2++;
            }
        }
        return arrayList;
    }
}
