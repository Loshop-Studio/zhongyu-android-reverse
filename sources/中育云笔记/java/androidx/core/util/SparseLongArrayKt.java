package androidx.core.util;

import android.util.SparseLongArray;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p325rc.AbstractC10961n0;
import p325rc.AbstractC10963o0;

/* loaded from: classes2.dex */
public final class SparseLongArrayKt {
    public static final boolean contains(SparseLongArray sparseLongArray, int i10) {
        return sparseLongArray.indexOfKey(i10) >= 0;
    }

    public static final boolean containsKey(SparseLongArray sparseLongArray, int i10) {
        return sparseLongArray.indexOfKey(i10) >= 0;
    }

    public static final boolean containsValue(SparseLongArray sparseLongArray, long j10) {
        return sparseLongArray.indexOfValue(j10) >= 0;
    }

    public static final void forEach(SparseLongArray sparseLongArray, InterfaceC9544p interfaceC9544p) {
        int size = sparseLongArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC9544p.invoke(Integer.valueOf(sparseLongArray.keyAt(i10)), Long.valueOf(sparseLongArray.valueAt(i10)));
        }
    }

    public static final long getOrDefault(SparseLongArray sparseLongArray, int i10, long j10) {
        return sparseLongArray.get(i10, j10);
    }

    public static final long getOrElse(SparseLongArray sparseLongArray, int i10, InterfaceC9529a interfaceC9529a) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i10);
        return iIndexOfKey >= 0 ? sparseLongArray.valueAt(iIndexOfKey) : ((Number) interfaceC9529a.invoke()).longValue();
    }

    public static final int getSize(SparseLongArray sparseLongArray) {
        return sparseLongArray.size();
    }

    public static final boolean isEmpty(SparseLongArray sparseLongArray) {
        return sparseLongArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseLongArray sparseLongArray) {
        return sparseLongArray.size() != 0;
    }

    public static final AbstractC10961n0 keyIterator(final SparseLongArray sparseLongArray) {
        return new AbstractC10961n0() { // from class: androidx.core.util.SparseLongArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // p325rc.AbstractC10961n0
            public int nextInt() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i10 = this.index;
                this.index = i10 + 1;
                return sparseLongArray2.keyAt(i10);
            }

            public final void setIndex(int i10) {
                this.index = i10;
            }
        };
    }

    public static final SparseLongArray plus(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        putAll(sparseLongArray3, sparseLongArray);
        putAll(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final void putAll(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        int size = sparseLongArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i10), sparseLongArray2.valueAt(i10));
        }
    }

    public static final boolean remove(SparseLongArray sparseLongArray, int i10, long j10) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || j10 != sparseLongArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final void set(SparseLongArray sparseLongArray, int i10, long j10) {
        sparseLongArray.put(i10, j10);
    }

    public static final AbstractC10963o0 valueIterator(final SparseLongArray sparseLongArray) {
        return new AbstractC10963o0() { // from class: androidx.core.util.SparseLongArrayKt.valueIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // p325rc.AbstractC10963o0
            public long nextLong() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i10 = this.index;
                this.index = i10 + 1;
                return sparseLongArray2.valueAt(i10);
            }

            public final void setIndex(int i10) {
                this.index = i10;
            }
        };
    }
}
