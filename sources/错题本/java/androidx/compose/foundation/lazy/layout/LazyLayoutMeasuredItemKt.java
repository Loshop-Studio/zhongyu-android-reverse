package androidx.compose.foundation.lazy.layout;

import androidx.compose.p011ui.unit.IntOffset;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5809x;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u001aD\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\bH\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m5110d2 = {"LazyLayoutMeasuredItemIndexComparator", "Ljava/util/Comparator;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "mainAxisOffset", "", "getMainAxisOffset", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "updatedVisibleItems", "", ExifInterface.GPS_DIRECTION_TRUE, "firstVisibleIndex", "lastVisibleIndex", "positionedItems", "stickingItems", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyLayoutMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasuredItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n34#2,6:71\n1#3:77\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasuredItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemKt\n*L\n56#1:71,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutMeasuredItemKt {

    @NotNull
    private static final Comparator<LazyLayoutMeasuredItem> LazyLayoutMeasuredItemIndexComparator = new C1148a(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LazyLayoutMeasuredItemIndexComparator$lambda$2(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, LazyLayoutMeasuredItem lazyLayoutMeasuredItem2) {
        return AbstractC5830k.m5332i(lazyLayoutMeasuredItem.getIndex(), lazyLayoutMeasuredItem2.getIndex());
    }

    private static final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo7376getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo7376getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m13434getYimpl(jMo7376getOffsetBjo55l4) : IntOffset.m13433getXimpl(jMo7376getOffsetBjo55l4);
    }

    @NotNull
    public static final <T extends LazyLayoutMeasuredItem> List<T> updatedVisibleItems(int i, int i8, @NotNull List<? extends T> list, @NotNull List<? extends T> list2) {
        if (list.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayListM5218E0 = AbstractC5805t.m5218E0(list2);
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            T t8 = list.get(i9);
            int index = t8.getIndex();
            if (i <= index && index <= i8) {
                arrayListM5218E0.add(t8);
            }
        }
        AbstractC5809x.m5289Q(arrayListM5218E0, LazyLayoutMeasuredItemIndexComparator);
        return arrayListM5218E0;
    }
}
