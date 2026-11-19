package androidx.core.util;

import android.util.SparseArray;
import id.InterfaceC9624a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p325rc.AbstractC10961n0;

/* loaded from: classes2.dex */
public final class SparseArrayKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: androidx.core.util.SparseArrayKt$valueIterator$1 */
    public static final class C35111<T> implements Iterator<T>, InterfaceC9624a {
        final /* synthetic */ SparseArray<T> $this_valueIterator;
        private int index;

        public C35111(SparseArray<T> sparseArray) {
            this.$this_valueIterator = sparseArray;
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
            SparseArray<T> sparseArray = this.$this_valueIterator;
            int i10 = this.index;
            this.index = i10 + 1;
            return sparseArray.valueAt(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i10) {
            this.index = i10;
        }
    }

    public static final <T> boolean contains(SparseArray<T> sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static final <T> boolean containsKey(SparseArray<T> sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static final <T> boolean containsValue(SparseArray<T> sparseArray, T t10) {
        return sparseArray.indexOfValue(t10) >= 0;
    }

    public static final <T> void forEach(SparseArray<T> sparseArray, InterfaceC9544p interfaceC9544p) {
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC9544p.invoke(Integer.valueOf(sparseArray.keyAt(i10)), sparseArray.valueAt(i10));
        }
    }

    public static final <T> T getOrDefault(SparseArray<T> sparseArray, int i10, T t10) {
        T t11 = sparseArray.get(i10);
        return t11 == null ? t10 : t11;
    }

    public static final <T> T getOrElse(SparseArray<T> sparseArray, int i10, InterfaceC9529a interfaceC9529a) {
        T t10 = sparseArray.get(i10);
        return t10 == null ? (T) interfaceC9529a.invoke() : t10;
    }

    public static final <T> int getSize(SparseArray<T> sparseArray) {
        return sparseArray.size();
    }

    public static final <T> boolean isEmpty(SparseArray<T> sparseArray) {
        return sparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(SparseArray<T> sparseArray) {
        return sparseArray.size() != 0;
    }

    public static final <T> AbstractC10961n0 keyIterator(final SparseArray<T> sparseArray) {
        return new AbstractC10961n0() { // from class: androidx.core.util.SparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArray.size();
            }

            @Override // p325rc.AbstractC10961n0
            public int nextInt() {
                SparseArray<T> sparseArray2 = sparseArray;
                int i10 = this.index;
                this.index = i10 + 1;
                return sparseArray2.keyAt(i10);
            }

            public final void setIndex(int i10) {
                this.index = i10;
            }
        };
    }

    public static final <T> SparseArray<T> plus(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        putAll(sparseArray3, sparseArray);
        putAll(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void putAll(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.put(sparseArray2.keyAt(i10), sparseArray2.valueAt(i10));
        }
    }

    public static final <T> boolean remove(SparseArray<T> sparseArray, int i10, T t10) {
        int iIndexOfKey = sparseArray.indexOfKey(i10);
        if (iIndexOfKey < 0 || !AbstractC9979u.m20289b(t10, sparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void set(SparseArray<T> sparseArray, int i10, T t10) {
        sparseArray.put(i10, t10);
    }

    public static final <T> Iterator<T> valueIterator(SparseArray<T> sparseArray) {
        return new C35111(sparseArray);
    }
}
