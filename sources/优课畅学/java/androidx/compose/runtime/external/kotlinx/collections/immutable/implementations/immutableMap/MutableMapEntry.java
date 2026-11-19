package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import p311y7.InterfaceC10672e;

/* loaded from: classes2.dex */
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, InterfaceC10672e.a {
    private final PersistentHashMapBuilderEntriesIterator<K, V> parentIterator;
    private V value;

    public MutableMapEntry(PersistentHashMapBuilderEntriesIterator<K, V> persistentHashMapBuilderEntriesIterator, K k10, V v10) {
        super(k10, v10);
        this.parentIterator = persistentHashMapBuilderEntriesIterator;
        this.value = v10;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public void setValue(V v10) {
        this.value = v10;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V setValue(V v10) {
        V value = getValue();
        setValue((MutableMapEntry<K, V>) v10);
        this.parentIterator.setValue(getKey(), v10);
        return value;
    }
}
