package androidx.collection;

import id.InterfaceC9624a;
import id.InterfaceC9629f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9971m;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p296pd.AbstractC10661i;
import p296pd.AbstractC10662j;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
final class MutableEntries<K, V> implements Set<Map.Entry<K, V>>, InterfaceC9629f {
    private final MutableScatterMap<K, V> parent;

    /* renamed from: androidx.collection.MutableEntries$iterator$1 */
    public static final class C10001 implements Iterator<Map.Entry<K, V>>, InterfaceC9624a {
        private int current = -1;
        private Iterator<? extends Map.Entry<K, V>> iterator;
        final /* synthetic */ MutableEntries<K, V> this$0;

        @InterfaceC11829d(m26210c = "androidx.collection.MutableEntries$iterator$1$1", m26211f = "ScatterMap.kt", m26212l = {1538}, m26213m = "invokeSuspend")
        /* renamed from: androidx.collection.MutableEntries$iterator$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC9544p {
            int I$0;
            int I$1;
            int I$2;
            int I$3;
            long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ MutableEntries<K, V> this$0;
            final /* synthetic */ C10001 this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MutableEntries<K, V> mutableEntries, C10001 c10001, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = mutableEntries;
                this.this$1 = c10001;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.this$1, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0073). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007c -> B:20:0x00b7). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00b4 -> B:21:0x00ba). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00cc -> B:26:0x00cd). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 215
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableEntries.C10001.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(AbstractC10661i abstractC10661i, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(abstractC10661i, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C10001(MutableEntries<K, V> mutableEntries) {
            this.this$0 = mutableEntries;
            this.iterator = AbstractC10662j.m22557a(new AnonymousClass1(mutableEntries, this, null));
        }

        public final int getCurrent() {
            return this.current;
        }

        public final Iterator<Map.Entry<K, V>> getIterator() {
            return this.iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.current != -1) {
                ((MutableEntries) this.this$0).parent.removeValueAt(this.current);
                this.current = -1;
            }
        }

        public final void setCurrent(int i10) {
            this.current = i10;
        }

        public final void setIterator(Iterator<? extends Map.Entry<K, V>> it) {
            AbstractC9979u.m20294g(it, "<set-?>");
            this.iterator = it;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            return this.iterator.next();
        }
    }

    public MutableEntries(MutableScatterMap<K, V> parent) {
        AbstractC9979u.m20294g(parent, "parent");
        this.parent = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<K, V>> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (AbstractC9962d0.m20262m(obj)) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!AbstractC9979u.m20289b(this.parent.get(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.parent._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new C10001(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (AbstractC9962d0.m20262m(obj)) {
            return remove((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        AbstractC9979u.m20294g(elements, "elements");
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
                        Iterator<? extends Object> it = elements.iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (AbstractC9979u.m20289b(entry.getKey(), this.parent.keys[i13]) && AbstractC9979u.m20289b(entry.getValue(), this.parent.values[i13])) {
                                this.parent.removeValueAt(i13);
                                z10 = true;
                                break;
                            }
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

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        AbstractC9979u.m20294g(elements, "elements");
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
                        Iterator<? extends Object> it = elements.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                this.parent.removeValueAt(i13);
                                z10 = true;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (!AbstractC9979u.m20289b(entry.getKey(), this.parent.keys[i13]) || !AbstractC9979u.m20289b(entry.getValue(), this.parent.values[i13])) {
                            }
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

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC9971m.m20283a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Map.Entry<K, V> element) {
        AbstractC9979u.m20294g(element, "element");
        throw new UnsupportedOperationException();
    }

    public boolean contains(Map.Entry<K, V> element) {
        AbstractC9979u.m20294g(element, "element");
        return AbstractC9979u.m20289b(this.parent.get(element.getKey()), element.getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        if (((r4 & ((~r4) << 6)) & r11) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        r13 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.util.Map.Entry<K, V> r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.String r1 = "element"
            r2 = r22
            kotlin.jvm.internal.AbstractC9979u.m20294g(r2, r1)
            androidx.collection.MutableScatterMap<K, V> r1 = r0.parent
            java.lang.Object r3 = r2.getKey()
            if (r3 == 0) goto L16
            int r5 = r3.hashCode()
            goto L17
        L16:
            r5 = 0
        L17:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r5 = r5 ^ r6
            r6 = r5 & 127(0x7f, float:1.78E-43)
            int r7 = r1._capacity
            int r5 = r5 >>> 7
            r5 = r5 & r7
            r8 = 0
        L26:
            long[] r9 = r1.metadata
            int r10 = r5 >> 3
            r11 = r5 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r15 = r9[r10]
            int r9 = 64 - r11
            long r9 = r15 << r9
            r16 = r5
            r15 = 0
            long r4 = (long) r11
            long r4 = -r4
            r11 = 63
            long r4 = r4 >> r11
            long r4 = r4 & r9
            long r4 = r4 | r12
            long r9 = (long) r6
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r11
            long r9 = r9 ^ r4
            long r11 = r9 - r11
            long r9 = ~r9
            long r9 = r9 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
        L55:
            r17 = 0
            int r13 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r13 == 0) goto L79
            int r13 = java.lang.Long.numberOfTrailingZeros(r9)
            int r13 = r13 >> 3
            int r13 = r16 + r13
            r13 = r13 & r7
            r19 = r11
            java.lang.Object[] r11 = r1.keys
            r11 = r11[r13]
            boolean r11 = kotlin.jvm.internal.AbstractC9979u.m20289b(r11, r3)
            if (r11 == 0) goto L71
            goto L86
        L71:
            r11 = 1
            long r11 = r9 - r11
            long r9 = r9 & r11
            r11 = r19
            goto L55
        L79:
            r19 = r11
            long r9 = ~r4
            r11 = 6
            long r9 = r9 << r11
            long r4 = r4 & r9
            long r4 = r4 & r19
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 == 0) goto L9f
            r13 = -1
        L86:
            if (r13 < 0) goto L9e
            androidx.collection.MutableScatterMap<K, V> r1 = r0.parent
            java.lang.Object[] r1 = r1.values
            r1 = r1[r13]
            java.lang.Object r2 = r2.getValue()
            boolean r1 = kotlin.jvm.internal.AbstractC9979u.m20289b(r1, r2)
            if (r1 == 0) goto L9e
            androidx.collection.MutableScatterMap<K, V> r1 = r0.parent
            r1.removeValueAt(r13)
            return r14
        L9e:
            return r15
        L9f:
            int r8 = r8 + 8
            int r5 = r16 + r8
            r5 = r5 & r7
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableEntries.remove(java.util.Map$Entry):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        AbstractC9979u.m20294g(array, "array");
        return (T[]) AbstractC9971m.m20284b(this, array);
    }
}
