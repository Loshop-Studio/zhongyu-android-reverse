package p023b8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.greenrobot.essentials.collections.MultimapSet$SetType;

/* renamed from: b8.c */
/* loaded from: classes4.dex */
public final class C3203c implements Map {

    /* renamed from: a */
    public final HashMap f1739a;

    public C3203c(HashMap map, MultimapSet$SetType multimapSet$SetType) {
        this.f1739a = map;
    }

    @Override // java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized Collection get(Object obj) {
        return (Collection) this.f1739a.get(obj);
    }

    @Override // java.util.Map
    public final synchronized void clear() {
        this.f1739a.clear();
    }

    @Override // java.util.Map
    public final synchronized boolean containsKey(Object obj) {
        return this.f1739a.containsKey(obj);
    }

    @Override // java.util.Map
    public final synchronized boolean containsValue(Object obj) {
        return this.f1739a.containsValue(obj);
    }

    @Override // java.util.Map
    public final synchronized Set entrySet() {
        return this.f1739a.entrySet();
    }

    @Override // java.util.Map
    public final synchronized boolean equals(Object obj) {
        return this.f1739a.equals(obj);
    }

    @Override // java.util.Map
    public final synchronized int hashCode() {
        return this.f1739a.hashCode();
    }

    @Override // java.util.Map
    public final synchronized boolean isEmpty() {
        return this.f1739a.isEmpty();
    }

    @Override // java.util.Map
    public final synchronized Set keySet() {
        return this.f1739a.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Collection collection;
        Collection collection2 = (Collection) obj2;
        synchronized (this) {
            collection = (Collection) this.f1739a.put(obj, collection2);
        }
        return collection;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f1739a.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Collection collection;
        synchronized (this) {
            collection = (Collection) this.f1739a.remove(obj);
        }
        return collection;
    }

    @Override // java.util.Map
    public final synchronized int size() {
        return this.f1739a.size();
    }

    @Override // java.util.Map
    public final synchronized Collection values() {
        return this.f1739a.values();
    }
}
