package androidx.compose.runtime.internal;

import androidx.collection.MutableIntList;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a(\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00072\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\b"}, m13558d2 = {"swap", "", "Landroidx/collection/MutableIntList;", "a", "", "b", ExifInterface.GPS_DIRECTION_TRUE, "", "runtime_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class RememberEventDispatcherKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void swap(List<T> list, int i10, int i11) {
        T t10 = list.get(i10);
        list.set(i10, list.get(i11));
        list.set(i11, t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(MutableIntList mutableIntList, int i10, int i11) {
        int i12 = mutableIntList.get(i10);
        mutableIntList.set(i10, mutableIntList.get(i11));
        mutableIntList.set(i11, i12);
    }
}
