package p000a.p021e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: a.e.g */
/* loaded from: classes.dex */
public abstract class AbstractC0135g<K, V> {

    /* renamed from: a */
    public AbstractC0135g<K, V>.b f929a;

    /* renamed from: b */
    public AbstractC0135g<K, V>.c f930b;

    /* renamed from: c */
    public AbstractC0135g<K, V>.e f931c;

    /* renamed from: a.e.g$a */
    public final class a<T> implements Iterator<T> {

        /* renamed from: b */
        public final int f932b;

        /* renamed from: c */
        public int f933c;

        /* renamed from: d */
        public int f934d;

        /* renamed from: e */
        public boolean f935e = false;

        public a(int i) {
            this.f932b = i;
            this.f933c = AbstractC0135g.this.mo474d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f934d < this.f933c;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) AbstractC0135g.this.mo472b(this.f934d, this.f932b);
            this.f934d++;
            this.f935e = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f935e) {
                throw new IllegalStateException();
            }
            int i = this.f934d - 1;
            this.f934d = i;
            this.f933c--;
            this.f935e = false;
            AbstractC0135g.this.mo478h(i);
        }
    }

    /* renamed from: a.e.g$b */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iMo474d = AbstractC0135g.this.mo474d();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC0135g.this.mo477g(entry.getKey(), entry.getValue());
            }
            return iMo474d != AbstractC0135g.this.mo474d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0135g.this.mo471a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iMo475e = AbstractC0135g.this.mo475e(entry.getKey());
            if (iMo475e < 0) {
                return false;
            }
            return C0132d.m487c(AbstractC0135g.this.mo472b(iMo475e, 1), entry.getValue());
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
            return AbstractC0135g.m503j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo474d = AbstractC0135g.this.mo474d() - 1; iMo474d >= 0; iMo474d--) {
                Object objMo472b = AbstractC0135g.this.mo472b(iMo474d, 0);
                Object objMo472b2 = AbstractC0135g.this.mo472b(iMo474d, 1);
                iHashCode += (objMo472b == null ? 0 : objMo472b.hashCode()) ^ (objMo472b2 == null ? 0 : objMo472b2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0135g.this.mo474d() == 0;
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
            return AbstractC0135g.this.mo474d();
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

    /* renamed from: a.e.g$c */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0135g.this.mo471a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0135g.this.mo475e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Map<K, V> mapMo473c = AbstractC0135g.this.mo473c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!mapMo473c.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0135g.m503j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo474d = AbstractC0135g.this.mo474d() - 1; iMo474d >= 0; iMo474d--) {
                Object objMo472b = AbstractC0135g.this.mo472b(iMo474d, 0);
                iHashCode += objMo472b == null ? 0 : objMo472b.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0135g.this.mo474d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iMo475e = AbstractC0135g.this.mo475e(obj);
            if (iMo475e < 0) {
                return false;
            }
            AbstractC0135g.this.mo478h(iMo475e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Map<K, V> mapMo473c = AbstractC0135g.this.mo473c();
            int size = mapMo473c.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                mapMo473c.remove(it.next());
            }
            return size != mapMo473c.size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0135g.m504k(AbstractC0135g.this.mo473c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0135g.this.mo474d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC0135g.this.m505l(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0135g.this.m506m(tArr, 0);
        }
    }

    /* renamed from: a.e.g$d */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b */
        public int f939b;

        /* renamed from: d */
        public boolean f941d = false;

        /* renamed from: c */
        public int f940c = -1;

        public d() {
            this.f939b = AbstractC0135g.this.mo474d() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f941d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C0132d.m487c(entry.getKey(), AbstractC0135g.this.mo472b(this.f940c, 0)) && C0132d.m487c(entry.getValue(), AbstractC0135g.this.mo472b(this.f940c, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f941d) {
                return (K) AbstractC0135g.this.mo472b(this.f940c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f941d) {
                return (V) AbstractC0135g.this.mo472b(this.f940c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f940c < this.f939b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f941d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objMo472b = AbstractC0135g.this.mo472b(this.f940c, 0);
            Object objMo472b2 = AbstractC0135g.this.mo472b(this.f940c, 1);
            return (objMo472b == null ? 0 : objMo472b.hashCode()) ^ (objMo472b2 != null ? objMo472b2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f940c++;
            this.f941d = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f941d) {
                throw new IllegalStateException();
            }
            AbstractC0135g.this.mo478h(this.f940c);
            this.f940c--;
            this.f939b--;
            this.f941d = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f941d) {
                return (V) AbstractC0135g.this.mo479i(this.f940c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: a.e.g$e */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC0135g.this.mo471a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0135g.this.mo476f(obj) >= 0;
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
            return AbstractC0135g.this.mo474d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iMo476f = AbstractC0135g.this.mo476f(obj);
            if (iMo476f < 0) {
                return false;
            }
            AbstractC0135g.this.mo478h(iMo476f);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iMo474d = AbstractC0135g.this.mo474d();
            int i = 0;
            boolean z = false;
            while (i < iMo474d) {
                if (collection.contains(AbstractC0135g.this.mo472b(i, 1))) {
                    AbstractC0135g.this.mo478h(i);
                    i--;
                    iMo474d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iMo474d = AbstractC0135g.this.mo474d();
            int i = 0;
            boolean z = false;
            while (i < iMo474d) {
                if (!collection.contains(AbstractC0135g.this.mo472b(i, 1))) {
                    AbstractC0135g.this.mo478h(i);
                    i--;
                    iMo474d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC0135g.this.mo474d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC0135g.this.m505l(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0135g.this.m506m(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <T> boolean m503j(Set<T> set, Object obj) {
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

    /* renamed from: k */
    public static <K, V> boolean m504k(Map<K, V> map, Collection<?> collection) {
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
    public abstract void mo471a();

    /* renamed from: b */
    public abstract Object mo472b(int i, int i2);

    /* renamed from: c */
    public abstract Map<K, V> mo473c();

    /* renamed from: d */
    public abstract int mo474d();

    /* renamed from: e */
    public abstract int mo475e(Object obj);

    /* renamed from: f */
    public abstract int mo476f(Object obj);

    /* renamed from: g */
    public abstract void mo477g(K k, V v);

    /* renamed from: h */
    public abstract void mo478h(int i);

    /* renamed from: i */
    public abstract V mo479i(int i, V v);

    /* renamed from: l */
    public Object[] m505l(int i) {
        int iMo474d = mo474d();
        Object[] objArr = new Object[iMo474d];
        for (int i2 = 0; i2 < iMo474d; i2++) {
            objArr[i2] = mo472b(i2, i);
        }
        return objArr;
    }

    /* renamed from: m */
    public <T> T[] m506m(T[] tArr, int i) {
        int iMo474d = mo474d();
        if (tArr.length < iMo474d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iMo474d));
        }
        for (int i2 = 0; i2 < iMo474d; i2++) {
            tArr[i2] = mo472b(i2, i);
        }
        if (tArr.length > iMo474d) {
            tArr[iMo474d] = null;
        }
        return tArr;
    }
}
