package p324z9;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: z9.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10747a implements Map {

    /* renamed from: a */
    public Map f21368a;

    public AbstractC10747a(Map map) {
        this.f21368a = map;
    }

    /* renamed from: a */
    public abstract Collection mo18168a();

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized Collection get(Object obj) {
        return (Collection) this.f21368a.get(obj);
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized Collection put(Object obj, Collection collection) {
        return (Collection) this.f21368a.put(obj, collection);
    }

    @Override // java.util.Map
    public synchronized void clear() {
        this.f21368a.clear();
    }

    @Override // java.util.Map
    public synchronized boolean containsKey(Object obj) {
        return this.f21368a.containsKey(obj);
    }

    @Override // java.util.Map
    public synchronized boolean containsValue(Object obj) {
        return this.f21368a.containsValue(obj);
    }

    /* renamed from: d */
    public synchronized int m20089d(Object obj, Object obj2) {
        Collection collectionMo18168a;
        try {
            collectionMo18168a = (Collection) this.f21368a.get(obj);
            if (collectionMo18168a == null) {
                collectionMo18168a = mo18168a();
                this.f21368a.put(obj, collectionMo18168a);
            }
            collectionMo18168a.add(obj2);
        } catch (Throwable th) {
            throw th;
        }
        return collectionMo18168a.size();
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Collection remove(Object obj) {
        return (Collection) this.f21368a.remove(obj);
    }

    @Override // java.util.Map
    public synchronized Set entrySet() {
        return this.f21368a.entrySet();
    }

    @Override // java.util.Map
    public synchronized boolean equals(Object obj) {
        return this.f21368a.equals(obj);
    }

    @Override // java.util.Map
    public synchronized int hashCode() {
        return this.f21368a.hashCode();
    }

    @Override // java.util.Map
    public synchronized boolean isEmpty() {
        return this.f21368a.isEmpty();
    }

    @Override // java.util.Map
    public synchronized Set keySet() {
        return this.f21368a.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        this.f21368a.putAll(map);
    }

    @Override // java.util.Map
    public synchronized int size() {
        return this.f21368a.size();
    }

    @Override // java.util.Map
    public synchronized Collection values() {
        return this.f21368a.values();
    }
}
