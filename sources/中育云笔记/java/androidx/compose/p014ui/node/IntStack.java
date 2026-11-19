package androidx.compose.p014ui.node;

import androidx.compose.p014ui.internal.InlineClassHelperKt;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
final class IntStack {
    private int lastIndex;
    private int[] stack;

    public IntStack(int i10) {
        this.stack = new int[i10];
    }

    private final boolean compareDiagonal(int i10, int i11) {
        int[] iArr = this.stack;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        return i12 < i13 || (i12 == i13 && iArr[i10 + 1] <= iArr[i11 + 1]);
    }

    private final int partition(int i10, int i11, int i12) {
        int i13 = i10 - i12;
        while (i10 < i11) {
            if (compareDiagonal(i10, i11)) {
                i13 += i12;
                swapDiagonal(i13, i10);
            }
            i10 += i12;
        }
        int i14 = i13 + i12;
        swapDiagonal(i14, i11);
        return i14;
    }

    private final void quickSort(int i10, int i11, int i12) {
        if (i10 < i11) {
            int iPartition = partition(i10, i11, i12);
            quickSort(i10, iPartition - i12, i12);
            quickSort(iPartition + i12, i11, i12);
        }
    }

    private final int[] resizeStack(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
        this.stack = iArrCopyOf;
        return iArrCopyOf;
    }

    private final void swapDiagonal(int i10, int i11) {
        int[] iArr = this.stack;
        MyersDiffKt.swap(iArr, i10, i11);
        MyersDiffKt.swap(iArr, i10 + 1, i11 + 1);
        MyersDiffKt.swap(iArr, i10 + 2, i11 + 2);
    }

    public final int get(int i10) {
        return this.stack[i10];
    }

    public final int getSize() {
        return this.lastIndex;
    }

    public final boolean isNotEmpty() {
        return this.lastIndex != 0;
    }

    public final int pop() {
        int[] iArr = this.stack;
        int i10 = this.lastIndex - 1;
        this.lastIndex = i10;
        return iArr[i10];
    }

    public final void pushDiagonal(int i10, int i11, int i12) {
        int i13 = this.lastIndex;
        int[] iArrResizeStack = this.stack;
        int i14 = i13 + 3;
        if (i14 >= iArrResizeStack.length) {
            iArrResizeStack = resizeStack(iArrResizeStack);
        }
        iArrResizeStack[i13] = i10 + i12;
        iArrResizeStack[i13 + 1] = i11 + i12;
        iArrResizeStack[i13 + 2] = i12;
        this.lastIndex = i14;
    }

    public final void pushRange(int i10, int i11, int i12, int i13) {
        int i14 = this.lastIndex;
        int[] iArrResizeStack = this.stack;
        int i15 = i14 + 4;
        if (i15 >= iArrResizeStack.length) {
            iArrResizeStack = resizeStack(iArrResizeStack);
        }
        iArrResizeStack[i14] = i10;
        iArrResizeStack[i14 + 1] = i11;
        iArrResizeStack[i14 + 2] = i12;
        iArrResizeStack[i14 + 3] = i13;
        this.lastIndex = i15;
    }

    public final void sortDiagonals() {
        int i10 = this.lastIndex;
        if (!(i10 % 3 == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Array size not a multiple of 3");
        }
        if (i10 > 3) {
            quickSort(0, i10 - 3, 3);
        }
    }
}
