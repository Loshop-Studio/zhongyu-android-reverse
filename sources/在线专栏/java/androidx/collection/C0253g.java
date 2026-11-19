package androidx.collection;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: androidx.collection.g */
/* loaded from: classes.dex */
public class C0253g<K, V> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
    private static final boolean DEBUG = false;
    private static final String TAG = "ArrayMap";
    static Object[] mBaseCache;
    static int mBaseCacheSize;
    static Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    Object[] mArray;
    int[] mHashes;
    int mSize;

    public C0253g() {
        this.mHashes = C0249c.f1292a;
        this.mArray = C0249c.f1294c;
        this.mSize = 0;
    }

    private void allocArrays(int i4) {
        if (i4 == 8) {
            synchronized (C0253g.class) {
                Object[] objArr = mTwiceBaseCache;
                if (objArr != null) {
                    this.mArray = objArr;
                    mTwiceBaseCache = (Object[]) objArr[0];
                    this.mHashes = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    mTwiceBaseCacheSize--;
                    return;
                }
            }
        } else if (i4 == 4) {
            synchronized (C0253g.class) {
                Object[] objArr2 = mBaseCache;
                if (objArr2 != null) {
                    this.mArray = objArr2;
                    mBaseCache = (Object[]) objArr2[0];
                    this.mHashes = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    mBaseCacheSize--;
                    return;
                }
            }
        }
        this.mHashes = new int[i4];
        this.mArray = new Object[i4 << 1];
    }

    private static int binarySearchHashes(int[] iArr, int i4, int i5) {
        try {
            return C0249c.m1103a(iArr, i4, i5);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void freeArrays(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (C0253g.class) {
                if (mTwiceBaseCacheSize < 10) {
                    objArr[0] = mTwiceBaseCache;
                    objArr[1] = iArr;
                    for (int i5 = (i4 << 1) - 1; i5 >= 2; i5--) {
                        objArr[i5] = null;
                    }
                    mTwiceBaseCache = objArr;
                    mTwiceBaseCacheSize++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0253g.class) {
                if (mBaseCacheSize < 10) {
                    objArr[0] = mBaseCache;
                    objArr[1] = iArr;
                    for (int i6 = (i4 << 1) - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    mBaseCache = objArr;
                    mBaseCacheSize++;
                }
            }
        }
    }

    public void clear() {
        int i4 = this.mSize;
        if (i4 > 0) {
            int[] iArr = this.mHashes;
            Object[] objArr = this.mArray;
            this.mHashes = C0249c.f1292a;
            this.mArray = C0249c.f1294c;
            this.mSize = 0;
            freeArrays(iArr, objArr, i4);
        }
        if (this.mSize > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (indexOfKey(obj) >= 0) {
            return CONCURRENT_MODIFICATION_EXCEPTIONS;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (indexOfValue(obj) >= 0) {
            return CONCURRENT_MODIFICATION_EXCEPTIONS;
        }
        return false;
    }

    public void ensureCapacity(int i4) {
        int i5 = this.mSize;
        int[] iArr = this.mHashes;
        if (iArr.length < i4) {
            Object[] objArr = this.mArray;
            allocArrays(i4);
            if (this.mSize > 0) {
                System.arraycopy(iArr, 0, this.mHashes, 0, i5);
                System.arraycopy(objArr, 0, this.mArray, 0, i5 << 1);
            }
            freeArrays(iArr, objArr, i5);
        }
        if (this.mSize != i5) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return CONCURRENT_MODIFICATION_EXCEPTIONS;
        }
        if (obj instanceof C0253g) {
            C0253g c0253g = (C0253g) obj;
            if (size() != c0253g.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.mSize; i4++) {
                try {
                    K kKeyAt = keyAt(i4);
                    V vValueAt = valueAt(i4);
                    Object obj2 = c0253g.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj2 != null || !c0253g.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!vValueAt.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return CONCURRENT_MODIFICATION_EXCEPTIONS;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.mSize; i5++) {
                try {
                    K kKeyAt2 = keyAt(i5);
                    V vValueAt2 = valueAt(i5);
                    Object obj3 = map.get(kKeyAt2);
                    if (vValueAt2 == null) {
                        if (obj3 != null || !map.containsKey(kKeyAt2)) {
                            return false;
                        }
                    } else if (!vValueAt2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return CONCURRENT_MODIFICATION_EXCEPTIONS;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v3) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? (V) this.mArray[(iIndexOfKey << 1) + 1] : v3;
    }

    public int hashCode() {
        int[] iArr = this.mHashes;
        Object[] objArr = this.mArray;
        int i4 = this.mSize;
        int i5 = 1;
        int i6 = 0;
        int iHashCode = 0;
        while (i6 < i4) {
            Object obj = objArr[i5];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i6];
            i6++;
            i5 += 2;
        }
        return iHashCode;
    }

    int indexOf(Object obj, int i4) {
        int i5 = this.mSize;
        if (i5 == 0) {
            return -1;
        }
        int iBinarySearchHashes = binarySearchHashes(this.mHashes, i5, i4);
        if (iBinarySearchHashes < 0 || obj.equals(this.mArray[iBinarySearchHashes << 1])) {
            return iBinarySearchHashes;
        }
        int i6 = iBinarySearchHashes + 1;
        while (i6 < i5 && this.mHashes[i6] == i4) {
            if (obj.equals(this.mArray[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iBinarySearchHashes - 1; i7 >= 0 && this.mHashes[i7] == i4; i7--) {
            if (obj.equals(this.mArray[i7 << 1])) {
                return i7;
            }
        }
        return ~i6;
    }

    public int indexOfKey(Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    int indexOfNull() {
        int i4 = this.mSize;
        if (i4 == 0) {
            return -1;
        }
        int iBinarySearchHashes = binarySearchHashes(this.mHashes, i4, 0);
        if (iBinarySearchHashes < 0 || this.mArray[iBinarySearchHashes << 1] == null) {
            return iBinarySearchHashes;
        }
        int i5 = iBinarySearchHashes + 1;
        while (i5 < i4 && this.mHashes[i5] == 0) {
            if (this.mArray[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iBinarySearchHashes - 1; i6 >= 0 && this.mHashes[i6] == 0; i6--) {
            if (this.mArray[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    int indexOfValue(Object obj) {
        int i4 = this.mSize * 2;
        Object[] objArr = this.mArray;
        if (obj == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i4; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.mSize <= 0) {
            return CONCURRENT_MODIFICATION_EXCEPTIONS;
        }
        return false;
    }

    public K keyAt(int i4) {
        return (K) this.mArray[i4 << 1];
    }

    public V put(K k4, V v3) {
        int i4;
        int iIndexOf;
        int i5 = this.mSize;
        if (k4 == null) {
            iIndexOf = indexOfNull();
            i4 = 0;
        } else {
            int iHashCode = k4.hashCode();
            i4 = iHashCode;
            iIndexOf = indexOf(k4, iHashCode);
        }
        if (iIndexOf >= 0) {
            int i6 = (iIndexOf << 1) + 1;
            Object[] objArr = this.mArray;
            V v4 = (V) objArr[i6];
            objArr[i6] = v3;
            return v4;
        }
        int i7 = ~iIndexOf;
        int[] iArr = this.mHashes;
        if (i5 >= iArr.length) {
            int i8 = 4;
            if (i5 >= 8) {
                i8 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i8 = 8;
            }
            Object[] objArr2 = this.mArray;
            allocArrays(i8);
            if (i5 != this.mSize) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.mHashes;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.mArray, 0, objArr2.length);
            }
            freeArrays(iArr, objArr2, i5);
        }
        if (i7 < i5) {
            int[] iArr3 = this.mHashes;
            int i9 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i9, i5 - i7);
            Object[] objArr3 = this.mArray;
            System.arraycopy(objArr3, i7 << 1, objArr3, i9 << 1, (this.mSize - i7) << 1);
        }
        int i10 = this.mSize;
        if (i5 == i10) {
            int[] iArr4 = this.mHashes;
            if (i7 < iArr4.length) {
                iArr4[i7] = i4;
                Object[] objArr4 = this.mArray;
                int i11 = i7 << 1;
                objArr4[i11] = k4;
                objArr4[i11 + 1] = v3;
                this.mSize = i10 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(C0253g<? extends K, ? extends V> c0253g) {
        int i4 = c0253g.mSize;
        ensureCapacity(this.mSize + i4);
        if (this.mSize != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                put(c0253g.keyAt(i5), c0253g.valueAt(i5));
            }
        } else if (i4 > 0) {
            System.arraycopy(c0253g.mHashes, 0, this.mHashes, 0, i4);
            System.arraycopy(c0253g.mArray, 0, this.mArray, 0, i4 << 1);
            this.mSize = i4;
        }
    }

    public V putIfAbsent(K k4, V v3) {
        V v4 = get(k4);
        return v4 == null ? put(k4, v3) : v4;
    }

    public V remove(Object obj) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public V removeAt(int i4) {
        Object[] objArr = this.mArray;
        int i5 = i4 << 1;
        V v3 = (V) objArr[i5 + 1];
        int i6 = this.mSize;
        int i7 = 0;
        if (i6 <= 1) {
            freeArrays(this.mHashes, objArr, i6);
            this.mHashes = C0249c.f1292a;
            this.mArray = C0249c.f1294c;
        } else {
            int i8 = i6 - 1;
            int[] iArr = this.mHashes;
            if (iArr.length <= 8 || i6 >= iArr.length / 3) {
                if (i4 < i8) {
                    int i9 = i4 + 1;
                    int i10 = i8 - i4;
                    System.arraycopy(iArr, i9, iArr, i4, i10);
                    Object[] objArr2 = this.mArray;
                    System.arraycopy(objArr2, i9 << 1, objArr2, i5, i10 << 1);
                }
                Object[] objArr3 = this.mArray;
                int i11 = i8 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            } else {
                allocArrays(i6 > 8 ? i6 + (i6 >> 1) : 8);
                if (i6 != this.mSize) {
                    throw new ConcurrentModificationException();
                }
                if (i4 > 0) {
                    System.arraycopy(iArr, 0, this.mHashes, 0, i4);
                    System.arraycopy(objArr, 0, this.mArray, 0, i5);
                }
                if (i4 < i8) {
                    int i12 = i4 + 1;
                    int i13 = i8 - i4;
                    System.arraycopy(iArr, i12, this.mHashes, i4, i13);
                    System.arraycopy(objArr, i12 << 1, this.mArray, i5, i13 << 1);
                }
            }
            i7 = i8;
        }
        if (i6 != this.mSize) {
            throw new ConcurrentModificationException();
        }
        this.mSize = i7;
        return v3;
    }

    public V replace(K k4, V v3) {
        int iIndexOfKey = indexOfKey(k4);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, v3);
        }
        return null;
    }

    public V setValueAt(int i4, V v3) {
        int i5 = (i4 << 1) + 1;
        Object[] objArr = this.mArray;
        V v4 = (V) objArr[i5];
        objArr[i5] = v3;
        return v4;
    }

    public int size() {
        return this.mSize;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.mSize; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            K kKeyAt = keyAt(i4);
            if (kKeyAt != this) {
                sb.append(kKeyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vValueAt = valueAt(i4);
            if (vValueAt != this) {
                sb.append(vValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public V valueAt(int i4) {
        return (V) this.mArray[(i4 << 1) + 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey < 0) {
            return false;
        }
        V vValueAt = valueAt(iIndexOfKey);
        if (obj2 != vValueAt && (obj2 == null || !obj2.equals(vValueAt))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return CONCURRENT_MODIFICATION_EXCEPTIONS;
    }

    public boolean replace(K k4, V v3, V v4) {
        int iIndexOfKey = indexOfKey(k4);
        if (iIndexOfKey < 0) {
            return false;
        }
        V vValueAt = valueAt(iIndexOfKey);
        if (vValueAt != v3 && (v3 == null || !v3.equals(vValueAt))) {
            return false;
        }
        setValueAt(iIndexOfKey, v4);
        return CONCURRENT_MODIFICATION_EXCEPTIONS;
    }

    public C0253g(int i4) {
        if (i4 == 0) {
            this.mHashes = C0249c.f1292a;
            this.mArray = C0249c.f1294c;
        } else {
            allocArrays(i4);
        }
        this.mSize = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0253g(C0253g<K, V> c0253g) {
        this();
        if (c0253g != 0) {
            putAll(c0253g);
        }
    }
}
