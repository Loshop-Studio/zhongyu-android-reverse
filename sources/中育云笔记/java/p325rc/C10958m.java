package p325rc;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

/* renamed from: rc.m */
/* loaded from: classes6.dex */
public final class C10958m extends AbstractC10948h {

    /* renamed from: f */
    public static final a f26461f = new a(null);

    /* renamed from: g */
    public static final Object[] f26462g = new Object[0];

    /* renamed from: c */
    public int f26463c;

    /* renamed from: d */
    public Object[] f26464d;

    /* renamed from: e */
    public int f26465e;

    /* renamed from: rc.m$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C10958m(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f26462g;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i10);
            }
            objArr = new Object[i10];
        }
        this.f26464d = objArr;
    }

    /* renamed from: e */
    private final void m23965e(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f26464d;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f26462g) {
            this.f26464d = new Object[AbstractC10410o.m21752e(i10, 10)];
        } else {
            m23967c(AbstractC10940d.Companion.m23889e(objArr.length, i10));
        }
    }

    /* renamed from: a */
    public final void m23966a(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f26464d.length;
        while (i10 < length && it.hasNext()) {
            this.f26464d[i10] = it.next();
            i10++;
        }
        int i11 = this.f26463c;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f26464d[i12] = it.next();
        }
        this.f26465e = size() + collection.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m23975p();
        m23965e(size() + elements.size());
        m23966a(m23974o(this.f26463c + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        m23975p();
        m23965e(size() + 1);
        int iM23968d = m23968d(this.f26463c);
        this.f26463c = iM23968d;
        this.f26464d[iM23968d] = obj;
        this.f26465e = size() + 1;
    }

    public final void addLast(Object obj) {
        m23975p();
        m23965e(size() + 1);
        this.f26464d[m23974o(this.f26463c + size())] = obj;
        this.f26465e = size() + 1;
    }

    /* renamed from: c */
    public final void m23967c(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f26464d;
        AbstractC10964p.m24023p(objArr2, objArr, 0, this.f26463c, objArr2.length);
        Object[] objArr3 = this.f26464d;
        int length = objArr3.length;
        int i11 = this.f26463c;
        AbstractC10964p.m24023p(objArr3, objArr, length - i11, 0, i11);
        this.f26463c = 0;
        this.f26464d = objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            m23975p();
            m23973n(this.f26463c, m23974o(this.f26463c + size()));
        }
        this.f26463c = 0;
        this.f26465e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int m23968d(int i10) {
        return i10 == 0 ? AbstractC10968r.m24041A0(this.f26464d) : i10 - 1;
    }

    /* renamed from: f */
    public final Object m23969f() {
        if (isEmpty()) {
            return null;
        }
        return this.f26464d[this.f26463c];
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f26464d[this.f26463c];
    }

    /* renamed from: g */
    public final int m23970g(int i10) {
        if (i10 == AbstractC10968r.m24041A0(this.f26464d)) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC10940d.Companion.m23886b(i10, size());
        return this.f26464d[m23974o(this.f26463c + i10)];
    }

    @Override // p325rc.AbstractC10948h
    public int getSize() {
        return this.f26465e;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iM23974o = m23974o(this.f26463c + size());
        int length = this.f26463c;
        if (length < iM23974o) {
            while (length < iM23974o) {
                if (AbstractC9979u.m20289b(obj, this.f26464d[length])) {
                    i10 = this.f26463c;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM23974o) {
            return -1;
        }
        int length2 = this.f26464d.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iM23974o; i11++) {
                    if (AbstractC9979u.m20289b(obj, this.f26464d[i11])) {
                        length = i11 + this.f26464d.length;
                        i10 = this.f26463c;
                    }
                }
                return -1;
            }
            if (AbstractC9979u.m20289b(obj, this.f26464d[length])) {
                i10 = this.f26463c;
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

    /* renamed from: k */
    public final Object m23971k() {
        if (isEmpty()) {
            return null;
        }
        return this.f26464d[m23974o(this.f26463c + AbstractC10978w.m24138p(this))];
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f26464d[m23974o(this.f26463c + AbstractC10978w.m24138p(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iM24041A0;
        int i10;
        int iM23974o = m23974o(this.f26463c + size());
        int i11 = this.f26463c;
        if (i11 < iM23974o) {
            iM24041A0 = iM23974o - 1;
            if (i11 <= iM24041A0) {
                while (!AbstractC9979u.m20289b(obj, this.f26464d[iM24041A0])) {
                    if (iM24041A0 != i11) {
                        iM24041A0--;
                    }
                }
                i10 = this.f26463c;
                return iM24041A0 - i10;
            }
            return -1;
        }
        if (i11 > iM23974o) {
            int i12 = iM23974o - 1;
            while (true) {
                if (-1 >= i12) {
                    iM24041A0 = AbstractC10968r.m24041A0(this.f26464d);
                    int i13 = this.f26463c;
                    if (i13 <= iM24041A0) {
                        while (!AbstractC9979u.m20289b(obj, this.f26464d[iM24041A0])) {
                            if (iM24041A0 != i13) {
                                iM24041A0--;
                            }
                        }
                        i10 = this.f26463c;
                    }
                } else {
                    if (AbstractC9979u.m20289b(obj, this.f26464d[i12])) {
                        iM24041A0 = i12 + this.f26464d.length;
                        i10 = this.f26463c;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    /* renamed from: m */
    public final int m23972m(int i10) {
        return i10 < 0 ? i10 + this.f26464d.length : i10;
    }

    /* renamed from: n */
    public final void m23973n(int i10, int i11) {
        if (i10 < i11) {
            AbstractC10964p.m23987B(this.f26464d, null, i10, i11);
            return;
        }
        Object[] objArr = this.f26464d;
        AbstractC10964p.m23987B(objArr, null, i10, objArr.length);
        AbstractC10964p.m23987B(this.f26464d, null, 0, i11);
    }

    /* renamed from: o */
    public final int m23974o(int i10) {
        Object[] objArr = this.f26464d;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    /* renamed from: p */
    public final void m23975p() {
        ((AbstractList) this).modCount++;
    }

    /* renamed from: r */
    public final Object m23976r() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
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
        int iM23974o;
        AbstractC9979u.m20294g(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f26464d.length != 0) {
            int iM23974o2 = m23974o(this.f26463c + size());
            int i10 = this.f26463c;
            if (i10 < iM23974o2) {
                iM23974o = i10;
                while (i10 < iM23974o2) {
                    Object obj = this.f26464d[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f26464d[iM23974o] = obj;
                        iM23974o++;
                    }
                    i10++;
                }
                AbstractC10964p.m23987B(this.f26464d, null, iM23974o, iM23974o2);
            } else {
                int length = this.f26464d.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f26464d;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f26464d[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iM23974o = m23974o(i11);
                for (int i12 = 0; i12 < iM23974o2; i12++) {
                    Object[] objArr2 = this.f26464d;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f26464d[iM23974o] = obj3;
                        iM23974o = m23970g(iM23974o);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                m23975p();
                this.f26465e = m23972m(iM23974o - this.f26463c);
            }
        }
        return z10;
    }

    @Override // p325rc.AbstractC10948h
    public Object removeAt(int i10) {
        AbstractC10940d.Companion.m23886b(i10, size());
        if (i10 == AbstractC10978w.m24138p(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        m23975p();
        int iM23974o = m23974o(this.f26463c + i10);
        Object obj = this.f26464d[iM23974o];
        if (i10 < (size() >> 1)) {
            int i11 = this.f26463c;
            if (iM23974o >= i11) {
                Object[] objArr = this.f26464d;
                AbstractC10964p.m24023p(objArr, objArr, i11 + 1, i11, iM23974o);
            } else {
                Object[] objArr2 = this.f26464d;
                AbstractC10964p.m24023p(objArr2, objArr2, 1, 0, iM23974o);
                Object[] objArr3 = this.f26464d;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f26463c;
                AbstractC10964p.m24023p(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f26464d;
            int i13 = this.f26463c;
            objArr4[i13] = null;
            this.f26463c = m23970g(i13);
        } else {
            int iM23974o2 = m23974o(this.f26463c + AbstractC10978w.m24138p(this));
            if (iM23974o <= iM23974o2) {
                Object[] objArr5 = this.f26464d;
                AbstractC10964p.m24023p(objArr5, objArr5, iM23974o, iM23974o + 1, iM23974o2 + 1);
            } else {
                Object[] objArr6 = this.f26464d;
                AbstractC10964p.m24023p(objArr6, objArr6, iM23974o, iM23974o + 1, objArr6.length);
                Object[] objArr7 = this.f26464d;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC10964p.m24023p(objArr7, objArr7, 0, 1, iM23974o2 + 1);
            }
            this.f26464d[iM23974o2] = null;
        }
        this.f26465e = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m23975p();
        Object[] objArr = this.f26464d;
        int i10 = this.f26463c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f26463c = m23970g(i10);
        this.f26465e = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m23975p();
        int iM23974o = m23974o(this.f26463c + AbstractC10978w.m24138p(this));
        Object[] objArr = this.f26464d;
        Object obj = objArr[iM23974o];
        objArr[iM23974o] = null;
        this.f26465e = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        AbstractC10940d.Companion.m23888d(i10, i11, size());
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
        m23975p();
        if (i10 < size() - i11) {
            m23977t(i10, i11);
            int iM23974o = m23974o(this.f26463c + i12);
            m23973n(this.f26463c, iM23974o);
            this.f26463c = iM23974o;
        } else {
            m23978u(i10, i11);
            int iM23974o2 = m23974o(this.f26463c + size());
            m23973n(m23972m(iM23974o2 - i12), iM23974o2);
        }
        this.f26465e = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int iM23974o;
        AbstractC9979u.m20294g(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f26464d.length != 0) {
            int iM23974o2 = m23974o(this.f26463c + size());
            int i10 = this.f26463c;
            if (i10 < iM23974o2) {
                iM23974o = i10;
                while (i10 < iM23974o2) {
                    Object obj = this.f26464d[i10];
                    if (elements.contains(obj)) {
                        this.f26464d[iM23974o] = obj;
                        iM23974o++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                AbstractC10964p.m23987B(this.f26464d, null, iM23974o, iM23974o2);
            } else {
                int length = this.f26464d.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f26464d;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f26464d[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iM23974o = m23974o(i11);
                for (int i12 = 0; i12 < iM23974o2; i12++) {
                    Object[] objArr2 = this.f26464d;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f26464d[iM23974o] = obj3;
                        iM23974o = m23970g(iM23974o);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                m23975p();
                this.f26465e = m23972m(iM23974o - this.f26463c);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        AbstractC10940d.Companion.m23886b(i10, size());
        int iM23974o = m23974o(this.f26463c + i10);
        Object[] objArr = this.f26464d;
        Object obj2 = objArr[iM23974o];
        objArr[iM23974o] = obj;
        return obj2;
    }

    /* renamed from: t */
    public final void m23977t(int i10, int i11) {
        int iM23974o = m23974o(this.f26463c + (i10 - 1));
        int iM23974o2 = m23974o(this.f26463c + (i11 - 1));
        while (i10 > 0) {
            int i12 = iM23974o + 1;
            int iMin = Math.min(i10, Math.min(i12, iM23974o2 + 1));
            Object[] objArr = this.f26464d;
            int i13 = iM23974o2 - iMin;
            int i14 = iM23974o - iMin;
            AbstractC10964p.m24023p(objArr, objArr, i13 + 1, i14 + 1, i12);
            iM23974o = m23972m(i14);
            iM23974o2 = m23972m(i13);
            i10 -= iMin;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) throws NegativeArraySizeException {
        AbstractC9979u.m20294g(array, "array");
        if (array.length < size()) {
            array = AbstractC10960n.m23980a(array, size());
        }
        Object[] objArr = array;
        int iM23974o = m23974o(this.f26463c + size());
        int i10 = this.f26463c;
        if (i10 < iM23974o) {
            AbstractC10964p.m24029v(this.f26464d, objArr, 0, i10, iM23974o, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f26464d;
            AbstractC10964p.m24023p(objArr2, objArr, 0, this.f26463c, objArr2.length);
            Object[] objArr3 = this.f26464d;
            AbstractC10964p.m24023p(objArr3, objArr, objArr3.length - this.f26463c, 0, iM23974o);
        }
        return AbstractC10976v.m24127f(size(), objArr);
    }

    /* renamed from: u */
    public final void m23978u(int i10, int i11) {
        int iM23974o = m23974o(this.f26463c + i11);
        int iM23974o2 = m23974o(this.f26463c + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f26464d;
            i11 = Math.min(size, Math.min(objArr.length - iM23974o, objArr.length - iM23974o2));
            Object[] objArr2 = this.f26464d;
            int i12 = iM23974o + i11;
            AbstractC10964p.m24023p(objArr2, objArr2, iM23974o2, iM23974o, i12);
            iM23974o = m23974o(i12);
            iM23974o2 = m23974o(iM23974o2 + i11);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        AbstractC10940d.Companion.m23887c(i10, size());
        if (i10 == size()) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        m23975p();
        m23965e(size() + 1);
        int iM23974o = m23974o(this.f26463c + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iM23968d = m23968d(iM23974o);
            int iM23968d2 = m23968d(this.f26463c);
            int i11 = this.f26463c;
            if (iM23968d >= i11) {
                Object[] objArr = this.f26464d;
                objArr[iM23968d2] = objArr[i11];
                AbstractC10964p.m24023p(objArr, objArr, i11, i11 + 1, iM23968d + 1);
            } else {
                Object[] objArr2 = this.f26464d;
                AbstractC10964p.m24023p(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f26464d;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC10964p.m24023p(objArr3, objArr3, 0, 1, iM23968d + 1);
            }
            this.f26464d[iM23968d] = obj;
            this.f26463c = iM23968d2;
        } else {
            int iM23974o2 = m23974o(this.f26463c + size());
            if (iM23974o < iM23974o2) {
                Object[] objArr4 = this.f26464d;
                AbstractC10964p.m24023p(objArr4, objArr4, iM23974o + 1, iM23974o, iM23974o2);
            } else {
                Object[] objArr5 = this.f26464d;
                AbstractC10964p.m24023p(objArr5, objArr5, 1, 0, iM23974o2);
                Object[] objArr6 = this.f26464d;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC10964p.m24023p(objArr6, objArr6, iM23974o + 1, iM23974o, objArr6.length - 1);
            }
            this.f26464d[iM23974o] = obj;
        }
        this.f26465e = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        AbstractC9979u.m20294g(elements, "elements");
        AbstractC10940d.Companion.m23887c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        m23975p();
        m23965e(size() + elements.size());
        int iM23974o = m23974o(this.f26463c + size());
        int iM23974o2 = m23974o(this.f26463c + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f26463c;
            int length = i11 - size;
            if (iM23974o2 < i11) {
                Object[] objArr = this.f26464d;
                AbstractC10964p.m24023p(objArr, objArr, length, i11, objArr.length);
                if (size >= iM23974o2) {
                    Object[] objArr2 = this.f26464d;
                    AbstractC10964p.m24023p(objArr2, objArr2, objArr2.length - size, 0, iM23974o2);
                } else {
                    Object[] objArr3 = this.f26464d;
                    AbstractC10964p.m24023p(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f26464d;
                    AbstractC10964p.m24023p(objArr4, objArr4, 0, size, iM23974o2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f26464d;
                AbstractC10964p.m24023p(objArr5, objArr5, length, i11, iM23974o2);
            } else {
                Object[] objArr6 = this.f26464d;
                length += objArr6.length;
                int i12 = iM23974o2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    AbstractC10964p.m24023p(objArr6, objArr6, length, i11, iM23974o2);
                } else {
                    AbstractC10964p.m24023p(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f26464d;
                    AbstractC10964p.m24023p(objArr7, objArr7, 0, this.f26463c + length2, iM23974o2);
                }
            }
            this.f26463c = length;
            m23966a(m23972m(iM23974o2 - size), elements);
        } else {
            int i13 = iM23974o2 + size;
            if (iM23974o2 < iM23974o) {
                int i14 = size + iM23974o;
                Object[] objArr8 = this.f26464d;
                if (i14 <= objArr8.length) {
                    AbstractC10964p.m24023p(objArr8, objArr8, i13, iM23974o2, iM23974o);
                } else if (i13 >= objArr8.length) {
                    AbstractC10964p.m24023p(objArr8, objArr8, i13 - objArr8.length, iM23974o2, iM23974o);
                } else {
                    int length3 = iM23974o - (i14 - objArr8.length);
                    AbstractC10964p.m24023p(objArr8, objArr8, 0, length3, iM23974o);
                    Object[] objArr9 = this.f26464d;
                    AbstractC10964p.m24023p(objArr9, objArr9, i13, iM23974o2, length3);
                }
            } else {
                Object[] objArr10 = this.f26464d;
                AbstractC10964p.m24023p(objArr10, objArr10, size, 0, iM23974o);
                Object[] objArr11 = this.f26464d;
                if (i13 >= objArr11.length) {
                    AbstractC10964p.m24023p(objArr11, objArr11, i13 - objArr11.length, iM23974o2, objArr11.length);
                } else {
                    AbstractC10964p.m24023p(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f26464d;
                    AbstractC10964p.m24023p(objArr12, objArr12, i13, iM23974o2, objArr12.length - size);
                }
            }
            m23966a(iM23974o2, elements);
        }
        return true;
    }

    public C10958m() {
        this.f26464d = f26462g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
