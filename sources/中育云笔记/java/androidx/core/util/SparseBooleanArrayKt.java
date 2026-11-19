package androidx.core.util;

import android.util.SparseBooleanArray;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p325rc.AbstractC10961n0;
import p325rc.AbstractC10972t;

/* loaded from: classes2.dex */
public final class SparseBooleanArrayKt {
    public static final boolean contains(SparseBooleanArray sparseBooleanArray, int i10) {
        return sparseBooleanArray.indexOfKey(i10) >= 0;
    }

    public static final boolean containsKey(SparseBooleanArray sparseBooleanArray, int i10) {
        return sparseBooleanArray.indexOfKey(i10) >= 0;
    }

    public static final boolean containsValue(SparseBooleanArray sparseBooleanArray, boolean z10) {
        return sparseBooleanArray.indexOfValue(z10) >= 0;
    }

    public static final void forEach(SparseBooleanArray sparseBooleanArray, InterfaceC9544p interfaceC9544p) {
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC9544p.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i10)), Boolean.valueOf(sparseBooleanArray.valueAt(i10)));
        }
    }

    public static final boolean getOrDefault(SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        return sparseBooleanArray.get(i10, z10);
    }

    public static final boolean getOrElse(SparseBooleanArray sparseBooleanArray, int i10, InterfaceC9529a interfaceC9529a) {
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i10);
        return iIndexOfKey >= 0 ? sparseBooleanArray.valueAt(iIndexOfKey) : ((Boolean) interfaceC9529a.invoke()).booleanValue();
    }

    public static final int getSize(SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size();
    }

    public static final boolean isEmpty(SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() != 0;
    }

    public static final AbstractC10961n0 keyIterator(final SparseBooleanArray sparseBooleanArray) {
        return new AbstractC10961n0() { // from class: androidx.core.util.SparseBooleanArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseBooleanArray.size();
            }

            @Override // p325rc.AbstractC10961n0
            public int nextInt() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i10 = this.index;
                this.index = i10 + 1;
                return sparseBooleanArray2.keyAt(i10);
            }

            public final void setIndex(int i10) {
                this.index = i10;
            }
        };
    }

    public static final SparseBooleanArray plus(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        putAll(sparseBooleanArray3, sparseBooleanArray);
        putAll(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void putAll(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i10), sparseBooleanArray2.valueAt(i10));
        }
    }

    public static final boolean remove(SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || z10 != sparseBooleanArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i10);
        return true;
    }

    public static final void set(SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        sparseBooleanArray.put(i10, z10);
    }

    public static final AbstractC10972t valueIterator(final SparseBooleanArray sparseBooleanArray) {
        return new AbstractC10972t() { // from class: androidx.core.util.SparseBooleanArrayKt.valueIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseBooleanArray.size();
            }

            @Override // p325rc.AbstractC10972t
            public boolean nextBoolean() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i10 = this.index;
                this.index = i10 + 1;
                return sparseBooleanArray2.valueAt(i10);
            }

            public final void setIndex(int i10) {
                this.index = i10;
            }
        };
    }
}
