package bf;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: bf.a */
/* loaded from: classes6.dex */
public abstract class AbstractC5200a implements Map {

    /* renamed from: c */
    public Map f3071c;

    public AbstractC5200a(Map map) {
        this.f3071c = map;
    }

    /* renamed from: a */
    public abstract Collection mo2763a();

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized Collection get(Object obj) {
        return (Collection) this.f3071c.get(obj);
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized Collection put(Object obj, Collection collection) {
        return (Collection) this.f3071c.put(obj, collection);
    }

    @Override // java.util.Map
    public synchronized void clear() {
        this.f3071c.clear();
    }

    @Override // java.util.Map
    public synchronized boolean containsKey(Object obj) {
        return this.f3071c.containsKey(obj);
    }

    @Override // java.util.Map
    public synchronized boolean containsValue(Object obj) {
        return this.f3071c.containsValue(obj);
    }

    /* renamed from: d */
    public synchronized int m2766d(Object obj, Object obj2) {
        Collection collectionMo2763a;
        try {
            collectionMo2763a = (Collection) this.f3071c.get(obj);
            if (collectionMo2763a == null) {
                collectionMo2763a = mo2763a();
                this.f3071c.put(obj, collectionMo2763a);
            }
            collectionMo2763a.add(obj2);
        } catch (Throwable th) {
            throw th;
        }
        return collectionMo2763a.size();
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Collection remove(Object obj) {
        return (Collection) this.f3071c.remove(obj);
    }

    @Override // java.util.Map
    public synchronized Set entrySet() {
        return this.f3071c.entrySet();
    }

    @Override // java.util.Map
    public synchronized boolean equals(Object obj) {
        return this.f3071c.equals(obj);
    }

    @Override // java.util.Map
    public synchronized int hashCode() {
        return this.f3071c.hashCode();
    }

    @Override // java.util.Map
    public synchronized boolean isEmpty() {
        return this.f3071c.isEmpty();
    }

    @Override // java.util.Map
    public synchronized Set keySet() {
        return this.f3071c.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        this.f3071c.putAll(map);
    }

    @Override // java.util.Map
    public synchronized int size() {
        return this.f3071c.size();
    }

    @Override // java.util.Map
    public synchronized Collection values() {
        return this.f3071c.values();
    }
}
