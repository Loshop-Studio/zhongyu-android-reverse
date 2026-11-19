package androidx.compose.runtime.snapshots;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u001b\u0010\u0017\u001a\u00020\u00142\f\b\u0002\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00042\n\u0010\u0019\u001a\u00060\u0014j\u0002`\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\bJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u0003J#\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\n\u0010\u0019\u001a\u00060\u0014j\u0002`\u0015H\u0007¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010&\u001a\u00060$j\u0002`%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u0005\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\"¨\u0006,"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "<init>", "()V", "", "index", "Ld6/s;", "shiftUp", "(I)V", "shiftDown", "a", "b", "swap", "(II)V", "atLeast", "ensure", "allocateHandle", "()I", "handle", "freeHandle", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "default", "lowestOrDefault", "(J)J", "value", "add", "(J)I", "remove", "validate", "validateHandle", "(IJ)V", "<set-?>", "size", "I", "getSize", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "values", "[J", "", "[I", "handles", "firstFreeHandle", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnapshotDoubleIndexHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotDoubleIndexHeap.kt\nandroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap\n+ 2 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n*L\n1#1,201:1\n65#2,2:202\n*S KotlinDebug\n*F\n+ 1 SnapshotDoubleIndexHeap.kt\nandroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap\n*L\n171#1:202,2\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotDoubleIndexHeap {
    public static final int $stable = 8;
    private int firstFreeHandle;

    @NotNull
    private int[] handles;
    private int size;

    @NotNull
    private long[] values = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(16);

    @NotNull
    private int[] index = new int[16];

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i8 = i + 1;
            iArr[i] = i8;
            i = i8;
        }
        this.handles = iArr;
    }

    private final int allocateHandle() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i = length * 2;
            int[] iArr = new int[i];
            int i8 = 0;
            while (i8 < i) {
                int i9 = i8 + 1;
                iArr[i8] = i9;
                i8 = i9;
            }
            AbstractC5802q.m5179F(0, 0, this.handles, iArr, 14);
            this.handles = iArr;
        }
        int i10 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i10];
        return i10;
    }

    private final void ensure(int atLeast) {
        int length = this.values.length;
        if (atLeast <= length) {
            return;
        }
        int i = length * 2;
        long[] jArrSnapshotIdArrayWithCapacity = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(i);
        int[] iArr = new int[i];
        long[] jArr = this.values;
        AbstractC5802q.m5177D(jArr, jArrSnapshotIdArrayWithCapacity, 0, 0, jArr.length);
        AbstractC5802q.m5179F(0, 0, this.index, iArr, 14);
        this.values = jArrSnapshotIdArrayWithCapacity;
        this.index = iArr;
    }

    private final void freeHandle(int handle) {
        this.handles[handle] = this.firstFreeHandle;
        this.firstFreeHandle = handle;
    }

    public static /* synthetic */ long lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, long j7, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(j7);
    }

    private final void shiftDown(int index) {
        long[] jArr = this.values;
        int i = this.size >> 1;
        while (index < i) {
            int i8 = (index + 1) << 1;
            int i9 = i8 - 1;
            if (i8 < this.size) {
                long j7 = jArr[i8];
                if (j7 < jArr[i9]) {
                    if (j7 >= jArr[index]) {
                        return;
                    }
                    swap(i8, index);
                    index = i8;
                }
            }
            if (jArr[i9] >= jArr[index]) {
                return;
            }
            swap(i9, index);
            index = i9;
        }
    }

    private final void shiftUp(int index) {
        long[] jArr = this.values;
        long j7 = jArr[index];
        while (index > 0) {
            int i = ((index + 1) >> 1) - 1;
            if (jArr[i] <= j7) {
                return;
            }
            swap(i, index);
            index = i;
        }
    }

    private final void swap(int a9, int b6) {
        long[] jArr = this.values;
        int[] iArr = this.index;
        int[] iArr2 = this.handles;
        long j7 = jArr[a9];
        jArr[a9] = jArr[b6];
        jArr[b6] = j7;
        int i = iArr[a9];
        int i8 = iArr[b6];
        iArr[a9] = i8;
        iArr[b6] = i;
        iArr2[i8] = a9;
        iArr2[i] = b6;
    }

    public final int add(long value) {
        ensure(this.size + 1);
        int i = this.size;
        this.size = i + 1;
        int iAllocateHandle = allocateHandle();
        this.values[i] = value;
        this.index[i] = iAllocateHandle;
        this.handles[iAllocateHandle] = i;
        shiftUp(i);
        return iAllocateHandle;
    }

    public final int getSize() {
        return this.size;
    }

    public final long lowestOrDefault(long j7) {
        return this.size > 0 ? this.values[0] : j7;
    }

    public final void remove(int handle) {
        int i = this.handles[handle];
        swap(i, this.size - 1);
        this.size--;
        shiftUp(i);
        shiftDown(i);
        freeHandle(handle);
    }

    @TestOnly
    public final void validate() {
        int i = this.size;
        int i8 = 1;
        while (i8 < i) {
            int i9 = i8 + 1;
            long[] jArr = this.values;
            if (jArr[(i9 >> 1) - 1] > jArr[i8]) {
                throw new IllegalStateException(("Index " + i8 + " is out of place").toString());
            }
            i8 = i9;
        }
    }

    @TestOnly
    public final void validateHandle(int handle, long value) {
        int i = this.handles[handle];
        if (this.index[i] != handle) {
            throw new IllegalStateException(("Index for handle " + handle + " is corrupted").toString());
        }
        if (this.values[i] == value) {
            return;
        }
        StringBuilder sbM94s = AbstractC0037f.m94s(handle, "Value for handle ", " was ");
        sbM94s.append(this.values[i]);
        sbM94s.append(" but was supposed to be ");
        sbM94s.append(value);
        throw new IllegalStateException(sbM94s.toString().toString());
    }
}
