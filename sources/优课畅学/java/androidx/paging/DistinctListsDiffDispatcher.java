package androidx.paging;

import androidx.recyclerview.widget.ListUpdateCallback;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;

/* loaded from: classes3.dex */
public final class DistinctListsDiffDispatcher {
    public static final DistinctListsDiffDispatcher INSTANCE = new DistinctListsDiffDispatcher();

    private DistinctListsDiffDispatcher() {
    }

    private final void dispatchChange(ListUpdateCallback listUpdateCallback, int i10, int i11, int i12, int i13, Object obj) {
        int i14 = i10 - i12;
        if (i14 > 0) {
            listUpdateCallback.onChanged(i12, i14, obj);
        }
        int i15 = i13 - i11;
        if (i15 > 0) {
            listUpdateCallback.onChanged(i11, i15, obj);
        }
    }

    public final <T> void dispatchDiff(ListUpdateCallback callback, PlaceholderPaddedList<T> oldList, PlaceholderPaddedList<T> newList) {
        AbstractC9133u.m16133g(callback, "callback");
        AbstractC9133u.m16133g(oldList, "oldList");
        AbstractC9133u.m16133g(newList, "newList");
        int iMax = Math.max(oldList.getPlaceholdersBefore(), newList.getPlaceholdersBefore());
        int iMin = Math.min(oldList.getPlaceholdersBefore() + oldList.getDataCount(), newList.getPlaceholdersBefore() + newList.getDataCount());
        int i10 = iMin - iMax;
        if (i10 > 0) {
            callback.onRemoved(iMax, i10);
            callback.onInserted(iMax, i10);
        }
        int iMin2 = Math.min(iMax, iMin);
        int iMax2 = Math.max(iMax, iMin);
        dispatchChange(callback, iMin2, iMax2, AbstractC8323h.m13513h(oldList.getPlaceholdersBefore(), newList.getSize()), AbstractC8323h.m13513h(oldList.getPlaceholdersBefore() + oldList.getDataCount(), newList.getSize()), DiffingChangePayload.ITEM_TO_PLACEHOLDER);
        dispatchChange(callback, iMin2, iMax2, AbstractC8323h.m13513h(newList.getPlaceholdersBefore(), oldList.getSize()), AbstractC8323h.m13513h(newList.getPlaceholdersBefore() + newList.getDataCount(), oldList.getSize()), DiffingChangePayload.PLACEHOLDER_TO_ITEM);
        int size = newList.getSize() - oldList.getSize();
        if (size > 0) {
            callback.onInserted(oldList.getSize(), size);
        } else if (size < 0) {
            callback.onRemoved(oldList.getSize() + size, -size);
        }
    }
}
