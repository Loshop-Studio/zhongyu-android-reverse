package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10964p;

/* loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ int[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public SparseArrayCompat() {
        this(0, 1, null);
    }

    public void append(int i10, E e10) {
        int i11 = this.size;
        if (i11 != 0 && i10 <= this.keys[i11 - 1]) {
            put(i10, e10);
            return;
        }
        if (this.garbage && i11 >= this.keys.length) {
            SparseArrayCompatKt.m887gc(this);
        }
        int i12 = this.size;
        if (i12 >= this.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
            AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
            AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        this.keys[i12] = i10;
        this.values[i12] = e10;
        this.size = i12 + 1;
    }

    public void clear() {
        int i10 = this.size;
        Object[] objArr = this.values;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public boolean containsKey(int i10) {
        return indexOfKey(i10) >= 0;
    }

    public boolean containsValue(E e10) {
        if (this.garbage) {
            SparseArrayCompatKt.m887gc(this);
        }
        int i10 = this.size;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                i11 = -1;
                break;
            }
            if (this.values[i11] == e10) {
                break;
            }
            i11++;
        }
        return i11 >= 0;
    }

    @InterfaceC10770a
    public void delete(int i10) {
        remove(i10);
    }

    public E get(int i10) {
        return (E) SparseArrayCompatKt.commonGet(this, i10);
    }

    public final boolean getIsEmpty() {
        return isEmpty();
    }

    public int indexOfKey(int i10) {
        if (this.garbage) {
            SparseArrayCompatKt.m887gc(this);
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, i10);
    }

    public int indexOfValue(E e10) {
        if (this.garbage) {
            SparseArrayCompatKt.m887gc(this);
        }
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.values[i11] == e10) {
                return i11;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int i10) {
        if (this.garbage) {
            SparseArrayCompatKt.m887gc(this);
        }
        return this.keys[i10];
    }

    public void put(int i10, E e10) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i10);
        if (iBinarySearch >= 0) {
            this.values[iBinarySearch] = e10;
            return;
        }
        int i11 = ~iBinarySearch;
        if (i11 < this.size && this.values[i11] == SparseArrayCompatKt.DELETED) {
            this.keys[i11] = i10;
            this.values[i11] = e10;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            SparseArrayCompatKt.m887gc(this);
            i11 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i10);
        }
        int i12 = this.size;
        if (i12 >= this.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
            AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
            AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        int i13 = this.size;
        if (i13 - i11 != 0) {
            int[] iArr = this.keys;
            int i14 = i11 + 1;
            AbstractC10964p.m24021n(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.values;
            AbstractC10964p.m24023p(objArr, objArr, i14, i11, this.size);
        }
        this.keys[i11] = i10;
        this.values[i11] = e10;
        this.size++;
    }

    public void putAll(SparseArrayCompat<? extends E> other) {
        AbstractC9979u.m20294g(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = other.keyAt(i10);
            E eValueAt = other.valueAt(i10);
            int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, iKeyAt);
            if (iBinarySearch >= 0) {
                this.values[iBinarySearch] = eValueAt;
            } else {
                int i11 = ~iBinarySearch;
                if (i11 >= this.size || this.values[i11] != SparseArrayCompatKt.DELETED) {
                    if (this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.m887gc(this);
                        i11 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, iKeyAt);
                    }
                    int i12 = this.size;
                    if (i12 >= this.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
                        AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
                        this.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
                        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
                        this.values = objArrCopyOf;
                    }
                    int i13 = this.size;
                    if (i13 - i11 != 0) {
                        int[] iArr = this.keys;
                        int i14 = i11 + 1;
                        AbstractC10964p.m24021n(iArr, iArr, i14, i11, i13);
                        Object[] objArr = this.values;
                        AbstractC10964p.m24023p(objArr, objArr, i14, i11, this.size);
                    }
                    this.keys[i11] = iKeyAt;
                    this.values[i11] = eValueAt;
                    this.size++;
                } else {
                    this.keys[i11] = iKeyAt;
                    this.values[i11] = eValueAt;
                }
            }
        }
    }

    public E putIfAbsent(int i10, E e10) {
        E e11 = (E) SparseArrayCompatKt.commonGet(this, i10);
        if (e11 == null) {
            int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i10);
            if (iBinarySearch >= 0) {
                this.values[iBinarySearch] = e10;
                return e11;
            }
            int i11 = ~iBinarySearch;
            if (i11 < this.size && this.values[i11] == SparseArrayCompatKt.DELETED) {
                this.keys[i11] = i10;
                this.values[i11] = e10;
                return e11;
            }
            if (this.garbage && this.size >= this.keys.length) {
                SparseArrayCompatKt.m887gc(this);
                i11 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i10);
            }
            int i12 = this.size;
            if (i12 >= this.keys.length) {
                int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
                int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
                AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
                this.keys = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
                AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
                this.values = objArrCopyOf;
            }
            int i13 = this.size;
            if (i13 - i11 != 0) {
                int[] iArr = this.keys;
                int i14 = i11 + 1;
                AbstractC10964p.m24021n(iArr, iArr, i14, i11, i13);
                Object[] objArr = this.values;
                AbstractC10964p.m24023p(objArr, objArr, i14, i11, this.size);
            }
            this.keys[i11] = i10;
            this.values[i11] = e10;
            this.size++;
        }
        return e11;
    }

    public void remove(int i10) {
        SparseArrayCompatKt.commonRemove(this, i10);
    }

    public void removeAt(int i10) {
        if (this.values[i10] != SparseArrayCompatKt.DELETED) {
            this.values[i10] = SparseArrayCompatKt.DELETED;
            this.garbage = true;
        }
    }

    public void removeAtRange(int i10, int i11) {
        int iMin = Math.min(i11, i10 + i11);
        while (i10 < iMin) {
            removeAt(i10);
            i10++;
        }
    }

    public E replace(int i10, E e10) {
        int iIndexOfKey = indexOfKey(i10);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e11 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e10;
        return e11;
    }

    public void setValueAt(int i10, E e10) {
        if (this.garbage) {
            SparseArrayCompatKt.m887gc(this);
        }
        this.values[i10] = e10;
    }

    public int size() {
        if (this.garbage) {
            SparseArrayCompatKt.m887gc(this);
        }
        return this.size;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append('{');
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(keyAt(i11));
            sb2.append('=');
            E eValueAt = valueAt(i11);
            if (eValueAt != this) {
                sb2.append(eValueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    public E valueAt(int i10) {
        if (this.garbage) {
            SparseArrayCompatKt.m887gc(this);
        }
        Object[] objArr = this.values;
        if (i10 < objArr.length) {
            return (E) objArr[i10];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public SparseArrayCompat(int i10) {
        if (i10 == 0) {
            this.keys = ContainerHelpersKt.EMPTY_INTS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i10);
            this.keys = new int[iIdealIntArraySize];
            this.values = new Object[iIdealIntArraySize];
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat<E> m26735clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC9979u.m20292e(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) objClone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public E get(int i10, E e10) {
        return (E) SparseArrayCompatKt.commonGet(this, i10, e10);
    }

    public boolean remove(int i10, Object obj) {
        int iIndexOfKey = indexOfKey(i10);
        if (iIndexOfKey < 0 || !AbstractC9979u.m20289b(obj, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public boolean replace(int i10, E e10, E e11) {
        int iIndexOfKey = indexOfKey(i10);
        if (iIndexOfKey < 0 || !AbstractC9979u.m20289b(this.values[iIndexOfKey], e10)) {
            return false;
        }
        this.values[iIndexOfKey] = e11;
        return true;
    }

    public /* synthetic */ SparseArrayCompat(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
