package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import p134i7.AbstractC8797p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SnapshotDoubleIndexHeap {
    public static final int $stable = 8;
    private int firstFreeHandle;
    private int[] handles;
    private int size;
    private long[] values = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(16);
    private int[] index = new int[16];

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.handles = iArr;
    }

    private final int allocateHandle() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i10 = length * 2;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr[i11] = i12;
                i11 = i12;
            }
            AbstractC8797p.m14653t(this.handles, iArr, 0, 0, 0, 14, null);
            this.handles = iArr;
        }
        int i13 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i13];
        return i13;
    }

    private final void ensure(int i10) {
        int length = this.values.length;
        if (i10 <= length) {
            return;
        }
        int i11 = length * 2;
        long[] jArrSnapshotIdArrayWithCapacity = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(i11);
        int[] iArr = new int[i11];
        AbstractC8797p.m14654u(this.values, jArrSnapshotIdArrayWithCapacity, 0, 0, 0, 12, null);
        AbstractC8797p.m14653t(this.index, iArr, 0, 0, 0, 14, null);
        this.values = jArrSnapshotIdArrayWithCapacity;
        this.index = iArr;
    }

    private final void freeHandle(int i10) {
        this.handles[i10] = this.firstFreeHandle;
        this.firstFreeHandle = i10;
    }

    public static /* synthetic */ long lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(j10);
    }

    private final void shiftDown(int i10) {
        long[] jArr = this.values;
        int i11 = this.size >> 1;
        while (i10 < i11) {
            int i12 = (i10 + 1) << 1;
            int i13 = i12 - 1;
            if (i12 < this.size) {
                long j10 = jArr[i12];
                if (j10 < jArr[i13]) {
                    if (j10 >= jArr[i10]) {
                        return;
                    }
                    swap(i12, i10);
                    i10 = i12;
                }
            }
            if (jArr[i13] >= jArr[i10]) {
                return;
            }
            swap(i13, i10);
            i10 = i13;
        }
    }

    private final void shiftUp(int i10) {
        long[] jArr = this.values;
        long j10 = jArr[i10];
        while (i10 > 0) {
            int i11 = ((i10 + 1) >> 1) - 1;
            if (jArr[i11] <= j10) {
                return;
            }
            swap(i11, i10);
            i10 = i11;
        }
    }

    private final void swap(int i10, int i11) {
        long[] jArr = this.values;
        int[] iArr = this.index;
        int[] iArr2 = this.handles;
        long j10 = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j10;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }

    public final int add(long j10) {
        ensure(this.size + 1);
        int i10 = this.size;
        this.size = i10 + 1;
        int iAllocateHandle = allocateHandle();
        this.values[i10] = j10;
        this.index[i10] = iAllocateHandle;
        this.handles[iAllocateHandle] = i10;
        shiftUp(i10);
        return iAllocateHandle;
    }

    public final int getSize() {
        return this.size;
    }

    public final long lowestOrDefault(long j10) {
        return this.size > 0 ? this.values[0] : j10;
    }

    public final void remove(int i10) {
        int i11 = this.handles[i10];
        swap(i11, this.size - 1);
        this.size--;
        shiftUp(i11);
        shiftDown(i11);
        freeHandle(i10);
    }

    public final void validate() {
        int i10 = this.size;
        int i11 = 1;
        while (i11 < i10) {
            int i12 = i11 + 1;
            long[] jArr = this.values;
            if (jArr[(i12 >> 1) - 1] > jArr[i11]) {
                throw new IllegalStateException(("Index " + i11 + " is out of place").toString());
            }
            i11 = i12;
        }
    }

    public final void validateHandle(int i10, long j10) {
        int i11 = this.handles[i10];
        if (this.index[i11] != i10) {
            throw new IllegalStateException(("Index for handle " + i10 + " is corrupted").toString());
        }
        if (this.values[i11] == j10) {
            return;
        }
        throw new IllegalStateException(("Value for handle " + i10 + " was " + this.values[i11] + " but was supposed to be " + j10).toString());
    }
}
