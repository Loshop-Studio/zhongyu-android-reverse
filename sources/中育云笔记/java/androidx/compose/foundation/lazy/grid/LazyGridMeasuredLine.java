package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyGridMeasuredLine {
    public static final int $stable = 8;
    private final int index;
    private final boolean isVertical;
    private final LazyGridMeasuredItem[] items;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    private final LazyGridSlots slots;
    private final List<GridItemSpan> spans;

    public LazyGridMeasuredLine(int i10, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, LazyGridSlots lazyGridSlots, List<GridItemSpan> list, boolean z10, int i11) {
        this.index = i10;
        this.items = lazyGridMeasuredItemArr;
        this.slots = lazyGridSlots;
        this.spans = list;
        this.isVertical = z10;
        this.mainAxisSpacing = i11;
        int iMax = 0;
        for (LazyGridMeasuredItem lazyGridMeasuredItem : lazyGridMeasuredItemArr) {
            iMax = Math.max(iMax, lazyGridMeasuredItem.getMainAxisSize());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = AbstractC10410o.m21752e(iMax + this.mainAxisSpacing, 0);
    }

    public final int getIndex() {
        return this.index;
    }

    public final LazyGridMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean isEmpty() {
        return this.items.length == 0;
    }

    public final LazyGridMeasuredItem[] position(int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.items;
        int length = lazyGridMeasuredItemArr.length;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i17];
            int i20 = i18 + 1;
            int iM27583getCurrentLineSpanimpl = GridItemSpan.m27583getCurrentLineSpanimpl(this.spans.get(i18).m27586unboximpl());
            int i21 = this.slots.getPositions()[i19];
            boolean z10 = this.isVertical;
            int i22 = z10 ? this.index : i19;
            if (z10) {
                i13 = i19;
                i16 = i10;
                i14 = i11;
                i15 = i12;
            } else {
                i13 = this.index;
                i14 = i11;
                i15 = i12;
                i16 = i10;
            }
            lazyGridMeasuredItem.position(i16, i21, i14, i15, i22, i13);
            C10786q c10786q = C10786q.f26013a;
            i19 += iM27583getCurrentLineSpanimpl;
            i17++;
            i18 = i20;
        }
        return this.items;
    }
}
