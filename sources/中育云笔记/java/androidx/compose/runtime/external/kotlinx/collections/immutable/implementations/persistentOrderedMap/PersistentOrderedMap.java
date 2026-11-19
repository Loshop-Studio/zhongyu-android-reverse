package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10944f;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PersistentOrderedMap<K, V> extends AbstractC10944f implements PersistentMap<K, V> {
    private static final PersistentOrderedMap EMPTY;
    private final Object firstKey;
    private final PersistentHashMap<K, LinkedValue<V>> hashMap;
    private final Object lastKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final <K, V> PersistentOrderedMap<K, V> emptyOf$runtime_release() {
            PersistentOrderedMap<K, V> persistentOrderedMap = PersistentOrderedMap.EMPTY;
            AbstractC9979u.m20292e(persistentOrderedMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
            return persistentOrderedMap;
        }

        private Companion() {
        }
    }

    static {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        EMPTY = new PersistentOrderedMap(endOfChain, endOfChain, PersistentHashMap.Companion.emptyOf$runtime_release());
    }

    public PersistentOrderedMap(Object obj, Object obj2, PersistentHashMap<K, LinkedValue<V>> persistentHashMap) {
        this.firstKey = obj;
        this.lastKey = obj2;
        this.hashMap = persistentHashMap;
    }

    private final ImmutableSet<Map.Entry<K, V>> createEntries() {
        return new PersistentOrderedMapEntries(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* renamed from: builder */
    public PersistentMap.Builder<K, V> builder2() {
        return new PersistentOrderedMapBuilder(this);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentMap<K, V> clear() {
        return Companion.emptyOf$runtime_release();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.hashMap.containsKey(obj);
    }

    @Override // p325rc.AbstractC10944f, java.util.Map
    public final /* bridge */ ImmutableSet<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        LinkedValue<V> linkedValue = this.hashMap.get(obj);
        if (linkedValue != null) {
            return linkedValue.getValue();
        }
        return null;
    }

    @Override // p325rc.AbstractC10944f, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    public final Object getFirstKey$runtime_release() {
        return this.firstKey;
    }

    public final PersistentHashMap<K, LinkedValue<V>> getHashMap$runtime_release() {
        return this.hashMap;
    }

    public final Object getLastKey$runtime_release() {
        return this.lastKey;
    }

    @Override // p325rc.AbstractC10944f
    public int getSize() {
        return this.hashMap.size();
    }

    @Override // p325rc.AbstractC10944f, java.util.Map
    public final /* bridge */ ImmutableSet<K> keySet() {
        return getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p325rc.AbstractC10944f, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap put(Object obj, Object obj2) {
        return put((PersistentOrderedMap<K, V>) obj, obj2);
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
        return remove((PersistentOrderedMap<K, V>) obj);
    }

    @Override // p325rc.AbstractC10944f, java.util.Map
    public final /* bridge */ ImmutableCollection<V> values() {
        return getValues();
    }

    @Override // p325rc.AbstractC10944f, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public final Set<Map.Entry<K, V>> getEntries() {
        return createEntries();
    }

    @Override // p325rc.AbstractC10944f, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableSet<K> getKeys() {
        return new PersistentOrderedMapKeys(this);
    }

    @Override // p325rc.AbstractC10944f, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public ImmutableCollection<V> getValues() {
        return new PersistentOrderedMapValues(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p325rc.AbstractC10944f, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentOrderedMap<K, V> put(K k10, V v10) {
        if (isEmpty()) {
            return new PersistentOrderedMap<>(k10, k10, this.hashMap.put((PersistentHashMap<K, LinkedValue<V>>) k10, (K) new LinkedValue<>(v10)));
        }
        LinkedValue<V> linkedValue = this.hashMap.get(k10);
        if (linkedValue != null) {
            if (linkedValue.getValue() == v10) {
                return this;
            }
            return new PersistentOrderedMap<>(this.firstKey, this.lastKey, this.hashMap.put((PersistentHashMap<K, LinkedValue<V>>) k10, (K) linkedValue.withValue(v10)));
        }
        Object obj = this.lastKey;
        Object obj2 = this.hashMap.get(obj);
        AbstractC9979u.m20291d(obj2);
        return new PersistentOrderedMap<>(this.firstKey, k10, this.hashMap.put((PersistentHashMap<K, LinkedValue<V>>) obj, (Object) ((LinkedValue) obj2).withNext(k10)).put((PersistentHashMap) k10, (K) new LinkedValue(v10, obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ PersistentMap remove(Object obj, Object obj2) {
        return remove((PersistentOrderedMap<K, V>) obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // p325rc.AbstractC10944f, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentOrderedMap<K, V> remove(K k10) {
        LinkedValue<V> linkedValue = this.hashMap.get(k10);
        if (linkedValue == null) {
            return this;
        }
        PersistentHashMap<K, LinkedValue<V>> persistentHashMapRemove = this.hashMap.remove((PersistentHashMap<K, LinkedValue<V>>) k10);
        ?? r52 = persistentHashMapRemove;
        if (linkedValue.getHasPrevious()) {
            Object obj = persistentHashMapRemove.get(linkedValue.getPrevious());
            AbstractC9979u.m20291d(obj);
            r52 = (PersistentHashMap<K, LinkedValue<V>>) persistentHashMapRemove.put((PersistentHashMap<K, LinkedValue<V>>) linkedValue.getPrevious(), (Object) ((LinkedValue) obj).withNext(linkedValue.getNext()));
        }
        PersistentHashMap persistentHashMapPut = r52;
        if (linkedValue.getHasNext()) {
            Object obj2 = r52.get(linkedValue.getNext());
            AbstractC9979u.m20291d(obj2);
            persistentHashMapPut = r52.put(linkedValue.getNext(), ((LinkedValue) obj2).withPrevious(linkedValue.getPrevious()));
        }
        return new PersistentOrderedMap<>(!linkedValue.getHasPrevious() ? linkedValue.getNext() : this.firstKey, !linkedValue.getHasNext() ? linkedValue.getPrevious() : this.lastKey, persistentHashMapPut);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public PersistentOrderedMap<K, V> remove(K k10, V v10) {
        LinkedValue<V> linkedValue = this.hashMap.get(k10);
        return (linkedValue != null && AbstractC9979u.m20289b(linkedValue.getValue(), v10)) ? remove((PersistentOrderedMap<K, V>) k10) : this;
    }
}
