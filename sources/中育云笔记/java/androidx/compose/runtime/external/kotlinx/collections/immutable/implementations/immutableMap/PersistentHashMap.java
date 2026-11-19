package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10944f;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public class PersistentHashMap<K, V> extends AbstractC10944f implements PersistentMap<K, V> {
    private final TrieNode<K, V> node;
    private final int size;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final PersistentHashMap EMPTY = new PersistentHashMap(TrieNode.Companion.getEMPTY$runtime_release(), 0);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final <K, V> PersistentHashMap<K, V> emptyOf$runtime_release() {
            PersistentHashMap<K, V> persistentHashMap = PersistentHashMap.EMPTY;
            AbstractC9979u.m20292e(persistentHashMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return persistentHashMap;
        }

        private Companion() {
        }
    }

    public PersistentHashMap(TrieNode<K, V> trieNode, int i10) {
        this.node = trieNode;
        this.size = i10;
    }

    private final ImmutableSet<Map.Entry<K, V>> createEntries() {
        return new PersistentHashMapEntries(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap<K, V> clear() {
        return Companion.emptyOf$runtime_release();
    }

    @Override // java.util.Map
    public boolean containsKey(K k10) {
        return this.node.containsKey(k10 != null ? k10.hashCode() : 0, k10, 0);
    }

    @Override // p325rc.AbstractC10944f, java.util.Map
    public final /* bridge */ ImmutableSet<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public V get(K k10) {
        return this.node.get(k10 != null ? k10.hashCode() : 0, k10, 0);
    }

    @Override // p325rc.AbstractC10944f, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    public final TrieNode<K, V> getNode$runtime_release() {
        return this.node;
    }

    @Override // p325rc.AbstractC10944f
    public int getSize() {
        return this.size;
    }

    @Override // p325rc.AbstractC10944f, java.util.Map
    public final /* bridge */ ImmutableSet<K> keySet() {
        return getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p325rc.AbstractC10944f, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap put(Object obj, Object obj2) {
        return put((PersistentHashMap<K, V>) obj, obj2);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap<K, V> putAll(Map<? extends K, ? extends V> map) {
        AbstractC9979u.m20292e(this, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> builder = builder2();
        builder.putAll(map);
        return builder.build2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p325rc.AbstractC10944f, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap remove(Object obj) {
        return remove((PersistentHashMap<K, V>) obj);
    }

    @Override // p325rc.AbstractC10944f, java.util.Map
    public final /* bridge */ ImmutableCollection<V> values() {
        return getValues();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* renamed from: builder */
    public PersistentHashMapBuilder<K, V> builder2() {
        return new PersistentHashMapBuilder<>(this);
    }

    @Override // p325rc.AbstractC10944f, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public final Set<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @Override // p325rc.AbstractC10944f, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet<K> getKeys() {
        return new PersistentHashMapKeys(this);
    }

    @Override // p325rc.AbstractC10944f, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableCollection<V> getValues() {
        return new PersistentHashMapValues(this);
    }

    @Override // p325rc.AbstractC10944f, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentHashMap<K, V> put(K k10, V v10) {
        TrieNode.ModificationResult<K, V> modificationResultPut = this.node.put(k10 != null ? k10.hashCode() : 0, k10, v10, 0);
        return modificationResultPut == null ? this : new PersistentHashMap<>(modificationResultPut.getNode(), size() + modificationResultPut.getSizeDelta());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap remove(Object obj, Object obj2) {
        return remove((PersistentHashMap<K, V>) obj, obj2);
    }

    @Override // p325rc.AbstractC10944f, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentHashMap<K, V> remove(K k10) {
        TrieNode<K, V> trieNodeRemove = this.node.remove(k10 != null ? k10.hashCode() : 0, k10, 0);
        if (this.node == trieNodeRemove) {
            return this;
        }
        if (trieNodeRemove == null) {
            return Companion.emptyOf$runtime_release();
        }
        return new PersistentHashMap<>(trieNodeRemove, size() - 1);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentHashMap<K, V> remove(K k10, V v10) {
        TrieNode<K, V> trieNodeRemove = this.node.remove(k10 != null ? k10.hashCode() : 0, k10, v10, 0);
        if (this.node == trieNodeRemove) {
            return this;
        }
        if (trieNodeRemove == null) {
            return Companion.emptyOf$runtime_release();
        }
        return new PersistentHashMap<>(trieNodeRemove, size() - 1);
    }
}
