package androidx.compose.foundation.lazy.layout;

import androidx.compose.p013ui.unit.IntOffset;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8816z;

/* loaded from: classes.dex */
public final class LazyLayoutMeasuredItemKt {
    private static final Comparator<LazyLayoutMeasuredItem> LazyLayoutMeasuredItemIndexComparator = new Comparator() { // from class: androidx.compose.foundation.lazy.layout.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LazyLayoutMeasuredItemKt.LazyLayoutMeasuredItemIndexComparator$lambda$2((LazyLayoutMeasuredItem) obj, (LazyLayoutMeasuredItem) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LazyLayoutMeasuredItemIndexComparator$lambda$2(LazyLayoutMeasuredItem lazyLayoutMeasuredItem, LazyLayoutMeasuredItem lazyLayoutMeasuredItem2) {
        return AbstractC9133u.m16135i(lazyLayoutMeasuredItem.getIndex(), lazyLayoutMeasuredItem2.getIndex());
    }

    private static final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo20970getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo20970getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.isVertical() ? IntOffset.m27028getYimpl(jMo20970getOffsetBjo55l4) : IntOffset.m27027getXimpl(jMo20970getOffsetBjo55l4);
    }

    public static final <T extends LazyLayoutMeasuredItem> List<T> updatedVisibleItems(int i10, int i11, List<? extends T> list, List<? extends T> list2) {
        if (list.isEmpty()) {
            return AbstractC8809v.m14771n();
        }
        List<T> listM14547X0 = AbstractC8778f0.m14547X0(list2);
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            T t10 = list.get(i12);
            int index = t10.getIndex();
            if (i10 <= index && index <= i11) {
                listM14547X0.add(t10);
            }
        }
        AbstractC8816z.m14795A(listM14547X0, LazyLayoutMeasuredItemIndexComparator);
        return listM14547X0;
    }
}
