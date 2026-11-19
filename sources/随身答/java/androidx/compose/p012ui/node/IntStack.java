package androidx.compose.p012ui.node;

import androidx.compose.p012ui.internal.InlineClassHelperKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0011\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0086\u0002J\u0006\u0010\u0011\u001a\u00020\fJ \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0006\u0010\u0016\u001a\u00020\u0003J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J&\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003J \u0010 \u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\"\u001a\u00020\u0018J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m13413d2 = {"Landroidx/compose/ui/node/IntStack;", "", "initialCapacity", "", "(I)V", "lastIndex", "size", "getSize", "()I", "stack", "", "compareDiagonal", "", "a", "b", "get", "index", "isNotEmpty", "partition", "start", "end", "elSize", "pop", "pushDiagonal", "", "x", "y", "pushRange", "oldStart", "oldEnd", "newStart", "newEnd", "quickSort", "resizeStack", "sortDiagonals", "swapDiagonal", "i", "j", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,518:1\n56#2,5:519\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n*L\n470#1:519,5\n*E\n"})
/* loaded from: classes2.dex */
final class IntStack {
    private int lastIndex;
    private int[] stack;

    public IntStack(int i9) {
        this.stack = new int[i9];
    }

    private final boolean compareDiagonal(int a10, int b10) {
        int[] iArr = this.stack;
        int i9 = iArr[a10];
        int i10 = iArr[b10];
        return i9 < i10 || (i9 == i10 && iArr[a10 + 1] <= iArr[b10 + 1]);
    }

    private final int partition(int start, int end, int elSize) {
        int i9 = start - elSize;
        while (start < end) {
            if (compareDiagonal(start, end)) {
                i9 += elSize;
                swapDiagonal(i9, start);
            }
            start += elSize;
        }
        int i10 = i9 + elSize;
        swapDiagonal(i10, end);
        return i10;
    }

    private final void quickSort(int start, int end, int elSize) {
        if (start < end) {
            int iPartition = partition(start, end, elSize);
            quickSort(start, iPartition - elSize, elSize);
            quickSort(iPartition + elSize, end, elSize);
        }
    }

    private final int[] resizeStack(int[] stack) {
        int[] iArrCopyOf = Arrays.copyOf(stack, stack.length * 2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.stack = iArrCopyOf;
        return iArrCopyOf;
    }

    private final void swapDiagonal(int i9, int j9) {
        int[] iArr = this.stack;
        MyersDiffKt.swap(iArr, i9, j9);
        MyersDiffKt.swap(iArr, i9 + 1, j9 + 1);
        MyersDiffKt.swap(iArr, i9 + 2, j9 + 2);
    }

    public final int get(int index) {
        return this.stack[index];
    }

    /* renamed from: getSize, reason: from getter */
    public final int getLastIndex() {
        return this.lastIndex;
    }

    public final boolean isNotEmpty() {
        return this.lastIndex != 0;
    }

    public final int pop() {
        int[] iArr = this.stack;
        int i9 = this.lastIndex - 1;
        this.lastIndex = i9;
        return iArr[i9];
    }

    public final void pushDiagonal(int x9, int y9, int size) {
        int i9 = this.lastIndex;
        int[] iArrResizeStack = this.stack;
        int i10 = i9 + 3;
        if (i10 >= iArrResizeStack.length) {
            iArrResizeStack = resizeStack(iArrResizeStack);
        }
        iArrResizeStack[i9] = x9 + size;
        iArrResizeStack[i9 + 1] = y9 + size;
        iArrResizeStack[i9 + 2] = size;
        this.lastIndex = i10;
    }

    public final void pushRange(int oldStart, int oldEnd, int newStart, int newEnd) {
        int i9 = this.lastIndex;
        int[] iArrResizeStack = this.stack;
        int i10 = i9 + 4;
        if (i10 >= iArrResizeStack.length) {
            iArrResizeStack = resizeStack(iArrResizeStack);
        }
        iArrResizeStack[i9] = oldStart;
        iArrResizeStack[i9 + 1] = oldEnd;
        iArrResizeStack[i9 + 2] = newStart;
        iArrResizeStack[i9 + 3] = newEnd;
        this.lastIndex = i10;
    }

    public final void sortDiagonals() {
        int i9 = this.lastIndex;
        if (!(i9 % 3 == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Array size not a multiple of 3");
        }
        if (i9 > 3) {
            quickSort(0, i9 - 3, 3);
        }
    }
}
