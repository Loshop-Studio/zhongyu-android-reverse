package androidx.compose.p012ui.input.pointer.util;

import androidx.compose.p012ui.input.pointer.PointerId;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u001b\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0011J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0013J\u001e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0006H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\rJ\u001b\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0011J\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0013J\u000e\u0010 \u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0006J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0006H\u0002J#\u0010#\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\nø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0019\u0010#\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m13413d2 = {"Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "", "()V", "internalArray", "", "lastIndex", "", "getLastIndex", "()I", "<set-?>", "size", "getSize", "add", "", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "add-0FcD4WY", "(J)Z", "value", "", "clear", "", "contains", "contains-0FcD4WY", "pointerIdValue", "get", "index", "get-_I2yYro", "(I)J", "isEmpty", "remove", "remove-0FcD4WY", "removeAt", "resizeStorage", "minSize", "set", "set-DmW0f2w", "(IJ)V", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class PointerIdArray {
    public static final int $stable = 8;
    private long[] internalArray = new long[2];
    private int size;

    private final long[] resizeStorage(int minSize) {
        long[] jArr = this.internalArray;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(minSize, jArr.length * 2));
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        this.internalArray = jArrCopyOf;
        return jArrCopyOf;
    }

    public final boolean add(long value) {
        if (contains(value)) {
            return false;
        }
        set(this.size, value);
        return true;
    }

    /* renamed from: add-0FcD4WY, reason: not valid java name */
    public final boolean m22723add0FcD4WY(long pointerId) {
        return add(pointerId);
    }

    public final void clear() {
        this.size = 0;
    }

    public final boolean contains(long pointerIdValue) {
        int i9 = this.size;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.internalArray[i10] == pointerIdValue) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: contains-0FcD4WY, reason: not valid java name */
    public final boolean m22724contains0FcD4WY(long pointerId) {
        return contains(pointerId);
    }

    /* renamed from: get-_I2yYro, reason: not valid java name */
    public final long m22725get_I2yYro(int index) {
        return PointerId.m22612constructorimpl(this.internalArray[index]);
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean remove(long pointerIdValue) {
        int i9 = this.size;
        int i10 = 0;
        while (i10 < i9) {
            if (pointerIdValue == this.internalArray[i10]) {
                int i11 = this.size - 1;
                while (i10 < i11) {
                    long[] jArr = this.internalArray;
                    int i12 = i10 + 1;
                    jArr[i10] = jArr[i12];
                    i10 = i12;
                }
                this.size--;
                return true;
            }
            i10++;
        }
        return false;
    }

    /* renamed from: remove-0FcD4WY, reason: not valid java name */
    public final boolean m22726remove0FcD4WY(long pointerId) {
        return remove(pointerId);
    }

    public final boolean removeAt(int index) {
        int i9 = this.size;
        if (index >= i9) {
            return false;
        }
        int i10 = i9 - 1;
        while (index < i10) {
            long[] jArr = this.internalArray;
            int i11 = index + 1;
            jArr[index] = jArr[i11];
            index = i11;
        }
        this.size--;
        return true;
    }

    public final void set(int index, long value) {
        long[] jArrResizeStorage = this.internalArray;
        if (index >= jArrResizeStorage.length) {
            jArrResizeStorage = resizeStorage(index + 1);
        }
        jArrResizeStorage[index] = value;
        if (index >= this.size) {
            this.size = index + 1;
        }
    }

    /* renamed from: set-DmW0f2w, reason: not valid java name */
    public final void m22727setDmW0f2w(int index, long pointerId) {
        set(index, pointerId);
    }
}
