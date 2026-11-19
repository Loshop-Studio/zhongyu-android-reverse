package androidx.core.util;

import android.util.SparseIntArray;
import p134i7.AbstractC8792m0;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class SparseIntArrayKt {
    public static final boolean contains(SparseIntArray sparseIntArray, int i10) {
        return sparseIntArray.indexOfKey(i10) >= 0;
    }

    public static final boolean containsKey(SparseIntArray sparseIntArray, int i10) {
        return sparseIntArray.indexOfKey(i10) >= 0;
    }

    public static final boolean containsValue(SparseIntArray sparseIntArray, int i10) {
        return sparseIntArray.indexOfValue(i10) >= 0;
    }

    public static final void forEach(SparseIntArray sparseIntArray, InterfaceC10574p interfaceC10574p) {
        int size = sparseIntArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC10574p.invoke(Integer.valueOf(sparseIntArray.keyAt(i10)), Integer.valueOf(sparseIntArray.valueAt(i10)));
        }
    }

    public static final int getOrDefault(SparseIntArray sparseIntArray, int i10, int i11) {
        return sparseIntArray.get(i10, i11);
    }

    public static final int getOrElse(SparseIntArray sparseIntArray, int i10, InterfaceC10559a interfaceC10559a) {
        int iIndexOfKey = sparseIntArray.indexOfKey(i10);
        return iIndexOfKey >= 0 ? sparseIntArray.valueAt(iIndexOfKey) : ((Number) interfaceC10559a.invoke()).intValue();
    }

    public static final int getSize(SparseIntArray sparseIntArray) {
        return sparseIntArray.size();
    }

    public static final boolean isEmpty(SparseIntArray sparseIntArray) {
        return sparseIntArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseIntArray sparseIntArray) {
        return sparseIntArray.size() != 0;
    }

    public static final AbstractC8792m0 keyIterator(final SparseIntArray sparseIntArray) {
        return new AbstractC8792m0() { // from class: androidx.core.util.SparseIntArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // p134i7.AbstractC8792m0
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i10 = this.index;
                this.index = i10 + 1;
                return sparseIntArray2.keyAt(i10);
            }

            public final void setIndex(int i10) {
                this.index = i10;
            }
        };
    }

    public static final SparseIntArray plus(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        putAll(sparseIntArray3, sparseIntArray);
        putAll(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void putAll(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        int size = sparseIntArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i10), sparseIntArray2.valueAt(i10));
        }
    }

    public static final boolean remove(SparseIntArray sparseIntArray, int i10, int i11) {
        int iIndexOfKey = sparseIntArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || i11 != sparseIntArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseIntArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final void set(SparseIntArray sparseIntArray, int i10, int i11) {
        sparseIntArray.put(i10, i11);
    }

    public static final AbstractC8792m0 valueIterator(final SparseIntArray sparseIntArray) {
        return new AbstractC8792m0() { // from class: androidx.core.util.SparseIntArrayKt.valueIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // p134i7.AbstractC8792m0
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i10 = this.index;
                this.index = i10 + 1;
                return sparseIntArray2.valueAt(i10);
            }

            public final void setIndex(int i10) {
                this.index = i10;
            }
        };
    }
}
