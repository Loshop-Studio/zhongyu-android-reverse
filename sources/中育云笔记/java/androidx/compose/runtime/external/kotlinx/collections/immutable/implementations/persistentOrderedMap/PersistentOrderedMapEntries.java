package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10954k;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PersistentOrderedMapEntries<K, V> extends AbstractC10954k implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {
    public static final int $stable = 8;
    private final PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapEntries(PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.map = persistentOrderedMap;
    }

    @Override // p325rc.AbstractC10936b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // p325rc.AbstractC10936b
    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new PersistentOrderedMapEntriesIterator(this.map);
    }

    public boolean contains(Map.Entry<? extends K, ? extends V> entry) {
        if (entry == null) {
            return false;
        }
        V v10 = this.map.get(entry.getKey());
        return v10 != null ? AbstractC9979u.m20289b(v10, entry.getValue()) : entry.getValue() == null && this.map.containsKey(entry.getKey());
    }
}
