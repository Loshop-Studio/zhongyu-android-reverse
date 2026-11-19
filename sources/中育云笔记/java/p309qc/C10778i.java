package p309qc;

import id.InterfaceC9624a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9971m;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10968r;

/* renamed from: qc.i */
/* loaded from: classes6.dex */
public final class C10778i implements Collection, InterfaceC9624a {

    /* renamed from: c */
    public final byte[] f25994c;

    /* renamed from: qc.i$a */
    public static final class a implements Iterator, InterfaceC9624a {

        /* renamed from: c */
        public final byte[] f25995c;

        /* renamed from: d */
        public int f25996d;

        public a(byte[] array) {
            AbstractC9979u.m20294g(array, "array");
            this.f25995c = array;
        }

        /* renamed from: a */
        public byte m22998a() {
            int i10 = this.f25996d;
            byte[] bArr = this.f25995c;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f25996d));
            }
            this.f25996d = i10 + 1;
            return C10777h.m22977b(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25996d < this.f25995c.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C10777h.m22976a(m22998a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C10778i(byte[] bArr) {
        this.f25994c = bArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ C10778i m22982a(byte[] bArr) {
        return new C10778i(bArr);
    }

    /* renamed from: b */
    public static byte[] m22983b(int i10) {
        return m22984c(new byte[i10]);
    }

    /* renamed from: c */
    public static byte[] m22984c(byte[] storage) {
        AbstractC9979u.m20294g(storage, "storage");
        return storage;
    }

    /* renamed from: e */
    public static boolean m22985e(byte[] bArr, byte b10) {
        return AbstractC10968r.m24084j0(bArr, b10);
    }

    /* renamed from: f */
    public static boolean m22986f(byte[] bArr, Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C10777h) || !AbstractC10968r.m24084j0(bArr, ((C10777h) obj).m22981f())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m22987g(byte[] bArr, Object obj) {
        return (obj instanceof C10778i) && AbstractC9979u.m20289b(bArr, ((C10778i) obj).m22997p());
    }

    /* renamed from: h */
    public static final byte m22988h(byte[] bArr, int i10) {
        return C10777h.m22977b(bArr[i10]);
    }

    /* renamed from: j */
    public static int m22989j(byte[] bArr) {
        return bArr.length;
    }

    /* renamed from: k */
    public static int m22990k(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: l */
    public static boolean m22991l(byte[] bArr) {
        return bArr.length == 0;
    }

    /* renamed from: m */
    public static Iterator m22992m(byte[] bArr) {
        return new a(bArr);
    }

    /* renamed from: n */
    public static final void m22993n(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    /* renamed from: o */
    public static String m22994o(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
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
        if (obj instanceof C10777h) {
            return m22995d(((C10777h) obj).m22981f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return m22986f(this.f25994c, elements);
    }

    /* renamed from: d */
    public boolean m22995d(byte b10) {
        return m22985e(this.f25994c, b10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m22987g(this.f25994c, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m22990k(this.f25994c);
    }

    @Override // java.util.Collection
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m22989j(this.f25994c);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m22991l(this.f25994c);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m22992m(this.f25994c);
    }

    /* renamed from: p */
    public final /* synthetic */ byte[] m22997p() {
        return this.f25994c;
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
        return m22994o(this.f25994c);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC9979u.m20294g(array, "array");
        return AbstractC9971m.m20284b(this, array);
    }
}
