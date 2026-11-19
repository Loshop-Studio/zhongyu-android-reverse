package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import id.InterfaceC9625b;
import java.util.Collection;
import java.util.Iterator;
import p325rc.AbstractC10946g;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PersistentOrderedMapBuilderValues<K, V> extends AbstractC10946g implements Collection<V>, InterfaceC9625b {
    public static final int $stable = 8;
    private final PersistentOrderedMapBuilder<K, V> builder;

    public PersistentOrderedMapBuilderValues(PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.builder = persistentOrderedMapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.builder.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.builder.containsValue(obj);
    }

    @Override // p325rc.AbstractC10946g
    public int getSize() {
        return this.builder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new PersistentOrderedMapBuilderValuesIterator(this.builder);
    }
}
