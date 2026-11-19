package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m5110d2 = {"visibleLinesAverageMainAxisSize", "", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyGridLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridLayoutInfo.kt\nandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,133:1\n59#2:134\n54#2:136\n90#3:135\n85#3:137\n*S KotlinDebug\n*F\n+ 1 LazyGridLayoutInfo.kt\nandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt\n*L\n117#1:134\n119#1:136\n117#1:135\n119#1:137\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridLayoutInfoKt {
    public static final int visibleLinesAverageMainAxisSize(@NotNull LazyGridLayoutInfo lazyGridLayoutInfo) {
        boolean z8 = lazyGridLayoutInfo.getOrientation() == Orientation.Vertical;
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
        int i = 0;
        int i8 = 0;
        int i9 = 0;
        while (i < visibleItemsInfo.size()) {
            int iVisibleLinesAverageMainAxisSize$lineOf = visibleLinesAverageMainAxisSize$lineOf(z8, lazyGridLayoutInfo, i);
            if (iVisibleLinesAverageMainAxisSize$lineOf == -1) {
                i++;
            } else {
                int iMax = 0;
                while (i < visibleItemsInfo.size() && visibleLinesAverageMainAxisSize$lineOf(z8, lazyGridLayoutInfo, i) == iVisibleLinesAverageMainAxisSize$lineOf) {
                    iMax = Math.max(iMax, (int) (z8 ? visibleItemsInfo.get(i).mo7402getSizeYbymL2g() & 4294967295L : visibleItemsInfo.get(i).mo7402getSizeYbymL2g() >> 32));
                    i++;
                }
                i8 += iMax;
                i9++;
            }
        }
        return lazyGridLayoutInfo.getMainAxisItemSpacing() + (i8 / i9);
    }

    private static final int visibleLinesAverageMainAxisSize$lineOf(boolean z8, LazyGridLayoutInfo lazyGridLayoutInfo, int i) {
        return z8 ? lazyGridLayoutInfo.getVisibleItemsInfo().get(i).getRow() : lazyGridLayoutInfo.getVisibleItemsInfo().get(i).getColumn();
    }
}
