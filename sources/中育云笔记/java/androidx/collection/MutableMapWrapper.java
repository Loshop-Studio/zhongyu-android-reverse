package androidx.collection;

import id.InterfaceC9628e;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final class MutableMapWrapper<K, V> extends MapWrapper<K, V> implements Map<K, V>, InterfaceC9628e {
    private MutableEntries<K, V> _entries;
    private MutableKeys<K, V> _keys;
    private MutableValues<K, V> _values;
    private final MutableScatterMap<K, V> parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableMapWrapper(MutableScatterMap<K, V> parent) {
        super(parent);
        AbstractC9979u.m20294g(parent, "parent");
        this.parent = parent;
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public void clear() {
        this.parent.clear();
    }

    @Override // androidx.collection.MapWrapper
    public Set<Map.Entry<K, V>> getEntries() {
        MutableEntries<K, V> mutableEntries = this._entries;
        if (mutableEntries != null) {
            return mutableEntries;
        }
        MutableEntries<K, V> mutableEntries2 = new MutableEntries<>(this.parent);
        this._entries = mutableEntries2;
        return mutableEntries2;
    }

    @Override // androidx.collection.MapWrapper
    public Set<K> getKeys() {
        MutableKeys<K, V> mutableKeys = this._keys;
        if (mutableKeys != null) {
            return mutableKeys;
        }
        MutableKeys<K, V> mutableKeys2 = new MutableKeys<>(this.parent);
        this._keys = mutableKeys2;
        return mutableKeys2;
    }

    @Override // androidx.collection.MapWrapper
    public Collection<V> getValues() {
        MutableValues<K, V> mutableValues = this._values;
        if (mutableValues != null) {
            return mutableValues;
        }
        MutableValues<K, V> mutableValues2 = new MutableValues<>(this.parent);
        this._values = mutableValues2;
        return mutableValues2;
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public V put(K k10, V v10) {
        return this.parent.put(k10, v10);
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        AbstractC9979u.m20294g(from, "from");
        for (Map.Entry<? extends K, ? extends V> entry : from.entrySet()) {
            this.parent.set(entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public V remove(Object obj) {
        return this.parent.remove(obj);
    }
}
