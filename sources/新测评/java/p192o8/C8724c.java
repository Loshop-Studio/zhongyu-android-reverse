package p192o8;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o8.c */
/* loaded from: classes5.dex */
public final class C8724c implements Map {

    /* renamed from: a */
    public final Map f14505a;

    public C8724c(Map map) {
        this.f14505a = map;
    }

    /* renamed from: a */
    public static Map m14359a(Map map) {
        return new C8724c(map);
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object put(Class cls, Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.f14505a.containsKey(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f14505a.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        if (obj instanceof Class) {
            return this.f14505a.get(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f14505a.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public int size() {
        return this.f14505a.size();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.f14505a.values();
    }
}
