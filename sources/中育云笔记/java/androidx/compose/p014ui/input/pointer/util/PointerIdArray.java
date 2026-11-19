package androidx.compose.p014ui.input.pointer.util;

import androidx.compose.p014ui.input.pointer.PointerId;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PointerIdArray {
    public static final int $stable = 8;
    private long[] internalArray = new long[2];
    private int size;

    private final long[] resizeStorage(int i10) {
        long[] jArr = this.internalArray;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, jArr.length * 2));
        AbstractC9979u.m20293f(jArrCopyOf, "copyOf(...)");
        this.internalArray = jArrCopyOf;
        return jArrCopyOf;
    }

    public final boolean add(long j10) {
        if (contains(j10)) {
            return false;
        }
        set(this.size, j10);
        return true;
    }

    /* renamed from: add-0FcD4WY, reason: not valid java name */
    public final boolean m32195add0FcD4WY(long j10) {
        return add(j10);
    }

    public final void clear() {
        this.size = 0;
    }

    public final boolean contains(long j10) {
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.internalArray[i11] == j10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: contains-0FcD4WY, reason: not valid java name */
    public final boolean m32196contains0FcD4WY(long j10) {
        return contains(j10);
    }

    /* renamed from: get-_I2yYro, reason: not valid java name */
    public final long m32197get_I2yYro(int i10) {
        return PointerId.m32084constructorimpl(this.internalArray[i10]);
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

    public final boolean remove(long j10) {
        int i10 = this.size;
        int i11 = 0;
        while (i11 < i10) {
            if (j10 == this.internalArray[i11]) {
                int i12 = this.size - 1;
                while (i11 < i12) {
                    long[] jArr = this.internalArray;
                    int i13 = i11 + 1;
                    jArr[i11] = jArr[i13];
                    i11 = i13;
                }
                this.size--;
                return true;
            }
            i11++;
        }
        return false;
    }

    /* renamed from: remove-0FcD4WY, reason: not valid java name */
    public final boolean m32198remove0FcD4WY(long j10) {
        return remove(j10);
    }

    public final boolean removeAt(int i10) {
        int i11 = this.size;
        if (i10 >= i11) {
            return false;
        }
        int i12 = i11 - 1;
        while (i10 < i12) {
            long[] jArr = this.internalArray;
            int i13 = i10 + 1;
            jArr[i10] = jArr[i13];
            i10 = i13;
        }
        this.size--;
        return true;
    }

    public final void set(int i10, long j10) {
        long[] jArrResizeStorage = this.internalArray;
        if (i10 >= jArrResizeStorage.length) {
            jArrResizeStorage = resizeStorage(i10 + 1);
        }
        jArrResizeStorage[i10] = j10;
        if (i10 >= this.size) {
            this.size = i10 + 1;
        }
    }

    /* renamed from: set-DmW0f2w, reason: not valid java name */
    public final void m32199setDmW0f2w(int i10, long j10) {
        set(i10, j10);
    }
}
