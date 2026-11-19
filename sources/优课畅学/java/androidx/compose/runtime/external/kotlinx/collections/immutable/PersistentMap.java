package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Map;
import p311y7.InterfaceC10672e;

/* loaded from: classes2.dex */
public interface PersistentMap<K, V> extends ImmutableMap<K, V> {

    public interface Builder<K, V> extends Map<K, V>, InterfaceC10672e {
        PersistentMap<K, V> build();
    }

    Builder<K, V> builder();

    @Override // java.util.Map
    PersistentMap<K, V> clear();

    @Override // java.util.Map
    PersistentMap<K, V> put(K k10, V v10);

    @Override // java.util.Map
    PersistentMap<K, V> putAll(Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    PersistentMap<K, V> remove(K k10);

    @Override // java.util.Map
    PersistentMap<K, V> remove(K k10, V v10);
}
