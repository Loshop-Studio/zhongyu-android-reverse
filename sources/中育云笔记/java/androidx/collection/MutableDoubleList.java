package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10968r;

/* loaded from: classes.dex */
public final class MutableDoubleList extends DoubleList {
    public MutableDoubleList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableDoubleList mutableDoubleList, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = mutableDoubleList._size;
        }
        mutableDoubleList.trim(i10);
    }

    public final boolean add(double d10) {
        ensureCapacity(this._size + 1);
        double[] dArr = this.content;
        int i10 = this._size;
        dArr[i10] = d10;
        this._size = i10 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i10, double[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        if (i10 < 0 || i10 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        double[] dArr = this.content;
        int i11 = this._size;
        if (i10 != i11) {
            AbstractC10964p.m24019l(dArr, dArr, elements.length + i10, i10, i11);
        }
        AbstractC10964p.m24025r(elements, dArr, i10, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i10) {
        double[] dArr = this.content;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, Math.max(i10, (dArr.length * 3) / 2));
            AbstractC9979u.m20293f(dArrCopyOf, "copyOf(...)");
            this.content = dArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(double d10) {
        remove(d10);
    }

    public final void plusAssign(DoubleList elements) {
        AbstractC9979u.m20294g(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(double d10) {
        int iIndexOf = indexOf(d10);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(double[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        for (double d10 : elements) {
            remove(d10);
        }
        return i10 != this._size;
    }

    public final double removeAt(@IntRange(from = 0) int i10) {
        if (i10 < 0 || i10 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        double[] dArr = this.content;
        double d10 = dArr[i10];
        int i11 = this._size;
        if (i10 != i11 - 1) {
            AbstractC10964p.m24019l(dArr, dArr, i10, i10 + 1, i11);
        }
        this._size--;
        return d10;
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
                double[] dArr = this.content;
                AbstractC10964p.m24019l(dArr, dArr, i10, i11, i13);
            }
            this._size -= i11 - i10;
        }
    }

    public final boolean retainAll(double[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        double[] dArr = this.content;
        int i11 = i10 - 1;
        while (true) {
            int i12 = 0;
            int i13 = -1;
            if (-1 >= i11) {
                break;
            }
            double d10 = dArr[i11];
            int length = elements.length;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (elements[i12] == d10) {
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

    public final double set(@IntRange(from = 0) int i10, double d10) {
        if (i10 < 0 || i10 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        double[] dArr = this.content;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    public final void sort() {
        int i10 = this._size;
        if (i10 == 0) {
            return;
        }
        AbstractC10964p.m24001P(this.content, 0, i10);
    }

    public final void sortDescending() {
        int i10 = this._size;
        if (i10 == 0) {
            return;
        }
        AbstractC10968r.m24069b1(this.content, 0, i10);
    }

    public final void trim(int i10) {
        int iMax = Math.max(i10, this._size);
        double[] dArr = this.content;
        if (dArr.length > iMax) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, iMax);
            AbstractC9979u.m20293f(dArrCopyOf, "copyOf(...)");
            this.content = dArrCopyOf;
        }
    }

    public MutableDoubleList(int i10) {
        super(i10, null);
    }

    public final void minusAssign(double[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        for (double d10 : elements) {
            remove(d10);
        }
    }

    public final void plusAssign(double[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableDoubleList(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void plusAssign(double d10) {
        add(d10);
    }

    public final void add(@IntRange(from = 0) int i10, double d10) {
        if (i10 < 0 || i10 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        double[] dArr = this.content;
        int i11 = this._size;
        if (i10 != i11) {
            AbstractC10964p.m24019l(dArr, dArr, i10 + 1, i10, i11);
        }
        dArr[i10] = d10;
        this._size++;
    }

    public final void minusAssign(DoubleList elements) {
        AbstractC9979u.m20294g(elements, "elements");
        double[] dArr = elements.content;
        int i10 = elements._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(dArr[i11]);
        }
    }

    public final boolean removeAll(DoubleList elements) {
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

    public final boolean retainAll(DoubleList elements) {
        AbstractC9979u.m20294g(elements, "elements");
        int i10 = this._size;
        double[] dArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(dArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i10, DoubleList elements) {
        AbstractC9979u.m20294g(elements, "elements");
        if (i10 < 0 || i10 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i11 = elements._size;
        if (i11 == 0) {
            return false;
        }
        ensureCapacity(this._size + i11);
        double[] dArr = this.content;
        int i12 = this._size;
        if (i10 != i12) {
            AbstractC10964p.m24019l(dArr, dArr, elements._size + i10, i10, i12);
        }
        AbstractC10964p.m24019l(elements.content, dArr, i10, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(DoubleList elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(double[] elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return addAll(this._size, elements);
    }
}
