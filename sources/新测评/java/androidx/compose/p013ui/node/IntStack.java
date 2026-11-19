package androidx.compose.p013ui.node;

import androidx.compose.p013ui.internal.InlineClassHelperKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0011\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0086\u0002J\u0006\u0010\u0011\u001a\u00020\fJ \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0006\u0010\u0016\u001a\u00020\u0003J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J&\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003J \u0010 \u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\"\u001a\u00020\u0018J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m13558d2 = {"Landroidx/compose/ui/node/IntStack;", "", "initialCapacity", "", "(I)V", "lastIndex", "size", "getSize", "()I", "stack", "", "compareDiagonal", "", "a", "b", "get", "index", "isNotEmpty", "partition", "start", "end", "elSize", "pop", "pushDiagonal", "", "x", "y", "pushRange", "oldStart", "oldEnd", "newStart", "newEnd", "quickSort", "resizeStack", "sortDiagonals", "swapDiagonal", "i", "j", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,518:1\n56#2,5:519\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n*L\n470#1:519,5\n*E\n"})
/* loaded from: classes2.dex */
final class IntStack {
    private int lastIndex;
    private int[] stack;

    public IntStack(int i10) {
        this.stack = new int[i10];
    }

    private final boolean compareDiagonal(int a10, int b10) {
        int[] iArr = this.stack;
        int i10 = iArr[a10];
        int i11 = iArr[b10];
        return i10 < i11 || (i10 == i11 && iArr[a10 + 1] <= iArr[b10 + 1]);
    }

    private final int partition(int start, int end, int elSize) {
        int i10 = start - elSize;
        while (start < end) {
            if (compareDiagonal(start, end)) {
                i10 += elSize;
                swapDiagonal(i10, start);
            }
            start += elSize;
        }
        int i11 = i10 + elSize;
        swapDiagonal(i11, end);
        return i11;
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

    private final void swapDiagonal(int i10, int j10) {
        int[] iArr = this.stack;
        MyersDiffKt.swap(iArr, i10, j10);
        MyersDiffKt.swap(iArr, i10 + 1, j10 + 1);
        MyersDiffKt.swap(iArr, i10 + 2, j10 + 2);
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
        int i10 = this.lastIndex - 1;
        this.lastIndex = i10;
        return iArr[i10];
    }

    public final void pushDiagonal(int x9, int y9, int size) {
        int i10 = this.lastIndex;
        int[] iArrResizeStack = this.stack;
        int i11 = i10 + 3;
        if (i11 >= iArrResizeStack.length) {
            iArrResizeStack = resizeStack(iArrResizeStack);
        }
        iArrResizeStack[i10] = x9 + size;
        iArrResizeStack[i10 + 1] = y9 + size;
        iArrResizeStack[i10 + 2] = size;
        this.lastIndex = i11;
    }

    public final void pushRange(int oldStart, int oldEnd, int newStart, int newEnd) {
        int i10 = this.lastIndex;
        int[] iArrResizeStack = this.stack;
        int i11 = i10 + 4;
        if (i11 >= iArrResizeStack.length) {
            iArrResizeStack = resizeStack(iArrResizeStack);
        }
        iArrResizeStack[i10] = oldStart;
        iArrResizeStack[i10 + 1] = oldEnd;
        iArrResizeStack[i10 + 2] = newStart;
        iArrResizeStack[i10 + 3] = newEnd;
        this.lastIndex = i11;
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
