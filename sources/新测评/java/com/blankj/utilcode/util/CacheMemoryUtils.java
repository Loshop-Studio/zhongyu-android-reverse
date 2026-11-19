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

        public CacheValue(long j10, Object obj) {
            this.dueTime = j10;
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

    public static CacheMemoryUtils getInstance(int i10) {
        return getInstance(String.valueOf(i10), i10);
    }

    public <T> T get(@NonNull String str, T t10) {
        CacheValue cacheValue = this.mMemoryCache.get(str);
        if (cacheValue == null) {
            return t10;
        }
        long j10 = cacheValue.dueTime;
        if (j10 == -1 || j10 >= System.currentTimeMillis()) {
            return (T) cacheValue.value;
        }
        this.mMemoryCache.remove(str);
        return t10;
    }

    public void put(@NonNull String str, Object obj, int i10) {
        if (obj == null) {
            return;
        }
        this.mMemoryCache.put(str, new CacheValue(i10 < 0 ? -1L : System.currentTimeMillis() + (i10 * 1000), obj));
    }

    public static CacheMemoryUtils getInstance(String str, int i10) {
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
                    cacheMemoryUtils = new CacheMemoryUtils(str, new LruCache(i10));
                    map.put(str, cacheMemoryUtils);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cacheMemoryUtils;
    }
}
