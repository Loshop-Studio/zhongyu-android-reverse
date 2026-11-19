package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {
    private final HashMap<K, SafeIterableMap.Entry<K, V>> mHashMap = new HashMap<>();

    @Nullable
    public Map.Entry<K, V> ceil(K k9) {
        if (contains(k9)) {
            return this.mHashMap.get(k9).mPrevious;
        }
        return null;
    }

    public boolean contains(K k9) {
        return this.mHashMap.containsKey(k9);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    @Nullable
    public SafeIterableMap.Entry<K, V> get(K k9) {
        return this.mHashMap.get(k9);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V putIfAbsent(@NonNull K k9, @NonNull V v9) {
        SafeIterableMap.Entry<K, V> entry = get(k9);
        if (entry != null) {
            return entry.mValue;
        }
        this.mHashMap.put(k9, put(k9, v9));
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V remove(@NonNull K k9) {
        V v9 = (V) super.remove(k9);
        this.mHashMap.remove(k9);
        return v9;
    }
}
