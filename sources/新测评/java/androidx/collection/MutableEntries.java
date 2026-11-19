package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

@Metadata(m13557d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u000f\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001d\u0010\u0014\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\"\u0010\u0015\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\u001b\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0018H\u0096\u0002J\u001c\u0010\u0019\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u001a\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0016J\"\u0010\u001b\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m13558d2 = {"Landroidx/collection/MutableEntries;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "parent", "Landroidx/collection/MutableScatterMap;", "(Landroidx/collection/MutableScatterMap;)V", "size", "", "getSize", "()I", "add", "", "element", "addAll", "elements", "", "clear", "", "contains", "containsAll", "isEmpty", "iterator", "", "remove", "removeAll", "retainAll", "collection"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1787:1\n1726#2,3:1788\n329#3,6:1791\n339#3,3:1798\n342#3,9:1802\n329#3,6:1811\n339#3,3:1818\n342#3,9:1822\n555#3:1831\n556#3:1835\n558#3,2:1837\n560#3,4:1840\n564#3:1847\n565#3:1851\n566#3:1853\n567#3,4:1856\n573#3:1861\n574#3,8:1863\n1399#4:1797\n1270#4:1801\n1399#4:1817\n1270#4:1821\n1165#4,3:1832\n1179#4:1836\n1175#4:1839\n1372#4,3:1844\n1386#4,3:1848\n1312#4:1852\n1303#4:1854\n1297#4:1855\n1309#4:1860\n1393#4:1862\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries\n*L\n1558#1:1788,3\n1574#1:1791,6\n1574#1:1798,3\n1574#1:1802,9\n1592#1:1811,6\n1592#1:1818,3\n1592#1:1822,9\n1605#1:1831\n1605#1:1835\n1605#1:1837,2\n1605#1:1840,4\n1605#1:1847\n1605#1:1851\n1605#1:1853\n1605#1:1856,4\n1605#1:1861\n1605#1:1863,8\n1574#1:1797\n1574#1:1801\n1592#1:1817\n1592#1:1821\n1605#1:1832,3\n1605#1:1836\n1605#1:1839\n1605#1:1844,3\n1605#1:1848,3\n1605#1:1852\n1605#1:1854\n1605#1:1855\n1605#1:1860\n1605#1:1862\n*E\n"})
/* loaded from: classes.dex */
final class MutableEntries<K, V> implements Set<Map.Entry<K, V>>, KMutableSet {
    private final MutableScatterMap<K, V> parent;

    @Metadata(m13557d1 = {"\u0000-\n\u0000\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u0096\u0002J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR,\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m13558d2 = {"androidx/collection/MutableEntries$iterator$1", "", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "iterator", "", "getIterator", "()Ljava/util/Iterator;", "setIterator", "(Ljava/util/Iterator;)V", "hasNext", "", "next", "remove", "", "collection"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    /* renamed from: androidx.collection.MutableEntries$iterator$1 */
    public static final class C09411 implements Iterator<Map.Entry<K, V>>, KMutableIterator {
        private int current = -1;
        private Iterator<? extends Map.Entry<K, V>> iterator;
        final /* synthetic */ MutableEntries<K, V> this$0;

        @Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0004H\u008a@"}, m13558d2 = {"<anonymous>", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/sequences/SequenceScope;", ""}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.collection.MutableEntries$iterator$1$1", m13596f = "ScatterMap.kt", m13597i = {0, 0, 0, 0, 0, 0, 0}, m13598l = {1538}, m13599m = "invokeSuspend", m13600n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, m13601s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
        @SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries$iterator$1$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1787:1\n329#2,6:1788\n339#2,3:1795\n342#2,9:1799\n1399#3:1794\n1270#3:1798\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries$iterator$1$1\n*L\n1536#1:1788,6\n1536#1:1795,3\n1536#1:1799,9\n1536#1:1794\n1536#1:1798\n*E\n"})
        /* renamed from: androidx.collection.MutableEntries$iterator$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Map.Entry<K, V>>, Continuation<? super Unit>, Object> {
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
            final /* synthetic */ C09411 this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MutableEntries<K, V> mutableEntries, C09411 c09411, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = mutableEntries;
                this.this$1 = c09411;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.this$1, continuation);
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
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    Method dump skipped, instructions count: 215
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableEntries.C09411.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SequenceScope<? super Map.Entry<K, V>> sequenceScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C09411(MutableEntries<K, V> mutableEntries) {
            this.this$0 = mutableEntries;
            this.iterator = SequencesKt.iterator(new AnonymousClass1(mutableEntries, this, null));
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
            Intrinsics.checkNotNullParameter(it, "<set-?>");
            this.iterator = it;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            return this.iterator.next();
        }
    }

    public MutableEntries(MutableScatterMap<K, V> parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<K, V>> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (TypeIntrinsics.isMutableMapEntry(obj)) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!Intrinsics.areEqual(this.parent.get(entry.getKey()), entry.getValue())) {
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
        return new C09411(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (TypeIntrinsics.isMutableMapEntry(obj)) {
            return remove((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = this.parent.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i10 = 0;
        boolean z9 = false;
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
                            if (Intrinsics.areEqual(entry.getKey(), this.parent.keys[i13]) && Intrinsics.areEqual(entry.getValue(), this.parent.values[i13])) {
                                this.parent.removeValueAt(i13);
                                z9 = true;
                                break;
                            }
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return z9;
                }
            }
            if (i10 == length) {
                return z9;
            }
            i10++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = this.parent.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i10 = 0;
        boolean z9 = false;
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
                                z9 = true;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (!Intrinsics.areEqual(entry.getKey(), this.parent.keys[i13]) || !Intrinsics.areEqual(entry.getValue(), this.parent.values[i13])) {
                            }
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return z9;
                }
            }
            if (i10 == length) {
                return z9;
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
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Map.Entry<K, V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    public boolean contains(Map.Entry<K, V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return Intrinsics.areEqual(this.parent.get(element.getKey()), element.getValue());
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
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
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
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r3)
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
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
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
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
