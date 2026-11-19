package androidx.compose.runtime.internal;

import androidx.collection.MutableIntList;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;

@Metadata(m5109d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "", "a", "b", "Ld6/s;", "swap", "(Ljava/util/List;II)V", "Landroidx/collection/MutableIntList;", "(Landroidx/collection/MutableIntList;II)V", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class RememberEventDispatcherKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void swap(List<T> list, int i, int i8) {
        T t8 = list.get(i);
        list.set(i, list.get(i8));
        list.set(i8, t8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(MutableIntList mutableIntList, int i, int i8) {
        int i9 = mutableIntList.get(i);
        mutableIntList.set(i, mutableIntList.get(i8));
        mutableIntList.set(i8, i9);
    }
}
