package p123h7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9125m;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8801r;
import p311y7.InterfaceC10668a;

/* renamed from: h7.o */
/* loaded from: classes5.dex */
public final class C8735o implements Collection, InterfaceC10668a {

    /* renamed from: a */
    public final short[] f16365a;

    /* renamed from: h7.o$a */
    public static final class a implements Iterator, InterfaceC10668a {

        /* renamed from: a */
        public final short[] f16366a;

        /* renamed from: b */
        public int f16367b;

        public a(short[] array) {
            AbstractC9133u.m16133g(array, "array");
            this.f16366a = array;
        }

        /* renamed from: a */
        public short m14323a() {
            int i10 = this.f16367b;
            short[] sArr = this.f16366a;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f16367b));
            }
            this.f16367b = i10 + 1;
            return C8734n.m14302b(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16367b < this.f16366a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C8734n.m14301a(m14323a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C8735o(short[] sArr) {
        this.f16365a = sArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ C8735o m14307a(short[] sArr) {
        return new C8735o(sArr);
    }

    /* renamed from: b */
    public static short[] m14308b(int i10) {
        return m14309c(new short[i10]);
    }

    /* renamed from: c */
    public static short[] m14309c(short[] storage) {
        AbstractC9133u.m16133g(storage, "storage");
        return storage;
    }

    /* renamed from: e */
    public static boolean m14310e(short[] sArr, short s10) {
        return AbstractC8801r.m14723o0(sArr, s10);
    }

    /* renamed from: f */
    public static boolean m14311f(short[] sArr, Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C8734n) || !AbstractC8801r.m14723o0(sArr, ((C8734n) obj).m14306f())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m14312g(short[] sArr, Object obj) {
        return (obj instanceof C8735o) && AbstractC9133u.m16128b(sArr, ((C8735o) obj).m14322p());
    }

    /* renamed from: h */
    public static final short m14313h(short[] sArr, int i10) {
        return C8734n.m14302b(sArr[i10]);
    }

    /* renamed from: j */
    public static int m14314j(short[] sArr) {
        return sArr.length;
    }

    /* renamed from: k */
    public static int m14315k(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: l */
    public static boolean m14316l(short[] sArr) {
        return sArr.length == 0;
    }

    /* renamed from: m */
    public static Iterator m14317m(short[] sArr) {
        return new a(sArr);
    }

    /* renamed from: n */
    public static final void m14318n(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    /* renamed from: o */
    public static String m14319o(short[] sArr) {
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
        if (obj instanceof C8734n) {
            return m14320d(((C8734n) obj).m14306f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return m14311f(this.f16365a, elements);
    }

    /* renamed from: d */
    public boolean m14320d(short s10) {
        return m14310e(this.f16365a, s10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m14312g(this.f16365a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m14315k(this.f16365a);
    }

    @Override // java.util.Collection
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m14314j(this.f16365a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m14316l(this.f16365a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m14317m(this.f16365a);
    }

    /* renamed from: p */
    public final /* synthetic */ short[] m14322p() {
        return this.f16365a;
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
        return m14319o(this.f16365a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC9133u.m16133g(array, "array");
        return AbstractC9125m.m16123b(this, array);
    }
}
