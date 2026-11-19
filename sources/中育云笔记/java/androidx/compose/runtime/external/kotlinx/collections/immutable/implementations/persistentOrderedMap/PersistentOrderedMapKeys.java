package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import p325rc.AbstractC10954k;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PersistentOrderedMapKeys<K, V> extends AbstractC10954k implements ImmutableSet<K> {
    public static final int $stable = 8;
    private final PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapKeys(PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.map = persistentOrderedMap;
    }

    @Override // p325rc.AbstractC10936b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // p325rc.AbstractC10936b
    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new PersistentOrderedMapKeysIterator(this.map);
    }
}
