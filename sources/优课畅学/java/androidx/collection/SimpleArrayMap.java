package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8797p;

/* loaded from: classes.dex */
public class SimpleArrayMap<K, V> {
    private Object[] array;
    private int[] hashes;
    private int size;

    public SimpleArrayMap() {
        this(0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T getOrDefaultInternal(Object obj, T t10) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? (T) this.array[(iIndexOfKey << 1) + 1] : t10;
    }

    private final int indexOf(K k10, int i10) {
        int i11 = this.size;
        if (i11 == 0) {
            return -1;
        }
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.hashes, i11, i10);
        if (iBinarySearch < 0 || AbstractC9133u.m16128b(k10, this.array[iBinarySearch << 1])) {
            return iBinarySearch;
        }
        int i12 = iBinarySearch + 1;
        while (i12 < i11 && this.hashes[i12] == i10) {
            if (AbstractC9133u.m16128b(k10, this.array[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iBinarySearch - 1; i13 >= 0 && this.hashes[i13] == i10; i13--) {
            if (AbstractC9133u.m16128b(k10, this.array[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    private final int indexOfNull() {
        int i10 = this.size;
        if (i10 == 0) {
            return -1;
        }
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.hashes, i10, 0);
        if (iBinarySearch < 0 || this.array[iBinarySearch << 1] == null) {
            return iBinarySearch;
        }
        int i11 = iBinarySearch + 1;
        while (i11 < i10 && this.hashes[i11] == 0) {
            if (this.array[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iBinarySearch - 1; i12 >= 0 && this.hashes[i12] == 0; i12--) {
            if (this.array[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int __restricted$indexOfValue(V v10) {
        int i10 = this.size * 2;
        Object[] objArr = this.array;
        if (v10 == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (AbstractC9133u.m16128b(v10, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.array = ContainerHelpersKt.EMPTY_OBJECTS;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k10) {
        return indexOfKey(k10) >= 0;
    }

    public boolean containsValue(V v10) {
        return __restricted$indexOfValue(v10) >= 0;
    }

    public void ensureCapacity(int i10) {
        int i11 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            AbstractC9133u.m16132f(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i10 * 2);
            AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
        }
        if (this.size != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                if (size() != ((SimpleArrayMap) obj).size()) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i10 = this.size;
                for (int i11 = 0; i11 < i10; i11++) {
                    K kKeyAt = keyAt(i11);
                    V vValueAt = valueAt(i11);
                    Object obj2 = simpleArrayMap.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!AbstractC9133u.m16128b(vValueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.size;
            for (int i13 = 0; i13 < i12; i13++) {
                K kKeyAt2 = keyAt(i13);
                V vValueAt2 = valueAt(i13);
                Object obj3 = ((Map) obj).get(kKeyAt2);
                if (vValueAt2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kKeyAt2)) {
                        return false;
                    }
                } else if (!AbstractC9133u.m16128b(vValueAt2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public V get(K k10) {
        int iIndexOfKey = indexOfKey(k10);
        if (iIndexOfKey >= 0) {
            return (V) this.array[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object obj, V v10) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? (V) this.array[(iIndexOfKey << 1) + 1] : v10;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i10 = this.size;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public int indexOfKey(K k10) {
        return k10 == null ? indexOfNull() : indexOf(k10, k10.hashCode());
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public K keyAt(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.size) {
            z10 = true;
        }
        if (!z10) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        return (K) this.array[i10 << 1];
    }

    public V put(K k10, V v10) {
        int i10 = this.size;
        int iHashCode = k10 != null ? k10.hashCode() : 0;
        int iIndexOf = k10 != null ? indexOf(k10, iHashCode) : indexOfNull();
        if (iIndexOf >= 0) {
            int i11 = (iIndexOf << 1) + 1;
            Object[] objArr = this.array;
            V v11 = (V) objArr[i11];
            objArr[i11] = v10;
            return v11;
        }
        int i12 = ~iIndexOf;
        int[] iArr = this.hashes;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            AbstractC9133u.m16132f(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i13 << 1);
            AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
            if (i10 != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.hashes;
            int i14 = i12 + 1;
            AbstractC8797p.m14647n(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.array;
            AbstractC8797p.m14649p(objArr2, objArr2, i14 << 1, i12 << 1, this.size << 1);
        }
        int i15 = this.size;
        if (i10 == i15) {
            int[] iArr3 = this.hashes;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.array;
                int i16 = i12 << 1;
                objArr3[i16] = k10;
                objArr3[i16 + 1] = v10;
                this.size = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> map) {
        AbstractC9133u.m16133g(map, "map");
        int i10 = map.size;
        ensureCapacity(this.size + i10);
        if (this.size != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.keyAt(i11), map.valueAt(i11));
            }
        } else if (i10 > 0) {
            AbstractC8797p.m14647n(map.hashes, this.hashes, 0, 0, i10);
            AbstractC8797p.m14649p(map.array, this.array, 0, 0, i10 << 1);
            this.size = i10;
        }
    }

    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V remove(K k10) {
        int iIndexOfKey = indexOfKey(k10);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public V removeAt(int i10) {
        if (!(i10 >= 0 && i10 < this.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        Object[] objArr = this.array;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.size;
        if (i12 <= 1) {
            clear();
            return v10;
        }
        int i13 = i12 - 1;
        int[] iArr = this.hashes;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                AbstractC8797p.m14647n(iArr, iArr, i10, i14, i12);
                Object[] objArr2 = this.array;
                AbstractC8797p.m14649p(objArr2, objArr2, i11, i14 << 1, i12 << 1);
            }
            Object[] objArr3 = this.array;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            AbstractC9133u.m16132f(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i16 << 1);
            AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
            if (i12 != this.size) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                AbstractC8797p.m14647n(iArr, this.hashes, 0, 0, i10);
                AbstractC8797p.m14649p(objArr, this.array, 0, 0, i11);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                AbstractC8797p.m14647n(iArr, this.hashes, i10, i17, i12);
                AbstractC8797p.m14649p(objArr, this.array, i11, i17 << 1, i12 << 1);
            }
        }
        if (i12 != this.size) {
            throw new ConcurrentModificationException();
        }
        this.size = i13;
        return v10;
    }

    public V replace(K k10, V v10) {
        int iIndexOfKey = indexOfKey(k10);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, v10);
        }
        return null;
    }

    public V setValueAt(int i10, V v10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.size) {
            z10 = true;
        }
        if (!z10) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.array;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            K kKeyAt = keyAt(i11);
            if (kKeyAt != sb) {
                sb.append(kKeyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vValueAt = valueAt(i11);
            if (vValueAt != sb) {
                sb.append(vValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    public V valueAt(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.size) {
            z10 = true;
        }
        if (!z10) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        return (V) this.array[(i10 << 1) + 1];
    }

    public SimpleArrayMap(int i10) {
        this.hashes = i10 == 0 ? ContainerHelpersKt.EMPTY_INTS : new int[i10];
        this.array = i10 == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[i10 << 1];
    }

    public boolean remove(K k10, V v10) {
        int iIndexOfKey = indexOfKey(k10);
        if (iIndexOfKey < 0 || !AbstractC9133u.m16128b(v10, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public boolean replace(K k10, V v10, V v11) {
        int iIndexOfKey = indexOfKey(k10);
        if (iIndexOfKey < 0 || !AbstractC9133u.m16128b(v10, valueAt(iIndexOfKey))) {
            return false;
        }
        setValueAt(iIndexOfKey, v11);
        return true;
    }

    public /* synthetic */ SimpleArrayMap(int i10, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public SimpleArrayMap(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }
}
