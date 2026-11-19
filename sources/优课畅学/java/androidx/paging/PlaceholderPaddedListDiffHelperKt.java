package androidx.paging;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8792m0;

/* loaded from: classes3.dex */
public final class PlaceholderPaddedListDiffHelperKt {
    public static final <T> PlaceholderPaddedDiffResult computeDiff(final PlaceholderPaddedList<T> placeholderPaddedList, final PlaceholderPaddedList<T> newList, final DiffUtil.ItemCallback<T> diffCallback) {
        AbstractC9133u.m16133g(placeholderPaddedList, "<this>");
        AbstractC9133u.m16133g(newList, "newList");
        AbstractC9133u.m16133g(diffCallback, "diffCallback");
        final int dataCount = placeholderPaddedList.getDataCount();
        final int dataCount2 = newList.getDataCount();
        DiffUtil.Callback callback = new DiffUtil.Callback() { // from class: androidx.paging.PlaceholderPaddedListDiffHelperKt$computeDiff$diffResult$1
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areContentsTheSame(int i10, int i11) {
                Object item = placeholderPaddedList.getItem(i10);
                Object item2 = newList.getItem(i11);
                if (item == item2) {
                    return true;
                }
                return diffCallback.areContentsTheSame(item, item2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areItemsTheSame(int i10, int i11) {
                Object item = placeholderPaddedList.getItem(i10);
                Object item2 = newList.getItem(i11);
                if (item == item2) {
                    return true;
                }
                return diffCallback.areItemsTheSame(item, item2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public Object getChangePayload(int i10, int i11) {
                Object item = placeholderPaddedList.getItem(i10);
                Object item2 = newList.getItem(i11);
                return item == item2 ? Boolean.TRUE : diffCallback.getChangePayload(item, item2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getNewListSize() {
                return dataCount2;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getOldListSize() {
                return dataCount;
            }
        };
        boolean z10 = true;
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(callback, true);
        AbstractC9133u.m16132f(diffResultCalculateDiff, "PlaceholderPaddedList<T>…    },\n        true\n    )");
        Iterable iterableM13525t = AbstractC8323h.m13525t(0, placeholderPaddedList.getDataCount());
        if ((iterableM13525t instanceof Collection) && ((Collection) iterableM13525t).isEmpty()) {
            z10 = false;
        } else {
            Iterator<T> it = iterableM13525t.iterator();
            while (it.hasNext()) {
                if (diffResultCalculateDiff.convertOldPositionToNew(((AbstractC8792m0) it).nextInt()) != -1) {
                    break;
                }
            }
            z10 = false;
        }
        return new PlaceholderPaddedDiffResult(diffResultCalculateDiff, z10);
    }

    public static final <T> void dispatchDiff(PlaceholderPaddedList<T> placeholderPaddedList, ListUpdateCallback callback, PlaceholderPaddedList<T> newList, PlaceholderPaddedDiffResult diffResult) {
        AbstractC9133u.m16133g(placeholderPaddedList, "<this>");
        AbstractC9133u.m16133g(callback, "callback");
        AbstractC9133u.m16133g(newList, "newList");
        AbstractC9133u.m16133g(diffResult, "diffResult");
        if (diffResult.getHasOverlap()) {
            OverlappingListsDiffDispatcher.INSTANCE.dispatchDiff(placeholderPaddedList, newList, callback, diffResult);
        } else {
            DistinctListsDiffDispatcher.INSTANCE.dispatchDiff(callback, placeholderPaddedList, newList);
        }
    }

    public static final int transformAnchorIndex(PlaceholderPaddedList<?> placeholderPaddedList, PlaceholderPaddedDiffResult diffResult, PlaceholderPaddedList<?> newList, int i10) {
        int iConvertOldPositionToNew;
        AbstractC9133u.m16133g(placeholderPaddedList, "<this>");
        AbstractC9133u.m16133g(diffResult, "diffResult");
        AbstractC9133u.m16133g(newList, "newList");
        if (!diffResult.getHasOverlap()) {
            return AbstractC8323h.m13519n(i10, AbstractC8323h.m13525t(0, newList.getSize()));
        }
        int placeholdersBefore = i10 - placeholderPaddedList.getPlaceholdersBefore();
        int dataCount = placeholderPaddedList.getDataCount();
        if (placeholdersBefore >= 0 && placeholdersBefore < dataCount) {
            for (int i11 = 0; i11 < 30; i11++) {
                int i12 = ((i11 / 2) * (i11 % 2 == 1 ? -1 : 1)) + placeholdersBefore;
                if (i12 >= 0 && i12 < placeholderPaddedList.getDataCount() && (iConvertOldPositionToNew = diffResult.getDiff().convertOldPositionToNew(i12)) != -1) {
                    return iConvertOldPositionToNew + newList.getPlaceholdersBefore();
                }
            }
        }
        return AbstractC8323h.m13519n(i10, AbstractC8323h.m13525t(0, newList.getSize()));
    }
}
