package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¨\u0006\u0006"}, m7880d2 = {"calculateCellsCrossAxisSizeImpl", "", "gridSize", "", "slotCount", "spacing", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridCellsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] calculateCellsCrossAxisSizeImpl(int i6, int i7, int i8) {
        int i9;
        int i10 = i6 - (i8 * (i7 - 1));
        int i11 = i10 / i7;
        int i12 = i10 % i7;
        int[] iArr = new int[i7];
        int i13 = 0;
        while (i13 < i7) {
            if (i11 < 0) {
                i9 = 0;
            } else {
                i9 = (i13 < i12 ? 1 : 0) + i11;
            }
            iArr[i13] = i9;
            i13++;
        }
        return iArr;
    }
}
