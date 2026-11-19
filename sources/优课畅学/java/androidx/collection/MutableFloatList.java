package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8801r;

/* loaded from: classes.dex */
public final class MutableFloatList extends FloatList {
    public MutableFloatList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableFloatList mutableFloatList, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = mutableFloatList._size;
        }
        mutableFloatList.trim(i10);
    }

    public final boolean add(float f10) {
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i10 = this._size;
        fArr[i10] = f10;
        this._size = i10 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i10, float[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        if (i10 < 0 || i10 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        float[] fArr = this.content;
        int i11 = this._size;
        if (i10 != i11) {
            AbstractC8797p.m14646m(fArr, fArr, elements.length + i10, i10, i11);
        }
        AbstractC8797p.m14652s(elements, fArr, i10, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i10) {
        float[] fArr = this.content;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i10, (fArr.length * 3) / 2));
            AbstractC9133u.m16132f(fArrCopyOf, "copyOf(...)");
            this.content = fArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(float f10) {
        remove(f10);
    }

    public final void plusAssign(FloatList elements) {
        AbstractC9133u.m16133g(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(float f10) {
        int iIndexOf = indexOf(f10);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(float[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        for (float f10 : elements) {
            remove(f10);
        }
        return i10 != this._size;
    }

    public final float removeAt(@IntRange(from = 0) int i10) {
        if (i10 < 0 || i10 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f10 = fArr[i10];
        int i11 = this._size;
        if (i10 != i11 - 1) {
            AbstractC8797p.m14646m(fArr, fArr, i10, i10 + 1, i11);
        }
        this._size--;
        return f10;
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
                float[] fArr = this.content;
                AbstractC8797p.m14646m(fArr, fArr, i10, i11, i13);
            }
            this._size -= i11 - i10;
        }
    }

    public final boolean retainAll(float[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        float[] fArr = this.content;
        int i11 = i10 - 1;
        while (true) {
            int i12 = 0;
            int i13 = -1;
            if (-1 >= i11) {
                break;
            }
            float f10 = fArr[i11];
            int length = elements.length;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (elements[i12] == f10) {
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

    public final float set(@IntRange(from = 0) int i10, float f10) {
        if (i10 < 0 || i10 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    public final void sort() {
        int i10 = this._size;
        if (i10 == 0) {
            return;
        }
        AbstractC8797p.m14628R(this.content, 0, i10);
    }

    public final void sortDescending() {
        int i10 = this._size;
        if (i10 == 0) {
            return;
        }
        AbstractC8801r.m14710h1(this.content, 0, i10);
    }

    public final void trim(int i10) {
        int iMax = Math.max(i10, this._size);
        float[] fArr = this.content;
        if (fArr.length > iMax) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, iMax);
            AbstractC9133u.m16132f(fArrCopyOf, "copyOf(...)");
            this.content = fArrCopyOf;
        }
    }

    public MutableFloatList(int i10) {
        super(i10, null);
    }

    public final void minusAssign(float[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        for (float f10 : elements) {
            remove(f10);
        }
    }

    public final void plusAssign(float[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableFloatList(int i10, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void plusAssign(float f10) {
        add(f10);
    }

    public final void add(@IntRange(from = 0) int i10, float f10) {
        if (i10 < 0 || i10 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i11 = this._size;
        if (i10 != i11) {
            AbstractC8797p.m14646m(fArr, fArr, i10 + 1, i10, i11);
        }
        fArr[i10] = f10;
        this._size++;
    }

    public final void minusAssign(FloatList elements) {
        AbstractC9133u.m16133g(elements, "elements");
        float[] fArr = elements.content;
        int i10 = elements._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(fArr[i11]);
        }
    }

    public final boolean removeAll(FloatList elements) {
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

    public final boolean retainAll(FloatList elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int i10 = this._size;
        float[] fArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(fArr[i11])) {
                removeAt(i11);
            }
        }
        return i10 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i10, FloatList elements) {
        AbstractC9133u.m16133g(elements, "elements");
        if (i10 < 0 || i10 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i11 = elements._size;
        if (i11 == 0) {
            return false;
        }
        ensureCapacity(this._size + i11);
        float[] fArr = this.content;
        int i12 = this._size;
        if (i10 != i12) {
            AbstractC8797p.m14646m(fArr, fArr, elements._size + i10, i10, i12);
        }
        AbstractC8797p.m14646m(elements.content, fArr, i10, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(FloatList elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(float[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return addAll(this._size, elements);
    }
}
