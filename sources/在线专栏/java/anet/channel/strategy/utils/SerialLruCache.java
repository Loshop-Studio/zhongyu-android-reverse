package anet.channel.strategy.utils;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SerialLruCache<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    private int f5446a;

    public SerialLruCache(LinkedHashMap<K, V> linkedHashMap, int i4) {
        super(linkedHashMap);
        this.f5446a = i4;
    }

    public boolean entryRemoved(Map.Entry<K, V> entry) {
        return true;
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.f5446a) {
            return entryRemoved(entry);
        }
        return false;
    }

    @Deprecated
    public SerialLruCache(LinkedHashMap<K, V> linkedHashMap) {
        this(linkedHashMap, 256);
    }

    public SerialLruCache(int i4) {
        super(i4 + 1, 1.0f, true);
        this.f5446a = i4;
    }
}
