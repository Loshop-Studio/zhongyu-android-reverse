package androidx.paging;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10961n0;

/* loaded from: classes3.dex */
public final class PlaceholderPaddedListDiffHelperKt {
    public static final <T> PlaceholderPaddedDiffResult computeDiff(final PlaceholderPaddedList<T> placeholderPaddedList, final PlaceholderPaddedList<T> newList, final DiffUtil.ItemCallback<T> diffCallback) {
        AbstractC9979u.m20294g(placeholderPaddedList, "<this>");
        AbstractC9979u.m20294g(newList, "newList");
        AbstractC9979u.m20294g(diffCallback, "diffCallback");
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
        AbstractC9979u.m20293f(diffResultCalculateDiff, "calculateDiff(...)");
        Iterable iterableM21768u = AbstractC10410o.m21768u(0, placeholderPaddedList.getDataCount());
        if ((iterableM21768u instanceof Collection) && ((Collection) iterableM21768u).isEmpty()) {
            z10 = false;
        } else {
            Iterator<T> it = iterableM21768u.iterator();
            while (it.hasNext()) {
                if (diffResultCalculateDiff.convertOldPositionToNew(((AbstractC10961n0) it).nextInt()) != -1) {
                    break;
                }
            }
            z10 = false;
        }
        return new PlaceholderPaddedDiffResult(diffResultCalculateDiff, z10);
    }

    public static final <T> void dispatchDiff(PlaceholderPaddedList<T> placeholderPaddedList, ListUpdateCallback callback, PlaceholderPaddedList<T> newList, PlaceholderPaddedDiffResult diffResult) {
        AbstractC9979u.m20294g(placeholderPaddedList, "<this>");
        AbstractC9979u.m20294g(callback, "callback");
        AbstractC9979u.m20294g(newList, "newList");
        AbstractC9979u.m20294g(diffResult, "diffResult");
        if (diffResult.getHasOverlap()) {
            OverlappingListsDiffDispatcher.INSTANCE.dispatchDiff(placeholderPaddedList, newList, callback, diffResult);
        } else {
            DistinctListsDiffDispatcher.INSTANCE.dispatchDiff(callback, placeholderPaddedList, newList);
        }
    }

    public static final int transformAnchorIndex(PlaceholderPaddedList<?> placeholderPaddedList, PlaceholderPaddedDiffResult diffResult, PlaceholderPaddedList<?> newList, int i10) {
        int iConvertOldPositionToNew;
        AbstractC9979u.m20294g(placeholderPaddedList, "<this>");
        AbstractC9979u.m20294g(diffResult, "diffResult");
        AbstractC9979u.m20294g(newList, "newList");
        if (!diffResult.getHasOverlap()) {
            return AbstractC10410o.m21762o(i10, AbstractC10410o.m21768u(0, newList.getSize()));
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
        return AbstractC10410o.m21762o(i10, AbstractC10410o.m21768u(0, newList.getSize()));
    }
}
