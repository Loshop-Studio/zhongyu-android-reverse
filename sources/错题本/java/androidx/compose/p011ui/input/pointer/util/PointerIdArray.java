package androidx.compose.p011ui.input.pointer.util;

import androidx.compose.p011ui.input.pointer.PointerId;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0086\bø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u0011J\u001b\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0086\bø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0011J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\nH\u0086\nø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010 \u001a\u00020\u001c¢\u0006\u0004\b \u0010\u0003J\u001b\u0010\"\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0086\bø\u0001\u0001¢\u0006\u0004\b!\u0010\u0011J\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010\u0011R$\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0012\u0010+\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b*\u0010'\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "", "<init>", "()V", "", "minSize", "", "resizeStorage", "(I)[J", "index", "Landroidx/compose/ui/input/pointer/PointerId;", "get-_I2yYro", "(I)J", "get", "pointerId", "", "remove-0FcD4WY", "(J)Z", "remove", "", "pointerIdValue", "removeAt", "(I)Z", "isEmpty", "()Z", "value", "add", "add-0FcD4WY", "Ld6/s;", "set", "(IJ)V", "set-DmW0f2w", "clear", "contains-0FcD4WY", "contains", "<set-?>", "size", "I", "getSize", "()I", "internalArray", "[J", "getLastIndex", "lastIndex", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class PointerIdArray {
    public static final int $stable = 8;

    @NotNull
    private long[] internalArray = new long[2];
    private int size;

    private final long[] resizeStorage(int minSize) {
        long[] jArr = this.internalArray;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(minSize, jArr.length * 2));
        AbstractC5830k.m5329f(jArrCopyOf, "copyOf(...)");
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
    public final boolean m11999add0FcD4WY(long pointerId) {
        return add(pointerId);
    }

    public final void clear() {
        this.size = 0;
    }

    public final boolean contains(long pointerIdValue) {
        int i = this.size;
        for (int i8 = 0; i8 < i; i8++) {
            if (this.internalArray[i8] == pointerIdValue) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: contains-0FcD4WY, reason: not valid java name */
    public final boolean m12000contains0FcD4WY(long pointerId) {
        return contains(pointerId);
    }

    /* renamed from: get-_I2yYro, reason: not valid java name */
    public final long m12001get_I2yYro(int index) {
        return PointerId.m11888constructorimpl(this.internalArray[index]);
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
        int i = this.size;
        int i8 = 0;
        while (i8 < i) {
            if (pointerIdValue == this.internalArray[i8]) {
                int i9 = this.size - 1;
                while (i8 < i9) {
                    long[] jArr = this.internalArray;
                    int i10 = i8 + 1;
                    jArr[i8] = jArr[i10];
                    i8 = i10;
                }
                this.size--;
                return true;
            }
            i8++;
        }
        return false;
    }

    /* renamed from: remove-0FcD4WY, reason: not valid java name */
    public final boolean m12002remove0FcD4WY(long pointerId) {
        return remove(pointerId);
    }

    public final boolean removeAt(int index) {
        int i = this.size;
        if (index >= i) {
            return false;
        }
        int i8 = i - 1;
        while (index < i8) {
            long[] jArr = this.internalArray;
            int i9 = index + 1;
            jArr[index] = jArr[i9];
            index = i9;
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
    public final void m12003setDmW0f2w(int index, long pointerId) {
        set(index, pointerId);
    }
}
