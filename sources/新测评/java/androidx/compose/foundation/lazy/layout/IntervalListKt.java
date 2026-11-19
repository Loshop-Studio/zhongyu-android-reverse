package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¨\u0006\u0006"}, m13558d2 = {"binarySearch", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "itemIndex", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,204:1\n44#2:205\n472#2:206\n472#2:207\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n*L\n180#1:205\n185#1:206\n194#1:207\n*E\n"})
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
