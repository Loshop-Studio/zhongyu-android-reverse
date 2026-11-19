package p000a.p015c.p016a.p018b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.c.a.b.b */
/* loaded from: classes.dex */
public class C0125b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    public c<K, V> f885b;

    /* renamed from: c */
    public c<K, V> f886c;

    /* renamed from: d */
    public WeakHashMap<f<K, V>, Boolean> f887d = new WeakHashMap<>();

    /* renamed from: e */
    public int f888e = 0;

    /* renamed from: a.c.a.b.b$a */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p000a.p015c.p016a.p018b.C0125b.e
        /* renamed from: b */
        public c<K, V> mo467b(c<K, V> cVar) {
            return cVar.f892e;
        }

        @Override // p000a.p015c.p016a.p018b.C0125b.e
        /* renamed from: c */
        public c<K, V> mo468c(c<K, V> cVar) {
            return cVar.f891d;
        }
    }

    /* renamed from: a.c.a.b.b$b */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p000a.p015c.p016a.p018b.C0125b.e
        /* renamed from: b */
        public c<K, V> mo467b(c<K, V> cVar) {
            return cVar.f891d;
        }

        @Override // p000a.p015c.p016a.p018b.C0125b.e
        /* renamed from: c */
        public c<K, V> mo468c(c<K, V> cVar) {
            return cVar.f892e;
        }
    }

    /* renamed from: a.c.a.b.b$c */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public final K f889b;

        /* renamed from: c */
        public final V f890c;

        /* renamed from: d */
        public c<K, V> f891d;

        /* renamed from: e */
        public c<K, V> f892e;

        public c(K k, V v) {
            this.f889b = k;
            this.f890c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f889b.equals(cVar.f889b) && this.f890c.equals(cVar.f890c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f889b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f890c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f889b.hashCode() ^ this.f890c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f889b + "=" + this.f890c;
        }
    }

    /* renamed from: a.c.a.b.b$d */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b */
        public c<K, V> f893b;

        /* renamed from: c */
        public boolean f894c = true;

        public d() {
        }

        @Override // p000a.p015c.p016a.p018b.C0125b.f
        /* renamed from: a */
        public void mo469a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f893b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f892e;
                this.f893b = cVar3;
                this.f894c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f894c) {
                return C0125b.this.f885b != null;
            }
            c<K, V> cVar = this.f893b;
            return (cVar == null || cVar.f891d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar;
            if (this.f894c) {
                this.f894c = false;
                cVar = C0125b.this.f885b;
            } else {
                c<K, V> cVar2 = this.f893b;
                cVar = cVar2 != null ? cVar2.f891d : null;
            }
            this.f893b = cVar;
            return cVar;
        }
    }

    /* renamed from: a.c.a.b.b$e */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b */
        public c<K, V> f896b;

        /* renamed from: c */
        public c<K, V> f897c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f896b = cVar2;
            this.f897c = cVar;
        }

        @Override // p000a.p015c.p016a.p018b.C0125b.f
        /* renamed from: a */
        public void mo469a(c<K, V> cVar) {
            c<K, V> cVarMo468c = null;
            if (this.f896b == cVar && cVar == this.f897c) {
                this.f897c = null;
                this.f896b = null;
            }
            c<K, V> cVar2 = this.f896b;
            if (cVar2 == cVar) {
                this.f896b = mo467b(cVar2);
            }
            c<K, V> cVar3 = this.f897c;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.f896b;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarMo468c = mo468c(cVar3);
                }
                this.f897c = cVarMo468c;
            }
        }

        /* renamed from: b */
        public abstract c<K, V> mo467b(c<K, V> cVar);

        /* renamed from: c */
        public abstract c<K, V> mo468c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f897c != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar = this.f897c;
            c<K, V> cVar2 = this.f896b;
            this.f897c = (cVar == cVar2 || cVar2 == null) ? null : mo468c(cVar);
            return cVar;
        }
    }

    /* renamed from: a.c.a.b.b$f */
    public interface f<K, V> {
        /* renamed from: a */
        void mo469a(c<K, V> cVar);
    }

    /* renamed from: a */
    public c<K, V> mo462a(K k) {
        c<K, V> cVar = this.f885b;
        while (cVar != null && !cVar.f889b.equals(k)) {
            cVar = cVar.f891d;
        }
        return cVar;
    }

    /* renamed from: b */
    public C0125b<K, V>.d m465b() {
        C0125b<K, V>.d dVar = new d();
        this.f887d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* renamed from: c */
    public c<K, V> m466c(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f888e++;
        c<K, V> cVar2 = this.f886c;
        if (cVar2 == null) {
            this.f885b = cVar;
        } else {
            cVar2.f891d = cVar;
            cVar.f892e = cVar2;
        }
        this.f886c = cVar;
        return cVar;
    }

    /* renamed from: d */
    public V mo463d(K k, V v) {
        c<K, V> cVarMo462a = mo462a(k);
        if (cVarMo462a != null) {
            return cVarMo462a.f890c;
        }
        m466c(k, v);
        return null;
    }

    /* renamed from: e */
    public V mo464e(K k) {
        c<K, V> cVarMo462a = mo462a(k);
        if (cVarMo462a == null) {
            return null;
        }
        this.f888e--;
        if (!this.f887d.isEmpty()) {
            Iterator<f<K, V>> it = this.f887d.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo469a(cVarMo462a);
            }
        }
        c<K, V> cVar = cVarMo462a.f892e;
        c<K, V> cVar2 = cVarMo462a.f891d;
        if (cVar != null) {
            cVar.f891d = cVar2;
        } else {
            this.f885b = cVar2;
        }
        c<K, V> cVar3 = cVarMo462a.f891d;
        if (cVar3 != null) {
            cVar3.f892e = cVar;
        } else {
            this.f886c = cVar;
        }
        cVarMo462a.f891d = null;
        cVarMo462a.f892e = null;
        return cVarMo462a.f890c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((p000a.p015c.p016a.p018b.C0125b.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p000a.p015c.p016a.p018b.C0125b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.c.a.b.b r7 = (p000a.p015c.p016a.p018b.C0125b) r7
            int r1 = r6.f888e
            int r3 = r7.f888e
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            a.c.a.b.b$e r3 = (p000a.p015c.p016a.p018b.C0125b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            a.c.a.b.b$e r4 = (p000a.p015c.p016a.p018b.C0125b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            a.c.a.b.b$e r7 = (p000a.p015c.p016a.p018b.C0125b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p015c.p016a.p018b.C0125b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f885b, this.f886c);
        this.f887d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sbM2079g.append("]");
                return sbM2079g.toString();
            }
            sbM2079g.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sbM2079g.append(", ");
            }
        }
    }
}
