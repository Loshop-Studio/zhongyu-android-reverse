package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.Map.Entry;
import p325rc.AbstractC10952j;

@StabilityInferred(parameters = 8)
/* loaded from: classes2.dex */
public abstract class AbstractMapBuilderEntries<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC10952j {
    public static final int $stable = 0;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((AbstractMapBuilderEntries<E, K, V>) obj);
        }
        return false;
    }

    public abstract boolean containsEntry(Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((AbstractMapBuilderEntries<E, K, V>) obj);
        }
        return false;
    }

    public abstract boolean removeEntry(Map.Entry<? extends K, ? extends V> entry);

    public final boolean contains(E e10) {
        if ((e10 != null ? e10 : null) == null) {
            return false;
        }
        return containsEntry(e10);
    }

    public final boolean remove(E e10) {
        if ((e10 != null ? e10 : null) == null) {
            return false;
        }
        return removeEntry(e10);
    }
}
