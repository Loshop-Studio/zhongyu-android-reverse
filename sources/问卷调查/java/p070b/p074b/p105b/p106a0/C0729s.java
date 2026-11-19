package p070b.p074b.p105b.p106a0;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: b.b.b.a0.s */
/* loaded from: classes.dex */
public final class C0729s<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i */
    public static final Comparator<Comparable> f4235i = new a();

    /* renamed from: b */
    public Comparator<? super K> f4236b;

    /* renamed from: c */
    public e<K, V> f4237c;

    /* renamed from: d */
    public int f4238d;

    /* renamed from: e */
    public int f4239e;

    /* renamed from: f */
    public final e<K, V> f4240f;

    /* renamed from: g */
    public C0729s<K, V>.b f4241g;

    /* renamed from: h */
    public C0729s<K, V>.c f4242h;

    /* renamed from: b.b.b.a0.s$a */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: b.b.b.a0.s$b */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: b.b.b.a0.s$b$a */
        public class a extends C0729s<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return m2380a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0729s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C0729s.this.m2373b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarM2373b;
            if (!(obj instanceof Map.Entry) || (eVarM2373b = C0729s.this.m2373b((Map.Entry) obj)) == null) {
                return false;
            }
            C0729s.this.m2376e(eVarM2373b, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C0729s.this.f4238d;
        }
    }

    /* renamed from: b.b.b.a0.s$c */
    public final class c extends AbstractSet<K> {

        /* renamed from: b.b.b.a0.s$c$a */
        public class a extends C0729s<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m2380a().f4254g;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0729s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C0729s.this.m2374c(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C0729s c0729s = C0729s.this;
            e<K, V> eVarM2374c = c0729s.m2374c(obj);
            if (eVarM2374c != null) {
                c0729s.m2376e(eVarM2374c, true);
            }
            return eVarM2374c != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C0729s.this.f4238d;
        }
    }

    /* renamed from: b.b.b.a0.s$d */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: b */
        public e<K, V> f4245b;

        /* renamed from: c */
        public e<K, V> f4246c = null;

        /* renamed from: d */
        public int f4247d;

        public d() {
            this.f4245b = C0729s.this.f4240f.f4252e;
            this.f4247d = C0729s.this.f4239e;
        }

        /* renamed from: a */
        public final e<K, V> m2380a() {
            e<K, V> eVar = this.f4245b;
            C0729s c0729s = C0729s.this;
            if (eVar == c0729s.f4240f) {
                throw new NoSuchElementException();
            }
            if (c0729s.f4239e != this.f4247d) {
                throw new ConcurrentModificationException();
            }
            this.f4245b = eVar.f4252e;
            this.f4246c = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f4245b != C0729s.this.f4240f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f4246c;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            C0729s.this.m2376e(eVar, true);
            this.f4246c = null;
            this.f4247d = C0729s.this.f4239e;
        }
    }

    /* renamed from: b.b.b.a0.s$e */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public e<K, V> f4249b;

        /* renamed from: c */
        public e<K, V> f4250c;

        /* renamed from: d */
        public e<K, V> f4251d;

        /* renamed from: e */
        public e<K, V> f4252e;

        /* renamed from: f */
        public e<K, V> f4253f;

        /* renamed from: g */
        public final K f4254g;

        /* renamed from: h */
        public V f4255h;

        /* renamed from: i */
        public int f4256i;

        public e() {
            this.f4254g = null;
            this.f4253f = this;
            this.f4252e = this;
        }

        public e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.f4249b = eVar;
            this.f4254g = k;
            this.f4256i = 1;
            this.f4252e = eVar2;
            this.f4253f = eVar3;
            eVar3.f4252e = this;
            eVar2.f4253f = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f4254g;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f4255h;
            Object value = entry.getValue();
            if (v == null) {
                if (value != null) {
                    return false;
                }
            } else if (!v.equals(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f4254g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f4255h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f4254g;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.f4255h;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f4255h;
            this.f4255h = v;
            return v2;
        }

        public String toString() {
            return this.f4254g + "=" + this.f4255h;
        }
    }

    public C0729s() {
        Comparator<Comparable> comparator = f4235i;
        this.f4238d = 0;
        this.f4239e = 0;
        this.f4240f = new e<>();
        this.f4236b = comparator;
    }

    /* renamed from: a */
    public e<K, V> m2372a(K k, boolean z) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<Comparable> comparator = f4235i;
        Comparator<? super K> comparator2 = this.f4236b;
        e<K, V> eVar2 = this.f4237c;
        if (eVar2 != null) {
            Comparable comparable = comparator2 == comparator ? (Comparable) k : null;
            while (true) {
                K k2 = eVar2.f4254g;
                iCompareTo = comparable != null ? comparable.compareTo(k2) : comparator2.compare(k, k2);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f4250c : eVar2.f4251d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f4240f;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k, eVar4, eVar4.f4253f);
            if (iCompareTo < 0) {
                eVar2.f4250c = eVar;
            } else {
                eVar2.f4251d = eVar;
            }
            m2375d(eVar2, true);
        } else {
            if (comparator2 == comparator && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k, eVar4, eVar4.f4253f);
            this.f4237c = eVar;
        }
        this.f4238d++;
        this.f4239e++;
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p070b.p074b.p105b.p106a0.C0729s.e<K, V> m2373b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            b.b.b.a0.s$e r0 = r4.m2374c(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            V r3 = r0.f4255h
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L1f
            if (r3 == 0) goto L1d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L1d
            goto L1f
        L1d:
            r5 = r2
            goto L20
        L1f:
            r5 = r1
        L20:
            if (r5 == 0) goto L23
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p074b.p105b.p106a0.C0729s.m2373b(java.util.Map$Entry):b.b.b.a0.s$e");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public e<K, V> m2374c(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return m2372a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f4237c = null;
        this.f4238d = 0;
        this.f4239e++;
        e<K, V> eVar = this.f4240f;
        eVar.f4253f = eVar;
        eVar.f4252e = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m2374c(obj) != null;
    }

    /* renamed from: d */
    public final void m2375d(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f4250c;
            e<K, V> eVar3 = eVar.f4251d;
            int i = eVar2 != null ? eVar2.f4256i : 0;
            int i2 = eVar3 != null ? eVar3.f4256i : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                e<K, V> eVar4 = eVar3.f4250c;
                e<K, V> eVar5 = eVar3.f4251d;
                int i4 = (eVar4 != null ? eVar4.f4256i : 0) - (eVar5 != null ? eVar5.f4256i : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    m2379h(eVar3);
                }
                m2378g(eVar);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                e<K, V> eVar6 = eVar2.f4250c;
                e<K, V> eVar7 = eVar2.f4251d;
                int i5 = (eVar6 != null ? eVar6.f4256i : 0) - (eVar7 != null ? eVar7.f4256i : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    m2378g(eVar2);
                }
                m2379h(eVar);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                eVar.f4256i = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f4256i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f4249b;
        }
    }

    /* renamed from: e */
    public void m2376e(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i;
        if (z) {
            e<K, V> eVar4 = eVar.f4253f;
            eVar4.f4252e = eVar.f4252e;
            eVar.f4252e.f4253f = eVar4;
        }
        e<K, V> eVar5 = eVar.f4250c;
        e<K, V> eVar6 = eVar.f4251d;
        e<K, V> eVar7 = eVar.f4249b;
        int i2 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                m2377f(eVar, eVar5);
                eVar.f4250c = null;
            } else if (eVar6 != null) {
                m2377f(eVar, eVar6);
                eVar.f4251d = null;
            } else {
                m2377f(eVar, null);
            }
            m2375d(eVar7, false);
            this.f4238d--;
            this.f4239e++;
            return;
        }
        if (eVar5.f4256i > eVar6.f4256i) {
            do {
                eVar3 = eVar5;
                eVar5 = eVar5.f4251d;
            } while (eVar5 != null);
        } else {
            do {
                eVar2 = eVar6;
                eVar6 = eVar6.f4250c;
            } while (eVar6 != null);
            eVar3 = eVar2;
        }
        m2376e(eVar3, false);
        e<K, V> eVar8 = eVar.f4250c;
        if (eVar8 != null) {
            i = eVar8.f4256i;
            eVar3.f4250c = eVar8;
            eVar8.f4249b = eVar3;
            eVar.f4250c = null;
        } else {
            i = 0;
        }
        e<K, V> eVar9 = eVar.f4251d;
        if (eVar9 != null) {
            i2 = eVar9.f4256i;
            eVar3.f4251d = eVar9;
            eVar9.f4249b = eVar3;
            eVar.f4251d = null;
        }
        eVar3.f4256i = Math.max(i, i2) + 1;
        m2377f(eVar, eVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C0729s<K, V>.b bVar = this.f4241g;
        if (bVar != null) {
            return bVar;
        }
        C0729s<K, V>.b bVar2 = new b();
        this.f4241g = bVar2;
        return bVar2;
    }

    /* renamed from: f */
    public final void m2377f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f4249b;
        eVar.f4249b = null;
        if (eVar2 != null) {
            eVar2.f4249b = eVar3;
        }
        if (eVar3 == null) {
            this.f4237c = eVar2;
        } else if (eVar3.f4250c == eVar) {
            eVar3.f4250c = eVar2;
        } else {
            eVar3.f4251d = eVar2;
        }
    }

    /* renamed from: g */
    public final void m2378g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f4250c;
        e<K, V> eVar3 = eVar.f4251d;
        e<K, V> eVar4 = eVar3.f4250c;
        e<K, V> eVar5 = eVar3.f4251d;
        eVar.f4251d = eVar4;
        if (eVar4 != null) {
            eVar4.f4249b = eVar;
        }
        m2377f(eVar, eVar3);
        eVar3.f4250c = eVar;
        eVar.f4249b = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f4256i : 0, eVar4 != null ? eVar4.f4256i : 0) + 1;
        eVar.f4256i = iMax;
        eVar3.f4256i = Math.max(iMax, eVar5 != null ? eVar5.f4256i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarM2374c = m2374c(obj);
        if (eVarM2374c != null) {
            return eVarM2374c.f4255h;
        }
        return null;
    }

    /* renamed from: h */
    public final void m2379h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f4250c;
        e<K, V> eVar3 = eVar.f4251d;
        e<K, V> eVar4 = eVar2.f4250c;
        e<K, V> eVar5 = eVar2.f4251d;
        eVar.f4250c = eVar5;
        if (eVar5 != null) {
            eVar5.f4249b = eVar;
        }
        m2377f(eVar, eVar2);
        eVar2.f4251d = eVar;
        eVar.f4249b = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f4256i : 0, eVar5 != null ? eVar5.f4256i : 0) + 1;
        eVar.f4256i = iMax;
        eVar2.f4256i = Math.max(iMax, eVar4 != null ? eVar4.f4256i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C0729s<K, V>.c cVar = this.f4242h;
        if (cVar != null) {
            return cVar;
        }
        C0729s<K, V>.c cVar2 = new c();
        this.f4242h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        e<K, V> eVarM2372a = m2372a(k, true);
        V v2 = eVarM2372a.f4255h;
        eVarM2372a.f4255h = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarM2374c = m2374c(obj);
        if (eVarM2374c != null) {
            m2376e(eVarM2374c, true);
        }
        if (eVarM2374c != null) {
            return eVarM2374c.f4255h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f4238d;
    }
}
