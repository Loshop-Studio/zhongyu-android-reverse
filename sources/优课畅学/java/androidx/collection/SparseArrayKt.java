package androidx.collection;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8792m0;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;
import p311y7.InterfaceC10668a;

/* loaded from: classes.dex */
public final class SparseArrayKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: androidx.collection.SparseArrayKt$valueIterator$1 */
    public static final class C09841<T> implements Iterator<T>, InterfaceC10668a {
        final /* synthetic */ SparseArrayCompat<T> $this_valueIterator;
        private int index;

        public C09841(SparseArrayCompat<T> sparseArrayCompat) {
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
        AbstractC9133u.m16133g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.containsKey(i10);
    }

    public static final <T> void forEach(SparseArrayCompat<T> sparseArrayCompat, InterfaceC10574p action) {
        AbstractC9133u.m16133g(sparseArrayCompat, "<this>");
        AbstractC9133u.m16133g(action, "action");
        int size = sparseArrayCompat.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(Integer.valueOf(sparseArrayCompat.keyAt(i10)), sparseArrayCompat.valueAt(i10));
        }
    }

    public static final <T> T getOrDefault(SparseArrayCompat<T> sparseArrayCompat, int i10, T t10) {
        AbstractC9133u.m16133g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.get(i10, t10);
    }

    public static final <T> T getOrElse(SparseArrayCompat<T> sparseArrayCompat, int i10, InterfaceC10559a defaultValue) {
        AbstractC9133u.m16133g(sparseArrayCompat, "<this>");
        AbstractC9133u.m16133g(defaultValue, "defaultValue");
        T t10 = sparseArrayCompat.get(i10);
        return t10 == null ? (T) defaultValue.invoke() : t10;
    }

    public static final <T> int getSize(SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC9133u.m16133g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size();
    }

    public static final <T> boolean isNotEmpty(SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC9133u.m16133g(sparseArrayCompat, "<this>");
        return !sparseArrayCompat.isEmpty();
    }

    public static final <T> AbstractC8792m0 keyIterator(final SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC9133u.m16133g(sparseArrayCompat, "<this>");
        return new AbstractC8792m0() { // from class: androidx.collection.SparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArrayCompat.size();
            }

            @Override // p134i7.AbstractC8792m0
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
        AbstractC9133u.m16133g(sparseArrayCompat, "<this>");
        AbstractC9133u.m16133g(other, "other");
        SparseArrayCompat<T> sparseArrayCompat2 = new SparseArrayCompat<>(sparseArrayCompat.size() + other.size());
        sparseArrayCompat2.putAll(sparseArrayCompat);
        sparseArrayCompat2.putAll(other);
        return sparseArrayCompat2;
    }

    @InterfaceC8721a
    public static final /* synthetic */ boolean remove(SparseArrayCompat sparseArrayCompat, int i10, Object obj) {
        AbstractC9133u.m16133g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.remove(i10, obj);
    }

    public static final <T> void set(SparseArrayCompat<T> sparseArrayCompat, int i10, T t10) {
        AbstractC9133u.m16133g(sparseArrayCompat, "<this>");
        sparseArrayCompat.put(i10, t10);
    }

    public static final <T> Iterator<T> valueIterator(SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC9133u.m16133g(sparseArrayCompat, "<this>");
        return new C09841(sparseArrayCompat);
    }
}
