package androidx.collection;

import id.InterfaceC9624a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10961n0;

/* loaded from: classes.dex */
public final class SparseArrayKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: androidx.collection.SparseArrayKt$valueIterator$1 */
    public static final class C10141<T> implements Iterator<T>, InterfaceC9624a {
        final /* synthetic */ SparseArrayCompat<T> $this_valueIterator;
        private int index;

        public C10141(SparseArrayCompat<T> sparseArrayCompat) {
            this.$this_valueIterator = sparseArrayCompat;
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
            SparseArrayCompat<T> sparseArrayCompat = this.$this_valueIterator;
            int i10 = this.index;
            this.index = i10 + 1;
            return sparseArrayCompat.valueAt(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i10) {
            this.index = i10;
        }
    }

    public static final <T> boolean contains(SparseArrayCompat<T> sparseArrayCompat, int i10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.containsKey(i10);
    }

    public static final <T> void forEach(SparseArrayCompat<T> sparseArrayCompat, InterfaceC9544p action) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        AbstractC9979u.m20294g(action, "action");
        int size = sparseArrayCompat.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(Integer.valueOf(sparseArrayCompat.keyAt(i10)), sparseArrayCompat.valueAt(i10));
        }
    }

    public static final <T> T getOrDefault(SparseArrayCompat<T> sparseArrayCompat, int i10, T t10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.get(i10, t10);
    }

    public static final <T> T getOrElse(SparseArrayCompat<T> sparseArrayCompat, int i10, InterfaceC9529a defaultValue) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        AbstractC9979u.m20294g(defaultValue, "defaultValue");
        T t10 = sparseArrayCompat.get(i10);
        return t10 == null ? (T) defaultValue.invoke() : t10;
    }

    public static final <T> int getSize(SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size();
    }

    public static final <T> boolean isNotEmpty(SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        return !sparseArrayCompat.isEmpty();
    }

    public static final <T> AbstractC10961n0 keyIterator(final SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        return new AbstractC10961n0() { // from class: androidx.collection.SparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArrayCompat.size();
            }

            @Override // p325rc.AbstractC10961n0
            public int nextInt() {
                SparseArrayCompat<T> sparseArrayCompat2 = sparseArrayCompat;
                int i10 = this.index;
                this.index = i10 + 1;
                return sparseArrayCompat2.keyAt(i10);
            }

            public final void setIndex(int i10) {
                this.index = i10;
            }
        };
    }

    public static final <T> SparseArrayCompat<T> plus(SparseArrayCompat<T> sparseArrayCompat, SparseArrayCompat<T> other) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        AbstractC9979u.m20294g(other, "other");
        SparseArrayCompat<T> sparseArrayCompat2 = new SparseArrayCompat<>(sparseArrayCompat.size() + other.size());
        sparseArrayCompat2.putAll(sparseArrayCompat);
        sparseArrayCompat2.putAll(other);
        return sparseArrayCompat2;
    }

    @InterfaceC10770a
    public static final /* synthetic */ boolean remove(SparseArrayCompat sparseArrayCompat, int i10, Object obj) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.remove(i10, obj);
    }

    public static final <T> void set(SparseArrayCompat<T> sparseArrayCompat, int i10, T t10) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        sparseArrayCompat.put(i10, t10);
    }

    public static final <T> Iterator<T> valueIterator(SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC9979u.m20294g(sparseArrayCompat, "<this>");
        return new C10141(sparseArrayCompat);
    }
}
