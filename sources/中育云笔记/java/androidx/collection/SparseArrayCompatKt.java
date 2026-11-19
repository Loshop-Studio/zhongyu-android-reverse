package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10964p;

/* loaded from: classes.dex */
public final class SparseArrayCompatKt {
    private static final Object DELETED = new Object();

    public static final <E> void commonAppend(SparseArrayCompat<E> sparseArrayCompat, int i10, E e10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        int i11 = sparseArrayCompat.size;
        if (i11 != 0 && i10 <= sparseArrayCompat.keys[i11 - 1]) {
            sparseArrayCompat.put(i10, e10);
            return;
        }
        if (sparseArrayCompat.garbage && i11 >= sparseArrayCompat.keys.length) {
            m887gc(sparseArrayCompat);
        }
        int i12 = sparseArrayCompat.size;
        if (i12 >= sparseArrayCompat.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
            AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        sparseArrayCompat.keys[i12] = i10;
        sparseArrayCompat.values[i12] = e10;
        sparseArrayCompat.size = i12 + 1;
    }

    public static final <E> void commonClear(SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        int i10 = sparseArrayCompat.size;
        Object[] objArr = sparseArrayCompat.values;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        sparseArrayCompat.size = 0;
        sparseArrayCompat.garbage = false;
    }

    public static final <E> boolean commonContainsKey(SparseArrayCompat<E> sparseArrayCompat, int i10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.indexOfKey(i10) >= 0;
    }

    public static final <E> boolean commonContainsValue(SparseArrayCompat<E> sparseArrayCompat, E e10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m887gc(sparseArrayCompat);
        }
        int i10 = sparseArrayCompat.size;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                i11 = -1;
                break;
            }
            if (sparseArrayCompat.values[i11] == e10) {
                break;
            }
            i11++;
        }
        return i11 >= 0;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i10) {
        E e10;
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        if (iBinarySearch < 0 || (e10 = (E) sparseArrayCompat.values[iBinarySearch]) == DELETED) {
            return null;
        }
        return e10;
    }

    public static final <E> int commonIndexOfKey(SparseArrayCompat<E> sparseArrayCompat, int i10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m887gc(sparseArrayCompat);
        }
        return ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
    }

    public static final <E> int commonIndexOfValue(SparseArrayCompat<E> sparseArrayCompat, E e10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m887gc(sparseArrayCompat);
        }
        int i10 = sparseArrayCompat.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (sparseArrayCompat.values[i11] == e10) {
                return i11;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size() == 0;
    }

    public static final <E> int commonKeyAt(SparseArrayCompat<E> sparseArrayCompat, int i10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m887gc(sparseArrayCompat);
        }
        return sparseArrayCompat.keys[i10];
    }

    public static final <E> void commonPut(SparseArrayCompat<E> sparseArrayCompat, int i10, E e10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        if (iBinarySearch >= 0) {
            sparseArrayCompat.values[iBinarySearch] = e10;
            return;
        }
        int i11 = ~iBinarySearch;
        if (i11 < sparseArrayCompat.size && sparseArrayCompat.values[i11] == DELETED) {
            sparseArrayCompat.keys[i11] = i10;
            sparseArrayCompat.values[i11] = e10;
            return;
        }
        if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            m887gc(sparseArrayCompat);
            i11 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        }
        int i12 = sparseArrayCompat.size;
        if (i12 >= sparseArrayCompat.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
            AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        int i13 = sparseArrayCompat.size;
        if (i13 - i11 != 0) {
            int[] iArr = sparseArrayCompat.keys;
            int i14 = i11 + 1;
            AbstractC10964p.m24021n(iArr, iArr, i14, i11, i13);
            Object[] objArr = sparseArrayCompat.values;
            AbstractC10964p.m24023p(objArr, objArr, i14, i11, sparseArrayCompat.size);
        }
        sparseArrayCompat.keys[i11] = i10;
        sparseArrayCompat.values[i11] = e10;
        sparseArrayCompat.size++;
    }

    public static final <E> void commonPutAll(SparseArrayCompat<E> sparseArrayCompat, SparseArrayCompat<? extends E> other) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        AbstractC9979u.m20294g(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = other.keyAt(i10);
            E eValueAt = other.valueAt(i10);
            int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, iKeyAt);
            if (iBinarySearch >= 0) {
                sparseArrayCompat.values[iBinarySearch] = eValueAt;
            } else {
                int i11 = ~iBinarySearch;
                if (i11 >= sparseArrayCompat.size || sparseArrayCompat.values[i11] != DELETED) {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        m887gc(sparseArrayCompat);
                        i11 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, iKeyAt);
                    }
                    int i12 = sparseArrayCompat.size;
                    if (i12 >= sparseArrayCompat.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
                        AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
                        sparseArrayCompat.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
                        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
                        sparseArrayCompat.values = objArrCopyOf;
                    }
                    int i13 = sparseArrayCompat.size;
                    if (i13 - i11 != 0) {
                        int[] iArr = sparseArrayCompat.keys;
                        int i14 = i11 + 1;
                        AbstractC10964p.m24021n(iArr, iArr, i14, i11, i13);
                        Object[] objArr = sparseArrayCompat.values;
                        AbstractC10964p.m24023p(objArr, objArr, i14, i11, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i11] = iKeyAt;
                    sparseArrayCompat.values[i11] = eValueAt;
                    sparseArrayCompat.size++;
                } else {
                    sparseArrayCompat.keys[i11] = iKeyAt;
                    sparseArrayCompat.values[i11] = eValueAt;
                }
            }
        }
    }

    public static final <E> E commonPutIfAbsent(SparseArrayCompat<E> sparseArrayCompat, int i10, E e10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        E e11 = (E) commonGet(sparseArrayCompat, i10);
        if (e11 == null) {
            int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
            if (iBinarySearch >= 0) {
                sparseArrayCompat.values[iBinarySearch] = e10;
                return e11;
            }
            int i11 = ~iBinarySearch;
            if (i11 < sparseArrayCompat.size && sparseArrayCompat.values[i11] == DELETED) {
                sparseArrayCompat.keys[i11] = i10;
                sparseArrayCompat.values[i11] = e10;
                return e11;
            }
            if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                m887gc(sparseArrayCompat);
                i11 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
            }
            int i12 = sparseArrayCompat.size;
            if (i12 >= sparseArrayCompat.keys.length) {
                int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
                int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
                AbstractC9979u.m20293f(iArrCopyOf, "copyOf(...)");
                sparseArrayCompat.keys = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
                AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
                sparseArrayCompat.values = objArrCopyOf;
            }
            int i13 = sparseArrayCompat.size;
            if (i13 - i11 != 0) {
                int[] iArr = sparseArrayCompat.keys;
                int i14 = i11 + 1;
                AbstractC10964p.m24021n(iArr, iArr, i14, i11, i13);
                Object[] objArr = sparseArrayCompat.values;
                AbstractC10964p.m24023p(objArr, objArr, i14, i11, sparseArrayCompat.size);
            }
            sparseArrayCompat.keys[i11] = i10;
            sparseArrayCompat.values[i11] = e10;
            sparseArrayCompat.size++;
        }
        return e11;
    }

    public static final <E> void commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        if (iBinarySearch >= 0) {
            Object[] objArr = sparseArrayCompat.values;
            Object obj = objArr[iBinarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[iBinarySearch] = obj2;
                sparseArrayCompat.garbage = true;
            }
        }
    }

    public static final <E> void commonRemoveAt(SparseArrayCompat<E> sparseArrayCompat, int i10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.values[i10] != DELETED) {
            sparseArrayCompat.values[i10] = DELETED;
            sparseArrayCompat.garbage = true;
        }
    }

    public static final <E> void commonRemoveAtRange(SparseArrayCompat<E> sparseArrayCompat, int i10, int i11) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        int iMin = Math.min(i11, i10 + i11);
        while (i10 < iMin) {
            sparseArrayCompat.removeAt(i10);
            i10++;
        }
    }

    public static final <E> E commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i10, E e10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i10);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = sparseArrayCompat.values;
        E e11 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e10;
        return e11;
    }

    public static final <E> void commonSetValueAt(SparseArrayCompat<E> sparseArrayCompat, int i10, E e10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m887gc(sparseArrayCompat);
        }
        sparseArrayCompat.values[i10] = e10;
    }

    public static final <E> int commonSize(SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m887gc(sparseArrayCompat);
        }
        return sparseArrayCompat.size;
    }

    public static final <E> String commonToString(SparseArrayCompat<E> sparseArrayCompat) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(sparseArrayCompat.size * 28);
        sb2.append('{');
        int i10 = sparseArrayCompat.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(sparseArrayCompat.keyAt(i11));
            sb2.append('=');
            E eValueAt = sparseArrayCompat.valueAt(i11);
            if (eValueAt != sparseArrayCompat) {
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

    public static final <E> E commonValueAt(SparseArrayCompat<E> sparseArrayCompat, int i10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m887gc(sparseArrayCompat);
        }
        Object[] objArr = sparseArrayCompat.values;
        if (i10 < objArr.length) {
            return (E) objArr[i10];
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gc */
    public static final <E> void m887gc(SparseArrayCompat<E> sparseArrayCompat) {
        int i10 = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != DELETED) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i11;
    }

    private static final <E, T extends E> T internalGet(SparseArrayCompat<E> sparseArrayCompat, int i10, T t10) {
        T t11;
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        return (iBinarySearch < 0 || (t11 = (T) sparseArrayCompat.values[iBinarySearch]) == DELETED) ? t10 : t11;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i10, E e10) {
        E e11;
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        return (iBinarySearch < 0 || (e11 = (E) sparseArrayCompat.values[iBinarySearch]) == DELETED) ? e10 : e11;
    }

    public static final <E> boolean commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i10, E e10, E e11) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i10);
        if (iIndexOfKey < 0 || !AbstractC9979u.m20289b(sparseArrayCompat.values[iIndexOfKey], e10)) {
            return false;
        }
        sparseArrayCompat.values[iIndexOfKey] = e11;
        return true;
    }

    public static final <E> boolean commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i10, Object obj) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i10);
        if (iIndexOfKey < 0 || !AbstractC9979u.m20289b(obj, sparseArrayCompat.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArrayCompat.removeAt(iIndexOfKey);
        return true;
    }
}
