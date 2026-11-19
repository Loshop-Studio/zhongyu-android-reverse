package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10968r;

/* loaded from: classes.dex */
public final class MutableIntList extends IntList {
    public MutableIntList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableIntList mutableIntList, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = mutableIntList._size;
        }
        mutableIntList.trim(i10);
    }

    public final boolean add(int i10) {
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i11 = this._size;
        iArr[i11] = i10;
        this._size = i11 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i10, int[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        if (i10 < 0 || i10 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        int[] iArr = this.content;
        int i11 = this._size;
        if (i10 != i11) {
            AbstractC10964p.m24021n(iArr, iArr, elements.length + i10, i10, i11);
        }
        AbstractC10964p.m24027t(elements, iArr, i10, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i10) {
        int[] iArr = this.content;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
            this.content = iArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(int i10) {
        remove(i10);
    }

    public final void plusAssign(IntList elements) {
        AbstractC9979u.m20294g(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(int i10) {
        int iIndexOf = indexOf(i10);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(int[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        for (int i11 : elements) {
            remove(i11);
        }
        return i10 != this._size;
    }

    public final int removeAt(@IntRange(from = 0) int i10) {
        if (i10 < 0 || i10 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i11 = iArr[i10];
        int i12 = this._size;
        if (i10 != i12 - 1) {
            AbstractC10964p.m24021n(iArr, iArr, i10, i10 + 1, i12);
        }
        this._size--;
        return i11;
    }

    public final void removeRange(@IntRange(from = 0) int i10, @IntRange(from = 0) int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this._size) || i11 < 0 || i11 > i12) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (i11 < i10) {
            RuntimeHelpersKt.throwIllegalArgumentException("The end index must be < start index");
        }
        if (i11 != i10) {
            int i13 = this._size;
            if (i11 < i13) {
                int[] iArr = this.content;
                AbstractC10964p.m24021n(iArr, iArr, i10, i11, i13);
            }
            this._size -= i11 - i10;
        }
    }

    public final boolean retainAll(int[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        int[] iArr = this.content;
        int i11 = i10 - 1;
        while (true) {
            int i12 = 0;
            int i13 = -1;
            if (-1 >= i11) {
                break;
            }
            int i14 = iArr[i11];
            int length = elements.length;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (elements[i12] == i14) {
                    i13 = i12;
                    break;
                }
                i12++;
            }
            if (i13 < 0) {
                removeAt(i11);
            }
            i11--;
        }
        return i10 != this._size;
    }

    public final int set(@IntRange(from = 0) int i10, int i11) {
        if (i10 < 0 || i10 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    public final void sort() {
        int i10 = this._size;
        if (i10 == 0) {
            return;
        }
        AbstractC10964p.m24004S(this.content, 0, i10);
    }

    public final void sortDescending() {
        int i10 = this._size;
        if (i10 == 0) {
            return;
        }
        AbstractC10968r.m24073d1(this.content, 0, i10);
    }

    public final void trim(int i10) {
        int iMax = Math.max(i10, this._size);
        int[] iArr = this.content;
        if (iArr.length > iMax) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
            this.content = iArrCopyOf;
        }
    }

    public MutableIntList(int i10) {
        super(i10, null);
    }

    public final void minusAssign(int[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        for (int i10 : elements) {
            remove(i10);
        }
    }

    public final void plusAssign(int[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableIntList(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void plusAssign(int i10) {
        add(i10);
    }

    public final void add(@IntRange(from = 0) int i10, int i11) {
        if (i10 < 0 || i10 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i12 = this._size;
        if (i10 != i12) {
            AbstractC10964p.m24021n(iArr, iArr, i10 + 1, i10, i12);
        }
        iArr[i10] = i11;
        this._size++;
    }

    public final void minusAssign(IntList elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int[] iArr = elements.content;
        int i10 = elements._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(iArr[i11]);
        }
    }

    public final boolean removeAll(IntList elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        int i11 = elements._size - 1;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                remove(elements.get(i12));
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return i10 != this._size;
    }

    public final boolean retainAll(IntList elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        int[] iArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(iArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i10, IntList elements) {
        AbstractC9979u.m20294g(elements, "elements");
        if (i10 < 0 || i10 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i11 = elements._size;
        if (i11 == 0) {
            return false;
        }
        ensureCapacity(this._size + i11);
        int[] iArr = this.content;
        int i12 = this._size;
        if (i10 != i12) {
            AbstractC10964p.m24021n(iArr, iArr, elements._size + i10, i10, i12);
        }
        AbstractC10964p.m24021n(elements.content, iArr, i10, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(IntList elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(int[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return addAll(this._size, elements);
    }
}
