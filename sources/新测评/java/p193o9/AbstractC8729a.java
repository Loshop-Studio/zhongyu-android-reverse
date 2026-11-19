package p193o9;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o9.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8729a implements Map {

    /* renamed from: a */
    public Map f14510a;

    public AbstractC8729a(Map map) {
        this.f14510a = map;
    }

    /* renamed from: a */
    public abstract Collection mo14368a();

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized Collection get(Object obj) {
        return (Collection) this.f14510a.get(obj);
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized Collection put(Object obj, Collection collection) {
        return (Collection) this.f14510a.put(obj, collection);
    }

    @Override // java.util.Map
    public synchronized void clear() {
        this.f14510a.clear();
    }

    @Override // java.util.Map
    public synchronized boolean containsKey(Object obj) {
        return this.f14510a.containsKey(obj);
    }

    @Override // java.util.Map
    public synchronized boolean containsValue(Object obj) {
        return this.f14510a.containsValue(obj);
    }

    /* renamed from: d */
    public synchronized int m14371d(Object obj, Object obj2) {
        Collection collectionMo14368a;
        try {
            collectionMo14368a = (Collection) this.f14510a.get(obj);
            if (collectionMo14368a == null) {
                collectionMo14368a = mo14368a();
                this.f14510a.put(obj, collectionMo14368a);
            }
            collectionMo14368a.add(obj2);
        } catch (Throwable th) {
            throw th;
        }
        return collectionMo14368a.size();
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Collection remove(Object obj) {
        return (Collection) this.f14510a.remove(obj);
    }

    @Override // java.util.Map
    public synchronized Set entrySet() {
        return this.f14510a.entrySet();
    }

    @Override // java.util.Map
    public synchronized boolean equals(Object obj) {
        return this.f14510a.equals(obj);
    }

    @Override // java.util.Map
    public synchronized int hashCode() {
        return this.f14510a.hashCode();
    }

    @Override // java.util.Map
    public synchronized boolean isEmpty() {
        return this.f14510a.isEmpty();
    }

    @Override // java.util.Map
    public synchronized Set keySet() {
        return this.f14510a.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        this.f14510a.putAll(map);
    }

    @Override // java.util.Map
    public synchronized int size() {
        return this.f14510a.size();
    }

    @Override // java.util.Map
    public synchronized Collection values() {
        return this.f14510a.values();
    }
}
