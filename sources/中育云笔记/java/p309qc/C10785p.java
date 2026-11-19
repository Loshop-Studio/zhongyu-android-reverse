package p309qc;

import id.InterfaceC9624a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9971m;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10968r;

/* renamed from: qc.p */
/* loaded from: classes6.dex */
public final class C10785p implements Collection, InterfaceC9624a {

    /* renamed from: c */
    public final short[] f26010c;

    /* renamed from: qc.p$a */
    public static final class a implements Iterator, InterfaceC9624a {

        /* renamed from: c */
        public final short[] f26011c;

        /* renamed from: d */
        public int f26012d;

        public a(short[] array) {
            AbstractC9979u.m20294g(array, "array");
            this.f26011c = array;
        }

        /* renamed from: a */
        public short m23068a() {
            int i10 = this.f26012d;
            short[] sArr = this.f26011c;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f26012d));
            }
            this.f26012d = i10 + 1;
            return C10784o.m23047b(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26012d < this.f26011c.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C10784o.m23046a(m23068a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C10785p(short[] sArr) {
        this.f26010c = sArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ C10785p m23052a(short[] sArr) {
        return new C10785p(sArr);
    }

    /* renamed from: b */
    public static short[] m23053b(int i10) {
        return m23054c(new short[i10]);
    }

    /* renamed from: c */
    public static short[] m23054c(short[] storage) {
        AbstractC9979u.m20294g(storage, "storage");
        return storage;
    }

    /* renamed from: e */
    public static boolean m23055e(short[] sArr, short s10) {
        return AbstractC10968r.m24092n0(sArr, s10);
    }

    /* renamed from: f */
    public static boolean m23056f(short[] sArr, Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C10784o) || !AbstractC10968r.m24092n0(sArr, ((C10784o) obj).m23051f())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m23057g(short[] sArr, Object obj) {
        return (obj instanceof C10785p) && AbstractC9979u.m20289b(sArr, ((C10785p) obj).m23067p());
    }

    /* renamed from: h */
    public static final short m23058h(short[] sArr, int i10) {
        return C10784o.m23047b(sArr[i10]);
    }

    /* renamed from: j */
    public static int m23059j(short[] sArr) {
        return sArr.length;
    }

    /* renamed from: k */
    public static int m23060k(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: l */
    public static boolean m23061l(short[] sArr) {
        return sArr.length == 0;
    }

    /* renamed from: m */
    public static Iterator m23062m(short[] sArr) {
        return new a(sArr);
    }

    /* renamed from: n */
    public static final void m23063n(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    /* renamed from: o */
    public static String m23064o(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C10784o) {
            return m23065d(((C10784o) obj).m23051f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return m23056f(this.f26010c, elements);
    }

    /* renamed from: d */
    public boolean m23065d(short s10) {
        return m23055e(this.f26010c, s10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m23057g(this.f26010c, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m23060k(this.f26010c);
    }

    @Override // java.util.Collection
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m23059j(this.f26010c);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m23061l(this.f26010c);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m23062m(this.f26010c);
    }

    /* renamed from: p */
    public final /* synthetic */ short[] m23067p() {
        return this.f26010c;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC9971m.m20283a(this);
    }

    public String toString() {
        return m23064o(this.f26010c);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC9979u.m20294g(array, "array");
        return AbstractC9971m.m20284b(this, array);
    }
}
