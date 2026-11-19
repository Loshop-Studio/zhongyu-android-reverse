package androidx.compose.p006ui.node;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0006\u0010\f\u001a\u00020\tJ \u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0006\u0010\u0011\u001a\u00020\u0003J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003J&\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003J \u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0006\u0010\u001d\u001a\u00020\u0013J\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m5175d2 = {"Landroidx/compose/ui/node/IntStack;", "", "initialCapacity", "", "(I)V", "lastIndex", "stack", "", "compareDiagonal", "", C3335ai.f1705at, "b", "isNotEmpty", "partition", "start", "end", "elSize", "pop", "pushDiagonal", "", "x", "y", "size", "pushRange", "oldStart", "oldEnd", "newStart", "newEnd", "quickSort", "sortDiagonals", "swapDiagonal", C3335ai.f1660aA, "j", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class IntStack {
    private int lastIndex;
    private int[] stack;

    public IntStack(int i4) {
        this.stack = new int[i4];
    }

    private final boolean compareDiagonal(int a4, int b4) {
        int[] iArr = this.stack;
        int i4 = iArr[a4];
        int i5 = iArr[b4];
        if (i4 >= i5) {
            return i4 == i5 && iArr[a4 + 1] <= iArr[b4 + 1];
        }
        return true;
    }

    private final int partition(int start, int end, int elSize) {
        int i4 = start - elSize;
        while (start < end) {
            if (compareDiagonal(start, end)) {
                i4 += elSize;
                swapDiagonal(i4, start);
            }
            start += elSize;
        }
        int i5 = i4 + elSize;
        swapDiagonal(i5, end);
        return i5;
    }

    private final void quickSort(int start, int end, int elSize) {
        if (start < end) {
            int iPartition = partition(start, end, elSize);
            quickSort(start, iPartition - elSize, elSize);
            quickSort(iPartition + elSize, end, elSize);
        }
    }

    private final void swapDiagonal(int i4, int j4) {
        int[] iArr = this.stack;
        MyersDiffKt.swap(iArr, i4, j4);
        MyersDiffKt.swap(iArr, i4 + 1, j4 + 1);
        MyersDiffKt.swap(iArr, i4 + 2, j4 + 2);
    }

    public final boolean isNotEmpty() {
        return this.lastIndex != 0;
    }

    public final int pop() {
        int[] iArr = this.stack;
        int i4 = this.lastIndex - 1;
        this.lastIndex = i4;
        return iArr[i4];
    }

    public final void pushDiagonal(int x3, int y3, int size) {
        int i4 = this.lastIndex;
        int i5 = i4 + 3;
        int[] iArr = this.stack;
        if (i5 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i4 + 0] = x3 + size;
        iArr2[i4 + 1] = y3 + size;
        iArr2[i4 + 2] = size;
        this.lastIndex = i5;
    }

    public final void pushRange(int oldStart, int oldEnd, int newStart, int newEnd) {
        int i4 = this.lastIndex;
        int i5 = i4 + 4;
        int[] iArr = this.stack;
        if (i5 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i4 + 0] = oldStart;
        iArr2[i4 + 1] = oldEnd;
        iArr2[i4 + 2] = newStart;
        iArr2[i4 + 3] = newEnd;
        this.lastIndex = i5;
    }

    public final void sortDiagonals() {
        int i4 = this.lastIndex;
        if (!(i4 % 3 == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i4 > 3) {
            quickSort(0, i4 - 3, 3);
        }
    }
}
