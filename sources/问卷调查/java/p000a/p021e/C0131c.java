package p000a.p021e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p000a.p021e.AbstractC0135g;

/* renamed from: a.e.c */
/* loaded from: classes.dex */
public final class C0131c<E> implements Collection<E>, Set<E> {

    /* renamed from: f */
    public static final int[] f904f = new int[0];

    /* renamed from: g */
    public static final Object[] f905g = new Object[0];

    /* renamed from: h */
    public static Object[] f906h;

    /* renamed from: i */
    public static int f907i;

    /* renamed from: j */
    public static Object[] f908j;

    /* renamed from: k */
    public static int f909k;

    /* renamed from: b */
    public int[] f910b = f904f;

    /* renamed from: c */
    public Object[] f911c = f905g;

    /* renamed from: d */
    public int f912d = 0;

    /* renamed from: e */
    public AbstractC0135g<E, E> f913e;

    /* renamed from: b */
    public static void m480b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0131c.class) {
                if (f909k < 10) {
                    objArr[0] = f908j;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f908j = objArr;
                    f909k++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0131c.class) {
                if (f907i < 10) {
                    objArr[0] = f906h;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f906h = objArr;
                    f907i++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m481a(int i) {
        if (i == 8) {
            synchronized (C0131c.class) {
                Object[] objArr = f908j;
                if (objArr != null) {
                    this.f911c = objArr;
                    f908j = (Object[]) objArr[0];
                    this.f910b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f909k--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0131c.class) {
                Object[] objArr2 = f906h;
                if (objArr2 != null) {
                    this.f911c = objArr2;
                    f906h = (Object[]) objArr2[0];
                    this.f910b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f907i--;
                    return;
                }
            }
        }
        this.f910b = new int[i];
        this.f911c = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i;
        int iM482c;
        if (e2 == null) {
            iM482c = m483d();
            i = 0;
        } else {
            int iHashCode = e2.hashCode();
            i = iHashCode;
            iM482c = m482c(e2, iHashCode);
        }
        if (iM482c >= 0) {
            return false;
        }
        int i2 = ~iM482c;
        int i3 = this.f912d;
        int[] iArr = this.f910b;
        if (i3 >= iArr.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.f911c;
            m481a(i4);
            int[] iArr2 = this.f910b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f911c, 0, objArr.length);
            }
            m480b(iArr, objArr, this.f912d);
        }
        int i5 = this.f912d;
        if (i2 < i5) {
            int[] iArr3 = this.f910b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f911c;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f912d - i2);
        }
        this.f910b[i2] = i;
        this.f911c[i2] = e2;
        this.f912d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f912d;
        int[] iArr = this.f910b;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f911c;
            m481a(size);
            int i = this.f912d;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f910b, 0, i);
                System.arraycopy(objArr, 0, this.f911c, 0, this.f912d);
            }
            m480b(iArr, objArr, this.f912d);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* renamed from: c */
    public final int m482c(Object obj, int i) {
        int i2 = this.f912d;
        if (i2 == 0) {
            return -1;
        }
        int iM485a = C0132d.m485a(this.f910b, i2, i);
        if (iM485a < 0 || obj.equals(this.f911c[iM485a])) {
            return iM485a;
        }
        int i3 = iM485a + 1;
        while (i3 < i2 && this.f910b[i3] == i) {
            if (obj.equals(this.f911c[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM485a - 1; i4 >= 0 && this.f910b[i4] == i; i4--) {
            if (obj.equals(this.f911c[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f912d;
        if (i != 0) {
            m480b(this.f910b, this.f911c, i);
            this.f910b = f904f;
            this.f911c = f905g;
            this.f912d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final int m483d() {
        int i = this.f912d;
        if (i == 0) {
            return -1;
        }
        int iM485a = C0132d.m485a(this.f910b, i, 0);
        if (iM485a < 0 || this.f911c[iM485a] == null) {
            return iM485a;
        }
        int i2 = iM485a + 1;
        while (i2 < i && this.f910b[i2] == 0) {
            if (this.f911c[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM485a - 1; i3 >= 0 && this.f910b[i3] == 0; i3--) {
            if (this.f911c[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* renamed from: e */
    public E m484e(int i) {
        Object[] objArr = this.f911c;
        E e2 = (E) objArr[i];
        int i2 = this.f912d;
        if (i2 <= 1) {
            m480b(this.f910b, objArr, i2);
            this.f910b = f904f;
            this.f911c = f905g;
            this.f912d = 0;
        } else {
            int[] iArr = this.f910b;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = i2 - 1;
                this.f912d = i3;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, iArr, i, i3 - i);
                    Object[] objArr2 = this.f911c;
                    System.arraycopy(objArr2, i4, objArr2, i, this.f912d - i);
                }
                this.f911c[this.f912d] = null;
            } else {
                m481a(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.f912d--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f910b, 0, i);
                    System.arraycopy(objArr, 0, this.f911c, 0, i);
                }
                int i5 = this.f912d;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, this.f910b, i, i5 - i);
                    System.arraycopy(objArr, i6, this.f911c, i, this.f912d - i);
                }
            }
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f912d != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f912d; i++) {
                try {
                    if (!set.contains(this.f911c[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f910b;
        int i = this.f912d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m483d() : m482c(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f912d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        if (this.f913e == null) {
            this.f913e = new C0130b(this);
        }
        AbstractC0135g<E, E> abstractC0135g = this.f913e;
        if (abstractC0135g.f930b == null) {
            abstractC0135g.f930b = new AbstractC0135g.c();
        }
        return abstractC0135g.f930b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m484e(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f912d - 1; i >= 0; i--) {
            if (!collection.contains(this.f911c[i])) {
                m484e(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f912d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f912d;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f911c, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f912d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f912d));
        }
        System.arraycopy(this.f911c, 0, tArr, 0, this.f912d);
        int length = tArr.length;
        int i = this.f912d;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f912d * 14);
        sb.append('{');
        for (int i = 0; i < this.f912d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f911c[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
