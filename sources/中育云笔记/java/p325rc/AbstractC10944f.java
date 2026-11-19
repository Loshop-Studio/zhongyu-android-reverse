package p325rc;

import id.InterfaceC9624a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* renamed from: rc.f */
/* loaded from: classes6.dex */
public abstract class AbstractC10944f implements Map, InterfaceC9624a {
    public static final a Companion = new a(null);
    private volatile Set<Object> _keys;
    private volatile Collection<Object> _values;

    /* renamed from: rc.f$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: d */
    public static final CharSequence m23896d(AbstractC10944f abstractC10944f, Map.Entry it) {
        AbstractC9979u.m20294g(it, "it");
        return abstractC10944f.m23898c(it);
    }

    /* renamed from: b */
    public final String m23897b(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    /* renamed from: c */
    public final String m23898c(Map.Entry entry) {
        return m23897b(entry.getKey()) + '=' + m23897b(entry.getValue());
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        AbstractC9979u.m20292e(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object obj = get(key);
        if (!AbstractC9979u.m20289b(value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        AbstractC9979u.m20292e(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<Object, Object>> setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (AbstractC9979u.m20289b(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!containsEntry$kotlin_stdlib((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract Set getEntries();

    public abstract Set getKeys();

    public abstract int getSize();

    public abstract Collection getValues();

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return AbstractC10947g0.m23954w0(entrySet(), ", ", "{", "}", 0, null, new InterfaceC9540l() { // from class: rc.e
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return AbstractC10944f.m23896d(this.f26451c, (Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }
}
