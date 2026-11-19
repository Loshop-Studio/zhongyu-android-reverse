package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import id.InterfaceC9624a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 3)
/* loaded from: classes2.dex */
public class MapEntry<K, V> implements Map.Entry<K, V>, InterfaceC9624a {
    public static final int $stable = 0;
    private final K key;
    private final V value;

    public MapEntry(K k10, V v10) {
        this.key = k10;
        this.value = v10;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && AbstractC9979u.m20289b(entry.getKey(), getKey()) && AbstractC9979u.m20289b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
