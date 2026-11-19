package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Map;
import p311y7.InterfaceC10668a;

/* loaded from: classes2.dex */
public interface ImmutableMap<K, V> extends Map<K, V>, InterfaceC10668a {
    ImmutableSet<Map.Entry<K, V>> getEntries();

    ImmutableSet<K> getKeys();

    ImmutableCollection<V> getValues();
}
