package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m13558d2 = {"visibleLinesAverageMainAxisSize", "", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridLayoutInfo.kt\nandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,133:1\n59#2:134\n54#2:136\n90#3:135\n85#3:137\n*S KotlinDebug\n*F\n+ 1 LazyGridLayoutInfo.kt\nandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt\n*L\n117#1:134\n119#1:136\n117#1:135\n119#1:137\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridLayoutInfoKt {
    public static final int visibleLinesAverageMainAxisSize(LazyGridLayoutInfo lazyGridLayoutInfo) {
        boolean z9 = lazyGridLayoutInfo.getOrientation() == Orientation.Vertical;
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < visibleItemsInfo.size()) {
            int iVisibleLinesAverageMainAxisSize$lineOf = visibleLinesAverageMainAxisSize$lineOf(z9, lazyGridLayoutInfo, i10);
            if (iVisibleLinesAverageMainAxisSize$lineOf == -1) {
                i10++;
            } else {
                int iMax = 0;
                while (i10 < visibleItemsInfo.size() && visibleLinesAverageMainAxisSize$lineOf(z9, lazyGridLayoutInfo, i10) == iVisibleLinesAverageMainAxisSize$lineOf) {
                    iMax = Math.max(iMax, (int) (z9 ? visibleItemsInfo.get(i10).mo17821getSizeYbymL2g() & 4294967295L : visibleItemsInfo.get(i10).mo17821getSizeYbymL2g() >> 32));
                    i10++;
                }
                i11 += iMax;
                i12++;
            }
        }
        return (i11 / i12) + lazyGridLayoutInfo.getMainAxisItemSpacing();
    }

    private static final int visibleLinesAverageMainAxisSize$lineOf(boolean z9, LazyGridLayoutInfo lazyGridLayoutInfo, int i10) {
        return z9 ? lazyGridLayoutInfo.getVisibleItemsInfo().get(i10).getRow() : lazyGridLayoutInfo.getVisibleItemsInfo().get(i10).getColumn();
    }
}
