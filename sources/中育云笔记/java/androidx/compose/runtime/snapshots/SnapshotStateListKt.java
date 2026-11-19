package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class SnapshotStateListKt {
    private static final Object sync = new Object();

    public static final <T> SnapshotStateList<T> SnapshotStateList(int i10, InterfaceC9540l interfaceC9540l) {
        if (i10 == 0) {
            return new SnapshotStateList<>();
        }
        PersistentList.Builder builder = ExtensionsKt.persistentListOf().builder();
        for (int i11 = 0; i11 < i10; i11++) {
            builder.add(interfaceC9540l.invoke(Integer.valueOf(i11)));
        }
        return new SnapshotStateList<>(builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void invalidIteratorSet() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void modificationError() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateRange(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }
}
