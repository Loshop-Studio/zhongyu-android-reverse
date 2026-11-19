package androidx.paging;

import androidx.annotation.IntRange;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a-\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u0006\u001a-\u0010\u0007\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u0006\u001a\"\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0002¨\u0006\n"}, m13413d2 = {"get", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/paging/PlaceholderPaddedList;", "index", "", "(Landroidx/paging/PlaceholderPaddedList;I)Ljava/lang/Object;", "peek", "snapshot", "Landroidx/paging/ItemSnapshotList;", "paging-runtime_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class AsyncPagingDataDifferKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T get(PlaceholderPaddedList<T> placeholderPaddedList, @IntRange(from = 0) int i9) {
        if (i9 >= 0 && i9 < placeholderPaddedList.getSize()) {
            int placeholdersBefore = i9 - placeholderPaddedList.getPlaceholdersBefore();
            if (placeholdersBefore < 0 || placeholdersBefore >= placeholderPaddedList.getDataCount()) {
                return null;
            }
            return placeholderPaddedList.getItem(placeholdersBefore);
        }
        throw new IndexOutOfBoundsException("Index: " + i9 + ", Size: " + placeholderPaddedList.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T peek(PlaceholderPaddedList<T> placeholderPaddedList, @IntRange(from = 0) int i9) {
        return (T) get(placeholderPaddedList, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> ItemSnapshotList<T> snapshot(PlaceholderPaddedList<T> placeholderPaddedList) {
        int dataCount = placeholderPaddedList.getDataCount() - 1;
        ArrayList arrayList = new ArrayList();
        if (dataCount >= 0) {
            int i9 = 0;
            while (true) {
                arrayList.add(placeholderPaddedList.getItem(i9));
                if (i9 == dataCount) {
                    break;
                }
                i9++;
            }
        }
        return new ItemSnapshotList<>(placeholderPaddedList.getPlaceholdersBefore(), placeholderPaddedList.getPlaceholdersAfter(), arrayList);
    }
}
