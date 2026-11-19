package p123h7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9125m;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8801r;
import p311y7.InterfaceC10668a;

/* renamed from: h7.l */
/* loaded from: classes5.dex */
public final class C8732l implements Collection, InterfaceC10668a {

    /* renamed from: a */
    public final long[] f16359a;

    /* renamed from: h7.l$a */
    public static final class a implements Iterator, InterfaceC10668a {

        /* renamed from: a */
        public final long[] f16360a;

        /* renamed from: b */
        public int f16361b;

        public a(long[] array) {
            AbstractC9133u.m16133g(array, "array");
            this.f16360a = array;
        }

        /* renamed from: a */
        public long m14300a() {
            int i10 = this.f16361b;
            long[] jArr = this.f16360a;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f16361b));
            }
            this.f16361b = i10 + 1;
            return C8731k.m14278b(jArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16361b < this.f16360a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C8731k.m14277a(m14300a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C8732l(long[] jArr) {
        this.f16359a = jArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ C8732l m14284a(long[] jArr) {
        return new C8732l(jArr);
    }

    /* renamed from: b */
    public static long[] m14285b(int i10) {
        return m14286c(new long[i10]);
    }

    /* renamed from: c */
    public static long[] m14286c(long[] storage) {
        AbstractC9133u.m16133g(storage, "storage");
        return storage;
    }

    /* renamed from: e */
    public static boolean m14287e(long[] jArr, long j10) {
        return AbstractC8801r.m14719m0(jArr, j10);
    }

    /* renamed from: f */
    public static boolean m14288f(long[] jArr, Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C8731k) || !AbstractC8801r.m14719m0(jArr, ((C8731k) obj).m14283g())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m14289g(long[] jArr, Object obj) {
        return (obj instanceof C8732l) && AbstractC9133u.m16128b(jArr, ((C8732l) obj).m14299p());
    }

    /* renamed from: h */
    public static final long m14290h(long[] jArr, int i10) {
        return C8731k.m14278b(jArr[i10]);
    }

    /* renamed from: j */
    public static int m14291j(long[] jArr) {
        return jArr.length;
    }

    /* renamed from: k */
    public static int m14292k(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: l */
    public static boolean m14293l(long[] jArr) {
        return jArr.length == 0;
    }

    /* renamed from: m */
    public static Iterator m14294m(long[] jArr) {
        return new a(jArr);
    }

    /* renamed from: n */
    public static final void m14295n(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    /* renamed from: o */
    public static String m14296o(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
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
        if (obj instanceof C8731k) {
            return m14297d(((C8731k) obj).m14283g());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return m14288f(this.f16359a, elements);
    }

    /* renamed from: d */
    public boolean m14297d(long j10) {
        return m14287e(this.f16359a, j10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m14289g(this.f16359a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m14292k(this.f16359a);
    }

    @Override // java.util.Collection
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m14291j(this.f16359a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m14293l(this.f16359a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m14294m(this.f16359a);
    }

    /* renamed from: p */
    public final /* synthetic */ long[] m14299p() {
        return this.f16359a;
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
        return AbstractC9125m.m16122a(this);
    }

    public String toString() {
        return m14296o(this.f16359a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC9133u.m16133g(array, "array");
        return AbstractC9125m.m16123b(this, array);
    }
}
