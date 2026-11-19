package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class LongSparseArray<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private long[] mKeys;
    private int mSize;
    private Object[] mValues;

    public LongSparseArray() {
        this(10);
    }

    /* renamed from: gc */
    private void m132gc() {
        int i4 = this.mSize;
        long[] jArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != DELETED) {
                if (i6 != i5) {
                    jArr[i5] = jArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.mGarbage = false;
        this.mSize = i5;
    }

    public void append(long j4, E e4) {
        int i4 = this.mSize;
        if (i4 != 0 && j4 <= this.mKeys[i4 - 1]) {
            put(j4, e4);
            return;
        }
        if (this.mGarbage && i4 >= this.mKeys.length) {
            m132gc();
        }
        int i5 = this.mSize;
        if (i5 >= this.mKeys.length) {
            int iIdealLongArraySize = ContainerHelpers.idealLongArraySize(i5 + 1);
            long[] jArr = new long[iIdealLongArraySize];
            Object[] objArr = new Object[iIdealLongArraySize];
            long[] jArr2 = this.mKeys;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.mValues;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.mKeys = jArr;
            this.mValues = objArr;
        }
        this.mKeys[i5] = j4;
        this.mValues[i5] = e4;
        this.mSize = i5 + 1;
    }

    public void clear() {
        int i4 = this.mSize;
        Object[] objArr = this.mValues;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    public boolean containsKey(long j4) {
        return indexOfKey(j4) >= 0;
    }

    public boolean containsValue(E e4) {
        return indexOfValue(e4) >= 0;
    }

    @Deprecated
    public void delete(long j4) {
        remove(j4);
    }

    @Nullable
    public E get(long j4) {
        return get(j4, null);
    }

    public int indexOfKey(long j4) {
        if (this.mGarbage) {
            m132gc();
        }
        return ContainerHelpers.binarySearch(this.mKeys, this.mSize, j4);
    }

    public int indexOfValue(E e4) {
        if (this.mGarbage) {
            m132gc();
        }
        for (int i4 = 0; i4 < this.mSize; i4++) {
            if (this.mValues[i4] == e4) {
                return i4;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i4) {
        if (this.mGarbage) {
            m132gc();
        }
        return this.mKeys[i4];
    }

    public void put(long j4, E e4) {
        int iBinarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j4);
        if (iBinarySearch >= 0) {
            this.mValues[iBinarySearch] = e4;
            return;
        }
        int i4 = ~iBinarySearch;
        int i5 = this.mSize;
        if (i4 < i5) {
            Object[] objArr = this.mValues;
            if (objArr[i4] == DELETED) {
                this.mKeys[i4] = j4;
                objArr[i4] = e4;
                return;
            }
        }
        if (this.mGarbage && i5 >= this.mKeys.length) {
            m132gc();
            i4 = ~ContainerHelpers.binarySearch(this.mKeys, this.mSize, j4);
        }
        int i6 = this.mSize;
        if (i6 >= this.mKeys.length) {
            int iIdealLongArraySize = ContainerHelpers.idealLongArraySize(i6 + 1);
            long[] jArr = new long[iIdealLongArraySize];
            Object[] objArr2 = new Object[iIdealLongArraySize];
            long[] jArr2 = this.mKeys;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = jArr;
            this.mValues = objArr2;
        }
        int i7 = this.mSize;
        if (i7 - i4 != 0) {
            long[] jArr3 = this.mKeys;
            int i8 = i4 + 1;
            System.arraycopy(jArr3, i4, jArr3, i8, i7 - i4);
            Object[] objArr4 = this.mValues;
            System.arraycopy(objArr4, i4, objArr4, i8, this.mSize - i4);
        }
        this.mKeys[i4] = j4;
        this.mValues[i4] = e4;
        this.mSize++;
    }

    public void putAll(@NonNull LongSparseArray<? extends E> longSparseArray) {
        int size = longSparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            put(longSparseArray.keyAt(i4), longSparseArray.valueAt(i4));
        }
    }

    @Nullable
    public E putIfAbsent(long j4, E e4) {
        E e5 = get(j4);
        if (e5 == null) {
            put(j4, e4);
        }
        return e5;
    }

    public void remove(long j4) {
        int iBinarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j4);
        if (iBinarySearch >= 0) {
            Object[] objArr = this.mValues;
            Object obj = objArr[iBinarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[iBinarySearch] = obj2;
                this.mGarbage = true;
            }
        }
    }

    public void removeAt(int i4) {
        Object[] objArr = this.mValues;
        Object obj = objArr[i4];
        Object obj2 = DELETED;
        if (obj != obj2) {
            objArr[i4] = obj2;
            this.mGarbage = true;
        }
    }

    @Nullable
    public E replace(long j4, E e4) {
        int iIndexOfKey = indexOfKey(j4);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.mValues;
        E e5 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e4;
        return e5;
    }

    public void setValueAt(int i4, E e4) {
        if (this.mGarbage) {
            m132gc();
        }
        this.mValues[i4] = e4;
    }

    public int size() {
        if (this.mGarbage) {
            m132gc();
        }
        return this.mSize;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.mSize; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i4));
            sb.append('=');
            E eValueAt = valueAt(i4);
            if (eValueAt != this) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E valueAt(int i4) {
        if (this.mGarbage) {
            m132gc();
        }
        return (E) this.mValues[i4];
    }

    public LongSparseArray(int i4) {
        this.mGarbage = false;
        if (i4 == 0) {
            this.mKeys = ContainerHelpers.EMPTY_LONGS;
            this.mValues = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            int iIdealLongArraySize = ContainerHelpers.idealLongArraySize(i4);
            this.mKeys = new long[iIdealLongArraySize];
            this.mValues = new Object[iIdealLongArraySize];
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public LongSparseArray<E> m6924clone() {
        try {
            LongSparseArray<E> longSparseArray = (LongSparseArray) super.clone();
            longSparseArray.mKeys = (long[]) this.mKeys.clone();
            longSparseArray.mValues = (Object[]) this.mValues.clone();
            return longSparseArray;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public E get(long j4, E e4) {
        E e5;
        int iBinarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, j4);
        return (iBinarySearch < 0 || (e5 = (E) this.mValues[iBinarySearch]) == DELETED) ? e4 : e5;
    }

    public boolean replace(long j4, E e4, E e5) {
        int iIndexOfKey = indexOfKey(j4);
        if (iIndexOfKey < 0) {
            return false;
        }
        Object obj = this.mValues[iIndexOfKey];
        if (obj != e4 && (e4 == null || !e4.equals(obj))) {
            return false;
        }
        this.mValues[iIndexOfKey] = e5;
        return true;
    }

    public boolean remove(long j4, Object obj) {
        int iIndexOfKey = indexOfKey(j4);
        if (iIndexOfKey < 0) {
            return false;
        }
        E eValueAt = valueAt(iIndexOfKey);
        if (obj != eValueAt && (obj == null || !obj.equals(eValueAt))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }
}
