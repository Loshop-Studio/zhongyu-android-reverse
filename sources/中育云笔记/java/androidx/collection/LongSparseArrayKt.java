package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import id.InterfaceC9624a;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10963o0;
import p325rc.AbstractC10964p;

/* loaded from: classes.dex */
public final class LongSparseArrayKt {
    private static final Object DELETED = new Object();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: androidx.collection.LongSparseArrayKt$valueIterator$1 */
    public static final class C09951<T> implements Iterator<T>, InterfaceC9624a {
        final /* synthetic */ LongSparseArray<T> $this_valueIterator;
        private int index;

        public C09951(LongSparseArray<T> longSparseArray) {
            this.$this_valueIterator = longSparseArray;
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_valueIterator.size();
        }

        @Override // java.util.Iterator
        public T next() {
            LongSparseArray<T> longSparseArray = this.$this_valueIterator;
            int i10 = this.index;
            this.index = i10 + 1;
            return longSparseArray.valueAt(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i10) {
            this.index = i10;
        }
    }

    public static final <E> void commonAppend(LongSparseArray<E> longSparseArray, long j10, E e10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        int i10 = longSparseArray.size;
        if (i10 != 0 && j10 <= longSparseArray.keys[i10 - 1]) {
            longSparseArray.put(j10, e10);
            return;
        }
        if (longSparseArray.garbage) {
            long[] jArr = longSparseArray.keys;
            if (i10 >= jArr.length) {
                Object[] objArr = longSparseArray.values;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != DELETED) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i11;
            }
        }
        int i13 = longSparseArray.size;
        if (i13 >= longSparseArray.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i13 + 1);
            long[] jArrCopyOf = Arrays.copyOf(longSparseArray.keys, iIdealLongArraySize);
            AbstractC9979u.m20293f(jArrCopyOf, "copyOf(...)");
            longSparseArray.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(longSparseArray.values, iIdealLongArraySize);
            AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
            longSparseArray.values = objArrCopyOf;
        }
        longSparseArray.keys[i13] = j10;
        longSparseArray.values[i13] = e10;
        longSparseArray.size = i13 + 1;
    }

    public static final <E> void commonClear(LongSparseArray<E> longSparseArray) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        int i10 = longSparseArray.size;
        Object[] objArr = longSparseArray.values;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        longSparseArray.size = 0;
        longSparseArray.garbage = false;
    }

    public static final <E> boolean commonContainsKey(LongSparseArray<E> longSparseArray, long j10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j10) >= 0;
    }

    public static final <E> boolean commonContainsValue(LongSparseArray<E> longSparseArray, E e10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(e10) >= 0;
    }

    public static final <E> void commonGc(LongSparseArray<E> longSparseArray) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        int i10 = longSparseArray.size;
        long[] jArr = longSparseArray.keys;
        Object[] objArr = longSparseArray.values;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != DELETED) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        longSparseArray.garbage = false;
        longSparseArray.size = i11;
    }

    public static final <E> E commonGet(LongSparseArray<E> longSparseArray, long j10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j10);
        if (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) {
            return null;
        }
        return (E) longSparseArray.values[iBinarySearch];
    }

    public static final Object commonGetInternal(LongSparseArray<?> longSparseArray, long j10, Object obj) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j10);
        return (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) ? obj : longSparseArray.values[iBinarySearch];
    }

    public static final <E> int commonIndexOfKey(LongSparseArray<E> longSparseArray, long j10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i10 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != DELETED) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i11;
        }
        return ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j10);
    }

    public static final <E> int commonIndexOfValue(LongSparseArray<E> longSparseArray, E e10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i10 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != DELETED) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i11;
        }
        int i13 = longSparseArray.size;
        for (int i14 = 0; i14 < i13; i14++) {
            if (longSparseArray.values[i14] == e10) {
                return i14;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(LongSparseArray<E> longSparseArray) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    public static final <E> long commonKeyAt(LongSparseArray<E> longSparseArray, int i10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        if (!(i10 >= 0 && i10 < longSparseArray.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (longSparseArray.garbage) {
            int i11 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != DELETED) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i12;
        }
        return longSparseArray.keys[i10];
    }

    public static final <E> void commonPut(LongSparseArray<E> longSparseArray, long j10, E e10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j10);
        if (iBinarySearch >= 0) {
            longSparseArray.values[iBinarySearch] = e10;
            return;
        }
        int i10 = ~iBinarySearch;
        if (i10 < longSparseArray.size && longSparseArray.values[i10] == DELETED) {
            longSparseArray.keys[i10] = j10;
            longSparseArray.values[i10] = e10;
            return;
        }
        if (longSparseArray.garbage) {
            int i11 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            if (i11 >= jArr.length) {
                Object[] objArr = longSparseArray.values;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != DELETED) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i12;
                i10 = ~ContainerHelpersKt.binarySearch(longSparseArray.keys, i12, j10);
            }
        }
        int i14 = longSparseArray.size;
        if (i14 >= longSparseArray.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(longSparseArray.keys, iIdealLongArraySize);
            AbstractC9979u.m20293f(jArrCopyOf, "copyOf(...)");
            longSparseArray.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(longSparseArray.values, iIdealLongArraySize);
            AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
            longSparseArray.values = objArrCopyOf;
        }
        int i15 = longSparseArray.size;
        if (i15 - i10 != 0) {
            long[] jArr2 = longSparseArray.keys;
            int i16 = i10 + 1;
            AbstractC10964p.m24022o(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = longSparseArray.values;
            AbstractC10964p.m24023p(objArr2, objArr2, i16, i10, longSparseArray.size);
        }
        longSparseArray.keys[i10] = j10;
        longSparseArray.values[i10] = e10;
        longSparseArray.size++;
    }

    public static final <E> void commonPutAll(LongSparseArray<E> longSparseArray, LongSparseArray<? extends E> other) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        AbstractC9979u.m20294g(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArray.put(other.keyAt(i10), other.valueAt(i10));
        }
    }

    public static final <E> E commonPutIfAbsent(LongSparseArray<E> longSparseArray, long j10, E e10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        E e11 = longSparseArray.get(j10);
        if (e11 == null) {
            longSparseArray.put(j10, e10);
        }
        return e11;
    }

    public static final <E> void commonRemove(LongSparseArray<E> longSparseArray, long j10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j10);
        if (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) {
            return;
        }
        longSparseArray.values[iBinarySearch] = DELETED;
        longSparseArray.garbage = true;
    }

    public static final <E> void commonRemoveAt(LongSparseArray<E> longSparseArray, int i10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        if (longSparseArray.values[i10] != DELETED) {
            longSparseArray.values[i10] = DELETED;
            longSparseArray.garbage = true;
        }
    }

    public static final <E> E commonReplace(LongSparseArray<E> longSparseArray, long j10, E e10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j10);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = longSparseArray.values;
        E e11 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e10;
        return e11;
    }

    public static final <E> void commonSetValueAt(LongSparseArray<E> longSparseArray, int i10, E e10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        if (!(i10 >= 0 && i10 < longSparseArray.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (longSparseArray.garbage) {
            int i11 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != DELETED) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i12;
        }
        longSparseArray.values[i10] = e10;
    }

    public static final <E> int commonSize(LongSparseArray<E> longSparseArray) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i10 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != DELETED) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i11;
        }
        return longSparseArray.size;
    }

    public static final <E> String commonToString(LongSparseArray<E> longSparseArray) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        if (longSparseArray.size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(longSparseArray.size * 28);
        sb2.append('{');
        int i10 = longSparseArray.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(longSparseArray.keyAt(i11));
            sb2.append('=');
            E eValueAt = longSparseArray.valueAt(i11);
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

    public static final <E> E commonValueAt(LongSparseArray<E> longSparseArray, int i10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        if (!(i10 >= 0 && i10 < longSparseArray.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (longSparseArray.garbage) {
            int i11 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != DELETED) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i12;
        }
        return (E) longSparseArray.values[i10];
    }

    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        return longSparseArray.containsKey(j10);
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, InterfaceC9544p action) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        AbstractC9979u.m20294g(action, "action");
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(Long.valueOf(longSparseArray.keyAt(i10)), longSparseArray.valueAt(i10));
        }
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j10, T t10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        return longSparseArray.get(j10, t10);
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j10, InterfaceC9529a defaultValue) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        AbstractC9979u.m20294g(defaultValue, "defaultValue");
        T t10 = longSparseArray.get(j10);
        return t10 == null ? (T) defaultValue.invoke() : t10;
    }

    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    public static /* synthetic */ void getSize$annotations(LongSparseArray longSparseArray) {
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        return !longSparseArray.isEmpty();
    }

    public static final <T> AbstractC10963o0 keyIterator(final LongSparseArray<T> longSparseArray) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        return new AbstractC10963o0() { // from class: androidx.collection.LongSparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            @Override // p325rc.AbstractC10963o0
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i10 = this.index;
                this.index = i10 + 1;
                return longSparseArray2.keyAt(i10);
            }

            public final void setIndex(int i10) {
                this.index = i10;
            }
        };
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> other) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        AbstractC9979u.m20294g(other, "other");
        LongSparseArray<T> longSparseArray2 = new LongSparseArray<>(longSparseArray.size() + other.size());
        longSparseArray2.putAll(longSparseArray);
        longSparseArray2.putAll(other);
        return longSparseArray2;
    }

    @InterfaceC10770a
    public static final /* synthetic */ boolean remove(LongSparseArray longSparseArray, long j10, Object obj) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        return longSparseArray.remove(j10, obj);
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j10, T t10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        longSparseArray.put(j10, t10);
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        return new C09951(longSparseArray);
    }

    public static final <E> E commonGet(LongSparseArray<E> longSparseArray, long j10, E e10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j10);
        return (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) ? e10 : (E) longSparseArray.values[iBinarySearch];
    }

    public static final <E> boolean commonReplace(LongSparseArray<E> longSparseArray, long j10, E e10, E e11) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j10);
        if (iIndexOfKey < 0 || !AbstractC9979u.m20289b(longSparseArray.values[iIndexOfKey], e10)) {
            return false;
        }
        longSparseArray.values[iIndexOfKey] = e11;
        return true;
    }

    public static final <E> boolean commonRemove(LongSparseArray<E> longSparseArray, long j10, E e10) {
        AbstractC9979u.m20294g(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j10);
        if (iIndexOfKey < 0 || !AbstractC9979u.m20289b(e10, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }
}
