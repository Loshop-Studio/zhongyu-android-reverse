package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m7880d2 = {"visibleLinesAverageMainAxisSize", "", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridLayoutInfo.kt\nandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,133:1\n59#2:134\n54#2:136\n90#3:135\n85#3:137\n*S KotlinDebug\n*F\n+ 1 LazyGridLayoutInfo.kt\nandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt\n*L\n117#1:134\n119#1:136\n117#1:135\n119#1:137\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridLayoutInfoKt {
    public static final int visibleLinesAverageMainAxisSize(LazyGridLayoutInfo lazyGridLayoutInfo) {
        boolean z6 = lazyGridLayoutInfo.getOrientation() == Orientation.Vertical;
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < visibleItemsInfo.size()) {
            int iVisibleLinesAverageMainAxisSize$lineOf = visibleLinesAverageMainAxisSize$lineOf(z6, lazyGridLayoutInfo, i6);
            if (iVisibleLinesAverageMainAxisSize$lineOf == -1) {
                i6++;
            } else {
                int iMax = 0;
                while (i6 < visibleItemsInfo.size() && visibleLinesAverageMainAxisSize$lineOf(z6, lazyGridLayoutInfo, i6) == iVisibleLinesAverageMainAxisSize$lineOf) {
                    iMax = Math.max(iMax, (int) (z6 ? visibleItemsInfo.get(i6).mo10744getSizeYbymL2g() & 4294967295L : visibleItemsInfo.get(i6).mo10744getSizeYbymL2g() >> 32));
                    i6++;
                }
                i7 += iMax;
                i8++;
            }
        }
        return (i7 / i8) + lazyGridLayoutInfo.getMainAxisItemSpacing();
    }

    private static final int visibleLinesAverageMainAxisSize$lineOf(boolean z6, LazyGridLayoutInfo lazyGridLayoutInfo, int i6) {
        return z6 ? lazyGridLayoutInfo.getVisibleItemsInfo().get(i6).getRow() : lazyGridLayoutInfo.getVisibleItemsInfo().get(i6).getColumn();
    }
}
