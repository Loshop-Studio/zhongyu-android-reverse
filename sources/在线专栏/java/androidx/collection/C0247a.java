package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.collection.a */
/* loaded from: classes.dex */
public class C0247a<K, V> extends C0253g<K, V> implements Map<K, V> {
    AbstractC0252f<K, V> mCollections;

    /* renamed from: androidx.collection.a$a */
    class a extends AbstractC0252f<K, V> {
        a() {
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: a */
        protected void mo1086a() {
            C0247a.this.clear();
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: b */
        protected Object mo1087b(int i4, int i5) {
            return C0247a.this.mArray[(i4 << 1) + i5];
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: c */
        protected Map<K, V> mo1088c() {
            return C0247a.this;
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: d */
        protected int mo1089d() {
            return C0247a.this.mSize;
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: e */
        protected int mo1090e(Object obj) {
            return C0247a.this.indexOfKey(obj);
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: f */
        protected int mo1091f(Object obj) {
            return C0247a.this.indexOfValue(obj);
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: g */
        protected void mo1092g(K k4, V v3) {
            C0247a.this.put(k4, v3);
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: h */
        protected void mo1093h(int i4) {
            C0247a.this.removeAt(i4);
        }

        @Override // androidx.collection.AbstractC0252f
        /* renamed from: i */
        protected V mo1094i(int i4, V v3) {
            return C0247a.this.setValueAt(i4, v3);
        }
    }

    public C0247a() {
    }

    private AbstractC0252f<K, V> getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new a();
        }
        return this.mCollections;
    }

    public boolean containsAll(Collection<?> collection) {
        return AbstractC0252f.m1129j(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return getCollection().m1133l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return getCollection().m1134m();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        ensureCapacity(this.mSize + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean removeAll(Collection<?> collection) {
        return AbstractC0252f.m1131o(this, collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return AbstractC0252f.m1132p(this, collection);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return getCollection().m1135n();
    }

    public C0247a(int i4) {
        super(i4);
    }

    public C0247a(C0253g c0253g) {
        super(c0253g);
    }
}
