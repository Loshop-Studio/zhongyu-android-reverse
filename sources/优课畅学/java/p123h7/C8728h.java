package p123h7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9125m;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8801r;
import p311y7.InterfaceC10668a;

/* renamed from: h7.h */
/* loaded from: classes5.dex */
public final class C8728h implements Collection, InterfaceC10668a {

    /* renamed from: a */
    public final byte[] f16349a;

    /* renamed from: h7.h$a */
    public static final class a implements Iterator, InterfaceC10668a {

        /* renamed from: a */
        public final byte[] f16350a;

        /* renamed from: b */
        public int f16351b;

        public a(byte[] array) {
            AbstractC9133u.m16133g(array, "array");
            this.f16350a = array;
        }

        /* renamed from: a */
        public byte m14253a() {
            int i10 = this.f16351b;
            byte[] bArr = this.f16350a;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f16351b));
            }
            this.f16351b = i10 + 1;
            return C8727g.m14232b(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16351b < this.f16350a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C8727g.m14231a(m14253a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C8728h(byte[] bArr) {
        this.f16349a = bArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ C8728h m14237a(byte[] bArr) {
        return new C8728h(bArr);
    }

    /* renamed from: b */
    public static byte[] m14238b(int i10) {
        return m14239c(new byte[i10]);
    }

    /* renamed from: c */
    public static byte[] m14239c(byte[] storage) {
        AbstractC9133u.m16133g(storage, "storage");
        return storage;
    }

    /* renamed from: e */
    public static boolean m14240e(byte[] bArr, byte b10) {
        return AbstractC8801r.m14715k0(bArr, b10);
    }

    /* renamed from: f */
    public static boolean m14241f(byte[] bArr, Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C8727g) || !AbstractC8801r.m14715k0(bArr, ((C8727g) obj).m14236f())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m14242g(byte[] bArr, Object obj) {
        return (obj instanceof C8728h) && AbstractC9133u.m16128b(bArr, ((C8728h) obj).m14252p());
    }

    /* renamed from: h */
    public static final byte m14243h(byte[] bArr, int i10) {
        return C8727g.m14232b(bArr[i10]);
    }

    /* renamed from: j */
    public static int m14244j(byte[] bArr) {
        return bArr.length;
    }

    /* renamed from: k */
    public static int m14245k(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: l */
    public static boolean m14246l(byte[] bArr) {
        return bArr.length == 0;
    }

    /* renamed from: m */
    public static Iterator m14247m(byte[] bArr) {
        return new a(bArr);
    }

    /* renamed from: n */
    public static final void m14248n(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    /* renamed from: o */
    public static String m14249o(byte[] bArr) {
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
        if (obj instanceof C8727g) {
            return m14250d(((C8727g) obj).m14236f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return m14241f(this.f16349a, elements);
    }

    /* renamed from: d */
    public boolean m14250d(byte b10) {
        return m14240e(this.f16349a, b10);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m14242g(this.f16349a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m14245k(this.f16349a);
    }

    @Override // java.util.Collection
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m14244j(this.f16349a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m14246l(this.f16349a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m14247m(this.f16349a);
    }

    /* renamed from: p */
    public final /* synthetic */ byte[] m14252p() {
        return this.f16349a;
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
        return m14249o(this.f16349a);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC9133u.m16133g(array, "array");
        return AbstractC9125m.m16123b(this, array);
    }
}
