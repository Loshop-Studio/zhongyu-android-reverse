package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(m5174d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, m5175d2 = {"calculateCellsCrossAxisSizeImpl", "", "", "gridSize", "slotCount", "spacing", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LazyStaggeredGridCellsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i4, int i5, int i6) {
        int i7 = i4 - (i6 * (i5 - 1));
        int i8 = i7 / i5;
        int i9 = i7 % i5;
        ArrayList arrayList = new ArrayList(i5);
        int i10 = 0;
        while (i10 < i5) {
            arrayList.add(Integer.valueOf((i10 < i9 ? 1 : 0) + i8));
            i10++;
        }
        return arrayList;
    }
}
