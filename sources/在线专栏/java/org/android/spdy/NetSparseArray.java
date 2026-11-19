package org.android.spdy;

/* loaded from: classes.dex */
public class NetSparseArray<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    public NetSparseArray() {
        this(10);
    }

    private static int binarySearch(int[] iArr, int i4, int i5, int i6) {
        int i7 = i5 + i4;
        int i8 = i4 - 1;
        int i9 = i7;
        while (i9 - i8 > 1) {
            int i10 = (i9 + i8) / 2;
            if (iArr[i10] < i6) {
                i8 = i10;
            } else {
                i9 = i10;
            }
        }
        return i9 == i7 ? ~i7 : iArr[i9] == i6 ? i9 : ~i9;
    }

    /* renamed from: gc */
    private void m10042gc() {
        int i4 = this.mSize;
        int[] iArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != DELETED) {
                if (i6 != i5) {
                    iArr[i5] = iArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.mGarbage = false;
        this.mSize = i5;
    }

    public void append(int i4, E e4) {
        int i5 = this.mSize;
        if (i5 != 0 && i4 <= this.mKeys[i5 - 1]) {
            put(i4, e4);
            return;
        }
        if (this.mGarbage && i5 >= this.mKeys.length) {
            m10042gc();
        }
        int i6 = this.mSize;
        int[] iArr = this.mKeys;
        if (i6 >= iArr.length) {
            int i7 = i6 + 1;
            int[] iArr2 = new int[i7];
            Object[] objArr = new Object[i7];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            Object[] objArr2 = this.mValues;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.mKeys = iArr2;
            this.mValues = objArr;
        }
        this.mKeys[i6] = i4;
        this.mValues[i6] = e4;
        this.mSize = i6 + 1;
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

    public void delete(int i4) {
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, i4);
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

    public E get(int i4) {
        return get(i4, null);
    }

    public int indexOfKey(int i4) {
        if (this.mGarbage) {
            m10042gc();
        }
        return binarySearch(this.mKeys, 0, this.mSize, i4);
    }

    public int indexOfValue(E e4) {
        if (this.mGarbage) {
            m10042gc();
        }
        for (int i4 = 0; i4 < this.mSize; i4++) {
            if (this.mValues[i4] == e4) {
                return i4;
            }
        }
        return -1;
    }

    public int keyAt(int i4) {
        if (this.mGarbage) {
            m10042gc();
        }
        return this.mKeys[i4];
    }

    public void put(int i4, E e4) {
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, i4);
        if (iBinarySearch >= 0) {
            this.mValues[iBinarySearch] = e4;
            return;
        }
        int i5 = ~iBinarySearch;
        int i6 = this.mSize;
        if (i5 < i6) {
            Object[] objArr = this.mValues;
            if (objArr[i5] == DELETED) {
                this.mKeys[i5] = i4;
                objArr[i5] = e4;
                return;
            }
        }
        if (this.mGarbage && i6 >= this.mKeys.length) {
            m10042gc();
            i5 = ~binarySearch(this.mKeys, 0, this.mSize, i4);
        }
        int i7 = this.mSize;
        int[] iArr = this.mKeys;
        if (i7 >= iArr.length) {
            int i8 = i7 + 20;
            int[] iArr2 = new int[i8];
            Object[] objArr2 = new Object[i8];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = iArr2;
            this.mValues = objArr2;
        }
        int i9 = this.mSize;
        if (i9 - i5 != 0) {
            int[] iArr3 = this.mKeys;
            int i10 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i10, i9 - i5);
            Object[] objArr4 = this.mValues;
            System.arraycopy(objArr4, i5, objArr4, i10, this.mSize - i5);
        }
        this.mKeys[i5] = i4;
        this.mValues[i5] = e4;
        this.mSize++;
    }

    public void remove(int i4) {
        delete(i4);
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

    public void setValueAt(int i4, E e4) {
        if (this.mGarbage) {
            m10042gc();
        }
        this.mValues[i4] = e4;
    }

    public int size() {
        if (this.mGarbage) {
            m10042gc();
        }
        return this.mSize;
    }

    public void toArray(E[] eArr) {
        for (int i4 = 0; i4 < eArr.length; i4++) {
            eArr[i4] = this.mValues[i4];
        }
    }

    public E valueAt(int i4) {
        if (this.mGarbage) {
            m10042gc();
        }
        return (E) this.mValues[i4];
    }

    public NetSparseArray(int i4) {
        this.mGarbage = false;
        this.mKeys = new int[i4];
        this.mValues = new Object[i4];
        this.mSize = 0;
    }

    public E get(int i4, E e4) {
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, i4);
        if (iBinarySearch >= 0) {
            Object[] objArr = this.mValues;
            if (objArr[iBinarySearch] != DELETED) {
                return (E) objArr[iBinarySearch];
            }
        }
        return e4;
    }
}
