package p134i7;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;

/* renamed from: i7.m */
/* loaded from: classes5.dex */
public final class C8791m extends AbstractC8781h {

    /* renamed from: d */
    public static final a f16469d = new a(null);

    /* renamed from: e */
    public static final Object[] f16470e = new Object[0];

    /* renamed from: a */
    public int f16471a;

    /* renamed from: b */
    public Object[] f16472b;

    /* renamed from: c */
    public int f16473c;

    /* renamed from: i7.m$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public C8791m(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f16470e;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i10);
            }
            objArr = new Object[i10];
        }
        this.f16472b = objArr;
    }

    /* renamed from: d */
    private final void m14590d(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f16472b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f16470e) {
            this.f16472b = new Object[AbstractC8323h.m13510e(i10, 10)];
        } else {
            m14592b(AbstractC8773d.Companion.m14515e(objArr.length, i10));
        }
    }

    /* renamed from: a */
    public final void m14591a(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f16472b.length;
        while (i10 < length && it.hasNext()) {
            this.f16472b[i10] = it.next();
            i10++;
        }
        int i11 = this.f16471a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f16472b[i12] = it.next();
        }
        this.f16473c = size() + collection.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m14600l();
        m14590d(size() + elements.size());
        m14591a(m14599k(this.f16471a + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        m14600l();
        m14590d(size() + 1);
        int iM14593c = m14593c(this.f16471a);
        this.f16471a = iM14593c;
        this.f16472b[iM14593c] = obj;
        this.f16473c = size() + 1;
    }

    public final void addLast(Object obj) {
        m14600l();
        m14590d(size() + 1);
        this.f16472b[m14599k(this.f16471a + size())] = obj;
        this.f16473c = size() + 1;
    }

    /* renamed from: b */
    public final void m14592b(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f16472b;
        AbstractC8797p.m14649p(objArr2, objArr, 0, this.f16471a, objArr2.length);
        Object[] objArr3 = this.f16472b;
        int length = objArr3.length;
        int i11 = this.f16471a;
        AbstractC8797p.m14649p(objArr3, objArr, length - i11, 0, i11);
        this.f16471a = 0;
        this.f16472b = objArr;
    }

    /* renamed from: c */
    public final int m14593c(int i10) {
        return i10 == 0 ? AbstractC8801r.m14668B0(this.f16472b) : i10 - 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            m14600l();
            m14598j(this.f16471a, m14599k(this.f16471a + size()));
        }
        this.f16471a = 0;
        this.f16473c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final Object m14594e() {
        if (isEmpty()) {
            return null;
        }
        return this.f16472b[this.f16471a];
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f16472b[this.f16471a];
    }

    /* renamed from: g */
    public final int m14595g(int i10) {
        if (i10 == AbstractC8801r.m14668B0(this.f16472b)) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC8773d.Companion.m14512b(i10, size());
        return this.f16472b[m14599k(this.f16471a + i10)];
    }

    @Override // p134i7.AbstractC8781h
    public int getSize() {
        return this.f16473c;
    }

    /* renamed from: h */
    public final Object m14596h() {
        if (isEmpty()) {
            return null;
        }
        return this.f16472b[m14599k(this.f16471a + AbstractC8809v.m14773p(this))];
    }

    /* renamed from: i */
    public final int m14597i(int i10) {
        return i10 < 0 ? i10 + this.f16472b.length : i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iM14599k = m14599k(this.f16471a + size());
        int length = this.f16471a;
        if (length < iM14599k) {
            while (length < iM14599k) {
                if (AbstractC9133u.m16128b(obj, this.f16472b[length])) {
                    i10 = this.f16471a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM14599k) {
            return -1;
        }
        int length2 = this.f16472b.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iM14599k; i11++) {
                    if (AbstractC9133u.m16128b(obj, this.f16472b[i11])) {
                        length = i11 + this.f16472b.length;
                        i10 = this.f16471a;
                    }
                }
                return -1;
            }
            if (AbstractC9133u.m16128b(obj, this.f16472b[length])) {
                i10 = this.f16471a;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final void m14598j(int i10, int i11) {
        if (i10 < i11) {
            AbstractC8797p.m14613C(this.f16472b, null, i10, i11);
            return;
        }
        Object[] objArr = this.f16472b;
        AbstractC8797p.m14613C(objArr, null, i10, objArr.length);
        AbstractC8797p.m14613C(this.f16472b, null, 0, i11);
    }

    /* renamed from: k */
    public final int m14599k(int i10) {
        Object[] objArr = this.f16472b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    /* renamed from: l */
    public final void m14600l() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f16472b[m14599k(this.f16471a + AbstractC8809v.m14773p(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iM14668B0;
        int i10;
        int iM14599k = m14599k(this.f16471a + size());
        int i11 = this.f16471a;
        if (i11 < iM14599k) {
            iM14668B0 = iM14599k - 1;
            if (i11 <= iM14668B0) {
                while (!AbstractC9133u.m16128b(obj, this.f16472b[iM14668B0])) {
                    if (iM14668B0 != i11) {
                        iM14668B0--;
                    }
                }
                i10 = this.f16471a;
                return iM14668B0 - i10;
            }
            return -1;
        }
        if (i11 > iM14599k) {
            int i12 = iM14599k - 1;
            while (true) {
                if (-1 >= i12) {
                    iM14668B0 = AbstractC8801r.m14668B0(this.f16472b);
                    int i13 = this.f16471a;
                    if (i13 <= iM14668B0) {
                        while (!AbstractC9133u.m16128b(obj, this.f16472b[iM14668B0])) {
                            if (iM14668B0 != i13) {
                                iM14668B0--;
                            }
                        }
                        i10 = this.f16471a;
                    }
                } else {
                    if (AbstractC9133u.m16128b(obj, this.f16472b[i12])) {
                        iM14668B0 = i12 + this.f16472b.length;
                        i10 = this.f16471a;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    /* renamed from: m */
    public final Object m14601m() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    /* renamed from: n */
    public final void m14602n(int i10, int i11) {
        int iM14599k = m14599k(this.f16471a + (i10 - 1));
        int iM14599k2 = m14599k(this.f16471a + (i11 - 1));
        while (i10 > 0) {
            int i12 = iM14599k + 1;
            int iMin = Math.min(i10, Math.min(i12, iM14599k2 + 1));
            Object[] objArr = this.f16472b;
            int i13 = iM14599k2 - iMin;
            int i14 = iM14599k - iMin;
            AbstractC8797p.m14649p(objArr, objArr, i13 + 1, i14 + 1, i12);
            iM14599k = m14597i(i14);
            iM14599k2 = m14597i(i13);
            i10 -= iMin;
        }
    }

    /* renamed from: o */
    public final void m14603o(int i10, int i11) {
        int iM14599k = m14599k(this.f16471a + i11);
        int iM14599k2 = m14599k(this.f16471a + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f16472b;
            i11 = Math.min(size, Math.min(objArr.length - iM14599k, objArr.length - iM14599k2));
            Object[] objArr2 = this.f16472b;
            int i12 = iM14599k + i11;
            AbstractC8797p.m14649p(objArr2, objArr2, iM14599k2, iM14599k, i12);
            iM14599k = m14599k(i12);
            iM14599k2 = m14599k(iM14599k2 + i11);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int iM14599k;
        AbstractC9133u.m16133g(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f16472b.length != 0) {
            int iM14599k2 = m14599k(this.f16471a + size());
            int i10 = this.f16471a;
            if (i10 < iM14599k2) {
                iM14599k = i10;
                while (i10 < iM14599k2) {
                    Object obj = this.f16472b[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f16472b[iM14599k] = obj;
                        iM14599k++;
                    }
                    i10++;
                }
                AbstractC8797p.m14613C(this.f16472b, null, iM14599k, iM14599k2);
            } else {
                int length = this.f16472b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f16472b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f16472b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iM14599k = m14599k(i11);
                for (int i12 = 0; i12 < iM14599k2; i12++) {
                    Object[] objArr2 = this.f16472b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f16472b[iM14599k] = obj3;
                        iM14599k = m14595g(iM14599k);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                m14600l();
                this.f16473c = m14597i(iM14599k - this.f16471a);
            }
        }
        return z10;
    }

    @Override // p134i7.AbstractC8781h
    public Object removeAt(int i10) {
        AbstractC8773d.Companion.m14512b(i10, size());
        if (i10 == AbstractC8809v.m14773p(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        m14600l();
        int iM14599k = m14599k(this.f16471a + i10);
        Object obj = this.f16472b[iM14599k];
        if (i10 < (size() >> 1)) {
            int i11 = this.f16471a;
            if (iM14599k >= i11) {
                Object[] objArr = this.f16472b;
                AbstractC8797p.m14649p(objArr, objArr, i11 + 1, i11, iM14599k);
            } else {
                Object[] objArr2 = this.f16472b;
                AbstractC8797p.m14649p(objArr2, objArr2, 1, 0, iM14599k);
                Object[] objArr3 = this.f16472b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f16471a;
                AbstractC8797p.m14649p(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f16472b;
            int i13 = this.f16471a;
            objArr4[i13] = null;
            this.f16471a = m14595g(i13);
        } else {
            int iM14599k2 = m14599k(this.f16471a + AbstractC8809v.m14773p(this));
            if (iM14599k <= iM14599k2) {
                Object[] objArr5 = this.f16472b;
                AbstractC8797p.m14649p(objArr5, objArr5, iM14599k, iM14599k + 1, iM14599k2 + 1);
            } else {
                Object[] objArr6 = this.f16472b;
                AbstractC8797p.m14649p(objArr6, objArr6, iM14599k, iM14599k + 1, objArr6.length);
                Object[] objArr7 = this.f16472b;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC8797p.m14649p(objArr7, objArr7, 0, 1, iM14599k2 + 1);
            }
            this.f16472b[iM14599k2] = null;
        }
        this.f16473c = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m14600l();
        Object[] objArr = this.f16472b;
        int i10 = this.f16471a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f16471a = m14595g(i10);
        this.f16473c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m14600l();
        int iM14599k = m14599k(this.f16471a + AbstractC8809v.m14773p(this));
        Object[] objArr = this.f16472b;
        Object obj = objArr[iM14599k];
        objArr[iM14599k] = null;
        this.f16473c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        AbstractC8773d.Companion.m14514d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            removeAt(i10);
            return;
        }
        m14600l();
        if (i10 < size() - i11) {
            m14602n(i10, i11);
            int iM14599k = m14599k(this.f16471a + i12);
            m14598j(this.f16471a, iM14599k);
            this.f16471a = iM14599k;
        } else {
            m14603o(i10, i11);
            int iM14599k2 = m14599k(this.f16471a + size());
            m14598j(m14597i(iM14599k2 - i12), iM14599k2);
        }
        this.f16473c = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int iM14599k;
        AbstractC9133u.m16133g(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f16472b.length != 0) {
            int iM14599k2 = m14599k(this.f16471a + size());
            int i10 = this.f16471a;
            if (i10 < iM14599k2) {
                iM14599k = i10;
                while (i10 < iM14599k2) {
                    Object obj = this.f16472b[i10];
                    if (elements.contains(obj)) {
                        this.f16472b[iM14599k] = obj;
                        iM14599k++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                AbstractC8797p.m14613C(this.f16472b, null, iM14599k, iM14599k2);
            } else {
                int length = this.f16472b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f16472b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f16472b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iM14599k = m14599k(i11);
                for (int i12 = 0; i12 < iM14599k2; i12++) {
                    Object[] objArr2 = this.f16472b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f16472b[iM14599k] = obj3;
                        iM14599k = m14595g(iM14599k);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                m14600l();
                this.f16473c = m14597i(iM14599k - this.f16471a);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        AbstractC8773d.Companion.m14512b(i10, size());
        int iM14599k = m14599k(this.f16471a + i10);
        Object[] objArr = this.f16472b;
        Object obj2 = objArr[iM14599k];
        objArr[iM14599k] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) throws NegativeArraySizeException {
        AbstractC9133u.m16133g(array, "array");
        if (array.length < size()) {
            array = AbstractC8793n.m14604a(array, size());
        }
        Object[] objArr = array;
        int iM14599k = m14599k(this.f16471a + size());
        int i10 = this.f16471a;
        if (i10 < iM14599k) {
            AbstractC8797p.m14655v(this.f16472b, objArr, 0, i10, iM14599k, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f16472b;
            AbstractC8797p.m14649p(objArr2, objArr, 0, this.f16471a, objArr2.length);
            Object[] objArr3 = this.f16472b;
            AbstractC8797p.m14649p(objArr3, objArr, objArr3.length - this.f16471a, 0, iM14599k);
        }
        return AbstractC8807u.m14756f(size(), objArr);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        AbstractC8773d.Companion.m14513c(i10, size());
        if (i10 == size()) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        m14600l();
        m14590d(size() + 1);
        int iM14599k = m14599k(this.f16471a + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iM14593c = m14593c(iM14599k);
            int iM14593c2 = m14593c(this.f16471a);
            int i11 = this.f16471a;
            if (iM14593c >= i11) {
                Object[] objArr = this.f16472b;
                objArr[iM14593c2] = objArr[i11];
                AbstractC8797p.m14649p(objArr, objArr, i11, i11 + 1, iM14593c + 1);
            } else {
                Object[] objArr2 = this.f16472b;
                AbstractC8797p.m14649p(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f16472b;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC8797p.m14649p(objArr3, objArr3, 0, 1, iM14593c + 1);
            }
            this.f16472b[iM14593c] = obj;
            this.f16471a = iM14593c2;
        } else {
            int iM14599k2 = m14599k(this.f16471a + size());
            if (iM14599k < iM14599k2) {
                Object[] objArr4 = this.f16472b;
                AbstractC8797p.m14649p(objArr4, objArr4, iM14599k + 1, iM14599k, iM14599k2);
            } else {
                Object[] objArr5 = this.f16472b;
                AbstractC8797p.m14649p(objArr5, objArr5, 1, 0, iM14599k2);
                Object[] objArr6 = this.f16472b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC8797p.m14649p(objArr6, objArr6, iM14599k + 1, iM14599k, objArr6.length - 1);
            }
            this.f16472b[iM14599k] = obj;
        }
        this.f16473c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        AbstractC9133u.m16133g(elements, "elements");
        AbstractC8773d.Companion.m14513c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        m14600l();
        m14590d(size() + elements.size());
        int iM14599k = m14599k(this.f16471a + size());
        int iM14599k2 = m14599k(this.f16471a + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f16471a;
            int length = i11 - size;
            if (iM14599k2 < i11) {
                Object[] objArr = this.f16472b;
                AbstractC8797p.m14649p(objArr, objArr, length, i11, objArr.length);
                if (size >= iM14599k2) {
                    Object[] objArr2 = this.f16472b;
                    AbstractC8797p.m14649p(objArr2, objArr2, objArr2.length - size, 0, iM14599k2);
                } else {
                    Object[] objArr3 = this.f16472b;
                    AbstractC8797p.m14649p(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f16472b;
                    AbstractC8797p.m14649p(objArr4, objArr4, 0, size, iM14599k2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f16472b;
                AbstractC8797p.m14649p(objArr5, objArr5, length, i11, iM14599k2);
            } else {
                Object[] objArr6 = this.f16472b;
                length += objArr6.length;
                int i12 = iM14599k2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    AbstractC8797p.m14649p(objArr6, objArr6, length, i11, iM14599k2);
                } else {
                    AbstractC8797p.m14649p(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f16472b;
                    AbstractC8797p.m14649p(objArr7, objArr7, 0, this.f16471a + length2, iM14599k2);
                }
            }
            this.f16471a = length;
            m14591a(m14597i(iM14599k2 - size), elements);
        } else {
            int i13 = iM14599k2 + size;
            if (iM14599k2 < iM14599k) {
                int i14 = size + iM14599k;
                Object[] objArr8 = this.f16472b;
                if (i14 <= objArr8.length) {
                    AbstractC8797p.m14649p(objArr8, objArr8, i13, iM14599k2, iM14599k);
                } else if (i13 >= objArr8.length) {
                    AbstractC8797p.m14649p(objArr8, objArr8, i13 - objArr8.length, iM14599k2, iM14599k);
                } else {
                    int length3 = iM14599k - (i14 - objArr8.length);
                    AbstractC8797p.m14649p(objArr8, objArr8, 0, length3, iM14599k);
                    Object[] objArr9 = this.f16472b;
                    AbstractC8797p.m14649p(objArr9, objArr9, i13, iM14599k2, length3);
                }
            } else {
                Object[] objArr10 = this.f16472b;
                AbstractC8797p.m14649p(objArr10, objArr10, size, 0, iM14599k);
                Object[] objArr11 = this.f16472b;
                if (i13 >= objArr11.length) {
                    AbstractC8797p.m14649p(objArr11, objArr11, i13 - objArr11.length, iM14599k2, objArr11.length);
                } else {
                    AbstractC8797p.m14649p(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f16472b;
                    AbstractC8797p.m14649p(objArr12, objArr12, i13, iM14599k2, objArr12.length - size);
                }
            }
            m14591a(iM14599k2, elements);
        }
        return true;
    }

    public C8791m() {
        this.f16472b = f16470e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
