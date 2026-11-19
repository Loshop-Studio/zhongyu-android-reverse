package p306y8;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: y8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9969a implements Map {

    /* renamed from: a */
    public Map f17930a;

    public AbstractC9969a(Map map) {
        this.f17930a = map;
    }

    /* renamed from: a */
    public abstract Collection mo15088a();

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized Collection get(Object obj) {
        return (Collection) this.f17930a.get(obj);
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized Collection put(Object obj, Collection collection) {
        return (Collection) this.f17930a.put(obj, collection);
    }

    @Override // java.util.Map
    public synchronized void clear() {
        this.f17930a.clear();
    }

    @Override // java.util.Map
    public synchronized boolean containsKey(Object obj) {
        return this.f17930a.containsKey(obj);
    }

    @Override // java.util.Map
    public synchronized boolean containsValue(Object obj) {
        return this.f17930a.containsValue(obj);
    }

    /* renamed from: d */
    public synchronized int m17243d(Object obj, Object obj2) {
        Collection collectionMo15088a;
        try {
            collectionMo15088a = (Collection) this.f17930a.get(obj);
            if (collectionMo15088a == null) {
                collectionMo15088a = mo15088a();
                this.f17930a.put(obj, collectionMo15088a);
            }
            collectionMo15088a.add(obj2);
        } catch (Throwable th) {
            throw th;
        }
        return collectionMo15088a.size();
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Collection remove(Object obj) {
        return (Collection) this.f17930a.remove(obj);
    }

    @Override // java.util.Map
    public synchronized Set entrySet() {
        return this.f17930a.entrySet();
    }

    @Override // java.util.Map
    public synchronized boolean equals(Object obj) {
        return this.f17930a.equals(obj);
    }

    @Override // java.util.Map
    public synchronized int hashCode() {
        return this.f17930a.hashCode();
    }

    @Override // java.util.Map
    public synchronized boolean isEmpty() {
        return this.f17930a.isEmpty();
    }

    @Override // java.util.Map
    public synchronized Set keySet() {
        return this.f17930a.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        this.f17930a.putAll(map);
    }

    @Override // java.util.Map
    public synchronized int size() {
        return this.f17930a.size();
    }

    @Override // java.util.Map
    public synchronized Collection values() {
        return this.f17930a.values();
    }
}
