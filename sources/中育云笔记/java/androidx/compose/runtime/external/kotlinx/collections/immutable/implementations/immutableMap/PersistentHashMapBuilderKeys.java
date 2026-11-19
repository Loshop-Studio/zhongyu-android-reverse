package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import id.InterfaceC9629f;
import java.util.Iterator;
import java.util.Set;
import p325rc.AbstractC10952j;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PersistentHashMapBuilderKeys<K, V> extends AbstractC10952j implements Set<K>, InterfaceC9629f {
    public static final int $stable = 8;
    private final PersistentHashMapBuilder<K, V> builder;

    public PersistentHashMapBuilderKeys(PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        this.builder = persistentHashMapBuilder;
    }

    @Override // p325rc.AbstractC10952j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.builder.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.builder.containsKey(obj);
    }

    @Override // p325rc.AbstractC10952j
    public int getSize() {
        return this.builder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new PersistentHashMapBuilderKeysIterator(this.builder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.builder.containsKey(obj)) {
            return false;
        }
        this.builder.remove(obj);
        return true;
    }
}
