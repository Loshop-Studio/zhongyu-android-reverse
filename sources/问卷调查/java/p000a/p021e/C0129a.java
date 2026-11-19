package p000a.p021e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p000a.p021e.AbstractC0135g.b;
import p000a.p021e.AbstractC0135g.c;
import p000a.p021e.AbstractC0135g.e;

/* renamed from: a.e.a */
/* loaded from: classes.dex */
public class C0129a<K, V> extends C0136h<K, V> implements Map<K, V> {

    /* renamed from: i */
    public AbstractC0135g<K, V> f901i;

    /* renamed from: a.e.a$a */
    public class a extends AbstractC0135g<K, V> {
        public a() {
        }

        @Override // p000a.p021e.AbstractC0135g
        /* renamed from: a */
        public void mo471a() {
            C0129a.this.clear();
        }

        @Override // p000a.p021e.AbstractC0135g
        /* renamed from: b */
        public Object mo472b(int i, int i2) {
            return C0129a.this.f949c[(i << 1) + i2];
        }

        @Override // p000a.p021e.AbstractC0135g
        /* renamed from: c */
        public Map<K, V> mo473c() {
            return C0129a.this;
        }

        @Override // p000a.p021e.AbstractC0135g
        /* renamed from: d */
        public int mo474d() {
            return C0129a.this.f950d;
        }

        @Override // p000a.p021e.AbstractC0135g
        /* renamed from: e */
        public int mo475e(Object obj) {
            return C0129a.this.m511e(obj);
        }

        @Override // p000a.p021e.AbstractC0135g
        /* renamed from: f */
        public int mo476f(Object obj) {
            return C0129a.this.m513g(obj);
        }

        @Override // p000a.p021e.AbstractC0135g
        /* renamed from: g */
        public void mo477g(K k, V v) {
            C0129a.this.put(k, v);
        }

        @Override // p000a.p021e.AbstractC0135g
        /* renamed from: h */
        public void mo478h(int i) {
            C0129a.this.m515i(i);
        }

        @Override // p000a.p021e.AbstractC0135g
        /* renamed from: i */
        public V mo479i(int i, V v) {
            int i2 = (i << 1) + 1;
            Object[] objArr = C0129a.this.f949c;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
    }

    public C0129a() {
    }

    public C0129a(int i) {
        super(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0129a(C0136h c0136h) {
        if (c0136h != null) {
            int i = c0136h.f950d;
            m509b(this.f950d + i);
            if (this.f950d != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(c0136h.m514h(i2), c0136h.m517k(i2));
                }
            } else if (i > 0) {
                System.arraycopy(c0136h.f948b, 0, this.f948b, 0, i);
                System.arraycopy(c0136h.f949c, 0, this.f949c, 0, i << 1);
                this.f950d = i;
            }
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        AbstractC0135g<K, V> abstractC0135gM470l = m470l();
        if (abstractC0135gM470l.f929a == null) {
            abstractC0135gM470l.f929a = abstractC0135gM470l.new b();
        }
        return abstractC0135gM470l.f929a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        AbstractC0135g<K, V> abstractC0135gM470l = m470l();
        if (abstractC0135gM470l.f930b == null) {
            abstractC0135gM470l.f930b = abstractC0135gM470l.new c();
        }
        return abstractC0135gM470l.f930b;
    }

    /* renamed from: l */
    public final AbstractC0135g<K, V> m470l() {
        if (this.f901i == null) {
            this.f901i = new a();
        }
        return this.f901i;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m509b(map.size() + this.f950d);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        AbstractC0135g<K, V> abstractC0135gM470l = m470l();
        if (abstractC0135gM470l.f931c == null) {
            abstractC0135gM470l.f931c = abstractC0135gM470l.new e();
        }
        return abstractC0135gM470l.f931c;
    }
}
