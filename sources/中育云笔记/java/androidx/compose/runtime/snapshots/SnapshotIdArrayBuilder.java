package androidx.compose.runtime.snapshots;

import androidx.collection.MutableLongList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SnapshotIdArrayBuilder {
    public static final int $stable = 8;
    private final MutableLongList list;

    public SnapshotIdArrayBuilder(long[] jArr) {
        MutableLongList mutableLongList;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            mutableLongList = new MutableLongList(jArrCopyOf.length);
            mutableLongList.addAll(mutableLongList._size, jArrCopyOf);
        } else {
            mutableLongList = new MutableLongList(0, 1, null);
        }
        this.list = mutableLongList;
    }

    public final void add(long j10) {
        this.list.add(j10);
    }

    public final long[] toArray() {
        MutableLongList mutableLongList = this.list;
        int i10 = mutableLongList._size;
        if (i10 == 0) {
            return null;
        }
        long[] jArr = new long[i10];
        long[] jArr2 = mutableLongList.content;
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = jArr2[i11];
        }
        return jArr;
    }
}
