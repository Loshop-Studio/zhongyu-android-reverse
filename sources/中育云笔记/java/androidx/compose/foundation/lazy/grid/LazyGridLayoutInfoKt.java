package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

/* loaded from: classes.dex */
public final class LazyGridLayoutInfoKt {
    public static final int visibleLinesAverageMainAxisSize(LazyGridLayoutInfo lazyGridLayoutInfo) {
        boolean z10 = lazyGridLayoutInfo.getOrientation() == Orientation.Vertical;
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < visibleItemsInfo.size()) {
            int iVisibleLinesAverageMainAxisSize$lineOf = visibleLinesAverageMainAxisSize$lineOf(z10, lazyGridLayoutInfo, i10);
            if (iVisibleLinesAverageMainAxisSize$lineOf == -1) {
                i10++;
            } else {
                int iMax = 0;
                while (i10 < visibleItemsInfo.size() && visibleLinesAverageMainAxisSize$lineOf(z10, lazyGridLayoutInfo, i10) == iVisibleLinesAverageMainAxisSize$lineOf) {
                    iMax = Math.max(iMax, (int) (z10 ? visibleItemsInfo.get(i10).mo27598getSizeYbymL2g() & 4294967295L : visibleItemsInfo.get(i10).mo27598getSizeYbymL2g() >> 32));
                    i10++;
                }
                i11 += iMax;
                i12++;
            }
        }
        return (i11 / i12) + lazyGridLayoutInfo.getMainAxisItemSpacing();
    }

    private static final int visibleLinesAverageMainAxisSize$lineOf(boolean z10, LazyGridLayoutInfo lazyGridLayoutInfo, int i10) {
        return z10 ? lazyGridLayoutInfo.getVisibleItemsInfo().get(i10).getRow() : lazyGridLayoutInfo.getVisibleItemsInfo().get(i10).getColumn();
    }
}
