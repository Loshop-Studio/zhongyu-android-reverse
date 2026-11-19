package androidx.collection.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class LruHashMap<K, V> {
    private final LinkedHashMap<K, V> map;

    public LruHashMap() {
        this(0, 0.0f, 3, null);
    }

    public final V get(K key) {
        AbstractC9979u.m20294g(key, "key");
        return this.map.get(key);
    }

    public final Set<Map.Entry<K, V>> getEntries() {
        Set<Map.Entry<K, V>> setEntrySet = this.map.entrySet();
        AbstractC9979u.m20293f(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }

    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    public final V put(K key, V value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        return this.map.put(key, value);
    }

    public final V remove(K key) {
        AbstractC9979u.m20294g(key, "key");
        return this.map.remove(key);
    }

    public LruHashMap(int i10, float f10) {
        this.map = new LinkedHashMap<>(i10, f10, true);
    }

    public /* synthetic */ LruHashMap(int i10, float f10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 16 : i10, (i11 & 2) != 0 ? 0.75f : f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LruHashMap(LruHashMap<? extends K, V> original) {
        this(0, 0.0f, 3, null);
        AbstractC9979u.m20294g(original, "original");
        for (Map.Entry<? extends K, V> entry : original.getEntries()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
