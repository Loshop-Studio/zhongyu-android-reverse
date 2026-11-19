package anet.channel.strategy.utils;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class SerialLruCache<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    private int f2724a;

    public SerialLruCache(LinkedHashMap<K, V> linkedHashMap, int i10) {
        super(linkedHashMap);
        this.f2724a = i10;
    }

    public boolean entryRemoved(Map.Entry<K, V> entry) {
        return true;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.f2724a) {
            return entryRemoved(entry);
        }
        return false;
    }

    @Deprecated
    public SerialLruCache(LinkedHashMap<K, V> linkedHashMap) {
        this(linkedHashMap, 256);
    }

    public SerialLruCache(int i10) {
        super(i10 + 1, 1.0f, true);
        this.f2724a = i10;
    }
}
