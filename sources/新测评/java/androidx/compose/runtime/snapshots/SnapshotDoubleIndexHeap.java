package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0014\u0010\u0019\u001a\u00020\u00112\f\b\u0002\u0010\u001a\u001a\u00060\u0011j\u0002`\u0012J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0002J\b\u0010!\u001a\u00020\u0015H\u0007J\u001c\u0010\"\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00042\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00060\rj\u0002`\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m13558d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "()V", "firstFreeHandle", "", "handles", "", "index", "<set-?>", "size", "getSize", "()I", "values", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "add", "value", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "allocateHandle", "ensure", "", "atLeast", "freeHandle", "handle", "lowestOrDefault", "default", "remove", "shiftDown", "shiftUp", "swap", "a", "b", "validate", "validateHandle", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotDoubleIndexHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotDoubleIndexHeap.kt\nandroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap\n+ 2 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n*L\n1#1,201:1\n65#2,2:202\n*S KotlinDebug\n*F\n+ 1 SnapshotDoubleIndexHeap.kt\nandroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap\n*L\n171#1:202,2\n*E\n"})
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
            ArraysKt.copyInto$default(this.handles, iArr, 0, 0, 0, 14, (Object) null);
            this.handles = iArr;
        }
        int i13 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i13];
        return i13;
    }

    private final void ensure(int atLeast) {
        int length = this.values.length;
        if (atLeast <= length) {
            return;
        }
        int i10 = length * 2;
        long[] jArrSnapshotIdArrayWithCapacity = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(i10);
        int[] iArr = new int[i10];
        ArraysKt.copyInto$default(this.values, jArrSnapshotIdArrayWithCapacity, 0, 0, 0, 12, (Object) null);
        ArraysKt.copyInto$default(this.index, iArr, 0, 0, 0, 14, (Object) null);
        this.values = jArrSnapshotIdArrayWithCapacity;
        this.index = iArr;
    }

    private final void freeHandle(int handle) {
        this.handles[handle] = this.firstFreeHandle;
        this.firstFreeHandle = handle;
    }

    public static /* synthetic */ long lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(j10);
    }

    private final void shiftDown(int index) {
        long[] jArr = this.values;
        int i10 = this.size >> 1;
        while (index < i10) {
            int i11 = (index + 1) << 1;
            int i12 = i11 - 1;
            if (i11 < this.size) {
                long j10 = jArr[i11];
                if (j10 < jArr[i12]) {
                    if (j10 >= jArr[index]) {
                        return;
                    }
                    swap(i11, index);
                    index = i11;
                }
            }
            if (jArr[i12] >= jArr[index]) {
                return;
            }
            swap(i12, index);
            index = i12;
        }
    }

    private final void shiftUp(int index) {
        long[] jArr = this.values;
        long j10 = jArr[index];
        while (index > 0) {
            int i10 = ((index + 1) >> 1) - 1;
            if (jArr[i10] <= j10) {
                return;
            }
            swap(i10, index);
            index = i10;
        }
    }

    private final void swap(int a10, int b10) {
        long[] jArr = this.values;
        int[] iArr = this.index;
        int[] iArr2 = this.handles;
        long j10 = jArr[a10];
        jArr[a10] = jArr[b10];
        jArr[b10] = j10;
        int i10 = iArr[a10];
        int i11 = iArr[b10];
        iArr[a10] = i11;
        iArr[b10] = i10;
        iArr2[i11] = a10;
        iArr2[i10] = b10;
    }

    public final int add(long value) {
        ensure(this.size + 1);
        int i10 = this.size;
        this.size = i10 + 1;
        int iAllocateHandle = allocateHandle();
        this.values[i10] = value;
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

    public final void remove(int handle) {
        int i10 = this.handles[handle];
        swap(i10, this.size - 1);
        this.size--;
        shiftUp(i10);
        shiftDown(i10);
        freeHandle(handle);
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

    public final void validateHandle(int handle, long value) {
        int i10 = this.handles[handle];
        if (this.index[i10] != handle) {
            throw new IllegalStateException(("Index for handle " + handle + " is corrupted").toString());
        }
        if (this.values[i10] == value) {
            return;
        }
        throw new IllegalStateException(("Value for handle " + handle + " was " + this.values[i10] + " but was supposed to be " + value).toString());
    }
}
