package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import java.util.List;
import p077d8.AbstractC8323h;
import p077d8.C8321f;

/* loaded from: classes.dex */
public interface StickyItemsPlacement {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final StickyItemsPlacement StickToTopPlacement = new StickyItemsPlacement() { // from class: androidx.compose.foundation.lazy.layout.StickyItemsPlacement$Companion$StickToTopPlacement$1
            @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
            public int calculateStickingItemOffset(List<? extends LazyLayoutMeasuredItem> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem;
                int size = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size) {
                        lazyLayoutMeasuredItem = null;
                        break;
                    }
                    lazyLayoutMeasuredItem = list.get(i17);
                    if (lazyLayoutMeasuredItem.getIndex() != i10) {
                        break;
                    }
                    i17++;
                }
                LazyLayoutMeasuredItem lazyLayoutMeasuredItem2 = lazyLayoutMeasuredItem;
                int mainAxisOffset = lazyLayoutMeasuredItem2 != null ? LazyLayoutStickyItemsKt.getMainAxisOffset(lazyLayoutMeasuredItem2) : Integer.MIN_VALUE;
                int iMax = i12 == Integer.MIN_VALUE ? -i13 : Math.max(-i13, i12);
                return mainAxisOffset != Integer.MIN_VALUE ? Math.min(iMax, mainAxisOffset - i11) : iMax;
            }

            @Override // androidx.compose.foundation.lazy.layout.StickyItemsPlacement
            public IntList getStickingIndices(int i10, int i11, IntList intList) {
                int i12;
                if (i11 - i10 < 0 || (i12 = intList._size) == 0) {
                    return IntListKt.emptyIntList();
                }
                C8321f c8321fM13525t = AbstractC8323h.m13525t(0, i12);
                int iM13496b = c8321fM13525t.m13496b();
                int iM13497c = c8321fM13525t.m13497c();
                int i13 = -1;
                if (iM13496b <= iM13497c) {
                    while (intList.get(iM13496b) <= i10) {
                        i13 = intList.get(iM13496b);
                        if (iM13496b == iM13497c) {
                            break;
                        }
                        iM13496b++;
                    }
                }
                return i13 == -1 ? IntListKt.emptyIntList() : IntListKt.intListOf(i13);
            }
        };

        private Companion() {
        }

        public final StickyItemsPlacement getStickToTopPlacement() {
            return StickToTopPlacement;
        }
    }

    int calculateStickingItemOffset(List<? extends LazyLayoutMeasuredItem> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16);

    IntList getStickingIndices(int i10, int i11, IntList intList);
}
