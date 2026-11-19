package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¨\u0006\u0006"}, m13558d2 = {"calculateCellsCrossAxisSizeImpl", "", "gridSize", "", "slotCount", "spacing", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridCellsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] calculateCellsCrossAxisSizeImpl(int i10, int i11, int i12) {
        int i13;
        int i14 = i10 - (i12 * (i11 - 1));
        int i15 = i14 / i11;
        int i16 = i14 % i11;
        int[] iArr = new int[i11];
        int i17 = 0;
        while (i17 < i11) {
            if (i15 < 0) {
                i13 = 0;
            } else {
                i13 = (i17 < i16 ? 1 : 0) + i15;
            }
            iArr[i17] = i13;
            i17++;
        }
        return iArr;
    }
}
