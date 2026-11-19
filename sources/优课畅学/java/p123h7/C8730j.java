package p123h7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9125m;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8801r;
import p311y7.InterfaceC10668a;

/* renamed from: h7.j */
/* loaded from: classes5.dex */
public final class C8730j implements Collection, InterfaceC10668a {

    /* renamed from: a */
    public final int[] f16354a;

    /* renamed from: h7.j$a */
    public static final class a implements Iterator, InterfaceC10668a {

        /* renamed from: a */
        public final int[] f16355a;

        /* renamed from: b */
        public int f16356b;

        public a(int[] array) {
            AbstractC9133u.m16133g(array, "array");
            this.f16355a = array;
        }

        /* renamed from: a */
        public int m14276a() {
            int i10 = this.f16356b;
            int[] iArr = this.f16355a;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f16356b));
            }
            this.f16356b = i10 + 1;
            return C8729i.m14255b(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16356b < this.f16355a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C8729i.m14254a(m14276a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C8730j(int[] iArr) {
        this.f16354a = iArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ C8730j m14260a(int[] iArr) {
        return new C8730j(iArr);
    }

    /* renamed from: b */
    public static int[] m14261b(int i10) {
        return m14262c(new int[i10]);
    }

    /* renamed from: c */
    public static int[] m14262c(int[] storage) {
        AbstractC9133u.m16133g(storage, "storage");
        return storage;
    }

    /* renamed from: e */
    public static boolean m14263e(int[] iArr, int i10) {
        return AbstractC8801r.m14717l0(iArr, i10);
    }

    /* renamed from: f */
    public static boolean m14264f(int[] iArr, Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C8729i) || !AbstractC8801r.m14717l0(iArr, ((C8729i) obj).m14259f())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m14265g(int[] iArr, Object obj) {
        return (obj instanceof C8730j) && AbstractC9133u.m16128b(iArr, ((C8730j) obj).m14275p());
    }

    /* renamed from: h */
    public static final int m14266h(int[] iArr, int i10) {
        return C8729i.m14255b(iArr[i10]);
    }

    /* renamed from: j */
    public static int m14267j(int[] iArr) {
        return iArr.length;
    }

    /* renamed from: k */
    public static int m14268k(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: l */
    public static boolean m14269l(int[] iArr) {
        return iArr.length == 0;
    }

    /* renamed from: m */
    public static Iterator m14270m(int[] iArr) {
        return new a(iArr);
    }

    /* renamed from: n */
    public static final void m14271n(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    /* renamed from: o */
    public static String m14272o(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
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
        if (obj instanceof C8729i) {
            return m14273d(((C8729i) obj).m14259f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return m14264f(this.f16354a, elements);
    }

    /* renamed from: d */
    public boolean m14273d(int i10) {
        return m14263e(this.f16354a, i10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m14265g(this.f16354a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m14268k(this.f16354a);
    }

    @Override // java.util.Collection
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m14267j(this.f16354a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m14269l(this.f16354a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m14270m(this.f16354a);
    }

    /* renamed from: p */
    public final /* synthetic */ int[] m14275p() {
        return this.f16354a;
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
        return m14272o(this.f16354a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC9133u.m16133g(array, "array");
        return AbstractC9125m.m16123b(this, array);
    }
}
