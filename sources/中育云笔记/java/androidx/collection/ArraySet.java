package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import id.InterfaceC9625b;
import id.InterfaceC9629f;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9963e;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10964p;

/* loaded from: classes.dex */
public final class ArraySet<E> implements Collection<E>, Set<E>, InterfaceC9625b, InterfaceC9629f {
    private int _size;
    private Object[] array;
    private int[] hashes;

    public final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.get_size$collection());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public E elementAt(int i10) {
            return ArraySet.this.valueAt(i10);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public void removeAt(int i10) {
            ArraySet.this.removeAt(i10);
        }
    }

    public ArraySet() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iIndexOf;
        int i11 = get_size$collection();
        if (e10 == null) {
            iIndexOf = ArraySetKt.indexOfNull(this);
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iIndexOf = ArraySetKt.indexOf(this, e10, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i12 = ~iIndexOf;
        if (i11 >= getHashes$collection().length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i13);
            if (i11 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes$collection().length == 0)) {
                AbstractC10964p.m24027t(hashes$collection, getHashes$collection(), 0, 0, hashes$collection.length, 6, null);
                AbstractC10964p.m24029v(array$collection, getArray$collection(), 0, 0, array$collection.length, 6, null);
            }
        }
        if (i12 < i11) {
            int i14 = i12 + 1;
            AbstractC10964p.m24021n(getHashes$collection(), getHashes$collection(), i14, i12, i11);
            AbstractC10964p.m24023p(getArray$collection(), getArray$collection(), i14, i12, i11);
        }
        if (i11 != get_size$collection() || i12 >= getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        getHashes$collection()[i12] = i10;
        getArray$collection()[i12] = e10;
        set_size$collection(get_size$collection() + 1);
        return true;
    }

    public final void addAll(ArraySet<? extends E> array) {
        AbstractC9979u.m20294g(array, "array");
        int i10 = array.get_size$collection();
        ensureCapacity(get_size$collection() + i10);
        if (get_size$collection() != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                add(array.valueAt(i11));
            }
            return;
        }
        if (i10 > 0) {
            AbstractC10964p.m24027t(array.getHashes$collection(), getHashes$collection(), 0, 0, i10, 6, null);
            AbstractC10964p.m24029v(array.getArray$collection(), getArray$collection(), 0, 0, i10, 6, null);
            if (get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            set_size$collection(0);
        }
        if (get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void ensureCapacity(int i10) {
        int i11 = get_size$collection();
        if (getHashes$collection().length < i10) {
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i10);
            if (get_size$collection() > 0) {
                AbstractC10964p.m24027t(hashes$collection, getHashes$collection(), 0, 0, get_size$collection(), 6, null);
                AbstractC10964p.m24029v(array$collection, getArray$collection(), 0, 0, get_size$collection(), 6, null);
            }
        }
        if (get_size$collection() != i11) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = get_size$collection();
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(valueAt(i11))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Object[] getArray$collection() {
        return this.array;
    }

    public final int[] getHashes$collection() {
        return this.hashes;
    }

    public int getSize() {
        return this._size;
    }

    public final int get_size$collection() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes$collection = getHashes$collection();
        int i10 = get_size$collection();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += hashes$collection[i12];
        }
        return i11;
    }

    public final int indexOf(Object obj) {
        return obj == null ? ArraySetKt.indexOfNull(this) : ArraySetKt.indexOf(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return get_size$collection() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(ArraySet<? extends E> array) {
        AbstractC9979u.m20294g(array, "array");
        int i10 = array.get_size$collection();
        int i11 = get_size$collection();
        for (int i12 = 0; i12 < i10; i12++) {
            remove(array.valueAt(i12));
        }
        return i11 != get_size$collection();
    }

    public final E removeAt(int i10) {
        int i11;
        Object[] objArr;
        int i12 = get_size$collection();
        E e10 = (E) getArray$collection()[i10];
        if (i12 <= 1) {
            clear();
            return e10;
        }
        int i13 = i12 - 1;
        if (getHashes$collection().length <= 8 || get_size$collection() >= getHashes$collection().length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                AbstractC10964p.m24021n(getHashes$collection(), getHashes$collection(), i10, i14, i12);
                AbstractC10964p.m24023p(getArray$collection(), getArray$collection(), i10, i14, i12);
            }
            getArray$collection()[i13] = null;
        } else {
            int i15 = get_size$collection() > 8 ? get_size$collection() + (get_size$collection() >> 1) : 8;
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i15);
            if (i10 > 0) {
                AbstractC10964p.m24027t(hashes$collection, getHashes$collection(), 0, 0, i10, 6, null);
                objArr = array$collection;
                AbstractC10964p.m24029v(objArr, getArray$collection(), 0, 0, i10, 6, null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = array$collection;
            }
            if (i11 < i13) {
                int i16 = i11 + 1;
                AbstractC10964p.m24021n(hashes$collection, getHashes$collection(), i11, i16, i12);
                AbstractC10964p.m24023p(objArr, getArray$collection(), i11, i16, i12);
            }
        }
        if (i12 != get_size$collection()) {
            throw new ConcurrentModificationException();
        }
        set_size$collection(i13);
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        boolean z10 = false;
        for (int i10 = get_size$collection() - 1; -1 < i10; i10--) {
            if (!AbstractC10947g0.m23932e0(elements, getArray$collection()[i10])) {
                removeAt(i10);
                z10 = true;
            }
        }
        return z10;
    }

    public final void setArray$collection(Object[] objArr) {
        AbstractC9979u.m20294g(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void setHashes$collection(int[] iArr) {
        AbstractC9979u.m20294g(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final void set_size$collection(int i10) {
        this._size = i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC10964p.m24032y(this.array, 0, this._size);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(get_size$collection() * 14);
        sb2.append('{');
        int i10 = get_size$collection();
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            E eValueAt = valueAt(i11);
            if (eValueAt != this) {
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

    public final E valueAt(int i10) {
        return (E) getArray$collection()[i10];
    }

    public ArraySet(int i10) {
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        if (i10 > 0) {
            ArraySetKt.allocArrays(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        AbstractC9979u.m20294g(array, "array");
        T[] tArr = (T[]) ArraySetJvmUtil.resizeForToArray(array, this._size);
        AbstractC10964p.m24023p(this.array, tArr, 0, 0, this._size);
        AbstractC9979u.m20291d(tArr);
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    public /* synthetic */ ArraySet(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public ArraySet(ArraySet<? extends E> arraySet) {
        this(0);
        if (arraySet != null) {
            addAll((ArraySet) arraySet);
        }
    }

    public ArraySet(Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        ensureCapacity(get_size$collection() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator itM20268a = AbstractC9963e.m20268a(eArr);
            while (itM20268a.hasNext()) {
                add(itM20268a.next());
            }
        }
    }
}
