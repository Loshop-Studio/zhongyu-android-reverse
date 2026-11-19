package p309qc;

import id.InterfaceC9624a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9971m;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10968r;

/* renamed from: qc.m */
/* loaded from: classes6.dex */
public final class C10782m implements Collection, InterfaceC9624a {

    /* renamed from: c */
    public final long[] f26004c;

    /* renamed from: qc.m$a */
    public static final class a implements Iterator, InterfaceC9624a {

        /* renamed from: c */
        public final long[] f26005c;

        /* renamed from: d */
        public int f26006d;

        public a(long[] array) {
            AbstractC9979u.m20294g(array, "array");
            this.f26005c = array;
        }

        /* renamed from: a */
        public long m23045a() {
            int i10 = this.f26006d;
            long[] jArr = this.f26005c;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f26006d));
            }
            this.f26006d = i10 + 1;
            return C10781l.m23023b(jArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26006d < this.f26005c.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C10781l.m23022a(m23045a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C10782m(long[] jArr) {
        this.f26004c = jArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ C10782m m23029a(long[] jArr) {
        return new C10782m(jArr);
    }

    /* renamed from: b */
    public static long[] m23030b(int i10) {
        return m23031c(new long[i10]);
    }

    /* renamed from: c */
    public static long[] m23031c(long[] storage) {
        AbstractC9979u.m20294g(storage, "storage");
        return storage;
    }

    /* renamed from: e */
    public static boolean m23032e(long[] jArr, long j10) {
        return AbstractC10968r.m24088l0(jArr, j10);
    }

    /* renamed from: f */
    public static boolean m23033f(long[] jArr, Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C10781l) || !AbstractC10968r.m24088l0(jArr, ((C10781l) obj).m23028g())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m23034g(long[] jArr, Object obj) {
        return (obj instanceof C10782m) && AbstractC9979u.m20289b(jArr, ((C10782m) obj).m23044p());
    }

    /* renamed from: h */
    public static final long m23035h(long[] jArr, int i10) {
        return C10781l.m23023b(jArr[i10]);
    }

    /* renamed from: j */
    public static int m23036j(long[] jArr) {
        return jArr.length;
    }

    /* renamed from: k */
    public static int m23037k(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: l */
    public static boolean m23038l(long[] jArr) {
        return jArr.length == 0;
    }

    /* renamed from: m */
    public static Iterator m23039m(long[] jArr) {
        return new a(jArr);
    }

    /* renamed from: n */
    public static final void m23040n(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    /* renamed from: o */
    public static String m23041o(long[] jArr) {
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
        if (obj instanceof C10781l) {
            return m23042d(((C10781l) obj).m23028g());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return m23033f(this.f26004c, elements);
    }

    /* renamed from: d */
    public boolean m23042d(long j10) {
        return m23032e(this.f26004c, j10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m23034g(this.f26004c, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m23037k(this.f26004c);
    }

    @Override // java.util.Collection
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m23036j(this.f26004c);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m23038l(this.f26004c);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m23039m(this.f26004c);
    }

    /* renamed from: p */
    public final /* synthetic */ long[] m23044p() {
        return this.f26004c;
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
        return m23041o(this.f26004c);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC9979u.m20294g(array, "array");
        return AbstractC9971m.m20284b(this, array);
    }
}
