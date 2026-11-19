package p309qc;

import id.InterfaceC9624a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9971m;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10968r;

/* renamed from: qc.k */
/* loaded from: classes6.dex */
public final class C10780k implements Collection, InterfaceC9624a {

    /* renamed from: c */
    public final int[] f25999c;

    /* renamed from: qc.k$a */
    public static final class a implements Iterator, InterfaceC9624a {

        /* renamed from: c */
        public final int[] f26000c;

        /* renamed from: d */
        public int f26001d;

        public a(int[] array) {
            AbstractC9979u.m20294g(array, "array");
            this.f26000c = array;
        }

        /* renamed from: a */
        public int m23021a() {
            int i10 = this.f26001d;
            int[] iArr = this.f26000c;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f26001d));
            }
            this.f26001d = i10 + 1;
            return C10779j.m23000b(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26001d < this.f26000c.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C10779j.m22999a(m23021a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C10780k(int[] iArr) {
        this.f25999c = iArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ C10780k m23005a(int[] iArr) {
        return new C10780k(iArr);
    }

    /* renamed from: b */
    public static int[] m23006b(int i10) {
        return m23007c(new int[i10]);
    }

    /* renamed from: c */
    public static int[] m23007c(int[] storage) {
        AbstractC9979u.m20294g(storage, "storage");
        return storage;
    }

    /* renamed from: e */
    public static boolean m23008e(int[] iArr, int i10) {
        return AbstractC10968r.m24086k0(iArr, i10);
    }

    /* renamed from: f */
    public static boolean m23009f(int[] iArr, Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C10779j) || !AbstractC10968r.m24086k0(iArr, ((C10779j) obj).m23004f())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m23010g(int[] iArr, Object obj) {
        return (obj instanceof C10780k) && AbstractC9979u.m20289b(iArr, ((C10780k) obj).m23020p());
    }

    /* renamed from: h */
    public static final int m23011h(int[] iArr, int i10) {
        return C10779j.m23000b(iArr[i10]);
    }

    /* renamed from: j */
    public static int m23012j(int[] iArr) {
        return iArr.length;
    }

    /* renamed from: k */
    public static int m23013k(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: l */
    public static boolean m23014l(int[] iArr) {
        return iArr.length == 0;
    }

    /* renamed from: m */
    public static Iterator m23015m(int[] iArr) {
        return new a(iArr);
    }

    /* renamed from: n */
    public static final void m23016n(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    /* renamed from: o */
    public static String m23017o(int[] iArr) {
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
        if (obj instanceof C10779j) {
            return m23018d(((C10779j) obj).m23004f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return m23009f(this.f25999c, elements);
    }

    /* renamed from: d */
    public boolean m23018d(int i10) {
        return m23008e(this.f25999c, i10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m23010g(this.f25999c, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m23013k(this.f25999c);
    }

    @Override // java.util.Collection
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m23012j(this.f25999c);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m23014l(this.f25999c);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m23015m(this.f25999c);
    }

    /* renamed from: p */
    public final /* synthetic */ int[] m23020p() {
        return this.f25999c;
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
        return m23017o(this.f25999c);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC9979u.m20294g(array, "array");
        return AbstractC9971m.m20284b(this, array);
    }
}
