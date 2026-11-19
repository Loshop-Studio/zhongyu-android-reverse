package androidx.compose.runtime.internal;

import androidx.collection.MutableIntList;
import java.util.List;

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
