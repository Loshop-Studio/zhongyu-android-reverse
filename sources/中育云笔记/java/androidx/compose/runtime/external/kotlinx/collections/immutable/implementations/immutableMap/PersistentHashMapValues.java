package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import p325rc.AbstractC10936b;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PersistentHashMapValues<K, V> extends AbstractC10936b implements ImmutableCollection<V> {
    public static final int $stable = 8;
    private final PersistentHashMap<K, V> map;

    public PersistentHashMapValues(PersistentHashMap<K, V> persistentHashMap) {
        this.map = persistentHashMap;
    }

    @Override // p325rc.AbstractC10936b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // p325rc.AbstractC10936b
    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new PersistentHashMapValuesIterator(this.map.getNode$runtime_release());
    }
}
