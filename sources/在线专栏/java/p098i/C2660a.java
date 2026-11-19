package p098i;

import java.util.HashMap;
import java.util.Map;
import p098i.C2661b;

/* renamed from: i.a */
/* loaded from: classes.dex */
public class C2660a<K, V> extends C2661b<K, V> {

    /* renamed from: e */
    private HashMap<K, C2661b.c<K, V>> f10565e = new HashMap<>();

    @Override // p098i.C2661b
    /* renamed from: b */
    protected C2661b.c<K, V> mo8931b(K k4) {
        return this.f10565e.get(k4);
    }

    public boolean contains(K k4) {
        return this.f10565e.containsKey(k4);
    }

    @Override // p098i.C2661b
    /* renamed from: f */
    public V mo8932f(K k4, V v3) {
        C2661b.c<K, V> cVarMo8931b = mo8931b(k4);
        if (cVarMo8931b != null) {
            return cVarMo8931b.f10571b;
        }
        this.f10565e.put(k4, m8938e(k4, v3));
        return null;
    }

    @Override // p098i.C2661b
    /* renamed from: g */
    public V mo8933g(K k4) {
        V v3 = (V) super.mo8933g(k4);
        this.f10565e.remove(k4);
        return v3;
    }

    /* renamed from: h */
    public Map.Entry<K, V> m8934h(K k4) {
        if (contains(k4)) {
            return this.f10565e.get(k4).f10573d;
        }
        return null;
    }
}
