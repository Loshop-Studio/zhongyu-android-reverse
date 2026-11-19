package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0014\u0010\u0019\u001a\u00020\u00112\f\b\u0002\u0010\u001a\u001a\u00060\u0011j\u0002`\u0012J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0002J\b\u0010!\u001a\u00020\u0015H\u0007J\u001c\u0010\"\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00042\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00060\rj\u0002`\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m7880d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "()V", "firstFreeHandle", "", "handles", "", "index", "<set-?>", "size", "getSize", "()I", "values", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "add", "value", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "allocateHandle", "ensure", "", "atLeast", "freeHandle", "handle", "lowestOrDefault", "default", "remove", "shiftDown", "shiftUp", "swap", "a", "b", "validate", "validateHandle", "runtime_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
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
        int i6 = 0;
        while (i6 < 16) {
            int i7 = i6 + 1;
            iArr[i6] = i7;
            i6 = i7;
        }
        this.handles = iArr;
    }

    private final int allocateHandle() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i6 = length * 2;
            int[] iArr = new int[i6];
            int i7 = 0;
            while (i7 < i6) {
                int i8 = i7 + 1;
                iArr[i7] = i8;
                i7 = i8;
            }
            ArraysKt.copyInto$default(this.handles, iArr, 0, 0, 0, 14, (Object) null);
            this.handles = iArr;
        }
        int i9 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i9];
        return i9;
    }

    private final void ensure(int atLeast) {
        int length = this.values.length;
        if (atLeast <= length) {
            return;
        }
        int i6 = length * 2;
        long[] jArrSnapshotIdArrayWithCapacity = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(i6);
        int[] iArr = new int[i6];
        ArraysKt.copyInto$default(this.values, jArrSnapshotIdArrayWithCapacity, 0, 0, 0, 12, (Object) null);
        ArraysKt.copyInto$default(this.index, iArr, 0, 0, 0, 14, (Object) null);
        this.values = jArrSnapshotIdArrayWithCapacity;
        this.index = iArr;
    }

    private final void freeHandle(int handle) {
        this.handles[handle] = this.firstFreeHandle;
        this.firstFreeHandle = handle;
    }

    public static /* synthetic */ long lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, long j6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            j6 = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(j6);
    }

    private final void shiftDown(int index) {
        long[] jArr = this.values;
        int i6 = this.size >> 1;
        while (index < i6) {
            int i7 = (index + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < this.size) {
                long j6 = jArr[i7];
                if (j6 < jArr[i8]) {
                    if (j6 >= jArr[index]) {
                        return;
                    }
                    swap(i7, index);
                    index = i7;
                }
            }
            if (jArr[i8] >= jArr[index]) {
                return;
            }
            swap(i8, index);
            index = i8;
        }
    }

    private final void shiftUp(int index) {
        long[] jArr = this.values;
        long j6 = jArr[index];
        while (index > 0) {
            int i6 = ((index + 1) >> 1) - 1;
            if (jArr[i6] <= j6) {
                return;
            }
            swap(i6, index);
            index = i6;
        }
    }

    private final void swap(int a7, int b7) {
        long[] jArr = this.values;
        int[] iArr = this.index;
        int[] iArr2 = this.handles;
        long j6 = jArr[a7];
        jArr[a7] = jArr[b7];
        jArr[b7] = j6;
        int i6 = iArr[a7];
        int i7 = iArr[b7];
        iArr[a7] = i7;
        iArr[b7] = i6;
        iArr2[i7] = a7;
        iArr2[i6] = b7;
    }

    public final int add(long value) {
        ensure(this.size + 1);
        int i6 = this.size;
        this.size = i6 + 1;
        int iAllocateHandle = allocateHandle();
        this.values[i6] = value;
        this.index[i6] = iAllocateHandle;
        this.handles[iAllocateHandle] = i6;
        shiftUp(i6);
        return iAllocateHandle;
    }

    public final int getSize() {
        return this.size;
    }

    public final long lowestOrDefault(long j6) {
        return this.size > 0 ? this.values[0] : j6;
    }

    public final void remove(int handle) {
        int i6 = this.handles[handle];
        swap(i6, this.size - 1);
        this.size--;
        shiftUp(i6);
        shiftDown(i6);
        freeHandle(handle);
    }

    public final void validate() {
        int i6 = this.size;
        int i7 = 1;
        while (i7 < i6) {
            int i8 = i7 + 1;
            long[] jArr = this.values;
            if (jArr[(i8 >> 1) - 1] > jArr[i7]) {
                throw new IllegalStateException(("Index " + i7 + " is out of place").toString());
            }
            i7 = i8;
        }
    }

    public final void validateHandle(int handle, long value) {
        int i6 = this.handles[handle];
        if (this.index[i6] != handle) {
            throw new IllegalStateException(("Index for handle " + handle + " is corrupted").toString());
        }
        if (this.values[i6] == value) {
            return;
        }
        throw new IllegalStateException(("Value for handle " + handle + " was " + this.values[i6] + " but was supposed to be " + value).toString());
    }
}
