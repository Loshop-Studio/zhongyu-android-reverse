package androidx.compose.runtime.snapshots;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;

@Metadata(m5174d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0002J\u0006\u0010\u001d\u001a\u00020\u0011J\u0016\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m5175d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "()V", "firstFreeHandle", "", "handles", "", "index", "<set-?>", "size", "getSize", "()I", "values", "add", "value", "allocateHandle", "ensure", "", "atLeast", "freeHandle", "handle", "lowestOrDefault", "default", "remove", "shiftDown", "shiftUp", "swap", C3335ai.f1705at, "b", "validate", "validateHandle", "runtime_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SnapshotDoubleIndexHeap {
    private int firstFreeHandle;
    private int[] handles;
    private int size;
    private int[] values = new int[16];
    private int[] index = new int[16];

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i4 = 0;
        while (i4 < 16) {
            int i5 = i4 + 1;
            iArr[i4] = i5;
            i4 = i5;
        }
        this.handles = iArr;
    }

    private final int allocateHandle() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i4 = length * 2;
            int[] iArr = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr[i5] = i6;
                i5 = i6;
            }
            ArraysKt___ArraysJvmKt.copyInto$default(this.handles, iArr, 0, 0, 0, 14, (Object) null);
            this.handles = iArr;
        }
        int i7 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i7];
        return i7;
    }

    private final void ensure(int atLeast) {
        int[] iArr = this.values;
        int length = iArr.length;
        if (atLeast <= length) {
            return;
        }
        int i4 = length * 2;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        ArraysKt___ArraysJvmKt.copyInto$default(iArr, iArr2, 0, 0, 0, 14, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto$default(this.index, iArr3, 0, 0, 0, 14, (Object) null);
        this.values = iArr2;
        this.index = iArr3;
    }

    private final void freeHandle(int handle) {
        this.handles[handle] = this.firstFreeHandle;
        this.firstFreeHandle = handle;
    }

    public static /* synthetic */ int lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(i4);
    }

    private final void shiftDown(int index) {
        int i4;
        int[] iArr = this.values;
        int i5 = this.size >> 1;
        while (index < i5) {
            int i6 = (index + 1) << 1;
            int i7 = i6 - 1;
            if (i6 >= this.size || (i4 = iArr[i6]) >= iArr[i7]) {
                if (iArr[i7] >= iArr[index]) {
                    return;
                }
                swap(i7, index);
                index = i7;
            } else {
                if (i4 >= iArr[index]) {
                    return;
                }
                swap(i6, index);
                index = i6;
            }
        }
    }

    private final void shiftUp(int index) {
        int[] iArr = this.values;
        int i4 = iArr[index];
        while (index > 0) {
            int i5 = ((index + 1) >> 1) - 1;
            if (iArr[i5] <= i4) {
                return;
            }
            swap(i5, index);
            index = i5;
        }
    }

    private final void swap(int a4, int b4) {
        int[] iArr = this.values;
        int[] iArr2 = this.index;
        int[] iArr3 = this.handles;
        int i4 = iArr[a4];
        iArr[a4] = iArr[b4];
        iArr[b4] = i4;
        int i5 = iArr2[a4];
        iArr2[a4] = iArr2[b4];
        iArr2[b4] = i5;
        iArr3[iArr2[a4]] = a4;
        iArr3[iArr2[b4]] = b4;
    }

    public final int add(int value) {
        ensure(this.size + 1);
        int i4 = this.size;
        this.size = i4 + 1;
        int iAllocateHandle = allocateHandle();
        this.values[i4] = value;
        this.index[i4] = iAllocateHandle;
        this.handles[iAllocateHandle] = i4;
        shiftUp(i4);
        return iAllocateHandle;
    }

    public final int getSize() {
        return this.size;
    }

    public final int lowestOrDefault(int i4) {
        return this.size > 0 ? this.values[0] : i4;
    }

    public final void remove(int handle) {
        int i4 = this.handles[handle];
        swap(i4, this.size - 1);
        this.size--;
        shiftUp(i4);
        shiftDown(i4);
        freeHandle(handle);
    }

    public final void validate() {
        int i4 = this.size;
        int i5 = 1;
        while (i5 < i4) {
            int i6 = i5 + 1;
            int[] iArr = this.values;
            if (iArr[(i6 >> 1) - 1] > iArr[i5]) {
                throw new IllegalStateException(("Index " + i5 + " is out of place").toString());
            }
            i5 = i6;
        }
    }

    public final void validateHandle(int handle, int value) {
        int i4 = this.handles[handle];
        if (this.index[i4] != handle) {
            throw new IllegalStateException(("Index for handle " + handle + " is corrupted").toString());
        }
        if (this.values[i4] == value) {
            return;
        }
        throw new IllegalStateException(("Value for handle " + handle + " was " + this.values[i4] + " but was supposed to be " + value).toString());
    }
}
