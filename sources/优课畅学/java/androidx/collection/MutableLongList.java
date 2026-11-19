package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8801r;

/* loaded from: classes.dex */
public final class MutableLongList extends LongList {
    public MutableLongList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableLongList mutableLongList, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = mutableLongList._size;
        }
        mutableLongList.trim(i10);
    }

    public final boolean add(long j10) {
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i10 = this._size;
        jArr[i10] = j10;
        this._size = i10 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i10, long[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        if (i10 < 0 || i10 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        long[] jArr = this.content;
        int i11 = this._size;
        if (i10 != i11) {
            AbstractC8797p.m14648o(jArr, jArr, elements.length + i10, i10, i11);
        }
        AbstractC8797p.m14654u(elements, jArr, i10, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i10) {
        long[] jArr = this.content;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            AbstractC9133u.m16132f(jArrCopyOf, "copyOf(...)");
            this.content = jArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(long j10) {
        remove(j10);
    }

    public final void plusAssign(LongList elements) {
        AbstractC9133u.m16133g(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(long j10) {
        int iIndexOf = indexOf(j10);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(long[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        for (long j10 : elements) {
            remove(j10);
        }
        return i10 != this._size;
    }

    public final long removeAt(@IntRange(from = 0) int i10) {
        if (i10 < 0 || i10 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j10 = jArr[i10];
        int i11 = this._size;
        if (i10 != i11 - 1) {
            AbstractC8797p.m14648o(jArr, jArr, i10, i10 + 1, i11);
        }
        this._size--;
        return j10;
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
                long[] jArr = this.content;
                AbstractC8797p.m14648o(jArr, jArr, i10, i11, i13);
            }
            this._size -= i11 - i10;
        }
    }

    public final boolean retainAll(long[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        long[] jArr = this.content;
        int i11 = i10 - 1;
        while (true) {
            int i12 = 0;
            int i13 = -1;
            if (-1 >= i11) {
                break;
            }
            long j10 = jArr[i11];
            int length = elements.length;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (elements[i12] == j10) {
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

    public final long set(@IntRange(from = 0) int i10, long j10) {
        if (i10 < 0 || i10 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    public final void sort() {
        int i10 = this._size;
        if (i10 == 0) {
            return;
        }
        AbstractC8797p.m14631U(this.content, 0, i10);
    }

    public final void sortDescending() {
        int i10 = this._size;
        if (i10 == 0) {
            return;
        }
        AbstractC8801r.m14714j1(this.content, 0, i10);
    }

    public final void trim(int i10) {
        int iMax = Math.max(i10, this._size);
        long[] jArr = this.content;
        if (jArr.length > iMax) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            AbstractC9133u.m16132f(jArrCopyOf, "copyOf(...)");
            this.content = jArrCopyOf;
        }
    }

    public MutableLongList(int i10) {
        super(i10, null);
    }

    public final void minusAssign(long[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        for (long j10 : elements) {
            remove(j10);
        }
    }

    public final void plusAssign(long[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableLongList(int i10, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void plusAssign(long j10) {
        add(j10);
    }

    public final void add(@IntRange(from = 0) int i10, long j10) {
        if (i10 < 0 || i10 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i11 = this._size;
        if (i10 != i11) {
            AbstractC8797p.m14648o(jArr, jArr, i10 + 1, i10, i11);
        }
        jArr[i10] = j10;
        this._size++;
    }

    public final void minusAssign(LongList elements) {
        AbstractC9133u.m16133g(elements, "elements");
        long[] jArr = elements.content;
        int i10 = elements._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(jArr[i11]);
        }
    }

    public final boolean removeAll(LongList elements) {
        AbstractC9133u.m16133g(elements, "elements");
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

    public final boolean retainAll(LongList elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        long[] jArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(jArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i10, LongList elements) {
        AbstractC9133u.m16133g(elements, "elements");
        if (i10 < 0 || i10 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i11 = elements._size;
        if (i11 == 0) {
            return false;
        }
        ensureCapacity(this._size + i11);
        long[] jArr = this.content;
        int i12 = this._size;
        if (i10 != i12) {
            AbstractC8797p.m14648o(jArr, jArr, elements._size + i10, i10, i12);
        }
        AbstractC8797p.m14648o(elements.content, jArr, i10, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(LongList elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(long[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return addAll(this._size, elements);
    }
}
