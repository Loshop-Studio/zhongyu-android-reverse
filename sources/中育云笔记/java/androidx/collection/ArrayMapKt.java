package androidx.collection;

import com.bumptech.glide.util.CachedHashCodeArrayMap;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class ArrayMapKt {
    public static final <K, V> ArrayMap<K, V> arrayMapOf() {
        return new ArrayMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> ArrayMap<K, V> arrayMapOf(Pair<? extends K, ? extends V>... pairs) {
        AbstractC9979u.m20294g(pairs, "pairs");
        CachedHashCodeArrayMap cachedHashCodeArrayMap = (ArrayMap<K, V>) new ArrayMap(pairs.length);
        for (Pair<? extends K, ? extends V> pair : pairs) {
            cachedHashCodeArrayMap.put(pair.m20051f(), pair.m20052g());
        }
        return cachedHashCodeArrayMap;
    }
}
