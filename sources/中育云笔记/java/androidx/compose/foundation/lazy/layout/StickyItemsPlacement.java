package androidx.compose.foundation.lazy.layout;

import androidx.collection.IntList;
import androidx.collection.IntListKt;
import java.util.List;
import p265nd.AbstractC10410o;
import p265nd.C10405j;

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
                C10405j c10405jM21768u = AbstractC10410o.m21768u(0, i12);
                int iM21733b = c10405jM21768u.m21733b();
                int iM21734c = c10405jM21768u.m21734c();
                int i13 = -1;
                if (iM21733b <= iM21734c) {
                    while (intList.get(iM21733b) <= i10) {
                        i13 = intList.get(iM21733b);
                        if (iM21733b == iM21734c) {
                            break;
                        }
                        iM21733b++;
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
