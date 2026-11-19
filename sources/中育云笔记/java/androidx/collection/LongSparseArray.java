package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10964p;

/* loaded from: classes.dex */
public class LongSparseArray<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ long[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public LongSparseArray() {
        this(0, 1, null);
    }

    public void append(long j10, E e10) {
        int i10 = this.size;
        if (i10 != 0 && j10 <= this.keys[i10 - 1]) {
            put(j10, e10);
            return;
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            if (i10 >= jArr.length) {
                Object[] objArr = this.values;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != LongSparseArrayKt.DELETED) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.garbage = false;
                this.size = i11;
            }
        }
        int i13 = this.size;
        if (i13 >= this.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i13 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.keys, iIdealLongArraySize);
            AbstractC9979u.m20293f(jArrCopyOf, "copyOf(...)");
            this.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealLongArraySize);
            AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        this.keys[i13] = j10;
        this.values[i13] = e10;
        this.size = i13 + 1;
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

    public boolean containsKey(long j10) {
        return indexOfKey(j10) >= 0;
    }

    public boolean containsValue(E e10) {
        return indexOfValue(e10) >= 0;
    }

    @InterfaceC10770a
    public void delete(long j10) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j10);
        if (iBinarySearch < 0 || this.values[iBinarySearch] == LongSparseArrayKt.DELETED) {
            return;
        }
        this.values[iBinarySearch] = LongSparseArrayKt.DELETED;
        this.garbage = true;
    }

    public E get(long j10) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j10);
        if (iBinarySearch < 0 || this.values[iBinarySearch] == LongSparseArrayKt.DELETED) {
            return null;
        }
        return (E) this.values[iBinarySearch];
    }

    public int indexOfKey(long j10) {
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.garbage = false;
            this.size = i11;
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, j10);
    }

    public int indexOfValue(E e10) {
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.garbage = false;
            this.size = i11;
        }
        int i13 = this.size;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.values[i14] == e10) {
                return i14;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i10) {
        if (!(i10 >= 0 && i10 < this.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.garbage) {
            int i11 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.garbage = false;
            this.size = i12;
        }
        return this.keys[i10];
    }

    public void put(long j10, E e10) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j10);
        if (iBinarySearch >= 0) {
            this.values[iBinarySearch] = e10;
            return;
        }
        int i10 = ~iBinarySearch;
        if (i10 < this.size && this.values[i10] == LongSparseArrayKt.DELETED) {
            this.keys[i10] = j10;
            this.values[i10] = e10;
            return;
        }
        if (this.garbage) {
            int i11 = this.size;
            long[] jArr = this.keys;
            if (i11 >= jArr.length) {
                Object[] objArr = this.values;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != LongSparseArrayKt.DELETED) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.garbage = false;
                this.size = i12;
                i10 = ~ContainerHelpersKt.binarySearch(this.keys, i12, j10);
            }
        }
        int i14 = this.size;
        if (i14 >= this.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.keys, iIdealLongArraySize);
            AbstractC9979u.m20293f(jArrCopyOf, "copyOf(...)");
            this.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealLongArraySize);
            AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        int i15 = this.size;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.keys;
            int i16 = i10 + 1;
            AbstractC10964p.m24022o(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.values;
            AbstractC10964p.m24023p(objArr2, objArr2, i16, i10, this.size);
        }
        this.keys[i10] = j10;
        this.values[i10] = e10;
        this.size++;
    }

    public void putAll(LongSparseArray<? extends E> other) {
        AbstractC9979u.m20294g(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            put(other.keyAt(i10), other.valueAt(i10));
        }
    }

    public E putIfAbsent(long j10, E e10) {
        E e11 = get(j10);
        if (e11 == null) {
            put(j10, e10);
        }
        return e11;
    }

    public void remove(long j10) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j10);
        if (iBinarySearch < 0 || this.values[iBinarySearch] == LongSparseArrayKt.DELETED) {
            return;
        }
        this.values[iBinarySearch] = LongSparseArrayKt.DELETED;
        this.garbage = true;
    }

    public void removeAt(int i10) {
        if (this.values[i10] != LongSparseArrayKt.DELETED) {
            this.values[i10] = LongSparseArrayKt.DELETED;
            this.garbage = true;
        }
    }

    public E replace(long j10, E e10) {
        int iIndexOfKey = indexOfKey(j10);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e11 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e10;
        return e11;
    }

    public void setValueAt(int i10, E e10) {
        if (!(i10 >= 0 && i10 < this.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.garbage) {
            int i11 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.garbage = false;
            this.size = i12;
        }
        this.values[i10] = e10;
    }

    public int size() {
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.garbage = false;
            this.size = i11;
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
            if (eValueAt != sb2) {
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
        if (!(i10 >= 0 && i10 < this.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.garbage) {
            int i11 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.garbage = false;
            this.size = i12;
        }
        return (E) this.values[i10];
    }

    public LongSparseArray(int i10) {
        if (i10 == 0) {
            this.keys = ContainerHelpersKt.EMPTY_LONGS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i10);
            this.keys = new long[iIdealLongArraySize];
            this.values = new Object[iIdealLongArraySize];
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public LongSparseArray<E> m26734clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC9979u.m20292e(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray<E> longSparseArray = (LongSparseArray) objClone;
        longSparseArray.keys = (long[]) this.keys.clone();
        longSparseArray.values = (Object[]) this.values.clone();
        return longSparseArray;
    }

    public E get(long j10, E e10) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j10);
        return (iBinarySearch < 0 || this.values[iBinarySearch] == LongSparseArrayKt.DELETED) ? e10 : (E) this.values[iBinarySearch];
    }

    public boolean replace(long j10, E e10, E e11) {
        int iIndexOfKey = indexOfKey(j10);
        if (iIndexOfKey < 0 || !AbstractC9979u.m20289b(this.values[iIndexOfKey], e10)) {
            return false;
        }
        this.values[iIndexOfKey] = e11;
        return true;
    }

    public boolean remove(long j10, E e10) {
        int iIndexOfKey = indexOfKey(j10);
        if (iIndexOfKey < 0 || !AbstractC9979u.m20289b(e10, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public /* synthetic */ LongSparseArray(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
