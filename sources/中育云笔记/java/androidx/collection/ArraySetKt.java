package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10964p;

/* loaded from: classes.dex */
public final class ArraySetKt {
    public static final int ARRAY_SET_BASE_SIZE = 4;

    public static final <E> void addAllInternal(ArraySet<E> arraySet, ArraySet<? extends E> array) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        AbstractC9979u.m20294g(array, "array");
        int i10 = array.get_size$collection();
        arraySet.ensureCapacity(arraySet.get_size$collection() + i10);
        if (arraySet.get_size$collection() != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                arraySet.add(array.valueAt(i11));
            }
            return;
        }
        if (i10 > 0) {
            AbstractC10964p.m24027t(array.getHashes$collection(), arraySet.getHashes$collection(), 0, 0, i10, 6, null);
            AbstractC10964p.m24029v(array.getArray$collection(), arraySet.getArray$collection(), 0, 0, i10, 6, null);
            if (arraySet.get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            arraySet.set_size$collection(i10);
        }
    }

    public static final <E> boolean addInternal(ArraySet<E> arraySet, E e10) {
        int i10;
        int iIndexOf;
        AbstractC9979u.m20294g(arraySet, "<this>");
        int i11 = arraySet.get_size$collection();
        if (e10 == null) {
            iIndexOf = indexOfNull(arraySet);
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iIndexOf = indexOf(arraySet, e10, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i12 = ~iIndexOf;
        if (i11 >= arraySet.getHashes$collection().length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i13);
            if (i11 != arraySet.get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (!(arraySet.getHashes$collection().length == 0)) {
                AbstractC10964p.m24027t(hashes$collection, arraySet.getHashes$collection(), 0, 0, hashes$collection.length, 6, null);
                AbstractC10964p.m24029v(array$collection, arraySet.getArray$collection(), 0, 0, array$collection.length, 6, null);
            }
        }
        if (i12 < i11) {
            int i14 = i12 + 1;
            AbstractC10964p.m24021n(arraySet.getHashes$collection(), arraySet.getHashes$collection(), i14, i12, i11);
            AbstractC10964p.m24023p(arraySet.getArray$collection(), arraySet.getArray$collection(), i14, i12, i11);
        }
        if (i11 != arraySet.get_size$collection() || i12 >= arraySet.getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        arraySet.getHashes$collection()[i12] = i10;
        arraySet.getArray$collection()[i12] = e10;
        arraySet.set_size$collection(arraySet.get_size$collection() + 1);
        return true;
    }

    public static final <E> void allocArrays(ArraySet<E> arraySet, int i10) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        arraySet.setHashes$collection(new int[i10]);
        arraySet.setArray$collection(new Object[i10]);
    }

    public static final <T> ArraySet<T> arraySetOf() {
        return new ArraySet<>(0, 1, null);
    }

    public static final <E> int binarySearchInternal(ArraySet<E> arraySet, int i10) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        try {
            return ContainerHelpersKt.binarySearch(arraySet.getHashes$collection(), arraySet.get_size$collection(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void clearInternal(ArraySet<E> arraySet) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        if (arraySet.get_size$collection() != 0) {
            arraySet.setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            arraySet.setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            arraySet.set_size$collection(0);
        }
        if (arraySet.get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean containsAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!arraySet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <E> boolean containsInternal(ArraySet<E> arraySet, E e10) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        return arraySet.indexOf(e10) >= 0;
    }

    public static final <E> void ensureCapacityInternal(ArraySet<E> arraySet, int i10) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        int i11 = arraySet.get_size$collection();
        if (arraySet.getHashes$collection().length < i10) {
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i10);
            if (arraySet.get_size$collection() > 0) {
                AbstractC10964p.m24027t(hashes$collection, arraySet.getHashes$collection(), 0, 0, arraySet.get_size$collection(), 6, null);
                AbstractC10964p.m24029v(array$collection, arraySet.getArray$collection(), 0, 0, arraySet.get_size$collection(), 6, null);
            }
        }
        if (arraySet.get_size$collection() != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean equalsInternal(ArraySet<E> arraySet, Object obj) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        if (arraySet == obj) {
            return true;
        }
        if (!(obj instanceof Set) || arraySet.size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = arraySet.get_size$collection();
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(arraySet.valueAt(i11))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final <E> int hashCodeInternal(ArraySet<E> arraySet) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        int[] hashes$collection = arraySet.getHashes$collection();
        int i10 = arraySet.get_size$collection();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += hashes$collection[i12];
        }
        return i11;
    }

    public static final <E> int indexOf(ArraySet<E> arraySet, Object obj, int i10) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        int i11 = arraySet.get_size$collection();
        if (i11 == 0) {
            return -1;
        }
        int iBinarySearchInternal = binarySearchInternal(arraySet, i10);
        if (iBinarySearchInternal < 0 || AbstractC9979u.m20289b(obj, arraySet.getArray$collection()[iBinarySearchInternal])) {
            return iBinarySearchInternal;
        }
        int i12 = iBinarySearchInternal + 1;
        while (i12 < i11 && arraySet.getHashes$collection()[i12] == i10) {
            if (AbstractC9979u.m20289b(obj, arraySet.getArray$collection()[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iBinarySearchInternal - 1; i13 >= 0 && arraySet.getHashes$collection()[i13] == i10; i13--) {
            if (AbstractC9979u.m20289b(obj, arraySet.getArray$collection()[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    public static final <E> int indexOfInternal(ArraySet<E> arraySet, Object obj) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        return obj == null ? indexOfNull(arraySet) : indexOf(arraySet, obj, obj.hashCode());
    }

    public static final <E> int indexOfNull(ArraySet<E> arraySet) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        return indexOf(arraySet, null, 0);
    }

    public static final <E> boolean isEmptyInternal(ArraySet<E> arraySet) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        return arraySet.get_size$collection() <= 0;
    }

    public static final <E> boolean removeAllInternal(ArraySet<E> arraySet, ArraySet<? extends E> array) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        AbstractC9979u.m20294g(array, "array");
        int i10 = array.get_size$collection();
        int i11 = arraySet.get_size$collection();
        for (int i12 = 0; i12 < i10; i12++) {
            arraySet.remove(array.valueAt(i12));
        }
        return i11 != arraySet.get_size$collection();
    }

    public static final <E> E removeAtInternal(ArraySet<E> arraySet, int i10) {
        int i11;
        Object[] objArr;
        AbstractC9979u.m20294g(arraySet, "<this>");
        int i12 = arraySet.get_size$collection();
        E e10 = (E) arraySet.getArray$collection()[i10];
        if (i12 <= 1) {
            arraySet.clear();
            return e10;
        }
        int i13 = i12 - 1;
        if (arraySet.getHashes$collection().length <= 8 || arraySet.get_size$collection() >= arraySet.getHashes$collection().length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                AbstractC10964p.m24021n(arraySet.getHashes$collection(), arraySet.getHashes$collection(), i10, i14, i12);
                AbstractC10964p.m24023p(arraySet.getArray$collection(), arraySet.getArray$collection(), i10, i14, i12);
            }
            arraySet.getArray$collection()[i13] = null;
        } else {
            int i15 = arraySet.get_size$collection() > 8 ? arraySet.get_size$collection() + (arraySet.get_size$collection() >> 1) : 8;
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i15);
            if (i10 > 0) {
                AbstractC10964p.m24027t(hashes$collection, arraySet.getHashes$collection(), 0, 0, i10, 6, null);
                objArr = array$collection;
                AbstractC10964p.m24029v(objArr, arraySet.getArray$collection(), 0, 0, i10, 6, null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = array$collection;
            }
            if (i11 < i13) {
                int i16 = i11 + 1;
                AbstractC10964p.m24021n(hashes$collection, arraySet.getHashes$collection(), i11, i16, i12);
                AbstractC10964p.m24023p(objArr, arraySet.getArray$collection(), i11, i16, i12);
            }
        }
        if (i12 != arraySet.get_size$collection()) {
            throw new ConcurrentModificationException();
        }
        arraySet.set_size$collection(i13);
        return e10;
    }

    public static final <E> boolean removeInternal(ArraySet<E> arraySet, E e10) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        int iIndexOf = arraySet.indexOf(e10);
        if (iIndexOf < 0) {
            return false;
        }
        arraySet.removeAt(iIndexOf);
        return true;
    }

    public static final <E> boolean retainAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        boolean z10 = false;
        for (int i10 = arraySet.get_size$collection() - 1; -1 < i10; i10--) {
            if (!AbstractC10947g0.m23932e0(elements, arraySet.getArray$collection()[i10])) {
                arraySet.removeAt(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public static final <E> String toStringInternal(ArraySet<E> arraySet) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        if (arraySet.isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(arraySet.get_size$collection() * 14);
        sb2.append('{');
        int i10 = arraySet.get_size$collection();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            E eValueAt = arraySet.valueAt(i11);
            if (eValueAt != arraySet) {
                sb2.append(eValueAt);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    public static final <E> E valueAtInternal(ArraySet<E> arraySet, int i10) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        return (E) arraySet.getArray$collection()[i10];
    }

    public static final <T> ArraySet<T> arraySetOf(T... values) {
        AbstractC9979u.m20294g(values, "values");
        ArraySet<T> arraySet = new ArraySet<>(values.length);
        for (T t10 : values) {
            arraySet.add(t10);
        }
        return arraySet;
    }

    public static final <E> boolean removeAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= arraySet.remove(it.next());
        }
        return zRemove;
    }

    public static final <E> boolean addAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        AbstractC9979u.m20294g(arraySet, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        arraySet.ensureCapacity(arraySet.get_size$collection() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= arraySet.add(it.next());
        }
        return zAdd;
    }
}
