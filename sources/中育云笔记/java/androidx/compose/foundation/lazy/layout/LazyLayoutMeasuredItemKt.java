package androidx.compose.foundation.lazy.layout;

import androidx.compose.p014ui.unit.IntOffset;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10935a0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

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
        return AbstractC9979u.m20296i(lazyLayoutMeasuredItem.getIndex(), lazyLayoutMeasuredItem2.getIndex());
    }

    private static final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo27572getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo27572getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.isVertical() ? IntOffset.m33630getYimpl(jMo27572getOffsetBjo55l4) : IntOffset.m33629getXimpl(jMo27572getOffsetBjo55l4);
    }

    public static final <T extends LazyLayoutMeasuredItem> List<T> updatedVisibleItems(int i10, int i11, List<? extends T> list, List<? extends T> list2) {
        if (list.isEmpty()) {
            return AbstractC10978w.m24136n();
        }
        List<T> listM23925a1 = AbstractC10947g0.m23925a1(list2);
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            T t10 = list.get(i12);
            int index = t10.getIndex();
            if (i10 <= index && index <= i11) {
                listM23925a1.add(t10);
            }
        }
        AbstractC10935a0.m23853A(listM23925a1, LazyLayoutMeasuredItemIndexComparator);
        return listM23925a1;
    }
}
