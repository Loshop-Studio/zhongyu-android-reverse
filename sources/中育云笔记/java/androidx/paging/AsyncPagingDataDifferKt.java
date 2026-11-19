package androidx.paging;

import androidx.annotation.IntRange;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class AsyncPagingDataDifferKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T get(PlaceholderPaddedList<T> placeholderPaddedList, @IntRange(from = 0) int i10) {
        if (i10 >= 0 && i10 < placeholderPaddedList.getSize()) {
            int placeholdersBefore = i10 - placeholderPaddedList.getPlaceholdersBefore();
            if (placeholdersBefore < 0 || placeholdersBefore >= placeholderPaddedList.getDataCount()) {
                return null;
            }
            return placeholderPaddedList.getItem(placeholdersBefore);
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + placeholderPaddedList.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T peek(PlaceholderPaddedList<T> placeholderPaddedList, @IntRange(from = 0) int i10) {
        return (T) get(placeholderPaddedList, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> ItemSnapshotList<T> snapshot(PlaceholderPaddedList<T> placeholderPaddedList) {
        int dataCount = placeholderPaddedList.getDataCount() - 1;
        ArrayList arrayList = new ArrayList();
        if (dataCount >= 0) {
            int i10 = 0;
            while (true) {
                arrayList.add(placeholderPaddedList.getItem(i10));
                if (i10 == dataCount) {
                    break;
                }
                i10++;
            }
        }
        return new ItemSnapshotList<>(placeholderPaddedList.getPlaceholdersBefore(), placeholderPaddedList.getPlaceholdersAfter(), arrayList);
    }
}
