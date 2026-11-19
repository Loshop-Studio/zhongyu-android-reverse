package androidx.compose.runtime.external.kotlinx.collections.immutable;

import id.InterfaceC9624a;
import java.util.Map;

/* loaded from: classes2.dex */
public interface ImmutableMap<K, V> extends Map<K, V>, InterfaceC9624a {
    ImmutableSet<Map.Entry<K, V>> getEntries();

    ImmutableSet<K> getKeys();

    ImmutableCollection<V> getValues();
}
