package p098i;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: i.b */
/* loaded from: classes.dex */
public class C2661b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a */
    c<K, V> f10566a;

    /* renamed from: b */
    private c<K, V> f10567b;

    /* renamed from: c */
    private WeakHashMap<f<K, V>, Boolean> f10568c = new WeakHashMap<>();

    /* renamed from: d */
    private int f10569d = 0;

    /* renamed from: i.b$a */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p098i.C2661b.e
        /* renamed from: b */
        c<K, V> mo8939b(c<K, V> cVar) {
            return cVar.f10573d;
        }

        @Override // p098i.C2661b.e
        /* renamed from: c */
        c<K, V> mo8940c(c<K, V> cVar) {
            return cVar.f10572c;
        }
    }

    /* renamed from: i.b$b */
    private static class b<K, V> extends e<K, V> {
        b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p098i.C2661b.e
        /* renamed from: b */
        c<K, V> mo8939b(c<K, V> cVar) {
            return cVar.f10572c;
        }

        @Override // p098i.C2661b.e
        /* renamed from: c */
        c<K, V> mo8940c(c<K, V> cVar) {
            return cVar.f10573d;
        }
    }

    /* renamed from: i.b$c */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        final K f10570a;

        /* renamed from: b */
        final V f10571b;

        /* renamed from: c */
        c<K, V> f10572c;

        /* renamed from: d */
        c<K, V> f10573d;

        c(K k4, V v3) {
            this.f10570a = k4;
            this.f10571b = v3;
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
            return this.f10570a.equals(cVar.f10570a) && this.f10571b.equals(cVar.f10571b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f10570a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f10571b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f10570a.hashCode() ^ this.f10571b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v3) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f10570a + "=" + this.f10571b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i.b$d */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a */
        private c<K, V> f10574a;

        /* renamed from: b */
        private boolean f10575b = true;

        d() {
        }

        @Override // p098i.C2661b.f
        /* renamed from: a */
        public void mo8941a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f10574a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f10573d;
                this.f10574a = cVar3;
                this.f10575b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f10575b) {
                this.f10575b = false;
                this.f10574a = C2661b.this.f10566a;
            } else {
                c<K, V> cVar = this.f10574a;
                this.f10574a = cVar != null ? cVar.f10572c : null;
            }
            return this.f10574a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f10575b) {
                return C2661b.this.f10566a != null;
            }
            c<K, V> cVar = this.f10574a;
            return (cVar == null || cVar.f10572c == null) ? false : true;
        }
    }

    /* renamed from: i.b$e */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a */
        c<K, V> f10577a;

        /* renamed from: b */
        c<K, V> f10578b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f10577a = cVar2;
            this.f10578b = cVar;
        }

        /* renamed from: e */
        private c<K, V> m8943e() {
            c<K, V> cVar = this.f10578b;
            c<K, V> cVar2 = this.f10577a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo8940c(cVar);
        }

        @Override // p098i.C2661b.f
        /* renamed from: a */
        public void mo8941a(c<K, V> cVar) {
            if (this.f10577a == cVar && cVar == this.f10578b) {
                this.f10578b = null;
                this.f10577a = null;
            }
            c<K, V> cVar2 = this.f10577a;
            if (cVar2 == cVar) {
                this.f10577a = mo8939b(cVar2);
            }
            if (this.f10578b == cVar) {
                this.f10578b = m8943e();
            }
        }

        /* renamed from: b */
        abstract c<K, V> mo8939b(c<K, V> cVar);

        /* renamed from: c */
        abstract c<K, V> mo8940c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f10578b;
            this.f10578b = m8943e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10578b != null;
        }
    }

    /* renamed from: i.b$f */
    interface f<K, V> {
        /* renamed from: a */
        void mo8941a(c<K, V> cVar);
    }

    /* renamed from: a */
    public Map.Entry<K, V> m8935a() {
        return this.f10566a;
    }

    /* renamed from: b */
    protected c<K, V> mo8931b(K k4) {
        c<K, V> cVar = this.f10566a;
        while (cVar != null && !cVar.f10570a.equals(k4)) {
            cVar = cVar.f10572c;
        }
        return cVar;
    }

    /* renamed from: c */
    public C2661b<K, V>.d m8936c() {
        C2661b<K, V>.d dVar = new d();
        this.f10568c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* renamed from: d */
    public Map.Entry<K, V> m8937d() {
        return this.f10567b;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.f10567b, this.f10566a);
        this.f10568c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* renamed from: e */
    protected c<K, V> m8938e(K k4, V v3) {
        c<K, V> cVar = new c<>(k4, v3);
        this.f10569d++;
        c<K, V> cVar2 = this.f10567b;
        if (cVar2 == null) {
            this.f10566a = cVar;
            this.f10567b = cVar;
            return cVar;
        }
        cVar2.f10572c = cVar;
        cVar.f10573d = cVar2;
        this.f10567b = cVar;
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2661b)) {
            return false;
        }
        C2661b c2661b = (C2661b) obj;
        if (size() != c2661b.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c2661b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* renamed from: f */
    public V mo8932f(K k4, V v3) {
        c<K, V> cVarMo8931b = mo8931b(k4);
        if (cVarMo8931b != null) {
            return cVarMo8931b.f10571b;
        }
        m8938e(k4, v3);
        return null;
    }

    /* renamed from: g */
    public V mo8933g(K k4) {
        c<K, V> cVarMo8931b = mo8931b(k4);
        if (cVarMo8931b == null) {
            return null;
        }
        this.f10569d--;
        if (!this.f10568c.isEmpty()) {
            Iterator<f<K, V>> it = this.f10568c.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo8941a(cVarMo8931b);
            }
        }
        c<K, V> cVar = cVarMo8931b.f10573d;
        if (cVar != null) {
            cVar.f10572c = cVarMo8931b.f10572c;
        } else {
            this.f10566a = cVarMo8931b.f10572c;
        }
        c<K, V> cVar2 = cVarMo8931b.f10572c;
        if (cVar2 != null) {
            cVar2.f10573d = cVar;
        } else {
            this.f10567b = cVar;
        }
        cVarMo8931b.f10572c = null;
        cVarMo8931b.f10573d = null;
        return cVarMo8931b.f10571b;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f10566a, this.f10567b);
        this.f10568c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f10569d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
