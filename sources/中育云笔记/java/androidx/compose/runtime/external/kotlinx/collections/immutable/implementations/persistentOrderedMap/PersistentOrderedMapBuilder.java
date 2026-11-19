package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10950i;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PersistentOrderedMapBuilder<K, V> extends AbstractC10950i implements PersistentMap.Builder<K, V> {
    public static final int $stable = 8;
    private Object firstKey;
    private final PersistentHashMapBuilder<K, LinkedValue<V>> hashMapBuilder;
    private Object lastKey;
    private PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapBuilder(PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.map = persistentOrderedMap;
        this.firstKey = persistentOrderedMap.getFirstKey$runtime_release();
        this.lastKey = this.map.getLastKey$runtime_release();
        this.hashMapBuilder = this.map.getHashMap$runtime_release().builder();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    public PersistentMap<K, V> build() {
        PersistentOrderedMap<K, V> persistentOrderedMap;
        PersistentHashMap<K, LinkedValue<V>> persistentHashMapBuild = this.hashMapBuilder.build();
        if (persistentHashMapBuild == this.map.getHashMap$runtime_release()) {
            CommonFunctionsKt.m30418assert(this.firstKey == this.map.getFirstKey$runtime_release());
            CommonFunctionsKt.m30418assert(this.lastKey == this.map.getLastKey$runtime_release());
            persistentOrderedMap = this.map;
        } else {
            persistentOrderedMap = new PersistentOrderedMap<>(this.firstKey, this.lastKey, persistentHashMapBuild);
        }
        this.map = persistentOrderedMap;
        return persistentOrderedMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.hashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstKey = endOfChain;
        this.lastKey = endOfChain;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.hashMapBuilder.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(obj);
        if (linkedValue != null) {
            return linkedValue.getValue();
        }
        return null;
    }

    @Override // p325rc.AbstractC10950i
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    public final Object getFirstKey$runtime_release() {
        return this.firstKey;
    }

    public final PersistentHashMapBuilder<K, LinkedValue<V>> getHashMapBuilder$runtime_release() {
        return this.hashMapBuilder;
    }

    @Override // p325rc.AbstractC10950i
    public Set<K> getKeys() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    @Override // p325rc.AbstractC10950i
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // p325rc.AbstractC10950i
    public Collection<V> getValues() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(k10);
        if (linkedValue != null) {
            if (linkedValue.getValue() == v10) {
                return v10;
            }
            this.hashMapBuilder.put(k10, linkedValue.withValue(v10));
            return linkedValue.getValue();
        }
        if (isEmpty()) {
            this.firstKey = k10;
            this.lastKey = k10;
            this.hashMapBuilder.put(k10, new LinkedValue<>(v10));
            return null;
        }
        Object obj = this.lastKey;
        Object obj2 = this.hashMapBuilder.get(obj);
        AbstractC9979u.m20291d(obj2);
        CommonFunctionsKt.m30418assert(!r2.getHasNext());
        this.hashMapBuilder.put(obj, ((LinkedValue) obj2).withNext(k10));
        this.hashMapBuilder.put(k10, new LinkedValue<>(v10, obj));
        this.lastKey = k10;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        LinkedValue<V> linkedValueRemove = this.hashMapBuilder.remove(obj);
        if (linkedValueRemove == null) {
            return null;
        }
        if (linkedValueRemove.getHasPrevious()) {
            LinkedValue<V> linkedValue = this.hashMapBuilder.get(linkedValueRemove.getPrevious());
            AbstractC9979u.m20291d(linkedValue);
            this.hashMapBuilder.put(linkedValueRemove.getPrevious(), linkedValue.withNext(linkedValueRemove.getNext()));
        } else {
            this.firstKey = linkedValueRemove.getNext();
        }
        if (linkedValueRemove.getHasNext()) {
            LinkedValue<V> linkedValue2 = this.hashMapBuilder.get(linkedValueRemove.getNext());
            AbstractC9979u.m20291d(linkedValue2);
            this.hashMapBuilder.put(linkedValueRemove.getNext(), linkedValue2.withPrevious(linkedValueRemove.getPrevious()));
        } else {
            this.lastKey = linkedValueRemove.getPrevious();
        }
        return linkedValueRemove.getValue();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(obj);
        if (linkedValue == null || !AbstractC9979u.m20289b(linkedValue.getValue(), obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
