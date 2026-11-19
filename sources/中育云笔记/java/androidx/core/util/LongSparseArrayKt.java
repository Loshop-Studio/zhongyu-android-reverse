package androidx.core.util;

import android.util.LongSparseArray;
import id.InterfaceC9624a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p325rc.AbstractC10963o0;

/* loaded from: classes2.dex */
public final class LongSparseArrayKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: androidx.core.util.LongSparseArrayKt$valueIterator$1 */
    public static final class C35041<T> implements Iterator<T>, InterfaceC9624a {
        final /* synthetic */ LongSparseArray<T> $this_valueIterator;
        private int index;

        public C35041(LongSparseArray<T> longSparseArray) {
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

    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j10) {
        return longSparseArray.indexOfKey(j10) >= 0;
    }

    public static final <T> boolean containsKey(LongSparseArray<T> longSparseArray, long j10) {
        return longSparseArray.indexOfKey(j10) >= 0;
    }

    public static final <T> boolean containsValue(LongSparseArray<T> longSparseArray, T t10) {
        return longSparseArray.indexOfValue(t10) >= 0;
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, InterfaceC9544p interfaceC9544p) {
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC9544p.invoke(Long.valueOf(longSparseArray.keyAt(i10)), longSparseArray.valueAt(i10));
        }
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j10, T t10) {
        T t11 = longSparseArray.get(j10);
        return t11 == null ? t10 : t11;
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j10, InterfaceC9529a interfaceC9529a) {
        T t10 = longSparseArray.get(j10);
        return t10 == null ? (T) interfaceC9529a.invoke() : t10;
    }

    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        return longSparseArray.size();
    }

    public static final <T> boolean isEmpty(LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() != 0;
    }

    public static final <T> AbstractC10963o0 keyIterator(final LongSparseArray<T> longSparseArray) {
        return new AbstractC10963o0() { // from class: androidx.core.util.LongSparseArrayKt.keyIterator.1
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

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> void putAll(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        int size = longSparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArray.put(longSparseArray2.keyAt(i10), longSparseArray2.valueAt(i10));
        }
    }

    public static final <T> boolean remove(LongSparseArray<T> longSparseArray, long j10, T t10) {
        int iIndexOfKey = longSparseArray.indexOfKey(j10);
        if (iIndexOfKey < 0 || !AbstractC9979u.m20289b(t10, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j10, T t10) {
        longSparseArray.put(j10, t10);
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        return new C35041(longSparseArray);
    }
}
