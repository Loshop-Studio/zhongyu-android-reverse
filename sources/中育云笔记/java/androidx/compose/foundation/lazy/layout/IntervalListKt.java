package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;

/* loaded from: classes.dex */
public final class IntervalListKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int binarySearch(MutableVector<IntervalList.Interval<T>> mutableVector, int i10) {
        int size = mutableVector.getSize() - 1;
        int i11 = 0;
        while (i11 < size) {
            int i12 = ((size - i11) / 2) + i11;
            int startIndex = mutableVector.content[i12].getStartIndex();
            if (startIndex != i10) {
                if (startIndex < i10) {
                    i11 = i12 + 1;
                    if (i10 < mutableVector.content[i11].getStartIndex()) {
                    }
                } else {
                    size = i12 - 1;
                }
            }
            return i12;
        }
        return i11;
    }
}
