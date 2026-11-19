package kotlin.collections;

import android.support.v4.media.AbstractC0037f;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: kotlin.collections.p */
/* loaded from: classes2.dex */
public final class C5801p extends AbstractC5794j {

    /* renamed from: d */
    public static final Object[] f9193d = new Object[0];

    /* renamed from: a */
    public int f9194a;

    /* renamed from: b */
    public Object[] f9195b;

    /* renamed from: c */
    public int f9196c;

    public C5801p() {
        this.f9195b = f9193d;
    }

    /* renamed from: a */
    public final void m5165a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f9195b.length;
        while (i < length && it.hasNext()) {
            this.f9195b[i] = it.next();
            i++;
        }
        int i8 = this.f9194a;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f9195b[i9] = it.next();
        }
        this.f9196c = collection.size() + size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        AbstractC5830k.m5330g(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m5173i();
        m5166b(elements.size() + size());
        m5165a(m5172h(size() + this.f9194a), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        m5173i();
        m5166b(size() + 1);
        int i = this.f9194a;
        int iM5194U = i == 0 ? AbstractC5802q.m5194U(this.f9195b) : i - 1;
        this.f9194a = iM5194U;
        this.f9195b[iM5194U] = obj;
        this.f9196c = size() + 1;
    }

    public final void addLast(Object obj) {
        m5173i();
        m5166b(size() + 1);
        this.f9195b[m5172h(size() + this.f9194a)] = obj;
        this.f9196c = size() + 1;
    }

    /* renamed from: b */
    public final void m5166b(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f9195b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f9193d) {
            if (i < 10) {
                i = 10;
            }
            this.f9195b = new Object[i];
            return;
        }
        C5780c c5780c = AbstractC5786f.Companion;
        int length = objArr.length;
        c5780c.getClass();
        Object[] objArr2 = new Object[C5780c.m5146e(length, i)];
        Object[] objArr3 = this.f9195b;
        AbstractC5802q.m5178E(objArr3, objArr2, 0, this.f9194a, objArr3.length);
        Object[] objArr4 = this.f9195b;
        int length2 = objArr4.length;
        int i8 = this.f9194a;
        AbstractC5802q.m5178E(objArr4, objArr2, length2 - i8, 0, i8);
        this.f9194a = 0;
        this.f9195b = objArr2;
    }

    /* renamed from: c */
    public final Object m5167c() {
        if (isEmpty()) {
            return null;
        }
        return this.f9195b[this.f9194a];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m5173i();
            m5171g(this.f9194a, m5172h(size() + this.f9194a));
        }
        this.f9194a = 0;
        this.f9196c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int m5168d(int i) {
        if (i == AbstractC5802q.m5194U(this.f9195b)) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: e */
    public final Object m5169e() {
        if (isEmpty()) {
            return null;
        }
        return this.f9195b[m5172h(AbstractC5806u.m5282u(this) + this.f9194a)];
    }

    /* renamed from: f */
    public final int m5170f(int i) {
        return i < 0 ? i + this.f9195b.length : i;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f9195b[this.f9194a];
    }

    /* renamed from: g */
    public final void m5171g(int i, int i8) {
        if (i < i8) {
            AbstractC5802q.m5186M(null, this.f9195b, i, i8);
            return;
        }
        Object[] objArr = this.f9195b;
        AbstractC5802q.m5186M(null, objArr, i, objArr.length);
        AbstractC5802q.m5186M(null, this.f9195b, 0, i8);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C5780c c5780c = AbstractC5786f.Companion;
        int size = size();
        c5780c.getClass();
        C5780c.m5143b(i, size);
        return this.f9195b[m5172h(this.f9194a + i)];
    }

    @Override // kotlin.collections.AbstractC5794j
    public final int getSize() {
        return this.f9196c;
    }

    /* renamed from: h */
    public final int m5172h(int i) {
        Object[] objArr = this.f9195b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* renamed from: i */
    public final void m5173i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM5172h = m5172h(size() + this.f9194a);
        int length = this.f9194a;
        if (length < iM5172h) {
            while (length < iM5172h) {
                if (AbstractC5830k.m5325b(obj, this.f9195b[length])) {
                    i = this.f9194a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM5172h) {
            return -1;
        }
        int length2 = this.f9195b.length;
        while (true) {
            if (length >= length2) {
                for (int i8 = 0; i8 < iM5172h; i8++) {
                    if (AbstractC5830k.m5325b(obj, this.f9195b[i8])) {
                        length = i8 + this.f9195b.length;
                        i = this.f9194a;
                    }
                }
                return -1;
            }
            if (AbstractC5830k.m5325b(obj, this.f9195b[length])) {
                i = this.f9194a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f9195b[m5172h(AbstractC5806u.m5282u(this) + this.f9194a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iM5194U;
        int i;
        int iM5172h = m5172h(size() + this.f9194a);
        int i8 = this.f9194a;
        if (i8 < iM5172h) {
            iM5194U = iM5172h - 1;
            if (i8 <= iM5194U) {
                while (!AbstractC5830k.m5325b(obj, this.f9195b[iM5194U])) {
                    if (iM5194U != i8) {
                        iM5194U--;
                    }
                }
                i = this.f9194a;
                return iM5194U - i;
            }
            return -1;
        }
        if (i8 > iM5172h) {
            int i9 = iM5172h - 1;
            while (true) {
                if (-1 >= i9) {
                    iM5194U = AbstractC5802q.m5194U(this.f9195b);
                    int i10 = this.f9194a;
                    if (i10 <= iM5194U) {
                        while (!AbstractC5830k.m5325b(obj, this.f9195b[iM5194U])) {
                            if (iM5194U != i10) {
                                iM5194U--;
                            }
                        }
                        i = this.f9194a;
                    }
                } else {
                    if (AbstractC5830k.m5325b(obj, this.f9195b[i9])) {
                        iM5194U = i9 + this.f9195b.length;
                        i = this.f9194a;
                        break;
                    }
                    i9--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iM5172h;
        AbstractC5830k.m5330g(elements, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f9195b.length != 0) {
            int iM5172h2 = m5172h(size() + this.f9194a);
            int i = this.f9194a;
            if (i < iM5172h2) {
                iM5172h = i;
                while (i < iM5172h2) {
                    Object obj = this.f9195b[i];
                    if (elements.contains(obj)) {
                        z8 = true;
                    } else {
                        this.f9195b[iM5172h] = obj;
                        iM5172h++;
                    }
                    i++;
                }
                AbstractC5802q.m5186M(null, this.f9195b, iM5172h, iM5172h2);
            } else {
                int length = this.f9195b.length;
                boolean z9 = false;
                int i8 = i;
                while (i < length) {
                    Object[] objArr = this.f9195b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z9 = true;
                    } else {
                        this.f9195b[i8] = obj2;
                        i8++;
                    }
                    i++;
                }
                iM5172h = m5172h(i8);
                for (int i9 = 0; i9 < iM5172h2; i9++) {
                    Object[] objArr2 = this.f9195b;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (elements.contains(obj3)) {
                        z9 = true;
                    } else {
                        this.f9195b[iM5172h] = obj3;
                        iM5172h = m5168d(iM5172h);
                    }
                }
                z8 = z9;
            }
            if (z8) {
                m5173i();
                this.f9196c = m5170f(iM5172h - this.f9194a);
            }
        }
        return z8;
    }

    @Override // kotlin.collections.AbstractC5794j
    public final Object removeAt(int i) {
        C5780c c5780c = AbstractC5786f.Companion;
        int size = size();
        c5780c.getClass();
        C5780c.m5143b(i, size);
        if (i == AbstractC5806u.m5282u(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m5173i();
        int iM5172h = m5172h(this.f9194a + i);
        Object obj = this.f9195b[iM5172h];
        if (i < (size() >> 1)) {
            int i8 = this.f9194a;
            if (iM5172h >= i8) {
                Object[] objArr = this.f9195b;
                AbstractC5802q.m5178E(objArr, objArr, i8 + 1, i8, iM5172h);
            } else {
                Object[] objArr2 = this.f9195b;
                AbstractC5802q.m5178E(objArr2, objArr2, 1, 0, iM5172h);
                Object[] objArr3 = this.f9195b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i9 = this.f9194a;
                AbstractC5802q.m5178E(objArr3, objArr3, i9 + 1, i9, objArr3.length - 1);
            }
            Object[] objArr4 = this.f9195b;
            int i10 = this.f9194a;
            objArr4[i10] = null;
            this.f9194a = m5168d(i10);
        } else {
            int iM5172h2 = m5172h(AbstractC5806u.m5282u(this) + this.f9194a);
            if (iM5172h <= iM5172h2) {
                Object[] objArr5 = this.f9195b;
                AbstractC5802q.m5178E(objArr5, objArr5, iM5172h, iM5172h + 1, iM5172h2 + 1);
            } else {
                Object[] objArr6 = this.f9195b;
                AbstractC5802q.m5178E(objArr6, objArr6, iM5172h, iM5172h + 1, objArr6.length);
                Object[] objArr7 = this.f9195b;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC5802q.m5178E(objArr7, objArr7, 0, 1, iM5172h2 + 1);
            }
            this.f9195b[iM5172h2] = null;
        }
        this.f9196c = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m5173i();
        Object[] objArr = this.f9195b;
        int i = this.f9194a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f9194a = m5168d(i);
        this.f9196c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m5173i();
        int iM5172h = m5172h(AbstractC5806u.m5282u(this) + this.f9194a);
        Object[] objArr = this.f9195b;
        Object obj = objArr[iM5172h];
        objArr[iM5172h] = null;
        this.f9196c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i8) {
        C5780c c5780c = AbstractC5786f.Companion;
        int size = size();
        c5780c.getClass();
        C5780c.m5145d(i, i8, size);
        int i9 = i8 - i;
        if (i9 == 0) {
            return;
        }
        if (i9 == size()) {
            clear();
            return;
        }
        if (i9 == 1) {
            removeAt(i);
            return;
        }
        m5173i();
        if (i < size() - i8) {
            int iM5172h = m5172h(this.f9194a + (i - 1));
            int iM5172h2 = m5172h(this.f9194a + (i8 - 1));
            while (i > 0) {
                int i10 = iM5172h + 1;
                int iMin = Math.min(i, Math.min(i10, iM5172h2 + 1));
                Object[] objArr = this.f9195b;
                int i11 = iM5172h2 - iMin;
                int i12 = iM5172h - iMin;
                AbstractC5802q.m5178E(objArr, objArr, i11 + 1, i12 + 1, i10);
                iM5172h = m5170f(i12);
                iM5172h2 = m5170f(i11);
                i -= iMin;
            }
            int iM5172h3 = m5172h(this.f9194a + i9);
            m5171g(this.f9194a, iM5172h3);
            this.f9194a = iM5172h3;
        } else {
            int iM5172h4 = m5172h(this.f9194a + i8);
            int iM5172h5 = m5172h(this.f9194a + i);
            int size2 = size();
            while (true) {
                size2 -= i8;
                if (size2 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f9195b;
                i8 = Math.min(size2, Math.min(objArr2.length - iM5172h4, objArr2.length - iM5172h5));
                Object[] objArr3 = this.f9195b;
                int i13 = iM5172h4 + i8;
                AbstractC5802q.m5178E(objArr3, objArr3, iM5172h5, iM5172h4, i13);
                iM5172h4 = m5172h(i13);
                iM5172h5 = m5172h(iM5172h5 + i8);
            }
            int iM5172h6 = m5172h(size() + this.f9194a);
            m5171g(m5170f(iM5172h6 - i9), iM5172h6);
        }
        this.f9196c = size() - i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iM5172h;
        AbstractC5830k.m5330g(elements, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f9195b.length != 0) {
            int iM5172h2 = m5172h(size() + this.f9194a);
            int i = this.f9194a;
            if (i < iM5172h2) {
                iM5172h = i;
                while (i < iM5172h2) {
                    Object obj = this.f9195b[i];
                    if (elements.contains(obj)) {
                        this.f9195b[iM5172h] = obj;
                        iM5172h++;
                    } else {
                        z8 = true;
                    }
                    i++;
                }
                AbstractC5802q.m5186M(null, this.f9195b, iM5172h, iM5172h2);
            } else {
                int length = this.f9195b.length;
                boolean z9 = false;
                int i8 = i;
                while (i < length) {
                    Object[] objArr = this.f9195b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.f9195b[i8] = obj2;
                        i8++;
                    } else {
                        z9 = true;
                    }
                    i++;
                }
                iM5172h = m5172h(i8);
                for (int i9 = 0; i9 < iM5172h2; i9++) {
                    Object[] objArr2 = this.f9195b;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (elements.contains(obj3)) {
                        this.f9195b[iM5172h] = obj3;
                        iM5172h = m5168d(iM5172h);
                    } else {
                        z9 = true;
                    }
                }
                z8 = z9;
            }
            if (z8) {
                m5173i();
                this.f9196c = m5170f(iM5172h - this.f9194a);
            }
        }
        return z8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C5780c c5780c = AbstractC5786f.Companion;
        int size = size();
        c5780c.getClass();
        C5780c.m5143b(i, size);
        int iM5172h = m5172h(this.f9194a + i);
        Object[] objArr = this.f9195b;
        Object obj2 = objArr[iM5172h];
        objArr[iM5172h] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) throws NegativeArraySizeException {
        AbstractC5830k.m5330g(array, "array");
        if (array.length < size()) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), size());
            AbstractC5830k.m5328e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        Object[] objArr = array;
        int iM5172h = m5172h(size() + this.f9194a);
        int i = this.f9194a;
        if (i < iM5172h) {
            AbstractC5802q.m5182I(this.f9195b, objArr, 0, i, iM5172h, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f9195b;
            AbstractC5802q.m5178E(objArr2, objArr, 0, this.f9194a, objArr2.length);
            Object[] objArr3 = this.f9195b;
            AbstractC5802q.m5178E(objArr3, objArr, objArr3.length - this.f9194a, 0, iM5172h);
        }
        int size = size();
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        C5780c c5780c = AbstractC5786f.Companion;
        int size = size();
        c5780c.getClass();
        C5780c.m5144c(i, size);
        if (i == size()) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m5173i();
        m5166b(size() + 1);
        int iM5172h = m5172h(this.f9194a + i);
        if (i < ((size() + 1) >> 1)) {
            int iM5194U = iM5172h == 0 ? AbstractC5802q.m5194U(this.f9195b) : iM5172h - 1;
            int i8 = this.f9194a;
            int iM5194U2 = i8 == 0 ? AbstractC5802q.m5194U(this.f9195b) : i8 - 1;
            int i9 = this.f9194a;
            if (iM5194U >= i9) {
                Object[] objArr = this.f9195b;
                objArr[iM5194U2] = objArr[i9];
                AbstractC5802q.m5178E(objArr, objArr, i9, i9 + 1, iM5194U + 1);
            } else {
                Object[] objArr2 = this.f9195b;
                AbstractC5802q.m5178E(objArr2, objArr2, i9 - 1, i9, objArr2.length);
                Object[] objArr3 = this.f9195b;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC5802q.m5178E(objArr3, objArr3, 0, 1, iM5194U + 1);
            }
            this.f9195b[iM5194U] = obj;
            this.f9194a = iM5194U2;
        } else {
            int iM5172h2 = m5172h(size() + this.f9194a);
            if (iM5172h < iM5172h2) {
                Object[] objArr4 = this.f9195b;
                AbstractC5802q.m5178E(objArr4, objArr4, iM5172h + 1, iM5172h, iM5172h2);
            } else {
                Object[] objArr5 = this.f9195b;
                AbstractC5802q.m5178E(objArr5, objArr5, 1, 0, iM5172h2);
                Object[] objArr6 = this.f9195b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC5802q.m5178E(objArr6, objArr6, iM5172h + 1, iM5172h, objArr6.length - 1);
            }
            this.f9195b[iM5172h] = obj;
        }
        this.f9196c = size() + 1;
    }

    public C5801p(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f9193d;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "Illegal Capacity: "));
        }
        this.f9195b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        AbstractC5830k.m5330g(elements, "elements");
        C5780c c5780c = AbstractC5786f.Companion;
        int size = size();
        c5780c.getClass();
        C5780c.m5144c(i, size);
        if (elements.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(elements);
        }
        m5173i();
        m5166b(elements.size() + size());
        int iM5172h = m5172h(size() + this.f9194a);
        int iM5172h2 = m5172h(this.f9194a + i);
        int size2 = elements.size();
        if (i < ((size() + 1) >> 1)) {
            int i8 = this.f9194a;
            int length = i8 - size2;
            if (iM5172h2 < i8) {
                Object[] objArr = this.f9195b;
                AbstractC5802q.m5178E(objArr, objArr, length, i8, objArr.length);
                if (size2 >= iM5172h2) {
                    Object[] objArr2 = this.f9195b;
                    AbstractC5802q.m5178E(objArr2, objArr2, objArr2.length - size2, 0, iM5172h2);
                } else {
                    Object[] objArr3 = this.f9195b;
                    AbstractC5802q.m5178E(objArr3, objArr3, objArr3.length - size2, 0, size2);
                    Object[] objArr4 = this.f9195b;
                    AbstractC5802q.m5178E(objArr4, objArr4, 0, size2, iM5172h2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f9195b;
                AbstractC5802q.m5178E(objArr5, objArr5, length, i8, iM5172h2);
            } else {
                Object[] objArr6 = this.f9195b;
                length += objArr6.length;
                int i9 = iM5172h2 - i8;
                int length2 = objArr6.length - length;
                if (length2 >= i9) {
                    AbstractC5802q.m5178E(objArr6, objArr6, length, i8, iM5172h2);
                } else {
                    AbstractC5802q.m5178E(objArr6, objArr6, length, i8, i8 + length2);
                    Object[] objArr7 = this.f9195b;
                    AbstractC5802q.m5178E(objArr7, objArr7, 0, this.f9194a + length2, iM5172h2);
                }
            }
            this.f9194a = length;
            m5165a(m5170f(iM5172h2 - size2), elements);
            return true;
        }
        int i10 = iM5172h2 + size2;
        if (iM5172h2 < iM5172h) {
            int i11 = size2 + iM5172h;
            Object[] objArr8 = this.f9195b;
            if (i11 <= objArr8.length) {
                AbstractC5802q.m5178E(objArr8, objArr8, i10, iM5172h2, iM5172h);
            } else if (i10 >= objArr8.length) {
                AbstractC5802q.m5178E(objArr8, objArr8, i10 - objArr8.length, iM5172h2, iM5172h);
            } else {
                int length3 = iM5172h - (i11 - objArr8.length);
                AbstractC5802q.m5178E(objArr8, objArr8, 0, length3, iM5172h);
                Object[] objArr9 = this.f9195b;
                AbstractC5802q.m5178E(objArr9, objArr9, i10, iM5172h2, length3);
            }
        } else {
            Object[] objArr10 = this.f9195b;
            AbstractC5802q.m5178E(objArr10, objArr10, size2, 0, iM5172h);
            Object[] objArr11 = this.f9195b;
            if (i10 >= objArr11.length) {
                AbstractC5802q.m5178E(objArr11, objArr11, i10 - objArr11.length, iM5172h2, objArr11.length);
            } else {
                AbstractC5802q.m5178E(objArr11, objArr11, 0, objArr11.length - size2, objArr11.length);
                Object[] objArr12 = this.f9195b;
                AbstractC5802q.m5178E(objArr12, objArr12, i10, iM5172h2, objArr12.length - size2);
            }
        }
        m5165a(iM5172h2, elements);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
