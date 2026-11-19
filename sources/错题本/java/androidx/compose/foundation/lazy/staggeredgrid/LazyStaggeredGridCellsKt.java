package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¨\u0006\u0006"}, m5110d2 = {"calculateCellsCrossAxisSizeImpl", "", "gridSize", "", "slotCount", "spacing", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LazyStaggeredGridCellsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] calculateCellsCrossAxisSizeImpl(int i, int i8, int i9) {
        int i10;
        int i11 = i - ((i8 - 1) * i9);
        int i12 = i11 / i8;
        int i13 = i11 % i8;
        int[] iArr = new int[i8];
        int i14 = 0;
        while (i14 < i8) {
            if (i12 < 0) {
                i10 = 0;
            } else {
                i10 = (i14 < i13 ? 1 : 0) + i12;
            }
            iArr[i14] = i10;
            i14++;
        }
        return iArr;
    }
}
