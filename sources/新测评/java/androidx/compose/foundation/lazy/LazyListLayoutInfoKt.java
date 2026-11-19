package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m13558d2 = {"visibleItemsAverageSize", "", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLazyListLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListLayoutInfo.kt\nandroidx/compose/foundation/lazy/LazyListLayoutInfoKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,95:1\n133#2,3:96\n34#2,6:99\n136#2:105\n*S KotlinDebug\n*F\n+ 1 LazyListLayoutInfo.kt\nandroidx/compose/foundation/lazy/LazyListLayoutInfoKt\n*L\n92#1:96,3\n92#1:99,6\n92#1:105\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListLayoutInfoKt {
    public static final int visibleItemsAverageSize(LazyListLayoutInfo lazyListLayoutInfo) {
        List<LazyListItemInfo> visibleItemsInfo = lazyListLayoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int size2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            size2 += visibleItemsInfo.get(i10).getSize();
        }
        return (size2 / visibleItemsInfo.size()) + lazyListLayoutInfo.getMainAxisItemSpacing();
    }
}
