package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.collection.b */
/* loaded from: classes.dex */
public final class C0248b<E> implements Collection<E>, Set<E> {

    /* renamed from: e */
    private static final int[] f1281e = new int[0];

    /* renamed from: f */
    private static final Object[] f1282f = new Object[0];

    /* renamed from: g */
    private static Object[] f1283g;

    /* renamed from: h */
    private static int f1284h;

    /* renamed from: i */
    private static Object[] f1285i;

    /* renamed from: j */
    private static int f1286j;

    /* renamed from: a */
    private int[] f1287a;

    /* renamed from: b */
    Object[] f1288b;

    /* renamed from: c */
    int f1289c;

    /* renamed from: d */
    private AbstractC0252f<E, E> f1290d;

    /* renamed from: androidx.collection.b$a */
    class a extends AbstractC0252f<E, E> {
        a() {
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: a */
        protected void mo1086a() {
            C0248b.this.clear();
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: b */
        protected Object mo1087b(int i4, int i5) {
            return C0248b.this.f1288b[i4];
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: c */
        protected Map<E, E> mo1088c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: d */
        protected int mo1089d() {
            return C0248b.this.f1289c;
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: e */
        protected int mo1090e(Object obj) {
            return C0248b.this.indexOf(obj);
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: f */
        protected int mo1091f(Object obj) {
            return C0248b.this.indexOf(obj);
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: g */
        protected void mo1092g(E e4, E e5) {
            C0248b.this.add(e4);
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: h */
        protected void mo1093h(int i4) {
            C0248b.this.m1101g(i4);
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: i */
        protected E mo1094i(int i4, E e4) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C0248b() {
        this(0);
    }

    /* renamed from: a */
    private void m1095a(int i4) {
        if (i4 == 8) {
            synchronized (C0248b.class) {
                Object[] objArr = f1285i;
                if (objArr != null) {
                    this.f1288b = objArr;
                    f1285i = (Object[]) objArr[0];
                    this.f1287a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1286j--;
                    return;
                }
            }
        } else if (i4 == 4) {
            synchronized (C0248b.class) {
                Object[] objArr2 = f1283g;
                if (objArr2 != null) {
                    this.f1288b = objArr2;
                    f1283g = (Object[]) objArr2[0];
                    this.f1287a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1284h--;
                    return;
                }
            }
        }
        this.f1287a = new int[i4];
        this.f1288b = new Object[i4];
    }

    /* renamed from: c */
    private static void m1096c(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (C0248b.class) {
                if (f1286j < 10) {
                    objArr[0] = f1285i;
                    objArr[1] = iArr;
                    for (int i5 = i4 - 1; i5 >= 2; i5--) {
                        objArr[i5] = null;
                    }
                    f1285i = objArr;
                    f1286j++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0248b.class) {
                if (f1284h < 10) {
                    objArr[0] = f1283g;
                    objArr[1] = iArr;
                    for (int i6 = i4 - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    f1283g = objArr;
                    f1284h++;
                }
            }
        }
    }

    /* renamed from: d */
    private AbstractC0252f<E, E> m1097d() {
        if (this.f1290d == null) {
            this.f1290d = new a();
        }
        return this.f1290d;
    }

    /* renamed from: e */
    private int m1098e(Object obj, int i4) {
        int i5 = this.f1289c;
        if (i5 == 0) {
            return -1;
        }
        int iM1103a = C0249c.m1103a(this.f1287a, i5, i4);
        if (iM1103a < 0 || obj.equals(this.f1288b[iM1103a])) {
            return iM1103a;
        }
        int i6 = iM1103a + 1;
        while (i6 < i5 && this.f1287a[i6] == i4) {
            if (obj.equals(this.f1288b[i6])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iM1103a - 1; i7 >= 0 && this.f1287a[i7] == i4; i7--) {
            if (obj.equals(this.f1288b[i7])) {
                return i7;
            }
        }
        return ~i6;
    }

    /* renamed from: f */
    private int m1099f() {
        int i4 = this.f1289c;
        if (i4 == 0) {
            return -1;
        }
        int iM1103a = C0249c.m1103a(this.f1287a, i4, 0);
        if (iM1103a < 0 || this.f1288b[iM1103a] == null) {
            return iM1103a;
        }
        int i5 = iM1103a + 1;
        while (i5 < i4 && this.f1287a[i5] == 0) {
            if (this.f1288b[i5] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iM1103a - 1; i6 >= 0 && this.f1287a[i6] == 0; i6--) {
            if (this.f1288b[i6] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e4) {
        int i4;
        int iM1098e;
        if (e4 == null) {
            iM1098e = m1099f();
            i4 = 0;
        } else {
            int iHashCode = e4.hashCode();
            i4 = iHashCode;
            iM1098e = m1098e(e4, iHashCode);
        }
        if (iM1098e >= 0) {
            return false;
        }
        int i5 = ~iM1098e;
        int i6 = this.f1289c;
        int[] iArr = this.f1287a;
        if (i6 >= iArr.length) {
            int i7 = 4;
            if (i6 >= 8) {
                i7 = (i6 >> 1) + i6;
            } else if (i6 >= 4) {
                i7 = 8;
            }
            Object[] objArr = this.f1288b;
            m1095a(i7);
            int[] iArr2 = this.f1287a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1288b, 0, objArr.length);
            }
            m1096c(iArr, objArr, this.f1289c);
        }
        int i8 = this.f1289c;
        if (i5 < i8) {
            int[] iArr3 = this.f1287a;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8 - i5);
            Object[] objArr2 = this.f1288b;
            System.arraycopy(objArr2, i5, objArr2, i9, this.f1289c - i5);
        }
        this.f1287a[i5] = i4;
        this.f1288b[i5] = e4;
        this.f1289c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m1100b(this.f1289c + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* renamed from: b */
    public void m1100b(int i4) {
        int[] iArr = this.f1287a;
        if (iArr.length < i4) {
            Object[] objArr = this.f1288b;
            m1095a(i4);
            int i5 = this.f1289c;
            if (i5 > 0) {
                System.arraycopy(iArr, 0, this.f1287a, 0, i5);
                System.arraycopy(objArr, 0, this.f1288b, 0, this.f1289c);
            }
            m1096c(iArr, objArr, this.f1289c);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i4 = this.f1289c;
        if (i4 != 0) {
            m1096c(this.f1287a, this.f1288b, i4);
            this.f1287a = f1281e;
            this.f1288b = f1282f;
            this.f1289c = 0;
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

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f1289c; i4++) {
                try {
                    if (!set.contains(m1102h(i4))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public E m1101g(int i4) {
        Object[] objArr = this.f1288b;
        E e4 = (E) objArr[i4];
        int i5 = this.f1289c;
        if (i5 <= 1) {
            m1096c(this.f1287a, objArr, i5);
            this.f1287a = f1281e;
            this.f1288b = f1282f;
            this.f1289c = 0;
        } else {
            int[] iArr = this.f1287a;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                int i6 = i5 - 1;
                this.f1289c = i6;
                if (i4 < i6) {
                    int i7 = i4 + 1;
                    System.arraycopy(iArr, i7, iArr, i4, i6 - i4);
                    Object[] objArr2 = this.f1288b;
                    System.arraycopy(objArr2, i7, objArr2, i4, this.f1289c - i4);
                }
                this.f1288b[this.f1289c] = null;
            } else {
                m1095a(i5 > 8 ? i5 + (i5 >> 1) : 8);
                this.f1289c--;
                if (i4 > 0) {
                    System.arraycopy(iArr, 0, this.f1287a, 0, i4);
                    System.arraycopy(objArr, 0, this.f1288b, 0, i4);
                }
                int i8 = this.f1289c;
                if (i4 < i8) {
                    int i9 = i4 + 1;
                    System.arraycopy(iArr, i9, this.f1287a, i4, i8 - i4);
                    System.arraycopy(objArr, i9, this.f1288b, i4, this.f1289c - i4);
                }
            }
        }
        return e4;
    }

    /* renamed from: h */
    public E m1102h(int i4) {
        return (E) this.f1288b[i4];
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1287a;
        int i4 = this.f1289c;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    public int indexOf(Object obj) {
        return obj == null ? m1099f() : m1098e(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1289c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m1097d().m1134m().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m1101g(iIndexOf);
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
        boolean z3 = false;
        for (int i4 = this.f1289c - 1; i4 >= 0; i4--) {
            if (!collection.contains(this.f1288b[i4])) {
                m1101g(i4);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1289c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i4 = this.f1289c;
        Object[] objArr = new Object[i4];
        System.arraycopy(this.f1288b, 0, objArr, 0, i4);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1289c * 14);
        sb.append('{');
        for (int i4 = 0; i4 < this.f1289c; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            E eM1102h = m1102h(i4);
            if (eM1102h != this) {
                sb.append(eM1102h);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0248b(int i4) {
        if (i4 == 0) {
            this.f1287a = f1281e;
            this.f1288b = f1282f;
        } else {
            m1095a(i4);
        }
        this.f1289c = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1289c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1289c));
        }
        System.arraycopy(this.f1288b, 0, tArr, 0, this.f1289c);
        int length = tArr.length;
        int i4 = this.f1289c;
        if (length > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }
}
