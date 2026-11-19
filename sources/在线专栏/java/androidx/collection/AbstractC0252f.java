package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: androidx.collection.f */
/* loaded from: classes.dex */
abstract class AbstractC0252f<K, V> {

    /* renamed from: a */
    AbstractC0252f<K, V>.b f1308a;

    /* renamed from: b */
    AbstractC0252f<K, V>.c f1309b;

    /* renamed from: c */
    AbstractC0252f<K, V>.e f1310c;

    /* renamed from: androidx.collection.f$a */
    final class a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f1311a;

        /* renamed from: b */
        int f1312b;

        /* renamed from: c */
        int f1313c;

        /* renamed from: d */
        boolean f1314d = false;

        a(int i4) {
            this.f1311a = i4;
            this.f1312b = AbstractC0252f.this.mo1089d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1313c < this.f1312b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t3 = (T) AbstractC0252f.this.mo1087b(this.f1313c, this.f1311a);
            this.f1313c++;
            this.f1314d = true;
            return t3;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1314d) {
                throw new IllegalStateException();
            }
            int i4 = this.f1313c - 1;
            this.f1313c = i4;
            this.f1312b--;
            this.f1314d = false;
            AbstractC0252f.this.mo1093h(i4);
        }
    }

    /* renamed from: androidx.collection.f$b */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iMo1089d = AbstractC0252f.this.mo1089d();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC0252f.this.mo1092g(entry.getKey(), entry.getValue());
            }
            return iMo1089d != AbstractC0252f.this.mo1089d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0252f.this.mo1086a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iMo1090e = AbstractC0252f.this.mo1090e(entry.getKey());
            if (iMo1090e < 0) {
                return false;
            }
            return C0249c.m1105c(AbstractC0252f.this.mo1087b(iMo1090e, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0252f.m1130k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo1089d = AbstractC0252f.this.mo1089d() - 1; iMo1089d >= 0; iMo1089d--) {
                Object objMo1087b = AbstractC0252f.this.mo1087b(iMo1089d, 0);
                Object objMo1087b2 = AbstractC0252f.this.mo1087b(iMo1089d, 1);
                iHashCode += (objMo1087b == null ? 0 : objMo1087b.hashCode()) ^ (objMo1087b2 == null ? 0 : objMo1087b2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0252f.this.mo1089d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0252f.this.mo1089d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.collection.f$c */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k4) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0252f.this.mo1086a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0252f.this.mo1090e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC0252f.m1129j(AbstractC0252f.this.mo1088c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0252f.m1130k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo1089d = AbstractC0252f.this.mo1089d() - 1; iMo1089d >= 0; iMo1089d--) {
                Object objMo1087b = AbstractC0252f.this.mo1087b(iMo1089d, 0);
                iHashCode += objMo1087b == null ? 0 : objMo1087b.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0252f.this.mo1089d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iMo1090e = AbstractC0252f.this.mo1090e(obj);
            if (iMo1090e < 0) {
                return false;
            }
            AbstractC0252f.this.mo1093h(iMo1090e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC0252f.m1131o(AbstractC0252f.this.mo1088c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0252f.m1132p(AbstractC0252f.this.mo1088c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0252f.this.mo1089d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC0252f.this.m1136q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0252f.this.m1137r(tArr, 0);
        }
    }

    /* renamed from: androidx.collection.f$d */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        int f1318a;

        /* renamed from: c */
        boolean f1320c = false;

        /* renamed from: b */
        int f1319b = -1;

        d() {
            this.f1318a = AbstractC0252f.this.mo1089d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f1319b++;
            this.f1320c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f1320c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C0249c.m1105c(entry.getKey(), AbstractC0252f.this.mo1087b(this.f1319b, 0)) && C0249c.m1105c(entry.getValue(), AbstractC0252f.this.mo1087b(this.f1319b, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f1320c) {
                return (K) AbstractC0252f.this.mo1087b(this.f1319b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f1320c) {
                return (V) AbstractC0252f.this.mo1087b(this.f1319b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1319b < this.f1318a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f1320c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objMo1087b = AbstractC0252f.this.mo1087b(this.f1319b, 0);
            Object objMo1087b2 = AbstractC0252f.this.mo1087b(this.f1319b, 1);
            return (objMo1087b == null ? 0 : objMo1087b.hashCode()) ^ (objMo1087b2 != null ? objMo1087b2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1320c) {
                throw new IllegalStateException();
            }
            AbstractC0252f.this.mo1093h(this.f1319b);
            this.f1319b--;
            this.f1318a--;
            this.f1320c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v3) {
            if (this.f1320c) {
                return (V) AbstractC0252f.this.mo1094i(this.f1319b, v3);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: androidx.collection.f$e */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v3) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC0252f.this.mo1086a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0252f.this.mo1091f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC0252f.this.mo1089d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iMo1091f = AbstractC0252f.this.mo1091f(obj);
            if (iMo1091f < 0) {
                return false;
            }
            AbstractC0252f.this.mo1093h(iMo1091f);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iMo1089d = AbstractC0252f.this.mo1089d();
            int i4 = 0;
            boolean z3 = false;
            while (i4 < iMo1089d) {
                if (collection.contains(AbstractC0252f.this.mo1087b(i4, 1))) {
                    AbstractC0252f.this.mo1093h(i4);
                    i4--;
                    iMo1089d--;
                    z3 = true;
                }
                i4++;
            }
            return z3;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iMo1089d = AbstractC0252f.this.mo1089d();
            int i4 = 0;
            boolean z3 = false;
            while (i4 < iMo1089d) {
                if (!collection.contains(AbstractC0252f.this.mo1087b(i4, 1))) {
                    AbstractC0252f.this.mo1093h(i4);
                    i4--;
                    iMo1089d--;
                    z3 = true;
                }
                i4++;
            }
            return z3;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC0252f.this.mo1089d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC0252f.this.m1136q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0252f.this.m1137r(tArr, 1);
        }
    }

    AbstractC0252f() {
    }

    /* renamed from: j */
    public static <K, V> boolean m1129j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m1130k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m1131o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m1132p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    protected abstract void mo1086a();

    /* renamed from: b */
    protected abstract Object mo1087b(int i4, int i5);

    /* renamed from: c */
    protected abstract Map<K, V> mo1088c();

    /* renamed from: d */
    protected abstract int mo1089d();

    /* renamed from: e */
    protected abstract int mo1090e(Object obj);

    /* renamed from: f */
    protected abstract int mo1091f(Object obj);

    /* renamed from: g */
    protected abstract void mo1092g(K k4, V v3);

    /* renamed from: h */
    protected abstract void mo1093h(int i4);

    /* renamed from: i */
    protected abstract V mo1094i(int i4, V v3);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> m1133l() {
        if (this.f1308a == null) {
            this.f1308a = new b();
        }
        return this.f1308a;
    }

    /* renamed from: m */
    public Set<K> m1134m() {
        if (this.f1309b == null) {
            this.f1309b = new c();
        }
        return this.f1309b;
    }

    /* renamed from: n */
    public Collection<V> m1135n() {
        if (this.f1310c == null) {
            this.f1310c = new e();
        }
        return this.f1310c;
    }

    /* renamed from: q */
    public Object[] m1136q(int i4) {
        int iMo1089d = mo1089d();
        Object[] objArr = new Object[iMo1089d];
        for (int i5 = 0; i5 < iMo1089d; i5++) {
            objArr[i5] = mo1087b(i5, i4);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] m1137r(T[] tArr, int i4) {
        int iMo1089d = mo1089d();
        if (tArr.length < iMo1089d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iMo1089d));
        }
        for (int i5 = 0; i5 < iMo1089d; i5++) {
            tArr[i5] = mo1087b(i5, i4);
        }
        if (tArr.length > iMo1089d) {
            tArr[iMo1089d] = null;
        }
        return tArr;
    }
}
