package p000a.p015c.p016a.p018b;

import java.util.HashMap;
import p000a.p015c.p016a.p018b.C0125b;

/* renamed from: a.c.a.b.a */
/* loaded from: classes.dex */
public class C0124a<K, V> extends C0125b<K, V> {

    /* renamed from: f */
    public HashMap<K, C0125b.c<K, V>> f884f = new HashMap<>();

    @Override // p000a.p015c.p016a.p018b.C0125b
    /* renamed from: a */
    public C0125b.c<K, V> mo462a(K k) {
        return this.f884f.get(k);
    }

    public boolean contains(K k) {
        return this.f884f.containsKey(k);
    }

    @Override // p000a.p015c.p016a.p018b.C0125b
    /* renamed from: d */
    public V mo463d(K k, V v) {
        C0125b.c<K, V> cVar = this.f884f.get(k);
        if (cVar != null) {
            return cVar.f890c;
        }
        this.f884f.put(k, m466c(k, v));
        return null;
    }

    @Override // p000a.p015c.p016a.p018b.C0125b
    /* renamed from: e */
    public V mo464e(K k) {
        V v = (V) super.mo464e(k);
        this.f884f.remove(k);
        return v;
    }
}
