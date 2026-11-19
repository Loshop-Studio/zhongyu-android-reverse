package com.blankj.utilcode.util;

import androidx.annotation.NonNull;
import androidx.collection.LruCache;
import com.blankj.utilcode.constant.CacheConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class CacheMemoryUtils implements CacheConstants {
    private static final Map<String, CacheMemoryUtils> CACHE_MAP = new HashMap();
    private static final int DEFAULT_MAX_COUNT = 256;
    private final String mCacheKey;
    private final LruCache<String, CacheValue> mMemoryCache;

    public static final class CacheValue {
        long dueTime;
        Object value;

        public CacheValue(long j9, Object obj) {
            this.dueTime = j9;
            this.value = obj;
        }
    }

    private CacheMemoryUtils(String str, LruCache<String, CacheValue> lruCache) {
        this.mCacheKey = str;
        this.mMemoryCache = lruCache;
    }

    public static CacheMemoryUtils getInstance() {
        return getInstance(256);
    }

    public void clear() {
        this.mMemoryCache.evictAll();
    }

    public <T> T get(@NonNull String str) {
        return (T) get(str, null);
    }

    public int getCacheCount() {
        return this.mMemoryCache.size();
    }

    public void put(@NonNull String str, Object obj) {
        put(str, obj, -1);
    }

    public Object remove(@NonNull String str) {
        CacheValue cacheValueRemove = this.mMemoryCache.remove(str);
        if (cacheValueRemove == null) {
            return null;
        }
        return cacheValueRemove.value;
    }

    public String toString() {
        return this.mCacheKey + "@" + Integer.toHexString(hashCode());
    }

    public static CacheMemoryUtils getInstance(int i9) {
        return getInstance(String.valueOf(i9), i9);
    }

    public <T> T get(@NonNull String str, T t9) {
        CacheValue cacheValue = this.mMemoryCache.get(str);
        if (cacheValue == null) {
            return t9;
        }
        long j9 = cacheValue.dueTime;
        if (j9 == -1 || j9 >= System.currentTimeMillis()) {
            return (T) cacheValue.value;
        }
        this.mMemoryCache.remove(str);
        return t9;
    }

    public void put(@NonNull String str, Object obj, int i9) {
        if (obj == null) {
            return;
        }
        this.mMemoryCache.put(str, new CacheValue(i9 < 0 ? -1L : System.currentTimeMillis() + (i9 * 1000), obj));
    }

    public static CacheMemoryUtils getInstance(String str, int i9) {
        CacheMemoryUtils cacheMemoryUtils;
        Map<String, CacheMemoryUtils> map = CACHE_MAP;
        CacheMemoryUtils cacheMemoryUtils2 = map.get(str);
        if (cacheMemoryUtils2 != null) {
            return cacheMemoryUtils2;
        }
        synchronized (CacheMemoryUtils.class) {
            try {
                cacheMemoryUtils = map.get(str);
                if (cacheMemoryUtils == null) {
                    cacheMemoryUtils = new CacheMemoryUtils(str, new LruCache(i9));
                    map.put(str, cacheMemoryUtils);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cacheMemoryUtils;
    }
}
