package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9125m;
import kotlin.jvm.internal.AbstractC9133u;
import p101f8.AbstractC8472j;
import p134i7.AbstractC8778f0;
import p311y7.InterfaceC10668a;
import p311y7.InterfaceC10669b;

/* loaded from: classes.dex */
final class MutableValues<K, V> implements Collection<V>, InterfaceC10669b {
    private final MutableScatterMap<K, V> parent;

    /* renamed from: androidx.collection.MutableValues$iterator$1 */
    public static final class C09741 implements Iterator<V>, InterfaceC10668a {
        private int current = -1;
        private final Iterator<Integer> iterator;
        final /* synthetic */ MutableValues<K, V> this$0;

        public C09741(MutableValues<K, V> mutableValues) {
            this.this$0 = mutableValues;
            this.iterator = AbstractC8472j.m13826a(new MutableValues$iterator$1$iterator$1(mutableValues, null));
        }

        public final int getCurrent() {
            return this.current;
        }

        public final Iterator<Integer> getIterator() {
            return this.iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            this.current = this.iterator.next().intValue();
            return (V) ((MutableValues) this.this$0).parent.values[this.current];
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.current >= 0) {
                ((MutableValues) this.this$0).parent.removeValueAt(this.current);
                this.current = -1;
            }
        }

        public final void setCurrent(int i10) {
            this.current = i10;
        }
    }

    public MutableValues(MutableScatterMap<K, V> parent) {
        AbstractC9133u.m16133g(parent, "parent");
        this.parent = parent;
    }

    @Override // java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends V> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.parent.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.parent.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.parent._size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new C09741(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r14) {
        /*
            r13 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r13.parent
            long[] r0 = r0.metadata
            int r1 = r0.length
            int r1 = r1 + (-2)
            r2 = 0
            if (r1 < 0) goto L51
            r3 = r2
        Lb:
            r4 = r0[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L4c
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L25:
            if (r8 >= r6) goto L4a
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L46
            int r9 = r3 << 3
            int r9 = r9 + r8
            androidx.collection.MutableScatterMap<K, V> r10 = r13.parent
            java.lang.Object[] r10 = r10.values
            r10 = r10[r9]
            boolean r10 = kotlin.jvm.internal.AbstractC9133u.m16128b(r10, r14)
            if (r10 == 0) goto L46
            androidx.collection.MutableScatterMap<K, V> r14 = r13.parent
            r14.removeValueAt(r9)
            r14 = 1
            return r14
        L46:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L25
        L4a:
            if (r6 != r7) goto L51
        L4c:
            if (r3 == r1) goto L51
            int r3 = r3 + 1
            goto Lb
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableValues.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        long[] jArr = this.parent.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (AbstractC8778f0.m14556d0(elements, this.parent.values[i13])) {
                            this.parent.removeValueAt(i13);
                            z10 = true;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return z10;
                }
            }
            if (i10 == length) {
                return z10;
            }
            i10++;
        }
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        long[] jArr = this.parent.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (!AbstractC8778f0.m14556d0(elements, this.parent.values[i13])) {
                            this.parent.removeValueAt(i13);
                            z10 = true;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return z10;
                }
            }
            if (i10 == length) {
                return z10;
            }
            i10++;
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC9125m.m16122a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        AbstractC9133u.m16133g(array, "array");
        return (T[]) AbstractC9125m.m16123b(this, array);
    }
}
